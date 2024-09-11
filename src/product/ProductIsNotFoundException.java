package product;

public class ProductIsNotFoundException extends RuntimeException{
    public ProductIsNotFoundException(String message){
        super(message);
    }
}
