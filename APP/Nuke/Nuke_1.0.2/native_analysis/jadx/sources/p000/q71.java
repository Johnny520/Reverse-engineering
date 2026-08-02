package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class q71 extends yh1 {

    /* JADX INFO: renamed from: a */
    public final r81 f8809a;

    /* JADX INFO: renamed from: b */
    public final C0429lm f8810b;

    /* JADX INFO: renamed from: c */
    public final qv1 f8811c;

    public q71(r81 r81Var, C0429lm c0429lm, qv1 qv1Var) {
        this.f8809a = r81Var;
        this.f8810b = c0429lm;
        this.f8811c = qv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q71)) {
            return false;
        }
        q71 q71Var = (q71) obj;
        return t11.m5086l(this.f8809a, q71Var.f8809a) && t11.m5086l(this.f8810b, q71Var.f8810b) && this.f8811c == q71Var.f8811c;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        t71 t71Var = new t71();
        t71Var.f10590v = this.f8809a;
        t71Var.f10591w = this.f8810b;
        t71Var.f10592x = this.f8811c;
        return t71Var;
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        t71 t71Var = (t71) th1Var;
        t71Var.f10590v = this.f8809a;
        t71Var.f10591w = this.f8810b;
        t71Var.f10592x = this.f8811c;
    }

    public final int hashCode() {
        return this.f8811c.hashCode() + hk1.m2205d((this.f8810b.hashCode() + (this.f8809a.hashCode() * 31)) * 31, 31, false);
    }
}
