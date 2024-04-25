
package dispositivoselectronicos;

public class dispositivos {
    public dispositivos(String sistema, double tamañop, double costoi, double iva, String direccion, String imei) {
        this.sistema = sistema;
        this.tamañop = tamañop;
        this.costoi = costoi;
        this.iva = iva;
        this.direccion = direccion;
        this.imei = imei;
    
    }
    public double calcularCostoFinal() {
        double ivaf = costoi * (iva / 100);
        return costoi + ivaf;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public double getTamañop() {
        return tamañop;
    }

    public void setTamañop(double tamañop) {
        this.tamañop = tamañop;
    }

    public double getCostoi() {
        return costoi;
    }

    public void setCostoi(double costoi) {
        this.costoi = costoi;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
    private String sistema;
    private double tamañop;
    private double costoi;
    private double iva;
    private String direccion;
    private String imei;
    
}
