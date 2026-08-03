package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f824b;

    public /* synthetic */ l0(java.util.HashSet r1, int r2) {
            r0 = this;
            r0.f823a = r2
            r0.f824b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f823a
            qd.j r2 = (qd.j) r2
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            r2.getClass()
            boolean r0 = r2 instanceof qd.c
            if (r0 == 0) goto L17
            java.lang.String r2 = r2.l()
            java.util.HashSet r0 = r1.f824b
            r0.add(r2)
        L17:
            r2 = 0
            return r2
        L19:
            r2.getClass()
            boolean r0 = r2 instanceof qd.c
            if (r0 == 0) goto L29
            java.lang.String r2 = r2.l()
            java.util.HashSet r0 = r1.f824b
            r0.add(r2)
        L29:
            r2 = 0
            return r2
    }
}
