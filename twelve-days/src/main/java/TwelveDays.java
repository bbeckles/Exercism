
class TwelveDays {

    private static final String[] days = {"first ", "second ", "third ", "fourth ", "fifth ", "sixth ", "seventh ", "eighth ", "ninth ", "tenth ", "eleventh ", "twelfth "};
    private static final String[] gifts = { "a Partridge in a Pear Tree.", "two Turtle Doves, and ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, "};

    String verse(int verseNumber) {
        String verse = setup(verseNumber);

        for (int i = verseNumber; i > 0; i--) {
            verse += gifts[i-1];
        }

        return verse + '\n';
    }

    String verses(int startVerse, int endVerse) {
        String song = "";

        for (int i = startVerse; i <= endVerse; i++) {
            song += verse(i);
            if (i != endVerse)
                song += '\n';
        }

        return song;
    }

    String sing() {
        return verses(1, 12);
    }

    // Set up initial string 'On the xth day of Christmas my true love gave to me, '
    private String setup(int verseNumber) {
        return "On the " + days[verseNumber-1] + "day of Christmas my true love gave to me: ";
    }
}
