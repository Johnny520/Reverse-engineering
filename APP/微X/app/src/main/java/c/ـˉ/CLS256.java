// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.util.Xml;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.jar.JarFile;
import org.xmlpull.v1.XmlPullParser;

public class CLS256 {
    public static int FLD1081 = 0x100103;
    public static String FLD1082 = null;
    public static int FLD1083 = 0x100102;
    public static String FLD1084;
    public static boolean FLD1085;
    public static String FLD1086;

    // 此方法包含解密的字符串
    static {
        CLS256.FLD1084 = "\uD8E3                                            ";
    }

    public static String MTH3700(byte[] arr_b, int v, int v1, int v2) {
        return v2 >= 0 ? CLS256.MTH3703(arr_b, v1 + CLS256.MTH3702(arr_b, v + v2 * 4)) : null;
    }

    public static String MTH3701() {
        return CLS256.FLD1082;
    }

    public static int MTH3702(byte[] arr_b, int v) {
        return arr_b[v] & 0xFF | (arr_b[v + 3] << 24 & 0xFF000000 | arr_b[v + 2] << 16 & 0xFF0000 | arr_b[v + 1] << 8 & 0xFF00);
    }

    public static String MTH3703(byte[] arr_b, int v) {
        int v1 = arr_b[v + 1] << 8 & 0xFF00 | arr_b[v] & 0xFF;
        byte[] arr_b1 = new byte[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_b1[v2] = arr_b[v + 2 + v2 * 2];
        }
        return new String(arr_b1);
    }

    // 此方法包含解密的字符串
    public static void MTH3704(String s) {
        if(CLS256.FLD1085) {
            return;
        }
        try {
            if(!CLS262.MTH4045(s)) {
                return;
            }
            JarFile jarFile0 = new JarFile(s);
            InputStream inputStream0 = jarFile0.getInputStream(jarFile0.getEntry("\uD8E3ndroidManifest.xml"));
            byte[] arr_b = new byte[inputStream0.available()];
            inputStream0.read(arr_b);
            String s1 = CLS256.MTH3707(arr_b);
            if(!s1.isEmpty()) {
                ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(s1.getBytes());
                XmlPullParser xmlPullParser0 = Xml.newPullParser();
                xmlPullParser0.setFeature("\uD8E3ttp://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                xmlPullParser0.setInput(byteArrayInputStream0, null);
                xmlPullParser0.nextTag();
                if("\uD8E3anifest".equalsIgnoreCase(xmlPullParser0.getName())) {
                    CLS256.FLD1086 = xmlPullParser0.getAttributeValue(null, "\uD8E3ersionName");
                    CLS256.FLD1082 = xmlPullParser0.getAttributeValue(null, "\uD8E3ackage");
                }
            }
            CLS256.FLD1085 = true;
        }
        catch(Throwable unused_ex) {
        }
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public static String MTH3705(int v, String s) {
        return "\uD8E3                                            ".substring(0, Math.min(v * 2, 45)) + s;
    }

    public static String MTH3706() {
        return CLS256.FLD1086;
    }

    // 此方法包含解密的字符串
    public static String MTH3707(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = CLS256.MTH3702(arr_b, 16) * 4 + 36;
        int v1 = CLS256.MTH3702(arr_b, 12);
        for(int v2 = v1; v2 < arr_b.length - 4; v2 += 4) {
            if(CLS256.MTH3702(arr_b, v2) == CLS256.FLD1083) {
                v1 = v2;
                break;
            }
        }
        int v3 = -2;
        int v4 = 0;
        while(v1 < arr_b.length) {
            int v5 = CLS256.MTH3702(arr_b, v1);
            int v6 = CLS256.MTH3702(arr_b, v1 + 8);
            CLS256.MTH3702(arr_b, v1 + 16);
            int v7 = CLS256.MTH3702(arr_b, v1 + 20);
            if(v5 == CLS256.FLD1083) {
                CLS256.MTH3702(arr_b, v1 + 24);
                int v8 = CLS256.MTH3702(arr_b, v1 + 28);
                v1 += 36;
                String s = CLS256.MTH3700(arr_b, 36, v, v7);
                StringBuilder stringBuilder1 = new StringBuilder();
                for(int v9 = 0; v9 < v8; ++v9) {
                    CLS256.MTH3702(arr_b, v1);
                    int v10 = CLS256.MTH3702(arr_b, v1 + 4);
                    int v11 = CLS256.MTH3702(arr_b, v1 + 8);
                    CLS256.MTH3702(arr_b, v1 + 12);
                    int v12 = CLS256.MTH3702(arr_b, v1 + 16);
                    v1 += 20;
                    String s1 = CLS256.MTH3700(arr_b, 36, v, v10);
                    String s2 = v11 == -1 ? "\uD8E3esourceID 0x" + Integer.toHexString(v12) : CLS256.MTH3700(arr_b, 36, v, v11);
                    stringBuilder1.append("\uD8E3");
                    stringBuilder1.append(s1);
                    stringBuilder1.append("\uD8E3\"");
                    stringBuilder1.append(s2);
                    stringBuilder1.append("\uD8E3");
                }
                stringBuilder0.append(CLS256.MTH3705(v4, "\uD8E3" + s + stringBuilder1 + "\uD8E3"));
                ++v4;
                v3 = v6;
            }
            else {
                if(v5 != CLS256.FLD1081) {
                    break;
                }
                --v4;
                v1 += 24;
                stringBuilder0.append(CLS256.MTH3705(v4, "\uD8E3/" + CLS256.MTH3700(arr_b, 36, v, v7) + "\uD8E3  (line " + v3 + "\uD8E3" + v6 + "\uD8E3"));
            }
        }
        return stringBuilder0.toString();
    }
}

