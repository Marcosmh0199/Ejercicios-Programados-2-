package model;

public class TransportePesado extends TransportePersona{

  public TransportePesado(short combustible, short cantidadPersonas) {
    super(combustible, cantidadPersonas);
  }
 
  @Override
  public String toString(){
    return "Transporte pesado con capacidad para " + cantidadPersonas + " personas. Requiere de "+combustible+" litros de combustible.\n";
  }
}
