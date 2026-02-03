import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("a tool that is always at hand");
            System.out.println(".__                                        .__   \n" +
                    "|  |   ____   ____           _____    ____ |  |  \n" +
                    "|  |  /  _ \\ / ___\\   ______ \\__  \\  /    \\|  |  \n" +
                    "|  |_(  <_> ) /_/  > /_____/  / __ \\|   |  \\  |__\n" +
                    "|____/\\____/\\___  /          (____  /___|  /____/\n" +
                    "           /_____/                \\/     \\/      " +
                    "" +
                    "By: Niko_there");
            System.out.println(Ansi.BLUE + "Usage:" + Ansi.RESET + " log-anl <log-file>");
            return;
        }


        Path file = Path.of(args[0]);

        if (!Files.exists(file)) {
            System.out.println(Ansi.RED + "file not exist: " + Ansi.RESET + file);
        }

        List<String> lines = Files.readAllLines(file);

        int war = 0;
        int err = 0;
        int inf = 0;

        for (String line : lines) {
            if (line.contains("WARNING")) {
                war++;
            } if (line.contains("ERROR")) {
                err++;

            }  if (line.contains("INFO")) {
                inf++;
            }
        }
        System.out.println(Ansi.RED + "error" + Ansi.RESET + err);
        System.out.println(Ansi.BLUE + "info:" + Ansi.RESET + inf);
        System.out.println(Ansi.YELLOW + "warning:" + Ansi.RESET + war);
    }
}