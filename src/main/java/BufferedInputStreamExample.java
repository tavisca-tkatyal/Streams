import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception {
        int i;
        BufferedInputStream bfin = new BufferedInputStream(
                new FileInputStream
                        ("C:\\Users\\tkatyal\\Desktop\\Streams\\src\\main\\resources\\abc.txt"));
        while(( i = bfin.read())!= -1)
        System.out.print((char) i);

    }
}