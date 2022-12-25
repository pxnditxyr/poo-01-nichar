import java.util.Scanner;

// a)
public class Alimento {
  public String nombre;
  public String lugar;
  public int nroNutrientes;
  public String[] nutrientes = new String[ 50 ];
  public Alimento(String nombre, String lugar, int nroNutrientes, String[] nutrientes) {
    this.nombre = nombre;
    this.lugar = lugar;
    this.nroNutrientes = nroNutrientes;
    this.nutrientes = nutrientes;
  }

  
}

public class Fruta extends Alimento {
  public Fruta( String nombre, String lugar, int nroNutrientes, String[] nutrientes ) {
    super( nombre, lugar, nroNutrientes, nutrientes );
  }
}

public class FValle extends Fruta {
  public FValle( String nombre, String lugar, int nroNutrientes, String[] nutrientes ) {
    super( nombre, lugar, nroNutrientes, nutrientes );
  }
}

public class FTropical extends Fruta {
  public FTropical( String nombre, String lugar, int nroNutrientes, String[] nutrientes ) {
    super( nombre, lugar, nroNutrientes, nutrientes );
  }
}
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    String[] nutrientes = { "Vitamina A", "Vitamina B", "Vitamina C" };
    FValle fValle = new FValle( "Manzana", "Valle", 3, nutrientes );
    FTropical fTropical = new FTropical( "Papaya", "Tropical", 3, nutrientes );
    // b)
    System.out.println( "Ingrese el nutriente a buscar: " );
    String nutriente = sc.nextLine();
    if( fValle.nutrientes.contains( nutriente ) ) {
      System.out.println( "La fruta " + fValle.getNombre() + " tiene el nutriente " + nutriente );
    }

    if( fTropical.nutrientes.contains( nutriente ) ) {
      System.out.println( "La fruta " + fTropical.getNombre() + " tiene el nutriente " + nutriente );
    }
    // c)
    fValle.nutrientes.remove( 0 );
    fTropical.nutrientes.remove( 0 );
  }
}
