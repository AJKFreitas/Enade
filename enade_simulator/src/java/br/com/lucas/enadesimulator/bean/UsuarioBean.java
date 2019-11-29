
package br.com.lucas.enadesimulator.bean;

import br.com.lucas.enadesimulator.dao.UsuarioDAO;
import br.com.lucas.enadesimulator.entidade.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@SessionScoped
@ManagedBean
public class UsuarioBean implements Serializable {
    
     public Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void SalvarUsuario(){
        UsuarioDAO dao = new UsuarioDAO();
        dao.Salvar(usuario);
        usuario = new Usuario();
    }
 
    
}
