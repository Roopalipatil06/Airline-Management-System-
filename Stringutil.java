package AirlineManagementSystem;

public class Stringutil {
	    // Method to count occurrences of a character in a string
	    public static int countOccurrences(String str, char ch) {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ch) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Method to reverse a given string
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }

	    // Method to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        String reversed = reverseString(str);
	        return str.equals(reversed);
	    }

	    // Method to capitalize the first letter of each word in a string
	    public static String capitalizeWords(String str) {
	        String[] words = str.split(" ");
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1).toLowerCase())
	                           .append(" ");
	            }
	        }

	        return capitalized.toString().trim();
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        String testString = "hello world";
	        char testChar = 'o';

	        System.out.println("Count occurrences of '" + testChar + "': " + countOccurrences(testString, testChar));
	        System.out.println("Reversed string: " + reverseString(testString));
	        System.out.println("Is palindrome: " + isPalindrome(testString));
	        System.out.println("Capitalized words: " + capitalizeWords(testString));

	        String palindromeTest = "madam";
	        System.out.println("Is '" + palindromeTest + "' a palindrome: " + isPalindrome(palindromeTest));
	    }
	}

