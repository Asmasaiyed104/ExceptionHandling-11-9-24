package product;

public class ProductCatalogMain {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog(10);

        // Add products
        catalog.addProduct(new Product("1", "Laptop", 10));
        catalog.addProduct(new Product("2", "Smartphone", 5));

        // Buy products
        catalog.buyProduct("1", 3);
        catalog.buyProduct("2", 6);
        catalog.buyProduct("3", 1);
    }
}
