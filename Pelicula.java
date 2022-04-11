/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package herenciasolucion02;

/**
 *
 * @author Nacho
 */
public class Pelicula extends Elemento{
    private String director;

    public Pelicula() {
        super();
        this.director = "";
    }
    
    public Pelicula(String titulo, int duracion, String comentario, String director) {
        super(titulo, duracion, comentario);
        this.director = director;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += ", Director: " + director;
        
        return resultado;
    }

}
