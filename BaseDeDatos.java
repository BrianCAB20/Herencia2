/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package herenciasolucion02;

import java.util.ArrayList;

/**
 *
 * @author Nacho
 */
public class BaseDeDatos {
    private ArrayList <Elemento> elementos;

    public BaseDeDatos(){
        elementos = new ArrayList();
    }

    public void agregarElemento(Elemento elemento){
        elementos.add(elemento);
    }
    
    public Elemento get(int index){
        return elementos.get(index);
    }

    @Override
    public String toString(){
        String resultado = "";

        for(Elemento elemento : elementos){
            resultado += elemento.toString() + "\n";
        }

        return resultado;
    }
}
