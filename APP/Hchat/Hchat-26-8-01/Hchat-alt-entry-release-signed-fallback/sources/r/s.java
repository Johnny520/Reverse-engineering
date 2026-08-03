package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11261h;

    public /* synthetic */ s(int r2) {
            r1 = this;
            r0 = 1
            r1.f11260g = r0
            r1.<init>()
            r1.f11261h = r2
            return
    }

    public /* synthetic */ s(r.z r1, int r2) {
            r0 = this;
            r1 = 0
            r0.f11260g = r1
            r0.<init>()
            r0.f11261h = r2
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f11260g
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            db.a r4 = (db.a) r4
            r4.getClass()
            int r4 = r4.f2166a
            int r0 = r3.f11261h
            if (r4 != r0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L18:
            s.k0 r4 = (s.k0) r4
            w0.f r0 = w0.q.e()
            if (r0 == 0) goto L25
            fg.l r1 = r0.e()
            goto L26
        L25:
            r1 = 0
        L26:
            w0.f r2 = w0.q.h(r0)
            w0.q.k(r0, r2, r1)
            r4.getClass()
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
