package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Review {
    private String body;
    private String author;
    private int stars;
    private Restaurant restaurant;

    public Review(String body, String author, int stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    public class Restaurant {
        private String name;
        private int stars;
        private int priceCategory;
        private List<Review> reviews = new ArrayList<>();

        public Restaurant(String name, int stars, int priceCategory) {
            this.name = name;
            this.stars = stars;
            this.priceCategory = priceCategory;
            this.reviews = new ArrayList<>();
        }

        public String toString() {
            return name + " - " + stars + " - " + getPriceCategoryString();
        }

        private String getPriceCategoryString() {
            switch (priceCategory) {
                case 1:
                    return "Low";
                case 2:
                    return "Medium";
                case 3:
                    return "High";
                default:
                    return "Unknown";
            }

            private void addReview (Review review){
                if (!reviews.contains(review)) {
                    reviews.add(review);
                    System.out.println(review);
                    updateStarRating();
                } else {
                    System.out.println("Review already exists");
                }
            }
            private void updateStarRating() {
                for (Review review : reviews) {
                    review.setStars(review.getStars() + 1);
                }
            }
        }
    }

    public String toString() {
        return author + " rated " + stars + " stars: " + body + " ";
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
