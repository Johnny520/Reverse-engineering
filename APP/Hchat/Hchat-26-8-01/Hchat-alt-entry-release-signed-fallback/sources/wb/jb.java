package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jb implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f17007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17009j;

    public /* synthetic */ jb(fg.l r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f17006g = r4
            r0.f17007h = r1
            r0.f17008i = r2
            r0.f17009j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f17006g
            switch(r0) {
                case 0: goto L20;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r3.f17008i
            boolean r0 = wb.y2.H(r0)
            if (r0 != 0) goto L1d
            i0.a1 r0 = r3.f17009j
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            fg.l r1 = r3.f17007h
            r1.invoke(r0)
        L1d:
            sf.n r0 = sf.n.f12433a
            return r0
        L20:
            x9.f r0 = new x9.f
            i0.a1 r1 = r3.f17008i
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            i0.a1 r2 = r3.f17009j
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.<init>(r1, r2)
            fg.l r1 = r3.f17007h
            r1.invoke(r0)
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
