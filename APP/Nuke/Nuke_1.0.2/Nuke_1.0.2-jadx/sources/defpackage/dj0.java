package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 extends uj {
    public List t;
    public yg1 u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp0
    public final int D(mj0 mj0Var) {
        int iF;
        List list = this.t;
        if (list != null) {
            ArrayList arrayList = new ArrayList(eu.B(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(mj0Var.e((String) it.next())));
            }
            iF = mj0Var.f(du.E0(arrayList));
        } else {
            iF = 0;
        }
        yg1 yg1Var = this.u;
        int iD = yg1Var != null ? yg1Var.D(mj0Var) : 0;
        mj0Var.m(7);
        mj0Var.c(6, iD);
        mj0Var.c(4, 0);
        mj0Var.c(3, 0);
        mj0Var.c(1, 0);
        mj0Var.c(0, iF);
        int iG = mj0Var.g();
        mj0Var.i(iG);
        return iG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c0(in0 in0Var) {
        yg1 yg1Var = new yg1();
        in0Var.j(yg1Var);
        this.u = yg1Var;
    }
}
