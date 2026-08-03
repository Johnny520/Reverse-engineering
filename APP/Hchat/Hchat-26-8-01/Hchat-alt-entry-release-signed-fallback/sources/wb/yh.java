package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20397j;

    public /* synthetic */ yh(java.lang.String r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f20394g = r4
            r0.f20395h = r1
            r0.f20396i = r2
            r0.f20397j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r9 = this;
            int r0 = r9.f20394g
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r9.f20396i
            java.lang.String r1 = r9.f20395h
            r0.setValue(r1)
            java.lang.String r0 = "rename"
            i0.a1 r1 = r9.f20397j
            r1.setValue(r0)
        L13:
            sf.n r0 = sf.n.f12433a
            return r0
        L16:
            wb.v0 r1 = new wb.v0
            i0.a1 r0 = r9.f20396i
            java.lang.Object r2 = r0.getValue()
            ua.i r2 = (ua.i) r2
            int r2 = r2.f13631i
            r3 = 1
            if (r2 != r3) goto L28
            java.lang.String r2 = "选择白名单"
            goto L2a
        L28:
            java.lang.String r2 = "选择黑名单"
        L2a:
            wb.ni r6 = new wb.ni
            r3 = 18
            r6.<init>(r0, r3)
            r7 = 1
            r8 = 192(0xc0, float:2.69E-43)
            wb.u0 r3 = wb.u0.f19346i
            r4 = 1
            java.lang.String r5 = r9.f20395h
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            i0.a1 r0 = r9.f20397j
            r0.setValue(r1)
            goto L13
    }
}
