package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class os0 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final m13 f7825a;

    /* JADX INFO: renamed from: b */
    public final int f7826b;

    /* JADX INFO: renamed from: c */
    public final int f7827c;

    public os0(m13 m13Var, int i, int i2) {
        this.f7825a = m13Var;
        this.f7826b = i;
        this.f7827c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os0)) {
            return false;
        }
        os0 os0Var = (os0) obj;
        return t11.m5086l(this.f7825a, os0Var.f7825a) && this.f7826b == os0Var.f7826b && this.f7827c == os0Var.f7827c;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        qs0 qs0Var = new qs0();
        qs0Var.f9147v = this.f7825a;
        qs0Var.f9148w = this.f7826b;
        qs0Var.f9149x = this.f7827c;
        qs0Var.f9151z = -1;
        qs0Var.f9144A = -1;
        return qs0Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        qs0 qs0Var = (qs0) th1Var;
        m13 m13Var = qs0Var.f9147v;
        m13 m13Var2 = this.f7825a;
        boolean zM5086l = t11.m5086l(m13Var, m13Var2);
        int i = this.f7826b;
        int i2 = this.f7827c;
        if (zM5086l && qs0Var.f9148w == i && qs0Var.f9149x == i2) {
            return;
        }
        qs0Var.f9147v = m13Var2;
        qs0Var.f9148w = i;
        qs0Var.f9149x = i2;
        qs0Var.f9145B = xe1.m6130k0(m13Var2, sp0.m4933c0(qs0Var).f9366G);
        qs0Var.f9150y = true;
        gf1.m1853A(qs0Var);
    }

    public final int hashCode() {
        return (((this.f7825a.hashCode() * 31) + this.f7826b) * 31) + this.f7827c;
    }
}
