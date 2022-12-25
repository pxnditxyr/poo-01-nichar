import java.util.Scanner;

public class ProgramasTV {

  private int nroCanal;
  private String nombreCanal;
  private int nroProgramas;
  private String[] programaTipo = new String[ 100 ];
  private String[] horaInicio = new String[ 50 ];

  public ProgramasTV( int nroCanal, String nombreCanal, int nroProgramas, String[] programaTipo, String[] horaInicio ) {
    this.nroCanal = nroCanal;
    this.nombreCanal = nombreCanal;
    this.nroProgramas = nroProgramas;
    this.programaTipo = programaTipo;
    this.horaInicio = horaInicio;
  }

  public void eliminaPogramasPorTipo ( String tipo ) {
    for ( int i = 1; i < programaTipo.length; i += 2 ) {
      if ( programaTipo[ i ].equals( tipo ) ) {
        programaTipo[ i ] = null;
        horaInicio[ ( int ) Math.floor( i - 1 / 2 ) ] = null;
        nroProgramas--;
      }
    }
    // reordena el arreglo
    for ( int i = 0; i < programaTipo.length; i++ ) {
      if ( programaTipo[ i ] == null ) {
        for ( int j = i + 1; j < programaTipo.length; j++ ) {
          if ( programaTipo[ j ] != null ) {
            programaTipo[ i ] = programaTipo[ j ];
            programaTipo[ j ] = null;
            horaInicio[ i ] = horaInicio[ j ];
            horaInicio[ j ] = null;
            break;
          }
        }
      }
    }
    // y reordena el arreglo de horas
    for ( int i = 0; i < horaInicio.length; i++ ) {
      if ( horaInicio[ i ] == null ) {
        for ( int j = i + 1; j < horaInicio.length; j++ ) {
          if ( horaInicio[ j ] != null ) {
            horaInicio[ i ] = horaInicio[ j ];
            horaInicio[ j ] = null;
            break;
          }
        }
      }
    }
  }

  public void mostrar ( String tipo ) {
    System.out.println( "---------------------------------" )
    System.out.println( "Canal: " + nombreCanal );
    System.out.println( "Nro de Canal: " + nroCanal );
    System.out.println( "Nro de Programas: " + nroProgramas );

    for ( int i = 0; i < horaInicio.length; i++ ) {
      System.out.println( "\tNombre Programa: " + programaTipo[ i * 2 ] + " Tipo Programa: " + programaTipo[ i * 2 + 1 ] + " Hora Inicio: " + horaInicio[ i ] );
    }

    System.out.println( "---------------------------------" )
  }

  public void ordenarProgramasPorNombrePrograma () {
    // ordena el arreglo de programas por nombre de programa y las horas al mismo tiempo
    for ( int i = 0; i < programaTipo.length; i += 2 ) {
      for ( int j = i + 2; j < programaTipo.length; j += 2 ) {
        if ( programaTipo[ i ].compareTo( programaTipo[ j ] ) > 0 ) {
          String aux = programaTipo[ i ];
          programaTipo[ i ] = programaTipo[ j ];
          programaTipo[ j ] = aux;
          aux = horaInicio[ ( int ) Math.floor( i / 2 ) ];
          horaInicio[ ( int ) Math.floor( i / 2 ) ] = horaInicio[ ( int ) Math.floor( j / 2 ) ];
          horaInicio[ ( int ) Math.floor( j / 2 ) ] = aux;
        }
      }
    }
    
  }

  public static void main () {
    Scanner sc = new Scanner( System.in );
    int nroCanal = sc.nextInt();
    String nombreCanal = sc.nextLine();
    int nroProgramas = sc.nextInt();
    String[] programaTipo = new String[ 100 ];
    String[] horaInicio = new String[ 50 ];
    for ( int i = 0; i < nroProgramas; i++ ) {
      programaTipo[ i * 2 ] = sc.nextLine();
      programaTipo[ i * 2 + 1 ] = sc.nextLine();
      horaInicio[ i ] = sc.nextLine();
    }
    ProgramasTV canal = new ProgramasTV( nroCanal, nombreCanal, nroProgramas, programaTipo, horaInicio );
    canal.mostrar();
    // a)
    canal.ordenarProgramasPorNombrePrograma();
    canal.mostrar();
    // b)
    canal.eliminaPogramasPorTipo( "Deportes" );
    canal.mostrar();
    // c)
    ProgramasTV canal1 = new ProgramasTV( 1, "Canal 1", 5, new String[] { "Programa 1", "Deportes", "Programa 2", "Noticias", "Programa 3", "Deportes", "Programa 4", "Noticias", "Programa 5", "Deportes" }, new String[] { "12:00", "13:00", "14:00", "15:00", "16:00" } );
    ProgramasTV canal2 = new ProgramasTV( 2, "Canal 2", 5, new String[] { "Programa 1 canal 2", "Deportes", "Programa 2 canal 2", "Noticias", "Programa 3 canal 2", "Deportes", "Programa 4 canal 2", "Noticias", "Programa 5 canal 2", "Deportes" }, new String[] { "12:00", "13:00", "14:00", "15:00", "16:00" } );

    for ( int i = 0; i < canal1.horaInicio.length; i++ ) {
      for ( int j = 0; j < canal2.horaInicio.length; j++ ) {
        if ( canal1.horaInicio[ i ].equals( canal2.horaInicio[ j ] ) ) {
          System.out.println( "Programa: " + canal1.programaTipo[ i * 2 ] + " Tipo: " + canal1.programaTipo[ i * 2 + 1 ] + " Hora: " + canal1.horaInicio[ i ] );
          System.out.println( "Programa: " + canal2.programaTipo[ j * 2 ] + " Tipo: " + canal2.programaTipo[ j * 2 + 1 ] + " Hora: " + canal2.horaInicio[ j ] );
        }
      }
    }

  }


}
