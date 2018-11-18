package l.p.Back.repositoy;

import l.p.Back.Model.Comptes; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

  
public interface CompteRepository extends JpaRepository<Comptes, Long>{
	// Si on veut faire "Like =" on doit creer notre requette
//			@Query("select p from Etage p where p.nomEtage like :x") 
//			public Page<Etage> etageParMC(@Param("x")String mc, Pageable p);
//                        
//                        Etage findByIdEtage(Integer idEtage);

}
