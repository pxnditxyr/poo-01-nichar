
import java.util.Scanner;

public class Deporte {
  public String nombre;
  public int creacion;
  public String record;

  public Deporte( String nombre, int creacion, String record ) {
    this.nombre = nombre;
    this.creacion = creacion;
    this.Record = record;
  }
}

public class DeporteDeDestreza extends Deporte {
  public String herramienta;
  public String marca_herrami;

  DeporteDeDestreza ( String nombre, int creacion, String record, String herramienta, String marca_herrami ) {
    super( nombre, creacion, record );
    this.herramienta = herramienta;
    this.marca_herrami = marca_herrami;
  }


}

public class DeporteDeEstrategia extends Deporte {
  public int nroParticipante;
  public String grado_conocimiento;

  DeporteDeEstrategia ( String nombre, int creacion, String record, int nroParticipante, String grado_conocimiento ) {
    super( nombre, creacion, record );
    this.nroParticipante = nroParticipante;
    this.grado_conocimiento = grado_conocimiento;
  }
}

public class DeporteDeResistencia extends Deporte {
  public String recorrido; 
  public String nro_part_equip;
  DeporteDeResistencia ( String nombre, int creacion, String record, String recorrido, String nro_part_equip ) {
    super( nombre, creacion, record );
    this.recorrido = recorrido;
    this.nro_part_equip = nro_part_equip;
  }
}

public class Main {
  public static void main () {
    Scanner sc = new Scanner(System.in);

    System.out.println( "Ingrese el nombre del deporte de destreza" );
    String nombre = sc.nextLine();
    System.out.println( "Ingrese el año de creacion del deporte de destreza" );
    int creacion = sc.nextInt();
    System.out.println( "Ingrese el record del deporte de destreza" );
    String record = sc.nextLine();
    System.out.println( "Ingrese la herramienta del deporte de destreza" );
    String herramienta = sc.nextLine();
    System.out.println( "Ingrese la marca de la herramienta del deporte de destreza" );
    String marca_herrami = sc.nextLine();
    DeporteDeDestreza deporteDestreza = new DeporteDeDestreza( nombre, creacion, record, herramienta, marca_herrami );

    System.out.println( "Ingrese el nombre del deporte de estrategia" );
    nombre = sc.nextLine();
    System.out.println( "Ingrese el año de creacion del deporte de estrategia" );
    creacion = sc.nextInt();
    System.out.println( "Ingrese el record del deporte de estrategia" );
    record = sc.nextLine();
    System.out.println( "Ingrese el numero de participantes del deporte de estrategia" );
    int nroParticipante = sc.nextInt();
    System.out.println( "Ingrese el grado de conocimiento del deporte de estrategia" );
    String grado_conocimiento = sc.nextLine();
    DeporteDeEstrategia deporteEstrategia = new DeporteDeEstrategia( nombre, creacion, record, nroParticipante, grado_conocimiento );

    System.out.println( "Ingrese el nombre del deporte de resistencia" );
    nombre = sc.nextLine();
    System.out.println( "Ingrese el año de creacion del deporte de resistencia" );
    creacion = sc.nextInt();
    System.out.println( "Ingrese el record del deporte de resistencia" );
    record = sc.nextLine();
    System.out.println( "Ingrese el recorrido del deporte de resistencia" );
    String recorrido = sc.nextLine();
    System.out.println( "Ingrese el numero de participantes por equipo del deporte de resistencia" );
    String nro_part_equip = sc.nextLine();
    DeporteDeResistencia deporteResistencia = new DeporteDeResistencia( nombre, creacion, record, recorrido, nro_part_equip );

    if ( deporteDestreza.creacion == deporteEstrategia.creacion ) {
      System.out.println( "Los deportes de destreza y de estrategia tienen el mismo anio de creacion" );
    } else if ( deporteDestreza.creacion == deporteResistencia.creacion ) {
      System.out.println( "Los deportes de destreza y de resistencia tienen el mismo anio de creacion" );
    } else if ( deporteEstrategia.creacion == deporteResistencia.creacion ) {
      System.out.println( "Los deportes de estrategia y de resistencia tienen el mismo anio de creacion" );
    } else {
      System.out.println( "Los deportes tienen diferentes anios de creacion" );
    }

    DeporteDeDestreza deporteDestreza2 = new DeporteDeDestreza( "Futbol", 1863, "Ninguno", "Balon", "Nike" );
    DeporteDeDestreza deporteDestreza3 = new DeporteDeDestreza( "Triatlon", 1974, "Ninguno", "Bicicleta", "Cannondale" );

    if ( deporteDestreza2.marca_herrami == deporteDestreza3.marca_herrami ) {
      System.out.println( "Las herramientas de los deportes de destreza 2 y 3 tienen la misma marca" );
    } else if ( deporteDestreza.marca_herrami == deporteDestreza3.marca_herrami ) {
      System.out.println( "Las herramientas de los deportes de destreza 1 y 3 tienen la misma marca" );
    } else if ( deporteDestreza.marca_herrami == deporteDestreza2.marca_herrami ) {
      System.out.println( "Las herramientas de los deportes de destreza 1 y 2 tienen la misma marca" );
    } else {
      System.out.println( "Las herramientas de los deportes de destreza tienen diferentes marcas" );
    }

    DeporteDeEstrategia deporteEstrategia2 = new DeporteDeEstrategia( "Ajedrez", 1560, "Ninguno", 2, "Medio" );
    DeporteDeEstrategia deporteEstrategia3 = new DeporteDeEstrategia( "Poker", 1829, "Ninguno", 2, "Alto" );
  }
}
