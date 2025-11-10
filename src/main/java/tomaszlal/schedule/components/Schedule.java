package tomaszlal.schedule.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Schedule {

    @Autowired
    private CommandRunner commandRunner;

    @Scheduled(cron = "0 0/3 * * * ?")
    public void croneTask() throws Exception {
        List<String> commands = Arrays.asList("c:\\script\\ping_run.bat", ">>", "c:\\script\\ping.log");
        commandRunner.runCommand(commands);
    }
}
