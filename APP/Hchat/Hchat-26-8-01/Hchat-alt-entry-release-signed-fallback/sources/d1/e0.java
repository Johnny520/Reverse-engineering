package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1.b0 f1915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1.b0 f1916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1.g f1918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1919l;

    public /* synthetic */ e0(d1.b0 r1, d1.b0 r2, java.lang.Object r3, int r4, b1.g r5, int r6) {
            r0 = this;
            r0.f1914g = r6
            r0.f1915h = r1
            r0.f1916i = r2
            r0.f1919l = r3
            r0.f1917j = r4
            r0.f1918k = r5
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f1914g
            switch(r0) {
                case 0: goto L3d;
                default: goto L5;
            }
        L5:
            v1.d r5 = (v1.d) r5
            d1.b0 r0 = r4.f1916i
            x1.r1 r1 = x1.k.x(r0)
            y1.t r1 = (y1.t) r1
            d1.l r1 = r1.getFocusOwner()
            d1.p r1 = (d1.p) r1
            d1.b0 r1 = r1.f()
            d1.b0 r2 = r4.f1915h
            if (r2 == r1) goto L20
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L3c
        L20:
            java.lang.Object r1 = r4.f1919l
            e1.c r1 = (e1.c) r1
            int r2 = r4.f1917j
            b1.g r3 = r4.f1918k
            boolean r0 = d1.d.A(r2, r3, r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L3b
            boolean r5 = r5.a()
            if (r5 != 0) goto L39
            goto L3b
        L39:
            r5 = 0
            goto L3c
        L3b:
            r5 = r1
        L3c:
            return r5
        L3d:
            v1.d r5 = (v1.d) r5
            d1.b0 r0 = r4.f1916i
            x1.r1 r1 = x1.k.x(r0)
            y1.t r1 = (y1.t) r1
            d1.l r1 = r1.getFocusOwner()
            d1.p r1 = (d1.p) r1
            d1.b0 r1 = r1.f()
            d1.b0 r2 = r4.f1915h
            if (r2 == r1) goto L58
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L74
        L58:
            java.lang.Object r1 = r4.f1919l
            d1.b0 r1 = (d1.b0) r1
            int r2 = r4.f1917j
            b1.g r3 = r4.f1918k
            boolean r0 = d1.d.B(r0, r1, r2, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L73
            boolean r5 = r5.a()
            if (r5 != 0) goto L71
            goto L73
        L71:
            r5 = 0
            goto L74
        L73:
            r5 = r1
        L74:
            return r5
    }
}
