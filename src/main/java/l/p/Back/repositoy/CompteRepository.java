package l.p.Back.repositoy;

import l.p.Back.Model.Comptes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompteRepository extends JpaRepository<Comptes, Long> {

    @Query("select c from Comptes c where c.email =:email")
    Boolean findByEmail(@Param("email") String email);

}
