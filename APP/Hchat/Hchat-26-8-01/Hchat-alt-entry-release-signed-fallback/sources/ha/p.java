package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements java.util.function.Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5265a;

    public /* synthetic */ p(int r1) {
            r0 = this;
            r0.f5265a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
            r2 = this;
            int r0 = r2.f5265a
            r1 = 0
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L18;
                case 2: goto L12;
                case 3: goto Lb;
                default: goto L6;
            }
        L6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        Lb:
            ke.k r0 = new ke.k
            r1 = 1
            r0.<init>(r1)
            return r0
        L12:
            ke.k r0 = new ke.k
            r0.<init>(r1)
            return r0
        L18:
            java.lang.String[] r0 = ha.j0.f5229f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L1d:
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            return r0
    }
}
