public interface ITorreControl {
  public abstract void registrarAeronave(Aeronave a);
  public abstract void recibir(String emisor, String mensaje);
  public abstract void responder(String destinatario);
}
