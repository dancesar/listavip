package br.com.danillo.listavip.controller;

import br.com.danillo.listavip.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getTexto(){
        return "Ola Rest Spring!";
    }

    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public Usuario getTexto(@PathVariable String nome){
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        return usuario;
    }
}