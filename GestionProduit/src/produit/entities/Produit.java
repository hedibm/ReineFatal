/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produit.entities;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;
import javafx.scene.image.Image;
import javafx.scene.text.Text;

/**
 *
 * @author ADMIN
 */
public class Produit {
    private int idProduit,quantite,prix,idFemme,idCategorie;
    private String nomProduit, description;

  //  private Blob image;

    public Produit(int idProduit, int quantite, int prix, int idFemme, int idCategorie, String nomProduit, String description) {
        this.idProduit = idProduit;
        this.quantite = quantite;
        this.prix = prix;
        this.idFemme = idFemme;
        this.idCategorie = idCategorie;
        this.nomProduit = nomProduit;
        this.description = description;
    }
    

    public Produit() {
    }
    
    public Produit(String nomProduit, String description) {
        this.nomProduit = nomProduit;
        this.description=description;
    }

    /*  public Produit(String idProduit, String nomProduit, String description, String prix, String quantite, String idFemme, String idCategorie) {
    this.idProduit = Integer.parseInt(idProduit);
    this.nomProduit = nomProduit;
    this.description = description;
    this.prix = Integer.parseInt(prix);
    this.quantite = Integer.parseInt(quantite);
    this.idFemme = Integer.parseInt(idFemme);
    this.idCategorie = Integer.parseInt(idCategorie);

    // Convertir la chaîne de caractères représentant l'image en un tableau de bytes
    /*  byte[] imageBytes = Base64.getDecoder().decode(imageAsString);

    try {
        // Créer un objet Blob à partir du tableau de bytes
        this.image = new javax.sql.rowset.serial.SerialBlob(imageBytes);
    } catch (SQLException ex) {
        // Gérer l'exception s'il y a lieu
        System.out.println("Erreur lors de la conversion de la chaîne de caractères en Blob: " + ex.getMessage());
    }
}

   

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getIdFemme() {
        return idFemme;
    }

    public void setIdFemme(int idFemme) {
        this.idFemme = idFemme;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    

   

    public Produit(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



   

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

  
    
    public int getidCategorie() {
        return idCategorie;
    }

 

    @Override
    public String toString() {
        return "Produit{" + "nomProduit=" + nomProduit + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idProduit;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        if (this.idProduit != other.idProduit) {
            return false;
        }
        return true;
    }

    public String getNomproduit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    */
    
}
