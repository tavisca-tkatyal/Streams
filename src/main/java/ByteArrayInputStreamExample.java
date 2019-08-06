import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fread1 = new FileInputStream("C:\\Users\\tkatyal\\Desktop\\Streams\\src\\main\\resources\\file1.txt");
            FileInputStream fread2 = new FileInputStream("C:\\Users\\tkatyal\\Desktop\\Streams\\src\\main\\resources\\file2.txt");
            byte[] bytes = fread1.readAllBytes();
            ByteArrayInputStream byteRead = new ByteArrayInputStream(bytes);
            int i;
            while ((i=byteRead.read())!= -1)
            {
                char ch = (char)i;
                System.out.print((ch));
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }

}