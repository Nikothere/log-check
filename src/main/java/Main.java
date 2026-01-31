import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public  class Main {
    public static void main(String[] args) throws IOException {
        Path LogFile = Path.of("src/main/resources/log.log");

        List<String> lines = Files.readAllLines(LogFile);

        int error = 0;
        int info = 0;
        int warning = 0;

        for (String line : lines) {
            if (line.contains("ERROR")) {
                error++;
            }
            if (line.contains("INFO")) {
                info++;

            if (line.contains("WARNING")) {
                warning++;}
            }
        }

        System.out.println("error: " + error + " ");
        System.out.println("warning: " + warning + " ");
        System.out.println("info: " + info + " ");

        if (error == 0) {
            System.out.println("ошибок не найдено");

        }
    }
}