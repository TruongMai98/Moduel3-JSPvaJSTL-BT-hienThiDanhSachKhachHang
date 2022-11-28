import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBCustomer {
    private  List<Customer> customerList;
    private static  DBCustomer dbCustomer = new DBCustomer();
    public static DBCustomer getDbCustomer() {
        return dbCustomer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    private DBCustomer() {
        customerList = new ArrayList<>();
        customerList.add(new Customer("Truong Mai", "10/10/1998", "HCM", "https://cdn.pixabay.com/photo/2015/10/01/17/17/car-967387__480.png"));
        customerList.add(new Customer("Truong Mai", "10/10/1998", "HCM", "https://cdn.pixabay.com/photo/2015/10/01/17/17/car-967387__480.png"));
        customerList.add(new Customer("Truong Mai", "10/10/1998", "HCM", "https://cdn.pixabay.com/photo/2015/10/01/17/17/car-967387__480.png"));
        customerList.add(new Customer("Truong Mai", "10/10/1998", "HCM", "https://cdn.pixabay.com/photo/2015/10/01/17/17/car-967387__480.png"));
        customerList.add(new Customer("Truong Mai", "10/10/1998", "HCM", "https://cdn.pixabay.com/photo/2015/10/01/17/17/car-967387__480.png"));
    }

    public void add(Customer c) {
        customerList.add(c);
    }

//    public List<Customer> get() {
//        return customerList;
//    }
}
