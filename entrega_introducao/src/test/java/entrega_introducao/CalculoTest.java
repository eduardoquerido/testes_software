package entrega_introducao;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoTest {

	@Test
	   public void testJurosSimples() {

	      //TestCase 1: ([16000, 0.005, 4, JuroSimples]320)
	      //Capital Inicial: R$ 16.000,00
	      //Taxa de Juros: 0.005/ano
	      //Tempo aplicado: 4 anos

	      // Atribuição de valores para o Teste Case 1
	      float capital = 16000f;
	      float taxa = 0.005f;
	      float periodo = 4f; // tempo determinado em anos

	      //Resultado Esperado do TestCase 1
	      float resultado_esperado = 320f;

	      //Retorno do método de JuroSimples para TC1
	      float resultado_obtido = Calculo.JuroSimples(capital, taxa, periodo);

	      // Segundo o site do JUnit - https://junit.org/junit4/javadoc/4.12/org/junit/Assert.html
	      // o método assertEquals(double expected, double actual) para floats, double foi descontinuado
	      // em seu lugar está sendo utilziado o seguinte:
	      // assertEquals(double expected, double actual, double delta)
	      // sendo double delta a margem de erro para o cálculo

	      assertEquals(resultado_esperado, resultado_obtido, 0.0f);

	}
	   
	@Test
	   public void testJurosSimplesZero() {

	      //TestCase 2: ([16000, 0.005, 0, JuroSimples]0)
	      //Capital Inicial: R$ 16.000,00
	      //Taxa de Juros: 0.05/ano
	      //Tempo aplicado: 0 anos


	      // Atribuição de valores para o Teste Case 2
	      float capital = 16000f;
	      float taxa = 0.005f;
	      float periodo = 0f; // tempo determinado em anos


	      // Resultado Esperado para o TestCase 2
	      float resultado_esperado = 0f;

	      // Retorno do método de JuroSimples para o TC2
	      float resultado_obtido = Calculo.JuroSimples(capital, taxa, periodo);

	      // Segundo o site do JUnit - https://junit.org/junit4/javadoc/4.12/org/junit/Assert.html
	      // o método assertEquals(double expected, double actual) para floats e double foi descontinuado
	      // em seu lugar está sendo utilizado o seguinte:
	      // assertEquals(double expected, double actual, double delta)
	      // sendo double delta a margem de erro para o cálculo

	      assertEquals(resultado_esperado, resultado_obtido, 0.0f);

	   }
}
