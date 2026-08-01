// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import java.security.MessageDigest;
import java.util.HashMap;

public final class CLS431 {
    public static final HashMap FLD4158;

    static {
        CLS431.FLD4158 = new HashMap();
    }

    public static String MTH6160(String s) {
        HashMap hashMap0 = CLS431.FLD4158;
        if(hashMap0.containsKey(s)) {
            return (String)hashMap0.get(s);
        }
        String s1 = CLS431.MTH6161(s.getBytes());
        hashMap0.put(s, s1);
        return s1;
    }

    // 此方法包含解密的字符串
    public static String MTH6161(byte[] arr_b) {
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

