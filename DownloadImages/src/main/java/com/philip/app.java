package com.philip;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class app {
    public static void main(String[] args) {

        String url = "//img13.360buyimg.com/n12/s750x750_jfs/t1/200614/38/35848/63802/647ed1eaF8365bf25/53fc36ec08cdd0f0.jpg";
        String pro = "http:";
        String xx = pro + url;
        BufferedImage bufferedImage = null;
        try {
            URL u = new URL(xx);
            bufferedImage = ImageIO.read(u);
            File file = new File("/Users/philip/Documents/Picture/out.jpg");
            ImageIO.write(bufferedImage,"jpg",file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
