package models;

import java.util.Date;
import javax.persistence.Entity;
import play.db.jpa.Model;
/**
 *
 * @author Tania
 */
@Entity
public class Libro extends Model{

    
    public String titulo;
    public String autor;
    public String año;
    public String genero;
    public Date fechaLanzamiento;

    
    @Override
    public String toString(){
        return String.format("%s %s", this.titulo, this.autor);
    }
}