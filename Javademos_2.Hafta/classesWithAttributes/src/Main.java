public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //attribute | field

        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setStockAmount(3);


      //Classes keep related features and related operations. One class can be used within another class.
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}