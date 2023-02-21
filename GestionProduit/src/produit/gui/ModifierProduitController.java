/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produit.gui;

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
public class ModifierProduitController implements Initializable {
    @FXML
private TextField tfidProduit;
      @FXML
    private TextField tfNom;
    @FXML
    private TextField tfDescription;
        @FXML
    private TextField tfPrix;
            @FXML
    private TextField tfQuantite;
                @FXML
    private TextField tfidFemme;
                    @FXML
    private TextField tfidCategorie;
                    @FXML
                        private DataSource ds = DataSource.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }            @FXML

        private void modifierProduit(ActionEvent event) throws IOException, SQLException {
            
             Connection cnx = DataSource.getInstance().getCnx();
                         ServiceProduit sp = new ServiceProduit();

if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                String req ="UPDATE produit SET `Nom`='"+tfNom.getText()+"',`Description`='"+tfDescription.getText()+
                        "',`prix`='"+tfPrix.getText()+"',`quantite`='"+tfQuantite.getText()+"',`idFemme`='"+tfidFemme.getText()+"',`idCategorie`='"+tfidCategorie.getText()+
                        "' WHERE idProduit= "+tfidProduit.getText();
            Statement st = cnx.createStatement();
        st.executeUpdate(req);

        }
                           
          Alert a = new Alert(Alert.AlertType.INFORMATION, "Produit Modified !", ButtonType.OK);
            a.showAndWait();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherProduit.fxml"));
            Parent root = loader.load();
            tfNom.getScene().setRoot(root);
            AfficherProduitController apc = loader.getController();
            String idProduitText = tfidProduit.getText(); // Get the text from the text field
apc.setidProduit(idProduitText); 
            apc.setNom(tfNom.getText());
            apc.setDescription(tfDescription.getText());
String prixText = tfPrix.getText(); // Get the text from the text field
apc.setPrix(prixText); // Set the integer value to the object using the setPrix method
String quantiteText = tfQuantite.getText(); // Get the text from the text field
apc.setQuantite(quantiteText);
String idFemmeText = tfidFemme.getText(); // Get the text from the text field
apc.setidFemme(idFemmeText);
String idCategorieText = tfidCategorie.getText(); // Get the text from the text field
apc.setidCategorie(idCategorieText);    
            
        }

}
