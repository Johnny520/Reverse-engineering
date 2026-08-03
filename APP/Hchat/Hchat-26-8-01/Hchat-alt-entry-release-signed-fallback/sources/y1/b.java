package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f21849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21850b;

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.f21850b = r0
            return
    }

    public abstract int[] a(int r1);

    public final int[] b(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L10
            if (r4 < 0) goto L10
            if (r3 != r4) goto L7
            goto L10
        L7:
            r0 = 0
            int[] r1 = r2.f21850b
            r1[r0] = r3
            r3 = 1
            r1[r3] = r4
            return r1
        L10:
            r3 = 0
            return r3
    }

    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f21849a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "text"
            gg.l.g(r0)
            r0 = 0
            throw r0
    }

    public abstract int[] d(int r1);
}
