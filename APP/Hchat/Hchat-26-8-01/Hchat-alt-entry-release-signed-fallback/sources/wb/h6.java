package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h6 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.j1 f16492h;

    public /* synthetic */ h6(i0.j1 r1, int r2) {
            r0 = this;
            r0.f16491g = r2
            r0.f16492h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f16491g
            switch(r0) {
                case 0: goto L55;
                case 1: goto L4a;
                case 2: goto L38;
                case 3: goto L28;
                case 4: goto L1d;
                case 5: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            i0.j1 r0 = r3.f16492h
            r0.setValue(r4)
        Lf:
            sf.n r4 = sf.n.f12433a
            return r4
        L12:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            i0.j1 r0 = r3.f16492h
            r0.setValue(r4)
            goto Lf
        L1d:
            eb.c0 r4 = (eb.c0) r4
            r4.getClass()
            i0.j1 r0 = r3.f16492h
            r0.setValue(r4)
            goto Lf
        L28:
            wb.c3 r4 = (wb.c3) r4
            r4.getClass()
            wb.t2 r0 = new wb.t2
            r0.<init>(r4)
            i0.j1 r4 = r3.f16492h
            r4.setValue(r0)
            goto Lf
        L38:
            vb.a r4 = (vb.a) r4
            r4.getClass()
            wb.s2 r0 = new wb.s2
            r1 = 0
            r2 = 6
            r0.<init>(r4, r1, r2)
            i0.j1 r4 = r3.f16492h
            r4.setValue(r0)
            goto Lf
        L4a:
            eb.c0 r4 = (eb.c0) r4
            r4.getClass()
            i0.j1 r0 = r3.f16492h
            r0.setValue(r4)
            goto Lf
        L55:
            wb.t4 r4 = (wb.t4) r4
            r4.getClass()
            i0.j1 r0 = r3.f16492h
            r0.setValue(r4)
            goto Lf
    }
}
