package modelo;

public class Estudiante {
    public int id_estudiante;
    public String nombre1,nombre2,apPaterno,apMaterno,telefono,direccion;

    public Estudiante() {
    }

    public Estudiante(int id_estudiante, String nombre1, String nombre2, String apPaterno, String apMaterno, String telefono, String direccion) {
        this.id_estudiante = id_estudiante;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
