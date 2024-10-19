import java.util.Scanner;

public class MorseTranslator {
    public static void main(String[] args) {
        System.out.println("Enter your message (type underscore to exit): ");
        for (int i=0;i==0;) 
            loop();
    }
    public static void loop() {
        Scanner sc = new Scanner(System.in);
        //String test = "THIS is a test for my translator";
        String test = sc.nextLine();
        
        test = test.toLowerCase();
        if (test.equals("_"))
            System.exit(1);
        //System.out.println(test);
        for (int i = 0; i < test.length(); i++) {
            //System.out.print(test.substring(i,i+1));
            System.out.print(getNextAlpha(test.substring(i,i+1)) + " ");
        }
        System.out.println("\n");
    }
    public static String getNextAlpha(String alpha) {
        switch(alpha) {
            case "a":
                return "•-";
            case "b":
                return "-•••";
            case "c":
                return "-•-•";
            case "d":
                return "-••";
            case "e":
                return "•";
            case "f":
                return "••-•";
            case "g":
                return "--•";
            case "h":
                return "••••";
            case "i":
                return "••";
            case "j":
                return "•---";
            case "k":
                return "-•-";
            case "l":
                return "•-••";
            case "m":
                return "--";
            case "n": 
                return "-•";
            case "o":
                return "---";
            case "p":
                return "•--•";
            case "q":
                return "--•-";
            case "r":
                return "•-•";
            case "s":
                return "•••";
            case "t":
                return "-";
            case "u":
                return "••-";
            case "v":
                return "•••-";
            case "w":
                return "•--";
            case "x":
                return "-••-";
            case "y":
                return "-•--";
            case "z":
                return "--••";
            case " ":
                return "/";
        }
        return "";
    }
}