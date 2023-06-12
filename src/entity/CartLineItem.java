package entity;

public class CartLineItem {
    static int count = 0;
    private int cartLineItemID;
    private String categoryName;
    private String productName;
    private long quantity;
    private long subTotal;

    public CartLineItem() {
    }
    public CartLineItem(String categoryName, String productName, long quantity, long subTotal) {
        count++;
        this.cartLineItemID = count;
        this.categoryName = categoryName;
        this.productName = productName;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    public int getCartLineItemID() {
        return cartLineItemID;
    }
    public void setCartLineItemID(int cartLineItemID) {
        this.cartLineItemID = cartLineItemID;
    }

    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getQuantity() {
        return quantity;
    }
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(long subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "CartLineItem{" +
                "cartLineItemID=" + cartLineItemID +
                ", categoryName='" + categoryName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", subTotal=" + subTotal +
                '}';
    }
}
