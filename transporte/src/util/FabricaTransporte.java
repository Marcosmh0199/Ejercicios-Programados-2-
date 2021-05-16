package util;

import model.*;

public class FabricaTransporte {

  public TransportePersona crearTransporte(TipoTransporte tipo){
    switch (tipo) {
      case PESADO:
      {
        return new TransportePesado((short)1000, (short)4);
      }
      case AUTOMOVIL:
      {
        return new TransporteAutomovil((short)1000, (short)4);
      }
      case BUS:
      {
        return new TransporteBus((short)1000, (short)4);
      }
      default:
      {
        System.out.println("Tipo inválido.");
        return null;
      }
    }
  }
}
