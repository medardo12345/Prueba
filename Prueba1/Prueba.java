/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author DELL
 */
public class Prueba {
public static void Sumar(int a, int b){
    int c;
            
    c=a+b;
    
    System.out.println("el resultado es:"+c);
}

public static int Restar(int a, int b){
    int c;
    c=a-b;
    return c;
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Sumar(15,20);
        int resta=Restar(36,25);
        Sumar(1,2);
       
      
    
      
        System.out.println("Es resultado es:"+resta);// TODO code application logic here
    }
    
}
