
package com.aldomatias.dao;

import org.springframework.data.repository.CrudRepository;
import com.aldomatias.domain.*;
public interface PersonaDao extends CrudRepository<Persona, Long> {
    
}
