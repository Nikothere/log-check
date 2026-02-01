import java.nio.file.Files;
import java.nio.file.Path;
import java.util.GregorianCalendar;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("./src/main/resources/log.log"));


        int error = 0;
        int waring = 0;
        int info = 0;
        for (String line : lines) {
            if (line.contains("ERROR")) {
                error++;
            }
            if (line.contains("INFO")) {
                info++;
            }
            if (line.contains("WARING")) {
                waring++;
            }
        }
        System.out.println(color.RED + "error:" + error+ color.RESET +"");
        System.out.println(color.YELLOW + "waring:" + waring+ color.RESET +"");
        System.out.println(color.BLUE + "info: " + info + color.RESET + "");

    }
}