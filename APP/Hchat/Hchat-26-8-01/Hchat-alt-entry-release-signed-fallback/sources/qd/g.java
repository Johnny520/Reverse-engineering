package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends qd.d {
    public final qd.q K;

    public g(qd.q r1) {
            r0 = this;
            r0.<init>()
            r0.K = r1
            int r1 = r1.hashCode()
            r0.f10893a = r1
            return
    }

    @Override // qd.j
    public final qd.q o() {
            r1 = this;
            qd.q r0 = r1.K
            return r0
    }

    @Override // qd.j
    public final boolean s(java.lang.Object r2) {
            r1 = this;
            qd.g r2 = (qd.g) r2
            qd.q r2 = r2.K
            qd.q r0 = r1.K
            if (r0 != r2) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // qd.j
    public final java.lang.String toString() {
            r1 = this;
            qd.q r0 = r1.K
            java.lang.String r0 = r0.f10920h
            return r0
    }
}
