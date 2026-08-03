package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f734h;

    public /* synthetic */ i(java.lang.String r1, int r2) {
            r0 = this;
            r0.f733g = r2
            r0.f734h = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f733g
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L33;
                case 2: goto L25;
                default: goto L5;
            }
        L5:
            r7.o r3 = (r7.o) r3
            r7.n r0 = r3.f11574t
            r1 = 0
            if (r0 != 0) goto Le
            r0 = r1
            goto L10
        Le:
            int r0 = r0.f11560n
        L10:
            if (r0 != 0) goto L24
            java.lang.String r0 = r2.f734h
            if (r0 != 0) goto L19
            boolean r3 = r3.f7390i
            goto L21
        L19:
            java.lang.String r3 = r3.Y()
            boolean r3 = r0.equals(r3)
        L21:
            if (r3 == 0) goto L24
            r1 = 1
        L24:
            return r1
        L25:
            te.b r3 = (te.b) r3
            r3.a()
            java.lang.String r3 = "dex-input"
            java.lang.String r0 = r2.f734h
            boolean r3 = r3.equals(r0)
            return r3
        L33:
            m7.j r3 = (m7.j) r3
            java.lang.String r0 = r2.f734h
            r1 = 0
            if (r0 != 0) goto L46
            m7.t r3 = r3.V()
            java.lang.String r3 = r3.U()
            if (r3 != 0) goto L59
            r1 = 1
            goto L59
        L46:
            r3.getClass()
            java.lang.String r0 = b8.l.a(r0)
            m7.t r3 = r3.V()
            java.lang.String r3 = r3.c0(r1)
            boolean r1 = r0.equals(r3)
        L59:
            return r1
        L5a:
            ud.e r3 = (ud.e) r3
            od.a r3 = r3.f13690m
            java.lang.String r3 = r3.f9768j
            java.lang.String r0 = r2.f734h
            boolean r3 = r3.equals(r0)
            return r3
    }
}
