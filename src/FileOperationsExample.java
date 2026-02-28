import java.io.*;

public class FileOperationsExample {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello Vamsi\n");
            writer.write("Learning File Handling in Java\n");
            writer.close();

            FileWriter appendWriter = new FileWriter(fileName, true);
            appendWriter.write("Appending new line\n");
            appendWriter.close();

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
