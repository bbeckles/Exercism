class Acronym {

    String phase;
    StringBuilder word = new StringBuilder();
    char letter;

    Acronym(String phrase) {
        this.phase = phrase;
        }

        String get() {
            String [] strings = phase.split(" ");
            for (String s:strings) {
                if (s.contains("-")){
                    letter = s.charAt(0);
                    word.append(String.valueOf(letter).toUpperCase());
                    int indexOfPunctuation = s.indexOf("-");
                    letter = s.charAt(indexOfPunctuation+1);
                    word.append(String.valueOf(letter).toUpperCase());
                } else {
                    letter = s.charAt(0);
                    word.append(String.valueOf(letter).toUpperCase());
                }
            }
            return word.toString();
        }

    }
