package l.p.Back_lp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import l.p.Back.Model.Comptes;
import l.p.Back.Model.Todos;
import l.p.Back.repositoy.CompteRepository;
import l.p.Back.repositoy.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

 
@EnableJpaRepositories("l.p.Back.repositoy")
@EntityScan("l.p.Back.Model")
@ComponentScan("l.p.Back.Controleur")
@SpringBootApplication
public class BackLpApplication   {

	public static void main(String[] args) {
		SpringApplication.run(BackLpApplication.class, args);
	}
         
//    CompteRepository compteRepository;
//
//     
//    TodosRepository todosRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
//
//        todosRepository.save(new Todos("Allaoua", "youcef", dt.parse("10/10/2018"), true));
//        todosRepository.save(new Todos("Drouche", "riadh", dt.parse("10/10/2018"), true));
//        todosRepository.save(new Todos("Dellci", "riadh", dt.parse("10/10/2018"), true));
//
//        System.out.println(" -------------------------  Todos  -----------------------");
//        todosRepository.findAll().forEach(c -> {
//            System.out.println(c.getTitle());
//
//        });
//        compteRepository.save(new Comptes("Idirene"));
//        System.out.println(" -------------------------  Comptes  -----------------------");
//        compteRepository.findAll().forEach(c -> {
//            System.out.println(c.getEmail());
//
//        });
//    }
        
    
}
