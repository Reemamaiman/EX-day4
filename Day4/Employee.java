package Day4;

public class Employee {

        int id;
        String firstName;
        String lastName;
        int salary;

        public Employee(int id, String firstName, String lastName, int salary) {
            super();
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String Name() {
            return firstName + " " + lastName;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getAnnualSalary() {
            return salary * 12;
        }

        public int raiseSalary(int precent) {
            return salary + ((salary * precent) / 100);
        }

        @Override
        public String toString() {
            return "Employee [id = " + getId() + ", name = " + getFirstName() + ", salary = " + getSalary() + "]";
        }

    }


