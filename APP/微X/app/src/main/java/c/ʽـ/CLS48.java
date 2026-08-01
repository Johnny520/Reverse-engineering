// Decompiled by JEB v5.42.0.202606242140

package c.ʽـ;

public class CLS48 {
    public static String MTH1003(long v, String[] arr_s) {
        long v1 = CLS50.MTH1008(CLS50.MTH1009(0xFFFFFFFFL & v));
        long v2 = CLS50.MTH1008(v1);
        int v3 = (int)(v >>> 0x20 ^ v1 >>> 0x20 & 0xFFFFL ^ v2 >>> 16 & 0xFFFFFFFFFFFF0000L);
        long v4 = CLS48.MTH1004(v3, arr_s, v2);
        int v5 = (int)(v4 >>> 0x20 & 0xFFFFL);
        char[] arr_c = new char[v5];
        for(int v6 = 0; v6 < v5; ++v6) {
            v4 = CLS48.MTH1004(v3 + v6 + 1, arr_s, v4);
            arr_c[v6] = (char)(((int)(v4 >>> 0x20 & 0xFFFFL)));
        }
        return new String(arr_c);
    }

    public static long MTH1004(int v, String[] arr_s, long v1) {
        return ((long)arr_s[v / 0x1FFF].charAt(v % 0x1FFF)) << 0x20 ^ CLS50.MTH1008(v1);
    }
}

