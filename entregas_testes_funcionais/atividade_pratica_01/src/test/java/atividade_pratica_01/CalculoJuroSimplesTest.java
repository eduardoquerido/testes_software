package atividade_pratica_01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;;

// Intervalo de Tempo entre 0 a 12 meses
class CalculoJuroSimplesTest {

	@Test
	public void testJuroSimplesParticaoA() {
      // Partição A - Teste Válido no intervalo [0, 12]
		
      //TestCase 1 - ([1600, 0.005, 4, JuroSimples]320)
      //Capital Inicial: R$ 1.600,00
      //Taxa de Juros: 0.07/mês
      //Tempo aplicado: 4 meses
	
      // Atribuição de valores para o Teste Case 1
      float capital = 1000f;
      float taxa = 0.07f;
      float periodo = 4f; // tempo determinado em MESES
      
      //Resultado Esperado do TestCase 1
      float resultado_esperado = 280f;
      //Retorno do método de JuroSimples para TC1
      float resultado_obtido = CalculoJuroSimples.JuroSimples(capital, taxa, periodo);
      // assertEquals(double expected, double actual, double delta)
      assertEquals(resultado_esperado, resultado_obtido);
}
	
	
	@Test
	public void testJuroSimplesParticaoB() {
		// Partição B - Teste Inválido no intervalo ]-1, -inf]
		
		//TestCase 2 - ([3200, 0.10, -6, JuroSimples]0)
	    //Capital Inicial: R$ 3.200,00
	    //Taxa de Juros: 0.10/mês
        //Tempo aplicado: -6 meses
		
	      // Atribuição de valores para o Teste Case 1
	      float capital = 3200f;
	      float taxa = 0.1f;
	      float periodo = -4f; // tempo determinado em MESES
	      
	      //Resultado Esperado do TestCase 1
	      float resultado_esperado = 0f;

	      //Retorno do método de JuroSimples para TC1
	      float resultado_obtido = CalculoJuroSimples.JuroSimples(capital, taxa, periodo);

	      // assertEquals(double expected, double actual, double delta)
	      assertEquals(resultado_esperado, resultado_obtido);
	}
	
	
	@Test
	public void testJuroSimplesParticaoC() {
		// Partição C - Teste Inválido no intervalo [13, +inf[
		
		//TestCase 3 - ([4400, 0.5, 15, JuroSimples]0)
	    //Capital Inicial: R$ 3.200,00
	    //Taxa de Juros: 0.05/mês
        //Tempo aplicado: 15 meses
		
	      // Atribuição de valores para o Teste Case 1
	      float capital = 4400f;
	      float taxa = 0.5f;
	      float periodo = 15f; // tempo determinado em MESES
	      
	      //Resultado Esperado do TestCase 1
	      float resultado_esperado = 0f;

	      //Retorno do método de JuroSimples para TC1
	      float resultado_obtido = CalculoJuroSimples.JuroSimples(capital, taxa, periodo);

	      // assertEquals(double expected, double actual, double delta)
	      assertEquals(resultado_esperado, resultado_obtido);
	}

}
