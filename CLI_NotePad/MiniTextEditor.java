// Nothing more nothing less , this is a relatively small text editor

import java.io.*;


class MiniTextEditor {
	
	public static void main (String argx []) throws IOException {

	 // Will use the BufferedReader class to read the characters as they are being typed from the console
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

	String characters[] = new String [200];

	int i = 0;  

	System.out.printf("Enter the text you would like to type\n");

	System.out.printf("When done typing, type 'done' to exit\n");
	
	
	while (i<= 101) {
		
		characters[i] = br.readline();
		if(characters[i].equals("stop")) break;
		
		System.out.println(characters[i]);
	}


	}








	
	
}



	





