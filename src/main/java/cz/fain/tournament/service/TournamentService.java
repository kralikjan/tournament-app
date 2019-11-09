package cz.fain.tournament.service;

import cz.fain.tournament.dto.TournamentDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TournamentService {

    //Only for demo - private fields are forbidden at service
    private List<TournamentDTO> tournaments = Arrays.asList(new TournamentDTO(1, "FAI checkers 2019", LocalDate.of(2019, 11, 2),"Zlín"),
            new TournamentDTO(2, "FAI checkers 2020", LocalDate.of(2020, 11, 3),""));

    public List<TournamentDTO> getTournaments() {
        return tournaments;
    }

    public TournamentDTO getTournamentById(long id) {
        return tournaments
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .get();
    }

    public List<TournamentDTO> addTournament(TournamentDTO tournament) {
        List<TournamentDTO> localTournaments = new ArrayList<>(tournaments);
        localTournaments.add(tournament);
        tournaments = localTournaments;
        return localTournaments;
    }
}
