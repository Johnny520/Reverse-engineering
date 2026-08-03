package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f7431h;

    public /* synthetic */ j(long r1, int r3) {
            r0 = this;
            r0.f7430g = r3
            r0.f7431h = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f7430g
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            switch(r0) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            java.lang.Object r5 = r5.getValue()
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            long r2 = r4.f7431h
            long r2 = r2 - r0
            r0 = 10000(0x2710, double:4.9407E-320)
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L1c
            r5 = 1
            goto L1d
        L1c:
            r5 = 0
        L1d:
            return r5
        L1e:
            java.lang.Object r5 = r5.getValue()
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            long r2 = r4.f7431h
            long r2 = r2 - r0
            r0 = 300000(0x493e0, double:1.482197E-318)
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L34
            r5 = 1
            goto L35
        L34:
            r5 = 0
        L35:
            return r5
    }
}
