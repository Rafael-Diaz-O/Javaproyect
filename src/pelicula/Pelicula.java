package pelicula;

import java.util.Scanner; 

public class Pelicula {
    
    
    public static void datos (String genero,String nombre, int año,
            double timepo,String idioma){

        Busqueda Usuario1 = new Busqueda();
        
        Usuario1.setGeneroPeli(genero);
        Usuario1.setNombredePeli(nombre);
        Usuario1.setAñoPublicacion(año);
        Usuario1.setTiempoduracion(timepo);
        Usuario1.setIdiomaPeli(idioma);
        
        
        
        
    }

    
    public static void main(String[] args) {
        
        
        String genero, nombre,idioma;
        int año;
        double tiempo; 
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Si no sabe o no se acuerda la respuesta escribir 'no se' ");
        
        System.out.print("Cual es el genero de la pelicula: ");
        genero = teclado.nextLine(); 
        
        System.out.println("Cual es el nombre de la pelicula: ");
        nombre = teclado.nextLine(); 
        
        System.out.print("En que año se publico la pelicula: ");
        año = teclado.nextInt();
        
        System.out.println("Cuanto dura la pelicula en minutos: ");
        tiempo = teclado.nextDouble(); 
        
        System.out.println("Cual es el idioma original de la pelicula: ");
        idioma = teclado.nextLine(); 
        
        datos (genero,nombre,año,tiempo,idioma);
      /*  String pelicula; 
        
        Scanner teclado = new Scanner (System.in); 
        
        
        pelicula = teclado.nextLine(); 

        
        Busqueda Usuario1 = new Busqueda(); 
        Usuario1.setGeneroPeli(pelicula); */
      
      
       
        
        
        
        
    }
    
}
