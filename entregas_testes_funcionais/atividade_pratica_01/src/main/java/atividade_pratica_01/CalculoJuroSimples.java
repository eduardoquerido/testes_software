package atividade_pratica_01;

public class CalculoJuroSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static float JuroSimples(float capital, float taxa, float periodo) {

			if (periodo < 0f || periodo > 12 || capital < 0f || taxa < 0f) {
				return 0f;
			}
			else{
				return capital * taxa * periodo;
		}
	}
}