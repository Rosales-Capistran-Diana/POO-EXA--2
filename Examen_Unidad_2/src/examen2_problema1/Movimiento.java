/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_problema1;

/**
 *
 * @author 52614
 */
//Clase implementando la interfaz captura.
public abstract class Movimiento implements Captura {

//Atributos solicitados: 
    private double velocidadInicial;
    private double velocidadFinal;
    private double aceleracion;
    private double tiempo;
    private double distancia;

//Constructor default.
    public Movimiento() {
        this.velocidadInicial = 0;
        this.velocidadFinal = 0;
        this.aceleracion = 1;
        this.tiempo = 0;
    }

//Constructor con parámetros.
    public Movimiento(double vI, double vF, double a, double t) {
        this.velocidadInicial = vI;
        this.velocidadFinal = vF;
        this.aceleracion = a;
        this.tiempo = t;
    }

//Se implementan los métodos de la interfaz Captura:     
    @Override
    public void setVelocidadInicial(double velocidadInicial) {
    }

    @Override
    public double getVelocidadInicial() {
        return 0;
    }

    @Override
    public void setVelocidadFinal(double velocidadFinal) {
    }

    @Override
    public double getVelocidadFinal() {
        return 0;
    }

    @Override
    public void setAceleracion(double aceleracion) {
    }

    @Override
    public double getAceleracion() {
        return 0;
    }

    @Override
    public void setTiempo(double tiempo) {
    }

    @Override
    public double getTiempo() {
        return 0;
    }

    public abstract double CalcularDistancia();
}
