package lesson_5;

public class Employee {
    String  fullName;
    String post;
    String email;
    String numberTelephone;
    int salary;
    int  age;

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(fullName+" "+post+" "+email+" "+numberTelephone+" "+salary+" "+age);
    }

    public Employee (String  fullName,String post,String email, String numberTelephone, int salary, int  age) {
        this.fullName= fullName;
        this.post=post;
        this.email=email;
        this.numberTelephone=numberTelephone;
        this.salary=salary;
        this.age=age;
    }
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Andri Vasilievski", "Postman", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Robert Sushiest", "Engineer", "ivivan@mailbox.com", "892312313", 50000, 40);
        persArray[2] = new Employee("Vasia Cherepashkin", "Admin", "ivivan@mailbox.com", "892312314", 60000, 29);
        persArray[3] = new Employee("Gerald Kozlovski", "CTO", "ivivan@mailbox.com", "892312315", 70000, 45);
        persArray[4] = new Employee("Artur Buxarer", "CEO", "ivivan@mailbox.com", "892312316", 90000, 30);

        for (Employee employee : persArray)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
