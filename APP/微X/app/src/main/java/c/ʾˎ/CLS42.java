// Decompiled by JEB v5.42.0.202606242140

package c.ʾˎ;

public class CLS42 {
    public static long MTH859(int v, String[] arr_s, long v1) {
        return ((long)arr_s[v / 0x1FFF].charAt(v % 0x1FFF)) << 0x20 ^ CLS40.MTH855(v1);
    }

    public static String MTH860(long v, String[] arr_s) {
        long v1 = CLS40.MTH855(CLS40.MTH854(0xFFFFFFFFL & v));
        long v2 = CLS40.MTH855(v1);
        int v3 = (int)(v >>> 0x20 ^ v1 >>> 0x20 & 0xFFFFL ^ v2 >>> 16 & 0xFFFFFFFFFFFF0000L);
        long v4 = CLS42.MTH859(v3, arr_s, v2);
        int v5 = (int)(v4 >>> 0x20 & 0xFFFFL);
        char[] arr_c = new char[v5];
        for(int v6 = 0; v6 < v5; ++v6) {
            v4 = CLS42.MTH859(v3 + v6 + 1, arr_s, v4);
            arr_c[v6] = (char)(((int)(v4 >>> 0x20 & 0xFFFFL)));
        }
        return new String(arr_c);
    }
}

