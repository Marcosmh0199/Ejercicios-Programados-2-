import model.TransportePersona;
import util.FabricaTransporte;
import util.TipoTransporte;

public class App {
  public static void main(String[] args){
    FabricaTransporte fabrica = new FabricaTransporte();

    TransportePersona t1 = fabrica.crearTransporte(TipoTransporte.AUTOMOVIL);
    System.out.println(t1);

    TransportePersona t2 = fabrica.crearTransporte(TipoTransporte.BUS);
    System.out.println(t2);

    TransportePersona t3 = fabrica.crearTransporte(TipoTransporte.PESADO);
    System.out.println(t3);
  }
}
