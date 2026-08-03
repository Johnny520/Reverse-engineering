package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public final class Bits {
    private Bits() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean anyInRange(int[] r0, int r1, int r2) {
            int r0 = findFirst(r0, r1)
            if (r0 < 0) goto La
            if (r0 >= r2) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static int bitCount(int[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto Lf
            r3 = r4[r1]
            int r3 = java.lang.Integer.bitCount(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Lf:
            return r2
    }

    public static void clear(int[] r2, int r3) {
            int r0 = r3 >> 5
            r3 = r3 & 31
            r1 = 1
            int r3 = r1 << r3
            r1 = r2[r0]
            int r3 = ~r3
            r3 = r3 & r1
            r2[r0] = r3
            return
    }

    public static int findFirst(int r1, int r2) {
            r0 = 1
            int r2 = r0 << r2
            int r2 = r2 - r0
            int r2 = ~r2
            r1 = r1 & r2
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
            r2 = 32
            if (r1 != r2) goto Lf
            r1 = -1
        Lf:
            return r1
    }

    public static int findFirst(int[] r3, int r4) {
            int r0 = r3.length
            r1 = r4 & 31
            int r4 = r4 >> 5
        L5:
            if (r4 >= r0) goto L19
            r2 = r3[r4]
            if (r2 == 0) goto L15
            int r1 = findFirst(r2, r1)
            if (r1 < 0) goto L15
            int r3 = r4 << 5
            int r3 = r3 + r1
            return r3
        L15:
            int r4 = r4 + 1
            r1 = 0
            goto L5
        L19:
            r3 = -1
            return r3
    }

    public static boolean get(int[] r2, int r3) {
            int r0 = r3 >> 5
            r3 = r3 & 31
            r1 = 1
            int r3 = r1 << r3
            r2 = r2[r0]
            r2 = r2 & r3
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public static int getMax(int[] r0) {
            int r0 = r0.length
            int r0 = r0 * 32
            return r0
    }

    public static boolean isEmpty(int[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto Ld
            r3 = r4[r2]
            if (r3 == 0) goto La
            return r1
        La:
            int r2 = r2 + 1
            goto L3
        Ld:
            r4 = 1
            return r4
    }

    public static int[] makeBitSet(int r0) {
            int r0 = r0 + 31
            int r0 = r0 >> 5
            int[] r0 = new int[r0]
            return r0
    }

    public static void or(int[] r3, int[] r4) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto Le
            r1 = r3[r0]
            r2 = r4[r0]
            r1 = r1 | r2
            r3[r0] = r1
            int r0 = r0 + 1
            goto L1
        Le:
            return
    }

    public static void set(int[] r2, int r3) {
            int r0 = r3 >> 5
            r3 = r3 & 31
            r1 = 1
            int r3 = r1 << r3
            r1 = r2[r0]
            r3 = r3 | r1
            r2[r0] = r3
            return
    }

    public static void set(int[] r2, int r3, boolean r4) {
            int r0 = r3 >> 5
            r3 = r3 & 31
            r1 = 1
            int r3 = r1 << r3
            if (r4 == 0) goto Lf
            r4 = r2[r0]
            r3 = r3 | r4
            r2[r0] = r3
            goto L15
        Lf:
            r4 = r2[r0]
            int r3 = ~r3
            r3 = r3 & r4
            r2[r0] = r3
        L15:
            return
    }

    public static java.lang.String toHuman(int[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r5.length
            int r1 = r1 * 32
            r2 = 0
            r3 = r2
        Lf:
            if (r2 >= r1) goto L25
            boolean r4 = get(r5, r2)
            if (r4 == 0) goto L22
            if (r3 == 0) goto L1e
            r3 = 44
            r0.append(r3)
        L1e:
            r0.append(r2)
            r3 = 1
        L22:
            int r2 = r2 + 1
            goto Lf
        L25:
            r5 = 125(0x7d, float:1.75E-43)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
