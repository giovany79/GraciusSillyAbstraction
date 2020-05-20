
import java.util.Scanner;
import co.com.gcode.model.Rectangle;

class Main {
  public static void main(String[] args) {
    System.out.println("CALCULO AREA");
    System.out.println("Elija el tipo de figura");
    System.out.println("1. Circulo");
    System.out.println("2. Rectangulo");
    System.out.println("3. triangulo");

    Scanner entradaEscaner = new Scanner(System.in);
    String entradaTeclado = entradaEscaner.nextLine();

    if (entradaTeclado.equals("1")) {
      System.out.println("Se eligio un circul¡in");
    } else if (entradaTeclado.equals("2")) {
      // System.out.println ("Se eligio un rectangulo");
      System.out.println("Ingrese el ancho:");
      Scanner widthIn = new Scanner(System.in);
      int width = entradaEscaner.nextInt();

      System.out.print("Ingrese el largo:");
      entradaEscaner = new Scanner(System.in);
      int height = entradaEscaner.nextInt();

      Rectangle rectangle = new Rectangle(width, height);

      System.out.println("El area del rectangulo es:" + rectangle.calculateArea());

    } else if (entradaTeclado.equals("3")) {
      System.out.println("Se eligio un triangulo");
    } else {
      System.out.println("Se eligio un valor no valido");
    }
  }
}