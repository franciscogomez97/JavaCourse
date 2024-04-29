package com.exercise2.exercise2;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter @Setter
public class Users {

    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate FechaNacimiento;

    public Users (Long id, String dni, String nombre, String apellido, LocalDate FechaNacimimento) {

        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaNacimiento = FechaNacimimento;
    }

    public Users () {

    }
}
