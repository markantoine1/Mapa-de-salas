/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Date;

/**
 *
 * @author 886918
 */
public class Alocacoes {
    private String sala;
    private String docente;
    private String curso;
    private String turno;
    private Date data;
    private int id;
    private boolean turnoManha;
    private boolean turnoTarde;
    private boolean turnoNoite;
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getTurno() {
        return turno;
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

    public Date getData() {
        return data;
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

    public void setData(Date data) {
        this.data = data;
    }
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
