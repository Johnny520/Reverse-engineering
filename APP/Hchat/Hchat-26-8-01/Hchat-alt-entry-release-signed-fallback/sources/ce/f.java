package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements java.util.function.BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1639a;

    public /* synthetic */ f(int r1) {
            r0 = this;
            r0.f1639a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f1639a
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L31;
                case 2: goto L26;
                case 3: goto L1b;
                case 4: goto L10;
                default: goto L5;
            }
        L5:
            ud.r r2 = (ud.r) r2
            java.util.Set r3 = (java.util.Set) r3
            java.util.List r3 = i4.c0.j(r3)
            r2.H = r3
            return
        L10:
            ud.g r2 = (ud.g) r2
            java.util.Set r3 = (java.util.Set) r3
            java.util.List r3 = i4.c0.j(r3)
            r2.f13710o = r3
            return
        L1b:
            ud.e r2 = (ud.e) r2
            java.util.Set r3 = (java.util.Set) r3
            java.util.List r3 = i4.c0.j(r3)
            r2.C = r3
            return
        L26:
            ud.e r2 = (ud.e) r2
            java.util.Set r3 = (java.util.Set) r3
            java.util.List r3 = i4.c0.j(r3)
            r2.B = r3
            return
        L31:
            ud.e r2 = (ud.e) r2
            java.util.Set r3 = (java.util.Set) r3
            java.util.List r3 = i4.c0.j(r3)
            r2.f13703z = r3
            return
        L3c:
            ae.f r2 = (ae.f) r2
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r2 = r2.f235d
            r3.removeAll(r2)
            return
    }
}
