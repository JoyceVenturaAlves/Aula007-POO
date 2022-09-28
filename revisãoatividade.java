import java.util.Scanner;

public class Revisaoatividade {

	public static void main(String[] args) {
		//Scanner entrada = new Scanner (System.in);
		//int nota;
		//System.out.println("Digite a primeira nota:");
		//nota = entrada.nextInt();
		//System.out.println("Digite a segunda nota:");
		//nota = entrada.nextInt();
		//System.out.println("Digite a terceira nota:");
		//nota = entrada.nextInt();
		//if(nota = nota1+nota2+nota3/3>=7 ) {
		//}System.out 
		//String nome = "Walter Travassos Sarinho";
		//String primeiro = nome.substring(0, nome.indexOf(" "));
		//String Ultimo = nome.substring(nome.lastIndexOf(" "));
		//System.out.println("Primeiro nome: " +primeiro);
		//System.out.println("Ultimo nome: "+ Ultimo);}//
		
		
		//System.out.println("Digite o código da comida:");
		//Scanner teclado = new Scanner (System.in);
		// int escolha = teclado.nextInt();
	    
	    //  switch(escolha) {
	    // case 1:
	    	//	System.out.println("Pizza");
	    	//	break;
	    	//  case 2:
	    	// 	System.out.println("Hamburguer");
	    	// 	break;
	    	//  case 3:
	    	//	System.out.println("refrigerante");
	    	//	break;
	    	// case 4:
	    	//System.out.println("Batata Frita");
	    	//break;
	    	// 	default: System.out.println("Produto não cadastrado!");
	    		
	    	
		
		//System.out.println("Digite um numero:");
		//Scanner teclado = new Scanner (System.in);
		//int escolha = teclado.nextInt();
	    
		// switch(escolha) {
		//case 1:
		//System.out.println("inverno");
		//	break;
		// case 2:
		//	System.out.println("primavera");
		//	break;
		// case 3:
		//	System.out.println("verão");
		//	break;
		// case 4:
		//System.out.println("Outono");
		//break;
		// 	default: System.out.println("opção invalida");
		
		//Scanner entrada = new Scanner (System.in);
		//int codigo,quantidade; = entrada.nextInt();
		//System.out.println("Digite o codigo ea quantidade do produto: ");
		//codigo = entrada.nextInt();
		//quantidade = entrada.nextInt();
		//switch(codigo) {
		//case 0:
		//System.out.println("Cachorro Quente");
		//System.out.println("TOTAL : R$ " + (1.50 * quantidade));
		//	break;
		//case 1:
		//	System.out.println("Refrigerante");}
		//    System.out.println("TOTAL : R$ " + (2.00 * quantidade));
		//    break;
		//    default : System.out.println("produto inexistente ");
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite dois numeros:");
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		System.out.println("Qual operação deseja executar?");
		System.out.println("1 - adição. 2 - subtração 3 - multiplicação. 4 - divisão ");
		int codigo = entrada.nextInt();
				switch(codigo) {
				case 1 : System.out.println("Adição");
				System.out.println("a + b");
				break;
				case 2 : System.out.println("subtração");
				System.out.println("a - b");
				break;
				case 3 : System.out.println("multiplicação");
				System.out.println("a * b");
				break;
				case 4 : System.out.println("Divisão");
				System.out.println("a / b");
				break;
				default : System.out.println("Opção invalida ");
				
				
				}
		
		
		
		
		
		
		
		
		
		
	    	}
	    }
		
		
	} 

