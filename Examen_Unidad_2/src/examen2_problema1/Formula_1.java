/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_problema1;

/**
 *
 * @author 52614
 */
public class Formula_1 extends Movimiento {

    /* 
    Formula #1 a utilizar:
    d = (vi * t) + (a*(t*t))/2
     */

    public Formula_1(double vI, double vF, double a, double t) {
        super(vI, vF, a, t);
    }

    @Override
    public double CalcularDistancia() {
        double d = (getVelocidadInicial() * getTiempo()) + ((getAceleracion() * Math.pow(getTiempo(), getTiempo())) / 2);
        return d;
    }

}
