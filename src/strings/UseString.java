package strings;

public class UseString {
	
	public static void main(String[] args){
		
    String str1 = "Java is a programming language";
	String str2 = "Hello";
	String str3 = "";
	String str4 = "    Hey";
	String str5 = "Hello"; 
	String str6 = "hello";
	String str7 = "java,is,a,programming,language";
      
		System.out.println("Length of the string is: " + str1.length());
		System.out.println("character at index 3 is: " + str1.charAt(3));
		System.out.println(str2.concat(" World"));
		System.out.println(str1.contains("Java"));
		System.out.println("Letter Strats with: " + str2.startsWith("H"));
		System.out.println("Letter Ends with: " + str2.endsWith("o"));
		System.out.println("Check String is empty: " + str3.isEmpty());
		System.out.println("Check String is empty: " + str2.isEmpty());
		System.out.println("Trim spaces: "+ str4.trim());
		System.out.println("Replace Eg: " + str2.replace("e", "a"));
		System.out.println("Substring method1: " + str1.substring(5));
		System.out.println("Substring method2: " + str1.substring(5, 20));
		System.out.println("Equals: " + str5.equals(str2));
		System.out.println("Index of i is: " + str1.indexOf('i'));
		
		char[] charArray = str1.toCharArray();
			for(int i = 0; i<charArray.length; i++){
				System.out.println("Index " + i + " is: " + charArray[i]);
			}
				
		System.out.println("Upper case: " + str1.toUpperCase());
		System.out.println("Lower case: " + str2.toLowerCase());
		System.out.println("Compare to:" + str5.compareTo(str6));
		System.out.println("Compare to ignore:" + str5.compareToIgnoreCase(str6) );
		
		String a[] = str7.split(",");
		for (int i = 0; i<a.length; i++){
		System.out.println(a[i]);
		}
		
	     System.out.println(str2.equalsIgnoreCase(str6));		
		
		

		
	}

}
