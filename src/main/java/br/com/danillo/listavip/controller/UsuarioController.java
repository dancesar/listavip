package br.com.danillo.listavip.controller;

import br.com.danillo.listavip.entity.Usuario;
import br.com.danillo.listavip.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public List<Usuario> listUsuario(){
        return this.usuarioService.listaUsuario();
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public List<Usuario> listUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.listaUsuario(usuario);
    }
}