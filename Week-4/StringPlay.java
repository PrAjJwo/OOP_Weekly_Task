
public class StringPlay {

    public static void main (String[] args)
    {
        String college = new String ("Leeds Beckett University"); //Similar for part (a)

        // Part (a): Assigning the length of the string to stringLength
        int stringLength = college.length();

        String change1, change2, change3; 

        // Part (b): Displaying the length of the string
        System.out.println (college + " contains " + stringLength + " characters.");

        // Part (c): Replacing all occurrences of 'e' with 'x'
        change1 = college.replace('e', 'x');

        // Part (d): Converting the string to uppercase
        change2 = college.toUpperCase();

        // Part (e): Concatenating a new string
        change3 = college.concat(" - City Campus");

        System.out.println ("The final string is " + change3);
    }
 
}
 