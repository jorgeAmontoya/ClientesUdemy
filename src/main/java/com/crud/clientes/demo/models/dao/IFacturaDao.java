package com.crud.clientes.demo.models.dao;

import com.crud.clientes.demo.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long> {
}
