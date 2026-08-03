package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tl implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f19286j;

    public /* synthetic */ tl(android.content.Context r1, android.content.SharedPreferences r2, fg.a r3, int r4, int r5) {
            r0 = this;
            r0.f19283g = r5
            r0.f19284h = r1
            r0.f19285i = r2
            r0.f19286j = r3
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f19283g
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            switch(r0) {
                case 0: goto L1e;
                default: goto Lc;
            }
        Lc:
            r5 = 385(0x181, float:5.4E-43)
            int r5 = i0.r.C(r5)
            android.content.Context r0 = r3.f19284h
            android.content.SharedPreferences r1 = r3.f19285i
            fg.a r2 = r3.f19286j
            wb.ho.p(r0, r1, r2, r4, r5)
        L1b:
            sf.n r4 = sf.n.f12433a
            return r4
        L1e:
            r5 = 385(0x181, float:5.4E-43)
            int r5 = i0.r.C(r5)
            android.content.Context r0 = r3.f19284h
            android.content.SharedPreferences r1 = r3.f19285i
            fg.a r2 = r3.f19286j
            wb.ho.L1(r0, r1, r2, r4, r5)
            goto L1b
    }
}
