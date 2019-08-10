import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlayaCarga {

    private List<Carga> cargas;

    private List <Utilitario> utilitarios =new ArrayList<Utilitario>();

    private PlayaCarga (){

    }

    private static PlayaCarga playaUnica= new PlayaCarga();

    public static PlayaCarga getInstance(){
        return playaUnica;
    }

    public List<Utilitario> getUtilitarios() {
        return utilitarios;
    }

    public void agregarUtilitario(Utilitario utilitario){
        utilitarios.add(utilitario);
    }

    /*public void agregarCargaAUtilitario(Utilitario utilitario){
        utilitario.
    }*/
}
