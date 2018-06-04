package fastdfs.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import sun.misc.BASE64Decoder;


public class T2 {
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();
    private static final Random random1 = new Random();
    static final BASE64Decoder decoder = new BASE64Decoder();
    static final SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.wrap(decoder.decodeBuffer("rBMDJ1sVBbmAYW6gAAKGUJ6TR0Y583"));
            System.out.println(buffer.position());
            int bbb = buffer.getInt();
            System.out.println(ipToIPv4Str(T9.toLH(bbb)));
            Long times = Long.valueOf(buffer.getInt())*1000;
            System.out.println(simpleDateFormat.format(new Date(times)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String ipToIPv4Str(byte[] ip) {
        if (ip.length != 4) {
            return null;
        }
        return new StringBuilder().append(ip[3] & 0xFF).append(".").append(
            ip[2] & 0xFF).append(".").append(ip[1] & 0xFF)
            .append(".").append(ip[0] & 0xFF).toString();
    }
}
