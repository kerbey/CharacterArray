import javax.swing.JOptionPane;


public class CharacterArray1
{
	static String alphaNumeric;
	static char[] array1;

	public static String input()
	{
		return alphaNumeric=JOptionPane.showInputDialog(null, " enter in a string");
		//window pops up and says to enter the string
	}

	public static char[] arrayOfCharacter()
	{
		System.out.println("This is inputed original string:"+"\""+input()+"\"");
		System.out.println("-------");
		
		array1= new char[alphaNumeric.length()];
		for (int character=0;character<alphaNumeric.length();character++)
		{
			array1[character]=alphaNumeric.charAt(character);
		}//string gets place in array
		return array1;
	}

	public static void checkString()
	{
		char[] array2=arrayOfCharacter();
		for (int character=0;character<array2.length;character++)// for loop goes through array to see which
		//characters are letters or integers
		{
			if (array2[character]=='1'||array2[character]=='2'||array2[character]=='3'||array2[character]=='4'
			||array2[character]=='5'||array2[character]=='6'||array2[character]=='7'||array2[character]=='8'
			||array2[character]=='9'||array2[character]=='0')
			{//numbers get turned to *
				System.out.println(array2[character]+" is a digit");
				System.out.println("*");
				System.out.println("-------");
			}
			else 
			{//upper case letters get turned to lower case
				System.out.println(array2[character]+" is a character");
				System.out.println("--------");
	            if(Character.isUpperCase(array2[character])) 
				{
					System.out.println("original character is "+array2[character]+
					"\noriginal character converted "+Character.toLowerCase(array2[character]));
					System.out.println("-------");
				}
	            else 
	            {// lower case letters get turned to upper case 
	            	System.out.println("original character is "+array2[character]+
							"\noriginal character converted "+Character.toUpperCase(array2[character]));
	            	System.out.println("-----");
	            }
			}
		}
	}
}
