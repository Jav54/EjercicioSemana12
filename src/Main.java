import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int cont = 0;

        while (cont == 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la figura que desee calcular perimetro y area: ");
            System.out.println("a: Triangulo");
            System.out.println("b: Cuadrado");
            System.out.println("c: Circulo");
            String input = sc.next();

            switch (input){
                case "a":
                    Triangulo tr = new Triangulo();
                    tr.ingresarPuntos();
                    System.out.println("El perimetro del triangulo es: "+tr.calcularPerimetro());
                    System.out.println("El area del triangulo es: "+tr.calcularArea());
                    cont = 1;
                    break;
                case "b":
                    Cuadrado cua = new Cuadrado();
                    cua.ingresarPuntos();
                    if(cua.esCuadrado() == true){
                        System.out.println("El perimetro del cuadrado es: "+cua.calcularPerimetro());
                        System.out.println("El area del cuadrado es: "+cua.calcularArea());
                    }
                    else{
                        System.out.println("Los puntos no forman un cuadrado");
                    }
                    cont = 1;
                    break;
                case "c":
                    Circulo cr = new Circulo();
                    cr.ingresarPuntos();
                    System.out.println("El perimetro del circulo es: "+cr.calcularPerimetro());
                    System.out.println("El area del circulo es: "+cr.calcularArea());
                    cont = 1;
                    break;
                default:
                    System.out.println("Ingrese una letra correcta (en minusculas) para continuar: ");
            }
        }
    }
}