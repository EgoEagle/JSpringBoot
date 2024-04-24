package dev.lin.runners.run;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
}
