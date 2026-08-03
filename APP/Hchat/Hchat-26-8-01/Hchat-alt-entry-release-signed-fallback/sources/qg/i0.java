package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends qg.j0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qg.j1 f11061i;

    public i0(long r1, qg.j1 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f11061i = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            qg.j1 r0 = r1.f11061i
            r0.run()
            return
    }

    @Override // qg.j0
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            qg.j1 r1 = r2.f11061i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
