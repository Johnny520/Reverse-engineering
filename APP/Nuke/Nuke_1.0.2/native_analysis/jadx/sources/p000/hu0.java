package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hu0 implements h61 {

    /* JADX INFO: renamed from: a */
    public final tz2 f4137a;

    /* JADX INFO: renamed from: b */
    public final int f4138b;

    /* JADX INFO: renamed from: c */
    public final q33 f4139c;

    /* JADX INFO: renamed from: d */
    public final xm0 f4140d;

    public hu0(tz2 tz2Var, int i, q33 q33Var, xm0 xm0Var) {
        this.f4137a = tz2Var;
        this.f4138b = i;
        this.f4139c = q33Var;
        this.f4140d = xm0Var;
    }

    @Override // p000.h61
    /* JADX INFO: renamed from: e */
    public final of1 mo2078e(pf1 pf1Var, if1 if1Var, long j) {
        long j2;
        if (if1Var.mo2338W(C0221fz.m1762g(j)) < C0221fz.m1763h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = C0221fz.m1756a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        sz1 sz1VarMo2340e = if1Var.mo2340e(j);
        int iMin = Math.min(sz1VarMo2340e.f10438h, C0221fz.m1763h(j2));
        return pf1Var.mo696j0(iMin, sz1VarMo2340e.f10439i, ce0.f1492h, new l70(this, pf1Var, sz1VarMo2340e, iMin, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hu0) {
            hu0 hu0Var = (hu0) obj;
            if (this.f4137a == hu0Var.f4137a && this.f4138b == hu0Var.f4138b && this.f4139c.equals(hu0Var.f4139c) && t11.m5086l(this.f4140d, hu0Var.f4140d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4140d.hashCode() + ((this.f4139c.hashCode() + vi0.m5685d(this.f4138b, this.f4137a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f4137a + ", cursorOffset=" + this.f4138b + ", transformedText=" + this.f4139c + ", textLayoutResultProvider=" + this.f4140d + ')';
    }
}
