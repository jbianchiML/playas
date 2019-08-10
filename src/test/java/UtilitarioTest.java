import org.assertj.core.api.Assertions;
import org.junit.Test;

public class UtilitarioTest {

    @Test
    public void agregarCarga(){
        Carga carga = new Carga(250);
        Camion camion = new Camion(250);
        camion.agregarCarga(carga);
        Assertions.assertThat(camion.getCargas()).isNotEmpty();
    }
}
