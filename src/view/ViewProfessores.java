/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.ProfessoresDAO;
import classes.Professores;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 886918
 */
public class ViewProfessores extends javax.swing.JFrame{
    String listaDeCursos[] = {"Java","Mysql"};
    
    
    DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(listaDeCursos);
    
    
        public ViewProfessores() {
        initComponents();
        readJTable();        
    }

        public void readJTable(){
       DefaultTableModel modelo = (DefaultTableModel) jtbTabelaDocentes.getModel();
       modelo.setNumRows(0);
       btnAtualizar.setEnabled(false);
       ProfessoresDAO pdao = new ProfessoresDAO();
       
       for(Professores p:pdao.read()){
           modelo.addRow(new Object[]{
               p.getNome(),
               p.getCodigoProfessor(),
               p.getTurno()
           });
       }
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTabelaDocentes = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnNovoDocente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        spnCod = new javax.swing.JSpinner();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnManha = new javax.swing.JRadioButton();
        btnTarde = new javax.swing.JRadioButton();
        btnNoite = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Docentes");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Docentes");

        jtbTabelaDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cód", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbTabelaDocentes.setColumnSelectionAllowed(true);
        jtbTabelaDocentes.getTableHeader().setReorderingAllowed(false);
        jtbTabelaDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTabelaDocentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbTabelaDocentes);
        jtbTabelaDocentes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtbTabelaDocentes.getColumnModel().getColumnCount() > 0) {
            jtbTabelaDocentes.getColumnModel().getColumn(0).setResizable(false);
            jtbTabelaDocentes.getColumnModel().getColumn(0).setPreferredWidth(550);
            jtbTabelaDocentes.getColumnModel().getColumn(1).setResizable(false);
            jtbTabelaDocentes.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtbTabelaDocentes.getColumnModel().getColumn(2).setResizable(false);
        }

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel5.setText("Turno");

        jLabel2.setText("Nome");

        btnNovoDocente.setText("Cadastrar");
        btnNovoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoDocenteActionPerformed(evt);
            }
        });

        jLabel4.setText("Código");

        spnCod.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnCod.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnManha.setText("Manhã");

        btnTarde.setText("Tarde");

        btnNoite.setText("Noite");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnNovoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnManha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTarde)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNoite)))))
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoite)
                    .addComponent(btnTarde)
                    .addComponent(btnManha))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoDocente)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        ViewMenu menu = new ViewMenu();
        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoDocenteActionPerformed
        ProfessoresDAO dao = new ProfessoresDAO();
        Professores p = new Professores();
        if (btnManha.isSelected()) {
            p.setTurnoManha(true);
        }
        if (btnTarde.isSelected()) {
            p.setTurnoTarde(true);
        }
        if (btnNoite.isSelected()) {
            p.setTurnoNoite(true);
        }
        p.setNome(txtNome.getText());
        p.setCodigoProfessor(Integer.parseInt(spnCod.getValue().toString())); 
        p.definirTurno();
        if (((int)spnCod.getValue()) > 0) {
        dao.create(p);
        readJTable();
        }else{
            JOptionPane.showMessageDialog(null, "Código inválido!");
        }
        txtNome.setText("");
        spnCod.setValue(0);
        btnManha.setSelected(false);
        btnTarde.setSelected(false);
        btnNoite.setSelected(false);
    }//GEN-LAST:event_btnNovoDocenteActionPerformed

    private void jtbTabelaDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTabelaDocentesMouseClicked
        // TODO add your handling code here:
        if(jtbTabelaDocentes.getSelectedRow() != -1){
            btnAtualizar.setEnabled(true);
            btnManha.setSelected(false);
            btnTarde.setSelected(false);
            btnNoite.setSelected(false);
            txtNome.setText(jtbTabelaDocentes.getValueAt(jtbTabelaDocentes.getSelectedRow(), 0).toString());
            spnCod.setValue(jtbTabelaDocentes.getValueAt(jtbTabelaDocentes.getSelectedRow(), 1));
            String turno = jtbTabelaDocentes.getValueAt(jtbTabelaDocentes.getSelectedRow(),2).toString();
            
            for (int i = 0; i < turno.length(); i++) {
                char x = turno.charAt(i);
                if (x == 'M') {
                    btnManha.setSelected(true);
                }
                if (x == 'T') {
                    btnTarde.setSelected(true);
                }
                if (x == 'N') {
                    btnNoite.setSelected(true);
                }
            }
        }
    }//GEN-LAST:event_jtbTabelaDocentesMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        Professores p = new Professores();
        if(jtbTabelaDocentes.getSelectedRow() != 1 ){
        if (btnManha.isSelected()) {
            p.setTurnoManha(true);
        }
        if (btnTarde.isSelected()) {
            p.setTurnoTarde(true);
        }
        if (btnNoite.isSelected()) {
            p.setTurnoNoite(true);
        }
        ProfessoresDAO dao = new ProfessoresDAO();
        p.setNome(txtNome.getText());
        p.setCodigoProfessor((int)jtbTabelaDocentes.getValueAt(jtbTabelaDocentes.getSelectedRow(), 1));
        p.definirTurno();
        dao.update(p);
        txtNome.setText("");
        spnCod.setValue(0);
        readJTable();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if(jtbTabelaDocentes.getSelectedRow() != 1 ){
        Professores p = new Professores();
        ProfessoresDAO dao = new ProfessoresDAO();
        p.setCodigoProfessor((int)jtbTabelaDocentes.getValueAt(jtbTabelaDocentes.getSelectedRow(), 1));
        dao.delete(p);
        txtNome.setText("");
        readJTable();
    }//GEN-LAST:event_btnExcluirActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProfessores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JRadioButton btnManha;
    private javax.swing.JRadioButton btnNoite;
    private javax.swing.JButton btnNovoDocente;
    private javax.swing.JRadioButton btnTarde;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jtbTabelaDocentes;
    private javax.swing.JSpinner spnCod;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
