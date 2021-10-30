package DB;

import models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuariosDB {

    private List<Usuario> usuarioList = new ArrayList<>();//é um atributo//lista de usuarios!!!

    public List<Usuario> getUsuarioList() {//retornar a lista de usuarios!!!
        return usuarioList;
    }
    public void addNovoUsuario(Usuario usuario) {//Para adicionar novos usuarios!!!
        int id = usuarioList.size() + 1;//cadastrar ID automaticamente!!!
        usuario.setId(id);
        usuarioList.add(usuario);
    }
}
