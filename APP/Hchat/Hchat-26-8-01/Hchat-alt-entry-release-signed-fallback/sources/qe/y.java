package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qd.l f11005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qd.j f11006i;

    public y(int r1, qd.l r2, qd.j r3) {
            r0 = this;
            r0.<init>()
            r0.f11004g = r1
            r0.f11005h = r2
            r0.f11006i = r3
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            qe.y r2 = (qe.y) r2
            int r0 = r1.f11004g
            int r2 = r2.f11004g
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            qd.j r0 = r5.f11006i
            java.lang.String r0 = java.lang.String.valueOf(r0)
            qd.l r1 = r5.f11005h
            java.lang.String r2 = r1.X()
            ud.p r1 = r1.f10903j
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = " -> "
            java.lang.String r4 = " in "
            java.lang.String r0 = bc.e.v(r0, r3, r2, r4, r1)
            return r0
    }
}
