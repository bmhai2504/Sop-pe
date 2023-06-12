package entity;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private static int count = 0;
    private int categoryID;
    private String categoryName;
    static List<Category> categoryList = new ArrayList<>();

    static {
            addCategory(new Category("Men Fashion"));
            addCategory(new Category("Women Fashion"));
            addCategory(new Category("Phone"));
            addCategory(new Category("Laptop"));
    }

    public Category() {
    }
    public Category(String categoryName){
        count++;
        this.categoryID = count;
        this.categoryName = categoryName;
    }

    public List<Category> getAll() {
        return categoryList;
    }

    public static void displayCategory(){
        int count = 0;
        for (Category category : categoryList){
            count++;
            System.out.println(count + ". " + category.getCategoryName());
        }
    }

    public static void addCategory(Category category){
        categoryList.add(category);
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryID=" + categoryID +
                ", categoryName='" + categoryName + '\'' +
                '}' + '\n';
    }
}
