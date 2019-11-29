package br.com.lucas.enadesimulator.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectionFactory {

    private static Connection conexao;
    private static final String URL_CONEXAO = "jdbc:mysql://localhost:3306/enade";
    private static final String USUARIO = "root";
    private static final String SENHA = "";// sem senha setar null

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
                System.out.println(String.format("Connected to database %s "
                    + "successfully.", conexao.getCatalog()));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return conexao;
    }
public static void fecharConexao(){
    if (conexao != null) {
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao = null;
        
    }
}
}
