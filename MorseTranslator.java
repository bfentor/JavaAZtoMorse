public class MorseTranslator {
    final static String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
                                   "o","p","q","r","s","t","u","v","w","x","y","z"};
    final static String[] morse = {"•-","-•••","-•-•","-••","•","••-•","--•","••••","••",
                                   "•---","-•-","•-••","--","-•","---","•--•","--•-","•-•",
                                   "•••","-","••-","•••-","•--","-••-","-•--","--••"};
    public static void main(String[] args) {
        String text = "";
        try {
            text = args[0].toLowerCase();
        } catch(Exception e) {
            System.out.println("Exception encountered");
            System.exit(0);
        }
        for (int i = 0; i < text.length(); i++) {
            System.out.print(getNextAlpha(text.substring(i,i+1)) + " ");
        }
        System.out.println("");
    }
    // Binary search implementation
    public static String getNextAlpha(String alpha) {
        int l = 0;
        int r = letters.length-1;
        while (l <= r) {
            int mid = (l + r) / 2;
            //System.out.println(mid);
            if (letters[mid].equals(alpha)) {
                return morse[mid];
            } else if (letters[mid].compareTo(alpha) > 0) {
                r = mid - 1;
            } else {
                l = mid +1;
            }
        }
        return "/";
    }
    // Previous implementation left here for educational purposes:
    /* 
    public static String getNextAlphaDEP(String alpha) {
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
    */
}