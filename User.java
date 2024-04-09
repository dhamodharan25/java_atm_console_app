import java.util.*;

public class User {
    HashMap<String,New_user> users = new LinkedHashMap<String,New_user>();

    Scanner sc = new Scanner(System.in);
    public void  newuser(){
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Bank Name : ");
        String bank = sc.nextLine();
        System.out.println("Enter Mobile No : ");
        String mobile_no = sc.nextLine();
        int pin;
        int  confirm_pin;
        do {
            System.out.println("Enter Pin : ");
            pin = sc.nextInt();
            System.out.println("Enter Confirm Pin : ");
            confirm_pin = sc.nextInt();

            if(pin != confirm_pin){
                System.out.println("PIN in correct \n rRe-enter PIN");

            }
        }while (pin != confirm_pin);

        New_user newuser = new New_user(name,bank,mobile_no,pin,0);

        users.put(name,newuser);
        System.out.println("New user created Successfully");

        System.out.println("Contents of the hashmap after adding new user:");
        for(Map.Entry<String,New_user> n : users.entrySet()){

            System.out.println("Name: " + n.getValue().name);
            System.out.println("Bank: " + n.getValue().bank);
            System.out.println("Mobile No: " + n.getValue().mobile_no);
            System.out.println("Amount : " + n.getValue().amt);

        }


    }
    public void displayUser() {
        if(users.isEmpty()){
            System.out.println("No Users found\n");
        }
        for(Map.Entry<String,New_user> n : users.entrySet()){

            System.out.println("Name: " + n.getValue().name);
            System.out.println("Bank: " + n.getValue().bank);
            System.out.println("Mobile No: " + n.getValue().mobile_no);
            System.out.println("Amount : " + n.getValue().amt);

        }

    }

    // Deposite
    public void deposite(int num, String name) {
//        New_user user = users.get(name);
//        if (user != null) {
//            user.amt += num;
//        } else {
//            System.out.println("User not found.");
//        }
//        users.put(name,users.getOrDefault(users.get(name).amt,0) + num);

        New_user currentAmount = users.get(name);

        currentAmount.amt = currentAmount.amt + num;


        // Update the user's amount in the map

        users.replace(name, currentAmount);


    }

    // Withdrawl
    public void withdrawl(int num, String name) {
        New_user user = users.get(name);
        if (user != null) {
            user.amt -= num;
        } else {
            System.out.println("User not found.");
        }
    }

    // Mini statement
    public void mini_statement(String name) {
        New_user user = users.get(name);
        if (user != null) {
            System.out.println("***** Mini Statement *****");
            System.out.println("Name: " + user.name);
            System.out.println("Bank: " + user.bank);
            System.out.println("Mobile No: " + user.mobile_no);
            System.out.println("Balance Amount : " + user.amt);
        } else {
            System.out.println("User not found.");
        }
    }

    // Check balance
    public void check_balance(String name) {
        New_user user = users.get(name);
        if (user != null) {
            System.out.println("Balance Amount : " + user.amt);
        } else {
            System.out.println("User not found.");
        }
    }

    // Change pin
    public void change_pin(int num, String name) {
        New_user user = users.get(name);
        if (user != null) {
            user.pin = num;
            System.out.println("PIN changed successfully");
        } else {
            System.out.println("User not found.");
        }
    }

}
