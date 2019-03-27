/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.*;
import java.util.ArrayList;
import javax.swing.table.*;

/**
 *
 * @author off1c
 */
public class TelaInfoTabela extends javax.swing.JFrame {

    /**
     * Creates new form TelaInfoTabela
     */
    
    private Tabela tabela;
    private ArrayList<Coluna> colunas;
    private ArrayList<String[]> linhas;
    
    public TelaInfoTabela(Tabela tabela) {
        
        initComponents();
        
        txtInfo.setText(txtInfo.getText() + tabela.getNome());
        
        this.tabela = tabela;
        this.colunas = tabela.getColunas();
        this.linhas = tabela.getLinhas();
       
        /*TableModel tm = table.getModel();
        DefaultTableModel modelo = (DefaultTableModel) tm;
        readJTable();*/
        
        // transformando ArrayList<String> colunas em String[]
        String[] colunasString = new String[colunas.size()];

        int i = 0;
        for (Coluna coluna : colunas) {
            colunasString[i++] = coluna.getNome();
        }

        // transformando ArrayList<String[]> linhas em Object[][]
        Object[][] linhasObject = new Object[linhas.size()][colunas.size()];

        int l = 0;
        int c = 0;
        for (String[] linha : linhas) {
            for (String linhaDado : linha) {
                System.out.println("linhaDado: " + linhaDado);
                linhasObject[l][c++] = linhaDado;
            }
            c = 0;
            ++l;
        }

        table.setModel(new javax.swing.table.DefaultTableModel(
                linhasObject,
                colunasString
        ));
    }
    
    public TelaInfoTabela() {
        initComponents();
        
    }
    
    /*
    private void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setNumRows(0);
        //String[] tupla = null;
        
        for (Coluna coluna : colunas) {
            
            modelo.addColumn(coluna.getNome());
            
        }
        
        
        for (Linha linha : linhas) {
        
            modelo.addRow(linha.getDados());
        
        }
        
        
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        txtInfo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtInfo.setText("Tabela: ");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addGap(28, 28, 28))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txtInfo)
                        .addContainerGap(331, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnVoltar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInfoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInfoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInfoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInfoTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInfoTabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTable table;
    private javax.swing.JLabel txtInfo;
    // End of variables declaration//GEN-END:variables

    /*private void listarColunas() {
        
        int qntColunas = colunas.size();
        
        String[] colunasTable = new String[qntColunas];
        
        int i = 0;
        for (Coluna coluna : colunas) {
            
            colunasTable[i] = coluna.getNome();
            
            System.out.println(colunasTable[i]);
            
            ++i;
        }
        
        Object[][] rows = new Object[1][1];
        
        rows[0][0] = "pao";
        
        table.setModel(new javax.swing.table.DefaultTableModel(
                rows,
                colunasTable
        ));
    }*/
}
