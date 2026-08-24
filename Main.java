/**
Para compilar ejecute el compilador digitando en la terminal el siguiente comando:
   javac Main.javac
Para ejecutar digite el siguiente comando:
   java Main
**/

public class Main {
  public static void main( String argv[] ){
     Perro perro = new Perro("Jack"); // Crea una instancia de la clase Perro
	 Perro perra = new Perro("Lulu"); // Crea otra instancia de la clase Perro
	 Perro miperro = new Perro("Bonny"); // Se agrega el nombre del primer perro que tuve
	 
	 System.out.println("Mi mascota consentida se llama: "+perra.getNombre());
	 System.out.println("Mi otra mascota se llama: "+perro.getNombre());
	 System.out.println("El nombre de mi mascota es "+ miperro.getNombre());
  
     System.exit(0);
  }

}