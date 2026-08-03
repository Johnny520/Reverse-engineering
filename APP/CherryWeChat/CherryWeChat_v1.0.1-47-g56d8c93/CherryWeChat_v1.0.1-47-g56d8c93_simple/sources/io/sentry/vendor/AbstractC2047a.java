package io.sentry.vendor;

/* JADX INFO: renamed from: io.sentry.vendor.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2047a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f7245a = null;

    static {
        f7245a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4187a(byte[] r12) {
        int r0 = r12.length;
        int r1 = (r0 / 3) * 4;
        int r2 = r0 % 3;
        if (r2 == 1) goto L7;
        if (r2 != 2) goto L8;
        r1 = r1 + 3;
    L8:
        byte[] r13 = new byte[r1];
        int r22 = 0;
        int r5 = 0;
        int r6 = -1;
    L9:
        int r7 = r22 + 3;
        byte[] r8 = f7245a;
        if (r7 > r0) goto L17;
        int r23 = (r12[r22 + 2] & 255) | (((r12[r22] & 255) << 16) | ((r12[r22 + 1] & 255) << 8));
        r13[r5] = r8[(r23 >> 18) & 63];
        r13[r5 + 1] = r8[(r23 >> 12) & 63];
        r13[r5 + 2] = r8[(r23 >> 6) & 63];
        r13[r5 + 3] = r8[r23 & 63];
        int r24 = r5 + 4;
        r6 = r6 - 1;
        if (r6 != 0) goto L15;
        r5 = r5 + 5;
        r13[r24] = 10;
        r6 = 19;
    L14:
        r22 = r7;
        goto L9
    L15:
        r5 = r24;
        goto L14
    L17:
        if (r22 != (r0 - 1)) goto L21;
        int r122 = (r12[r22] & 255) << 4;
        r13[r5] = r8[(r122 >> 6) & 63];
        r13[r5 + 1] = r8[r122 & 63];
        return r13;
    L21:
        if (r22 != (r0 - 2)) goto L23;
        int r02 = r22 + 1;
        int r123 = ((r12[r02] & 255) << 2) | ((r12[r22] & 255) << 10);
        r13[r5] = r8[(r123 >> 12) & 63];
        r13[r5 + 1] = r8[(r123 >> 6) & 63];
        r13[r5 + 2] = r8[r123 & 63];
    L23:
        return r13;
    L7:
        r1 = r1 + 2;
        goto L8
    }
}
