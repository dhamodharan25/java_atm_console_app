import java.util.Scanner;
//Admin
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to ATM");
        int op0 = 1;
        while(op0 == 1) {

            System.out.println("Press 1 -- Admin \nPress 0 -- User ");
            int val = sc.nextInt();
            int op1 = 1;
            while (op1 == 1) {


                if (val == 1) {
                    //admin
                    System.out.println("Press : \n1 - Create new User \n2- List All users");
                    int inp = sc.nextInt();
                    User newUser = new User();
                    if (inp == 1) {
                        newUser.newuser();

                    } else if (inp == 2) {
                        newUser.displayUser();
                    }
                    System.out.println("Press :\n1 - Continue\n2 - Exit");
                    op1 = sc.nextInt();

                } else {

                    System.out.println("Enter your name :");
                    String name = sc.next();
                    int op2 = 1;
                    while (op2 == 1) {

                        System.out.println("Enter your choice : \n 1.Deposite\n 2.Withdrawl \n 3.Mini Statement\n" +
                                " 4.Check Balance\n 5.Pin Change");
                        int choice = sc.nextInt();
                        User fun = new User();

                        switch (choice) {
                            case 1:
                                System.out.println("Enter Amount :");
                                int dep = sc.nextInt();
                                fun.deposite(dep, name);
                                break;

                            case 2:
                                System.out.println("Enter Withdrawl Amount :");
                                int with = sc.nextInt();
                                fun.withdrawl(with, name);
                                break;

                            case 3:
                                fun.mini_statement(name);
                                break;

                            case 4:
                                fun.check_balance(name);
                                break;

                            case 5:
                                System.out.println("Enter new PIN :");
                                int new_pin = sc.nextInt();
                                fun.change_pin(new_pin, name);
                                break;

                            default:
                                System.out.println("Press : \n 1 - Continue \n 0 - Exit");
                                op2 = sc.nextInt();
                        }

                    }

                    System.out.println("Trancation successfull");
                    System.out.println("Press :\n1 - Continue\n2 - Exit");
                    op1 = sc.nextInt();

                }


            }
        }
    }
}