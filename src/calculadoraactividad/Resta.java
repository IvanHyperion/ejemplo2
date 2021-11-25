/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraactividad;

public class Resta extends Operacion{
    
    double resta;
    double n=9;   
    public Resta(double n1, double n2) {
             
        super(n1, n2, '-');
        this.resta = n1 - n2;
        this.setRes(this.resta);
    } 
}