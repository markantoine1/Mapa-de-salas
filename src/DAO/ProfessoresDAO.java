package DAO;
import classes.Professores;
import java.sql.PreparedStatement;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
public class ProfessoresDAO {
    public void create(Professores p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO professores (nome,codigo,turno) VALUES (?,?,?) ");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getCodigoProfessor());
            stmt.setString(3, p.getTurno());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.");
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public List<Professores> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
              
        List<Professores> professor = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM professores");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Professores professores = new Professores();
                professores.setNome(rs.getString("nome"));
                professores.setCodigoProfessor(rs.getInt("codigo"));
                professores.setTurno(rs.getString("turno"));
                professor.add(professores);
                
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro.");
            Logger.getLogger(ProfessoresDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return professor;
        
    }
public void update(Professores p){
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
public void delete(Professores p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM professores WHERE codigo = ?");
            stmt.setInt(1, p.getCodigoProfessor());
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
