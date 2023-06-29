import java.util.Scanner;
public class HomeWork {
    public static void main(String[]arg)
    {
        Book book=new Book();
        book.enterData();
        System.out.println(book);
    }
    public static class Book {
        private String title;
        private String author;
        private int year;
        private String publisher;
        private String genre;
        private int pageCount;

        public Book() {
        }

        public Book(String title, String author, int year, String publisher, String genre, int pageCount) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.publisher = publisher;
            this.genre = genre;
            this.pageCount = pageCount;
        }

        public void enterData() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter title: ");
            title = scanner.nextLine();

            System.out.print("Enter author: ");
            author = scanner.nextLine();

            System.out.print("Enter year: ");
            year = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter publisher: ");
            publisher = scanner.nextLine();

            System.out.print("Enter genre: ");
            genre = scanner.nextLine();

            System.out.print("Enter page count: ");
            pageCount = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    ", publisher='" + publisher + '\'' +
                    ", genre='" + genre + '\'' +
                    ", pageCount=" + pageCount +
                    '}';
        }

        public void displayData() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Year: " + year);
            System.out.println("Publisher: " + publisher);
            System.out.println("Genre: " + genre);
            System.out.println("Page Count: " + pageCount);
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public String getPublisher() {
            return publisher;
        }

        public String getGenre() {
            return genre;
        }

        public int getPageCount() {
            return pageCount;
        }
    }

    public static class Car
    {
        private String title;
        private String manufacture;
        private int year;
        private double value;

        public Car()
        {

        }
        public Car(String title,String manuf,int year,double value)
        {
            this.title=title;
            this.manufacture=manuf;
            this.year=year;
            this.value=value;
        }

        public void enterData()
        {
            Scanner scanner=new Scanner(System.in);
             System.out.println("Enter Title: ");
             title=scanner.nextLine();

             System.out.println("Enter manufactore: ");
             manufacture=scanner.nextLine();

             System.out.println("Enter year: ");
             year=scanner.nextInt();

             System.out.println("Enter Value: ");
             value=scanner.nextDouble();
        }

        @Override
        public String toString() {
            return "Car{" +
                    "title='" + title + '\'' +
                    ", manufacture='" + manufacture + '\'' +
                    ", year=" + year +
                    ", value=" + value +
                    '}';
        }

        public String getTitle()
        {
            return title;
        }

        public String getManufacture(){
            return manufacture;
        }
    }
}
