import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout1 = new FileOutputStream("C:\\Users\\tkatyal\\Desktop\\Streams\\src\\main\\resources\\file1.txt");
            FileOutputStream fout2 = new FileOutputStream("C:\\Users\\tkatyal\\Desktop\\Streams\\src\\main\\resources\\file2.txt");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            String s = "Hi people";
            byte[] res = s.getBytes();
            bout.write(res);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }


    }
}