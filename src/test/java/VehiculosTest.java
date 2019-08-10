import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class VehiculosTest {

    @Test
    public void crearAuto(){
        Auto auto=new Auto();
        Assertions.assertThat(auto).isNotNull();
    }

    @Test
    public void crearCamion(){
        Camion camion=new Camion(250);
        Assertions.assertThat(camion).isNotNull();
    }

    @Test
    public void crearCamioneta(){
        Camioneta camioneta=new Camioneta(250);
        Assertions.assertThat(camioneta).isNotNull();
    }

}
