
package practica3u4.pkg5;

/**
 *
 * @author Jazzy :) (❁´◡`❁)
 */
public class Practica3U45 {

  public static double[] CalEstudiantes(double[][] calificaciones) {
        double[] PromEstud = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            double sumaCalificaciones = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            PromEstud[i] = sumaCalificaciones / calificaciones[i].length;
        }
        return PromEstud;
        
       
    }
    public static double[] calmaterias(double[][] calificaciones) {
        double[] PromMateria = new double[calificaciones[0].length];
        for (int j = 0; j < calificaciones[0].length; j++) {
            double sumaCalificaciones = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            PromMateria[j] = sumaCalificaciones / calificaciones.length;
        }
        return PromMateria;
        
        
    }
    public static void main(String[] args) {double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };
     int[][] Alumnos = new int [3][];
        Alumnos[0] = new int[1];
        Alumnos[1] = new int[2];
        Alumnos[2] = new int[3];
        
        int[][] Materias = new int [4][];
        Materias[0] = new int[1];
        Materias[1] = new int[2];
        Materias[2] = new int[3];
        Materias[3] = new int[4];
        System.out.println("Total de Alumnos: ");
        System.out.println(Alumnos.length);
        System.out.println("Total de Materias: ");
        System.out.println(Materias.length);
        
        double[] promediosEstudiantes = CalEstudiantes(calificaciones);
        System.out.println("Promedios de estudiantes:");
        for (int i = 0; i < promediosEstudiantes.length; i++) {
            System.out.println("Estudiante " + i + ": " + promediosEstudiantes[i]);
        }
        double[] promediosMaterias = calmaterias(calificaciones);
        System.out.println("Promedios por materia:");
        for (int i = 0; i < promediosMaterias.length; i++) {
            System.out.println("Materia " + i + ": " + promediosMaterias[i]);
            
       
        }
    }
}