package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f19935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f19936i;

    public /* synthetic */ we(fg.l r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.f19934g = r0
            r1.<init>()
            r1.f19936i = r2
            r1.f19935h = r3
            return
    }

    public /* synthetic */ we(boolean r2, fg.l r3) {
            r1 = this;
            r0 = 1
            r1.f19934g = r0
            r1.<init>()
            r1.f19935h = r2
            r1.f19936i = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f19934g
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.booleanValue()
            boolean r0 = r1.f19935h
            if (r0 == 0) goto L13
            fg.l r0 = r1.f19936i
            r0.invoke(r2)
        L13:
            sf.n r2 = sf.n.f12433a
            return r2
        L16:
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            boolean r0 = r1.f19935h
            if (r0 == 0) goto L22
            r0 = 19
            goto L24
        L22:
            r0 = 9
        L24:
            java.lang.String r2 = og.m.P0(r0, r2)
            fg.l r0 = r1.f19936i
            r0.invoke(r2)
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
