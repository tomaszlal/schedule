package tomaszlal.schedule.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Schedule {

    @Autowired
    private CommandRunner commandRunner;

    @Scheduled(fixedRate = 10000)
    public void fixedRateTask() throws Exception {
        System.out.println("Run task on: "+ LocalTime.now());
        commandRunner.run("ls -l > /home/tomasz/kupa.txt");
    }
}
