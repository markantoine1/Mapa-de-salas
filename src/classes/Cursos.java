/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import view.ViewProfessores;

/**
 *
 * @author 886918
 */
public class Cursos {
    private String nome;
    private String tipoDeSala;
    private String diasRealizados;
    private String turno;
    private boolean turnoManha;
    private boolean turnoTarde;
    private boolean turnoNoite;    
    private boolean diaSeg;
    private boolean diaTer;
    private boolean diaQua;
    private boolean diaQui;
    private boolean diaSex;
    private boolean diaSab;
    
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
    public void definirDias(){
        String s = "";
        if (this.isDiaSeg()) {
            s += "[Seg]";
        }
        if (this.isDiaTer()) {
            s += "[Ter]";
        }
        if (this.isDiaQua()) {
            s += "[Qua]";
        }
        if (this.isDiaQui()) {
            s += "[Qui]";
        }
        if (this.isDiaSex()) {
            s += "[Sex]";
        }
        if (this.isDiaSab()) {
            s += "[Sab]";
        }
        this.diasRealizados = s;
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
    private int codigoCurso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeSala() {
        return tipoDeSala;
    }

    public void setTipoDeSala(String tipoDeSala) {
        this.tipoDeSala = tipoDeSala;
    }

    public String getDiasRealizados() {
        return diasRealizados;
    }

    public void setDiasRealizados(String diasRealizados) {
        this.diasRealizados = diasRealizados;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigo) {
        this.codigoCurso = codigo;
    }
    

    public boolean isDiaSeg() {
        return diaSeg;
    }

    public void setDiaSeg(boolean diaSeg) {
        this.diaSeg = diaSeg;
    }

    public boolean isDiaTer() {
        return diaTer;
    }

    public void setDiaTer(boolean diaTer) {
        this.diaTer = diaTer;
    }

    public boolean isDiaQua() {
        return diaQua;
    }

    public void setDiaQua(boolean diaQua) {
        this.diaQua = diaQua;
    }

    public boolean isDiaQui() {
        return diaQui;
    }

    public void setDiaQui(boolean diaQui) {
        this.diaQui = diaQui;
    }

    public boolean isDiaSex() {
        return diaSex;
    }

    public void setDiaSex(boolean diaSex) {
        this.diaSex = diaSex;
    }

    public boolean isDiaSab() {
        return diaSab;
    }

    public void setDiaSab(boolean diaSab) {
        this.diaSab = diaSab;
    }
    
}
