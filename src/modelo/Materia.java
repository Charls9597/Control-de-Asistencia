package modelo;

public class Materia {
   public int id_materia;
   public String nombre;

    public Materia() {
    }

    public Materia(int id_materia, String nombre) {
        this.id_materia = id_materia;
        this.nombre = nombre;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
