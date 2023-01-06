
import java.util.Scanner;
public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a dicemal number: ");
        int inDec = sc.nextInt();
        convertDecToHex(inDec);
    }

    public static void convertDecToHex(int inDec) {
        int numIdx;
        String outHex = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (inDec > 0) {
            numIdx = inDec % 16;
            outHex = hex[numIdx] + outHex;
            inDec = inDec / 16;
        }
        System.out.print("The equivalent hexadecimal number is: " + outHex);
    }
}
