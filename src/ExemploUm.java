public class ExemploUm 
{
	public static boolean ehDiaSemana(String dia)
	{
		if(dia.equalsIgnoreCase("Domingo") || dia.equalsIgnoreCase("Sabado"))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) 
	{
		boolean diaValido = ehDiaSemana("Domingo");
		System.out.println("é dia semana: " + diaValido);
	}
}
