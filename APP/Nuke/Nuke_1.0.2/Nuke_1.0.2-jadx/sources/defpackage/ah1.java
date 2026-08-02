package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ah1 extends qp0 {
    public List t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qp0
    public final int D(mj0 mj0Var) {
        int iF;
        List<yg1> list = this.t;
        if (list != null) {
            ArrayList arrayList = new ArrayList(eu.B(list, 10));
            for (yg1 yg1Var : list) {
                yg1Var.getClass();
                arrayList.add(Integer.valueOf(yg1Var.D(mj0Var)));
            }
            iF = mj0Var.f(du.E0(arrayList));
        } else {
            iF = 0;
        }
        mj0Var.m(3);
        mj0Var.c(2, 0);
        mj0Var.c(0, iF);
        int iG = mj0Var.g();
        mj0Var.i(iG);
        return iG;
    }
}
