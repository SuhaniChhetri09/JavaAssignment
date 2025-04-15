// Java program that demonstrates the String operations
class operations
{
public static void main (String[] args)
{  
      //creating strings
String s1= "Hello World";

//printing strings
System.out.println(" Original String : " + s1);

//creating strings using new keyword
String s2=new String ("Java");

//length of string
System.out.println(" Length : " + s1.length());

//converting string to uppercase
System.out.println(" Uppercase :" + s1.toUppercase());

//converting string to lowercase
System.out.println(" Lowercase : " + s1.toLowercase());

//concatenation of strings
System.out.println(" Concatenated String : " +s1.concat(" "+ s2));

//comparing two strings using equal
System.out.println(s1.equals(s2));

//comparing two strings using compareto
System.out.println(s1.compareto(s2));

//finding a character at a specific strings
System.out.println(" Character at index 4 : " +s1.charAt(4));

//finding a specific  character using indexof
System.out.println(" Index of 'o' : " +s1.indexof(o));

//finding a specific character using lastindexof
System.out.println(s1.lastindexof('o'));

//extracting a substring from a string
System.out.println(" Substring from index 6 : " + s1.substring(6));

//replacing a character in a string
System.out.println(" Replaced string : " + s1.replace("World", "Java"));
}
}