package com.crud.clientes.demo.models.services;

import com.crud.clientes.demo.models.entity.Usuario;

public interface IUsuarioService {

    public Usuario findByUsername(String username);
}
