class RnaTranscription {

    String transcribe(String dnaStrand) {
        if(dnaStrand == null || "".equals(dnaStrand)) {
            return "";
        }else {


        String s = "";
        for(int i = 0; i < dnaStrand.length(); i++) {
        switch(String.valueOf(dnaStrand.charAt(i))) {
                case "G":
                s += "C";
                break;

                case "C":
                    s += "G";
                    break;
                case "T":
                    s += "A";
                    break;
                case "A" :
                    s += "U";
                    break;
                }
            }
            return s;
        }
    }

}