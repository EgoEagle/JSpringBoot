package dev.lin.runners.run;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/runs")

public class RunController {

    //private List<Run> runs = new ArrayList<>();
    private final RunRepository runRepository;


    public RunController(RunRepository runRepository){
        this.runRepository = runRepository;
    }

    @GetMapping("/api/runs")
    List<Run> findAll(){
        return runRepository.findAll();
    }

    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id){

        Optional<Run> run = runRepository.findById(id);
        if(run.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return run.get();
    }


    //post
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@RequestBody Run run){

        runRepository.create(run);
    }

    //put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@RequestBody Run run,Integer id){
        runRepository.update(run,id);

    }
    //delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    void delete(@PathVariable Integer id){
        runRepository.delete(id);
    }
}
