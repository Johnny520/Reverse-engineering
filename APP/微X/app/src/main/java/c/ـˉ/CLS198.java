// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class CLS198 {
    public static final String FLD938;
    public static final String FLD939;
    public static final String FLD940;
    public static final byte[] FLD941;

    // 此方法包含解密的字符串
    static {
        CLS198.FLD939 = "\uD8E3ES/CBC/PKCS7Padding";
        CLS198.FLD938 = "\uD8E3TF-8";
        CLS198.FLD940 = "\uD8E3HA-256";
        CLS198.FLD941 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    // 此方法包含解密的字符串
    public static byte[] MTH3210(SecretKeySpec secretKeySpec0, byte[] arr_b, byte[] arr_b1) {
        Cipher cipher0 = Cipher.getInstance("\uD8E3ES/CBC/PKCS7Padding");
        cipher0.init(2, secretKeySpec0, new IvParameterSpec(arr_b));
        return cipher0.doFinal(arr_b1);
    }

    // 此方法包含解密的字符串
    public static byte[] MTH3211(SecretKeySpec secretKeySpec0, byte[] arr_b, byte[] arr_b1) {
        Cipher cipher0 = Cipher.getInstance("\uD8E3ES/CBC/PKCS7Padding");
        cipher0.init(1, secretKeySpec0, new IvParameterSpec(arr_b));
        return cipher0.doFinal(arr_b1);
    }

    // 此方法包含解密的字符串
    public static String MTH3212(String s, String s1) {
        try {
            if(TextUtils.isEmpty(s1)) {
                return "";
            }
            SecretKeySpec secretKeySpec0 = CLS198.MTH3214(s);
            byte[] arr_b = Base64.decode(s1, 2);
            return new String(CLS198.MTH3210(secretKeySpec0, CLS198.FLD941, arr_b), "\uD8E3TF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new GeneralSecurityException(unsupportedEncodingException0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH3213(String s, String s1) {
        try {
            if(TextUtils.isEmpty(s1)) {
                return "";
            }
            SecretKeySpec secretKeySpec0 = CLS198.MTH3214(s);
            byte[] arr_b = Base64.decode(s1, 2);
            return new String(CLS198.MTH3210(secretKeySpec0, CLS198.FLD941, arr_b), "\uD8E3TF-8");
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static SecretKeySpec MTH3214(String s) {
        MessageDigest messageDigest0 = MessageDigest.getInstance("\uD8E3HA-256");
        byte[] arr_b = s.getBytes("\uD8E3TF-8");
        messageDigest0.update(arr_b, 0, arr_b.length);
        return new SecretKeySpec(messageDigest0.digest(), "\uD8E3ES");
    }

    // 此方法包含解密的字符串
    public static String MTH3215(String s, String s1) {
        try {
            SecretKeySpec secretKeySpec0 = CLS198.MTH3214(s);
            byte[] arr_b = s1.getBytes("\uD8E3TF-8");
            return Base64.encodeToString(CLS198.MTH3211(secretKeySpec0, CLS198.FLD941, arr_b), 2);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new GeneralSecurityException(unsupportedEncodingException0);
        }
    }
}

