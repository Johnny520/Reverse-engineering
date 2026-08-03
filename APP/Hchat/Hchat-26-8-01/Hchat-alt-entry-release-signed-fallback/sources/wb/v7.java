package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vb.a f19616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f19618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.a f19619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ fg.a f19620l;

    public /* synthetic */ v7(vb.a r1, android.content.SharedPreferences r2, int r3, fg.a r4, fg.a r5, int r6, int r7) {
            r0 = this;
            r0.f19615g = r7
            r0.f19616h = r1
            r0.f19617i = r2
            r0.f19618j = r3
            r0.f19619k = r4
            r0.f19620l = r5
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f19615g
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            r6 = r9
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r9 = 24577(0x6001, float:3.444E-41)
            int r7 = i0.r.C(r9)
            vb.a r1 = r8.f19616h
            android.content.SharedPreferences r2 = r8.f19617i
            int r3 = r8.f19618j
            fg.a r4 = r8.f19619k
            fg.a r5 = r8.f19620l
            wb.ho.s2(r1, r2, r3, r4, r5, r6, r7)
        L20:
            sf.n r9 = sf.n.f12433a
            return r9
        L23:
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r9 = 24577(0x6001, float:3.444E-41)
            int r6 = i0.r.C(r9)
            vb.a r0 = r8.f19616h
            android.content.SharedPreferences r1 = r8.f19617i
            int r2 = r8.f19618j
            fg.a r3 = r8.f19619k
            fg.a r4 = r8.f19620l
            wb.ho.k2(r0, r1, r2, r3, r4, r5, r6)
            goto L20
    }
}
