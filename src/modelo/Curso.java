package modelo;

public class Curso {
    public int id_curso;
    public String curso,paralelo,turno;

    public Curso() {
    }

    public Curso(int id_curso, String curso, String paralelo, String turno) {
        this.id_curso = id_curso;
        this.curso = curso;
        this.paralelo = paralelo;
        this.turno = turno;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
