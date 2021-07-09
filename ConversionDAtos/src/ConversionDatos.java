
public class ConversionDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Tipos de datos en JAVA:
		 * Numericos: byte, short, int, long, float, double
		 * Booleanos: boolean (verdadero y falso)
		 * Caracteres:char1
		 */
		
		/*
		 * byte 8 bits
		 * short 16 bits
		 * int 32 bits
		 * long 64 bits
		 */

//	Para convertir los numeros se tiene que hacer de manera jerarquica
//	A esto se le llama conversion automatica	
		int numero1 = 1000;
		long numero2 = numero1;
		float numero3 = numero2;
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		
//	Casteo, el numero que se convierte debe poder entrar en el numero que se
//	quiere añmacenar
		long numero5 = 1000;
		//Cast
		int numero = (int) numero5;
		
		System.out.println(numero);
	}

}
