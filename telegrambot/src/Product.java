public class Product {
    private String name;

    private String detailsUrl;


    public Product(String name, String detailsUrl) {
        this.name = name;

        this.detailsUrl = detailsUrl;

    }

    @Override
    public String toString() {
        return name + 
                "\nDettagli: " + (detailsUrl.isEmpty() ? "N/D" : detailsUrl) ;

    }
}
