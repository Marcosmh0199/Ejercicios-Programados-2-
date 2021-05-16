package model;

public class TransporteBus extends TransportePersona{

  public TransporteBus(short combustible, short cantidadPersonas) {
    super(combustible, cantidadPersonas);
  }
  
  @Override
  public String toString(){
    return "Bus con capacidad para " + cantidadPersonas + " personas. Requiere de "+combustible+" litros de combustible.\n";
  }
}
