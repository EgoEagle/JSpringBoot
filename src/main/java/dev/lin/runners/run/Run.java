package dev.lin.runners.run;

import java.time.Duration;
import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {}

//Can get record values but not modify