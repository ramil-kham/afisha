package tech.itpark.ad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Film {
    private long id;
    private double rating;
    private String image;
    private String ticketAvailability;
    private String filmName;
    private boolean like;
    private String URL;
    private long date;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTicketAvailability() {
        return ticketAvailability;
    }

    public void setTicketAvailability(String ticketAvailability) {
        this.ticketAvailability = ticketAvailability;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
