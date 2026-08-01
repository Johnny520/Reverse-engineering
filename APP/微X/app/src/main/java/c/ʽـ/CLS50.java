// Decompiled by JEB v5.42.0.202606242140

package c.ʽـ;

public class CLS50 {
    public static short MTH1007(short v, int v1) [...] // Inlined contents

    public static long MTH1008(long v) {
        int v1 = (short)(((int)(v & 0xFFFFL)));
        int v2 = (short)(((int)(v >>> 16 & 0xFFFFL)));
        int v3 = (short)(v2 ^ v1);
        return (((long)(((short)(((short)v3) >>> 22 | ((short)v3) << 10)))) | ((long)(((short)(((short)(((short)(v1 + v2)) >>> 23 | ((short)(v1 + v2)) << 9)) + v1)))) << 16) << 16 | ((long)(((short)(((short)(((short)(((short)v1) >>> 19 | ((short)v1) << 13)) ^ v3)) ^ v3 << 5))));
    }

    public static long MTH1009(long v) {
        long v1 = (v ^ v >>> 33) * 0x62A9D9ED799705F5L;
        return (v1 ^ v1 >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20;
    }
}

