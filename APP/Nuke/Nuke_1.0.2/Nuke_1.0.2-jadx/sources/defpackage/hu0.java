package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hu0 implements h61 {
    public final tz2 a;
    public final int b;
    public final q33 c;
    public final xm0 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hu0(tz2 tz2Var, int i, q33 q33Var, xm0 xm0Var) {
        this.a = tz2Var;
        this.b = i;
        this.c = q33Var;
        this.d = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        long j2;
        if (if1Var.W(fz.g(j)) < fz.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = fz.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        sz1 sz1VarE = if1Var.e(j);
        int iMin = Math.min(sz1VarE.h, fz.h(j2));
        return pf1Var.j0(iMin, sz1VarE.i, ce0.h, new l70(this, pf1Var, sz1VarE, iMin, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hu0) {
            hu0 hu0Var = (hu0) obj;
            if (this.a == hu0Var.a && this.b == hu0Var.b && this.c.equals(hu0Var.c) && t11.l(this.d, hu0Var.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + vi0.d(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
