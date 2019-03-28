package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import anagrama.Anagrama;

public class AnagramaTeste {
	public Anagrama anagrama;

	@Test
	public void testIsAnagrama() {		
		anagrama = new Anagrama();
		assertEquals(true, anagrama.isAnagramas("amor","roma"));
	}
	@Test
	public void testPalavraDiferente() {		
		anagrama = new Anagrama();
		assertEquals(false, anagrama.isAnagramas("amor","rome"));
	}
	@Test
	public void testTamanhoDiferente() {		
		anagrama = new Anagrama();
		assertEquals(false, anagrama.isAnagramas("amor","romes"));
	}
	@Test
	public void testEspaco() {		
		anagrama = new Anagrama();
		assertEquals(true, anagrama.isAnagramas("am or","amo r"));
	}
	@Test
	public void testNulo() {		
		anagrama = new Anagrama();
		assertEquals(false, anagrama.isAnagramas(null,null));
	}
	@Test
	public void testNumero() {		
		anagrama = new Anagrama();
		assertEquals(true, anagrama.isAnagramas("123","321"));
	}
	@Test
	public void testEmpty() {		
		anagrama = new Anagrama();
		assertEquals(false, anagrama.isAnagramas("",""));
	}

}
