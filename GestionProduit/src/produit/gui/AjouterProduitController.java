/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produit.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;import com.sun.org.apache.xerces.internal.util.FeatureState;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import produit.entities.Produit;
import produit.services.ServiceProduit;
import produit.utils.DataSource;


/**
 * FXML Controller class
 *
 * @author admin
 */
public class AjouterProduitController implements Initializable {

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
    //                    @FXML
   // private ImageView imageview;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void ajouterProduit(ActionEvent event) throws IOException, SQLException {
            Connection cnx = DataSource.getInstance().getCnx();

        if (tfNom.getText().isEmpty() || tfDescription.getText().isEmpty()|| tfPrix.getText().isEmpty()|| tfQuantite.getText().isEmpty()|| tfidFemme.getText().isEmpty()|| tfidCategorie.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR, "champ invalide(s)", ButtonType.OK);
            a.showAndWait();
        } else {
            ServiceProduit sp = new ServiceProduit();
 
        String nomProduit=tfNom.getText();
                String description=tfDescription.getText();
        String prix=tfPrix.getText();
        String quantite=tfQuantite.getText();
        String idFemme=tfidFemme.getText();
        String idCategorie=tfidCategorie.getText();
        String req="INSERT INTO `produit`(`nomProduit`,`description`, `prix`,`quantite`,`idFemme`,`idCategorie` )VALUES('"+
                nomProduit+"','"+description+"','"+prix+"','"+quantite+"','"+idFemme+"','"+idCategorie+"')";
         Statement st = cnx.createStatement();
            st.executeUpdate(req);
        
            /*Produit p = new Produit(tfNom.getText(), tfDescription.getText(), tfPrix.getText(), tfQuantite.getText(), tfidFemme.getText(), tfidCategorie.getText());
           sp.ajouter(p); */
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Produit added !", ButtonType.OK);
            a.showAndWait();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherProduit.fxml"));
            Parent root = loader.load();
            tfNom.getScene().setRoot(root);
            AfficherProduitController apc = loader.getController();
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
}