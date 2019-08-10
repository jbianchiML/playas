import java.util.ArrayList;
import java.util.List;

public class PlayaEstacionamiento {

    private List<Vehiculo> vehiculos = new ArrayList<>();


    private PlayaEstacionamiento (){

    }

    private static PlayaEstacionamiento playaUnica= new PlayaEstacionamiento();

    public static PlayaEstacionamiento getInstance(){
        return playaUnica;
    }
    public Vehiculo agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        return vehiculo;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
