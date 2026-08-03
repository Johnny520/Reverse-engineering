package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends qd.d {
    public static final qd.q[] L = null;
    public final qd.j K;

    static {
            qd.q r0 = qd.q.f10916s
            qd.q[] r0 = new qd.q[]{r0}
            qd.a.L = r0
            return
    }

    public a(qd.j r1) {
            r0 = this;
            r0.<init>()
            r0.K = r1
            int r1 = r1.f10893a
            r0.f10893a = r1
            return
    }

    @Override // qd.d, qd.j
    public final qd.j A() {
            r2 = this;
            qd.j r0 = r2.K
            qd.j r0 = r0.A()
            qd.a r1 = new qd.a
            r1.<init>(r0)
            return r1
    }

    @Override // qd.j
    public final int f() {
            r1 = this;
            qd.j r0 = r1.K
            int r0 = r0.f()
            int r0 = r0 + 1
            return r0
    }

    @Override // qd.j
    public final qd.j g() {
            r1 = this;
            qd.j r0 = r1.K
            return r0
    }

    @Override // qd.j
    public final qd.j h() {
            r1 = this;
            qd.j r0 = r1.K
            qd.j r0 = r0.h()
            return r0
    }

    @Override // qd.d, qd.j
    public final qd.q[] n() {
            r1 = this;
            qd.q[] r0 = qd.a.L
            return r0
    }

    @Override // qd.j
    public final qd.q o() {
            r1 = this;
            qd.q r0 = qd.q.f10916s
            return r0
    }

    @Override // qd.j
    public final boolean s(java.lang.Object r2) {
            r1 = this;
            qd.a r2 = (qd.a) r2
            qd.j r0 = r1.K
            qd.j r2 = r2.K
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // qd.j
    public final java.lang.String toString() {
            r2 = this;
            qd.j r0 = r2.K
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "[]"
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    @Override // qd.d, qd.j
    public final boolean w() {
            r1 = this;
            qd.j r0 = r1.K
            boolean r0 = r0.w()
            return r0
    }
}
