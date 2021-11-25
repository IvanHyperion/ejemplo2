/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraactividad;

public class Multiplicacion extends Operacion{
    
    double multi;
       
    public Multiplicacion(double n1, double n2) {
             
        super(n1, n2, '*');
        this.multi = n1 * n2;
        this.setRes(this.multi);
    }
}
 
