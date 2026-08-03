package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1.p f1923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1.t f1924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.l0 f1925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.l0 f1926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1927e;

    public i(d1.p r1, y1.t r2) {
            r0 = this;
            r0.<init>()
            r0.f1923a = r1
            r0.f1924b = r2
            f.l0 r1 = f.s0.f2899a
            f.l0 r1 = new f.l0
            r1.<init>()
            r0.f1925c = r1
            f.l0 r1 = new f.l0
            r1.<init>()
            r0.f1926d = r1
            return
    }

    public final void a() {
            r10 = this;
            boolean r0 = r10.f1927e
            if (r0 != 0) goto L26
            b0.v r1 = new b0.v
            r8 = 0
            r9 = 2
            r2 = 0
            java.lang.Class<d1.i> r4 = d1.i.class
            java.lang.String r5 = "invalidateNodes"
            java.lang.String r6 = "invalidateNodes()V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            y1.t r0 = r3.f1924b
            f.f0 r0 = r0.F0
            int r2 = r0.g(r1)
            if (r2 < 0) goto L1f
            goto L22
        L1f:
            r0.a(r1)
        L22:
            r0 = 1
            r3.f1927e = r0
            return
        L26:
            r3 = r10
            return
    }
}
