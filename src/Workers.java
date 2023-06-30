public class Workers {
    public static void main(String[] arg)
    {
        President president = new President("John Smith", 10);
        Security security = new Security("Emily Johnson", "Top Secret");
        Manager manager = new Manager("David Brown", "Sales");
        Engineer engineer = new Engineer("Michael Davis", "Software Development");

        president.print();
        System.out.println();
        security.print();
        System.out.println();
        manager.print();
        System.out.println();
        engineer.print();
    }

    abstract static class Worker
    {
        protected String name;

        public Worker(String name)
        {
            this.name=name;
        }
        public String getName()
        {
            return name;
        }

        public abstract void print();
    }

    static class   President extends Worker{
        protected int numberSubordinate;

        public President(String name,int numberSubordinate)
        {
            super(name);
            this.numberSubordinate=numberSubordinate;
        }

         public  int getNumberSubordinate()
        {
            return numberSubordinate;
        }
        @Override
        public void print()
        {
            System.out.println("President: "+ getName());
            System.out.println("Number : "+ getNumberSubordinate());
        }

    }

    static class Security extends Worker {
        protected String securityClearanceLevel;

        public Security(String name, String securityClearanceLevel) {
            super(name);
            this.securityClearanceLevel = securityClearanceLevel;
        }

        public String getSecurityClearanceLevel() {
            return securityClearanceLevel;
        }

        @Override
        public void print() {
            System.out.println("Security: " + getName());
            System.out.println("Security Clearance Level: " + getSecurityClearanceLevel());
        }
    }

    static class Manager extends Worker {
        protected String department;

        public Manager(String name, String department) {
            super(name);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public void print() {
            System.out.println("Manager: " + getName());
            System.out.println("Department: " + getDepartment());
        }
    }

    static  class Engineer extends Worker {
        protected String specialization;

        public Engineer(String name, String specialization) {
            super(name);
            this.specialization = specialization;
        }

        public String getSpecialization() {
            return specialization;
        }

        @Override
        public void print() {
            System.out.println("Engineer: " + getName());
            System.out.println("Specialization: " + getSpecialization());
        }
    }
}
