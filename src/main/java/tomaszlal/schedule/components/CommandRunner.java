package tomaszlal.schedule.components;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class CommandRunner{

   public void runCommand(List<String> commands){
       ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/C" , String.join(" ", commands));
       try {
           Process process = builder.start();
           System.out.println("Process run");
           int exitCode = process.waitFor();

           if (exitCode == 0) {
               System.out.println("Windows script executed successfully.");
           } else {
               System.err.println("Windows script failed with exit code: " + exitCode);
           }
       } catch (IOException | InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
}
