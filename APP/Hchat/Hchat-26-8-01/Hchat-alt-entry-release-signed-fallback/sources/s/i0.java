package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ sf.b f12033l;

    public /* synthetic */ i0(android.content.Context r2, ba.n r3, int r4, fg.a r5, int r6) {
            r1 = this;
            r0 = 2
            r1.f12028g = r0
            r1.<init>()
            r1.f12031j = r2
            r1.f12032k = r3
            r1.f12029h = r4
            r1.f12033l = r5
            r1.f12030i = r6
            return
    }

    public /* synthetic */ i0(java.lang.Object r2, int r3, s.j0 r4, s0.d r5, int r6) {
            r1 = this;
            r0 = 0
            r1.f12028g = r0
            r1.<init>()
            r1.f12031j = r2
            r1.f12029h = r3
            r1.f12032k = r4
            r1.f12033l = r5
            r1.f12030i = r6
            return
    }

    public /* synthetic */ i0(java.lang.Object r1, java.lang.String r2, sf.b r3, int r4, int r5, int r6) {
            r0 = this;
            r0.f12028g = r6
            r0.f12031j = r1
            r0.f12032k = r2
            r0.f12033l = r3
            r0.f12029h = r4
            r0.f12030i = r5
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f12028g
            switch(r0) {
                case 0: goto L76;
                case 1: goto L51;
                case 2: goto L2c;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f12031j
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r7.f12032k
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            sf.b r0 = r7.f12033l
            r3 = r0
            fg.a r3 = (fg.a) r3
            r4 = r8
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            int r8 = r7.f12029h
            r8 = r8 | 1
            int r5 = i0.r.C(r8)
            int r6 = r7.f12030i
            wb.ho.B1(r1, r2, r3, r4, r5, r6)
        L29:
            sf.n r8 = sf.n.f12433a
            return r8
        L2c:
            java.lang.Object r0 = r7.f12031j
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r7.f12032k
            r2 = r0
            ba.n r2 = (ba.n) r2
            sf.b r0 = r7.f12033l
            r4 = r0
            fg.a r4 = (fg.a) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            int r8 = r7.f12030i
            r8 = r8 | 1
            int r6 = i0.r.C(r8)
            int r3 = r7.f12029h
            wb.ho.e2(r1, r2, r3, r4, r5, r6)
            goto L29
        L51:
            java.lang.Object r0 = r7.f12031j
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r7.f12032k
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            sf.b r0 = r7.f12033l
            r4 = r0
            fg.l r4 = (fg.l) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            int r8 = r7.f12029h
            r8 = r8 | 1
            int r2 = i0.r.C(r8)
            int r3 = r7.f12030i
            r1.c(r2, r3, r4, r5, r6)
            goto L29
        L76:
            java.lang.Object r0 = r7.f12032k
            r3 = r0
            s.j0 r3 = (s.j0) r3
            sf.b r0 = r7.f12033l
            r4 = r0
            s0.d r4 = (s0.d) r4
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            int r8 = r7.f12030i
            r8 = r8 | 1
            int r6 = i0.r.C(r8)
            java.lang.Object r1 = r7.f12031j
            int r2 = r7.f12029h
            s.o.b(r1, r2, r3, r4, r5, r6)
            goto L29
    }
}
