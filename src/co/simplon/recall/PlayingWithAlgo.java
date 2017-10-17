package co.simplon.recall;

import java.util.*;

public class PlayingWithAlgo {
	
	public static String helloWorld(String name) {//_______________________________________________________OK
		
		String message;
		
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) { //____________________________________OK
		
		ArrayList<String> maListeDeChaine = new ArrayList<String>();
			for (int i = 0; i < array.length ; i ++) {
				if (array[i].indexOf("a")==0) {
					maListeDeChaine.add(array[i].toString());
				}
			}
		return maListeDeChaine;
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) { //__________________________________________________________________________________________OK
		
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < array.length; i ++) {
			if(array[i] != null) {
				if (array[i].indexOf("a")==0 || array[i].indexOf("e")==0 || array[i].indexOf("i")==0 || array[i].indexOf("o")==0 || array[i].indexOf("u")==0 || array[i].indexOf("y")==0){
					result.add(array[i].toString());
				}
			}
		}
		return result;
	}

	public static String[] removeNullElements(String array[]) { //________________________________________________________________________________OK
		
		// Variable pour calculer le nombres de null afin d'initialiser la longueur du tableau de retour
		int nombreDeNull=0;
		
		for (int i = 0; i < array.length; i ++) {
			if (array[i] == null) {
				nombreDeNull += 1;
			}
		}
		
		String[] result=new String[array.length - nombreDeNull];
		int j = 0; // Iterateur sur le tableau de retour
		for (int i = 0; i < array.length; i ++) {
			if (array[i] != null) {
				result[j]=array[i];
				j += 1;
			}
		}
		
		
		return result;

	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		
		ArrayList<String> result = new ArrayList<>();
		
		return null;
	}

	public static String[] reverseOrderInArray(String array[]) {
		return null;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		return null;
	}

	public static String getFirstHalf(String string) {  // ______________________________________________________________________________OK
		
		String result = "";
		
		if (string.length() % 2 == 0) { // Vérifier si la longueur chaine de caractere est paire ou impaire
			result=string.substring(0, Math.round((string.length() )/2 ));
		} else {
			result=string.substring(0, Math.round((string.length() )/2 + 1));
		}
		
		return result;
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) { //_______________________________________________OK
		
		String result = "";
		
		// Transforme le texte en tableaux de chaine avec SPLIT =  ESPACE
		String monTab[] = text.split(" ");
		
		int nombreDeLettre = monTab[0].length();
		result = monTab[0];
		
		for (int i = 1; i < monTab.length ; i ++) {
			if ( monTab[i].length() < nombreDeLettre) {
				nombreDeLettre = monTab[i].length();
				result = monTab[i];
			}
		}
		return result;
	}

	public static String longestWord(String text) { //-----------------------SPLIT IMBRIQUE A REVOIR--------------------------------
		
		String result = "";
		
		//text.replaceAll("{,.}", "");
		
		// Transforme le texte en tableaux de chaine avec SPLIT =  ESPACE
		String monTab[] = text.split("[ ,.]+");
		
		int nombreDeLettre = monTab[0].length();
		result = monTab[0];
		
		for (int i = 1; i < monTab.length ; i ++) {
			if ( monTab[i].length() > nombreDeLettre) {
				nombreDeLettre = monTab[i].length();
				result = monTab[i];
			}
		}
		return result;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}
	
	public static String removeCapitals(String text) { //_____________________________________________________________OK
		String result= "";
		
		for (int i = 0; i < text.length(); i ++) {
			if ( text.charAt(i) < 65 || text.charAt(i) > 90 ) {
				result = result + text.charAt(i);
			}
		}
		return result;
	}
	
	public static String formatDateNicely(String text) { //___________________________________________________________________________OK
		
		String result = "";
		
		// On enlève les tirets et on met met les differentes sous chaines dans un tableau
		String resultTemp[] = text.split("-"); 
		
		for (int i = 2; i >=0; i--) {
			if (i != 0) {
				result = result + resultTemp[i] + "/";
			} else {
				result = result + resultTemp[i];
			}
		}
		
		
		return result;
	}
	
	public static String getDomainName(String email) { //_______________________________________________________________OK
		
		String result= "";
		
		result= email.substring(6, email.length() - 4);
		
		return result; // A refaire quand même avec REGEX
	}

	public static String titleize(String title) { //________________________________comprends pas ce qu'il faut retourner?????????
		
		String result = "";
		result=title.toLowerCase();
		return result;
	}
	
	public static boolean checkForSpecialCharacters(String string) {
		// 48 à 57+++ 65 à 90 +++ 97 à 122
		boolean result = true;
		for ( int i =0; i< string.length()-1; i ++) {
			//if (string.charAt(i) < 48 )
		}
		return result;
	}
	
	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) { //___________________________________________________________________OK
		
		// Met toute la chaine en minuscule
		name = name.toLowerCase(); 
		// Initialise le tableau de sortie en fonction de la longueur de la chaine
		int[] result = new int[name.length()];
		// Affecte les valeurs en sachant que CHAR A = 97 jusqu'à CHAR Z=122
		for (int i = 0; i < name.length(); i ++) {
			result[i] = name.charAt(i) - 96;
		}
		
		return result;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {//__________________________________________OK
		long result = number1 + number2;
		return result;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {//___________________________OK
		long result = number1 + number2 + number3;
		return result;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		return 0;
	}

	public static int[] allElementsExceptFirstThree(int array[]) { //______________________________________________________________OK
		
		int[] result= new int[array.length - 3];
		
		for ( int i = 3; i < array.length; i ++) {
			result[i-3] = array[i];
		}
		
		return result;
	}

	public static int[] addElementToBeginning(int array[], int element) { //_______________________________________________________OK
		
		int result[] = new int[array.length + 1];
		
		result[0] = element;
		for (int i = 1; i < result.length; i ++) {
			result[i] = array[i - 1];
		}
		
		
		
		return result;
	}

	public static Float makeNegative(Float number) {//_________________________________________________________________________________OK
		Float result=number;
		if (number > 0) {
			result=result*(-1);
		} 
		return result;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		return null;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		return null;
	}
	
	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	public static int roundUp(float number) {//__________________________________________________________________________OK
		int result=Math.round(number);
		return result;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) { //____________________________________________________________________________OK
		int nombre=1;
		if (number>1) {
		nombre=number*factorial(number-1);
		}
	
		return nombre;
	
	}

	public static int convertToCelsius(int temperature) { //_______________________ A REFAIRE
		
		return 0;
		
	
	}
	
	public static boolean checkIfPair(int number) {//____________________________________________________________________OK
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) { //___________________________OK
		if (number1 % 2 == 0 && number2 % 2 == 0 && number3 % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) { //______________________________________OK
		int result = number1 + number2 + number3;
		if (result % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkIfAllElementsPair(int[] array) {//__________________________________________________________OK
		boolean boucle = true;
		
		for (int i = 0; i < array.length; i ++) {
			if (array[i] % 2 != 0) {
				boucle= false;
				break;		
			}
		}
		
		return boucle;
	}
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		
		ArrayList<Integer> monArrayList=new ArrayList<Integer>(); //_______________________________________________OK
		for ( int i = 0 ; i < array.length; i ++) {
			if ( array[i] % 2 == 0) {
				monArrayList.add(array[i]);
			}
		}
		return monArrayList;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {//________________________________ OK
		ArrayList<Integer> monArrayList=new ArrayList<Integer>(); 
		for ( int i = 0 ; i < array.length; i ++) {
			if ( array[i] % 2 == 0 &! monArrayList.contains(array[i])) {
				monArrayList.add(array[i]);
			}
		}
		return monArrayList;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {//________________________________________________OK
		int carreCote1= number1*number1;
		int carreCote2= number2*number2;
		int carreCote3= number3*number3;
		
		
		if ((carreCote1 + carreCote2) == carreCote3 || (carreCote2 + carreCote3) == carreCote1 || (carreCote1 + carreCote3) == carreCote2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkSiTuPeuxAcheter(int prix) {//___________________________________________________________________________________OK
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		if (prix % 2 == 0 && prix <= 22) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkCase1(double prix, int pourcentDeRemise) {//_________________________________________________________________________OK
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		int argentDeDepart=100;
		int prixFinal= (int)(prix - (prix * pourcentDeRemise / 100));
		if (argentDeDepart > prixFinal) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkCase2(int number1, int number2) {//_______________________________________________________________________________OK
		// check si une de 2 chiffres, ou leur somme se divise par 7
		if ((number1 % 7) == 0 || (number2 % 7) == 0 || ((number1 + number2) % 7) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkCase2a(int number1, int number2) { //_____________________________________________________________________________OK
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		int somme = number1 + number2;
		if ((number1 % 7 == 0 || number2 % 7 == 0) && (somme % 7 != 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean checkCase3(int number1, int number2, int number3) {//___________________________________________________________________OK
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		if ((number1 > number2  && number2 > number3) || (number3 > number2  && number2 > number1)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {//__________________________________________________________OK
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 1; i < array.length - 	1; i ++) {
			result.add(array[i]);
		}

		return result;
	}
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {//__________________________________________COMPRENDS PAS POURQUOI CA MARCHE PAS
		int[] monTab=new int[array.length-2];
		for ( int i = 0 ; i < monTab.length ; i++) {
			monTab[i]=array[i+1];
		}
		return monTab;
	}
	
	
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) { //_____________________________________________________________OK
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length; i ++) {
			if (i % 2 == 0) {
				result.add(array[i]);
			}
		}
		return result;
	}

		
	
	
	public static ArrayList<Integer> reverseOrder(int array[]) {
		
		
		
		return null;
	}
	
	public static int[] reverseOrderInt(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) { //____________________________________________OK
	
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		// Calcul de la moitié de la longueur du tableau
		int moitieTableau = array.length / 2; 
		
		for (int i = 0 ; i < moitieTableau; i++) {
			result.add(array[i]);
		}
		
		result.add(element);
		
		for (int i = moitieTableau; i < array.length; i++) {
			result.add(array[i]);
		}
		
		return result;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) { //___________________________________________________OK
		
		ArrayList<Integer> monTab = new ArrayList<Integer>();
		for (int i = 0 ; i < list.size() ; i++) {
			if (list.get(i) % 2 == 0 && list.get(i) >= 0) {
				monTab.add(list.get(i));
			}
		}
		return monTab;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) { //___________________________________________OK
		
		ArrayList<Integer> monTab = new ArrayList<Integer>();
		for (int i = 0 ; i < list.size() ; i++) {
			if (i % 2 == 0) {
				monTab.add(list.get(i));
			}
		}
	return monTab;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {//----------------------A REVOIR AVEC INTERNET ASHMAP
		
		int result = 0;
		
		for ( int i = 0; i < addition.size(); i ++) {
			//result = result;
		}
		
		return result;
	}
	
	public static boolean checkIfStringStartsWithA( String word ) { //____________________ voir pour amélioration ___________________________OK
		
		boolean result = true;
		
		if (word.indexOf("a") == 0 || word.indexOf("A") == 0) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) { //---------------------------- A REVOIR AVEC INTERNET MAJ MIN ---------------------
		
		boolean result = true;
		
		if (word.toLowerCase().indexOf("a") == 0 || word.toLowerCase().indexOf("e") == 0 || word.toLowerCase().indexOf("i") == 0 || word.toLowerCase().indexOf("o") == 0 || word.toLowerCase().indexOf("u") == 0 || word.toLowerCase().indexOf("y") == 0) {
			result = true;
		}
		
		return result;
		
	}
	
	public static boolean checkIfStringEndsWithS( String word ) { //____________________________________________________________________________OK
		
		boolean result = true;
		
		if (word.lastIndexOf("s") == word.length()-1 || word.lastIndexOf("S")==word.length()-1) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	public static String findShortestWord(String[] array ) { //____________________________________________________________________________________OK
		
		String result="";
		String dernierMot = array[array.length - 1];
		int longueurMotLePlusCourt = dernierMot.length();
			for (int i = array.length - 1; i>= 0; i --) {
				if (array[i].length() <= longueurMotLePlusCourt) {
					longueurMotLePlusCourt = array[i].length();
					result = array[i];
				}
			}
		
		
		return result;
	}
	
	public static String swapFirstandLastLetter(String array ) { //______________________________________________________________________________OK
		
		String result = "";
		
		char c1 = array.charAt(0);
		char c2 = array.charAt(array.length()-1);
		
		result = result + c2 + array.substring(1, array.length() - 1) + c1;
		
		return result;
	}
	
	public static int[] swapFirstandLastElement(int[] array ) { //_________________________________________________________________OK
		
		int[] result = new int[array.length];
		
		for ( int i = 0; i < array.length; i ++) {
			if (i == 0) {
				result[i]=array[array.length - 1];
			} else if (i==array.length - 1){
				result[i] = array[0];
			} else {
				result[i] = array[i];
			}
		}
		
		return result;
	}

}
