package br.com.douglas.bo;

import java.time.LocalDate;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.douglas.domain.bo.ClienteBo;
import br.com.douglas.domain.model.Cliente;
import br.com.douglas.domain.model.Sexo;
@SpringBootTest
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)
public class ClienteBoTest {
	@Autowired
	private ClienteBo bo;
	@Test
	@Order(1)
	public void insere() {
		Cliente cliente = new Cliente();
		cliente.setNome("Hanna lata");
		cliente.setCpf("01212312355");
		cliente.setDataDeNascimento(LocalDate.of(2019, 1, 8));
		cliente.setSexo(Sexo.FEMININO);
		cliente.setTelefone("1154861561");
		cliente.setCelular("11954861561");
		cliente.setAtivo(true);
		bo.insere(cliente);
	}
	@Test
	@Order(2)	
	public void pesquisaPeloId() {
		Cliente cliente = bo.pesquisaPeloId(1L);
		System.out.println(cliente);
	}
	
	
	
}
