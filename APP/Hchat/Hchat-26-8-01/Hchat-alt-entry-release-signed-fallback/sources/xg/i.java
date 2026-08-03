package xg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends xg.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f21622i;

    public i(java.lang.Runnable r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.f21622i = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            java.lang.Runnable r0 = r1.f21622i
            r0.run()
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Task["
            r0.<init>(r1)
            java.lang.Runnable r1 = r4.f21622i
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            java.lang.String r1 = qg.v.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.f21620g
            r0.append(r2)
            r0.append(r1)
            boolean r1 = r4.f21621h
            if (r1 == 0) goto L34
            java.lang.String r1 = "Blocking"
            goto L36
        L34:
            java.lang.String r1 = "Non-blocking"
        L36:
            r2 = 93
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
