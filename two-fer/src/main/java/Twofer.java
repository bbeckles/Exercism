class Twofer {
    String twofer(String name) {
        String input = name == null ? "you" : name;
        return "One for " + input + ", one for me.";
    }
}