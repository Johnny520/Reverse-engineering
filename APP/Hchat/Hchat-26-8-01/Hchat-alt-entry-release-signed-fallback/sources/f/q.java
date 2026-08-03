package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f2884a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f2885b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f2886c = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f.q.f2884a = r0
            r0 = 0
            long[] r0 = new long[r0]
            f.q.f2885b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f.q.f2886c = r0
            return
    }

    public static final int a(f.f r4, java.lang.Object r5, int r6) {
            int r0 = r4.f2802i
            if (r0 != 0) goto L6
            r4 = -1
            return r4
        L6:
            int[] r1 = r4.f2800g     // Catch: java.lang.IndexOutOfBoundsException -> L4c
            int r1 = g.a.a(r1, r0, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4c
            if (r1 >= 0) goto Lf
            goto L19
        Lf:
            java.lang.Object[] r2 = r4.f2801h
            r2 = r2[r1]
            boolean r2 = gg.l.a(r5, r2)
            if (r2 == 0) goto L1a
        L19:
            return r1
        L1a:
            int r2 = r1 + 1
        L1c:
            if (r2 >= r0) goto L32
            int[] r3 = r4.f2800g
            r3 = r3[r2]
            if (r3 != r6) goto L32
            java.lang.Object[] r3 = r4.f2801h
            r3 = r3[r2]
            boolean r3 = gg.l.a(r5, r3)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r2 = r2 + 1
            goto L1c
        L32:
            int r1 = r1 + (-1)
        L34:
            if (r1 < 0) goto L4a
            int[] r0 = r4.f2800g
            r0 = r0[r1]
            if (r0 != r6) goto L4a
            java.lang.Object[] r0 = r4.f2801h
            r0 = r0[r1]
            boolean r0 = gg.l.a(r5, r0)
            if (r0 == 0) goto L47
            return r1
        L47:
            int r1 = r1 + (-1)
            goto L34
        L4a:
            int r4 = ~r2
            return r4
        L4c:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            r4.<init>()
            throw r4
    }
}
