package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w.n1 f14527h;

    public /* synthetic */ l(w.n1 r1, int r2) {
            r0 = this;
            r0.f14526g = r2
            r0.f14527h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f14526g
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            w.n1 r0 = r3.f14527h
            i2.g r1 = r0.f14576b
            i0.j1 r0 = r0.f14575a
            java.lang.Object r0 = r0.getValue()
            i2.k0 r0 = (i2.k0) r0
            if (r0 == 0) goto L1a
            i2.j0 r0 = r0.f6346a
            if (r0 == 0) goto L1a
            i2.g r0 = r0.f6334a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r0 = gg.l.a(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L24:
            w.n1 r0 = r3.f14527h
            if (r0 == 0) goto L39
            w.l r1 = new w.l
            r2 = 2
            r1.<init>(r0, r2)
            java.lang.Object r0 = r1.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L3a
        L39:
            r0 = 0
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L3f:
            w.n1 r0 = r3.f14527h
            if (r0 == 0) goto L54
            w.l r1 = new w.l
            r2 = 2
            r1.<init>(r0, r2)
            java.lang.Object r0 = r1.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L55
        L54:
            r0 = 0
        L55:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
