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
public class Persona {

    private int id;
    private int edad = 0;
    private char sexo = 'M';
    private String nombre = "";
    private double peso = 0;
    private double altura = 0;

    public Persona() {

        Codigo ps = new Codigo();
        for (int i = 1; i <= 8; i++) {
            this.id = this.id + ps.generarPassword();
        }

    }

    public Persona(int edad, char sexo, String nombre) {

        Codigo ps = new Codigo();
        for (int i = 1; i <= 8; i++) {
            this.id = this.id + ps.generarPassword();
        }
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    public Persona(int edad, char sexo, String nombre, double peso, double altura) {
        Codigo ps = new Codigo();
        for (int i = 1; i <= 8; i++) {
            this.id = this.id + ps.generarPassword();
        }
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;

        this.peso = peso;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getId() {
        return id;
    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {

        if (sexo == 'm' || sexo == 'M') {
            sexo = '-';
        }
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String calcularIMC(double peso, double altura) {

        double calculo = (peso / (altura * altura));
        String resultado = "";

        if (calculo > 16.0 && calculo <= 18.4) {
            resultado = "El IMC (índice de masa corporal) del paciente está por debajo de lo normal. Se recomienda iniciar una dieta balanceada, acompañada de la asesoría de un nutricionista.";
        }

        if (calculo > 18.5 && calculo <= 24.9) {
            resultado = "El IMC (índice de masa corporal) del paciente está en el rango normal y saludable. Se recomienda continuar con una dieta balanceada, acompañada de actividad física frecuente.";
        }

        if (calculo >= 25.0) {
            resultado = "El IMC (índice de masa corporal) del paciente está por encima de lo normal. Se recomienda iniciar un plan de actividad física, acompañado de una dieta balanceada y la asesoría de un nutricionista.";
        }

        return resultado;

    }

    public boolean esMayorDeEdad(int edad) {

        boolean esMayor = true;

        if (edad >= 18) {
            return esMayor;

        } else {
            esMayor = false;
        }

        return esMayor;
    }

    public void comprobarSexo(char sexo) {

        if (sexo == 'f' || sexo == 'F') {

            this.sexo = sexo;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (sexo == 'm' || sexo == 'M') {
            sexo = '-';
        }
        return "Persona{" + "id= " + id + ", edad= " + edad + ", sexo= " + sexo + ", nombre= " + nombre + ", peso= " + peso + ", altura= " + altura + '}';
    }

}
