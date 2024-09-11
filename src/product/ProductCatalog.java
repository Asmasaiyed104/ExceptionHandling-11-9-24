package product;

public class ProductCatalog {
    //instance variable
    private Product[] products;
    private int productCount;

    public ProductCatalog(int size) {
        products = new Product[size];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            System.out.println("Catalog Full");
        }
    }

    public Product getProductById(String id) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId().equals(id)) {
                return products[i];
            }
        }
        throw new ProductIsNotFoundException("Product ID " + id + " not found.");
    }

    public void buyProduct(String productId, int quantity) {
        try {
            Product product = getProductById(productId);
            if (product.getQuantity() < quantity) {
                System.out.println("Insufficient prodcut quantity for " + product.getName());
            } else {
                product.setQuantity(product.getQuantity() - quantity);
                System.out.println("Bought " + quantity + " of " + product.getName());
            }
        } catch (ProductIsNotFoundException e) {
            System.out.println("Error Occur : " + e.getMessage());
        }
    }
}
