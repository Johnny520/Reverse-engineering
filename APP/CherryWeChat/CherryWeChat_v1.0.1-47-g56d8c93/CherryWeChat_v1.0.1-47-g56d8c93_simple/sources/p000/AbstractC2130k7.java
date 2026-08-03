package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: k7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2130k7 {

    /* JADX INFO: renamed from: a */
    public static final int[] f7474a = null;

    static {
        f7474a = m4316c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    }

    /* JADX INFO: renamed from: a */
    public static void m4314a(int r2, int r3, int r4, int r5, int[] r6) {
        int r0 = r6[r2] + r6[r3];
        r6[r2] = r0;
        int r02 = r0 ^ r6[r5];
        int r1 = r02 << 16;
        int r03 = (r02 >>> (-16)) | r1;
        r6[r5] = r03;
        int r12 = r6[r4] + r03;
        r6[r4] = r12;
        int r04 = r6[r3] ^ r12;
        int r13 = r04 << 12;
        int r05 = (r04 >>> (-12)) | r13;
        r6[r3] = r05;
        int r14 = r6[r2] + r05;
        r6[r2] = r14;
        int r22 = r6[r5] ^ r14;
        int r06 = r22 << 8;
        int r23 = (r22 >>> (-8)) | r06;
        r6[r5] = r23;
        int r52 = r6[r4] + r23;
        r6[r4] = r52;
        int r24 = r6[r3] ^ r52;
        int r42 = r24 << 7;
        r6[r3] = (r24 >>> (-7)) | r42;
    }

    /* JADX INFO: renamed from: b */
    public static void m4315b(int[] r16) {
        int r2 = 0;
    L4:
        if (r2 >= 10) goto L6;
        m4314a(0, 4, 8, 12, r16);
        m4314a(1, 5, 9, 13, r16);
        m4314a(2, 6, 10, 14, r16);
        m4314a(3, 7, 11, 15, r16);
        m4314a(0, 5, 10, 15, r16);
        m4314a(1, 6, 11, 12, r16);
        m4314a(2, 7, 8, 13, r16);
        m4314a(3, 4, 9, 14, r16);
        r2 = r2 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: c */
    public static int[] m4316c(byte[] r1) {
        IntBuffer r12 = ByteBuffer.wrap(r1).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] r0 = new int[r12.remaining()];
        r12.get(r0);
        return r0;
    }
}
