package fastdfs.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import sun.misc.BASE64Decoder;

/**
 *
 * 项目名称：  fastdfs-client
 * 类名称：  T2
 * 描述：  
 * @author 李仁佐
 * 创建时间：  2018年05月29日
 * 修改人：李仁佐    修改日期： 2018年05月29日
 * 修改备注：
 *
 */
public class T2 {
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();
    private static final Random random1 = new Random();
    static final BASE64Decoder decoder = new BASE64Decoder();
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.wrap(decoder.decodeBuffer("rBLkCVrQeYOAF3MrAAETwQfZhuY511"));
            byte[] ip = new byte[4];
            System.out.println(buffer.capacity());
            System.out.println(buffer.position());
            int bbb = buffer.getInt();
            System.out.println(ipToIPv4Str(T9.toLH(bbb)));

            buffer.get(ip,0,4);

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
