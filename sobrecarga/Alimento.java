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

    for ( int i = 0; i < fValle.nutrientes.length; i++ ) {
      if ( fValle.nutrientes[ i ].equals( nutriente ) ) {
        System.out.println( "El nutriente " + nutriente + " se encuentra en " + fValle.nombre );
      }
    }
    for ( int i = 0; i < fTropicalt.nutrientes.length; i++ ) {
      if ( fTropical.nutrientes[ i ].equals( nutriente ) ) {
        System.out.println( "El nutriente " + nutriente + " se encuentra en " + fTropical.nombre );
      }
    }
    // c)
    fValle.nutriente[ 0 ] = null;
    fTropical.nutriente[ 0 ] = null;
    for ( int i = 1; i < fValle.nutrientes.length; i++ ) {
      fValle.nutrientes[ i - 1 ] = fValle.nutrientes[ i ];
    }
    for ( int i = 1; i < fTropical.nutrientes.length; i++ ) {
      fTropical.nutrientes[ i - 1 ] = fTropical.nutrientes[ i ];
    }

    for ( int i = 0; i < fValle.nutrientes.length; i++ ) {
      System.out.println( fValle.nutrientes[ i ] );
    }
  }
}
