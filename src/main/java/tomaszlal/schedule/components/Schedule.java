package tomaszlal.schedule.components;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Schedule {

    @Scheduled(fixedRate = 10000)
    public void fixedRateTask() {
        System.out.println("Run taska on: "+ LocalTime.now());
    }
}
