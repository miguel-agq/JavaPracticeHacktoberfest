package capitulo.dos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String ln = "a";
//
//		char c = 0;
//		System.out.println("introduce un caracter");
//
//		try {
//			c = (char) System.in.read();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		System.out.println("el caracter es: " + c);
//
//		System.out.println("introduce una cadena");
//
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader buff = new BufferedReader(isr);
//		try {
//			ln = buff.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("la cadena es: " + ln);

		int a = 10, b = 0, c;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
			//return;
		}
		System.out.println("Resultado:" + c);
	}

//	}

}
