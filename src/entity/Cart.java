package entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    static int count = 0;
    private int userID;
    private int cartID;
    private long totalPrice;
    
    List<CartLineItem> cartLineList = new ArrayList<>();

    public Cart() {
        count++;
        this.cartID = count;
    }

    public Cart(int userID, List<CartLineItem> cartLineList, long totalPrice) {
        count++;
        this.cartID = count;
        this.userID = userID;
        this.cartLineList = cartLineList;
        this.totalPrice = totalPrice;
    }

    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCartID() {
        return cartID;
    }
    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public long getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public long calTotalPriceCart(){
        long totalPrice = 0;
        for (CartLineItem cartLineItem : cartLineList){
            totalPrice += cartLineItem.getSubTotal();
        }
        return totalPrice;
    }

    public List<CartLineItem> getCartLineList() {
        return cartLineList;
    }
    public void setCartLineList(List<CartLineItem> cartLineList) {
        this.cartLineList = cartLineList;
    }

    public boolean isCartLineItemExist(Product product){
        for(CartLineItem cartLineItem : cartLineList){
            if (cartLineItem.getProductName().equals(product.getProductName())){
                return true;
            }
        }
        return false;
    }

    public void addProductToCartLineItem(Product product){
        Scanner scanner = new Scanner(System.in);
        System.out.print("So luong san pham muon mua: ");
        long quantity = scanner.nextLong();
        long subTotal = product.getProductPrice() * quantity;
        if (isCartLineItemExist(product)){
            for (CartLineItem cartLineItem : cartLineList){
                if (cartLineItem.getProductName().equals(product.getProductName())){
                    cartLineItem.setQuantity(cartLineItem.getQuantity() + quantity);

                    cartLineItem.setSubTotal(cartLineItem.getSubTotal() + subTotal);
                    break;
                }
            }
            return;
        }
        String categoryName = product.getCategoryName();
        String productName = product.getProductName();
        CartLineItem cartLineItem = new CartLineItem(categoryName, productName, quantity, subTotal);
        cartLineList.add(cartLineItem);
    }

    public void displayCartLineList(){
        int count = 0;
        for (CartLineItem cartLineItem : cartLineList){
            count++;
            System.out.println(count + ". Name Product: " + cartLineItem.getProductName()
                                     + ", Quantity: " + cartLineItem.getQuantity()
                                     + ", Sub Total Price: " + cartLineItem.getSubTotal()
            );
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "userID=" + userID +
                ", cartID=" + cartID +
                ", totalPrice=" + totalPrice +
                ", cartLineList=" + cartLineList +
                '}';
    }
}

