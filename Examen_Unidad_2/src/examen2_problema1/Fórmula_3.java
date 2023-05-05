/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_problema1;

/**
 *
 * @author 52614
 */
public class Fórmula_3 extends Movimiento {
   /*
    Formula #3 a utilizar:
    d = (vf - vi)/2 x a 
    */ 
        public Fórmula_3 (double vI, double vF, double a, double t){
        super(vI, vF, a, t);
    }
    @Override
    public double CalcularDistancia() {
    double d = (getVelocidadFinal() - getVelocidadInicial())/ (2 * getAceleracion());
    return d;
    }

}
