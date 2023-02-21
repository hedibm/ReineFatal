/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produit.services;
import static java.lang.System.in;
import java.sql.Blob;
import produit.entities.Produit;
import produit.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.text.Text;
/**
 *
 * @author ADMIN
 */
public class ServiceProduit implements IService<Produit> {
    Connection cnx = DataSource.getInstance().getCnx();

    @Override
  /*  public void ajouter(Produit t) {
        try {
            String req = "INSERT INTO `produit`(`nomProduit`,`description`, `prix`,`quantite`,`idFemme`,`idCategorie`,`image`, ) VALUES ('" +t.getNomproduit() + "','" + t.getDescription() + "','" + t.getPrix() + "','" + t.getQuantite() + "','" + t.getIdFemme() + "','" + t.getIdCategorie() + "','" + t.getImage() + "')";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Produit created !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
   
    
    }

    @Override*/
    public void supprimer(int idProduit) {
        try {
            String req = "DELETE FROM `produit` WHERE idProduit = " + idProduit;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Produit deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
    public void modifier(int idProduit,String nomProduit,String description,int prix,int quantite,int idFemme,int idCategorie,Blob image) {
          try {
            String req = "UPDATE `produit` SET `nom` = '" + nomProduit + "', `nom` = '" + description + "', `prix` = '" + prix + " ',  `quantite` = '" + quantite + "', `idFemme` = '" + idFemme + " ', `idCategorie` = '" + idCategorie + "', `image` = '" + image + "' WHERE `produit`.`idProduit` = " + idProduit;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Prdouit updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    

    
    /*public List<Produit> getAll() {
        List<Produit> result = new ArrayList<>();
        try {
            String req = "Select * from produit";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                Produit p= new Produit(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                        result.add (p);
                 
                
            }
        } catch (SQLException ex) {
            
            System.out.println(ex.getMessage());
        }

        return result;
    }

    @Override
*/
    public void modifier(Produit t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produit> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ajouter(Produit t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    
    
}
