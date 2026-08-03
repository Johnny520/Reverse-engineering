package jd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fc.f f6863b;

    public /* synthetic */ b(fc.f r1, int r2) {
            r0 = this;
            r0.f6862a = r2
            r0.f6863b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f6862a
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            nd.p r3 = (nd.p) r3
            java.lang.String r0 = r3.f9385g
            java.lang.Throwable r3 = r3.f9386h
            fc.f r1 = r2.f6863b
            jd.c.c(r1, r0, r3)
            return
        L11:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "/* "
            fc.f r1 = r2.f6863b
            r1.r(r0)
            fc.f r3 = r1.i(r3)
            java.lang.String r0 = " */"
            r3.e(r0)
            return
    }
}
