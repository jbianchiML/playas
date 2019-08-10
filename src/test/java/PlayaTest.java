import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class PlayaTest {

    @Test
    public void crearPlayaEstacionamiento (){
        PlayaEstacionamiento playaEstacionamiento = PlayaEstacionamiento.getInstance();
        Assertions.assertThat(playaEstacionamiento).isNotNull();
    }
    @Test
    public void crearPlayaCarga(){
        PlayaCarga playaCarga = PlayaCarga.getInstance();
        Assertions.assertThat(playaCarga).isNotNull();
    }

    @Test
    public void agregarAutoPlayaEstacionamiento(){
        PlayaEstacionamiento playaEstacionamiento= PlayaEstacionamiento.getInstance();
        int sizeOriginal = playaEstacionamiento.getVehiculos().size();
        playaEstacionamiento.agregarVehiculo(new Auto());
        Assertions.assertThat(sizeOriginal).isLessThan(playaEstacionamiento.getVehiculos().size());
    }

    @Test
    public void agregarCamionPlayaCarga(){
        PlayaCarga playaCarga= PlayaCarga.getInstance();
        int sizeOriginal = playaCarga.getUtilitarios().size();
        playaCarga.agregarUtilitario(new Camion(250));
        Assertions.assertThat(sizeOriginal).isLessThan(playaCarga.getUtilitarios().size());
    }

    @Test
    public void singletonDevuelveMismaInstancia(){
        PlayaCarga playaCarga = PlayaCarga.getInstance();
        List<Utilitario> utilitariosAntesDeAAgregar = playaCarga.getUtilitarios();
        playaCarga.agregarUtilitario(new Camion(250));
        PlayaCarga playaCarga2 = PlayaCarga.getInstance();
        Assertions.assertThat(utilitariosAntesDeAAgregar).isEqualTo(playaCarga2.getUtilitarios());

    }

}
