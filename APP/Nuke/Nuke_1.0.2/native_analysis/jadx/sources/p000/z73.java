package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z73 implements vd3 {

    /* JADX INFO: renamed from: a */
    public final vd3 f13779a;

    /* JADX INFO: renamed from: b */
    public final vd3 f13780b;

    public z73(vd3 vd3Var, vd3 vd3Var2) {
        this.f13779a = vd3Var;
        this.f13780b = vd3Var2;
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: a */
    public final int mo2197a(pf1 pf1Var, d61 d61Var) {
        return Math.max(this.f13779a.mo2197a(pf1Var, d61Var), this.f13780b.mo2197a(pf1Var, d61Var));
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: b */
    public final int mo2198b(pf1 pf1Var) {
        return Math.max(this.f13779a.mo2198b(pf1Var), this.f13780b.mo2198b(pf1Var));
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: c */
    public final int mo2199c(pf1 pf1Var, d61 d61Var) {
        return Math.max(this.f13779a.mo2199c(pf1Var, d61Var), this.f13780b.mo2199c(pf1Var, d61Var));
    }

    @Override // p000.vd3
    /* JADX INFO: renamed from: d */
    public final int mo2200d(pf1 pf1Var) {
        return Math.max(this.f13779a.mo2200d(pf1Var), this.f13780b.mo2200d(pf1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z73)) {
            return false;
        }
        z73 z73Var = (z73) obj;
        return t11.m5086l(z73Var.f13779a, this.f13779a) && t11.m5086l(z73Var.f13780b, this.f13780b);
    }

    public final int hashCode() {
        return (this.f13780b.hashCode() * 31) + this.f13779a.hashCode();
    }

    public final String toString() {
        return "(" + this.f13779a + " ∪ " + this.f13780b + ')';
    }
}
