public class App {
    public static void main(String[] args) throws Exception {
      TorreControl tc = new TorreControl();

      Aeronave a1 = new Aeronave("a1", tc);
      Aeronave a2 = new Aeronave("a2", tc);
      Aeronave a3 = new Aeronave("a3", tc);
      Aeronave a4 = new Aeronave("a4", tc);

      a1.enviar("Solicito confirmación para aterrizar en en TEC en 2 horas.");
      a2.enviar("Solicito confirmación para aterrizar en en TEC en 3 horas.");
      a3.enviar("Solicito confirmación para aterrizar en en TEC en 4 horas.");
      a4.enviar("Solicito confirmación para aterrizar en en TEC en 5 horas.");
    }
}
