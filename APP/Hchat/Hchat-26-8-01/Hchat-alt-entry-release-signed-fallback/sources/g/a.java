package g;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3960a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f3961b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object[] f3962c = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            g.a.f3960a = r1
            long[] r1 = new long[r0]
            g.a.f3961b = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            g.a.f3962c = r0
            return
    }

    public static final int a(int[] r3, int r4, int r5) {
            r3.getClass()
            int r4 = r4 + (-1)
            r0 = 0
        L6:
            if (r0 > r4) goto L19
            int r1 = r0 + r4
            int r1 = r1 >>> 1
            r2 = r3[r1]
            if (r2 >= r5) goto L13
            int r0 = r1 + 1
            goto L6
        L13:
            if (r2 <= r5) goto L18
            int r4 = r1 + (-1)
            goto L6
        L18:
            return r1
        L19:
            int r3 = ~r0
            return r3
    }

    public static final int b(long[] r4, int r5, long r6) {
            r4.getClass()
            int r5 = r5 + (-1)
            r0 = 0
        L6:
            if (r0 > r5) goto L1b
            int r1 = r0 + r5
            int r1 = r1 >>> 1
            r2 = r4[r1]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L15
            int r0 = r1 + 1
            goto L6
        L15:
            if (r2 <= 0) goto L1a
            int r5 = r1 + (-1)
            goto L6
        L1a:
            return r1
        L1b:
            int r4 = ~r0
            return r4
    }
}
