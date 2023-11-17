public class ReverseWord {
    public static void main(String[] args) {
        String originalWord = "Hello";

        // Convert the string to a StringBuilder
        StringBuilder reversedWord = new StringBuilder(originalWord);

        // Use the reverse() method to reverse the StringBuilder
        reversedWord.reverse();

        // Convert the StringBuilder back to a String
        String result = reversedWord.toString();

        // Print the reversed word
        System.out.println("Original Word: " + originalWord);
        System.out.println("Reversed Word: " + result);
    }
}
