import java.util.Scanner;

public class Solution {

    static Character firstRepeatedCharacter(String input) {

        boolean[] checkChar = new boolean[128];

        for(int i = 0 ; i < input.length(); i++) {

            if(checkChar[input.charAt(i)]) {
                return input.charAt(i);
            }
            checkChar[input.charAt(i)] = true;
        }
        return '-';
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Menemukan huruf yang pertama kali berulang dalam sebuah string");
        System.out.println("(Inputan case sensitive)");
        System.out.print("Masukkan inputan disini ==> ");
        String input = scan.nextLine();

        Character firstrepeated = firstRepeatedCharacter(input);

        if(firstrepeated=='-') {
            System.out.println("Not found");
        }else {
            System.out.println("Huruf berulang pertama adalah "+ firstrepeated);
        }
    }
}
