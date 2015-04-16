/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastrocliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rf3020
 */
public class ClienteDAO {

   Connection conexao;

    public ClienteDAO() {
        conexao = ConexaoUtil.getConnection();
    }
   
   
    
   public void salvar(Cliente cliente) {
       String sql ="insert  into cliente (nome,fone) values (?,?)";
       try {
           PreparedStatement preparadorSQL = conexao.prepareStatement(sql);
           preparadorSQL.setString(1, cliente.getNome());
           preparadorSQL.setString(2, cliente.getFone());
           preparadorSQL.execute();
           preparadorSQL.close();
       } catch (SQLException ex) {
           Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
    
}
