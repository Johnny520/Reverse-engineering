package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f7789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7790h;

    public g(java.util.List r1, int r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            java.lang.String r3 = "initCallbacks cannot be null"
            ac.p.k(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r0.f7789g = r3
            r0.f7790h = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            java.util.ArrayList r0 = r7.f7789g
            int r1 = r0.size()
            r2 = 0
            int r3 = r7.f7790h
            r4 = 1
            if (r3 == r4) goto L1d
        Lc:
            if (r2 >= r1) goto L38
            java.lang.Object r3 = r0.get(r2)
            q2.g r3 = (q2.g) r3
            m.a r3 = r3.f10630b
            q2.k r4 = q2.j.f10633a
            r3.f8069h = r4
            int r2 = r2 + 1
            goto Lc
        L1d:
            if (r2 >= r1) goto L38
            java.lang.Object r3 = r0.get(r2)
            q2.g r3 = (q2.g) r3
            i0.j1 r5 = r3.f10629a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.setValue(r6)
            m.a r3 = r3.f10630b
            q2.k r5 = new q2.k
            r5.<init>(r4)
            r3.f8069h = r5
            int r2 = r2 + 1
            goto L1d
        L38:
            return
    }
}
