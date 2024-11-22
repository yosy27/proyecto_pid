package com.example.myapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private String password;
}
