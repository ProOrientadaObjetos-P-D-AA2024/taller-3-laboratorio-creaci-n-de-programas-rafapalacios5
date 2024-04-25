
package institucioneseducativas;

public class Ejecutar {
    private String nom;
    private String tipo;
    private int docentes;
    private int sedes;
    private int alumn;
    private double gestudiante;
    
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = alumn*gestudiante;
    }
    double presupuesto;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDocentes() {
        return docentes;
    }

    public void setDocentes(int docentes) {
        this.docentes = docentes;
    }

    public int getSedes() {
        return sedes;
    }

    public void setSedes(int sedes) {
        this.sedes = sedes;
    }

    public int getAlumn() {
        return alumn;
    }

    public void setAlumn(int alumn) {
        this.alumn = alumn;
    }

    public double getGestudiante() {
        return gestudiante;
    }

    public void setGestudiante(double gestudiante) {
        this.gestudiante = gestudiante;
    }
    
}
