/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author AdminRadio
 */
//-> extender uma classe...(herança) do java
public class DeadLineColor extends DefaultTableCellRenderer {
    
    @Override  //-> significa que um método será reescrito.
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        label.setHorizontalAlignment(CENTER);  //-> colocar o conteúdo da celula no centro
        
        //-> pegar as tarefas correspondente
        ModeloTabelaTarefa t = (ModeloTabelaTarefa) table.getModel();
        
        //-> pegar a linha da tarefa
        Task task = t.getTarefasList().get(row);
        
        //-> testando se a tarefa está vencida...
        //-> new Date() -> retorna a data de hoje.
        if ( task.getDeadLine().after(new Date())) {
            //-> tarefa não venceu...
            label.setBackground(Color.GREEN);
        } else {
            //-> tarefa vencida
            label.setBackground(Color.RED);
        }
       
    
        return label;
    }
    
}
