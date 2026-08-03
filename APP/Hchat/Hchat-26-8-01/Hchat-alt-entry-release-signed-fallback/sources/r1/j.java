package r1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gg.u f11332h;

    public /* synthetic */ j(gg.u r1, int r2) {
            r0 = this;
            r0.f11331g = r2
            r0.f11332h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f11331g
            switch(r0) {
                case 0: goto L25;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            d1.b0 r4 = (d1.b0) r4
            gg.u r0 = r3.f11332h
            r0.f4564g = r4
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        Le:
            s1.f r4 = (s1.f) r4
            gg.u r0 = r3.f11332h
            java.lang.Object r1 = r0.f4564g
            if (r1 != 0) goto L1d
            boolean r2 = r4.f12228w
            if (r2 == 0) goto L1d
            r0.f4564g = r4
            goto L22
        L1d:
            if (r1 == 0) goto L22
            r4.getClass()
        L22:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L25:
            x1.e2 r4 = (x1.e2) r4
            r0 = r4
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            boolean r0 = r0.f21832t
            if (r0 == 0) goto L36
            gg.u r0 = r3.f11332h
            r0.f4564g = r4
            r4 = 0
            goto L37
        L36:
            r4 = 1
        L37:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
    }
}
