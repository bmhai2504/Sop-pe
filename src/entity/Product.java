package entity;

public class Product {
    static int count = 0;
    private String categoryName;
    private int productID;
    private String productName;
    private String productBrand;
    private long productPrice;

    public Product(){
    }
    public Product(String categoryName, String productName, String productBrand, long productPrice) {
        count++;
        this.productID = count;
        this.categoryName = categoryName;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productPrice = productPrice;
    }

    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public long getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "categoryName=" + categoryName +
                ", productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
