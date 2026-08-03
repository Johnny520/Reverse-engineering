package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2945 {
    public C2945() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int[] m12531(int[] r2, int r3, int r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = m12535(r3)
            int[] r0 = new int[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static long[] m12532(long[] r2, int r3, long r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = m12535(r3)
            long[] r0 = new long[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T> T[] m12533(T[] r2, int r3, T r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = m12535(r3)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L1c:
            r2[r3] = r4
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean[] m12534(boolean[] r2, int r3, boolean r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = m12535(r3)
            boolean[] r0 = new boolean[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m12535(int r1) {
            r0 = 4
            if (r1 > r0) goto L6
            r1 = 8
            goto L8
        L6:
            int r1 = r1 * 2
        L8:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int[] m12536(int[] r2, int r3, int r4, int r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            int r3 = m12535(r3)
            int[] r3 = new int[r3]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r0 = r2.length
            int r0 = r0 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r0)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static long[] m12537(long[] r2, int r3, int r4, long r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            int r3 = m12535(r3)
            long[] r3 = new long[r3]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r6 = r2.length
            int r6 = r6 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r6)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static <T> T[] m12538(T[] r2, int r3, int r4, T r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r3 = m12535(r3)
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r0, r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r0 = r2.length
            int r0 = r0 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r0)
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean[] m12539(boolean[] r2, int r3, int r4, boolean r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            int r3 = m12535(r3)
            boolean[] r3 = new boolean[r3]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r0 = r2.length
            int r0 = r0 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r0)
            return r3
    }
}
