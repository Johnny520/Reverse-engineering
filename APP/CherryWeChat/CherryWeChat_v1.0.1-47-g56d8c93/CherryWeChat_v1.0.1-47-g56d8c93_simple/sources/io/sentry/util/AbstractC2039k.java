package io.sentry.util;

import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.util.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2039k {

    /* JADX INFO: renamed from: a */
    public static final char[] f7228a = null;

    static {
        f7228a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        long[] r0 = new long[128];
        Arrays.fill(r0, -1);
        r0[48] = 0;
        r0[49] = 1;
        r0[50] = 2;
        r0[51] = 3;
        r0[52] = 4;
        r0[53] = 5;
        r0[54] = 6;
        r0[55] = 7;
        r0[56] = 8;
        r0[57] = 9;
        r0[97] = 10;
        r0[98] = 11;
        r0[99] = 12;
        r0[100] = 13;
        r0[101(0x65, float:1.42E-43)] = 14;
        r0[102(0x66, float:1.43E-43)] = 15;
        r0[65] = 10;
        r0[66] = 11;
        r0[67] = 12;
        r0[68] = 13;
        r0[69] = 14;
        r0[70] = 15;
    }

    /* JADX INFO: renamed from: a */
    public static void m4184a(char[] r6, long r7) {
        char[] r1 = f7228a;
        r6[0] = r1[(int) (((-1152921504606846976L) & r7) >>> 60)];
        r6[1] = r1[(int) ((1080863910568919040L & r7) >>> 56)];
        r6[2] = r1[(int) ((67553994410557440L & r7) >>> 52)];
        r6[3] = r1[(int) ((4222124650659840L & r7) >>> 48)];
        r6[4] = r1[(int) ((263882790666240L & r7) >>> 44)];
        r6[5] = r1[(int) ((16492674416640L & r7) >>> 40)];
        r6[6] = r1[(int) ((1030792151040L & r7) >>> 36)];
        r6[7] = r1[(int) ((64424509440L & r7) >>> 32)];
        r6[8] = r1[(int) ((4026531840L & r7) >>> 28)];
        r6[9] = r1[(int) ((251658240 & r7) >>> 24)];
        r6[10] = r1[(int) ((15728640 & r7) >>> 20)];
        r6[11] = r1[(int) ((983040 & r7) >>> 16)];
        r6[12] = r1[(int) ((61440 & r7) >>> 12)];
        r6[13] = r1[(int) ((3840 & r7) >>> 8)];
        r6[14] = r1[(int) ((240 & r7) >>> 4)];
        r6[15] = r1[(int) (r7 & 15)];
    }
}
