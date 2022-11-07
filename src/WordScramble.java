public class WordScramble {
    public static void main(String[] args) {
        System.out.println(hasPattern("TAN"));
        System.out.println(hasPattern("AARDVARK"));
        System.out.println(hasPattern("ABABAB"));
        System.out.println(hasPattern("BOZO"));

        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("AARDVARK"));//no worky
        System.out.println(scrambleWord("ABABAB"));
        System.out.println(scrambleWord("BOZO"));
    }

    public static boolean hasPattern(String word) {
        boolean pattern = false;
        for (int i = 0; i < word.length(); i++)
        {
            if (String.valueOf(word.charAt(i)).equals("A"))
            {
                i++;
                if (!String.valueOf(word.charAt(i)).equals("A"))
                {
                    pattern = true;
                }
            }
        }
        return pattern;
    }

    public static String scrambleWord(String word) {
        String patternScrambler = word;
        String temp;
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equals("A"))
            {
                temp = String.valueOf(patternScrambler.charAt(i));
                i++;
                if (!String.valueOf(word.charAt(i)).equals("A"))
                {
                    patternScrambler = patternScrambler.substring(0, i - 1) + word.charAt(i) + temp;
                    patternScrambler += word.substring(i + 1);
                }
                i--;
            }
        }
        return patternScrambler;
    }
}
