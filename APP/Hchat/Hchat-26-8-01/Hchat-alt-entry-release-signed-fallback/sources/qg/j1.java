package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends vg.p implements java.lang.Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11065k;

    public j1(long r2, qg.k1 r4) {
            r1 = this;
            wf.g r0 = r4.getContext()
            r1.<init>(r4, r0)
            r1.f11065k = r2
            return
    }

    @Override // qg.y0
    public final java.lang.String P() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.P()
            r0.append(r1)
            java.lang.String r1 = "(timeMillis="
            r0.append(r1)
            long r1 = r3.f11065k
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            wf.g r0 = r3.f11031i
            qg.v.i(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Timed out waiting for "
            r0.<init>(r1)
            long r1 = r3.f11065k
            r0.append(r1)
            java.lang.String r1 = " ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            qg.i1 r1 = new qg.i1
            r1.<init>(r0, r3)
            r3.v(r1)
            return
    }
}
