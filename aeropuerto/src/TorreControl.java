import java.util.HashMap;
import java.util.Scanner;

public class TorreControl implements ITorreControl{
  
  private HashMap<String, Aeronave> aeronaves;
  private Scanner s;

  public TorreControl(){
    aeronaves = new HashMap<>();
    s = new Scanner(System.in);
  }

  @Override
  public void registrarAeronave(Aeronave a) {
    if(aeronaves.containsKey(a.getCodigo())){
      System.out.println("La aeronave ya está registrada.");
    }else{
      aeronaves.put(a.getCodigo(), a);
      System.out.println("Aeronave " + a.getCodigo() + " registrada.");
    }
    
  }

  @Override
  public void recibir(String emisor, String mensaje) {
    System.out.println("La aeronave " + emisor + " dice: " + mensaje);
    responder(emisor);
  }

  @Override
  public void responder(String destinatario) {
    System.out.print("Respuesta: "); String respuesta = s.nextLine();
    aeronaves.get(destinatario).recibir(respuesta);
  }
  
}
