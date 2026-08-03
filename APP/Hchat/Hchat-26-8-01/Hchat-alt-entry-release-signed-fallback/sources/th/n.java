package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements th.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f13326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.LinkedHashMap f13327h;

    public n() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f13326g = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f13327h = r0
            return
    }

    @Override // th.m
    public final ai.b e(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            java.lang.Object r0 = r3.f13326g
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r3.f13327h     // Catch: java.lang.Throwable -> L19
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L1b
            ai.b r2 = ai.c.a(r5)     // Catch: java.lang.Throwable -> L19
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r4 = move-exception
            goto L1f
        L1b:
            ai.b r2 = (ai.b) r2     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return r2
        L1f:
            monitor-exit(r0)
            throw r4
    }
}
