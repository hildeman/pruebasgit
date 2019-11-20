package service;

import model.Empresa;

public interface EmpresaService {
	
	Iterable<Empresa> empresatList();
	
	
	
	 public void empresaDelete(Integer id);
	 
	 public void empresaAdd(Empresa empresa);
	 
	 public Integer empresaCount();
	 
	
	

}
