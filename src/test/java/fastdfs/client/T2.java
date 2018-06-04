package fastdfs.client;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import sun.misc.BASE64Decoder;

public class T2 {
    static final BASE64Decoder decoder = new BASE64Decoder();
    static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("https://pic5.40017.cn/02/001/0c/51/rBLkCFlnNhCAFgn2AAGAqpjSpxM061.jpg");
        list.add("https://pic5.40017.cn/02/001/a0/7d/rBLkCVrQeYOAF3MrAAETwQfZhuY511.jpg");
        list.add("https://pic5.40017.cn/02/000/c8/11/rBANDFlTDROAKfRNAAAMV_4iaS4649.png");
        list.add("https://pic5.40017.cn/02/000/8f/7a/rBLkCFpfGHWANa5NAAEp8naNPvU199.png");
        list.add("https://pic5.40017.cn/02/001/60/ff/rBLkCFk0xXaAI46WAAAOiNx60H8196.png");
        list.add("https://pic5.40017.cn/01/000/18/2e/rBLkBVouUP2AXbmrAAAXSvV1ElE115.png");
        list.add("https://pic5.40017.cn/01/000/78/d3/rBANC1pVwrmAR6SYAABpMyPXkK4167.png");
        list.add("https://pic5.40017.cn/01/000/79/0a/rBLkBVpVuxmAUQqmAAARnUFXcFc487.png");
        list.add("https://pic5.40017.cn/01/000/79/32/rBLkBlpVv-OAMoXAAAAOqocX-3E530.png");
        list.add("https://pic5.40017.cn/01/000/79/3d/rBLkBVpVwUmASXS8AAAPE7735LQ814.png");
        list.add("https://pic5.40017.cn/01/000/a1/27/rBANC1nIdSmAZUDIAAAL873Wca0152.png");
        list.add("https://pic5.40017.cn/01/000/c4/16/rBANC1lSDc2AKOo9AAAG41u6fLM393.png");
        list.add("https://pic5.40017.cn/01/000/c4/77/rBLkBVlSCqiAGHhQAAAGTfD9rkg019.png");
        list.add("https://pic5.40017.cn/01/000/c4/8b/rBLkBllSDc2AQCHPAAAG1uGJrdE475.png");
        list.add("https://pic5.40017.cn/01/000/da/de/rBLkBVnbDYGAekjCAAA0yDs-n4k495.png");
        list.add("https://pic5.40017.cn/01/000/df/9e/rBLkBVlZq--AKfvAAAAD4UrgA9o260.png");
        list.add("https://pic5.40017.cn/01/000/e0/3f/rBLkBlncbuqAcc3CAAFplIw5l4M408.jpg");
        list.add("https://pic5.40017.cn/01/000/e3/cf/rBLkBllbB16AMRfvAAAEBR06Uak825.png");
        list.add("https://pic5.40017.cn/01/000/e4/48/rBANC1lcRcuAM2LUAAAUJeqBfhk143.png");
        list.add("https://pic5.40017.cn/01/000/e5/9a/rBANC1nd8AKAajMOAAFp46yICr8209.jpg");
        list.add("https://pic5.40017.cn/01/001/00/48/rBANC1kZFPCADiAtAAAFjRvd9UA030.png");
        list.add("https://pic5.40017.cn/01/001/0c/05/rBANC1lnNrWABbwjAAGlt6l2x5U691.jpg");
        list.add("https://pic5.40017.cn/01/001/49/e4/rBANC1kuodqATRP7AAAHYiRVx6Q801.png");
        list.add("https://pic5.40017.cn/01/001/6e/1a/rBLkBVk4tzaANgJIAAAFAEOk3cw261.gif");
        list.add("https://pic5.40017.cn/01/001/7b/51/rBANC1pWyPqAP0FrAAAfYpTQo5U114.png");
        list.add("https://pic5.40017.cn/01/001/7b/60/rBANC1pW0F6AAgykAAAcbQw-0TI473.png");
        list.add("https://pic5.40017.cn/01/001/8f/35/rBANC1pfKF2ABzvyAAEBueh2atc504.png");
        list.add("https://pic5.40017.cn/01/001/ad/ac/rBANC1lLOI-AXUy7AAAFVopbdYs793.png");
        list.add("https://pic5.40017.cn/01/001/ad/f1/rBLkBllLLFWAeBmGAAAHsZvO0V0724.png");
        list.add("https://pic5.40017.cn/01/001/d1/75/rBLkBVlVrWCAAxdUAAAFgfg-mTc328.png");
        list.add("https://pic5.40017.cn/01/001/da/de/rBLkBlnbDYGAXPs4AAAnYnV-jMg313.png");
        list.add("https://pic5.40017.cn/01/001/df/6d/rBLkBllZnyyAUFSzAAAGg9cCiSw152.png");
        list.add("https://pic5.40017.cn/01/001/f2/17/rBANC1sPnDOAWRfgAACtfu8IJAg064.png");
        list.add("https://pic5.40017.cn/01/001/f2/8b/rBLkBVsPmlyAEIo1AAFaTowcTKY823.jpg");
        list.add("https://pic5.40017.cn/02/000/0c/4d/rBLkCFlnM_GAeQFzAAGDHMT5kW8736.jpg");
        list.add("https://pic5.40017.cn/02/000/22/eb/rBANDFlt1w2AAcODAAAxb_vVdAo345.png");
        list.add("https://pic5.40017.cn/02/000/7b/ab/rBLkCFpWw3SADW2dAAAzuL-uW5Y746.jpg");
        list.add("https://pic5.40017.cn/02/000/8f/7a/rBLkCFpfGHWANa5NAAEp8naNPvU199.png");
        list.add("https://pic5.40017.cn/02/000/8f/8e/rBLkCVpfIJuAS3r0AABATIJEtBg360.png");
        list.add("https://pic5.40017.cn/02/000/ae/ed/rBANDFlLgHaAWqoKAAAE9HaaBwA216.png");
        list.add("https://pic5.40017.cn/02/000/c4/0b/rBLkCVlR-Z6AekQXAAADoKE_F1g231.png");
        list.add("https://pic5.40017.cn/02/000/c8/11/rBANDFlTDROAKfRNAAAMV_4iaS4649.png");
        list.add("https://pic5.40017.cn/02/000/da/b8/rBLkCVnbDYGAVcZ_AAAX3VD-qss361.png");
        list.add("https://pic5.40017.cn/02/000/e0/19/rBLkCVncbi2AAfHzAAGGHtQ-qOo628.jpg");
        list.add("https://pic5.40017.cn/02/000/e5/94/rBLkCVlclLOAR-lfAAAosTpAKZk561.png");
        list.add("https://pic5.40017.cn/02/001/0c/51/rBLkCFlnNhCAFgn2AAGAqpjSpxM061.jpg");
        list.add("https://pic5.40017.cn/02/001/22/eb/rBANDFlt1zWAA1USAAA061z7TCE920.png");
        list.add("https://pic5.40017.cn/02/001/44/bb/rBLkCVqeUruAIKXkAAAPqCc0cno647.png");
        list.add("https://pic5.40017.cn/02/001/60/ff/rBLkCFk0xXaAI46WAAAOiNx60H8196.png");
        list.add("https://pic5.40017.cn/02/001/62/aa/rBLkCVk1Q4uACVSjAABAAAZUrZE604.png");
        list.add("https://pic5.40017.cn/02/001/7b/5e/rBANDFpWxU-AW7AtAACSchThUsg788.png");
        list.add("https://pic5.40017.cn/02/001/8f/8e/rBLkCFpfIJuATfYGAAAM22ccGgA305.png");
        list.add("https://pic5.40017.cn/02/001/a0/7d/rBLkCVrQeYOAF3MrAAETwQfZhuY511.jpg");
        list.add("https://pic5.40017.cn/02/001/a4/ea/rBLkCVpm_PGAJdRQAAAImuM2VkM877.png");
        list.add("https://pic5.40017.cn/02/001/c4/64/rBANDFlSDb6AfjP4AAAHY8MOKo4276.png");
        list.add("https://pic5.40017.cn/02/001/c4/64/rBANDFlSDc2AUtrLAAAHB0tskPs990.png");
        list.add("https://pic5.40017.cn/02/001/c8/11/rBLkCFlTDRSAeCCSAAALMCK2YgM846.png");
        list.add("https://pic5.40017.cn/02/001/e0/19/rBANDFncbWuAYsDUAAJHXWMEFoI714.jpg");
        list.add("https://pic5.40017.cn/02/001/e4/96/rBLkCFlcRZ-Ab6sMAABKEi1-CBg046.png");
        list.add("https://pic5.40017.cn/02/001/e4/dc/rBLkCFlcXQqAe1nJAADHdsrPMPs903.jpg");

        list.forEach(str -> getFileMessage(str));

    }

    private static void getFileMessage(String FileIdtemp) {
        try {
            String FileId = FileIdtemp.substring(FileIdtemp.lastIndexOf("/")+1,FileIdtemp.lastIndexOf("."));

            ByteBuffer buffer = ByteBuffer.wrap(decoder.decodeBuffer(FileId));
            int port = buffer.getInt();
            System.out.print(ipToIPv4Str(T9.toLH(port))+"\t");//address

            Long times = Long.valueOf(buffer.getInt()) * 1000;
            System.out.print(simpleDateFormat.format(new Date(times))+"\t"); //createTime

            buffer.getInt();   //crc32

            System.out.println((buffer.getInt() / 1024) + "kb\t\t" +FileIdtemp ); //fileSize
        } catch (Exception e) {
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
