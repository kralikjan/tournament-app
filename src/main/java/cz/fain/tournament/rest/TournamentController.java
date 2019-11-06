package cz.fain.tournament.rest;

import cz.fain.tournament.dto.TournamentDTO;
import cz.fain.tournament.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/tournaments")
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @GetMapping
    public List<TournamentDTO> getTournaments() {
        return tournamentService.getTournaments();
    }

    @GetMapping("/{id}")
    public TournamentDTO getTournamentDetail(@PathVariable("id") long id) {
        return tournamentService.getTournamentById(id);
    }

    @PostMapping("")
    public List<TournamentDTO> addTournament(@RequestBody TournamentDTO tournament) {
        return tournamentService.addTournament(tournament);
    }
}

