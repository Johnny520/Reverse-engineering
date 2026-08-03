package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends r4.e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.TreeMap f11423f;

    public j0(r4.p r3) {
            r2 = this;
            java.lang.String r0 = "method_ids"
            r1 = 4
            r2.<init>(r0, r3, r1)
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r2.f11423f = r3
            return
    }

    @Override // r4.o0
    public final java.util.Collection c() {
            r1 = this;
            java.util.TreeMap r0 = r1.f11423f
            java.util.Collection r0 = r0.values()
            return r0
    }

    public final int l(v4.e r2) {
            r1 = this;
            if (r2 == 0) goto L1b
            r1.f()
            java.util.TreeMap r0 = r1.f11423f
            java.lang.Object r2 = r0.get(r2)
            r4.i0 r2 = (r4.i0) r2
            if (r2 == 0) goto L14
            int r2 = r2.e()
            return r2
        L14:
            java.lang.String r2 = "not found"
            j8.o.t(r2)
        L19:
            r2 = 0
            return r2
        L1b:
            java.lang.String r2 = "ref == null"
            bsh.j.c(r2)
            goto L19
    }

    public final synchronized void m(v4.e r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L1f
            r2.g()     // Catch: java.lang.Throwable -> L1b
            java.util.TreeMap r0 = r2.f11423f     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1b
            r4.i0 r0 = (r4.i0) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            r4.i0 r0 = new r4.i0     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            java.util.TreeMap r1 = r2.f11423f     // Catch: java.lang.Throwable -> L1b
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L27
        L1d:
            monitor-exit(r2)
            return
        L1f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "method == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1b
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }
}
