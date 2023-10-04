import java.util.Scanner;
class oladriver
{
	ola o;
	account a;
	Scanner sc=new Scanner(System.in);
	public void addaccount()
	{
		if(a==null)
		{
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter Address");
			String address=sc.next();
			a=new account(name,address);
			System.out.println("Login Completed " + (char)3);
		}
		else
		{
			System.out.println("Account is already exists");
		}
	}
	public void removeaccount()
	{
		if(a==null)
		{
			System.out.println("Please make a login process");
		}
		else
		{
			a=null;
			System.out.println("Account is removed");
		}
		
	}
	public void bookcab()
	{
		if(a==null)
		{
			System.out.println("Please make a login process");
		}
		else
		{
			System.out.println("1.mini 2.prime 3.sweden");
			{
				switch(sc.nextInt())
				{
					case 1:
					{
						System.out.println("Enter from");
						String from=sc.next();
						System.out.println("Enter to");
						String to=sc.next();
						System.out.println("Enter km");
						int km=sc.nextInt();
						o=new mini(from,to,km);
						System.out.println("You have choosed mini");
						System.out.println("1.confirmation 2.cancel");
						if(sc.nextInt()==1)
						{
							payment();
						}
						else
						{
							o=null;
							System.out.println("Cab is cancelled");
						}
					}
					break;
					case 2:
					{
						System.out.println("Enter from");
						String from=sc.next();
						System.out.println("Enter to");
						String to=sc.next();
						System.out.println("Enter km");
						int km=sc.nextInt();
						o=new prime(from,to,km);
						System.out.println("You have choosed prime");
						System.out.println("1.confirmation 2.cancel");
						if(sc.nextInt()==1)
						{
							payment();
						}
						else
						{
							o=null;
							System.out.println("Cab is cancelled");
						}
					}
					break;
					case 3:
					{
						System.out.println("Enter from");
						String from=sc.next();
						System.out.println("Enter to");
						String to=sc.next();
						System.out.println("Enter km");
						int km=sc.nextInt();
						o=new sweden(from,to,km);
						System.out.println("You have choosed sweden");
						System.out.println("1.confirmation 2.cancel");
						if(sc.nextInt()==1)
						{
							payment();
						}
						else
						{
							o=null;
							System.out.println("Cab is cancelled");
						}
					}
					break;
				}
			}
		}
	}
	public void payment()
	{
		if(o instanceof mini)
		{
			mini m=(mini)o;
			int money=m.km*m.price;
			System.out.println(m.from);
			System.out.println(m.to);
			System.out.println("total = " +money);
			System.out.println("1.payment 2.cancel");
			if(sc.nextInt()==1)
			{
				System.out.println("Enter ammount");
				int amount=sc.nextInt();
				if(amount>=money)
				{
					System.out.println("cab is confirmed");
				}
				else{
					o=null;
					System.out.println("Cab is cancelled");
				}
			}
		}
	
		if(o instanceof prime)
		{
			prime m=(prime)o;
			int money=m.km*m.price;
			System.out.println(m.from);
			System.out.println(m.to);
			System.out.println("total = " +money);
			System.out.println("1.payment 2.cancel");
			if(sc.nextInt()==1)
			{
				System.out.println("Enter ammount");
				int amount=sc.nextInt();
				if(amount>=money)
				{
					System.out.println("cab is confirmed");
				}
				else{
					o=null;
					System.out.println("Cab is cancelled");
				}
			}
		}
			if(o instanceof sweden)
		{
			sweden m=(sweden)o;
			int money=m.km*m.price;
			System.out.println(m.from);
			System.out.println(m.to);
			System.out.println("total = " +money);
			System.out.println("1.payment 2.cancel");
			if(sc.nextInt()==1)
			{
				System.out.println("Enter ammount");
				int amount=sc.nextInt();
				if(amount>=money)
				{
					System.out.println("cab is confirmed");
				}
				else{
					o=null;
					System.out.println("Cab is cancelled");
				}
			}
		}

	}
}
