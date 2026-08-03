package h6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h6.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5106b;

    public /* synthetic */ d(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f5105a = r2
            r0.f5106b = r1
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f5105a
            switch(r0) {
                case 0: goto L31;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f5106b
            k6.s0 r0 = (k6.s0) r0
            h6.n r0 = r0.f7370i
            r0.b(r6, r7)
            return
        Lf:
            java.util.concurrent.atomic.AtomicLongArray r7 = (java.util.concurrent.atomic.AtomicLongArray) r7
            r6.b()
            int r0 = r7.length()
            r1 = 0
        L19:
            if (r1 >= r0) goto L2d
            java.lang.Object r2 = r5.f5106b
            h6.n r2 = (h6.n) r2
            long r3 = r7.get(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.b(r6, r3)
            int r1 = r1 + 1
            goto L19
        L2d:
            r6.g()
            return
        L31:
            java.util.concurrent.atomic.AtomicLong r7 = (java.util.concurrent.atomic.AtomicLong) r7
            java.lang.Object r0 = r5.f5106b
            h6.n r0 = (h6.n) r0
            long r1 = r7.get()
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r0.b(r6, r7)
            return
    }
}
