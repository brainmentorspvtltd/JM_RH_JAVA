// @Table
// class Emp{
//     @Id
//     int empid;
// }
// PascalCase + Noun + Custom Type
class Person extends Object {
    @Override
    public String toString() {
        return "Person toString....";
    }
}

class Customer extends Person {
    // Members
    int id;
    String name;
    double balance;
    String phone;

    // void show(){
    // System.out.println(this.id);
    // System.out.println(name);
    // System.out.println(balance);
    // System.out.println(phone);
    // }
    @Override
    public String toString() {
        super.toString();
        return "Id " + id + " Name " + name + " Balance " + balance + " Phone " + phone;
    }
}

public class OOPS {
    public static void main(String[] args) {
        int x;
        Customer customer;
        customer = new Customer();
        System.out.println(customer); // customer.toString()
        // customer.show();

        Customer ram = new Customer();
        System.out.println(ram);
        // ram.show();

        // System.out.println(customer.toString());
    }
}
