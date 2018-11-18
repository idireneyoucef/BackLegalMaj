package l.p.Back.Controleur;

import java.util.List; 
import javax.annotation.PostConstruct;

import l.p.Back.Model.Comptes;
import l.p.Back.repositoy.CompteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(path = "/compte")
@CrossOrigin("*")
public class ComptesControlleur {

    @Autowired
    private CompteRepository compteRepository;
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

    @RequestMapping(value = "/comptes", method = RequestMethod.GET)
    public List<Comptes> getComptes() {
        return compteRepository.findAll();
    }

    @RequestMapping(value = "/comptes/{id}", method = RequestMethod.GET)
    public Comptes getcomptes(@PathVariable Long id) {
        return compteRepository.findOne(id);
    }
     @RequestMapping(value = "/comptes/{id}", method = RequestMethod.DELETE)
    public boolean deletecomptes(@PathVariable Long id) {
        compteRepository.delete(id);
        return true;
                
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Comptes save(@RequestBody Comptes c) {
        compteRepository.save(c);
        return c;
    }
}
