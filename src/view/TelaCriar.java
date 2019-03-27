/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.Coluna;
import classes.ManipuladorIOFiles;
import classes.Tabela;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author isaacmsl
 */
public class TelaCriar extends javax.swing.JFrame {

    /**
     * Creates new form TelaListar
     */
    
    private ArrayList<Coluna> colunasCriadas;
    private TelaColuna telaColuna;
    
    public TelaCriar() {
        initComponents();
        
        btnListar.setEnabled(false);
        
        colunasCriadas = null;
    }

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
        panelTabela = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        panelNome = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        panelColunas = new javax.swing.JPanel();
        btnCriar = new javax.swing.JButton();
        panelQuantidade = new javax.swing.JPanel();
        lblQuantidade = new javax.swing.JLabel();
        getQuantidade = new javax.swing.JSpinner();
        panelCriadas = new javax.swing.JPanel();
        lblCriadas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaColunas = new javax.swing.JList<>();
        btnListar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        panelTabela.setBackground(new java.awt.Color(249, 249, 249));
        panelTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        panelNome.setBackground(new java.awt.Color(255, 255, 255));
        panelNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelNome.setEnabled(false);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        javax.swing.GroupLayout panelNomeLayout = new javax.swing.GroupLayout(panelNome);
        panelNome.setLayout(panelNomeLayout);
        panelNomeLayout.setHorizontalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNomeLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblNome)
                .addGap(21, 21, 21))
        );
        panelNomeLayout.setVerticalGroup(
            panelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTabelaLayout = new javax.swing.GroupLayout(panelTabela);
        panelTabela.setLayout(panelTabelaLayout);
        panelTabelaLayout.setHorizontalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTabelaLayout.setVerticalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelColunas.setBackground(new java.awt.Color(249, 249, 249));
        panelColunas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colunas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnCriar.setBackground(new java.awt.Color(255, 255, 255));
        btnCriar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        panelQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        panelQuantidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuantidade.setText("Quantidade:");

        javax.swing.GroupLayout panelQuantidadeLayout = new javax.swing.GroupLayout(panelQuantidade);
        panelQuantidade.setLayout(panelQuantidadeLayout);
        panelQuantidadeLayout.setHorizontalGroup(
            panelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuantidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuantidade)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelQuantidadeLayout.setVerticalGroup(
            panelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuantidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getQuantidade.setToolTipText("");

        lblCriadas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCriadas.setText("Colunas criadas:");

        listaColunas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(listaColunas);

        btnListar.setBackground(new java.awt.Color(255, 255, 255));
        btnListar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCriadasLayout = new javax.swing.GroupLayout(panelCriadas);
        panelCriadas.setLayout(panelCriadasLayout);
        panelCriadasLayout.setHorizontalGroup(
            panelCriadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCriadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCriadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCriadasLayout.createSequentialGroup()
                        .addComponent(lblCriadas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCriadasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnListar)))
                .addContainerGap())
        );
        panelCriadasLayout.setVerticalGroup(
            panelCriadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCriadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCriadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelColunasLayout = new javax.swing.GroupLayout(panelColunas);
        panelColunas.setLayout(panelColunasLayout);
        panelColunasLayout.setHorizontalGroup(
            panelColunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColunasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelColunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCriadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelColunasLayout.createSequentialGroup()
                        .addComponent(panelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelColunasLayout.setVerticalGroup(
            panelColunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColunasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelColunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCriadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar))
                    .addComponent(panelColunas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        
        int qntColunas = (int) getQuantidade.getValue();
        if (qntColunas > 0) {
            this.telaColuna = new TelaColuna(qntColunas);
            telaColuna.setVisible(true);
            
            esperarTela(); // ?
        }    
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(!txtNome.getText().equals("")){             try { // qnd nao vazio
            
            ArrayList<Tabela> tabelasExistentes = null;
            try {
                tabelasExistentes = ManipuladorIOFiles.lerArquivoTabela("tabelas.dat");
            } catch (Exception ex) {
                
                try { // SE DER ERRO NESSE MÉTODO, CRIAREMOS O ARQUIVO
                    boolean exists = ManipuladorIOFiles.exists("tabelas.dat");
                } catch(Exception e) {
                    ManipuladorIOFiles.criarArquivo("tabelas.dat");
                }
                
            }
            
            ArrayList<Tabela> tabelasParaSalvar = null;
            tabelasExistentes = ManipuladorIOFiles.lerArquivoTabela("tabelas.dat");
            
            if(!tabelasExistentes.isEmpty()) {
                tabelasParaSalvar = tabelasExistentes;
            } else {
                tabelasParaSalvar = new ArrayList<>();
            }
            
            this.colunasCriadas = telaColuna.getColunas();
            
            System.out.println("colunasCriadas = " + colunasCriadas);
            
            String nomeTabela = txtNome.getText();
            Tabela tabelaCriada = new Tabela(nomeTabela, colunasCriadas);
            tabelasParaSalvar.add(tabelaCriada);
            
            System.out.println("Tabela salva: " + tabelaCriada);
            System.out.println("Colunas salvas: " + tabelaCriada.getColunas());
            
            try {
                ManipuladorIOFiles.gravarArquivo("tabelas.dat", tabelasParaSalvar, false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar o arquivo");
            }
           
            this.dispose();
        } catch (Exception ex) {
                Logger.getLogger(TelaCriar.class.getName()).log(Level.SEVERE,null, ex);
                
            }
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        getQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        listaColunas.setModel(new javax.swing.AbstractListModel<String>() {
            
            public int getSize() {
                return 0;
            }

            public String getElementAt(int i) {
                return null;
            }
        });
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listarColunas();
    }//GEN-LAST:event_btnListarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCriar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JSpinner getQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCriadas;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JList<String> listaColunas;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelColunas;
    private javax.swing.JPanel panelCriadas;
    private javax.swing.JPanel panelNome;
    private javax.swing.JPanel panelQuantidade;
    private javax.swing.JPanel panelTabela;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void listarColunas() {
        
        this.colunasCriadas = telaColuna.getColunas();
        
        listaColunas.setModel(new javax.swing.AbstractListModel<String>() {

            public int getSize() {
                return colunasCriadas.size();
            }

            public String getElementAt(int i) {
                
                StringBuilder sb = new StringBuilder();
                
                if (colunasCriadas.get(i).isChavePrimaria()) {
                    sb.append(colunasCriadas.get(i).getNome());
                    sb.append(" : ");
                    sb.append(colunasCriadas.get(i).getTipo());
                    sb.append(" (primary key)");
                } else {
                    sb.append(colunasCriadas.get(i).getNome());
                    sb.append(" : ");
                    sb.append(colunasCriadas.get(i).getTipo());
                }
                
                return sb.toString();
            }
        });
    }

    private void esperarTela() {
        btnListar.setEnabled(true);
    }
}
