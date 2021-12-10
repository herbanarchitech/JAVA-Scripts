// Nothing more nothing less , this is a relatively small text editor that read at most 200 lines of text .
// All this was done using Vim :)

import java.io.*;

class MiniTextEditor {
	
	public static void main (String[] argx) throws IOException {

	 // Will use the BufferedReader class to read the characters as they are being typed from the console
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in , System.console().charset()));
	

	String characters[] = new String [200];

	int i = 0;  

	int j = 0 ;

	System.out.printf("Enter the text you would like to type\n");

	System.out.printf("When done typing, type 'done' to exit\n");
	
	
	//these lines of code will be used as the user is typing along until  they type the character string "stop"

	while (i < 200) {
		
		characters[i] = br.readLine();
		if(characters[i].equals("stop")) break;
		
	//	System.out.println(characters[i]);  // don't need this ; Probably explains the bug in the code

		i++;
	}

	// this will output the text 
	
	System.out.println("Here is the typed file");

	



	 while (j < 200 ) {

		if(characters[j].equals("stop")) break;

		System.out.println(characters[j]);
		j++;



	}

}

}



	





