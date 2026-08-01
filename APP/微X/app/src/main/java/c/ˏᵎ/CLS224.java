// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import c.ˉˆ.CLS70;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

@SuppressLint({"NewApi"})
public class CLS224 {
    public static final HashMap FLD906;
    public static final HashMap FLD907;

    static {
        CLS224.FLD906 = new HashMap();
        CLS224.FLD907 = new HashMap();
    }

    // 此方法包含解密的字符串
    public static byte[] MTH3086(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            JarFile jarFile0 = new JarFile(s);
            JarEntry jarEntry0 = jarFile0.getJarEntry("classes.dex");
            if(jarEntry0 == null) {
                return null;
            }
            InputStream inputStream0 = jarFile0.getInputStream(jarEntry0);
            byte[] arr_b = new byte[inputStream0.available()];
            while(true) {
                if(inputStream0.read(arr_b) == -1) {
                    inputStream0.close();
                    Certificate[] arr_certificate = jarEntry0.getCertificates();
                    byte[] arr_b1 = arr_certificate == null || arr_certificate.length <= 0 ? null : arr_certificate[0].getEncoded();
                    jarFile0.close();
                    return arr_b1;
                }
            }
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static String MTH3087(Context context0, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            PackageInfo packageInfo0 = CLS180.MTH2633(context0, s, 0x40);
            return packageInfo0 == null ? null : CLS224.MTH3091(packageInfo0.signatures[0].toByteArray());
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH3088(Context context0, String s) {
        HashMap hashMap0 = CLS224.FLD906;
        if(hashMap0.containsKey(s)) {
            return (String)hashMap0.get(s);
        }
        String s1 = CLS224.MTH3087(context0, s);
        if(!TextUtils.isEmpty(s1)) {
            hashMap0.put(s, s1);
            return s1;
        }
        Context context1 = CLS180.MTH2626(context0, s);
        if(context1 == null) {
            return "";
        }
        String s2 = CLS224.MTH3091(CLS224.MTH3086(context1.getPackageCodePath()));
        hashMap0.put(s, s2);
        return s2;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static boolean MTH3089() {
        return !"".equals(((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2127());
    }

    public static String MTH3090(String s) [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public static String MTH3091(byte[] arr_b) {
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

