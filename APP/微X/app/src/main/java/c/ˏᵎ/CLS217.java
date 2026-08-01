// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class CLS217 {
    public static final String FLD880;
    public static final byte[] FLD881;
    public static final String FLD882;
    public static final String FLD883;

    // 此方法包含解密的字符串
    static {
        CLS217.FLD882 = "AES/CBC/PKCS7Padding";
        CLS217.FLD883 = "UTF-8";
        CLS217.FLD880 = "SHA-256";
        CLS217.FLD881 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    // 此方法包含解密的字符串
    public static String MTH3042(String s, String s1) {
        try {
            if(TextUtils.isEmpty(s1)) {
                return "";
            }
            SecretKeySpec secretKeySpec0 = CLS217.MTH3045(s);
            byte[] arr_b = Base64.decode(s1, 2);
            return new String(CLS217.MTH3047(secretKeySpec0, CLS217.FLD881, arr_b), "UTF-8");
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static byte[] MTH3043(SecretKeySpec secretKeySpec0, byte[] arr_b, byte[] arr_b1) {
        Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher0.init(1, secretKeySpec0, new IvParameterSpec(arr_b));
        return cipher0.doFinal(arr_b1);
    }

    // 此方法包含解密的字符串
    public static String MTH3044(String s, String s1) {
        try {
            SecretKeySpec secretKeySpec0 = CLS217.MTH3045(s);
            byte[] arr_b = s1.getBytes("UTF-8");
            return Base64.encodeToString(CLS217.MTH3043(secretKeySpec0, CLS217.FLD881, arr_b), 2);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new GeneralSecurityException(unsupportedEncodingException0);
        }
    }

    // 此方法包含解密的字符串
    public static SecretKeySpec MTH3045(String s) {
        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
        byte[] arr_b = s.getBytes("UTF-8");
        messageDigest0.update(arr_b, 0, arr_b.length);
        return new SecretKeySpec(messageDigest0.digest(), "AES");
    }

    // 此方法包含解密的字符串
    public static String MTH3046(String s, String s1) {
        try {
            if(TextUtils.isEmpty(s1)) {
                return "";
            }
            SecretKeySpec secretKeySpec0 = CLS217.MTH3045(s);
            byte[] arr_b = Base64.decode(s1, 2);
            return new String(CLS217.MTH3047(secretKeySpec0, CLS217.FLD881, arr_b), "UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new GeneralSecurityException(unsupportedEncodingException0);
        }
    }

    // 此方法包含解密的字符串
    public static byte[] MTH3047(SecretKeySpec secretKeySpec0, byte[] arr_b, byte[] arr_b1) {
        Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher0.init(2, secretKeySpec0, new IvParameterSpec(arr_b));
        return cipher0.doFinal(arr_b1);
    }
}

