package problema1terreno;
import Terreno.terreno;
import java.util.Scanner;
public class ejecutar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double largo, ancho, vMetro, area, costoTerreno;
        System.out.println("Datos de Terreno");
        System.out.println("Ingrese el largo del terreno");
        largo=tcl.nextDouble();
        System.out.println("Ingrese el ancho del terreno");
        ancho=tcl.nextDouble();
        System.out.println("Ingrese el valor por metro cuadrado del terreno");
        vMetro=tcl.nextDouble();
        
        terreno TerrenoUno=new terreno();
        
        TerrenoUno.setLargo(largo);
        TerrenoUno.setAncho(ancho);
        TerrenoUno.setValorMetroCuadrado(vMetro);
        TerrenoUno.CalculoArea();
        TerrenoUno.CalculoCosto();
        
        System.out.println("Largo del Terreno: " + TerrenoUno.getLargo());
        System.out.println("Ancho del Terreno: "+ TerrenoUno.getAncho());
        System.out.println("Valor por metro cuadrado: "+TerrenoUno.getValorMetroCuadrado());
        System.out.println("--------------------------------");
        System.out.println("Area del terreno: " + TerrenoUno.getArea());
        System.out.println("Costo del terreno: " +TerrenoUno.getCostoTerreno());   
    
    }
    
}
