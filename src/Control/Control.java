
package Control;

import Modelo.Feligrese;
import Modelo.Iglesia;
import Vista.JFIglesia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

        
public class Control implements ActionListener{
    private JFIglesia vista;
    private Feligrese f;
    private Iglesia i;

    public Control(JFIglesia vista, Feligrese f, Iglesia i) {
        this.vista = vista;
        this.f = f;
        this.i = i;
        ActionListener(this);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Guardar")){
        f.setCedula(vista.txtCedula.getText());
        f.setNombre(vista.txtNombre.getText());
        f.setDireccion(vista.txtDireccion.getText());
        f.setTelefono(vista.txtTelefono.getText());
        f.setEstrato(vista.txtEstrato.getText());
        f.setEstado(vista.txtEstado.getText());
        Feligrese fe= new Feligrese(f.getCedula(), f.getNombre(), f.getDireccion(), f.getTelefono(), f.getEstrato(), f.getEstado());
        i.agregarFeligres(fe);
        System.out.println("----------");
        }
        if(e.getActionCommand().equals("Buscar")){
            Feligrese feli= i.buscarFeligres(vista.txtCedula.getText());
            vista.txtNombre.setText(feli.getNombre());
            vista.txtTelefono.setText(feli.getTelefono());
            vista.txtEstrato.setText(feli.getEstrato());
            vista.txtEstado.setText(feli.getEstado());
            vista.txtDireccion.setText(feli.getDireccion());
            
        }
        if(e.getActionCommand().equals("Consultar")){
            Feligrese feli= i.buscarFeligres(vista.txtCedula1.getText());
            String diezmo= String.valueOf(feli.getDiezmo());
            vista.txtValorDiesmo.setText(diezmo);
            
        }
        if(e.getActionCommand().equals("Pagar")){
            Feligrese feli=i.buscarFeligres(vista.txtCedula1.getText());
            vista.jTextArea1.setText(feli.pagarDiezmo());
        }
        if(e.getActionCommand().equals("Totalizar")){
            vista.jTextArea1.setText(f.totalizar(vista.txtCedula1.getText()));
        }
        if(e.getActionCommand().equals("Eliminar")){
            i.eliminarFeligres(vista.txtCedula.getText());
        }
        if(e.getActionCommand().equals("Actualizar")){
            Feligrese feli= i.buscarFeligres(vista.txtCedula.getText());
            String cedula=vista.txtCedula.getText();
            String nombre=vista.txtNombre.getText();
            String direccion=vista.txtDireccion.getText();
            String telefono=vista.txtTelefono.getText();
            String estrato=vista.txtEstrato.getText();
            String estado=vista.txtEstado.getText();
            feli.actualizarDatos(cedula, nombre, direccion, telefono, estrato, estado);
            
        }
        if(e.getActionCommand().equals("Eliminar")){
           // vista.jTextArea1.setText(i.buscarFeligres(vista.txtCedula.getText()).toString()+"--->Eliminado");
            i.eliminarFeligres(vista.txtCedula.getText());
            
        }
    }
      

    private void ActionListener(Control control) {
        vista.jbGuardar.addActionListener(control);
        vista.jbBuscar.addActionListener(control);
        vista.jbConsultar.addActionListener(control);
        vista.jbTotalizar.addActionListener(control);
        vista.jbPagar.addActionListener(control);
        vista.jbEliminar.addActionListener(control);
        vista.jbActualizar.addActionListener(control);
        vista.jbEliminar.addActionListener(control);
    }
      
    
}
