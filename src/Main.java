import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Person person = new Person();
//        person.enterData();
//        person.displayData();

//        City city=new City();
//        city.enterData();
//        city.displayData();
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();


        fraction1.enterData();
        fraction2.enterData();

         fraction1.add(fraction2);
        fraction1.displayData();
    }

    public static  class Person
    {
        private String fullName;
        private String dateOfBirth;
        private String phoneNumber;
        private String city;
        private String country;
        private String homeAddress;

        public void enterData()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter full name: ");
            fullName=scanner.nextLine();

            System.out.print("Enter date of birth: ");
            dateOfBirth = scanner.nextLine();

            System.out.print("Enter phone number: ");
            phoneNumber = scanner.nextLine();

            System.out.print("Enter city: ");
            city = scanner.nextLine();

            System.out.print("Enter country: ");
            country = scanner.nextLine();

            System.out.print("Enter home address: ");
            homeAddress = scanner.nextLine();
        }

        public void displayData()
        {
            System.out.println("Full Name: " + fullName);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("City: " + city);
            System.out.println("Country: " + country);
            System.out.println("Home Address: " + homeAddress);
        }

        public String getFullName()
        {
            return this.fullName;
        }

        public String getDateOfBirth()
        {
            return this.dateOfBirth;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        public String getHomeAddress() {
            return homeAddress;
        }

    }

    public static class City
    {
        private String title;
        private String region;
        private String country;
        private int countPersons;
        private int index;
        private int telCode;


        public void enterData()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter Title: ");
            title=scanner.nextLine();

            System.out.print("Enter Region: ");
            region=scanner.nextLine();

            System.out.print("Enter Country: ");
            country=scanner.nextLine();

            System.out.print("Enter count persons: ");
            countPersons=scanner.nextInt();

            System.out.print("Enter Post Index: ");
            index=scanner.nextInt();

            System.out.print("Enter Tel Code: ");
            telCode=scanner.nextInt();
        }

        public void displayData()
        {
            System.out.println("Title: " + title);
            System.out.println("Region: "+ region);
            System.out.println("Country: "+ country);
            System.out.println("Count of persons: "+ countPersons);
            System.out.println("Post Index: "+ index);
            System.out.println("Phone Code: "+ telCode);
        }

        public String getTitle()
        {
            return title;
        }

    }

    public static class Country {
        private String title;
        private String continent;
        private int population;
        private int phoneCode;
        private String capital;

        private String[] cities;

        public void enterData() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter country name: ");
            title = scanner.nextLine();

            System.out.print("Enter continent: ");
            continent = scanner.nextLine();

            System.out.print("Enter population: ");
            population = scanner.nextInt();

            System.out.print("Enter country code: ");
            phoneCode = scanner.nextInt();

            scanner.nextLine(); // Consume newline character

            System.out.print("Enter capital: ");
            capital = scanner.nextLine();

            System.out.print("Enter number of cities: ");
            int numCities = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            int count = 5;
            cities = new String[count];
            for (int i = 0; i < count; i++) {
                System.out.print("Enter city" + (i + 1) + ": ");
                cities[i] = scanner.nextLine();
            }
        }
        public void displayData() {
            System.out.println("Country Name: " + title);
            System.out.println("Continent: " + continent);
            System.out.println("Population: " + population);
            System.out.println("Country Code: " + phoneCode);
            System.out.println("Capital: " + capital);
            System.out.println("Cities:");
            for (String city : cities) {
                System.out.println(city);
            }
        }

        public String getCountryName() {
            return title;
        }

        public String getContinent() {
            return continent;
        }

        public int getPopulation() {
            return population;
        }

        public int getCountryCode() {
            return phoneCode;
        }

        public String getCapital() {
            return capital;
        }

        public String[] getCities() {
            return cities;
        }

    }

    public static class Fraction {
        private int numerator;
        private int denominator;

//        public Fraction(int num,int denom)
//        {
//            this.numerator=num;
//            this.denominator=denom;
//        }
        public void enterData() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter numerator: ");
            numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            denominator = scanner.nextInt();
        }

        public void displayData() {
            System.out.println(numerator + "/" + denominator);
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void add(Fraction other) {
            int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;

            this.numerator = newNumerator;
            this.denominator = newDenominator;
//            Fraction sum = new Fraction();
//            sum.numerator = newNumerator;
//            sum.denominator = newDenominator;
        }


        public void subtract(Fraction other) {
            int commonDenominator = this.denominator * other.denominator;
            int diffNumerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);


            this.numerator = diffNumerator;
            this.denominator = commonDenominator;

        }

        public Fraction multiply(Fraction other) {
            int productNumerator = this.numerator * other.numerator;
            int productDenominator = this.denominator * other.denominator;

            Fraction product = new Fraction();
            product.numerator = productNumerator;
            product.denominator = productDenominator;

            return product;
        }

        public Fraction divide(Fraction other) {
            int quotientNumerator = this.numerator * other.denominator;
            int quotientDenominator = this.denominator * other.numerator;

            Fraction quotient = new Fraction();
            quotient.numerator = quotientNumerator;
            quotient.denominator = quotientDenominator;

            return quotient;
        }
    }

}