public class Product {

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    // Private means that it is valid in block it described.

    private String kod;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        //_id=id;
        this.id=id;
        //id'ler karıştığı için this. yaparak içinde bulunduğumuz calssı kasdettiğimizi söylüyoruz.
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
