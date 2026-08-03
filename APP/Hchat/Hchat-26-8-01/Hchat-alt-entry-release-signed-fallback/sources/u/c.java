package u;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f13336i;

    public /* synthetic */ c(int r1, fg.l r2, boolean r3) {
            r0 = this;
            r0.f13334g = r1
            r0.f13335h = r2
            r0.f13336i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ c(boolean r2, f0.c r3) {
            r1 = this;
            r0 = 4
            r1.f13334g = r0
            r1.<init>()
            r1.f13336i = r2
            r1.f13335h = r3
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f13334g
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L3d;
                case 2: goto L2d;
                case 3: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f13335h
            f0.c r0 = (f0.c) r0
            boolean r1 = r3.f13336i
            sf.n r2 = sf.n.f12433a
            if (r1 == 0) goto L1a
            tg.n r0 = r0.i()
            if (r0 == 0) goto L1a
            tg.r r0 = (tg.r) r0
            r0.p(r2)
        L1a:
            return r2
        L1b:
            java.lang.Object r0 = r3.f13335h
            fg.l r0 = (fg.l) r0
            boolean r1 = r3.f13336i
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.invoke(r1)
        L2a:
            sf.n r0 = sf.n.f12433a
            return r0
        L2d:
            java.lang.Object r0 = r3.f13335h
            fg.l r0 = (fg.l) r0
            boolean r1 = r3.f13336i
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.invoke(r1)
            goto L2a
        L3d:
            java.lang.Object r0 = r3.f13335h
            fg.l r0 = (fg.l) r0
            boolean r1 = r3.f13336i
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.invoke(r1)
            goto L2a
        L4d:
            java.lang.Object r0 = r3.f13335h
            fg.l r0 = (fg.l) r0
            boolean r1 = r3.f13336i
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.invoke(r1)
            goto L2a
    }
}
