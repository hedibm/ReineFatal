    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produit.entities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 *
 * @author ADMIN
 */
public class Image {
    
    private File file;

    public Image(String filePath) {
        this.file = new File(filePath);
    }

    public javafx.scene.image.Image getImage() throws FileNotFoundException {
        return new javafx.scene.image.Image(new FileInputStream(file));
    }
}
