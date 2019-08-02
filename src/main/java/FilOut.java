import java.io.FileNotFoundException;
import java.io.IOException;

public class FilOut {
    public static void main(String[] args) throws IOException {
        try {
            java.io.FileOutputStream fout;
            fout = new java.io.FileOutputStream("C:\\Users\\tkatyal\\Desktop\\Practice\\src\\main\\resources\\Demo.txt");
            String s = "Hi Tapsi, How are you?";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }}
}
