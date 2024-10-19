public class MorseTranslator {
    public static void main(String[] args) {
        String text = "";
        try {
            text = args[0].toLowerCase();
        } catch(Exception e) {
            System.out.println("Exception encountered");
            System.exit(0);
        }
        //System.out.println(text);
        for (int i = 0; i < text.length(); i++) {
            System.out.print(getNextAlpha(text.substring(i,i+1)) + " ");
        }
        System.out.println("");
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