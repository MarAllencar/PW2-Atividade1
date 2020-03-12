
public class ExercicioDois {

	public static boolean possoIrBanco(String dia, int hora)
	{
		if( ExemploUm.ehDiaSemana(dia) && hora > 10 && hora < 16)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		boolean retorna = possoIrBanco("domingo",11);
		System.out.println(retorna);
	}
}
