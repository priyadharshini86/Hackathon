import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FirstAPI {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("C:\\Users\\saravanan_srithar\\eclipse-workspace\\Day1\\first.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String str;
			str=br.readLine();
			
		Scanner input = new Scanner(System.in);
		System.out.println("T:Print total words in the given text file");
		System.out.println("S:Print all the special characters");
		System.out.println("I:Print all the Integeres");
		System.out.println("R:Print all the repeated words in the file");
		System.out.println("ALL:Print full context of the text file");
		System.out.println("EXIT:Stop the program");
		char userinput='N';
		while(userinput!='E') {
		System.out.println("Provide an input");
		String temp=input.nextLine();
		userinput=temp.charAt(0);
		userinput = Character.toUpperCase(userinput);
		if(userinput=='E')
			break;
		else {
		switch (userinput){
		case 'T':
		{
			int length=str.length();
	        char ch[]=new char[length];
	        for (int i = 0; i < length; i++) {
	            ch[i] = str.charAt(i);
	        }
	        int i=0;
	        int count_w=0;
	        char SPACE=' ';
	        while(ch[i]!='*') {
	        	if (ch[i]==SPACE)
	        		count_w++;
	        i++;	
	        }
	            
	            System.out.println("The number of words in the String are :  "+count_w);
	            break;
		}
		case 'S':
		{
			String s1=str;
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				char c=s1.charAt(j);
				if(!Character.isJavaLetterOrDigit(c)&& !Character.isSpace(c))
					System.out.print(c+" ");
			}
			System.out.println();
			break;
		}
		case 'I':
			String s1=str;
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				char c=s1.charAt(j);
				if(Character.isDigit(c))
					System.out.print(c+" ");
			}
			System.out.println();
			break;
		case 'R':
		{
			s1=str;
			String s2="the";
			count=0;
			for(int j=0;j<s1.length();j++)
			{
				for(int k=0;k<s2.length();)
				{
					if(s2.charAt(k)==s1.charAt(j))
					{
						k++;
						j++;
					}
					else {
						k=0;
						for(int g=j;g<s1.length();g++)
						{
							if(s1.charAt(g)==' ')
							{
								j=g+1;
								break;
							}
							if(g==s1.length()-1)
								k=s2.length()+10;
						}
					}
					if(k==s2.length())
						count++;
				}
			}
			System.out.println("number is :"+count);
			break;
		}
		case 'A':
			System.out.println(str);
			break;
		}
		}
		}
			
		br.close();
		}catch (IOException e) {
			out.println("File not found");
			}
		
		}
}
