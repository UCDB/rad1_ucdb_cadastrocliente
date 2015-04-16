/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastrocliente;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author rf3020
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField tfnome;
    
    @FXML
    private TextField tffone;
    
    @FXML
    private void aoClicarBtnSalvar(ActionEvent event) {
      
       Cliente cliente = new Cliente();
       cliente.setNome(tfnome.getText());
       cliente.setFone( tffone.getText());
       
       //Gerenciador de dados // CRUD
       ClienteDAO cliDAO = new ClienteDAO();
       cliDAO.salvar(cliente);
       
       //Mensagem
      
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
