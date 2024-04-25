
package Terreno;

public class terreno {
    public double costoTerreno;
    public double ancho;
    public double largo;
    public double area;
    public double valorMetroCuadrado;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    
    public double getArea() {
        return area;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }
    
    public void CalculoArea() {
        area=largo*ancho;
    }

    public void CalculoCosto() {
        costoTerreno=valorMetroCuadrado*(largo*ancho);
    }
    
}
