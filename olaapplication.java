import java.util.Scanner;
class olaapplication
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		oladriver od=new oladriver();
		for(;;)
		{
			System.out.println("1.add 2.remove 3.book 4.payment 5.exit");
			switch(sc.nextInt())
			{
				case 1:
				od.addaccount();
				break;
				case 2:
				od.removeaccount();
				break;
				case 3:
				od.bookcab();
				break;
				case 4:
				od.payment();
				break;
				case 5:
				System.out.println("Application is closed");
				System.exit(0);
			}
		}
	}
}