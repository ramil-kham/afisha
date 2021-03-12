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
}
