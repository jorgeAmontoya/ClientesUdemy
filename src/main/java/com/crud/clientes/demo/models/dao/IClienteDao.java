package com.crud.clientes.demo.models.dao;


import com.crud.clientes.demo.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente,Long> {
}
