package p000;

/* JADX INFO: renamed from: rl */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0660rl extends yh1 {

    /* JADX INFO: renamed from: a */
    public final float f9631a;

    /* JADX INFO: renamed from: b */
    public final ft2 f9632b;

    /* JADX INFO: renamed from: c */
    public final eq2 f9633c;

    public C0660rl(float f, ft2 ft2Var, eq2 eq2Var) {
        this.f9631a = f;
        this.f9632b = ft2Var;
        this.f9633c = eq2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0660rl)) {
            return false;
        }
        C0660rl c0660rl = (C0660rl) obj;
        return za0.m6404b(this.f9631a, c0660rl.f9631a) && this.f9632b.equals(c0660rl.f9632b) && t11.m5086l(this.f9633c, c0660rl.f9633c);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: f */
    public final th1 mo199f() {
        return new C0623ql(this.f9631a, this.f9632b, this.f9633c);
    }

    @Override // p000.yh1
    /* JADX INFO: renamed from: g */
    public final void mo200g(th1 th1Var) {
        C0623ql c0623ql = (C0623ql) th1Var;
        float f = c0623ql.f9021y;
        C0587po c0587po = c0623ql.f9019B;
        float f2 = this.f9631a;
        if (!za0.m6404b(f, f2)) {
            c0623ql.f9021y = f2;
            c0587po.m3888M0();
        }
        ft2 ft2Var = c0623ql.f9022z;
        ft2 ft2Var2 = this.f9632b;
        if (!t11.m5086l(ft2Var, ft2Var2)) {
            c0623ql.f9022z = ft2Var2;
            c0587po.m3888M0();
        }
        eq2 eq2Var = c0623ql.f9018A;
        eq2 eq2Var2 = this.f9633c;
        if (t11.m5086l(eq2Var, eq2Var2)) {
            return;
        }
        c0623ql.f9018A = eq2Var2;
        c0587po.m3888M0();
        qp0.m4223E(c0623ql);
    }

    public final int hashCode() {
        return this.f9633c.hashCode() + ((this.f9632b.hashCode() + (Float.hashCode(this.f9631a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) za0.m6405c(this.f9631a)) + ", brush=" + this.f9632b + ", shape=" + this.f9633c + ')';
    }
}
