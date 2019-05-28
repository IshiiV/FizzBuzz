import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testfizz() {
		boolean esperado = true;	//Resultado esperado. true para aparecer Fizz
		boolean recebido;
		int PassaValor = 9;			//Número testado
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		recebido = fizzbuzz.fizz(PassaValor);
		assertEquals(esperado,recebido);
	}
	@Test
	void testbuzz() {
		boolean esperado = true;	//Resultado esperado. true para aparecer Buzz
		boolean recebido;
		int PassaValor = 51;			//Número testado
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		recebido = fizzbuzz.buzz(PassaValor);
		assertEquals(esperado,recebido);
	}
}
