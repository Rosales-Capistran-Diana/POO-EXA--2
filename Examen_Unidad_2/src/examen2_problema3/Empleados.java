/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_problema3;

/**
 *
 * @author 52614
 */
public abstract class Empleados {
      private int id;
    private String nombre;
    private double salario;
//CONSTRUCTOR
    public Empleados() {
    }

    public Empleados(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
//GETTER AND SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();
}

// INTERFAZ ELEGIBLEPARABONO
 interface ElegibleParaBono {
    double calcularBono();
}

// CLASE DE EMPLEADOTCOMPLETO
 class EmpleadoTCompleto extends Empleados {
    public EmpleadoTCompleto() {
    }

    public EmpleadoTCompleto(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }
}

// CLASETPARCIAL
 class EmpleadoTParcial extends Empleados {
    private double pagoPorHora;
    private int horasTrabajadas;

    public EmpleadoTParcial() {
    }

    public EmpleadoTParcial(int id, String nombre, double salario, double pagoPorHora, int horasTrabajadas) {
        super(id, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getPagoPorHora() * getHorasTrabajadas();
    }
}

// CLASE ADMINISTRADORC
 class Administrador extends EmpleadoTCompleto implements ElegibleParaBono {
    private double porcentajeDelBono;

    public Administrador() {
    }

    public Administrador(int id, String nombre, double salario, double porcentajeDelBono) {
        super(id, nombre, salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }

    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }

    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
    }

    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();
        return salario + calcularBono();
    }

    @Override
    public double calcularBono() {
        return getSalario() * (getPorcentajeDelBono() / 100);
    }
}