package modelo;

public class Usuario {

    public int id_usuario;
    public String nombre1, nombre2;
    public String apPaterno, apMaterno;
    public String user;
    public String pass;
    public int rol;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre1, String nombre2, String apPaterno, String apMaterno, String user, String pass, int rol) {
        this.id_usuario = id_usuario;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.user = user;
        this.pass = pass;
        this.rol = rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

}
