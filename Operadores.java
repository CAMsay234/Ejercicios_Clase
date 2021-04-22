public class Operadores{
	public static void main(String[] args) {
		//declaracion de variable

		int numero1 = 40;
		int numero2 = 60;
		double numero3 = 60^40;
		long numero4 = numero2/numero1;
		double numero5 =  numero1 % numero2;
		boolean numero6 = numero3 == numero5;
		double numero7 = numero4* (numero1 + numero3);

		System.out.println(numero1 + numero2);
		System.out.println(numero1 - numero2);
		System.out.println(numero1 * numero2);
		System.out.println(numero2>numero1);
		System.out.println(numero4);
		System.out.println(numero2< numero1);
		System.out.println(numero3);
		System.out.println(numero5);
		System.out.println(numero5 >= numero4);
		System.out.println(numero3 == numero5);
		System.out.println(numero5 >= numero4&&numero2>numero1);
		System.out.println(!numero6);
		System.out.println(numero4 + numero5); 
		System.out.println(numero1* (numero4 - numero2));
		System.out.println(numero7);
		System.out.println(numero7 + (numero1*numero2)/numero1);
		System.out.println(numero4 - (numero7 - (numero7 * numero4)));
		System.out.println(numero3 + (numero3 * numero4));
		System.out.println(numero7 / numero4);
		System.out.println(numero7 < numero3);




	}
}