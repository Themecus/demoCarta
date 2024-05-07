public class DatosPapa {
    private String apellido="";
    private int numero=0;

    public DatosPapa(int numero, String apellido) {
        this.numero = numero;
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
