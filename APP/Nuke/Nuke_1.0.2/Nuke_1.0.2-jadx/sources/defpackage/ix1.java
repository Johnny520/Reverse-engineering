package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ix1 extends qp0 {
    public List t;
    public p3 u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp0
    public final int D(mj0 mj0Var) {
        int iF;
        List<hx1> list = this.t;
        if (list != null) {
            ArrayList arrayList = new ArrayList(eu.B(list, 10));
            for (hx1 hx1Var : list) {
                if (hx1Var == null) {
                    hx1Var = new hx1();
                }
                arrayList.add(Integer.valueOf(hx1Var.D(mj0Var)));
            }
            iF = mj0Var.f(du.E0(arrayList));
        } else {
            iF = 0;
        }
        p3 p3Var = this.u;
        int iD = p3Var != null ? p3Var.D(mj0Var) : 0;
        mj0Var.m(2);
        mj0Var.c(1, iD);
        mj0Var.c(0, iF);
        int iG = mj0Var.g();
        mj0Var.i(iG);
        return iG;
    }
}
