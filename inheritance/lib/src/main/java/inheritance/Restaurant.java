package inheritance;

public class Restaurant {
    private String name;
    private int stars;
    private int priceCategory;

    public Restaurant(String name, int stars, int priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name + " - " + stars + " Stars - " + getPriceCategoryString();
        //return name + " - " + stars + " Stars";
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
        System.out.println("Price Category set to " + priceCategory);
    }

    public int getStars() {
        return stars;
        //return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
        System.out.println("Stars set to " + stars);
    }

    public String getPriceCategoryString() {
        switch (priceCategory) {
            case 2:
                return "Paid";
            case 1, 3:
            default:
                return "Free";
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory=" + priceCategory +
                '}';
        return name + " - " + stars + " Stars - " + getPriceCategoryString();
        return name + " - " + stars + " Stars";
    }
}
