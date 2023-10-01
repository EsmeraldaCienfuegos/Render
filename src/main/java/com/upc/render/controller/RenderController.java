package com.upc.render.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@RestController
@RequestMapping
public class RenderController {

    @GetMapping("{dato}")
    public ResponseEntity<String> saludo (@PathVariable String dato) {
        return new ResponseEntity<>("Hola" + dato, HttpStatus.OK);
    }

    @GetMapping("/suma")
    public ResponseEntity<Double> suma (@PathParam(value = "dato1")double dato1, @PathParam(value = "dato2") double dato2) {
        double salida = dato2 + dato1;
        return new ResponseEntity<>(salida, HttpStatus.OK);
    }
}
