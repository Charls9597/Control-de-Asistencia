package modelo;

public class Periodo {
    public int id_periodo;
    public String descripcion;

    public Periodo() {
    }

    public Periodo(int id_periodo, String descripcion) {
        this.id_periodo = id_periodo;
        this.descripcion = descripcion;
    }

    public int getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(int id_periodo) {
        this.id_periodo = id_periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
