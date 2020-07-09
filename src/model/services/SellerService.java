package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = DaoFactory.createSellerDao();
	
	
	public List<Seller> findAll(){ //pega todos os dados no banco de dados da tabela Seller
		return dao.findAll();
	}
	
	public void saverOrUpdate(Seller obj) { //salvar ou atualizar os dados do Seller
		
		if(obj.getId() == null) {
			dao.insert(obj);
		}else {
			dao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
}