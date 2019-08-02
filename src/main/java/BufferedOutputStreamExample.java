import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws Exception {


            BufferedOutputStream bfin = new BufferedOutputStream(new FileOutputStream("C:\\Users\\tkatyal\\Desktop\\Streams\\src\\main\\resources\\abc.txt"));
            String s = "Hi there";
            byte data[] = s.getBytes();
            bfin.write(data);
            bfin.flush();


    }

}