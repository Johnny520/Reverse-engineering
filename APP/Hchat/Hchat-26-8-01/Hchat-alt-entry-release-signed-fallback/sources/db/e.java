package db;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ db.c f2194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f2195i;

    public /* synthetic */ e(db.c r2, java.util.ArrayList r3) {
            r1 = this;
            r0 = 1
            r1.f2193g = r0
            r1.<init>()
            r1.f2194h = r2
            r1.f2195i = r3
            return
    }

    public /* synthetic */ e(java.util.ArrayList r2, db.c r3) {
            r1 = this;
            r0 = 0
            r1.f2193g = r0
            r1.<init>()
            r1.f2195i = r2
            r1.f2194h = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f2193g
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            fg.q r7 = (fg.q) r7
            r7.getClass()
            db.c r0 = r6.f2194h
            int r1 = r0.f2188u
            java.util.List r0 = r0.f2173f
            java.util.ArrayList r2 = r6.f2195i
            hb.s r7 = a.a.H(r1, r2, r0, r7)
            return r7
        L17:
            r5 = r7
            fg.q r5 = (fg.q) r5
            r5.getClass()
            db.c r7 = r6.f2194h
            java.util.List r2 = r7.f2173f
            int r3 = r7.f2177j
            int r4 = r7.f2178k
            r0 = 1
            java.util.ArrayList r1 = r6.f2195i
            hb.s r7 = a.a.G(r0, r1, r2, r3, r4, r5)
            return r7
    }
}
