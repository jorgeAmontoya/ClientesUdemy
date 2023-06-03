package com.crud.clientes.demo.controllers;

import com.crud.clientes.demo.models.entity.Cliente;
import com.crud.clientes.demo.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;

//permite compartir datos y hacer todas las peticiones
@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }

    @GetMapping("/clientes/page/{page}")
    public Page<Cliente> index(@PathVariable Integer page){

        Pageable pageable = PageRequest.of(page, 4);
        return clienteService.findAll(pageable);
    }


    @GetMapping("/clientes/{id}")
    public ResponseEntity<?> show(@PathVariable Long id){
        Cliente cliente = null;
        Map<String, Object> response = new HashMap<>();
        try {
            cliente = clienteService.findById(id);

        }catch(DataAccessException e){
            response.put("mensaje", "error al realizar la consulta en la base de datos");
            response.put("error", e.getMessage() + ": " + e.getMostSpecificCause().getMessage());
            return new ResponseEntity< Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }


        if(cliente == null){
            response.put("mensaje", "el cliente ID: " + id + " no exite en la base de datos!");
            return new ResponseEntity< Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @PostMapping("/clientes")
    public ResponseEntity<?> create(@Valid @RequestBody Cliente cliente, BindingResult result) {
        Cliente clienteNew = null;
        //Object fecha = cliente.setCreateAt(new Date());
        Map<String, Object> response = new HashMap<>();
        if(result.hasErrors()){

            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "el campo ' " + err.getField() + " ' " +err.getDefaultMessage())
                    .collect(Collectors.toList());
            response.put("errors", errors);
            return new ResponseEntity< Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        if(cliente.getNombre().equals("")){
            response.put("mensaje", "el cliente no puede ser vacio ");
            return new ResponseEntity< Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        if(cliente.getEmail().equals("")){
            response.put("mensaje", "el email no puede ser vacio ");
            return new ResponseEntity< Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        try {
            clienteNew = clienteService.save(cliente);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert en la base de datos");
            response.put("error", e.getMessage() + ": " + e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);

        }


        response.put("mensaje", "El cliente ha sido creado con éxito");
        response.put("cliente", clienteNew);

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

     @PutMapping("/clientes/{id}")
     public ResponseEntity<?> update(@Valid @RequestBody Cliente cliente, BindingResult result,@PathVariable Long id){
        Cliente clienteActual = clienteService.findById(id);
        Cliente clienteUpdate = null;
        Map<String,Object> response = new HashMap<>();
         if(result.hasErrors()){

             List<String> errors = result.getFieldErrors()
                     .stream()
                     .map(err -> "el campo ' " + err.getField() + " ' " +err.getDefaultMessage())
                     .collect(Collectors.toList());
             response.put("errors", errors);
             return new ResponseEntity< Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
         }

        if(clienteActual == null){
            response.put("mensaje", "Error: no se pudo editar, el cliente ID: " +id + "no existe en la base de datos");
            return new ResponseEntity< Map<String,Object>>(response, HttpStatus.NOT_FOUND);
        }
        try {
            clienteActual.setApellido(cliente.getApellido());
            clienteActual.setNombre(cliente.getNombre());
            clienteActual.setEmail(cliente.getEmail());
            clienteActual.setCreateAt(cliente.getCreateAt());
            clienteUpdate = clienteService.save(clienteActual);
        }catch (DataAccessException e) {
            response.put("mensaje", "Error al actualizar el cliente en la base de datos");
            response.put("error", e.getMessage() + ": " + e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
         response.put("mensaje", "El cliente ha sido actualizado con éxito");
         response.put("cliente", clienteUpdate);
        return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);

     }

     @DeleteMapping("clientes/{id}")
     public ResponseEntity<?>  delete(@PathVariable Long id){

        Map<String,Object> response = new HashMap<>();
        try {
            clienteService.delete(id);
        }catch (DataAccessException e){
            response.put("mensaje", "Error al eliminar el cliente de la base de datos");
            response.put("error", e.getMessage() + ": " + e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "el cliente ha sido eliminado con éxito");
        return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
     }

}
