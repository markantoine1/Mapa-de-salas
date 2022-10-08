/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import classes.Cursos;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 886918
 */
public class CursosDAO {
    public void create(Cursos c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cursos (codigo,nome,tipoDeSala,diasRealizados,turno) VALUES (?,?,?,?,?) ");
            stmt.setInt(1, c.getCodigoCurso());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getTipoDeSala());
            stmt.setString(4, c.getDiasRealizados());
            stmt.setString(5, c.getTurno());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public List<Cursos> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
              
        List<Cursos> curso = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cursos");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Cursos cursos = new Cursos();
                cursos.setNome(rs.getString("nome"));
                cursos.setTipoDeSala(rs.getString("tipoDeSala"));
                cursos.setDiasRealizados(rs.getString("diasRealizados"));
                cursos.setTurno(rs.getString("turno"));
                cursos.setCodigoCurso(rs.getInt("codigo"));
                curso.add(cursos);
                
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro.");
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return curso;
        
    }
public void update(Cursos c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cursos SET nome = ?, turno = ?, diasRealizados = ?,tipoDeSala = ?, turno = ? WHERE codigo = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTurno());
            stmt.setString(3, c.getDiasRealizados());
            stmt.setString(4, c.getTipoDeSala());
            stmt.setString(5, c.getTurno());
            stmt.setInt(6, c.getCodigoCurso());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.");
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
public void delete(Cursos c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM cursos WHERE codigo = ?");
            stmt.setInt(1, c.getCodigoCurso());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir.");
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}

