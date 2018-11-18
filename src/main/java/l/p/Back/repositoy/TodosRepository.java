package l.p.Back.repositoy;

import l.p.Back.Model.Comptes; 
import l.p.Back.Model.Todos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

 
public interface TodosRepository extends JpaRepository<Todos, Long>{
	// Si on veut faire "Like =" on doit creer notre requette
//			@Query("select p from Etage p where p.nomEtage like :x") 
//			public Page<Etage> etageParMC(@Param("x")String mc, Pageable p);
//                        
//                        Etage findByIdEtage(Integer idEtage);

}
