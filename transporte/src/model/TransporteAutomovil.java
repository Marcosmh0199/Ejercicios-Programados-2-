package model;

public class TransporteAutomovil extends TransportePersona{

  public TransporteAutomovil(short combustible, short cantidadPersonas) {
    super(combustible, cantidadPersonas);
  }
  
  @Override
  public String toString(){
    return "Automovil con capacidad para " + cantidadPersonas + " personas. Requiere de "+combustible+" litros de combustible.\n";
  }
}
