package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class av implements nf1, lb2 {
    public final yf a;
    public final pk b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public av(yf yfVar, pk pkVar) {
        this.a = yfVar;
        this.b = pkVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final of1 a(final sz1[] sz1VarArr, final pf1 pf1Var, final int[] iArr, int i, final int i2) {
        return pf1Var.j0(i2, i, ce0.h, new in0() { // from class: zu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.in0
            public final Object j(Object obj) {
                rz1 rz1Var = (rz1) obj;
                sz1[] sz1VarArr2 = sz1VarArr;
                int length = sz1VarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    sz1 sz1Var = sz1VarArr2[i3];
                    int i5 = i4 + 1;
                    sz1Var.getClass();
                    Object objI = sz1Var.i();
                    mb2 mb2Var = objI instanceof mb2 ? (mb2) objI : null;
                    d61 layoutDirection = pf1Var.getLayoutDirection();
                    t20 t20Var = mb2Var != null ? mb2Var.c : null;
                    int i6 = i2;
                    rz1.g(rz1Var, sz1Var, t20Var != null ? t20Var.a.a(sz1Var.h, i6, layoutDirection) : this.b.a(sz1Var.h, i6, layoutDirection), iArr[i4]);
                    i3++;
                    i4 = i5;
                }
                return a83.a;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int b(m11 m11Var, List list, int i) {
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
            int iF = if1Var.f(i);
            if (fK == 0.0f) {
                i2 += iF;
            } else if (fK > 0.0f) {
                f += fK;
                iMax = Math.max(iMax, Math.round(iF / fK));
            }
        }
        return ((list.size() - 1) * iT) + Math.round(iMax * f) + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final void c(int i, pf1 pf1Var, int[] iArr, int[] iArr2) {
        this.a.f(i, pf1Var, iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int d(m11 m11Var, List list, int i) {
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
                int iMin2 = Math.min(if1Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, if1Var.W(iMin2));
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
                iMax = Math.max(iMax, if1Var2.W(iRound != Integer.MAX_VALUE ? Math.round(iRound * fK2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final long e(int i, int i2, int i3, boolean z) {
        return !z ? gz.a(0, i3, i, i2) : rp0.c0(0, i3, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av)) {
            return false;
        }
        av avVar = (av) obj;
        return this.a.equals(avVar.a) && this.b.equals(avVar.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final int f(sz1 sz1Var) {
        return sz1Var.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final of1 g(pf1 pf1Var, List list, long j) {
        return te.X(this, fz.i(j), fz.j(j), fz.g(j), fz.h(j), pf1Var.T(this.a.b()), pf1Var, list, new sz1[list.size()], list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int h(m11 m11Var, List list, int i) {
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
            int iX = if1Var.X(i);
            if (fK == 0.0f) {
                i2 += iX;
            } else if (fK > 0.0f) {
                f += fK;
                iMax = Math.max(iMax, Math.round(iX / fK));
            }
        }
        return ((list.size() - 1) * iT) + Math.round(iMax * f) + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lb2
    public final int i(sz1 sz1Var) {
        return sz1Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final int j(m11 m11Var, List list, int i) {
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
                int iMin2 = Math.min(if1Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, if1Var.N(iMin2));
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
                iMax = Math.max(iMax, if1Var2.N(iRound != Integer.MAX_VALUE ? Math.round(iRound * fK2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
