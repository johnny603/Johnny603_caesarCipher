public class Main {
    public static void main(String[] args) { // String[] args can be used to run command line arguments
        if (args.length < 3) {
            System.out.println("Usage:");
            System.out.println("  java Main -e \"text to encrypt\" shift");
            System.out.println("  java Main -d \"text to decrypt\" shift");
            return;
        }

        String flag = args[0];
        String text = args[1];
        int shift;

        try {
            shift = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid shift value. Please enter a number.");
            return;
        }

        if (shift < 1 || shift > 27) {
            System.out.println("Shift must be between 1 and 27.");
            return;
        }

        if (flag.equals("-e")) {
            String encrypted = encrypt(text, shift);
            System.out.println("Encrypted text: " + encrypted);
        } else if (flag.equals("-d")) {
            String decrypted = decrypt(text, shift);
            System.out.println("Decrypted text: " + decrypted);
        } else {
            System.out.println("Unknown flag: " + flag);
            System.out.println("Use -e to encrypt or -d to decrypt.");
        }
    }


    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shifted = (char) ((character - base + shift) % 26 + base);
                result.append(shifted);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shifted = (char) ((character - base - shift + 26) % 26 + base);
                result.append(shifted);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}