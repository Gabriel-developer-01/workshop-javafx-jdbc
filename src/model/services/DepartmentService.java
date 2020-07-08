package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	
	public List<Department> findAll(){//pega todos os dados no banco de dados da tabela Department
		return dao.findAll();
	}
	
	
	public void saverOrUpdate(Department obj) {//salvar ou atualizar os dados do Department
		
		if(obj.getId() == null) {
			dao.insert(obj);
		}else {
			dao.update(obj);
		}
	}
}
