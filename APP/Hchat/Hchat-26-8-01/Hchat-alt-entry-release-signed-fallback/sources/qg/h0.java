package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends qg.j0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qg.g f11056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ qg.l0 f11057j;

    public h0(qg.l0 r1, long r2, qg.g r4) {
            r0 = this;
            r0.f11057j = r1
            r0.<init>(r2)
            r0.f11056i = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            qg.l0 r0 = r3.f11057j
            sf.n r1 = sf.n.f12433a
            qg.g r2 = r3.f11056i
            r2.B(r0, r1)
            return
    }

    @Override // qg.j0
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            qg.g r1 = r2.f11056i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
