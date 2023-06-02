
package controler;

import java.sql.Connection;
import model.Task;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.ConnectionFactory;

/**
 *
 * @author Rogerio Amorim
 */
public class TaskController {

    public static List<Task> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void save (Task task) {
        
       String sql = "INSERT INTO tasks "
               + "(idProject,"
               + "name,"
               + "description,"
               + "completed,"
               + "notes,"
               + "deadline,"
               + "createdAt,"
               + "updateAt"
               + ")"
               + "VALUES (?,?,?,?,?,?,?,?)";
       
       
       Connection c = null;
       PreparedStatement comsql = null;
       
        try {
            
            c = ConnectionFactory.getConnection();
            
            comsql = c.prepareStatement(sql);
            comsql.setInt(1, task.getIdProject());
            comsql.setString(2, task.getName());
            comsql.setString(3, task.getDescription());
            comsql.setBoolean(4, task.getIsCompleted());
            comsql.setString(5, task.getNotes());
            comsql.setDate(6, new java.sql.Date(task.getDeadLine().getTime()));
            comsql.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            comsql.setDate(8, new java.sql.Date(task.getUpdateAt().getTime()));
            
            comsql.execute();
            
            
        } catch (Exception ex) {
            
            throw new RuntimeException("Erro ao salvar tarefa "+ex.getMessage(),ex);
            
        } finally {
            ConnectionFactory.closeConnection(c,comsql);
        }
        
    }
    
    public void update (Task task) {
    
        String sql = "UPDATE tasks set "
               + "idProject = ?, "
               + "name = ?, "
               + "description = ?, "
               + "completed = ?, "
               + "notes = ?, "
               + "deadline = ?, "
               + "createdAt = ?, "
               + "updateAt = ? "
               + "where id = ?";
        
        Connection c = null;
        PreparedStatement sqlstr=null;
        
        try {
            //-> criando a conexão com o banco de dados
            c = ConnectionFactory.getConnection();
            
            //-> preparando a query para rodar no banco....
            sqlstr = c.prepareStatement(sql);
            
            //-> incluindo os valores da query
            sqlstr.setInt(1, task.getIdProject());
            sqlstr.setString(2, task.getName());
            sqlstr.setString(3, task.getDescription());
            sqlstr.setBoolean(4, task.getIsCompleted());
            sqlstr.setString(5, task.getNotes());
            sqlstr.setDate(6, new java.sql.Date(task.getDeadLine().getTime()));
            sqlstr.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            sqlstr.setDate(8, new java.sql.Date(task.getUpdateAt().getTime()));
            sqlstr.setInt(9, task.getId());
            
            //-> aqui o comando é aplicado no banco
            sqlstr.execute();
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, ex+" ops!!!");
            throw new RuntimeException("Erro ao atualizar tarefa "+ex.getMessage(),ex);
            
            
        } finally {
            ConnectionFactory.closeConnection(c,sqlstr);
        }
                
        
    }
    
    public void removeById ( int taskId ) throws SQLException {
        
        //-> montar o sql para ser executado no banco
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            
            //-> estabelecer uma conexão com o banco
            conn = ConnectionFactory.getConnection();
            
            //-> preparar o sql que desejo rodar no banco
            statement = conn.prepareStatement(sql);
            
            //-> e agora mudamos o conteúdo da string sql
            //   o número 1 representa o primeiro sinal de '?' contido
            //   na string "sql" e trocaremos pelo conteúdo de taskid
            statement.setInt(1  , taskId);
            
            //-> agora executar o comando sql no banco
            statement.execute();
            
        } catch (Exception e) {
            
            throw new RuntimeException("Erro ao deletar tarefa "+e.getMessage(),e);
            
        } finally {
            
            //-> fechar a conexão aberta
            ConnectionFactory.closeConnection(conn,statement);
        }
        
    }
    
    public List<Task> getAll ( int idProject ) {
        
        String querySql = "SELECT * FROM tasks WHERE idProject = ?";
        Connection c = null;
        PreparedStatement noBanco = null;
        ResultSet resultado = null;
        
        //-> lista das tarefas que será devolvida 
        List<Task> tarefas = new ArrayList<Task>();
        
        try {
            //-> estabelecendo conexão
            c = ConnectionFactory.getConnection();
            noBanco = c.prepareStatement(querySql);
            
            //-> alterando query sql
            noBanco.setInt(1, idProject);
            
            //-> o executeQuery, retorna um valor da query que rodou no banco, i.e.
            //   SELECT....
            resultado = noBanco.executeQuery();
            
            //-> pegando os valores de resultado
            while (resultado.next()) {
            
                //-> criando uma tarefa
                Task t = new Task();
                
                //-> populando o registro do resultado da query no objeto
                t.setId(resultado.getInt("id"));
                t.setIdProject(resultado.getInt("idProject"));
                t.setName(resultado.getString("name"));
                t.setDescription(resultado.getString("description"));
                t.setIsCompleted(resultado.getBoolean("completed"));
                t.setNotes(resultado.getString("notes"));
                t.setDeadLine(resultado.getDate("deadline"));
                t.setCreatedAt(resultado.getDate("createdAt"));
                t.setUpdateAt(resultado.getDate("updateAt"));
                
                //-> pegando o objeto e mandando para tarefas (List)
                tarefas.add(t);
                
                
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar tarefas "+e.getMessage(),e);
        } finally {
            //-> fechar a conexão aberta
            ConnectionFactory.closeConnection(c,noBanco,resultado);
            
        }
        
        
        
        return tarefas;
    }
    
}
