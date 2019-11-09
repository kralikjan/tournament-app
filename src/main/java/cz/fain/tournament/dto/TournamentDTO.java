package cz.fain.tournament.dto;

import java.time.LocalDate;

public class TournamentDTO {

    private long id;
    private String name;
    private String place;
    private LocalDate date;

    public TournamentDTO() {
    }

    public TournamentDTO(long id, String name, LocalDate date, String place) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.place = place;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}
