import java.io.*;

public class main {
    public static void main(String[] args) {
        String inputFilePath = "";
        String outputFilePath = "";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace(" ", "-");
                writer.write(modifiedLine);
                writer.newLine();
            }
            System.out.println("Plik został skopiowany i zmodyfikowany.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd pliku: " + e.getMessage());
        }
    }
}
