/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_problema2;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class examen2_problema2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        Manufactura manufactura = new Manufactura();
        Apoyo apoyo = new Apoyo();
        Jefe jefe = new Jefe();

        capturarDatosEmpleado(manufactura, scanner);
        capturarDatosEmpleado(apoyo, scanner);
        capturarDatosEmpleado(jefe, scanner);

        System.out.println("Salarios:");
        System.out.println("Manufactura: $" + manufactura.calcularSalario(40));
        System.out.println("Apoyo: $" + apoyo.calcularSalario(40));
        System.out.println("Jefe: $" + jefe.calcularSalario());
    }

    public static void capturarDatosEmpleado(Empleado empleado, Scanner scanner) {
        System.out.println("Capturando datos para " + empleado.getClass().getSimpleName() + ":");
        System.out.print("Nombre: ");
        empleado.setNombre(scanner.nextLine());
        System.out.print("Apellido: ");
        empleado.setApellido(scanner.nextLine());
        System.out.print("Edad: ");
        empleado.setEdad(scanner.nextInt());
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Salario base: ");
        empleado.setSalarioBase(scanner.nextDouble());
        scanner.nextLine(); // Consumir el salto de línea
    }
}


// Interfaz para capturar y obtener atributos de Empleado
interface Capturando {
    void setNombre(String nombre);
    void setApellido(String apellido);
    void setEdad(int edad);
    void setSalarioBase(double salarioBase);
    String getNombre();
    String getApellido();
    int getEdad();
    double getSalarioBase();
}

// Clase abstracta Empleado que implementa la interfaz Capturando
abstract class Empleado implements Capturando {
    private String nombre;
    private String apellido;
    private int edad;
    private double salarioBase;
    
    // Implementación de métodos de la interfaz Capturando
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
}

// Clase Manufactura que extiende de la clase abstracta Empleado
class Manufactura extends Empleado {
    // Constructores
    public Manufactura() {
        setSalarioBase(40);
    }
    public Manufactura(String nombre, String apellido, int edad, double salarioBase) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }
    
    // Método para calcular salario
    public double calcularSalario(int horasTrabajadas) {
        return horasTrabajadas * getSalarioBase();
    }
}

// Clase Apoyo que extiende de la clase abstracta Empleado
class Apoyo extends Empleado {
    // Constructores
    public Apoyo() {
        setSalarioBase(50);
    }
    public Apoyo(String nombre, String apellido, int edad, double salarioBase) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }
    
    // Método para calcular salario
    public double calcularSalario(int horasTrabajadas) {
        double salario = horasTrabajadas * getSalarioBase();
        double compensacion = salario * 0.5;
        return salario + compensacion;
    }
}

// Clase Jefe que extiende de la clase abstracta Empleado
class Jefe extends Empleado {
    // Constructores
    public Jefe() {
        setSalarioBase(5000);
    }
    public Jefe(String nombre, String apellido, int edad, double salarioBase) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }
    
    // Método para calcular salario
    public double calcularSalario() {
        return getSalarioBase();
    }
}