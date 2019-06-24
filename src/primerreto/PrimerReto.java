/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerreto;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class PrimerReto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String fecha = "24 de junio de 2019";
        String hora = "14:05";
        String medicos[] = {"Andrés Huertas", "Doralba López", "Gabriela Mejía"};

        Scanner dat = new Scanner(System.in);
        Persona p1 = new Persona();
        Persona p2;
        p2 = new Persona(15, 'f', "Andrea Jaramillo");
        Persona p3;
        p3 = new Persona(45, 'm', "Rogelio Gutiérrez", 50.0, 1.75);

        //PACIENTE #1
        System.out.println("************************************************************************************");
        System.out.println("Cordial saludo, a continuación ingrese los datos requeridos:");
        System.out.println("\n \n");
        System.out.println("Ingrese el nombre del primer paciente");
        p1.setNombre(dat.nextLine());

        System.out.println("Ingrese la edad del primer paciente");
        p1.setEdad(dat.nextInt());

        System.out.println("Ingrese el sexo del primer paciente");
        p1.setSexo(dat.next().charAt(0));
        p1.comprobarSexo(p1.getSexo());

        System.out.println("Ingrese el peso en kilos del primer paciente");
        p1.setPeso(dat.nextDouble());

        System.out.println("Ingrese la estatura en metros del primer paciente");
        p1.setAltura(dat.nextDouble());

        //PACIENTE #2
        System.out.println("************************************************************************************");
        System.out.println("Ingrese el peso en kilos del segundo paciente");
        p2.setPeso(dat.nextDouble());

        System.out.println("Ingrese la estatura en metros del segundo paciente");
        p2.setAltura(dat.nextDouble());

        
        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
        System.out.println("DIAGNÓSTICO GENERAL:");
        System.out.println(fecha + " " + hora);
        System.out.println("******************************* Paciente 1 *******************************");
        System.out.println("Paciente: " + p1.getNombre());
        System.out.println(p1.toString());
        System.out.println("Médica: " + medicos[0]);
        System.out.println(p1.calcularIMC(p1.getPeso(), p1.getAltura()));
        if (p1.esMayorDeEdad(p1.getEdad()) == true) {
            System.out.println(p1.getNombre() + " es mayor de edad \n");
        } else {
            System.out.println(p1.getNombre() + " es menor de edad \n ");
        }

        System.out.println("******************************* Paciente 2 *******************************");
        System.out.println("Paciente: " + p2.getNombre());
        System.out.println(p2.toString());
        System.out.println("Médico:" + medicos[1]);
        System.out.println(p2.calcularIMC(p2.getPeso(), p2.getAltura()));
        if (p2.esMayorDeEdad(p2.getEdad()) == true) {
            System.out.println(p2.getNombre() + " es mayor de edad \n");
        } else {
            System.out.println(p2.getNombre() + " es menor de edad\n");
        }

        System.out.println("******************************* Paciente 3 *******************************");
        System.out.println("Paciente: " + p3.getNombre());
        System.out.println(p3.toString());
        System.out.println("Médica: " + medicos[2]);
        System.out.println(p3.calcularIMC(p3.getPeso(), p3.getAltura()));
        if (p3.esMayorDeEdad(p3.getEdad()) == true) {
            System.out.println(p3.getNombre() + " es mayor de edad \n");
        } else {
            System.out.println(p3.getNombre() + " es menor de edad \n");
        }

    }

}
