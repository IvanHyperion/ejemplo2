/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraactividad;

/**
 *
 * @author ivanj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 5;
        double n=0;

        //suma
        Suma sum = new Suma(n1,n2);
        sum.mostrarResultado();

        //resta
        Resta res = new Resta(n1,n2);
        res.mostrarResultado();
 
        //multiplicacion
        Multiplicacion mul = new Multiplicacion(n1,n2);
        mul.mostrarResultado();

        //division
        Division div = new Division(n1,n2);
        div.mostrarResultado();
    }
    
}
