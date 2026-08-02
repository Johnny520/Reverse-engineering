package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ob2 implements nf1, lb2 {
    public final wf a;
    public final qk b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ob2(wf wfVar, qk qkVar) {
        this.a = wfVar;
        this.b = qkVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final of1 a(sz1[] sz1VarArr, pf1 pf1Var, int[] iArr, int i, int i2) {
        return pf1Var.j0(i, i2, ce0.h, new l70(sz1VarArr, this, i2, iArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int b(m11 m11Var, List list, int i) {
        int iT = m11Var.T(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iT, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            if1 if1Var = (if1) list.get(i2);
            float fK = se.K(se.G(if1Var));
            if (fK == 0.0f) {
                int iMin2 = Math.min(if1Var.W(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, if1Var.f(iMin2));
            } else if (fK > 0.0f) {
                f += fK;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if1 if1Var2 = (if1) list.get(i3);
            float fK2 = se.K(se.G(if1Var2));
            if (fK2 > 0.0f) {
                iMax = Math.max(iMax, if1Var2.f(iRound != Integer.MAX_VALUE ? Math.round(iRound * fK2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final void c(int i, pf1 pf1Var, int[] iArr, int[] iArr2) {
        this.a.e(pf1Var, i, iArr, pf1Var.getLayoutDirection(), iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int d(m11 m11Var, List list, int i) {
        int iT = m11Var.T(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            if1 if1Var = (if1) list.get(i3);
            float fK = se.K(se.G(if1Var));
            int iW = if1Var.W(i);
            if (fK == 0.0f) {
                i2 += iW;
            } else if (fK > 0.0f) {
                f += fK;
                iMax = Math.max(iMax, Math.round(iW / fK));
            }
        }
        return ((list.size() - 1) * iT) + Math.round(iMax * f) + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? gz.a(i, i2, 0, i3) : rp0.d0(i, i2, 0, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob2)) {
            return false;
        }
        ob2 ob2Var = (ob2) obj;
        return this.a.equals(ob2Var.a) && t11.l(this.b, ob2Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final int f(sz1 sz1Var) {
        return sz1Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final of1 g(pf1 pf1Var, List list, long j) {
        return te.X(this, fz.j(j), fz.i(j), fz.h(j), fz.g(j), pf1Var.T(this.a.b()), pf1Var, list, new sz1[list.size()], list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int h(m11 m11Var, List list, int i) {
        int iT = m11Var.T(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iT, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            if1 if1Var = (if1) list.get(i2);
            float fK = se.K(se.G(if1Var));
            if (fK == 0.0f) {
                int iMin2 = Math.min(if1Var.W(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, if1Var.X(iMin2));
            } else if (fK > 0.0f) {
                f += fK;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if1 if1Var2 = (if1) list.get(i3);
            float fK2 = se.K(se.G(if1Var2));
            if (fK2 > 0.0f) {
                iMax = Math.max(iMax, if1Var2.X(iRound != Integer.MAX_VALUE ? Math.round(iRound * fK2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final int i(sz1 sz1Var) {
        return sz1Var.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int j(m11 m11Var, List list, int i) {
        int iT = m11Var.T(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            if1 if1Var = (if1) list.get(i3);
            float fK = se.K(se.G(if1Var));
            int iN = if1Var.N(i);
            if (fK == 0.0f) {
                i2 += iN;
            } else if (fK > 0.0f) {
                f += fK;
                iMax = Math.max(iMax, Math.round(iN / fK));
            }
        }
        return ((list.size() - 1) * iT) + Math.round(iMax * f) + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
