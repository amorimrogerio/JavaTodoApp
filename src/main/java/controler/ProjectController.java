
package controler;

import model.Project;
import util.ConnectionFactory;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rogerio Amorim
 */
public class ProjectController {
    
    public void save ( Project p) {
        
        //-> montar a query
        String sqlQuery = "INSERT INTO projects "
                +"(name,"
                +"description,"
                +"createdAt,"
                +"updateAt)"
                +"VALUES (?,?,?,?)";
        
        //-> variáveis de conexão e execução
        Connection c = null;
        PreparedStatement query=null;
        
        try {
            //-> pegar conexão com o banco
            c = ConnectionFactory.getConnection();
            
            //-> preparando a query para rodar no banco
            query = c.prepareStatement(sqlQuery);
            
            //-> setando os valores na query...
            query.setString(1, p.getName());
            query.setString(2, p.getDescription());
            query.setDate(3, new java.sql.Date(p.getCreateAt().getTime()));
            query.setDate(4, new java.sql.Date(p.getUpdateAt().getTime()));
            
            //-> rodar a query no banco
            query.execute();
            
        } catch (SQLException ex) {
            
             throw new RuntimeException("Erro ao salvar projeto "+ex.getMessage(),ex);
            
        } finally {
            
            ConnectionFactory.closeConnection(c, query);
            
        }
        
    }
    
    public void update ( Project p ) {
        
        //-> montar a query
        String sqlQuery = "UPDATE projects set "
                +"name = ?,"
                +"description = ?,"
                +"createdAt = ?,"
                +"updateAt = ?"
                +"where id = ?";
        
        //-> variáveis de conexão e execução
        Connection c = null;
        PreparedStatement query = null;
        
        try {
            //-> pegar conexão com o banco
            c = ConnectionFactory.getConnection();
            
            //-> preparando a query para rodar no banco/setando valores
            query = c.prepareStatement(sqlQuery);
            query.setString(1, p.getName());
            query.setString(2, p.getDescription());
            query.setDate(3,new java.sql.Date(p.getCreateAt().getTime()));
            query.setDate(4, new java.sql.Date(p.getUpdateAt().getTime()));
            query.setInt(5, p.getId());
            
            //-> executar query no banco
            query.execute();
            
        } catch (SQLException ex) {
            throw  new RuntimeException("Erro ao atulizar registro "+ex.getMessage(),ex);
        } finally {
            ConnectionFactory.closeConnection(c, query);
        }
    }
    
    
    public List<Project> getAll() {
        
        //-> montar a query
        String sqlQuery = "SELECT * FROM projects";
        
        //-> montar a list
        List<Project> pList = new ArrayList<>();
        
        //-> variáveis de conexão
        Connection c = null;
        PreparedStatement query = null;
        ResultSet listaProjetos = null;
        
        try {
             //-> pegar conexão com o banco e "engatilhar" query
            c = ConnectionFactory.getConnection();
            query = c.prepareCall(sqlQuery);
            
            //-> executar a query no banco e armazenar o resultado
            listaProjetos = query.executeQuery();
            
            //-> pegar os valores do resultado
            
            while (listaProjetos.next()) {
                
                //-> criando um obj Project
                Project p = new Project();
                
                //-> pegando as informações do resultado
                p.setId(listaProjetos.getInt("id"));
                p.setName(listaProjetos.getString("name"));
                p.setDescription(listaProjetos.getString("description"));
                p.setCreateAt(listaProjetos.getDate("createdAt"));
                p.setUpdateAt(listaProjetos.getDate("updateAt"));
                
                //-> populando a lista
                pList.add(p);
            }
            
        } catch (SQLException ex ) {
            throw new RuntimeException("Erro ao montar a lista de projetos "+ex.getMessage(),ex);
        } finally {
            ConnectionFactory.closeConnection(c, query, listaProjetos);
        }
        
        return pList;
        
    }
    
    public void removedById ( int projectId ) {
        
        //-> montar a query
        String sqlQuery = "DELETE FROM projects WHERE id = ?";
        
        //-> variáveis de conexão e execução
        Connection c = null;
        PreparedStatement query = null;
        
        try {
            //-> pegar conexão com o banco
            c = ConnectionFactory.getConnection();
            
            //-> preparando a query para rodar no banco/setando valores
            query = c.prepareStatement(sqlQuery);
            query.setInt(1, projectId);
            
            //-> executar query o banco
            query.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao excluir registro "+ex.getMessage(),ex);
        } finally {
            ConnectionFactory.closeConnection(c, query);
        }
        
    }
    

    
    
}
