package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13687a;

    public /* synthetic */ d(int r1) {
            r0 = this;
            r0.f13687a = r1
            r0.<init>()
            return
    }

    public /* synthetic */ d(xe.l r1) {
            r0 = this;
            r1 = 3
            r0.f13687a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f13687a
            switch(r0) {
                case 0: goto L60;
                case 1: goto L5a;
                case 2: goto Lc;
                default: goto L5;
            }
        L5:
            xe.p r5 = (xe.p) r5
            r5.getClass()
            r5 = 0
            throw r5
        Lc:
            ud.a r5 = (ud.a) r5
            r5.getClass()
            java.lang.String r0 = "Dominance frontier not set for block: "
            java.util.List r1 = r5.f13676n     // Catch: java.lang.Exception -> L49
            java.util.List r2 = xe.s.m(r1)     // Catch: java.lang.Exception -> L49
            r5.f13676n = r2     // Catch: java.lang.Exception -> L49
            java.util.List r3 = r5.f13677o     // Catch: java.lang.Exception -> L49
            if (r1 != r3) goto L20
            goto L24
        L20:
            java.util.List r2 = xe.s.m(r3)     // Catch: java.lang.Exception -> L49
        L24:
            r5.f13677o = r2     // Catch: java.lang.Exception -> L49
            java.util.List r1 = r5.f13675m     // Catch: java.lang.Exception -> L49
            java.util.List r1 = xe.s.m(r1)     // Catch: java.lang.Exception -> L49
            r5.f13675m = r1     // Catch: java.lang.Exception -> L49
            java.util.List r1 = r5.f13683u     // Catch: java.lang.Exception -> L49
            java.util.List r1 = xe.s.m(r1)     // Catch: java.lang.Exception -> L49
            r5.f13683u = r1     // Catch: java.lang.Exception -> L49
            java.util.BitSet r1 = r5.f13680r     // Catch: java.lang.Exception -> L49
            if (r1 == 0) goto L3b
            return
        L3b:
            af.g r1 = new af.g     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L49
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Exception -> L49
            r1.<init>(r0)     // Catch: java.lang.Exception -> L49
            throw r1     // Catch: java.lang.Exception -> L49
        L49:
            r0 = move-exception
            af.g r1 = new af.g
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Failed to lock block: "
            java.lang.String r5 = r2.concat(r5)
            r1.<init>(r5, r0)
            throw r1
        L5a:
            ud.g r5 = (ud.g) r5
            r5.F()
            return
        L60:
            ud.e r5 = (ud.e) r5
            r5.o0()
            return
    }
}
