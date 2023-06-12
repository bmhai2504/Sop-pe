import entity.Cart;
import entity.Category;
import entity.Product;
import entity.User;
import services.ProductService;
import services.UserService;

import java.util.Scanner;

public class Main {
    static int userChoice;
    static String userName;
    static String userPassword;
    static User currentUser = new User();
    static Scanner scanner = new Scanner(System.in);
    static UserService userService = new UserService();
    static ProductService productService = new ProductService();
    static Product currentProduct = new Product();
    static Cart cart = new Cart();
    static String categoryName;

    public static void main(String[] args) {
        User user1 = new User("hai", "1234");
        userService.addUser(user1);

        // In Welcome
        System.out.println("Welcome Sọp Pe");
        System.out.println(" 1. Register");
        System.out.println(" 2. Login");
        System.out.println(" 3. Exit");
        System.out.print(" Your choice: ");
        doRegisterAndLogin();

        // In Category
        System.out.println("    *** List Category ***");
        Category.displayCategory();

        // In san pham theo category
        categoryName = chooseCategory();
        productService.displayProductByCategoryName(categoryName);

        // chon san pham
        do {
            System.out.println("Choose product you want to buy by product ID: ");
            userChoice = scanner.nextInt();
            if (userChoice == 0){
                break;
            }
            currentProduct = productService.chooseProductByID(userChoice);
            cart.addProductToCartLineItem(currentProduct);
            System.out.println("press 0 de tien hanh thanh toan: ");
        }while (1==1);

        //thanh toan
        System.out.println("List Product in Cart: ");
        cart.displayCartLineList();
        System.out.println("Total Price Product in Cart: " + cart.calTotalPriceCart());
    }

    public static void doRegisterAndLogin(){
        userChoice = scanner.nextInt();
        switch (userChoice){
            case 1:{
                inputUsernamePassword();
                userService.register(userName, userPassword);
                break;
            }
            case 2:{
                inputUsernamePassword();
                currentUser = userService.login(userName, userPassword);
                break;
            }
            case 3:{
                System.out.println("Ban da thoat khoi Sọp Pe");
                break;
            }
            default:{
                System.out.println("Invalid choice");
            }
        }
    }

    public static void inputUsernamePassword(){
        System.out.println("Input username: ");
        scanner.nextLine();
        userName = scanner.nextLine();
        System.out.println("Input userpassword: ");
        userPassword = scanner.nextLine();
    }

    public static String chooseCategory(){
        boolean isSuccess = false;
        do {
            System.out.printf(" Chon Category ban muon xem: ");
            userChoice = scanner.nextInt();
            switch (userChoice){
                case 1:{
                    categoryName = "Men Fashion";
                    isSuccess = true;
                    break;
                }
                case 2:{
                    categoryName = "Women Fashion";
                    isSuccess = true;
                    break;
                }
                case 3:{
                    categoryName = "Phone";
                    isSuccess = true;
                    break;
                }
                case 4:{
                    categoryName = "Laptop";
                    isSuccess = true;
                    break;
                }
                default:{
                    System.out.println("Invalid Choice!!! Choose again!!!");
                }
            }
        }while (!isSuccess);
        return categoryName;
    }
}