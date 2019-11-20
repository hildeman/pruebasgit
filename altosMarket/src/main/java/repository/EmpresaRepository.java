package repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import model.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, Integer> {
	
List<Empresa>findAll();	


















}
