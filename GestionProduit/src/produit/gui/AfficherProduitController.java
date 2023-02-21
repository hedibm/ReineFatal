/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produit.gui;

import java.awt.Label;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import java.sql.Blob;
import produit.entities.Image;



/**
 * FXML Controller class
 *
 * @author ADMIN
 */
public class AfficherProduitController implements Initializable {
    @FXML
    private Label lblidProduit;
        @FXML
    private Label lblNom;
    @FXML
        private Label lblDescription;
    @FXML
    private Label lblPrix;
    @FXML
    private Label lblQuantite;
    @FXML
    private Label lblidFemme;
    @FXML
    private Label lblidCategorie;
    @FXML
   // private ImageView imageview;
    
    
    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setidPrdouit(int idProduit){
String idProduitStr = Integer.toString(idProduit);
    lblidProduit.setText(idProduitStr);
    }
     public void setNom(String nom){
        lblNom.setText(nom);
    }
    
    public void setDescription(String Description){
        lblDescription.setText(Description);
    }
   public void setPrix(int prix) {
    String prixStr = Integer.toString(prix);
    lblPrix.setText(prixStr);
}
    
public void setQuantite(int quantite) {
    String quantiteStr = Integer.toString(quantite);
    lblQuantite.setText(quantiteStr);
}
   public void setidFemme(int idFemme) {
    String idFemmeStr = Integer.toString(idFemme);
    lblidFemme.setText(idFemmeStr);
}
 public void setidCategorie(int idCategorie) {
    String idCategorieStr = Integer.toString(idCategorie);
    lblidCategorie.setText(idCategorieStr);
}
 /*public void setimageview(File file) {
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
    }*/

    void setPrix(String prixText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setQuantite(String quantiteText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setidFemme(String idFemmeText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setidCategorie(String idCategorieText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setidProduit(String idProduitText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
