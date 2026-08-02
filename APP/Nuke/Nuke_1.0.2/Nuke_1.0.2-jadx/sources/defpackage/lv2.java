package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lv2 extends qp0 {
    public final String t;
    public int u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lv2(String str, int i) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        this.t = str;
        this.u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp0
    public final int D(mj0 mj0Var) {
        byte b;
        String str = this.t;
        if (str == null) {
            s.j("value must be specified");
            return 0;
        }
        if (str.length() == 0 && this.u != 5) {
            this.u = 5;
        }
        int iE = mj0Var.e(str);
        int i = this.u;
        if (i != 1) {
            b = 2;
            if (i == 2) {
                b = 1;
            } else if (i != 3) {
                b = 4;
                if (i == 4) {
                    b = 3;
                } else if (i != 5) {
                    throw null;
                }
            }
        } else {
            b = 0;
        }
        mj0Var.m(3);
        mj0Var.c(0, iE);
        if (b != 0) {
            mj0Var.a(b);
            mj0Var.l(1);
        }
        int iG = mj0Var.g();
        mj0Var.i(iG);
        return iG;
    }
}
