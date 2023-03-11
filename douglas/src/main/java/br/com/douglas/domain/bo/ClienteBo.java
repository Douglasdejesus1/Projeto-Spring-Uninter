package br.com.douglas.domain.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.douglas.domain.model.Cliente;
import br.com.douglas.domain.repository.CRUD;
import br.com.douglas.domain.repository.ClienteDao;
@Service
public class ClienteBo implements CRUD<Cliente, Long>{
	@Autowired
	private ClienteDao clienteDao;

	@Override
	public Cliente pesquisaPeloId(Long id) {
		
		return clienteDao.pesquisaPeloId(id);
	}

	@Override
	public List<Cliente> listaTodos() {
		// TODO Auto-generated method stub
		return clienteDao.listaTodos();
	}

	@Override
	public void insere(Cliente t) {
		clienteDao.insere(t);
		
	}

	@Override
	public void atualiza(Cliente t) {
		clienteDao.atualiza(t);
		
	}

	@Override
	public void remove(Cliente t) {
		clienteDao.remove(t);
		
	}
	
	public void inativa(Cliente t) {
		t.setAtivo(false);
		clienteDao.atualiza(t);
	}
	public void ativa(Cliente t) {
		t.setAtivo(true);
		clienteDao.atualiza(t);
	}

	
	
}