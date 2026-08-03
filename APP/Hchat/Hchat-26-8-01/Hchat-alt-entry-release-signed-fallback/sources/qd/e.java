package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class e extends qd.d {
    public final java.lang.String K;

    public e(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.K = r1
            int r1 = r1.hashCode()
            r0.f10893a = r1
            return
    }

    @Override // qd.j
    public final java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.K
            return r0
    }

    @Override // qd.j
    public final qd.q o() {
            r1 = this;
            qd.q r0 = qd.q.f10915r
            return r0
    }

    @Override // qd.j
    public boolean s(java.lang.Object r2) {
            r1 = this;
            qd.e r2 = (qd.e) r2
            java.lang.String r2 = r2.K
            java.lang.String r0 = r1.K
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // qd.j
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.K
            return r0
    }

    @Override // qd.j
    public final boolean v() {
            r1 = this;
            r0 = 1
            return r0
    }
}
