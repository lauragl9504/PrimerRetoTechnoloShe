/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerreto;

/**
 *
 * @author andre
 */
import java.util.Random;
import java.util.Scanner;

public class Password {

//    public static void main(String[] args) {
//        password longitud = new password(8);
//        int indice = longitud.Longitud;
//        int esFuerte = 0;
//        Scanner dat = new Scanner(System.in);
//        
//
//        for (int i = 1; i <= indice; i++) {
//            System.out.print(password.generarPassword());
//            password.GetSeguridadContraseÃ±a();
//        }
//        
//        
//        System.out.println("Ingrese su nombre");
//        
//        
//        
//        System.out.println("Ingrese su edad");
//        
//        System.out.println("Ingrese su sexo");
//        
//        System.out.println("Ingrese su peso en kilos");
//        
//        System.out.println("Ingrese su altura en centímetros");
//        
//        
//        System.out.println(password.esFuerte());
//
//    }

    protected static int Longitud;
    private static char GetAscii;
    private static int NumAleatorio;
    private static int esFuerte;
    private static int Minuscula = 0;
    private static int mayuscula = 0;
    private static int Numeros = 0;
    
    

    public Password() {
        this.Longitud = 8;
    }

    public Password(int longitud) {
        this.Longitud = longitud;
    }

    public char generarPassword() {
        GetAscii = 'A';
        for (int i = 1; i <= Longitud; i++) {

            NumAleatorio = 32 + (int) (Math.random() * 92);
            GetAscii = (char) NumAleatorio;
            if (i == Longitud) {
                return GetAscii;
            }

        }
        return GetAscii;
    }

    public void GetSeguridadContrasea() {

        if (NumAleatorio >= 65 && NumAleatorio <= 90) {
            mayuscula++;
        }
        if (NumAleatorio >= 97 && NumAleatorio <= 122) {
            Minuscula++;
        }

        if (NumAleatorio >= 48 && NumAleatorio <= 57) {
            Numeros++;
        }

    }

    public static String esFuerte() {

        if (Minuscula > 1 && mayuscula > 2 && Numeros > 5) {
            return "La contraseÃ±a es Segura!";
        } else {
            return "la contraseÃ±a es DÃ©bil!!";
        }

    }

    
    
    
}
