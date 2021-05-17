public class App {
    public static void main(String[] args) throws Exception {
      int cantidadRepartidores = 3;
      PoolRepartidores poolRepartidores = new PoolRepartidores(cantidadRepartidores);
      poolRepartidores.agregar(new Repartidor((long)1000));
      poolRepartidores.agregar(new Repartidor((long)1000));
      poolRepartidores.agregar(new Repartidor((long)1000));
      poolRepartidores.agregar(new Repartidor((long)1000)); //no se acepta, pool llena
      System.out.println("---------------------------------");

      poolRepartidores.solicitarEntrega(10); //aceptar entrega
      poolRepartidores.solicitarEntrega(7); //aceptar entrega
      poolRepartidores.solicitarEntrega(5); //aceptar entrega
      poolRepartidores.solicitarEntrega(1); //rechazar entrega
      poolRepartidores.solicitarEntrega(1); //rechazar entrega
      System.out.println("---------------------------------");
      
      System.out.println("Esperando por repartidores disponibles...");
      Thread.sleep(10000); //esperar 10segundos
      System.out.println("---------------------------------");
      poolRepartidores.solicitarEntrega(2); //aceptar entrega
      poolRepartidores.solicitarEntrega(1); //aceptar entrega
    }
}
