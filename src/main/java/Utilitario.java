import java.util.ArrayList;
import java.util.List;

public abstract class Utilitario extends Vehiculo {
    protected int capacidadMaxima;
    protected List<Carga> cargas= new ArrayList<Carga>();

    public Utilitario(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void agregarCarga(Carga carga){
        if(getCapacidadActual()+carga.getPeso() <= capacidadMaxima) {
            this.cargas.add(carga);
        }
    }

    public List<Carga> getCargas() {
        return cargas;
    }
    private int getCapacidadActual(){
        int pesoFinal = 0;
        for (Carga carga : cargas) {
            pesoFinal =+ carga.getPeso();
        }
        return pesoFinal;
    }
}
