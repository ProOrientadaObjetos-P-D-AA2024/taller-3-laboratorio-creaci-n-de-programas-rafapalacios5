
package problema2horas;
import EquivalenteHora.EquivalenteHora;
import java.util.Scanner;
public class Ejecutor {

    public static void main(String[] args) {
        Scanner tcl =new Scanner(System.in);
        double horas;
        
        System.out.println("Ingrese la cantidad de horas que desea convertir");
        horas=tcl.nextDouble();
        
        EquivalenteHora HoraUno = new EquivalenteHora();
        
        HoraUno.setHoras(horas);
        HoraUno.caluloDias();
        HoraUno.CalculoMinutos();
        HoraUno.CalculoSegundos();
        
        System.out.println("Horas: "+HoraUno.getHoras());
        System.out.println("Equivalente de " + horas +" horas a dias: "+ HoraUno.getDias());
        System.out.println("Equivalente de " + horas +" horas a minutos: "+ HoraUno.getMinutos());
        System.out.println("Equivalente de " + horas +" horas a segundos: "+ HoraUno.getSegundos());
                           
    }
    
}
