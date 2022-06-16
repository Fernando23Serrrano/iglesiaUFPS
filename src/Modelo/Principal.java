
package Modelo;

import Control.Control;
import Vista.JFIglesia;


public class Principal {
    public static void main(String[] args) {
        JFIglesia vista= new JFIglesia();
        Feligrese f= new Feligrese();
        Iglesia i= new Iglesia();
        Control control = new  Control(vista, f, i);
        vista.setVisible(true);
    }
    
}
