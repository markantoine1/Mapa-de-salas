package classes;

import view.ViewProfessores;

public class Professores {
    private String nome;
    private String curso;
    private int codigoProfessor;
    private boolean turnoManha;
    private boolean turnoTarde;
    private boolean turnoNoite;
    
    private String turno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigo) {
        this.codigoProfessor = codigo;
    }

    public String getTurno() {
        return turno;
    }

    public boolean isTurnoManha() {
        return turnoManha;
    }

    public void setTurnoManha(boolean turnoManha) {
        this.turnoManha = turnoManha;
    }

    public boolean isTurnoTarde() {
        return turnoTarde;
    }

    public void setTurnoTarde(boolean turnoTarde) {
        this.turnoTarde = turnoTarde;
    }

    public boolean isTurnoNoite() {
        return turnoNoite;
    }

    public void setTurnoNoite(boolean turnoNoite) {
        this.turnoNoite = turnoNoite;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }
    
    public void definirTurno() {
        String s = "";
        if (this.isTurnoManha()){
            s += "[M] ";
        }
        if (this.isTurnoTarde()){
            s += "[T] ";
        }
        if (this.isTurnoNoite()){
            s += "[N]";
        }
        this.turno = s;
    }
    
}
