/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg351.diegolucasromero.ejercicio7;

/**
 *
 * @author Diego Lucas Romero
 */
public class Rectangulo {
    private double base=100;
    private double altura=50;
    
    
    public Rectangulo(double b, double a){
        this.base=b;
        this.altura=a;
    }

    Rectangulo() {
        
    }
    
    public void setBase(double base){
        this.base=base;
        
    }
    public void setAltura(double altura){
         this.altura=altura;
        
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
        
    }
    public double getArea(){
        return base*altura;
    }
    public double getPerimetro(){
        return 2*base+2*altura;
    }
    public void cuadrar(){
        altura=base;
    }
    
    
}
