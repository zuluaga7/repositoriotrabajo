package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        String nombreCliente;
        String apellidosCliente;
        String cedulaCliente;
        String ciudadCliente;
        int edadCliente;
        long numeroDeBoletas;

        System.out.println("Empresa 'z");
        System.out.println("************");

        System.out.print("digite su nombre: ");
        nombreCliente=teclado.nextLine();

        System.out.print("digite su apellido: ");
        apellidosCliente=teclado.nextLine();

        System.out.print("digite su cedula: ");
        cedulaCliente=teclado.nextLine();

        System.out.print("digite su edad: ");
        edadCliente=teclado.nextInt();

        System.out.print("digite su ciudad: ");
        ciudadCliente=teclado.nextLine();

        System.out.print("digite el numero de boletas: ");
        numeroDeBoletas=teclado.nextLong();

        Integer valorBoleta=450000;
        double valortotal=(valorBoleta*numeroDeBoletas);

        if (edadCliente>=18 && numeroDeBoletas<=4)  {
            System.out.println("puede comprar" +"cliente: "+nombreCliente);
        }else{
            System.out.println("no puede comprar");
        }

        System.out.println("el costo total es: $"+valortotal);







    }
}