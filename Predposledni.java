import java.util.*;
 public class Predposledni {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
	 String[] words = line.split("[ ]+");
	 System.out.println("Predposledni slovicko: "+words[words.length - 2]);
	 }			
}