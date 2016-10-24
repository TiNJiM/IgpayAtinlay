
public class PigLatin {
	private PigLatin () {	
	}
	private static int findFirstVowel(String input) {
		input = input.toLowerCase();
		char li[] = input.toCharArray();
		char vw[] = {'a','e','i','o','u'};
		int c;
		int c2;
		for (c = 0; c < li.length; c++) {
			char check = li[c];
			for (c2 = 0; c2 < vw.length; c2++) {
				char vowelCheck = vw[c2];
				if (check == vowelCheck) {
					return c;
				}
				else {
					
				}
			}
		}
		return 0;
	}
	private static String translateWord(String input) {
		String ans = "";
		int vowel = PigLatin.findFirstVowel(input);
		if (vowel == 0 || vowel == -1) {
			ans = input.concat("yay");
			return ans;
		}
		else {
			String begin = input.substring(0,vowel);
			String end = input.substring(vowel);
			String prep = end.concat(begin);
			ans = prep.concat("ay");
			return ans;
		}
	}
	public static String translate (String words) {
		words = words.toLowerCase();
		String pl[] = words.split("\\s+");
		String ans = "";
		String unTransWord = "";
		String transWord = "";
		for (int count = 0; count < pl.length; count++) {
			unTransWord = pl[count];
			transWord = PigLatin.translateWord(unTransWord);
			if (count == pl.length-1) {
				ans = ans.concat(transWord);
			}
			else {
				ans = ans.concat(transWord + " ");
			}
		}
		return ans;
	}
}
