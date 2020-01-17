class Darts {
    private double xAxis, yAxis;
    Darts(double x, double y) {
        this.xAxis = x;
        this.yAxis = y;
    }

    int score() {
        double res = Math.sqrt(Math.pow(this.xAxis,2) + Math.pow(this.yAxis,2));
        if (res <=1) { return 10; }
        if (res <= 5) { return 5; }
        if (res <= 10) { return 1; }
        return 0;
    }

}
