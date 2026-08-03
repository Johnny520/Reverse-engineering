package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ be.b f789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud.r f790c;

    public /* synthetic */ e0(be.b r1, ud.r r2, int r3) {
            r0 = this;
            r0.f788a = r3
            r0.f789b = r1
            r0.f790c = r2
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f788a
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            ud.r r0 = r2.f790c
            nc.a r3 = (nc.a) r3
            be.b r1 = r2.f789b
            r1.s(r0, r3)
            return
        Lf:
            ud.r r0 = r2.f790c
            ud.g r3 = (ud.g) r3
            be.b r1 = r2.f789b
            r1.x(r0, r3)
            return
    }
}
