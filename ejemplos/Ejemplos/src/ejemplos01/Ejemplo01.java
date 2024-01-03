/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //String miCiudad = obtenerCiudadMayuscula("Loja");
        //System.out.printf("%s\n", miCiudad);
        obtenerMultiplicacion(7, 50); /*
        aqui no retornamos la información debido a que es un procedimiento
        */
        String miMensaje = obtenerMultiplicacionDos(7, 50);/*
        aqui se retorna la información debido a que es una función 
        */
        System.out.printf("%s\n",miMensaje);
    }
     public static String obtenerMultiplicacionDos(int tabla, int limite){
        int mult;
        String t = "";
        for (int i = 1; i <= limite; i++) {
            mult = tabla * i;
            t = String.format("%s %d * %d = %d\n",t,tabla,i
                    ,mult);   
        }
       return t;
    }
    
    public static String obtenerCiudadMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    
    
    public static void obtenerMultiplicacion(int tabla, int limite){
        int mult;
        String t = "";
        for (int i = 1; i <= limite; i++) {
            mult = tabla * i;
            t = String.format("%s %d * %d = %d\n",t,tabla,i
                    ,mult);   
        }
        System.out.printf("%s\n",t);
    }
    
    public static String obtenerNombre(){
        return "Luis";
    }
    
    
}
