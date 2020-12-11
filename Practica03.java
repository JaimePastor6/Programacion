import java.util.Scanner;
public class Practica03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Sobre que tipo de estructuras quieres resolver ejercicios?");
        System.out.println("1 if");
        System.out.println("2 switch");

        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("If:");
                System.out.println("Introduce el número de ejercicio que quiere que resuelva");
                System.out.println("1. Par-Impar");
                System.out.println("2. Sueldo anual (impuestos)");
                System.out.println("3. Triángulo Válido");
                System.out.println("4. Fiesta de las marmotas");
                System.out.println("5. Notas");
                int numIf = sc.nextInt();
                switch (numIf) {
                    case 1:
                        System.out.println("Introduce un numero");
                        int num = sc.nextInt();

                        int cociente = num % 2;
                        boolean b1 = cociente == 0;
                        boolean b2 = cociente != 0;

                        if (b1) {
                            System.out.println("El numero es par");
                        } else if (b2) {
                            System.out.println("El numero es impar");
                        }
                        break;
                    case 2:
                        System.out.println("Indique su sueldo anual:");
                        int sueldo = sc.nextInt();
                        if (sueldo < 9000) {
                            System.out.println("No debe pagar impuestos");
                        } else if (sueldo > 9000) {
                            System.out.println("Debe pagar impuestos");
                        }
                        break;
                    case 3:
                        System.out.println("Escriba el lado A del triángulo:");
                        int a = sc.nextInt();
                        System.out.println("Escriba el lado B del triángulo:");
                        int b = sc.nextInt();
                        System.out.println("Escriba el lado C del triángulo:");
                        int c = sc.nextInt();

                        boolean ba = ((a + b) > c);
                        boolean bb = ((a + c) > b);
                        boolean bc = ((b + c) > a);

                        boolean b4 = ba && bb && bc;
                        boolean b5 = !ba || !bb || !bc;

                        if (b4) {
                            System.out.println("SÍ");
                        } else if (b5) {
                            System.out.println("NO");
                        }
                        break;
                    case 4:
                        System.out.println("¿Cuantas tazas de mantequilla de cacahuetes habra en la fista?");
                        int tazas = sc.nextInt();
                        System.out.println("Dandole un valor numérico a cada dia de la semana siendo 1 el lunes y 7 el domingo");
                        System.out.println("¿Que dia es hoy?");
                        int dia = sc.nextInt();

                        boolean entreSemana = (1 <= dia && dia <= 5);
                        boolean finDeSemana = (6 == dia || 7 == dia);

                        if (entreSemana) {
                            if (10 <= tazas && tazas <= 20) {
                                System.out.println("La fiesta tendra exito");
                            } else {
                                System.out.println("La fiesta no tendrá exito");
                            }
                        } else if (finDeSemana) {
                            if (15 <= tazas && tazas <= 25) {
                                System.out.println("La fiesta tendrá éxito");
                            } else {
                                System.out.println("La fiesta no tendrá exito");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("¿Que nota tiene el alumno del 1 al 10?");
                        int nota = sc.nextInt();
                        if (0 <= nota && nota < 3) {
                            System.out.println("MD");
                        } else if (3 <= nota && nota < 5) {
                            System.out.println("INS");
                        } else if (5 <= nota && nota < 6) {
                            System.out.println("SUF");
                        } else if (6 <= nota && nota < 7) {
                            System.out.println("B");
                        } else if (7 <= nota && nota < 9) {
                            System.out.println("N");
                        } else if (9 <= nota && nota <= 10) {
                            System.out.println("SB");
                        }
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        System.exit(0);
                }
                break;
            case 2:
                System.out.println("Introduce el número de ejercicio que quiere que resuelva");
                System.out.println("1. Lenguaje de programacion");
                System.out.println("2. Programa numero");
                System.out.println("3. Harry potter");
                System.out.println("4. Programa direccion");
                int numSwitch = sc.nextInt();
                switch (numSwitch) {
                    case 1:
                        System.out.println("¿Qué lenguaje de programacion estas estudiando?");
                        System.out.println("1. Java");
                        System.out.println("2. Kotlin");
                        System.out.println("3. Scala");
                        System.out.println("4. Python");
                        int lenguaje = sc.nextInt();
                        switch (lenguaje) {
                            case 1:
                                System.out.println("¡SI!");
                                break;
                            case 2:
                                System.out.println("¡NO!");
                                break;
                            case 3:
                                System.out.println("¡NO!");
                                break;
                            case 4:
                                System.out.println("¡NO!");
                                break;
                            default:
                                System.out.println("Número desconocido");
                        }
                        break;
                    case 2:
                        System.out.println("Escriba un número del uno al nueve:");
                        String numero = sc.nextLine();


                        switch (numero) {
                            case "Uno":
                                System.out.println("1");
                                break;
                            case "Dos":
                                System.out.println("2");
                                break;
                            case "Tres":
                                System.out.println("3");
                                break;
                            case "Cuatro":
                                System.out.println("4");
                                break;
                            case "Cinco":
                                System.out.println("5");
                                break;
                            case "Seis":
                                System.out.println("6");
                                break;
                            case "Siete":
                                System.out.println("7");
                                break;
                            case "Ocho":
                                System.out.println("8");
                                break;
                            case "Nueve":
                                System.out.println("9");
                                break;
                            default:
                                System.out.println("Número desconocido");
                        }
                        break;
                    case 3:
                        System.out.println("¡Harry Potter necesita ayuda para identificar lo que significa cada casa!");
                        System.out.println("Escriba el nombre de una casa para saber que representa:");
                        String casa = sc.nextLine();
                        switch (casa) {
                            case "gryffindor":
                                System.out.println("Valentía");
                                break;
                            case "hufflepuff":
                                System.out.println("Lealtad");
                                break;
                            case "slytherin":
                                System.out.println("Astucia");
                                break;
                            case "ravenclaw":
                                System.out.println("Intelecto");
                                break;
                            default:
                                System.out.println("No es una casa valida");
                        }
                        break;
                    case 4:
                        System.out.println("¿En que dirección quieres ir?");
                        System.out.println("Estas son tus opciones:");
                        System.out.println("1- arriba");
                        System.out.println("2- abajo");
                        System.out.println("3- izquierda");
                        System.out.println("4- derecha");
                        System.out.println("0- no mover");

                        int movimiento = sc.nextInt();
                        switch (movimiento) {
                            case 1:
                                System.out.println("Subir");
                                break;
                            case 2:
                                System.out.println("Bajar");
                                break;
                            case 3:
                                System.out.println("Mover Izquierda");
                                break;
                            case 4:
                                System.out.println("Mover derecha");
                                break;
                            case 0:
                                System.out.println("No mover");
                                break;
                            default:
                                System.out.println("¡Error!");

                        }
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        System.exit(1);
                }
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
