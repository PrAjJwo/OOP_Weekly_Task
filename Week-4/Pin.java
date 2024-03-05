import java.util.Random;

public class Pin {
    public static void main(String[] args) {
        Random random = new Random();

        // Step 1: Input the pin number to encrypt (four digits)
        int pin = 8491;

        // Step 2: Generate two random numbers between 1000 and 65536
        int random1 = random.nextInt(64536) + 1000; // Random number between 1000 and 65535
        int random2 = random.nextInt(64536) + 1000; // Random number between 1000 and 65535

        // Step 3: Convert the pin number and random numbers to hexadecimal
        String pinHex = Integer.toHexString(pin);
        String random1Hex = Integer.toHexString(random1);
        String random2Hex = Integer.toHexString(random2); 

        // Step 4: Concatenate the encrypted pin
        String encryptedPin = random1Hex + pinHex + random2Hex;

        // Step 5: Output the encrypted pin
        System.out.println("Your encrypted pin number is " + encryptedPin);
    }
}
