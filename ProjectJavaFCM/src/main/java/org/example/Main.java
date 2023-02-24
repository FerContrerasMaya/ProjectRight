package org.example;
import java.util.*;
public class Main {
    //public static void main(String[] args) {

        /* System.out.println("Hello world!");
        System.out.println("Fernanda Contreras Maya");
        int mientero = 10;
        float mipuntoflotante = 0.5f;
        double midecimal = 22.5;
        String mitexto = "Hola soy un texto en java";
        char micaracter = 'a';

        Scanner  scanner = new Scanner(System.in);

        int numero;
        numero = scanner.nextInt();

        System.out.println("mi numero que acabo de ingresar es: " + numero); */

    //}
    // Desarrollar un progrmama en java que lea dos numeros, los sume y me muentre el resultado

   /* public static void main (String[] args) {

        int numero;
        int nomero;
        int suma;
        Scanner scanner = new Scanner(System.in);

        nomero = scanner.nextInt();
        numero = scanner.nextInt();
        suma = numero + nomero;
        System.out.println("La suma de estos numeros es= " + suma);
    }
*/
    //}
//Desarrollar un programa que le pida al usuario su nombre, edad, peso y altura, calcule el imc

   /* public static void main(String[] args) {

        String nombre;
        int edad;
        int peso;
        double altura;
        double imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Edad: ");
        edad = scanner.nextInt();

        System.out.println("Peso: ");
        peso = scanner.nextInt();

        System.out.println("Altura: ");
        altura = scanner.nextDouble();

        imc = peso/(altura*altura);
        System.out.println("El imc es= " + imc);

        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es:" + edad );
        System.out.println("El peso es: " + peso);
        System.out.println("La altura es:" + altura);
        System.out.println("El imc es: " +imc);
    } */

    //Desarrollar un programa que le pida al usuario su nombre, apellido, docimicilio, cuanto cotizo en 2022, cuantos impuestos va a pagar.
    //Declarar constante de isr - 12%

    /*public static void main(String[] args) {

        String nombre;
        String apellido;
        String domiclio;
        double cotizo;
        final double isr = 0.12;
        double isrUser;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Apellido: ");
        apellido = scanner.nextLine();

        System.out.println("Domicilio: ");
        domiclio = scanner.nextLine();

        System.out.println("Cotizo: ");
        cotizo = scanner.nextDouble();

        isrUser = cotizo * isr;
        System.out.println("El impuesto es = " + isrUser);

        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: M" + apellido);
        System.out.println("El domicilio es: " + domiclio);
        System.out.println("El impuesto es: " + isrUser);
        System.out.println("El isr es de: %" + isr*100);

    } */
// 1. Pedir al usuario nombre, apellido, domicilio y precio de su carro
// 2. Calcular el impuesto de tenencia que es igual a 1.3% de lo que cuesta el carro
    public static void main(String[] args) {

        String nombre;
        String apellido;
        String domicilio;
        int carro;
        final double tenencia= 0.013;
        double tenenciaUser;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Apellido: ");
        apellido= scanner.nextLine();

        System.out.println("Domicilio: ");
        domicilio = scanner.nextLine();

        System.out.println("Carro: ");
        carro = scanner.nextInt();

        tenenciaUser=carro*tenencia;

        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("El domicilio es: " + domicilio);
        System.out.println("La tenencia es: " + tenenciaUser);

    }

}