package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FDBigInteger {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_FIVE_POW = 340;
    private static final com.alibaba.fastjson2.util.FDBigInteger[] POW_5_CACHE = null;
    private static final int[] SMALL_5_POW = null;
    private int[] data;
    boolean immutable;
    private int nWords;
    private int offset;

    static {
            r0 = 14
            int[] r0 = new int[r0]
            r0 = {x0042: FILL_ARRAY_DATA , data: [1, 5, 25, 125, 625, 3125, 15625, 78125, 390625, 1953125, 9765625, 48828125, 244140625, 1220703125} // fill-array
            com.alibaba.fastjson2.util.FDBigInteger.SMALL_5_POW = r0
            r0 = 340(0x154, float:4.76E-43)
            com.alibaba.fastjson2.util.FDBigInteger[] r1 = new com.alibaba.fastjson2.util.FDBigInteger[r0]
            com.alibaba.fastjson2.util.FDBigInteger.POW_5_CACHE = r1
            r1 = 0
            r2 = r1
        L11:
            int[] r3 = com.alibaba.fastjson2.util.FDBigInteger.SMALL_5_POW
            int r4 = r3.length
            r5 = 1
            if (r2 >= r4) goto L2b
            com.alibaba.fastjson2.util.FDBigInteger r4 = new com.alibaba.fastjson2.util.FDBigInteger
            r3 = r3[r2]
            int[] r3 = new int[]{r3}
            r4.<init>(r3, r1)
            r4.immutable = r5
            com.alibaba.fastjson2.util.FDBigInteger[] r3 = com.alibaba.fastjson2.util.FDBigInteger.POW_5_CACHE
            r3[r2] = r4
            int r2 = r2 + 1
            goto L11
        L2b:
            com.alibaba.fastjson2.util.FDBigInteger[] r1 = com.alibaba.fastjson2.util.FDBigInteger.POW_5_CACHE
            int r3 = r2 + (-1)
            r1 = r1[r3]
        L31:
            if (r2 >= r0) goto L41
            com.alibaba.fastjson2.util.FDBigInteger[] r3 = com.alibaba.fastjson2.util.FDBigInteger.POW_5_CACHE
            r4 = 5
            com.alibaba.fastjson2.util.FDBigInteger r1 = r1.mult(r4)
            r3[r2] = r1
            r1.immutable = r5
            int r2 = r2 + 1
            goto L31
        L41:
            return
    }

    public FDBigInteger(long r6, char[] r8, int r9, int r10) {
            r5 = this;
            r5.<init>()
            int r0 = r10 + 8
            int r0 = r0 / 9
            r1 = 2
            int r0 = java.lang.Math.max(r0, r1)
            int[] r0 = new int[r0]
            r5.data = r0
            int r2 = (int) r6
            r3 = 0
            r0[r3] = r2
            r2 = 32
            long r6 = r6 >>> r2
            int r6 = (int) r6
            r7 = 1
            r0[r7] = r6
            r5.offset = r3
            r5.nWords = r1
            int r6 = r10 + (-5)
        L21:
            if (r9 >= r6) goto L42
            int r0 = r9 + 5
            int r1 = r9 + 1
            char r9 = r8[r9]
            int r9 = r9 + (-48)
            r4 = r1
            r1 = r9
            r9 = r4
        L2e:
            if (r9 >= r0) goto L3b
            int r1 = r1 * 10
            int r2 = r9 + 1
            char r9 = r8[r9]
            int r1 = r1 + r9
            int r1 = r1 + (-48)
            r9 = r2
            goto L2e
        L3b:
            r0 = 100000(0x186a0, float:1.4013E-40)
            r5.multAddMe(r0, r1)
            goto L21
        L42:
            r6 = r7
        L43:
            if (r9 >= r10) goto L52
            int r3 = r3 * 10
            int r0 = r9 + 1
            char r9 = r8[r9]
            int r3 = r3 + r9
            int r3 = r3 + (-48)
            int r6 = r6 * 10
            r9 = r0
            goto L43
        L52:
            if (r6 == r7) goto L57
            r5.multAddMe(r6, r3)
        L57:
            r5.trimLeadingZeros()
            return
    }

    private FDBigInteger(int[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            r0.offset = r2
            int r1 = r1.length
            r0.nWords = r1
            r0.trimLeadingZeros()
            return
    }

    private static com.alibaba.fastjson2.util.FDBigInteger big5pow(int r1) {
            r0 = 340(0x154, float:4.76E-43)
            if (r1 >= r0) goto L9
            com.alibaba.fastjson2.util.FDBigInteger[] r0 = com.alibaba.fastjson2.util.FDBigInteger.POW_5_CACHE
            r1 = r0[r1]
            return r1
        L9:
            com.alibaba.fastjson2.util.FDBigInteger r1 = big5powRec(r1)
            return r1
    }

    private static com.alibaba.fastjson2.util.FDBigInteger big5powRec(int r6) {
            r0 = 340(0x154, float:4.76E-43)
            if (r6 >= r0) goto L9
            com.alibaba.fastjson2.util.FDBigInteger[] r0 = com.alibaba.fastjson2.util.FDBigInteger.POW_5_CACHE
            r6 = r0[r6]
            return r6
        L9:
            int r0 = r6 >> 1
            int r6 = r6 - r0
            com.alibaba.fastjson2.util.FDBigInteger r0 = big5powRec(r0)
            int[] r1 = com.alibaba.fastjson2.util.FDBigInteger.SMALL_5_POW
            int r2 = r1.length
            if (r6 >= r2) goto L1c
            r6 = r1[r6]
            com.alibaba.fastjson2.util.FDBigInteger r6 = r0.mult(r6)
            return r6
        L1c:
            com.alibaba.fastjson2.util.FDBigInteger r6 = big5powRec(r6)
            int r1 = r0.nWords
            if (r1 != 0) goto L25
            return r0
        L25:
            int r2 = r0.offset
            int r2 = r2 + r1
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L35
            int[] r0 = r0.data
            r0 = r0[r3]
            com.alibaba.fastjson2.util.FDBigInteger r6 = r6.mult(r0)
            return r6
        L35:
            int r2 = r6.nWords
            if (r2 != 0) goto L3a
            return r6
        L3a:
            int r5 = r6.offset
            int r5 = r5 + r2
            if (r5 != r4) goto L48
            int[] r6 = r6.data
            r6 = r6[r3]
            com.alibaba.fastjson2.util.FDBigInteger r6 = r0.mult(r6)
            return r6
        L48:
            int r3 = r1 + r2
            int[] r3 = new int[r3]
            int[] r4 = r0.data
            int[] r5 = r6.data
            mult(r4, r1, r5, r2, r3)
            com.alibaba.fastjson2.util.FDBigInteger r1 = new com.alibaba.fastjson2.util.FDBigInteger
            int r0 = r0.offset
            int r6 = r6.offset
            int r0 = r0 + r6
            r1.<init>(r3, r0)
            return r1
    }

    private static int checkZeroTail(int[] r1, int r2) {
        L0:
            if (r2 <= 0) goto La
            int r2 = r2 + (-1)
            r0 = r1[r2]
            if (r0 == 0) goto L0
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static void leftShift(int[] r2, int r3, int[] r4, int r5, int r6, int r7) {
        L0:
            if (r3 <= 0) goto L10
            int r7 = r7 << r5
            int r0 = r3 + (-1)
            r0 = r2[r0]
            int r1 = r0 >>> r6
            r7 = r7 | r1
            r4[r3] = r7
            int r3 = r3 + (-1)
            r7 = r0
            goto L0
        L10:
            int r2 = r7 << r5
            r3 = 0
            r4[r3] = r2
            return
    }

    private com.alibaba.fastjson2.util.FDBigInteger mult(int r4) {
            r3 = this;
            int r0 = r3.nWords
            if (r0 != 0) goto L5
            return r3
        L5:
            int r1 = r0 + 1
            int[] r1 = new int[r1]
            int[] r2 = r3.data
            mult(r2, r0, r4, r1)
            com.alibaba.fastjson2.util.FDBigInteger r4 = new com.alibaba.fastjson2.util.FDBigInteger
            int r0 = r3.offset
            r4.<init>(r1, r0)
            return r4
    }

    private static void mult(int[] r8, int r9, int r10, int[] r11) {
            long r0 = (long) r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4 = 0
            r10 = 0
        La:
            if (r10 >= r9) goto L1c
            r6 = r8[r10]
            long r6 = (long) r6
            long r6 = r6 & r2
            long r6 = r6 * r0
            long r6 = r6 + r4
            int r4 = (int) r6
            r11[r10] = r4
            r4 = 32
            long r4 = r6 >>> r4
            int r10 = r10 + 1
            goto La
        L1c:
            int r8 = (int) r4
            r11[r9] = r8
            return
    }

    private static void mult(int[] r16, int r17, int[] r18, int r19, int[] r20) {
            r0 = r19
            r1 = 0
            r2 = r17
            r3 = r1
        L6:
            if (r3 >= r2) goto L35
            r4 = r16[r3]
            long r4 = (long) r4
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r8 = 0
            r10 = r1
        L14:
            if (r10 >= r0) goto L2d
            int r11 = r3 + r10
            r12 = r20[r11]
            long r12 = (long) r12
            long r12 = r12 & r6
            r14 = r18[r10]
            long r14 = (long) r14
            long r14 = r14 & r6
            long r14 = r14 * r4
            long r14 = r14 + r12
            long r14 = r14 + r8
            int r8 = (int) r14
            r20[r11] = r8
            r8 = 32
            long r8 = r14 >>> r8
            int r10 = r10 + 1
            goto L14
        L2d:
            int r4 = r3 + r0
            int r5 = (int) r8
            r20[r4] = r5
            int r3 = r3 + 1
            goto L6
        L35:
            return
    }

    private void multAddMe(int r10, int r11) {
            r9 = this;
            long r0 = (long) r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int[] r10 = r9.data
            r4 = 0
            r5 = r10[r4]
            long r5 = (long) r5
            long r5 = r5 & r2
            long r5 = r5 * r0
            long r7 = (long) r11
            long r7 = r7 & r2
            long r5 = r5 + r7
            int r11 = (int) r5
            r10[r4] = r11
            r10 = 32
            long r4 = r5 >>> r10
            r11 = 1
        L1a:
            int r6 = r9.nWords
            if (r11 >= r6) goto L2e
            int[] r6 = r9.data
            r7 = r6[r11]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r7 = r7 * r0
            long r7 = r7 + r4
            int r4 = (int) r7
            r6[r11] = r4
            long r4 = r7 >>> r10
            int r11 = r11 + 1
            goto L1a
        L2e:
            r10 = 0
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 == 0) goto L3d
            int[] r10 = r9.data
            int r11 = r6 + 1
            r9.nWords = r11
            int r11 = (int) r4
            r10[r6] = r11
        L3d:
            return
    }

    private void trimLeadingZeros() {
            r3 = this;
            int r0 = r3.nWords
            if (r0 <= 0) goto L20
            int[] r1 = r3.data
            int r0 = r0 + (-1)
            r1 = r1[r0]
            if (r1 != 0) goto L20
        Lc:
            if (r0 <= 0) goto L19
            int[] r1 = r3.data
            int r2 = r0 + (-1)
            r1 = r1[r2]
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            goto Lc
        L19:
            r3.nWords = r0
            if (r0 != 0) goto L20
            r0 = 0
            r3.offset = r0
        L20:
            return
    }

    public static com.alibaba.fastjson2.util.FDBigInteger valueOfMulPow52(long r19, int r21, int r22) {
            r0 = r19
            r2 = r21
            r3 = r22
            int r4 = (int) r0
            r5 = 32
            long r0 = r0 >>> r5
            int r0 = (int) r0
            int r1 = r3 >> 5
            r6 = r3 & 31
            r7 = 0
            if (r2 == 0) goto Lc2
            int[] r8 = com.alibaba.fastjson2.util.FDBigInteger.SMALL_5_POW
            int r9 = r8.length
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r2 >= r9) goto L51
            r2 = r8[r2]
            long r2 = (long) r2
            long r2 = r2 & r10
            long r7 = (long) r4
            long r7 = r7 & r10
            long r7 = r7 * r2
            int r4 = (int) r7
            long r7 = r7 >>> r5
            long r12 = (long) r0
            long r9 = r12 & r10
            long r9 = r9 * r2
            long r9 = r9 + r7
            int r0 = (int) r9
            long r2 = r9 >>> r5
            int r2 = (int) r2
            if (r6 != 0) goto L3a
            com.alibaba.fastjson2.util.FDBigInteger r3 = new com.alibaba.fastjson2.util.FDBigInteger
            int[] r0 = new int[]{r4, r0, r2}
            r3.<init>(r0, r1)
            return r3
        L3a:
            com.alibaba.fastjson2.util.FDBigInteger r3 = new com.alibaba.fastjson2.util.FDBigInteger
            int r5 = r4 << r6
            int r7 = r0 << r6
            int r8 = 32 - r6
            int r4 = r4 >>> r8
            r4 = r4 | r7
            int r6 = r2 << r6
            int r0 = r0 >>> r8
            r0 = r0 | r6
            int r2 = r2 >>> r8
            int[] r0 = new int[]{r5, r4, r0, r2}
            r3.<init>(r0, r1)
            return r3
        L51:
            com.alibaba.fastjson2.util.FDBigInteger r1 = big5pow(r2)
            int[] r2 = r1.data
            int r6 = r1.nWords
            long r8 = (long) r4
            long r8 = r8 & r10
            if (r0 != 0) goto L68
            int r12 = r6 + 1
            if (r3 == 0) goto L63
            r13 = 1
            goto L64
        L63:
            r13 = r7
        L64:
            int r12 = r12 + r13
            int[] r12 = new int[r12]
            goto L72
        L68:
            int r12 = r6 + 2
            if (r3 == 0) goto L6e
            r13 = 1
            goto L6f
        L6e:
            r13 = r7
        L6f:
            int r12 = r12 + r13
            int[] r12 = new int[r12]
        L72:
            r13 = 0
            r16 = r5
            r15 = r7
            r4 = r13
            r19 = 1
        L7a:
            if (r15 >= r6) goto L8f
            r17 = r10
            r10 = r2[r15]
            long r10 = (long) r10
            long r10 = r10 & r17
            long r10 = r10 * r8
            long r10 = r10 + r4
            int r4 = (int) r10
            r12[r15] = r4
            long r4 = r10 >>> r16
            int r15 = r15 + 1
            r10 = r17
            goto L7a
        L8f:
            r17 = r10
            int r4 = (int) r4
            r12[r6] = r4
            if (r0 == 0) goto Lb6
            long r4 = (long) r0
            long r4 = r4 & r17
        L99:
            if (r7 >= r6) goto Lb1
            int r0 = r7 + 1
            r8 = r12[r0]
            long r8 = (long) r8
            long r8 = r8 & r17
            r7 = r2[r7]
            long r10 = (long) r7
            long r10 = r10 & r17
            long r10 = r10 * r4
            long r10 = r10 + r8
            long r10 = r10 + r13
            int r7 = (int) r10
            r12[r0] = r7
            long r13 = r10 >>> r16
            r7 = r0
            goto L99
        Lb1:
            int r6 = r6 + 1
            int r0 = (int) r13
            r12[r6] = r0
        Lb6:
            com.alibaba.fastjson2.util.FDBigInteger r0 = new com.alibaba.fastjson2.util.FDBigInteger
            int r1 = r1.offset
            r0.<init>(r12, r1)
            com.alibaba.fastjson2.util.FDBigInteger r0 = r0.leftShift(r3)
            return r0
        Lc2:
            r16 = r5
            if (r3 == 0) goto Le5
            if (r6 != 0) goto Ld2
            com.alibaba.fastjson2.util.FDBigInteger r2 = new com.alibaba.fastjson2.util.FDBigInteger
            int[] r0 = new int[]{r4, r0}
            r2.<init>(r0, r1)
            return r2
        Ld2:
            com.alibaba.fastjson2.util.FDBigInteger r2 = new com.alibaba.fastjson2.util.FDBigInteger
            int r3 = r4 << r6
            int r5 = r0 << r6
            int r6 = 32 - r6
            int r4 = r4 >>> r6
            r4 = r4 | r5
            int r0 = r0 >>> r6
            int[] r0 = new int[]{r3, r4, r0}
            r2.<init>(r0, r1)
            return r2
        Le5:
            com.alibaba.fastjson2.util.FDBigInteger r1 = new com.alibaba.fastjson2.util.FDBigInteger
            int[] r0 = new int[]{r4, r0}
            r1.<init>(r0, r7)
            return r1
    }

    public int cmp(com.alibaba.fastjson2.util.FDBigInteger r9) {
            r8 = this;
            int r0 = r8.nWords
            int r1 = r8.offset
            int r1 = r1 + r0
            int r2 = r9.nWords
            int r3 = r9.offset
            int r3 = r3 + r2
            r4 = 1
            if (r1 <= r3) goto Le
            return r4
        Le:
            r5 = -1
            if (r1 >= r3) goto L12
            return r5
        L12:
            if (r0 <= 0) goto L33
            if (r2 <= 0) goto L33
            int[] r1 = r8.data
            int r0 = r0 + (-1)
            r1 = r1[r0]
            int[] r3 = r9.data
            int r2 = r2 + (-1)
            r3 = r3[r2]
            if (r1 == r3) goto L12
            long r0 = (long) r1
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            long r2 = (long) r3
            long r2 = r2 & r6
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L32
            return r5
        L32:
            return r4
        L33:
            if (r0 <= 0) goto L3c
            int[] r9 = r8.data
            int r9 = checkZeroTail(r9, r0)
            return r9
        L3c:
            if (r2 <= 0) goto L46
            int[] r9 = r9.data
            int r9 = checkZeroTail(r9, r2)
            int r9 = -r9
            return r9
        L46:
            r9 = 0
            return r9
    }

    public int cmpPow52(int r7, int r8) {
            r6 = this;
            if (r7 != 0) goto L33
            int r7 = r8 >> 5
            r8 = r8 & 31
            int r0 = r6.nWords
            int r1 = r6.offset
            int r1 = r1 + r0
            r2 = 1
            int r7 = r7 + r2
            if (r1 <= r7) goto L10
            return r2
        L10:
            r3 = -1
            if (r1 >= r7) goto L14
            return r3
        L14:
            int[] r7 = r6.data
            int r1 = r0 + (-1)
            r1 = r7[r1]
            int r8 = r2 << r8
            if (r1 == r8) goto L2d
            long r0 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r7 = (long) r8
            long r7 = r7 & r4
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2c
            return r3
        L2c:
            return r2
        L2d:
            int r0 = r0 - r2
            int r7 = checkZeroTail(r7, r0)
            return r7
        L33:
            com.alibaba.fastjson2.util.FDBigInteger r7 = big5pow(r7)
            com.alibaba.fastjson2.util.FDBigInteger r7 = r7.leftShift(r8)
            int r7 = r6.cmp(r7)
            return r7
    }

    public com.alibaba.fastjson2.util.FDBigInteger leftInplaceSub(com.alibaba.fastjson2.util.FDBigInteger r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.immutable
            if (r2 == 0) goto L18
            com.alibaba.fastjson2.util.FDBigInteger r2 = new com.alibaba.fastjson2.util.FDBigInteger
            int[] r3 = r0.data
            java.lang.Object r3 = r3.clone()
            int[] r3 = (int[]) r3
            int r4 = r0.offset
            r2.<init>(r3, r4)
            goto L19
        L18:
            r2 = r0
        L19:
            int r3 = r1.offset
            int r4 = r2.offset
            int r3 = r3 - r4
            int[] r4 = r1.data
            int[] r5 = r2.data
            int r6 = r1.nWords
            int r7 = r2.nWords
            r8 = 0
            if (r3 >= 0) goto L47
            int r9 = r7 - r3
            int r10 = r5.length
            if (r9 >= r10) goto L36
            int r3 = -r3
            java.lang.System.arraycopy(r5, r8, r5, r3, r7)
            java.util.Arrays.fill(r5, r8, r3, r8)
            goto L3f
        L36:
            int[] r10 = new int[r9]
            int r3 = -r3
            java.lang.System.arraycopy(r5, r8, r10, r3, r7)
            r2.data = r10
            r5 = r10
        L3f:
            int r1 = r1.offset
            r2.offset = r1
            r2.nWords = r9
            r3 = r8
            r7 = r9
        L47:
            r11 = 0
        L49:
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r8 >= r6) goto L6e
            if (r3 >= r7) goto L6e
            r15 = r5[r3]
            r16 = r2
            r20 = 32
            long r1 = (long) r15
            long r1 = r1 & r13
            r15 = r4[r8]
            r17 = 0
            long r9 = (long) r15
            long r9 = r9 & r13
            long r1 = r1 - r9
            long r1 = r1 + r11
            int r9 = (int) r1
            r5[r3] = r9
            long r11 = r1 >> r20
            int r8 = r8 + 1
            int r3 = r3 + 1
            r2 = r16
            goto L49
        L6e:
            r16 = r2
            r20 = 32
            r17 = 0
        L74:
            int r1 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r1 == 0) goto L87
            if (r3 >= r7) goto L87
            r1 = r5[r3]
            long r1 = (long) r1
            long r1 = r1 & r13
            long r1 = r1 + r11
            int r4 = (int) r1
            r5[r3] = r4
            long r11 = r1 >> r20
            int r3 = r3 + 1
            goto L74
        L87:
            r16.trimLeadingZeros()
            return r16
    }

    public com.alibaba.fastjson2.util.FDBigInteger leftShift(int r11) {
            r10 = this;
            int[] r0 = r10.data
            int r1 = r10.nWords
            int r6 = r10.offset
            if (r11 == 0) goto L8f
            if (r1 != 0) goto Lc
            goto L8f
        Lc:
            int r7 = r11 >> 5
            r3 = r11 & 31
            boolean r11 = r10.immutable
            if (r11 == 0) goto L42
            if (r3 != 0) goto L21
            com.alibaba.fastjson2.util.FDBigInteger r11 = new com.alibaba.fastjson2.util.FDBigInteger
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            int r6 = r6 + r7
            r11.<init>(r0, r6)
            return r11
        L21:
            int r4 = 32 - r3
            r11 = r1
            int r1 = r11 + (-1)
            r5 = r0[r1]
            int r2 = r5 >>> r4
            if (r2 == 0) goto L34
            int r8 = r11 + 1
            int[] r8 = new int[r8]
            r8[r11] = r2
        L32:
            r2 = r8
            goto L37
        L34:
            int[] r8 = new int[r11]
            goto L32
        L37:
            leftShift(r0, r1, r2, r3, r4, r5)
            r8 = r2
            com.alibaba.fastjson2.util.FDBigInteger r11 = new com.alibaba.fastjson2.util.FDBigInteger
            int r6 = r6 + r7
            r11.<init>(r8, r6)
            return r11
        L42:
            r11 = r1
            if (r3 == 0) goto L89
            int r4 = 32 - r3
            r1 = 0
            r2 = r0[r1]
            int r5 = r2 << r3
            if (r5 != 0) goto L6b
        L4e:
            int r5 = r11 + (-1)
            if (r1 >= r5) goto L5f
            int r2 = r2 >>> r4
            int r5 = r1 + 1
            r8 = r0[r5]
            int r9 = r8 << r3
            r2 = r2 | r9
            r0[r1] = r2
            r1 = r5
            r2 = r8
            goto L4e
        L5f:
            int r2 = r2 >>> r4
            r0[r1] = r2
            if (r2 != 0) goto L67
            int r1 = r11 + (-1)
            goto L68
        L67:
            r1 = r11
        L68:
            int r6 = r6 + 1
            goto L8a
        L6b:
            int r1 = r11 + (-1)
            r5 = r0[r1]
            int r2 = r5 >>> r4
            if (r2 == 0) goto L85
            int r8 = r0.length
            if (r11 != r8) goto L7d
            int r8 = r11 + 1
            int[] r8 = new int[r8]
            r10.data = r8
            goto L7e
        L7d:
            r8 = r0
        L7e:
            int r9 = r11 + 1
            r8[r11] = r2
            r2 = r8
            r11 = r9
            goto L86
        L85:
            r2 = r0
        L86:
            leftShift(r0, r1, r2, r3, r4, r5)
        L89:
            r1 = r11
        L8a:
            r10.nWords = r1
            int r6 = r6 + r7
            r10.offset = r6
        L8f:
            return r10
    }

    public com.alibaba.fastjson2.util.FDBigInteger multByPow52(int r6, int r7) {
            r5 = this;
            int r0 = r5.nWords
            if (r0 != 0) goto L5
            return r5
        L5:
            if (r6 == 0) goto L48
            if (r7 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            int[] r2 = com.alibaba.fastjson2.util.FDBigInteger.SMALL_5_POW
            int r3 = r2.length
            if (r6 >= r3) goto L25
            int r3 = r0 + 1
            int r3 = r3 + r1
            int[] r1 = new int[r3]
            int[] r3 = r5.data
            r6 = r2[r6]
            mult(r3, r0, r6, r1)
            com.alibaba.fastjson2.util.FDBigInteger r6 = new com.alibaba.fastjson2.util.FDBigInteger
            int r0 = r5.offset
            r6.<init>(r1, r0)
            goto L49
        L25:
            com.alibaba.fastjson2.util.FDBigInteger r6 = big5pow(r6)
            int r0 = r5.nWords
            int r2 = r6.nWords
            int r3 = r0 + r2
            int r4 = r6.offset
            int r3 = r3 + r4
            int r3 = r3 + r1
            int[] r1 = new int[r3]
            int[] r3 = r5.data
            int[] r4 = r6.data
            mult(r3, r0, r4, r2, r1)
            com.alibaba.fastjson2.util.FDBigInteger r0 = new com.alibaba.fastjson2.util.FDBigInteger
            int r2 = r5.offset
            int r6 = r6.offset
            int r2 = r2 + r6
            r0.<init>(r1, r2)
            r6 = r0
            goto L49
        L48:
            r6 = r5
        L49:
            com.alibaba.fastjson2.util.FDBigInteger r6 = r6.leftShift(r7)
            return r6
    }

    public com.alibaba.fastjson2.util.FDBigInteger rightInplaceSub(com.alibaba.fastjson2.util.FDBigInteger r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.immutable
            if (r2 == 0) goto L18
            com.alibaba.fastjson2.util.FDBigInteger r2 = new com.alibaba.fastjson2.util.FDBigInteger
            int[] r3 = r1.data
            java.lang.Object r3 = r3.clone()
            int[] r3 = (int[]) r3
            int r1 = r1.offset
            r2.<init>(r3, r1)
            r1 = r2
        L18:
            int r2 = r0.offset
            int r3 = r1.offset
            int r2 = r2 - r3
            int[] r3 = r1.data
            int[] r4 = r0.data
            int r5 = r1.nWords
            int r6 = r0.nWords
            r7 = 0
            if (r2 >= 0) goto L42
            int r8 = r3.length
            if (r6 >= r8) goto L33
            int r2 = -r2
            java.lang.System.arraycopy(r3, r7, r3, r2, r5)
            java.util.Arrays.fill(r3, r7, r2, r7)
            goto L3c
        L33:
            int[] r8 = new int[r6]
            int r2 = -r2
            java.lang.System.arraycopy(r3, r7, r8, r2, r5)
            r1.data = r8
            r3 = r8
        L3c:
            int r2 = r0.offset
            r1.offset = r2
            r2 = r7
            goto L4d
        L42:
            int r5 = r6 + r2
            int r8 = r3.length
            if (r5 < r8) goto L4d
            int[] r3 = java.util.Arrays.copyOf(r3, r5)
            r1.data = r3
        L4d:
            r8 = 0
            r5 = r7
        L50:
            r10 = 32
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r5 >= r2) goto L67
            r13 = r3[r5]
            long r13 = (long) r13
            long r11 = r11 & r13
            long r11 = -r11
            long r11 = r11 + r8
            int r8 = (int) r11
            r3[r5] = r8
            long r8 = r11 >> r10
            int r5 = r5 + 1
            goto L50
        L67:
            if (r7 >= r6) goto L83
            r2 = r4[r7]
            long r13 = (long) r2
            long r13 = r13 & r11
            r2 = r3[r5]
            r18 = r10
            r15 = r11
            long r10 = (long) r2
            long r10 = r10 & r15
            long r13 = r13 - r10
            long r13 = r13 + r8
            int r2 = (int) r13
            r3[r5] = r2
            long r8 = r13 >> r18
            int r5 = r5 + 1
            int r7 = r7 + 1
            r10 = r18
            r11 = r15
            goto L67
        L83:
            r1.nWords = r5
            r1.trimLeadingZeros()
            return r1
    }
}
