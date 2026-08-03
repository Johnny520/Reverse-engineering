package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ud.a f1655h;

    public /* synthetic */ o(ud.a r1, int r2) {
            r0 = this;
            r0.f1654g = r2
            r0.f1655h = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f1654g
            switch(r0) {
                case 0: goto L32;
                case 1: goto L26;
                case 2: goto L1c;
                case 3: goto L10;
                default: goto L5;
            }
        L5:
            ae.f r2 = (ae.f) r2
            ud.a r2 = r2.f234c
            ud.a r0 = r1.f1655h
            boolean r2 = a.a.s0(r2, r0)
            return r2
        L10:
            ud.f r2 = (ud.f) r2
            ud.a r2 = r2.f13704a
            ud.a r0 = r1.f1655h
            if (r2 != r0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
        L1c:
            ud.a r0 = r1.f1655h
            ud.a r2 = (ud.a) r2
            if (r2 == r0) goto L24
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            return r2
        L26:
            nd.h0 r2 = (nd.h0) r2
            ud.a r2 = r2.f9373h
            ud.a r0 = r1.f1655h
            if (r2 != r0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            return r2
        L32:
            nd.h0 r2 = (nd.h0) r2
            ud.a r2 = r2.f9374i
            ud.a r0 = r1.f1655h
            if (r2 != r0) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            return r2
    }
}
