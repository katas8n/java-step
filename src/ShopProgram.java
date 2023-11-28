import java.util.Scanner;

public class ShopProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User(100);

        Product[] products = {
                new Product("Pepsi" , "Sugar free" , 13),
                new Product("Coca-cola" , "Sugar free" , 11),
                new Product("Lays" , "Sold free" , 21),
        };

        while(true) {
            System.out.println("Wellcum!");
            System.out.println("You may choose a) TO buy something b) TO show products or q) To quit");

            String userChoice = scanner.next();

            if(userChoice.toLowerCase().equals("a")) {
                System.out.println("Available products");

                for(int i = 0 ; i < products.length ;i++){
                    Product product = products[i];
                    System.out.println(i + 1 + ")" + product.getTitle() + " ,price : " + product.getPrice() + " ,descr : " + product.getDescription() );
                }

                System.out.println("Enter id of a product which you gonna buy!");
                int chosenProduct = Integer.parseInt(scanner.next()) - 1;

                if(user.buyProduct(products[chosenProduct])) {
                    System.out.println("Purchase successful!");
                    System.out.println("Money left : " + user.getMoney());
                } else {
                    System.out.println("Sadly , we can't sell you product!");
                }

                if(user.getMoney() <= 0) {
                    System.out.println("Sadly , you should leave ");
                    break;
                }
            }else if (userChoice.equals("b")) {
                user.showProductList();
            } else if (userChoice.equals("q")) {
                System.out.println("Sadly , you should leave ");
                break;
            } else {
                System.out.println("Something went wrong , try again later!");
            }
        }
    }

}

class User {
    private int money;
    private  Product[] bag;
    public User(int money){
        this.money = money;
        this.bag = new Product[13];
    }

    public boolean buyProduct(Product product) {
        if(money >= product.getPrice()) {
            money -= product.getPrice();

            addToBag(product);

            return true;
        }

        return  false;
    }

    private void addToBag(Product product) {
        for(int i = 0 ; i < bag.length ; i++) {
            if(bag[i] == null) {
                bag[i] =  product;
                break;
            }
        }
    }

    public void showProductList() {
        for(int i =0 ; i < bag.length ;i++) {
            Product product = bag[i];

            if(product != null) {
                System.out.println(product.getTitle() + " " + product.getPrice() + " " + product.getDescription());
            }

        }
    }

    public int getMoney() {
        return 0;
    }
}


class Product {
    private String title;
    private String description;
    private int price;

    public Product(String title , String description , int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
       return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}