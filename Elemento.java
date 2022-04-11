/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package herenciasolucion02;

/**
 *
 * @author Nacho
 */
public abstract class Elemento {
    protected String titulo;
    protected int duracion;
    protected String comentario;
    
    public Elemento(){
        this.titulo = "";
        this.duracion = 0;
        this.comentario = "";
    }

    public Elemento(String titulo, int duracion, String comentario) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.comentario = comentario;
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.titulo != null ? this.titulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Elemento other = (Elemento) obj;
        if ((this.titulo == null) ? (other.titulo != null) : !this.titulo.equals(other.titulo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Título: " + titulo + ", " +
               "Duración: " + duracion + ", " +
               "Comentario: " + comentario;
    }
    
//    public abstract void calcular();
}
