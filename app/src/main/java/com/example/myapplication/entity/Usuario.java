package com.example.myapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String dni;
    private String rol;
    private String estado;
    private String email;
    private String password;


}
