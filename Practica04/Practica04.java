import java.util.Scanner;
public class Practica04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número del ejercicio que quiere resolver: ");
        System.out.println("1. For");
        System.out.println("2. While");
        System.out.println("3. Salir");
        int opcion = sc.nextInt();
        boolean salir = false;
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Escriba dos números, que serán los lados de un rectángulo, el valor mayor sera la base y el menor la altura");
                    System.out.println("Primer valor:");
                    int a = sc.nextInt();
                    System.out.println("Segundo valor:");
                    int b = sc.nextInt();
                    System.out.println("Escriba el caracter del que desea que sea el rectángulo:");
                    char ch = sc.next().charAt(0);

                    if (a < b) {
                        for (int i = 1; i <= a; i++) {
                            for (int j = 1; j <= b; j++) {
                                System.out.print(" " + ch);
                            }
                            System.out.println("");
                        }
                    } else if (b < a) {
                        for (int i = 1; i <= b; i++) {
                            for (int j = 1; j <= a; j++) {
                                System.out.print(" " + ch);
                            }
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Los valores son iguales, seria un cuadrado, no un rectángulo");
                    }
                   System.exit(0);
                case 2:
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
                        } else if (num == 0) {
                            System.out.println("Se ha rendido, el numero era: " + numAleatorio);
                            break;
                        } else if (num < numAleatorio) {
                            System.out.println("El número que buscamos es mayor");
                            System.out.println("Introduzca otro número: ");
                            num = sc.nextInt();

                        } else if (num > numAleatorio) {
                            System.out.println("El número que buscamos es menor");
                            System.out.println("Introduzca otro número: ");
                            num = sc.nextInt();

                        } else if (num == numAleatorio) {
                            System.out.println("Felicidades, has encontrado el número");
                            break;
                        } else if (num < 0 && num > 100) {
                            System.out.println("Recuerda, estamos buscando un número entre 1 y 100");
                            System.out.println("Introduzca otro número: ");
                            num = sc.nextInt();
                        }
                    }
                    System.exit(0);
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Numero Incorrecto");
                    System.out.println("Introduzca el número del ejercicio que quiere resolver: ");
                    System.out.println("1. For");
                    System.out.println("2. While");
                    System.out.println("3. Salir");
                    opcion = sc.nextInt();
            }

            }while (!salir);

        }
}


