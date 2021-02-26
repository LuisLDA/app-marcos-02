package com.marcos.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcos.dto.Persona;
@Repository
public interface PersonaI  extends CrudRepository<Persona, Integer>{

}
