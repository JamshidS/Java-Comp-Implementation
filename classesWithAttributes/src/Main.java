public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("HP Laptop");
        product.setId(1);
        product.setPrice(5200);
        product.setStockAmount(2);

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getCod());



    }
}