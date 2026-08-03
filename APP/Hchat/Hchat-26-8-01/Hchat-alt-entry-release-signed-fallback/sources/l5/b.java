package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l5.a0 implements t5.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f5.f f7850f = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7852e;

    static {
            f5.f r0 = f5.f.f3287u
            l5.b.f7850f = r0
            return
    }

    public b(k5.u r5, int r6) {
            r4 = this;
            f5.f r0 = l5.b.f7850f
            r4.<init>(r5, r0, r6)
            androidx.lifecycle.x r5 = r5.f7264b
            int r0 = r6 + 2
            int r0 = r5.P(r0)
            r1 = 0
            if (r0 != 0) goto L16
            r5 = 1
            r4.f7851d = r5
            r4.f7852e = r1
            return
        L16:
            r4.f7851d = r0
            int r6 = r6 + 4
            int r5 = r5.N(r6)
            r4.f7852e = r5
            long r2 = (long) r0
            long r5 = (long) r5
            long r2 = r2 * r5
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 > 0) goto L2b
            return
        L2b:
            d6.f r5 = new d6.f
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r0 = 0
            java.lang.String r1 = "Invalid array-payload instruction: element width*count overflows"
            r5.<init>(r0, r1, r6)
            throw r5
    }

    @Override // l5.a0, t5.d
    public final int c() {
            r2 = this;
            int r0 = r2.f7851d
            int r1 = r2.f7852e
            int r0 = r0 * r1
            int r0 = r0 + 1
            int r0 = r0 / 2
            int r0 = r0 + 4
            return r0
    }

    public final int t() {
            r1 = this;
            int r0 = r1.f7851d
            return r0
    }
}
