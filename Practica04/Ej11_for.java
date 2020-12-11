import java.util.Scanner;
public class Ej11_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba dos números, que serán los lados de un rectángulo, el valor mayor sera la base y el menor la altura");
        System.out.println("Primer valor:");
        int a = sc.nextInt();
        System.out.println("Segundo valor:");
        int b = sc.nextInt();
        System.out.println("Escriba el caracter del que desea que sea el rectángulo:");
        char ch = sc.next().charAt(0);

        if (a<b) {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    System.out.print(" " + ch);
                }
                System.out.println("");
            }
        } else if (b<a) {
            for (int i = 1; i <= b; i++) {
                for (int j = 1; j <= a; j++) {
                    System.out.print(" " + ch);
                }
                System.out.println("");
            }
        } else {
            System.out.println("Los valores son iguales, seria un cuadrado, no un rectángulo");
        }
    }
}
