package Instituciones;
import institucioneseducativas.Ejecutar;
import institucioneseducativas.Ejecutar;
import java.util.Scanner;
public class InstitucionesEducativas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         // 1. variables
        String nom="San Gerardo ";
        String tipo="Privada";
        int docentes=40;
        int sedes=2;
        int alumn=100;
        double gestudiante=12;
        double presupuesto=0;
        
        //2. Pedir datos 
        System.out.println("------------------");
        System.out.println("Datos de la Institucion");
        System.out.println("------------------------");
        
        // calculo de presupuesto
        
        //crear el objeto
        Ejecutar institucionUno=new Ejecutar();
        
        //4. setear 
        institucionUno.setNom(nom);
        institucionUno.setTipo(tipo);
        institucionUno.setSedes(sedes);
        institucionUno.setDocentes(docentes);
        institucionUno.setAlumn(alumn);
        institucionUno.setGestudiante(gestudiante);
        institucionUno.setPresupuesto(presupuesto);
        
        //5. imprimir resultados
        System.out.println("La Institucion "+institucionUno.getNom()+ " de tipo " +institucionUno.getTipo());
        System.out.println("que tiene " +institucionUno.getSedes()+ " sedes. Cuenta con " +institucionUno.getDocentes()+ " Docentes y " + institucionUno.getAlumn()+ " Alumnos. " );
        System.out.println( institucionUno.getGestudiante() + " Es el presupuesto proyectado por estudiante ");
        System.out.println(" y el presupuesto que tiene esta institucion es de " +institucionUno.getPresupuesto());
    }   
}
