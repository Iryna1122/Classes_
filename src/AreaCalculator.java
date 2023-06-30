public class AreaCalculator {
    public static void main(String[]arg)
    {
        double triangleArea1 = AreaCalculatorFigures.calculateTriangleArea(5, 8);
        double triangleArea2 = AreaCalculatorFigures.calculateTriangleArea(3, 4, 5);
        double rectangleArea = AreaCalculatorFigures.calculateRectangleArea(10, 5);
        double squareArea = AreaCalculatorFigures.calculateSquareArea(7);
        double rhombusArea = AreaCalculatorFigures.calculateRhombusArea(6, 8);

        int calculationCount = AreaCalculatorFigures.getCalculationCount();
        System.out.println("Number of area calculations: " + calculationCount);
    }

    public static class AreaCalculatorFigures {
        private static int calculationCount = 0;

        public static double calculateTriangleArea(double base, double height) {
            calculationCount++;
            return 0.5 * base * height;
        }

        public static double calculateTriangleArea(double sideA, double sideB, double sideC) {
            calculationCount++;
            double semiperimeter = (sideA + sideB + sideC) / 2;
            return Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
        }

        public static double calculateRectangleArea(double length, double width) {
            calculationCount++;
            return length * width;
        }

        public static double calculateSquareArea(double side) {
            calculationCount++;
            return side * side;
        }

        public static double calculateRhombusArea(double diagonal1, double diagonal2) {
            calculationCount++;
            return 0.5 * diagonal1 * diagonal2;
        }

        public static int getCalculationCount() {
            return calculationCount;
        }
    }

}
