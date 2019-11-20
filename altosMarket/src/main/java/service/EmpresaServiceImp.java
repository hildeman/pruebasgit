package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Empresa;
import repository.EmpresaRepository;

@Service
public class EmpresaServiceImp  implements EmpresaService{

	@Autowired
	private EmpresaRepository empresaRepository;
	
	
	
	public Iterable<Empresa> empresatList() {
		// TODO Auto-generated method stub
		return  empresaRepository.findAll();
	}

	public void empresaDelete(Integer id) {
		this.empresaRepository.delete(id);
		
	}

	public void empresaAdd(Empresa empresa) {
		this.empresaRepository.save(empresa);
		
	}

	public Integer empresaCount() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	

	

	

	

}
