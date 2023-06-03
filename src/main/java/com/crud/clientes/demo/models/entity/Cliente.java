package com.crud.clientes.demo.models.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    @NotEmpty(message = "no puede estar vacio")
    @Size(min = 3, max =12 , message = "El tamaño debe de estar entre 4 y 12")
    @Column(nullable=false)
    private String nombre;

    @NotEmpty(message = "no puede estar vacio")

    private String apellido;
    @NotEmpty(message = "no puede estar vacio")
    @Email(message = "no es una direcion de correo valida")

    @Column(nullable=false, unique = true)

    private String email;
    @NotNull(message = "La fecha no puede estar vacio")
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Object setCreateAt(Date createAt) {
        this.createAt = createAt;
        return null;
    }
}
