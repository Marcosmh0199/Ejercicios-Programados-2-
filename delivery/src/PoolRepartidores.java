import java.util.Enumeration;
import java.util.Hashtable;

public class PoolRepartidores {

  private Hashtable<Repartidor, Long> repartidores;
  private int maxSize;

  public PoolRepartidores(int maxSize){
    repartidores = new Hashtable<Repartidor, Long>();
    setMaxSize(maxSize);
  }

  public void agregar(Repartidor r){
    if(repartidores.size() < maxSize){
      repartidores.put(r, (long) 0);
      System.out.println("Repartidor agregado.");
    }else{
      System.out.println("No se pueden agregar más repartidores.");
    }
  }

  private synchronized Repartidor buscarDisponible(){
    Repartidor r;
    Enumeration<Repartidor> llaves = repartidores.keys();
    while(llaves.hasMoreElements()){
      r = llaves.nextElement();
      if(repartidores.get(r) - System.currentTimeMillis() < 0){
        return r;
      }
    }
    System.out.println("No hay repartidores disponibles.");
    return null;
  }

  public synchronized void solicitarEntrega(int kilometros){
    Repartidor r = buscarDisponible();
    if(r != null){
      repartidores.remove(r);
      repartidores.put(r, System.currentTimeMillis() + r.getTiempoKilometro()*kilometros);
      System.out.println("Su entrega estara disponible en " + r.getTiempoKilometro()*kilometros/1000 + " minutos.");
    }
  }

  public void setMaxSize(int maxSize) {
    this.maxSize = maxSize;
  }
}