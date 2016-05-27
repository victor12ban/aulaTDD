package Testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Entidades.Boleto;
import Entidades.Fatura;
import Entidades.Util;

public class TesteBoletos {

	@Test
	public void test() {
		
		Fatura faturas = new Fatura();
		
		List<Boleto> boleto = new ArrayList<Boleto>() ;
	    Boleto b1 = new Boleto();
	    Boleto b2 = new Boleto();
	    Boleto b3 = new Boleto();
		
	    b1.setValor(500);
	    b2.setValor(400);
	    b3.setValor(600);
	    
		
	    boleto. add(b1);
	    boleto. add(b2);
	    boleto. add(b3);
	    
		
		faturas.setValor(1500.0);
		
		Util.processadorBoleto(boleto, faturas);
		
		assertEquals(faturas.getSituacao(),"PAGA");
		
		
	}

}
