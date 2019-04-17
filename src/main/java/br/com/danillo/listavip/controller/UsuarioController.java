package br.com.danillo.listavip.controller;

import br.com.danillo.listavip.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
}