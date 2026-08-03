package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ be.d0 f774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud.e f775c;

    public /* synthetic */ b0(be.d0 r1, ud.e r2, int r3) {
            r0 = this;
            r0.f773a = r3
            r0.f774b = r1
            r0.f775c = r2
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f773a
            switch(r0) {
                case 0: goto L3b;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            ud.e r0 = r4.f775c
            pc.d r5 = (pc.d) r5
            be.d0 r1 = r4.f774b
            r1.m(r0, r5)
            return
        Lf:
            ud.r r5 = (ud.r) r5
            oc.c r0 = oc.c.f9755a
            md.f r1 = r5.f8877g
            oc.b r0 = r1.c(r0)
            pc.d r0 = (pc.d) r0
            be.d0 r1 = r4.f774b
            ud.e r2 = r4.f775c
            r1.m(r2, r0)
            oc.c r0 = oc.c.f9761g
            md.f r5 = r5.f8877g
            oc.b r5 = r5.c(r0)
            pc.c r5 = (pc.c) r5
            if (r5 != 0) goto L2f
            goto L3a
        L2f:
            java.util.ArrayList r5 = r5.f10462g
            be.b0 r0 = new be.b0
            r3 = 2
            r0.<init>(r1, r2, r3)
            r5.forEach(r0)
        L3a:
            return
        L3b:
            ud.g r5 = (ud.g) r5
            oc.c r0 = oc.c.f9755a
            md.f r5 = r5.f8877g
            oc.b r5 = r5.c(r0)
            pc.d r5 = (pc.d) r5
            be.d0 r0 = r4.f774b
            ud.e r1 = r4.f775c
            r0.m(r1, r5)
            return
    }
}
