public class Figures {
    public static void main(String[] arg)
    {
        Figure[] figures=new Figure[4];
        figures[0]=new Rectangle(5,10);
        figures[1]=new Circle(5);
        figures[2]=new RightTriangle(2,6);
        figures[3]=new Trapezoid(4,8,6);

        for(Figure figure:figures)
        {
            System.out.println("Area of " + figure.getName() +" : "+ figure.calculateArea());
        }
    }
    abstract static class Figure {
        public abstract double calculateArea();
        public  abstract String getName();
    }

    static class  Rectangle extends Figure {
        private double length;
        private double width;
        private String name="Rectangle";

        @Override
        public String getName()
        {
            return name;
        }
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }


        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    static class Circle extends Figure {
        private double radius;


        private String name="Circle";

        @Override
        public String getName()
        {
            return name;
        }
        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class RightTriangle extends Figure {
        private double base;
        private double height;

        private String name="Triangle";
        @Override
        public String getName()
        {
            return name;
        }
        public RightTriangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        public double getBase() {
            return base;
        }

        public double getHeight() {
            return height;
        }

        @Override
        public double calculateArea() {
            return 0.5 * base * height;
        }
    }

    static class Trapezoid extends Figure {
        private double upperBase;
        private double lowerBase;
        private double height;

        private String name="Trapezoid";
        @Override
        public String getName()
        {
            return name;
        }
        public Trapezoid(double upperBase, double lowerBase, double height) {
            this.upperBase = upperBase;
            this.lowerBase = lowerBase;
            this.height = height;
        }

        public double getUpperBase() {
            return upperBase;
        }

        public double getLowerBase() {
            return lowerBase;
        }

        public double getHeight() {
            return height;
        }

        @Override
        public double calculateArea() {
            return 0.5 * (upperBase + lowerBase) * height;
        }
    }

}
