package com.exercise2.exercise2.controller;

import com.exercise2.exercise2.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Ex2Controller {

    @GetMapping ("/users")
    public List<Users> GetUsers () {

        List<Users> usersList = new ArrayList<Users>();

        usersList.add(new Users(1L, "51598425A", "Marco", "Antonio", LocalDate.of(2015, 5,3)));
        usersList.add(new Users(2L, "51598625A", "Pepe", "Pérez", LocalDate.of(2011, 7,3)));
        usersList.add(new Users(3L, "51398425A", "Popo", "Gómez", LocalDate.of(2018, 1,3)));

        return usersList;
    }

    @GetMapping ("/users/menores")
    public List<Users> GetUsersMenores () {
        List<Users> usersList = new ArrayList<Users>();

        usersList.add(new Users(1L, "51598425A", "Marco", "Antonio", LocalDate.of(2015, 5,3)));
        usersList.add(new Users(2L, "51598625A", "Pepe", "Pérez", LocalDate.of(1990, 7,3)));
        usersList.add(new Users(3L, "51398425A", "Popo", "Gómez", LocalDate.of(2018, 1,3)));

        LocalDate fecha_hoy = LocalDate.now();
        List<Users> menoresList = new ArrayList<Users>();

        for (Users user : usersList) {
            LocalDate FechaNacimiento = user.getFechaNacimiento();

            Period Diferencia = Period.between(FechaNacimiento, fecha_hoy);

            if (Diferencia.getYears()<18 ) {
                menoresList.add(user);
            }
        }
        return menoresList;
    }
}
