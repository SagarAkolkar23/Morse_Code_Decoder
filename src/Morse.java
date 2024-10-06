import java.util.Objects;
import java.util.Scanner;

public class Morse {
    public char Dec(String Letter){
        char a = ' ';
        switch (Letter){
            case ".-" :
                a = 'A';
                break;
            case "-..." :
                a = 'B';
                break;
            case "-.-." :
                a = 'C';
                break;
            case "-.." :
                a = 'D';
                break;
            case "." :
                a = 'E';
                break;
            case "..-." :
                a = 'F';
                break;
            case "--." :
                a = 'G';
                break;
            case "...." :
                a = 'H';
                break;
            case ".." :
                a = 'I';
                break;
            case ".---" :
                a = 'J';
            break;
            case "-.-" :
                a = 'K';
                break;
            case ".-.." :
                a = 'L';
                break;
            case "--" :
                a = 'M';
                break;
            case "-." :
                a = 'N';
                break;
            case "---" :
                a = 'O';
                break;
            case ".--." :
                a = 'P';
                break;
            case "--.-" :
                a = 'Q';
                break;
            case ".-." :
                a = 'R';
                break;
            case "..." :
                a = 'S';
                break;
            case "-" :
                a = 'T';
                break;
            case "..-" :
                a = 'U';
                break;
            case "...-" :
                a = 'V';
                break;
            case ".--" :
                a = 'W';
                break;
            case "-..-" :
                a = 'X';
                break;
            case "-.--" :
                a = 'Y';
                break;
            case "--.." :
                a = 'Z';
                break;
            case "-----" :
                a = '0';
                break;
            case ".----" :
                a = '1';
                break;
            case "..---" :
                a = '2';
                break;
            case "...--" :
                a = '3';
                break;
            case "....-" :
                a = '4';
                break;
            case "....." :
                a = '5';
                break;
            case "-...." :
                a = '6';
                break;
            case "--..." :
                a = '7';
                break;
            case "---.." :
                a = '8';
                break;
            case "----." :
                a = '9';
                break;
            default:


        }
        return a;
    }

    public String Enc(char letter) {
        String morseCode = switch (Character.toUpperCase(letter)) {
            case 'A' -> ".-";
            case 'B' -> "-...";
            case 'C' -> "-.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> "-.-";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.-";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "..-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            case '0' -> "-----";
            case '1' -> ".----";
            case '2' -> "..---";
            case '3' -> "...--";
            case '4' -> "....-";
            case '5' -> ".....";
            case '6' -> "-....";
            case '7' -> "--...";
            case '8' -> "---..";
            case '9' -> "----.";
            default -> "";
        };
        return morseCode;
    }

    public  String  Decode(String a){
        for(int i = 0; i<a.length();i++){
            if(a.charAt(i) != '.' && a.charAt(i) != '-' && a.charAt(i) != ' '){
                return "Enter only dots and dash in the morse code.";
            }

        }
        int init = 0;
        StringBuilder decoded = new StringBuilder();

        StringBuilder letter = new StringBuilder();
        while(init < a.length()){
            letter.setLength(0);
            while(a.charAt(init) != ' '){
                letter.append(a.charAt(init));
                init++;
            }
            decoded.append(Dec(letter.toString()));
            if(init+1<a.length()) {
                if (a.charAt(init) == ' ' && a.charAt(init + 1) == ' ') {
                    init = init + 2;
                    decoded.append(' ');
                }
            }
                init++;
        }
        return decoded.toString();
    }
    public String Encode(String b){
        String c = b.toUpperCase();
        StringBuilder d = new StringBuilder();
        int i = 0;
        while(i<b.length()-1){
            if((b.charAt(i) <= 'A' && b.charAt(i) >= 'Z') || (b.charAt(i) <= 0 && b.charAt(i) >= 9)){
                continue;
            }
            if(b.charAt(i) != ' '){
                d.append(Enc(b.charAt(i)));
                d.append(' ');
            }
            else{
                d.append(' ');
                d.append(' ');
                d.append(' ');
            }
            i++;
        }
        return d.toString();
    }


    public static void main(String[] args) {
        Morse morse = new Morse();
        System.out.println("Enter your objective : ");
        System.out.println("Enter D for decoding a morse code : ");
        System.out.println("Enter E for encoding a sentence into morse code : ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if(Objects.equals(choice, "D")){
            System.out.println("Enter a morse code : ");
            String code = sc.nextLine();
            code = code + ' ';
            System.out.println(STR."The message is : \{morse.Decode(code)}");
        }
        else if(Objects.equals(choice, "E")){
            System.out.println("Enter a sentence you want to Encode : ");
            String sent = sc.nextLine();
            System.out.println(STR."The code is : \{morse.Encode(sent)}");
        }
        else{
            System.out.println("Enter choice correctly ");
        }

    }
}
