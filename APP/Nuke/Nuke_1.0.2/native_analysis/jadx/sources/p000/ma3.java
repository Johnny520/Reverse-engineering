package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ma3 implements h61 {

    /* JADX INFO: renamed from: a */
    public final tz2 f6533a;

    /* JADX INFO: renamed from: b */
    public final int f6534b;

    /* JADX INFO: renamed from: c */
    public final q33 f6535c;

    /* JADX INFO: renamed from: d */
    public final xm0 f6536d;

    public ma3(tz2 tz2Var, int i, q33 q33Var, xm0 xm0Var) {
        this.f6533a = tz2Var;
        this.f6534b = i;
        this.f6535c = q33Var;
        this.f6536d = xm0Var;
    }

    @Override // p000.h61
    /* JADX INFO: renamed from: e */
    public final of1 mo2078e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarMo2340e = if1Var.mo2340e(C0221fz.m1756a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(sz1VarMo2340e.f10439i, C0221fz.m1762g(j));
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, iMin, ce0.f1492h, new a62(this, sz1VarMo2340e, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ma3) {
            ma3 ma3Var = (ma3) obj;
            if (this.f6533a == ma3Var.f6533a && this.f6534b == ma3Var.f6534b && this.f6535c.equals(ma3Var.f6535c) && t11.m5086l(this.f6536d, ma3Var.f6536d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6536d.hashCode() + ((this.f6535c.hashCode() + vi0.m5685d(this.f6534b, this.f6533a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f6533a + ", cursorOffset=" + this.f6534b + ", transformedText=" + this.f6535c + ", textLayoutResultProvider=" + this.f6536d + ')';
    }
}
