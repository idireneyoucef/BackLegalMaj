package l.p.Back.Controleur;

import java.util.List; 

import l.p.Back.Model.Comptes;
import l.p.Back.Model.Todos;
import l.p.Back.repositoy.TodosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(path = "/todo")
@CrossOrigin("*")
public class TodosControlleur {

    @Autowired
    private TodosRepository todosRepository;
//
//    @PostConstruct
//    public void init() {
//        compteRepository.save(new Comptes("Idirene"));
//        System.out.println(" -------------------------  Comptes  -----------------------");
//        compteRepository.findAll().forEach(c -> {
//            System.out.println(c.getEmail());
//
//        });
//
//    }

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public List<Todos> getTodos() {
        System.out.println(" todosRepository.findAll() "+todosRepository.findAll());
        return todosRepository.findAll();
    }

//    @RequestMapping(value = "/todos/{id}", method = RequestMethod.DELETE)
    @DeleteMapping(value = "/todos/{id}")
    public boolean removeTodos(@PathVariable Long id) {
        todosRepository.delete(id);
        return true;
    }
    
        
      @RequestMapping(value = "/todos/{id}", method = RequestMethod.GET)
    public Todos getTodos(@PathVariable Long id) {
        return todosRepository.findOne(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Todos saveTodos(@RequestBody Todos c) {
        todosRepository.save(c);
        return c;
    }
    
}
