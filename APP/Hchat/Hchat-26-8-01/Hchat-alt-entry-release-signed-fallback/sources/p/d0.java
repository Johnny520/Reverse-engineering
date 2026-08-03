package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p.e0 f9885h;

    public /* synthetic */ d0(p.e0 r1, int r2) {
            r0 = this;
            r0.f9884g = r2
            r0.f9885h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f9884g
            x1.e2 r3 = (x1.e2) r3
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            r3.getClass()
            p.e0 r3 = (p.e0) r3
            p.r1 r3 = r3.f9889v
            p.e0 r0 = r2.f9885h
            r0.f9888u = r3
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L15:
            r3.getClass()
            p.e0 r3 = (p.e0) r3
            p.e0 r0 = r2.f9885h
            p.r1 r0 = r0.f9889v
            p.r1 r1 = r3.f9888u
            boolean r1 = gg.l.a(r1, r0)
            if (r1 != 0) goto L2b
            r3.f9888u = r0
            r3.l1()
        L2b:
            x1.d2 r3 = x1.d2.f20873h
            return r3
    }
}
