public class Aeronave implements IAeronave{

  private String codigo;
  private TorreControl tc;

  public Aeronave(String codigo, TorreControl tc){
    setCodigo(codigo);
    setTc(tc);
  }

  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public TorreControl getTc() {
    return tc;
  }

  public void setTc(TorreControl tc) {
    this.tc = tc;
    tc.registrarAeronave(this);
  }

  @Override
  public void recibir(String mensaje) {
    System.out.println(codigo + ": La torre de control dice: " + mensaje);

  }

  @Override
  public void enviar(String mensaje) {
    tc.recibir(codigo, mensaje);
  }
  
}
