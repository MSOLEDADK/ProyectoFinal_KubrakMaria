
package com.portfolio.msoledadk.Repository;

import com.portfolio.msoledadk.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
