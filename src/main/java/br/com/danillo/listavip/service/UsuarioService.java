package br.com.danillo.listavip.service;

import br.com.danillo.listavip.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    public List<Usuario> listaUsuario(){
        List<Usuario> usuarioLista = new ArrayList<>();

        Usuario usuario = new Usuario();

        usuario.setNome("Danillo");
        usuario.setIdade(40);
        usuario.setEmail("danillo.yamagush@gmail.com");
        usuarioLista.add(usuario);

        usuario = new Usuario();
        usuario.setNome("Maria Eduarda");
        usuario.setIdade(9);
        usuario.setEmail("maria.duda@gmail.com");
        usuarioLista.add(usuario);

        return usuarioLista;
    }

    public List<Usuario> listaUsuario(Usuario usuarioAdd){
        List<Usuario> usuarioLista = new ArrayList<>();

        Usuario usuario = new Usuario();

        usuario.setNome("Danillo");
        usuario.setIdade(40);
        usuario.setEmail("danillo.yamagush@gmail.com");

        usuario = new Usuario();

        usuario.setNome("Maria Eduarda");
        usuario.setIdade(9);
        usuario.setEmail("maria.duda@gmail.com");

        usuarioLista.add(usuario);
        usuarioLista.add(usuarioAdd);

        return usuarioLista;
    }
}