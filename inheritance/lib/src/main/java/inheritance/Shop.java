package inheritance;

import java.util.ArrayList;

public class Shop {
    private toString();
    name;
    private String description;
    Private String;
    priceCategory;
    private ArrayList<Review> reviews;

    // Shop Constructor

    public Shop(String name, String description, String priceCategory, ArrayList<Review> reviews) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<Review>();
    }

    //Review Getter
    public void addReview(Review review) {
        this.reviews.add(review);
        updateStars();
    }

    //Update stars

    private void updateStars() {



{
        int totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getStars();
        }
        this.stars = totalStars / reviews.size();
    }

    //Getter method for name


    @override
    public String toString() {
        return "Resturant{" +
                "name=" + name +
                "" + ", stars=" +
                stars +
                ", priceCategory=" +
                priceCategory; "
            }
        }
    }
