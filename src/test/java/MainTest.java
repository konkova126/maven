import java.io.File;
import org.junit.jupiter.api.Test;
class Tes{
    @org.junit.jupiter.api.Test
        public static void main(String[] args) {
            File file = new File("books.xml");

            if (file.exists() && file.isDirectory()) {
                System.out.println("Файл существует");
            }
            else {
                System.out.println("Файла нет");
            }

            if (file == null) {
                System.out.println("Файл пустой");
            }
            else {
                System.out.println("Файл содержит данные");
            }
        }
}
