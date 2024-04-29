package com.exercise1.exercise1.controller;

import com.exercise1.exercise1.Plato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestauranteController {

    @GetMapping ("/platos/{num_plato}")
    @ResponseBody
    public Plato traerPlatos (@PathVariable int num_plato) {
        List<Plato> listaPlatos = new ArrayList<Plato>();

        listaPlatos.add(new Plato (1, "Milanesas con Puré",5.00,"Milanesa simple con patatas"));
        listaPlatos.add(new Plato (2, "Ravioles con Salsa Bolognesa",8.00,"Raviolis de verdura  con salsa bolognesa y queso rallado"));
        listaPlatos.add(new Plato (3, "Lomo a la mostaza con patatas fritas",12.00,"Filetes de lomo con salsa de mostaza y patatas fritas"));
        listaPlatos.add(new Plato (4, "Ensalada mixta",3.00,"Ensalada de lechuga, tomate y cebolla"));
        listaPlatos.add(new Plato (5, "Milanesas con arroz primavera",5.00,"Milanesa simple, sin napolitana con arroz y verduras"));

        for (Plato plat : listaPlatos) {
            if (plat.getNum() == num_plato) {
                return plat;
            }
        }

        return null;
    }
}
