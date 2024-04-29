package dev.lin.runners.run;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunRepository runRepository;

    RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @GetMapping
    List<Run> findAll() {
        return runRepository.findAll();
    }
}
