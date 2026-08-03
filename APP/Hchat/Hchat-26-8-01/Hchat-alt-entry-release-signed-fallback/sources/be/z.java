package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f854b;

    public /* synthetic */ z(java.util.HashSet r1, int r2) {
            r0 = this;
            r0.f853a = r2
            r0.f854b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f853a
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L27;
                case 2: goto L19;
                default: goto L5;
            }
        L5:
            qd.l r4 = (qd.l) r4
            boolean r0 = r4 instanceof qd.o
            if (r0 == 0) goto L18
            qd.o r4 = (qd.o) r4
            java.lang.String r4 = r4.getName()
            if (r4 == 0) goto L18
            java.util.HashSet r0 = r3.f854b
            r0.add(r4)
        L18:
            return
        L19:
            qd.j r4 = (qd.j) r4
            be.l0 r0 = new be.l0
            r1 = 1
            java.util.HashSet r2 = r3.f854b
            r0.<init>(r2, r1)
            r4.C(r0)
            return
        L27:
            java.util.HashSet r0 = r3.f854b
            qd.r r4 = (qd.r) r4
            r0.remove(r4)
            return
        L2f:
            java.util.HashSet r0 = r3.f854b
            java.lang.String r4 = (java.lang.String) r4
            r0.remove(r4)
            return
    }
}
