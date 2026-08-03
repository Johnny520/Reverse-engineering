package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f10998b;

    public /* synthetic */ w(java.util.Set r1, int r2) {
            r0 = this;
            r0.f10997a = r2
            r0.f10998b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f10997a
            qd.j r2 = (qd.j) r2
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            r2.getClass()
            boolean r0 = r2 instanceof qd.c
            if (r0 == 0) goto L17
            java.util.Set r0 = r1.f10998b
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
        L19:
            r2.getClass()
            boolean r0 = r2 instanceof qd.c
            if (r0 == 0) goto L2b
            java.util.Set r0 = r1.f10998b
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L2b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L2c
        L2b:
            r2 = 0
        L2c:
            return r2
    }
}
