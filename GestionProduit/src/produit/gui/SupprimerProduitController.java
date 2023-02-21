/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produit.gui;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import produit.services.ServiceProduit;
import produit.utils.DataSource;

/**
 * FXML Controller class
 *
 * @author ADMIN
 */
public class SupprimerProduitController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
     @FXML
    private TextField tfidProduit;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
        @FXML

        private void supprimerProduit(ActionEvent event) throws IOException, SQLException {


            Connection cnx = DataSource.getInstance().getCnx();
                if (tfidProduit.getText().isEmpty()) {
                Alert a = new Alert(Alert.AlertType.ERROR, "champ invalide(s)", ButtonType.OK);
            a.showAndWait();
                }
                else
                {
                            ServiceProduit sp = new ServiceProduit();
        
            if(JOptionPane.showConfirmDialog(null,"attention vous avez supprimer un produit,est ce que tu et sure?"
                     ,"supprimer produit",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION);
             if(tfidProduit.getText().length() != 0){
                         String idProduit=tfidProduit.getText();

String req = "DELETE FROM `produit` WHERE idProduit ="+tfidProduit.getText();;
  Statement st = cnx.createStatement();
            st.executeUpdate(req);
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Produit deleted !", ButtonType.OK);
            a.showAndWait();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherProduit.fxml"));
            Parent root = loader.load();
            tfidProduit.getScene().setRoot(root);
                
             }
                             else { JOptionPane.showMessageDialog(null,"veuillez SVP remplire le champ id !");}
 
                }
            
        
        
        }
 }
        

