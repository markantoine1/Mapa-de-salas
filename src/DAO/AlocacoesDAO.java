/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import classes.Alocacoes;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 886918
 */
public class AlocacoesDAO {
        public void create(Alocacoes a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date dataSql = new java.sql.Date(a.getData().getTime()); //CONVERTENDO A DATA DE JAVA.UTIL PARA JAVA.SQL
        
        try {
            stmt = con.prepareStatement("INSERT INTO alocacoes (docente,curso,sala,turno,data,idalocacoes) VALUES (?,?,?,?,?,?) ");
            stmt.setString(1, a.getDocente());
            stmt.setString(2, a.getCurso());
            stmt.setString(3, a.getSala());
            stmt.setString(4, a.getTurno());
            stmt.setDate(5, dataSql);
            stmt.setInt(6, a.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.");
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public List<Alocacoes> readAll(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
              
        List<Alocacoes> alocacao = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM alocacoes");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Alocacoes alocacoes = new Alocacoes();
                alocacoes.setCurso(rs.getString("curso"));
                alocacoes.setDocente(rs.getString("docente"));
                alocacoes.setTurno(rs.getString("turno"));
                alocacoes.setData(rs.getDate("data"));
                alocacoes.setSala(rs.getString("sala"));
                alocacoes.setId(rs.getInt("idalocacoes"));
                alocacao.add(alocacoes);
                
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro.");
            Logger.getLogger(AlocacoesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return alocacao;
        
    }
    public List<Alocacoes> readAll(Date paramDate){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
              
        List<Alocacoes> alocacao = new ArrayList<>();
        
        java.sql.Date dataSql = new java.sql.Date(paramDate.getTime());
        try {
            stmt = con.prepareStatement("SELECT * FROM alocacoes WHERE data = ?");
            stmt.setDate(1, dataSql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Alocacoes alocacoes = new Alocacoes();
                alocacoes.setCurso(rs.getString("curso"));
                alocacoes.setDocente(rs.getString("docente"));
                alocacoes.setTurno(rs.getString("turno"));
                alocacoes.setData(rs.getDate("data"));
                alocacoes.setSala(rs.getString("sala"));
                alocacoes.setId(rs.getInt("idalocacoes"));
                alocacao.add(alocacoes);
                
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro.");
            Logger.getLogger(AlocacoesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return alocacao;
        
    }
    
    public List<Alocacoes> readCourses(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
              
        List<Alocacoes> alocacao = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT nome FROM cursos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Alocacoes a = new Alocacoes();
                a.setCurso(rs.getString("nome"));
                alocacao.add(a);
            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro.");
            Logger.getLogger(AlocacoesDAO.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
        return alocacao;
    }
    
    public List<Alocacoes> readTeachers(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
              
        List<Alocacoes> alocacao = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT nome FROM professores");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Alocacoes a = new Alocacoes();
                a.setDocente(rs.getString("nome"));
                alocacao.add(a);
            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro.");
            Logger.getLogger(AlocacoesDAO.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
        return alocacao;
        
        
    }
/*public void update(Professores p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE professores SET nome = ?, turno = ? WHERE codigo = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getTurno());
            stmt.setInt(3, p.getCodigoProfessor());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.");
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
*/
public void delete(Alocacoes a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM alocacoes WHERE idalocacoes = ?");
            stmt.setInt(1, a.getId());
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

