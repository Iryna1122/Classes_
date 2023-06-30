public class Arrays {

    public static void main(String[]arg)
    {
        int[] numbers = {1, 2, 3, 4, 5};
        Array array = new Array(numbers);

        array.Print();
        array.Print("Array elements");
    }
    interface IShow {
        void Print();
        void Print(String info);
    }

    static class Array implements IShow {
        protected int[] array;

        public Array(int[] array) {
            this.array = array;
        }

        @Override
        public void Print() {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        @Override
        public void Print(String info) {
            System.out.println("Info: " + info);
            Print();
        }
    }
}
