package dev.lin.runners.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoUnit;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();
    List<Run> findAll(){
        return runs;
    }

    @PostConstruct

    private void init(){
        runs.add(new Run( 1,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                3,
                Location.INDOOR));

        runs.add(new Run( 2,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                8,
                Location.INDOOR));
    }
}
