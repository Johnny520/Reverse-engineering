package qa;

/* JADX INFO: renamed from: qa.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6368y {
    /* JADX INFO: renamed from: a */
    public static int m25324a(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: renamed from: b */
    public static int m25325b(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: renamed from: c */
    public static int m25326c(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* JADX INFO: renamed from: d */
    public static int m25327d(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return m25324a(b10);
        }
        if (i12 == 1) {
            return m25325b(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return m25326c(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m25328e(byte[] bArr) {
        return m25329f(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m25329f(byte[] bArr, int i10, int i11) {
        return m25331h(bArr, i10, i11) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        if (r7[r8] > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
    
        if (r7[r6] > (-65)) goto L53;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m25330g(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L86
            if (r8 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r6 = -62
            if (r0 < r6) goto L1b
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
            goto L1b
        L18:
            r8 = r6
            goto L86
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L34
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L31
            int r6 = m25325b(r0, r8)
            return r6
        L31:
            r5 = r8
            r8 = r6
            r6 = r5
        L34:
            if (r6 > r3) goto L48
            r4 = -96
            if (r0 != r1) goto L3c
            if (r6 < r4) goto L48
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r6 >= r4) goto L48
        L42:
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
        L48:
            return r2
        L49:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5c
            int r6 = r8 + 1
            r1 = r7[r8]
            if (r6 < r9) goto L5a
            int r6 = m25325b(r0, r1)
            return r6
        L5a:
            r8 = 0
            goto L62
        L5c:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
            r5 = r8
            r8 = r6
            r6 = r5
        L62:
            if (r8 != 0) goto L72
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r8 < r9) goto L6f
            int r6 = m25326c(r0, r1, r6)
            return r6
        L6f:
            r5 = r8
            r8 = r6
            r6 = r5
        L72:
            if (r1 > r3) goto L85
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L85
            if (r8 > r3) goto L85
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r6 <= r3) goto L86
        L85:
            return r2
        L86:
            int r6 = m25331h(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.AbstractC6368y.m25330g(int, byte[], int, int):int");
    }

    /* JADX INFO: renamed from: h */
    public static int m25331h(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        return m25332i(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: i */
    public static int m25332i(byte[] bArr, int i10, int i11) {
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i12 >= i11) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b10 >= -16) {
                    if (i12 >= i11 - 2) {
                        return m25327d(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b11 = bArr[i12];
                    if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                        int i14 = i10 + 3;
                        if (bArr[i13] <= -65) {
                            i10 += 4;
                            if (bArr[i14] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 1) {
                    return m25327d(bArr, i12, i11);
                }
                int i15 = i10 + 2;
                byte b12 = bArr[i12];
                if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                    i10 += 3;
                    if (bArr[i15] > -65) {
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }
}
