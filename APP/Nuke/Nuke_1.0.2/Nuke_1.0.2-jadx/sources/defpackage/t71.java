package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t71 extends th1 implements j61 {
    public static final r71 y = new r71();
    public r81 v;
    public lm w;
    public qv1 x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean M0(p71 p71Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.x != qv1.h) {
                }
            } else if (i != 1 && i != 2) {
                s.l("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (N0(i) ? p71Var.a > 0 : p71Var.b < this.v.a.g().n - 1) {
                return true;
            }
        } else if (this.x != qv1.i) {
            if (N0(i)) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean N0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = sp0.c0(this).G.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            c80.s();
            return false;
        }
        if (i != 4) {
            s.l("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = sp0.c0(this).G.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        c80.s();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarE = if1Var.e(j);
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new pg(sz1VarE, 4));
    }
}
