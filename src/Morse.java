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
                System.out.println("Check your morse code.");


        }
        return a;
    }


    public  String  Decode(String a){
        for(int i = 0; i<a.length();i++){
            if(a.charAt(i) != '.' && a.charAt(i) != '-' && a.charAt(i) != ' '){
                return "Enter only dots and dash in the morse code.";
            }

        }
        int init = 0;
        int track = 0;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the morse code : ");
        String a = STR."\{sc.nextLine()} ";
        System.out.println(STR."The code you entered is : \{a}");
        Morse m1 = new Morse();
        System.out.println(STR."The message encoded in the code  is : \{m1.Decode(a)}");


    }






}
