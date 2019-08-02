import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) throws IOException {
        int i=0;
        try (java.io.FileInputStream fin = new java.io.FileInputStream("C:\\Users\\tkatyal\\Desktop\\Streams\\src\\main\\resources\\Demo.txt")) {
           while ((i=fin.read())!= -1) {
               System.out.print((char) i);
           }
        }

    }
}
