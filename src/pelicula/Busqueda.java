package pelicula;

public class Busqueda {
    
    public String  generodePelicula;
    public String NombredePelicula;
    public int añodePublicacion;
    public double Tiempodeduracion;
    public String IdiomadePelicula;
    
    
    public void  setGeneroPeli (String genero){
        this.generodePelicula  = genero ;
   }
    
   public void setNombredePeli (String nombre){
       this.NombredePelicula = nombre; 
   }
   
   public void setAñoPublicacion (int año){
       this.añodePublicacion = año; 
   }
   
   public void setTiempoduracion (double tiempo){
       this.Tiempodeduracion = tiempo;
   }
   
   public void setIdiomaPeli (String idioma ){
       this.IdiomadePelicula = idioma; 
   }
   
   public String getGenerodePelicula( ){
           
       return this.generodePelicula;  
    }
   
   public String getNombredePelicula ( ){
       return this.NombredePelicula;
   }
   
   public int getañodePublicacion (){
       return this.añodePublicacion;
   }
   
   public double getTiempodeduracion ( ){
       return this.Tiempodeduracion;
   }
   
   public String getIdiomadePelicula ( ){
       return this.IdiomadePelicula;
   }
    
}
