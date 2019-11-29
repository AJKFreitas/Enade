
package br.com.lucas.enadesimulator.dao;

import br.com.lucas.enadesimulator.entidade.Usuario;
import br.com.lucas.enadesimulator.util.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    public void Salvar(Usuario user){
    
        Connection conexao = ConectionFactory.getConexao();
        try {
            PreparedStatement ps = conexao.prepareCall("INSERT INTO `usuario`(`nome`,`cpf`,`permissao`,`password`,`username`,`email`) VALUES(?,?,?,?,?,?);");
            ps.setString(1, user.getNome());
            ps.setInt(2, user.getCpf());
            ps.setInt(3, user.getPermissao());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getUsername());
            ps.setString(6, user.getEmail());
            ps.execute();
            ConectionFactory.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            ex.getMessage();
        }
    }
}
