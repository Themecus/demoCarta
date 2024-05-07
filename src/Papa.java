import java.util.LinkedList;

public class Papa {
    private LinkedList<DatosPapa> decendencia = new LinkedList<DatosPapa>();

    public Papa() {
    }

    public Papa(LinkedList<DatosPapa> decendencia) {
        this.decendencia = decendencia;
    }

    public void  estadoDelSer()
    {
        int contador=0;
        int tamano=decendencia.size();
        System.out.println(tamano);
         while(contador!=tamano)
         {

             System.out.println("Los papas se apellidan "+decendencia.get(contador).getApellido()+" y su cedula "+decendencia.get(contador).getNumero());
             contador++;
         }

    }

    public void crearDecendencia(int i, String nombre) {

     DatosPapa nuevo= new DatosPapa(i,nombre);
     decendencia.add(nuevo);
    }
}
