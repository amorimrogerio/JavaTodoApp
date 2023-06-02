
package todoApp;

//import util.ConnectionFactory;
//import java.sql.Connection;
import java.util.Date;
import model.Project;
import controler.ProjectController;
import controler.TaskController;
import java.util.ArrayList;
import java.util.List;
import model.Task;



public class App {

    public static void main(String[] args) {
//        Connection c = ConnectionFactory.getConnection();
//        System.out.println("driver:"+c);
//        ConnectionFactory.closeConnection(c);
        ProjectController pNew = new ProjectController();
        TaskController pTask = new TaskController();
        List<Project> pList = new ArrayList<>();

        Project p = new Project();
        p.setId(4);
        
//        Task t = new Task();
//        t.setCreatedAt(new Date());
//        t.setDeadLine(new Date());
//        t.setDescription("tafera 2 do projeto 3");
//        t.setIdProject(3);
//        t.setIsCompleted(false);
//        t.setName("uma nova tarefa 2");
//        t.setNotes("uma tarefa de teste");
//        t.setUpdateAt(new Date());
//        pTask.save(t);
        
        
        //-> pegar todos os projetos
        pList = pNew.getAll();
        System.out.println("qtd de projetos : "+pList.size());


        
        //-> alteração projeto
//        p.setName("Projeto "+p.getId()+"(alterado)");
//        p.setDescription("descrição do projeto "+p.getId()+" (alterado)");
//        p.setCreateAt(new Date());
//        p.setUpdateAt(new Date());
//        System.out.println(p.getDescription());
//        pNew.update(p);
        
        
        //-> inclusão
//        p.setName("Projeto "+p.getId());
//        p.setDescription("descrição do projeto "+p.getId());
//        p.setCreateAt(new Date());
//        p.setUpdateAt(new Date());
//        System.out.println(p.getDescription());
//        pNew.save(p);
        
//        
//        p.setName("Projeto 2");
//        p.setDescription("descrição do projeto 2");
//        p.setCreateAt(new Date());
//        p.setUpdateAt(new Date());
//        pNew.save(p);
//        System.out.println(p.getDescription());
//
//        p.setName("Projeto 3");
//        p.setDescription("descrição do projeto 3");
//        p.setCreateAt(new Date());
//        p.setUpdateAt(new Date());
//        pNew.save(p);
//        System.out.println(p.getDescription());
        
  //      System.out.println("testado");
        
    }
}
