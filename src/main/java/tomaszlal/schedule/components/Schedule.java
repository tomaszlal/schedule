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

    @Scheduled(cron = "0 10 23 * * *")
    public void croneTask0() throws Exception {
        List<String> commands = Arrays.asList("c:\\script\\ping_run.bat", ">>", "c:\\script\\ping.log");
        commandRunner.runCommand(commands);
    }
    @Scheduled(cron = "0 13 23 * * *")
    public void croneTask1() throws Exception {
        List<String> commands = Arrays.asList("c:\\script\\ping_run.bat", ">>", "c:\\script\\ping.log");
        commandRunner.runCommand(commands);
    }
    @Scheduled(cron = "0 17 23 * * *")
    public void croneTask2() throws Exception {
        List<String> commands = Arrays.asList("c:\\script\\ping_run.bat", ">>", "c:\\script\\ping.log");
        commandRunner.runCommand(commands);
    }
}
