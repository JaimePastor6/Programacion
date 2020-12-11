import java.util.Scanner;
public class Practica02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número:");
        int num1 = sc.nextInt();
        if (num1 < 0) {
            System.out.println("El primer número es negativo");
            System.exit(1);
        }
        System.out.println("Introduzca el segudo número:");
        int num2 = sc.nextInt();
        if (num2 < 0) {
            System.out.println("El segundo número es negativo");
            System.exit(1);
        }

        System.out.println("Introduzca la operación deseada:");

        char ch = sc.next().charAt(0);

        boolean b1 = ch == '+';
        boolean b2 = ch == '-';
        boolean b3 = ch == '*';
        boolean b4 = ch == '/';
        boolean b5 = !b1 && !b2 && !b3 && !b4;

        if (b1) {
            System.out.println("El resultado es " + (num1 + num2));
        } else if (b2) {
            System.out.println("El resultado es " + (num1 - num2));
        }else if (b3) {
            System.out.println("El resultado es " + (num1 * num2));
        }else if (b4) {
            System.out.println("El resultado es " + (num1 / num2));
        }else if (b5) {
            System.out.println("El caracter no es valido");
        }
}
}
