package model;

public class TransportePersona {
  protected short combustible;
  protected short cantidadPersonas;

  public TransportePersona(short combustible, short cantidadPersonas){
    setCombustible(combustible);
    setCantidadPersonas(cantidadPersonas);
  }

  protected short getCombustible(){
    return combustible;
  }
  protected void setCombustible(short combustible){
    this.combustible = combustible;
  }

  protected short getCantidadPersonas(){
    return cantidadPersonas;
  }
  protected void setCantidadPersonas(short cantidadPersonas){
    this.cantidadPersonas = cantidadPersonas;
  }
}
