public class Q4
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			System.out.println("Veuillez fournir le nombre de lignes en paramètre.");
			return;
		}

		try
		{
			int nombreLignes = Integer.parseInt(args[0]);

			for (int i = 1; i <= nombreLignes; i++)
			{
				for (int j = 1; j <= i; j++)
				{
					System.out.print("*");
				}

				System.out.println();
			}
		}
		catch (NumberFormatException e)
		{
			System.out.println("Veuillez entrer un nombre valide.");
		}
	}
}
