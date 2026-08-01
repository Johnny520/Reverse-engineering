// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import java.security.MessageDigest;
import java.util.HashMap;

public final class CLS31 {
    public static final HashMap FLD446;

    static {
        CLS31.FLD446 = new HashMap();
    }

    public static String MTH1332(String s) [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public static String MTH1333(byte[] arr_b) {
        if(arr_b == null) {
            return "";
        }
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
            messageDigest0.update(arr_b);
            byte[] arr_b1 = messageDigest0.digest();
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < arr_b1.length; ++v) {
                stringBuilder0.append(Integer.toHexString(arr_b1[v] & 0xFF));
            }
            return stringBuilder0.toString();
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            return "";
        }
    }
}

