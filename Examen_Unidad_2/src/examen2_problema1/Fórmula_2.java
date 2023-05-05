/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_problema1;

/**
 *
 * @author 52614
 */
public class Fórmula_2 extends Movimiento{
   /*
    Formula #2 a utilizar:
    d = ((vi+vf)/2) * t
    */ 
        public Fórmula_2 (double vI, double vF, double a, double t){
        super(vI, vF, a, t);
    }
    @Override
    public double CalcularDistancia() {
    double d = (((getVelocidadInicial() + getVelocidadFinal()) / 2) * getTiempo());
    return d;
    }

}
