
	public static void main (String[] args) throws java.lang.Exception
	{
		int word=1;
		String sc;
		Scanner s=new Scanner(System.in);
		sc=s.nextLine();
		for(int i=0;i<sc.length();i++)
		{
			if(sc.charAt(i)==' ')
			word++;
		}
			System.out.println(word);

			
		
	}
}
