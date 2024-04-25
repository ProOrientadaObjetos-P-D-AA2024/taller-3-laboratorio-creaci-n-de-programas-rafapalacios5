//1 hora = 60 minutos
//1 hora = 3600 segundos
//1 día = 24 horas
package EquivalenteHora;

public class EquivalenteHora {
    
    public double horas;
    public double minutos;
    public double segundos;
    public double dias;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public double getMinutos() {
        return minutos;
    }
    
    public double getSegundos() {
        return segundos;
    }

    public double getDias() {
        return dias;
    }
    
    public void CalculoMinutos() {
        minutos=horas*60;
    }

    public void CalculoSegundos() {
        segundos=horas*3600;
    }

    public void caluloDias() {
        dias=horas/24;
    }
    
}
