

    import java.util.Scanner;

    /**
     * Write a program to convert the upper case to lower case.
     */
    public class Programme_9 {

        public static void main(String[] args) {
            //Scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the uppercase string : ");
            String uppercase = scanner.nextLine();
            Programme_9 t = new Programme_9();
            t.convertUppercaseToLowerCase(uppercase);
            // closing the scanner object
            scanner.close();
        }

        //Conversion of Uppercase to Lower case method
        public void convertUppercaseToLowerCase(String text) {
            System.out.println("The Lowercase value is = " + text.toLowerCase());
        }
}
