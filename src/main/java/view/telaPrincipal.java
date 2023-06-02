/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controler.ProjectController;
import controler.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.ModeloTabelaTarefa;

/**
 *
 * @author Rogerio Amorim
 */
public class telaPrincipal extends javax.swing.JFrame {

    //-> controladores que trará a informação do banco de projetos
    ProjectController bancoProjeto;
    TaskController    bancoTarefa;
    
    //-> model do componente jList, vinculado com o jList
    //DefaultListModel<Project> modeloProjeto;
    DefaultListModel modeloProjeto;
    
    //-> model do componente jTable das tarefas
    ModeloTabelaTarefa modeloTarefa;  //-> taskModel
    
    public telaPrincipal() {
        initComponents();
        decoracaoTabelaTarefas();
        
        iniciarControleBanco();
        iniciarModeloComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelListaTarefasVazia = new javax.swing.JPanel();
        jLabelSemTarefa = new javax.swing.JLabel();
        jLabelTarefaAvisoAdd = new javax.swing.JLabel();
        panelTopo = new javax.swing.JPanel();
        jLabel1IconeTopo = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelNomeApp = new javax.swing.JLabel();
        panelProjetos = new javax.swing.JPanel();
        jLabelProjeto = new javax.swing.JLabel();
        jLabelProjetoAdd = new javax.swing.JLabel();
        panelTarefas = new javax.swing.JPanel();
        jLabelTarefas = new javax.swing.JLabel();
        jLabelTarefasAdd = new javax.swing.JLabel();
        panelListaProjetos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProjetos = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTarefas = new javax.swing.JTable();

        panelListaTarefasVazia.setBackground(new java.awt.Color(204, 255, 255));
        panelListaTarefasVazia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelSemTarefa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelSemTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSemTarefa.setText("Nenhuma tarefa cadastrada.");

        jLabelTarefaAvisoAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTarefaAvisoAdd.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTarefaAvisoAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTarefaAvisoAdd.setText("Clique no '+' para inserir uma tarefa");

        javax.swing.GroupLayout panelListaTarefasVaziaLayout = new javax.swing.GroupLayout(panelListaTarefasVazia);
        panelListaTarefasVazia.setLayout(panelListaTarefasVaziaLayout);
        panelListaTarefasVaziaLayout.setHorizontalGroup(
            panelListaTarefasVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaTarefasVaziaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListaTarefasVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSemTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTarefaAvisoAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelListaTarefasVaziaLayout.setVerticalGroup(
            panelListaTarefasVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaTarefasVaziaLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabelSemTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTarefaAvisoAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        panelTopo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelTopo.setName(""); // NOI18N

        jLabel1IconeTopo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1IconeTopo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1IconeTopo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarefa(4).png"))); // NOI18N
        jLabel1IconeTopo.setToolTipText("");

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescricao.setText("Anote para não esquecer !!!");

        jLabelNomeApp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelNomeApp.setText("Todo App");

        javax.swing.GroupLayout panelTopoLayout = new javax.swing.GroupLayout(panelTopo);
        panelTopo.setLayout(panelTopoLayout);
        panelTopoLayout.setHorizontalGroup(
            panelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTopoLayout.createSequentialGroup()
                        .addComponent(jLabel1IconeTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeApp)
                        .addGap(0, 606, Short.MAX_VALUE))))
        );
        panelTopoLayout.setVerticalGroup(
            panelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopoLayout.createSequentialGroup()
                .addGroup(panelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTopoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1IconeTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomeApp)
                        .addGap(18, 18, 18)))
                .addComponent(jLabelDescricao)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelProjetos.setBackground(new java.awt.Color(204, 255, 255));
        panelProjetos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelProjeto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelProjeto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelProjeto.setText("Projetos");

        jLabelProjetoAdd.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelProjetoAdd.setText("+");
        jLabelProjetoAdd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelProjetoAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjetoAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelProjetosLayout = new javax.swing.GroupLayout(panelProjetos);
        panelProjetos.setLayout(panelProjetosLayout);
        panelProjetosLayout.setHorizontalGroup(
            panelProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jLabelProjetoAdd)
                .addGap(18, 18, 18))
        );
        panelProjetosLayout.setVerticalGroup(
            panelProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjetosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProjetoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelTarefas.setBackground(new java.awt.Color(204, 255, 255));
        panelTarefas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelTarefas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTarefas.setText("Tarefas");

        jLabelTarefasAdd.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelTarefasAdd.setText("+");
        jLabelTarefasAdd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelTarefasAdd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelTarefasAddMouseDragged(evt);
            }
        });
        jLabelTarefasAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTarefasAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTarefasLayout = new javax.swing.GroupLayout(panelTarefas);
        panelTarefas.setLayout(panelTarefasLayout);
        panelTarefasLayout.setHorizontalGroup(
            panelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTarefasAdd)
                .addGap(32, 32, 32))
        );
        panelTarefasLayout.setVerticalGroup(
            panelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTarefasAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelListaProjetos.setBackground(new java.awt.Color(204, 255, 255));
        panelListaProjetos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        listProjetos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listProjetos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listProjetos.setFixedCellHeight(40);
        listProjetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listProjetosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listProjetos);

        javax.swing.GroupLayout panelListaProjetosLayout = new javax.swing.GroupLayout(panelListaProjetos);
        panelListaProjetos.setLayout(panelListaProjetosLayout);
        panelListaProjetosLayout.setHorizontalGroup(
            panelListaProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelListaProjetosLayout.setVerticalGroup(
            panelListaProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jTableTarefas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableTarefas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTarefas.setRowHeight(50);
        jTableTarefas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTarefas.setShowGrid(true);
        jTableTarefas.setShowVerticalLines(false);
        jTableTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTarefasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTarefas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelListaProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelListaProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjetoAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjetoAddMouseClicked
         // TODO add your handling code here:
       telaCadProjetos telaProjeto = new telaCadProjetos(this, rootPaneCheckingEnabled);
       telaProjeto.setVisible(true);
       
       //-> inserindo um evento "ouvinte de janela" ( isso é do java ) 
       telaProjeto.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosed (WindowEvent e ) {
               //-> detalhes sobre o listener, conforme orientação do prof. Marcio,
               //   na documentação do java.
               //   Existe outros tipos de eventos que podemos controlar via código
               //   Este, especificamente, será executado somente quando a janela for 
               //   fechada.
               carregaProjetos();
           }
               
       });
           
        
        
    
    }//GEN-LAST:event_jLabelProjetoAddMouseClicked

    private void jLabelTarefasAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTarefasAddMouseClicked
        // TODO add your handling code here:
        var taskScreen = new telaCadTarefa(this, rootPaneCheckingEnabled);
        
        //-> pegar o projeto a qual a tarefa pertence
        int projectIndex = listProjetos.getSelectedIndex();
        Project p = (Project) modeloProjeto.get(projectIndex);
        taskScreen.setP(p);
               
        //-> mostrar a tela
        taskScreen.setVisible(true);
        
        /*
        //-> add a listener for to monitor window closure
        taskScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed (WindowEvent e ) {    
                //-> to cat the index projects....
         
            }
        });
        */
       
    }//GEN-LAST:event_jLabelTarefasAddMouseClicked

    private void jLabelTarefasAddMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTarefasAddMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelTarefasAddMouseDragged

    private void jTableTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTarefasMouseClicked
        // TODO add your handling code here:
        //-> metodo criado com o objetivo de gravar a alteração, em banco, da coluna de tarefa
        //   concluída
        //-> esse método é executado, na sequência, após a execução do método setValueAt da classe 
        //   ModeloTabelaTarefa.
        
        int lin = jTableTarefas.rowAtPoint(evt.getPoint());
        int col = jTableTarefas.columnAtPoint(evt.getPoint());
        final int campoIsCompleted=3; //-> constante
        
        switch(col){
            case 3:
                Task tarefa = modeloTarefa.getTarefasList().get(lin);
                bancoTarefa.update(tarefa);
                break;
        }
    }//GEN-LAST:event_jTableTarefasMouseClicked

    private void listProjetosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listProjetosMouseClicked
        // TODO add your handling code here:
        //-> pegar o índice do item clicado
        int indiceProjeto = listProjetos.getSelectedIndex();
        
        //-> pegar o projeto referente ao índice 
        Project projeto = (Project) modeloProjeto.get(indiceProjeto);
        
        //-> carregar as tarefas com base no projeto
        carregaTarefas(projeto.getId());
        
    }//GEN-LAST:event_listProjetosMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1IconeTopo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelNomeApp;
    private javax.swing.JLabel jLabelProjeto;
    private javax.swing.JLabel jLabelProjetoAdd;
    private javax.swing.JLabel jLabelSemTarefa;
    private javax.swing.JLabel jLabelTarefaAvisoAdd;
    private javax.swing.JLabel jLabelTarefas;
    private javax.swing.JLabel jLabelTarefasAdd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTarefas;
    private javax.swing.JList<String> listProjetos;
    private javax.swing.JPanel panelListaProjetos;
    private javax.swing.JPanel panelListaTarefasVazia;
    private javax.swing.JPanel panelProjetos;
    private javax.swing.JPanel panelTarefas;
    private javax.swing.JPanel panelTopo;
    // End of variables declaration//GEN-END:variables
  
    public void decoracaoTabelaTarefas() {
        //-> customizando o header da table tarefas
        jTableTarefas.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14) );

        jTableTarefas.getTableHeader().setBackground(new Color(0,153,102));
        jTableTarefas.getTableHeader().setForeground(new Color (255,255,255));
        
        //-> ordernar os dados de uma coluna ao clicar.
        jTableTarefas.setAutoCreateRowSorter(true); 
    }

    
    public void iniciarControleBanco() {
       bancoProjeto = new ProjectController();
       bancoTarefa  = new TaskController();
    }
    
    public void iniciarModeloComponentes() {
        //modeloProjeto = new DefaultListModel<Project>();
        int primeiroItem=0;
        
        modeloProjeto = new DefaultListModel();
        carregaProjetos();
        
        modeloTarefa = new ModeloTabelaTarefa();
        jTableTarefas.setModel(modeloTarefa);
        
        
        //-> verificar se existe ao menos um projeto no banco e começar o 
        //   programa selecionando este projeto e mostrando suas tarefas
        if (!modeloProjeto.isEmpty()){
            //-> existe ao menos um projeto
            
            //-> ajusta a tela, o primeiro item será "setado"
            listProjetos.setSelectedIndex(primeiroItem);
            
            //-> ajustar para pegar o projetos
            Project p = (Project) modeloProjeto.get(primeiroItem);
            carregaTarefas(p.getId());
        
        }
        
        
    }
    
    
    public void carregaTarefas(int idProject) {

        List<Task> tarefas = bancoTarefa.getAll(idProject);
        
        //-> carregar as tarefas do banco.
        modeloTarefa.setTarefasList(tarefas);
        
        mostratTabelaTarefa(!tarefas.isEmpty());
    }
    
    public void carregaProjetos() {
        
        //-> busca os projetos do banco
        List<Project> projetos = bancoProjeto.getAll();
        
        //-> limpar os dados que possa existir na lista.
        modeloProjeto.clear();
        
        //-> pegar os projetos
        for (int i = 0; i < projetos.size() ; i++) {
            modeloProjeto.addElement(projetos.get(i));
        }
        
        //-> vincular os itens de projetos do banco do jList da tela
        listProjetos.setModel(modeloProjeto);
    }
    
    
    private void mostratTabelaTarefa( boolean temTarefa ) {
        
        //-> verificar se tem tarefas
        if ( temTarefa ) {
            
            
            //-> confirmar se o jPanel de tarefas vazia está visível
            if (panelListaTarefasVazia.isVisible()) { 
                
                //-> fazer o jPanel de tarefas vazia ficar invisivel
                panelListaTarefasVazia.setVisible(false);
                
                //-> retirar a tela de tarefa vazia do jPanel1 conteiner dos paineis
                jPanel1.remove(panelListaTarefasVazia);
            }
            
            //-> adiciona o componente que contém a jTableTarefas
            jPanel1.add(jScrollPane2);
            
            //-> tornar o painel visível
            jScrollPane2.setVisible(true);
            
            //-> ajustar seu tamanho
            jScrollPane2.setSize(jPanel1.getWidth(), jPanel1.getHeight());
            
            
        }  else { //-> não tem tarefas
            
            if ( jScrollPane2.isVisible()) {
                //-> painel das tarefas está visível, torna-lo invisível
                jScrollPane2.setVisible(false);
                
                //-> removelo do continer jPanel1
                jPanel1.remove(jScrollPane2);
            }
            
            //-> adiciona jPanel de lista vazia
            jPanel1.add (panelListaTarefasVazia);
            
            //-> torna-lo visivel
            panelListaTarefasVazia.setVisible(true);
            
            //-> ajustar seu tamanho
            panelListaTarefasVazia.setSize(jPanel1.getWidth(), jPanel1.getHeight());
        }
        
    }
}


