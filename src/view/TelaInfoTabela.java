/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.ManipuladorTabelas;
import classes.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
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
    private ArrayList<String[]> linhasBuffered;
    private String chavePrimaria;
    private String colunaSelected;
    
    private boolean jaBuscou;
    
    public TelaInfoTabela(Tabela tabela) {
        
        initComponents();
        
        txtInfo.setText(txtInfo.getText() + tabela.getNome());
        
       
        this.tabela = tabela;
        this.colunas = tabela.getColunas();
        this.linhas = tabela.getLinhas();
        
        this.linhasBuffered = new ArrayList<>();
        
        // CONVERTENDO COLUNAS PARA VETOR DE STRING
        String[] colunasString = new String[colunas.size()];

        int i = 0;
        for (Coluna coluna : colunas) {
            colunasString[i] = coluna.getNome();
            if (coluna.isChavePrimaria()) chavePrimaria = coluna.getNome();
            ++i;
        }
        
        
        
        ManipuladorTabelas.parseToTable(jTable, colunas, linhas);
        
        //boxColuna.setModel(new javax.swing.DefaultComboBoxModel<>(colunasStringTipo));
        boxColuna.setModel(new javax.swing.DefaultComboBoxModel<>(ManipuladorTabelas.parseToStringVector(colunas)));
        
        this.colunaSelected = (String) boxColuna.getSelectedItem();

        if (this.colunaSelected.equals(chavePrimaria)) {
            btnRemoveLinha.setEnabled(true);
        } else {
            btnRemoveLinha.setEnabled(false);
        }
    }
    
    public TelaInfoTabela() {
        initComponents();
        
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
        txtInfo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        lblEm = new javax.swing.JLabel();
        lblPesquisar = new javax.swing.JLabel();
        boxColuna = new javax.swing.JComboBox<>();
        txtFValor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRemoveLinha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabelas");

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

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.setEnabled(false);
        jScrollPane2.setViewportView(jTable);

        lblEm.setText("em");

        lblPesquisar.setText("Pesquisa:");

        boxColuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxColunaActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRemoveLinha.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveLinha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemoveLinha.setText("Remover Linha");
        btnRemoveLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveLinhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txtInfo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(lblPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(btnBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVoltar))
                                    .addComponent(btnRemoveLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 4, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(lblEm)
                    .addComponent(lblPesquisar)
                    .addComponent(boxColuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnRemoveLinha)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        if (jaBuscou) {
            ManipuladorTabelas.parseToTable(jTable, colunas, linhas);
            jaBuscou = false;
        } else {
            this.dispose();
        }
        

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String valorLido = txtFValor.getText();
        Coluna colunaSelected = this.colunas.get(boxColuna.getSelectedIndex());
        
        boolean empty = valorLido.equals("");
        
        boolean achouDado = false;
        boolean foiDouble = false;
        
        if (empty) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {            
            try {
                switch (colunaSelected.getTipo().toLowerCase()) {
                    case "string":
                    case "boolean":
                        
                        ArrayList<String> stringColunas = getStringColuna();
                        
                        tipoCorreto(valorLido, colunaSelected);
                        
                        int i = 0;
                        for (String txt : stringColunas) { // PEGAS AS LINHAS QUE CONTÉM VALOR LIDO
                            
                            if (txt.toLowerCase().contains(valorLido.toLowerCase())) {
                                linhasBuffered.add(linhas.get(i));
                            }
                            ++i;
                        }
                        
                        if (linhasBuffered.size() > 0) { // ACHOU LINHAS
                            achouDado = true;
                            ManipuladorTabelas.parseToTable(jTable, colunas, linhasBuffered);
                        } 
                        
                        linhasBuffered.clear();
                        
                        break;
                        
                    case "int":
                    case "double":
                        ArrayList<Double> doublesColuna = getDoublesColuna();
                        
                        double valorAchado = 0;
                        
                        tipoCorreto(valorLido, colunaSelected);
                        
                        double valorLidoDob = Double.parseDouble(valorLido); // filtra valores invalidos
                        
                        int j = 0;
                        for (Double num : doublesColuna) { // PEGAS AS LINHAS QUE CONTÉM VALOR LIDO
                            
                            if (num.equals(valorLidoDob)) {
                                linhasBuffered.add(linhas.get(j));
                                valorAchado = num.doubleValue();
                            }
                            ++j;
                        }
                        
                        if (linhasBuffered.size() > 0) { // ACHOU LINHAS
                            achouDado = true;  
                        } 
                        foiDouble = true;
                        new TelaComparacoesValores(tabela, new ArrayList<>(linhasBuffered), doublesColuna,valorLidoDob).setVisible(true);
                        
                        linhasBuffered.clear();
                        
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Insira valor do tipo <" + colunaSelected.getTipo() + ">");
            }
               
            if(achouDado){
                linhasBuffered.clear();
                if (!foiDouble) jaBuscou = true;
                
            } else if(!foiDouble) {
                clear();
                JOptionPane.showMessageDialog(null, "Nada foi encontrado.");
                
            }
                     
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRemoveLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveLinhaActionPerformed
        
        String chaveString = txtFValor.getText();
        boolean empty = chaveString.equals("");
        boolean achouDado = false;
        
        if (empty) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }else{
            try {
                double chaveInt = Integer.parseInt(chaveString);
                
                ArrayList<Double> colunaChaves = getDoublesColuna();
                
                int j = 0;
                int indexLinha = 0;
                for (Double num : colunaChaves) { // PEGAS AS LINHAS QUE CONTÉM VALOR LIDO
                    if (num.equals(chaveInt)) {
                        linhasBuffered.add(linhas.get(j));
                        indexLinha = j;
                    }
                    ++j;
                }
                
                if (linhasBuffered.size() > 0) { // ACHOU LINHAS
                    achouDado = true;
                }
                
                if(achouDado) removeLinha(indexLinha);
                else JOptionPane.showMessageDialog(null, "Chave inexistente!");
                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "O valor deve ser do tipo inteiro!");
            }
        }
    }//GEN-LAST:event_btnRemoveLinhaActionPerformed

    private void boxColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxColunaActionPerformed
        this.colunaSelected = (String) boxColuna.getSelectedItem();
        
        if(this.colunaSelected.equals(chavePrimaria)){
            btnRemoveLinha.setEnabled(true);
        }else{
            btnRemoveLinha.setEnabled(false);
        }
    }//GEN-LAST:event_boxColunaActionPerformed
    
    
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
    private javax.swing.JComboBox<String> boxColuna;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRemoveLinha;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblEm;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtFValor;
    private javax.swing.JLabel txtInfo;
    // End of variables declaration//GEN-END:variables

    private void tipoCorreto(String valorLido, Coluna coluna) throws Exception {

        String tipoColuna = coluna.getTipo().toLowerCase();

        switch (tipoColuna) {
            case "int":
            case "double":
                try {
                    double dob = Double.valueOf(valorLido);
                } catch (Exception e) {
                    throw e;
                }
                break;
            case "boolean":
                if (!(valorLido.equalsIgnoreCase("true")
                        || valorLido.equalsIgnoreCase("false"))) {
                    Exception e = new Exception();
                    throw e;
                }
                break;
        }
    }
    
   private ArrayList<Double> getDoublesColuna(){
       ArrayList<Double> elementosColuna = new ArrayList<>();
       for (String[] linha : linhas) {
           for (int i = 0; i < linha.length; i++) {
               if (i == boxColuna.getSelectedIndex()) {
                   elementosColuna.add(Double.parseDouble(linha[i]));
               }
           }
       }
       return elementosColuna;
   }
   
   private ArrayList<String> getStringColuna(){
       ArrayList<String> elementosColuna = new ArrayList<>();
       for (String[] linha : linhas) {
           for (int i = 0; i < linha.length; i++) {
               if (i == boxColuna.getSelectedIndex()) {
                   elementosColuna.add(linha[i]);
               }
           }
       }
       return elementosColuna;
   }
   
   /*private ArrayList<Integer> getColunaPrimaria(){
       ArrayList<Integer> chavePrimarias = new ArrayList<>();
       
       return null;
   }*/

    private void clear() {
        txtFValor.setText("");
        boxColuna.setSelectedIndex(0);
    }
    
    private void removeLinha(int indexLinha) throws Exception{
        int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover essa linha?");

        if (confirm == 0) {
            try {
                ArrayList<Tabela> tabelasExistentes = ManipuladorIOFiles.lerArquivoTabela("tabelas.dat");
                ArrayList<Tabela> novasTabelas = new ArrayList<>();

                for (Tabela t : tabelasExistentes) {
                    if (t.equals(this.tabela)) {
                        t.getLinhas().remove(indexLinha);
                        System.out.println(t.getLinhas());
                        this.tabela = t;
                        this.colunas = t.getColunas();
                        this.linhas = t.getLinhas();
                    }
                    novasTabelas.add(t);
                }

                JOptionPane.showMessageDialog(null, "Linha removida com sucesso!");

                ManipuladorIOFiles.gravarArquivo("tabelas.dat", novasTabelas, false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel ler o arquivo! ");
            }
        }

        ArrayList<Tabela> tabelasExistentes = ManipuladorIOFiles.lerArquivoTabela("tabelas.dat");
        System.out.println(linhas);
        ManipuladorTabelas.parseToTable(jTable, colunas, linhas);

        linhasBuffered.clear();

    }
}
