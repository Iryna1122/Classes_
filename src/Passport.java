public class Passport {
    public static void main(String[]arg)
    {
        myPassport passport = new myPassport("John Smith", "USA", "A123456", "1980-01-01");
        passport.displayInfo();

        System.out.println();

        ForeignPassport foreignPassport = new ForeignPassport("Emily Johnson", "UK", "B789012", "1990-05-10",
                "Visa information goes here", "C987654");
        foreignPassport.displayInfo();
    }
    public static class myPassport {
        private String fullName;
        private String nationality;
        private String passportNumber;
        private String dateOfBirth;

        public myPassport(String fullName, String nationality, String passportNumber, String dateOfBirth) {
            this.fullName = fullName;
            this.nationality = nationality;
            this.passportNumber = passportNumber;
            this.dateOfBirth = dateOfBirth;
        }

        public void displayInfo() {
            System.out.println("Full Name: " + fullName);
            System.out.println("Nationality: " + nationality);
            System.out.println("Passport Number: " + passportNumber);
            System.out.println("Date of Birth: " + dateOfBirth);
        }
    }

    public static class ForeignPassport extends myPassport {
        private String visaInformation;
        private String passportNumberInternational;

        public ForeignPassport(String fullName, String nationality, String passportNumber, String dateOfBirth,
                               String visaInformation, String passportNumberInternational) {
            super(fullName, nationality, passportNumber, dateOfBirth);
            this.visaInformation = visaInformation;
            this.passportNumberInternational = passportNumberInternational;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Visa Information: " + visaInformation);
            System.out.println("International Passport Number: " + passportNumberInternational);
        }
    }

}
