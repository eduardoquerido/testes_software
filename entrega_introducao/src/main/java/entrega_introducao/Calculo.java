package entrega_introducao;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static float JuroSimples(float capital, float taxa, float periodo) {
		if (capital == 0f || taxa == 0f || periodo == 0f) {
			return 0f;
		}else {
			return capital * taxa * periodo;
		}
   }

}
