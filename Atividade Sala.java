import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    String salaDesejada = "A219";
	    String salaInformada = "";
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Digite o número da sala:\n ");
	    salaInformada = scanner.next();
	    
	    if(salaDesejada.equals(salaInformada)){
          System.out.println("Você encontrou a sala!");	
	    }
	     else{
	         System.out.println("Você esta perdido! \nSe encontre!");
	     }
	    scanner.close();
	    
	}
}