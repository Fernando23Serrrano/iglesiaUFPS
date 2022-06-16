
package Modelo;

public class Feligrese {

    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String estrato;
    private String estado;
    private Integer diezmo;
    private static Integer totalizar = 0;
    private int cont = 0;

    public Feligrese() {
    }

    public Feligrese(String cedula, String nombre, String direccion, String telefono, String estrato, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;

    }
    public void actualizarDatos(String cedula, String nombre, String direccion, String telefono, String estrato, String estado){
        if(nombre!=null){
            this.setNombre(nombre);
        }
        if(direccion!=null){
            this.setDireccion(direccion);
        }
        if(telefono!=null){
            this.setTelefono(telefono);
        }
        if(estrato!=null){
            this.setEstrato(estrato);
            validarDiesmo();
        }
        if(estado!=null){
            this.setEstado(estado);
        }
    }

    public void validarDiesmo() {
        if (estrato.equals("1")) {
            diezmo = 250000;
        }
        if (estrato.equals("2")) {
            diezmo = 500000;
        }
        if (estrato.equals("3")) {
            diezmo = 1000000;
        }
    }

    public String pagarDiezmo() {
        
        
        StringBuffer sb = new StringBuffer("------PAGOS DE DIEZMO IGLESIA SAGRADA FAMILIA------\n");
        if(estado.equals("Deudor")){
        cont++;
        totalizar += diezmo;
        sb.append("Feligres: " + nombre + " Pago: " + diezmo + " N° de pago:" + cont);
        this.setEstado("Cumplido");
        }else{
            sb.append("Esta al dia con la iglesia");
        }
        return sb.toString();

    }

    public String totalizar(String cedula) {
        StringBuffer sb = new StringBuffer("________-Total De Diezmo______\n");

        sb.append(" Total: "+totalizar+"\n" );
        sb.append("...........................");

        return sb.toString();

    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getDiezmo() {
        return diezmo;
    }

    public void setDiezmo(Integer diezmo) {
        this.diezmo = diezmo;
    }

    public Integer getTotalizar() {
        return totalizar;
    }

    public void setTotalizar(Integer totalizar) {
        this.totalizar = totalizar;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Feligrese{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", estrato=" + estrato + ", estado=" + estado + ", diezmo=" + diezmo + '}';
    }

}
