package caracteristicasDispositivos;
import dispositivoselectronicos.dispositivos;
public class DispositivosElectronicos {

    public static void main(String[] args) {
        dispositivos obj = new dispositivos("iphone", 6.69, 1349, 16, "F0:C7:25:51:B5:D4", 
                                      "35 616357 325830 4");
        
        double costoFinal = obj.calcularCostoFinal();
        
        System.out.println("CARACTERISTICAS DEL DISPOSITIVO");
        System.out.println("-------------------------------");
        System.out.println("Sistema operativo: " + obj.getSistema());
        System.out.println("Tamaño de pantalla: " + obj.getTamañop());
        System.out.println("Costo inicial: " + obj.getCostoi());
        System.out.println("Porcentaje de IVA: " + obj.getIva());
        System.out.println("Direccion MAC: " + obj.getDireccion());
        System.out.println("Informacion IMEI: " + obj.getImei());
        System.out.println("Precio Final del dispositivo: " + obj.calcularCostoFinal());
    }
    
}
