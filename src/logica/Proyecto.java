package logica;

import gui.Pmain;

/**
 *
 * @author Seinred
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se conecta la parte grafica con el codigo
        Pmain inicio = new Pmain();//Crea la pantalla 
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);//Deja en el medio la pantalla
        
    }
    
}
