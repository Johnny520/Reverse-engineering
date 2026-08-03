package re;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4.c0 f11946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud.r f11947c;

    public /* synthetic */ b(i4.c0 r1, ud.r r2, int r3) {
            r0 = this;
            r0.f11945a = r3
            r0.f11946b = r1
            r0.f11947c = r2
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f11945a
            switch(r0) {
                case 0: goto L19;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            ud.r r0 = r2.f11947c
            ud.e r3 = (ud.e) r3
            i4.c0 r1 = r2.f11946b
            r1.f(r0, r3)
            return
        Lf:
            ud.r r0 = r2.f11947c
            ud.e r3 = (ud.e) r3
            i4.c0 r1 = r2.f11946b
            r1.f(r0, r3)
            return
        L19:
            ud.r r0 = r2.f11947c
            qd.j r3 = (qd.j) r3
            i4.c0 r1 = r2.f11946b
            r1.e(r0, r3)
            return
    }
}
