import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestadoraCriptografadora {

	@Test
	void testeCriptografiaA() {
		Criptografadora cripta = new Criptografadora();
		int valorCriptografado = cripta.criptografa('A');
		assertEquals(valorCriptografado, 19);
	}
	
	@Test
	void testeCriptografiaB() {
		Criptografadora cripta = new Criptografadora();
		int valorCriptografado = cripta.criptografa('B');
		assertEquals(valorCriptografado, 11);
	}

}
