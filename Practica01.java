
package Practica1;

import java.util.Scanner;
public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Momento Inicial:");
        System.out.println("================");
        System.out.println("Introduce la hora:");
        int num1 = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int num2 = sc.nextInt();
        System.out.println("Introduce los segundos:");
        int num3 = sc.nextInt();
        System.out.println("Momento Final:");
        System.out.println("================");
        System.out.println("Introduce la hora:");
        int num4 = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int num5 = sc.nextInt();
        System.out.println("Introduce los segundos:");
        int num6 = sc.nextInt();
        System.out.println("Datos introducidos: momento inicial: "+num1+":"+num2+":"+num3+"    "+"momento final: "+num4+":"+num5+":"+num6);
        int finalSegundos = (num4*3600)+(num5*60)+num6;
        int inicialSegundos = (num1*3600)+(num2*60)+num3;
        int diferenciaSegundos = finalSegundos - inicialSegundos;
        int finalHora = diferenciaSegundos / 3600;
        int cocienteHoras = diferenciaSegundos % 3600;
        int finalMinutos =  cocienteHoras / 60;
        int FinalSegundos = cocienteHoras % 60;


        System.out.println("La diferencia entre ambos momentos es: "+finalHora+":"+finalMinutos+":"+FinalSegundos);
    }
}

