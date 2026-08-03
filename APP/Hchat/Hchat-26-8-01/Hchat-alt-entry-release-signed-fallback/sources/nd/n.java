package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f9383b;

    public /* synthetic */ n(java.lang.String r1, int r2) {
            r0 = this;
            r0.f9382a = r2
            r0.f9383b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f9382a
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            qd.l r4 = (qd.l) r4
            boolean r0 = r4 instanceof qd.o
            if (r0 == 0) goto L1b
            r0 = r4
            qd.o r0 = (qd.o) r0
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r3.f9383b
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r4 = 0
        L1c:
            return r4
        L1d:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "JADX "
            java.lang.String r1 = ": "
            java.lang.String r2 = r3.f9383b
            java.lang.String r4 = bc.e.j(r0, r2, r1, r4)
            return r4
    }
}
