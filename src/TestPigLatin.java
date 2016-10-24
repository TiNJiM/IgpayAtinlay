import java.io.*;
import java.util.*;
public class TestPigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1 = new Scanner (System.in);
		System.out.print("Please enter phrase for translation: ");
		String input = n1.nextLine();
		String pigLatin = PigLatin.translate(input);
		System.out.println(pigLatin);
	}

}
