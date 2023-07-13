package com.crud.clientes.demo.models.services;

import com.crud.clientes.demo.models.entity.Cliente;
import com.crud.clientes.demo.models.entity.Factura;
import com.crud.clientes.demo.models.entity.Producto;
import com.crud.clientes.demo.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);


    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);
    public List<Region> findAllRegiones();

    public Factura findFacturaById(Long id);

    public Factura saveFactura(Factura factura);
    public void deleteFacturaById(Long id);

    public List<Producto> findProductoByNombre(String term);


}
