/*
 * Code by Raúl González Méndez
 * Version of the app (date dd/mm/yyyy): 07/07/2021
 * 
 * CONTENT README.txt-->En esta aplicacion tendremos que implementar ciertas mecánicas para demostrar que tenemos los conocimientos 
 * básicos del lenguaje java, en mi caso he optado por añadir todos los ejercicios en un mismo main separados de forma 
 * modular con ciertas separaciones de prints para indicar que ejercicio se está ejecutando.<--CONTENT README.txt*/

public class JavaBasicMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--Exercice1--Creations of variables, I have decide to use one variable int and one variable double.
		int num1 = 15;
		double double1 = 4.56;
		exercice1(num1, double1);
		//--Exercice2--Creations of variables, one variable int and one variable double.
		int num2 = 5;
		double double2 = 4.56;
		char char1 = 'a';
		exercice2(num2,double2,char1);
		//Para mostrar el valor numerico de un char, es necesario pasar a int el valor char, para ello castearemos,
		//el char como int al mostrarse por pantalla.
		//--Exercice3--Creations of variables, two variables int and two variables double.
		int val1=2,val2=3;
		double dob1=1.5,dob2=2.5;
		exercice3(val1,val2,dob1,dob2);
		//--Exercice4--Creations of variable, one variable int.
		int a=5;
		exercice4(a);
		//--Exercice5--Creations of variables, 4 variables int.
		int A=1,B=2,C=3,D=4;
		exercice5(A,B,C,D);
	}
	
	/*
	 * Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
	resta, multiplicación, división y módulo (resto de la división).
	*/
	
	public static void exercice1(int num1, double num2) {
		//Show on screen
		System.out.println("EXERCICE 1");
		System.out.println("-------------------------------------");
		System.out.println("Suma: "+(num1+num2)+"\nResta: "+(num1-num2)+"\nMultiplication: "+(num1*num2)
				+"\nDivide: "+(num1/num2)+"\nModule: "+(num1%num2));
		System.out.println("-------------------------------------");
		
	}
	
	/*
	 * Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int ,
	una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
	*/
	
	public static void exercice2(int num1, double num2, char char1) {
		//Show on screen
		System.out.println("EXERCICE 2");
		System.out.println("-------------------------------------");
		System.out.println("Variables: Int: "+num1+" Double: "+num2+" Char: "+char1);
		System.out.println("Suma: "+(num1+num2)+"\nResta: "+(num1-num2)+"\nValor Numerico: "+(int)char1);
		System.out.println("-------------------------------------");
	}
	
	/*
	 * Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int ,
	dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por
	*/
	
	public static void exercice3(int val1, int val2, double dob1, double dob2) {
		//Show on screen
		System.out.println("EXERCICE 3");
		System.out.println("-------------------------------------");
		System.out.println("Variables: Int1: "+val1+" Int2: "+val2+" Double1: "+dob1+" Double2: "+dob2);
		System.out.println("Int1+Int2: "+(val1+val2)+"\nInt1-Int2: "+(val1-val2)+"\nInt1*Int2: "+(val1*val2)+"\nInt1/Int2: "+(val1/val2)+"\nInt1%Int2: "+(val1%val2));
		System.out.println("Double1+Double2: "+(dob1+dob2)+"\nDouble1-Double2: "+(dob1-dob2)+"\nDouble1*Double2: "+(dob1*dob2)+"\nDouble1/Double2: "+(dob1/dob2)+"\nDouble1%Double2: "+(dob1%dob2));
		System.out.println("Int1+Double1: "+(val1+dob1)+"\nInt2/Double2: "+(val2-dob2)+"\nInt2%Double2: "+(val2%dob2));
		System.out.println("Variables x 2: Int1: "+val1*2+" Int2: "+val2*2+" Double1: "+dob1*2+" Double2: "+dob2*2);
		System.out.println("Suma Total: "+(val1+val2+dob1+dob2));
		System.out.println("Producto Total: "+(val1*val2*dob1*dob2));
		System.out.println("-------------------------------------");
	}
	
	/*
	 * Escribe un programa Java que declare una variable entera N y asígnale un valor. A
	continuación escribe las instrucciones que realicen los siguientes
	*/
	
	public static void exercice4(int a) {
		//Show on screen
		System.out.println("EXERCICE 4");
		System.out.println("-------------------------------------");
		System.out.println("Valor inicial de a: "+a);
		System.out.println("a + 77 = "+(a+=77));
		System.out.println("a - 3= "+(a-=3));
		System.out.println("a * 2= "+(a*=2));
		System.out.println("-------------------------------------");
	}
	
	/*
	 * Programa java que declare cuatro variables enteras A, B, C y D y
	asígnale un valor a cada una. A continuación realiza las instrucciones
	*/
	
	public static void exercice5(int A, int B, int C, int D) {
		//Show on screen before operate
		System.out.println("EXERCICE 4");
		System.out.println("-------------------------------------");
		System.out.println("Valores iniciales de A,B,C,D: "+A+" "+B+" "+C+" "+D);
		B=C;
		C=A;
		A=D;
		D=B;
		//Show on screen after operate
		System.out.println("Valores finales de A,B,C,D: "+A+" "+B+" "+C+" "+D);
		System.out.println("---------------FINAL-----------------");
	}
	
}
