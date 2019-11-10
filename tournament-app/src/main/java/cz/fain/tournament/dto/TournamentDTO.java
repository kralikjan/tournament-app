package cz.fain.tournament.dto;

import java.time.LocalDate;

public class TournamentDTO {

    private long id;
    private String name;
    private LocalDate date;

    public TournamentDTO() {
    }

    public TournamentDTO(long id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
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
}
