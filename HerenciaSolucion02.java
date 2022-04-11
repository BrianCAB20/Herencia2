/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciasolucion02;

/**
 *
 * @author Nacho
 */
public class HerenciaSolucion02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BaseDeDatos bd = new BaseDeDatos();

            AlbumMusica album = new AlbumMusica();
            album.setTitulo("Americana");
            album.setInterprete("The Offspring");
            album.setDuracion(60);
            album.setNumeroDeTemas(13);
            album.setComentario("Tiene un track oculto");
            
            bd.agregarElemento(album);
            
            AlbumMusica album2 = new AlbumMusica();
            album2.setTitulo("El Camino");
            album2.setInterprete("The Black Keys");
            album2.setDuracion(60);
            album2.setNumeroDeTemas(10);
            album2.setComentario("Muy Bueno!");
            
            bd.agregarElemento(album2);

            Pelicula pelicula = new Pelicula();
            pelicula.setTitulo("Back To The Future");
            pelicula.setDirector("Robert Zemeckis");
            pelicula.setDuracion(60);
            pelicula.setComentario("La primera película de la trilogía");
            
            bd.agregarElemento(pelicula);
            
//            Elemento e = new Elemento();
//            e.setTitulo("prueba");
//            e.setDuracion(15);
//            e.setComentario("");
            
//            bd.agregarElemento(e);
            

            System.out.println(bd.toString());
            
//            Elemento e1 = album;
//            Elemento e2 = pelicula;
//            if(e1.equals(e2)){
//                System.out.println("iguales");
//            } else {
//                System.out.println("Distintos");
//            }
            
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
}
