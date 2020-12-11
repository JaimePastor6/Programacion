import java.util.Scanner;
public class Ej07_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a encontrar un número elegido al azar entre 1 y 100");
        System.out.println("Si desea rendirse pulse 0");
        int numAleatorio = (int) (Math.random() * 100 + 1);
        int num = sc.nextInt();
        boolean seguir = num != numAleatorio;
        while (seguir) {
            if (num < 0 || num > 100) {
                System.out.println("Recuerda, estamos buscando un número entre 1 y 100");
                System.out.println("Introduzca otro número: ");
                num = sc.nextInt();
            }else if (num == 0) {
                System.out.println("Se ha rendido, el numero era: " + numAleatorio);
               break;
            }else if ( num < numAleatorio) {
                System.out.println("El número que buscamos es mayor");
                System.out.println("Introduzca otro número: ");
                num = sc.nextInt();

            }else if (num > numAleatorio) {
                System.out.println("El número que buscamos es menor");
                System.out.println("Introduzca otro número: ");
                num = sc.nextInt();

            }else if (num == numAleatorio){
                System.out.println("Felicidades, has encontrado el número");
                break;
            }else if (num < 0 && num > 100) {
                System.out.println("Recuerda, estamos buscando un número entre 1 y 100");
                System.out.println("Introduzca otro número: ");
                num = sc.nextInt();
            }
        }
    }
}
