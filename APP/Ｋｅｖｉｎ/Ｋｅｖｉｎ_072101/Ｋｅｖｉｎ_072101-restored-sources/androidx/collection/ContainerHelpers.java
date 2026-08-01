package androidx.collection;

/* JADX INFO: loaded from: classes2.dex */
class ContainerHelpers {
    static final int[] EMPTY_INTS = null;
    static final long[] EMPTY_LONGS = null;
    static final java.lang.Object[] EMPTY_OBJECTS = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            androidx.collection.ContainerHelpers.EMPTY_INTS = r1
            long[] r1 = new long[r0]
            androidx.collection.ContainerHelpers.EMPTY_LONGS = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            androidx.collection.ContainerHelpers.EMPTY_OBJECTS = r0
            return
    }

    private ContainerHelpers() {
            r0 = this;
            r0.<init>()
            return
    }

    static int binarySearch(int[] r4, int r5, int r6) {
            r0 = 0
            int r1 = r5 + (-1)
        L3:
            if (r0 > r1) goto L16
            int r2 = r0 + r1
            int r2 = r2 >>> 1
            r3 = r4[r2]
            if (r3 >= r6) goto L10
            int r0 = r2 + 1
            goto L14
        L10:
            if (r3 <= r6) goto L15
            int r1 = r2 + (-1)
        L14:
            goto L3
        L15:
            return r2
        L16:
            int r2 = ~r0
            return r2
    }

    static int binarySearch(long[] r6, int r7, long r8) {
            r0 = 0
            int r1 = r7 + (-1)
        L3:
            if (r0 > r1) goto L1a
            int r2 = r0 + r1
            int r2 = r2 >>> 1
            r3 = r6[r2]
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L12
            int r0 = r2 + 1
            goto L18
        L12:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L19
            int r1 = r2 + (-1)
        L18:
            goto L3
        L19:
            return r2
        L1a:
            int r2 = ~r0
            return r2
    }

    public static boolean equal(java.lang.Object r1, java.lang.Object r2) {
            if (r1 == r2) goto Ld
            if (r1 == 0) goto Lb
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public static int idealByteArraySize(int r3) {
            r0 = 4
        L1:
            r1 = 32
            if (r0 >= r1) goto L13
            r1 = 1
            int r2 = r1 << r0
            int r2 = r2 + (-12)
            if (r3 > r2) goto L10
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            return r1
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            return r3
    }

    public static int idealIntArraySize(int r1) {
            int r0 = r1 * 4
            int r0 = idealByteArraySize(r0)
            int r0 = r0 / 4
            return r0
    }

    public static int idealLongArraySize(int r1) {
            int r0 = r1 * 8
            int r0 = idealByteArraySize(r0)
            int r0 = r0 / 8
            return r0
    }
}
