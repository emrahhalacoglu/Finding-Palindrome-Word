import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;

        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
                i++;
                j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String retry = "y";
        while (retry.equals("y"))
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the word that you want to check : ");
            String str = input.next();
            System.out.println(isPalindrome(str));
            System.out.print("Would you like to try again (y/n) ? : ");
            retry = input.next();
        }
        if (!retry.equals("y") && !retry.equals("n"))
        {
            System.out.print("Wrong command input !");
        }
    }
}
