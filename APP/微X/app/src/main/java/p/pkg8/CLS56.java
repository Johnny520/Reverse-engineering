// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class CLS56 {
    public static final byte[] FLD370;

    // 此方法包含解密的字符串
    static {
        new String("AES/CBC/PKCS7Padding");
        new String("UTF-8");
        new String("SHA-256");
        CLS56.FLD370 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    // 此方法包含解密的字符串
    public static String MTH953(String s, String s1) {
        try {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                SecretKeySpec secretKeySpec0 = CLS56.MTH954(s);
                byte[] arr_b = Base64.decode(s1, 2);
                Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher0.init(2, secretKeySpec0, new IvParameterSpec(CLS56.FLD370));
                return new String(cipher0.doFinal(arr_b), "UTF-8");
            }

            return "";
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static SecretKeySpec MTH954(String s) {
        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
        byte[] arr_b = s.getBytes(StandardCharsets.UTF_8);
        messageDigest0.update(arr_b, 0, arr_b.length);
        return new SecretKeySpec(messageDigest0.digest(), "AES");
    }

    // 此方法包含解密的字符串
    public static String MTH955(String s, String s1) {
        try {
            SecretKeySpec secretKeySpec0 = CLS56.MTH954(s);
            byte[] arr_b = s1.getBytes("UTF-8");
            Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher0.init(1, secretKeySpec0, new IvParameterSpec(CLS56.FLD370));
            return Base64.encodeToString(cipher0.doFinal(arr_b), 2);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new GeneralSecurityException(unsupportedEncodingException0);
        }
    }
}

