class Proverb {

    private String proverb = "";

    Proverb(String[] words) {

        for(int i = 0 ; i + 1 < words.length; ++i){
            this.proverb += String.format("For want of a %s the %s was lost.\n", words[i], words[i + 1]);
        }

        if(words.length >= 1){
            this.proverb += String.format("And all for the want of a %s.", words[0]);
        }
    }

    String recite() {
        return this.proverb;
    }

}
