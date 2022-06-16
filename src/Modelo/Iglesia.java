
package Modelo;

import java.util.ArrayList;

public class Iglesia {

    private ArrayList<Feligrese> feligreses;

    public Iglesia() {
        feligreses = new ArrayList<>();
    }

    public void agregarFeligres(Feligrese f) {
        f.validarDiesmo();
        feligreses.add(f);
    }

    public Feligrese buscarFeligres(String cedula) {
        Feligrese f = new Feligrese();
        for (int i = 0; i < feligreses.size(); i++) {
            if (feligreses.get(i).getCedula().equals(cedula)) {
                f = feligreses.get(i);
            }
        }
        return f;
    }

    public void eliminarFeligres(String cedula) {

        for (int i = 0; i < feligreses.size(); i++) {
            if (feligreses.get(i).getCedula().equals(cedula)) {
                feligreses.remove(i);

            }
        }

    }

    public String imprimir() {
        StringBuffer sb = new StringBuffer("Feligreses: \n");
        for (int i = 0; i < feligreses.size(); i++) {
            sb.append(feligreses.get(i).toString() + "\n");
        }
        return sb.toString();
    }

}
