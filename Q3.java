public class Q3
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.out.println("Veuillez fournir le nombre d'étoiles en paramètre.");
			return;
		}

		try
		{
			int nombreEtoiles = Integer.parseInt(args[0]);

			for (int i = 0; i < nombreEtoiles; i++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
		catch (NumberFormatException e)
		{
			System.out.println("Veuillez entrer un nombre valide.");
		}
	}
}
