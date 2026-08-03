package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements qg.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f11042b;

    public /* synthetic */ e(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f11041a = r2
            r0.f11042b = r1
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.f11041a
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisposeOnCancel["
            r0.<init>(r1)
            java.lang.Object r1 = r2.f11042b
            qg.d0 r1 = (qg.d0) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CancelHandler.UserSupplied["
            r0.<init>(r1)
            java.lang.Object r1 = r2.f11042b
            fg.l r1 = (fg.l) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = qg.v.j(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
