package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nf implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ db.c f17895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f17896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.p f17897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f17898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f17899l;

    public /* synthetic */ nf(db.c r2, fg.l r3, fg.p r4, fg.l r5, boolean r6) {
            r1 = this;
            r0 = 0
            r1.f17894g = r0
            r1.<init>()
            r1.f17895h = r2
            r1.f17896i = r3
            r1.f17897j = r4
            r1.f17898k = r5
            r1.f17899l = r6
            return
    }

    public /* synthetic */ nf(db.c r1, fg.l r2, fg.p r3, fg.l r4, boolean r5, int r6) {
            r0 = this;
            r6 = 1
            r0.f17894g = r6
            r0.<init>()
            r0.f17895h = r1
            r0.f17896i = r2
            r0.f17897j = r3
            r0.f17898k = r4
            r0.f17899l = r5
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f17894g
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            r6 = r9
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r9 = 1
            int r7 = i0.r.C(r9)
            db.c r1 = r8.f17895h
            fg.l r2 = r8.f17896i
            fg.p r3 = r8.f17897j
            fg.l r4 = r8.f17898k
            boolean r5 = r8.f17899l
            wb.ho.j3(r1, r2, r3, r4, r5, r6, r7)
            sf.n r9 = sf.n.f12433a
            return r9
        L22:
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r10 = r9 & 3
            r0 = 2
            r1 = 1
            if (r10 == r0) goto L33
            r10 = r1
            goto L34
        L33:
            r10 = 0
        L34:
            r9 = r9 & r1
            boolean r9 = r5.S(r9, r10)
            if (r9 == 0) goto L4a
            r6 = 0
            db.c r0 = r8.f17895h
            fg.l r1 = r8.f17896i
            fg.p r2 = r8.f17897j
            fg.l r3 = r8.f17898k
            boolean r4 = r8.f17899l
            wb.ho.j3(r0, r1, r2, r3, r4, r5, r6)
            goto L4d
        L4a:
            r5.V()
        L4d:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
