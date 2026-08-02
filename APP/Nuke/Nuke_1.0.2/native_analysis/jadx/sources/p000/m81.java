package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class m81 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final xm0 f6511a;

    /* JADX INFO: renamed from: b */
    public final l81 f6512b;

    /* JADX INFO: renamed from: c */
    public final qv1 f6513c;

    /* JADX INFO: renamed from: d */
    public final boolean f6514d;

    public m81(xm0 xm0Var, l81 l81Var, qv1 qv1Var, boolean z) {
        this.f6511a = xm0Var;
        this.f6512b = l81Var;
        this.f6513c = qv1Var;
        this.f6514d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m81)) {
            return false;
        }
        m81 m81Var = (m81) obj;
        return this.f6511a == m81Var.f6511a && t11.m5086l(this.f6512b, m81Var.f6512b) && this.f6513c == m81Var.f6513c && this.f6514d == m81Var.f6514d;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new q81(this.f6511a, this.f6512b, this.f6513c, this.f6514d);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        q81 q81Var = (q81) th1Var;
        q81Var.f8821v = this.f6511a;
        q81Var.f8822w = this.f6512b;
        qv1 qv1Var = q81Var.f8823x;
        qv1 qv1Var2 = this.f6513c;
        if (qv1Var != qv1Var2) {
            q81Var.f8823x = qv1Var2;
            qp0.m4223E(q81Var);
        }
        boolean z = q81Var.f8824y;
        boolean z2 = this.f6514d;
        if (z == z2) {
            return;
        }
        q81Var.f8824y = z2;
        q81Var.m4067M0();
        qp0.m4223E(q81Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + hk1.m2205d((this.f6513c.hashCode() + ((this.f6512b.hashCode() + (this.f6511a.hashCode() * 31)) * 31)) * 31, 31, this.f6514d);
    }
}
