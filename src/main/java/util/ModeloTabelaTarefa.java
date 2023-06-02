/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author AdminRadio
 */
public class ModeloTabelaTarefa extends AbstractTableModel{
    
    //-> um vetor de string definindo as colunas que a "table" terá
    String[] colunas = { "Nome","Descrição","Prazo","Tarefa concluída","Editar","Excluir"};
      
    //-> uma list dos dados do banco.
    List<Task> tarefasList = new ArrayList();
    
    @Override
    public int getRowCount() {
        //-> este métodos, que veio da "AbstractTableModel" informará a qtd de 
        //   linhas da tabela de tarefas.
        return tarefasList.size();
    }

    @Override
    public int getColumnCount() {
        // método que mostra-ra a quantidade de colunas que o grid contém.
        return colunas.length;
    }
    
    @Override
    public String getColumnName ( int index) {
        return colunas[index];
    }

    @Override
    public boolean isCellEditable (int linha, int coluna) {
        int isCompleted = 3;
        
        return coluna == isCompleted;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // retornar os dados referente a linha e coluna.
        switch (columnIndex) {
            case 0:
                return tarefasList.get(rowIndex).getName();
            case 1:
                return tarefasList.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dtFormat.format(tarefasList.get(rowIndex).getDeadLine());
                //return tarefasList.get(rowIndex).getDeadLine();
            case 3:
                return tarefasList.get(rowIndex).getIsCompleted();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados não encontrados !";
                
        }
    }
    
    @Override
    public void setValueAt ( Object valor, int linha, int coluna) {
        //-> primeiro o valor é setado na lista e depois este método é chamado
        //   passando o valor que foi colocado na celula, em nosso caso, a jList.
        //   Foi usado um "casting boolean" para passar o valor
        //   Lembrando que somente a coluna 3, do jList é editável. Por isso, se
        //   houver alguma edição na jList, subentende-se que já é a coluna 3
        tarefasList.get(linha).setIsCompleted((boolean) valor);
        //a linha acima passa o novo valor para o método da classe Task.
        
    }
    
    @Override
    public Class<?> getColumnClass (int coluna) {
        if (tarefasList.isEmpty()) {
            return Object.class;
        }
        return this.getValueAt(0, coluna).getClass();
    }

    public String[] getColunas() {
        return colunas;
    }

    public List<Task> getTarefasList() {
        return tarefasList;
    }

    public void setTarefasList(List<Task> tarefasList) {
        this.tarefasList = tarefasList;
    }
    
    
}
