/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package herenciasolucion02;

/**
 *
 * @author Nacho
 */
public class AlbumMusica extends Elemento{
    
    private String interprete;
    private int numeroDeTemas;
    
    public AlbumMusica(){
        super();
        this.interprete = "";
        this.numeroDeTemas = 0;
    }
    
    public AlbumMusica(String titulo, int duracion, String comentario, String interprete, int numeroDeTemas) throws Exception{
        super(titulo, duracion, comentario);
        this.interprete = interprete;
        this.numeroDeTemas = numeroDeTemas;
    }

    /**
     * @return the interprete
     */
    public String getInterprete() {
        return interprete;
    }

    /**
     * @param interprete the interprete to set
     */
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    /**
     * @return the numeroDeTemas
     */
    public int getNumeroDeTemas() {
        return numeroDeTemas;
    }

    /**
     * @param numeroDeTemas the numeroDeTemas to set
     */
    public void setNumeroDeTemas(int numeroDeTemas) {
        this.numeroDeTemas = numeroDeTemas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlbumMusica other = (AlbumMusica) obj;
        
        if (!other.getTitulo().equals(this.getTitulo())){
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString(){
       String resultado = super.toString();
       resultado += ", Intérprete: " + interprete + ", " +
                    "Número de Temas: " + numeroDeTemas;

       return resultado;
    }

//    @Override
//    public void calcular() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
