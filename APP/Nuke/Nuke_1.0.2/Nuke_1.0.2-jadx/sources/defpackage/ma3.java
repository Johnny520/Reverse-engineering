package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ma3 implements h61 {
    public final tz2 a;
    public final int b;
    public final q33 c;
    public final xm0 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ma3(tz2 tz2Var, int i, q33 q33Var, xm0 xm0Var) {
        this.a = tz2Var;
        this.b = i;
        this.c = q33Var;
        this.d = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarE = if1Var.e(fz.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(sz1VarE.i, fz.g(j));
        return pf1Var.j0(sz1VarE.h, iMin, ce0.h, new a62(this, sz1VarE, iMin));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ma3) {
            ma3 ma3Var = (ma3) obj;
            if (this.a == ma3Var.a && this.b == ma3Var.b && this.c.equals(ma3Var.c) && t11.l(this.d, ma3Var.d)) {
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
