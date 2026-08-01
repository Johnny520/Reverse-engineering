// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.util.Xml;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.jar.JarFile;
import org.xmlpull.v1.XmlPullParser;

public class CLS161 {
    public static String FLD648 = null;
    public static String FLD649 = null;
    public static String FLD650 = null;
    public static boolean FLD651 = false;
    public static int FLD652 = 0x100102;
    public static int FLD653 = 0x100103;

    // 此方法包含解密的字符串
    static {
        CLS161.FLD648 = "                                             ";
    }

    public static String MTH2278(byte[] arr_b, int v) {
        int v1 = arr_b[v + 1] << 8 & 0xFF00 | arr_b[v] & 0xFF;
        byte[] arr_b1 = new byte[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_b1[v2] = arr_b[v + 2 + v2 * 2];
        }
        return new String(arr_b1);
    }

    public static String MTH2279() {
        return CLS161.FLD649;
    }

    // 此方法包含解密的字符串
    public static String MTH2280(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = CLS161.MTH2283(arr_b, 16) * 4 + 36;
        int v1 = CLS161.MTH2283(arr_b, 12);
        for(int v2 = v1; v2 < arr_b.length - 4; v2 += 4) {
            if(CLS161.MTH2283(arr_b, v2) == CLS161.FLD652) {
                v1 = v2;
                break;
            }
        }
        int v3 = -2;
        int v4 = 0;
        while(v1 < arr_b.length) {
            int v5 = CLS161.MTH2283(arr_b, v1);
            int v6 = CLS161.MTH2283(arr_b, v1 + 8);
            CLS161.MTH2283(arr_b, v1 + 16);
            int v7 = CLS161.MTH2283(arr_b, v1 + 20);
            if(v5 == CLS161.FLD652) {
                CLS161.MTH2283(arr_b, v1 + 24);
                int v8 = CLS161.MTH2283(arr_b, v1 + 28);
                v1 += 36;
                String s = CLS161.MTH2285(arr_b, 36, v, v7);
                StringBuilder stringBuilder1 = new StringBuilder();
                for(int v9 = 0; v9 < v8; ++v9) {
                    CLS161.MTH2283(arr_b, v1);
                    int v10 = CLS161.MTH2283(arr_b, v1 + 4);
                    int v11 = CLS161.MTH2283(arr_b, v1 + 8);
                    CLS161.MTH2283(arr_b, v1 + 12);
                    int v12 = CLS161.MTH2283(arr_b, v1 + 16);
                    v1 += 20;
                    String s1 = CLS161.MTH2285(arr_b, 36, v, v10);
                    String s2 = v11 == -1 ? "resourceID 0x" + Integer.toHexString(v12) : CLS161.MTH2285(arr_b, 36, v, v11);
                    stringBuilder1.append(" ");
                    stringBuilder1.append(s1);
                    stringBuilder1.append("=\"");
                    stringBuilder1.append(s2);
                    stringBuilder1.append("\"");
                }
                stringBuilder0.append(CLS161.MTH2282(v4, "<" + s + stringBuilder1 + ">"));
                ++v4;
                v3 = v6;
            }
            else {
                if(v5 != CLS161.FLD653) {
                    break;
                }
                --v4;
                v1 += 24;
                stringBuilder0.append(CLS161.MTH2282(v4, "</" + CLS161.MTH2285(arr_b, 36, v, v7) + ">  (line " + v3 + "-" + v6 + ")"));
            }
        }
        return stringBuilder0.toString();
    }

    public static String MTH2281() {
        return CLS161.FLD650;
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public static String MTH2282(int v, String s) {
        return "                                             ".substring(0, Math.min(v * 2, 45)) + s;
    }

    public static int MTH2283(byte[] arr_b, int v) {
        return arr_b[v] & 0xFF | (arr_b[v + 3] << 24 & 0xFF000000 | arr_b[v + 2] << 16 & 0xFF0000 | arr_b[v + 1] << 8 & 0xFF00);
    }

    // 此方法包含解密的字符串
    public static void MTH2284(String s) {
        if(CLS161.FLD651) {
            return;
        }
        try {
            if(!CLS176.MTH2577(s)) {
                return;
            }
            JarFile jarFile0 = new JarFile(s);
            InputStream inputStream0 = jarFile0.getInputStream(jarFile0.getEntry("AndroidManifest.xml"));
            byte[] arr_b = new byte[inputStream0.available()];
            inputStream0.read(arr_b);
            String s1 = CLS161.MTH2280(arr_b);
            if(!s1.isEmpty()) {
                ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(s1.getBytes());
                XmlPullParser xmlPullParser0 = Xml.newPullParser();
                xmlPullParser0.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                xmlPullParser0.setInput(byteArrayInputStream0, null);
                xmlPullParser0.nextTag();
                if("Manifest".equalsIgnoreCase(xmlPullParser0.getName())) {
                    CLS161.FLD650 = xmlPullParser0.getAttributeValue(null, "versionName");
                    CLS161.FLD649 = xmlPullParser0.getAttributeValue(null, "package");
                }
            }
            CLS161.FLD651 = true;
        }
        catch(Throwable unused_ex) {
        }
    }

    public static String MTH2285(byte[] arr_b, int v, int v1, int v2) {
        return v2 >= 0 ? CLS161.MTH2278(arr_b, v1 + CLS161.MTH2283(arr_b, v + v2 * 4)) : null;
    }
}

