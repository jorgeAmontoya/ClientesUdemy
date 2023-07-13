package com.crud.clientes.demo.models.dao;

import com.crud.clientes.demo.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

//      Otra forma
//    @Query("select u from Usuario u where u.username=?1")
//    public Usuario findByUsername2(String username);
}
