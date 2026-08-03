package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f14457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14459j;

    public /* synthetic */ g(fg.l r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f14456g = r4
            r0.f14457h = r1
            r0.f14458i = r2
            r0.f14459j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f14456g
            switch(r0) {
                case 0: goto L46;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            i0.a1 r0 = r3.f14458i
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            sf.e r0 = wb.y2.H1(r0)
            i0.a1 r1 = r3.f14459j
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L36
            java.lang.Object r0 = r0.f12418g
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r0.length()
            if (r1 != 0) goto L2f
            r0 = r4
        L2f:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = wb.y2.I1(r0, r4)
            goto L3e
        L36:
            java.lang.Object r0 = r0.f12419h
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = wb.y2.I1(r4, r0)
        L3e:
            fg.l r0 = r3.f14457h
            r0.invoke(r4)
            sf.n r4 = sf.n.f12433a
            return r4
        L46:
            n2.s r4 = (n2.s) r4
            i0.a1 r0 = r3.f14458i
            r0.setValue(r4)
            i0.a1 r0 = r3.f14459j
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            i2.g r2 = r4.f8976a
            java.lang.String r2 = r2.f6314h
            boolean r1 = gg.l.a(r1, r2)
            i2.g r4 = r4.f8976a
            java.lang.String r2 = r4.f6314h
            r0.setValue(r2)
            if (r1 != 0) goto L6d
            java.lang.String r4 = r4.f6314h
            fg.l r0 = r3.f14457h
            r0.invoke(r4)
        L6d:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
