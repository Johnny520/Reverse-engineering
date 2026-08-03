package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ fg.a f19116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.l f19117m;

    public /* synthetic */ sl(int r1, int r2, android.content.Context r3, fg.a r4, fg.l r5, java.lang.String r6, java.util.List r7, java.util.List r8) {
            r0 = this;
            r0.f19111g = r2
            r0.f19112h = r3
            r0.f19113i = r6
            r0.f19114j = r7
            r0.f19115k = r8
            r0.f19116l = r4
            r0.f19117m = r5
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f19111g
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            r7 = r10
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r10 = 24577(0x6001, float:3.444E-41)
            int r8 = i0.r.C(r10)
            android.content.Context r1 = r9.f19112h
            java.lang.String r2 = r9.f19113i
            java.util.List r3 = r9.f19114j
            java.util.List r4 = r9.f19115k
            fg.a r5 = r9.f19116l
            fg.l r6 = r9.f19117m
            wb.ho.q1(r1, r2, r3, r4, r5, r6, r7, r8)
        L22:
            sf.n r10 = sf.n.f12433a
            return r10
        L25:
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r10 = 24577(0x6001, float:3.444E-41)
            int r7 = i0.r.C(r10)
            android.content.Context r0 = r9.f19112h
            java.lang.String r1 = r9.f19113i
            java.util.List r2 = r9.f19114j
            java.util.List r3 = r9.f19115k
            fg.a r4 = r9.f19116l
            fg.l r5 = r9.f19117m
            wb.ho.g1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L22
    }
}
