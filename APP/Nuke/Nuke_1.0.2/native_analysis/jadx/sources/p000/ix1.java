package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ix1 extends qp0 {

    /* JADX INFO: renamed from: t */
    public List f4827t;

    /* JADX INFO: renamed from: u */
    public C0566p3 f4828u;

    @Override // p000.qp0
    /* JADX INFO: renamed from: D */
    public final int mo170D(mj0 mj0Var) {
        int iM3115f;
        List<hx1> list = this.f4827t;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
            for (hx1 hx1Var : list) {
                if (hx1Var == null) {
                    hx1Var = new hx1();
                }
                arrayList.add(Integer.valueOf(hx1Var.mo170D(mj0Var)));
            }
            iM3115f = mj0Var.m3115f(AbstractC0142du.m1147E0(arrayList));
        } else {
            iM3115f = 0;
        }
        C0566p3 c0566p3 = this.f4828u;
        int iMo170D = c0566p3 != null ? c0566p3.mo170D(mj0Var) : 0;
        mj0Var.m3122m(2);
        mj0Var.m3112c(1, iMo170D);
        mj0Var.m3112c(0, iM3115f);
        int iM3116g = mj0Var.m3116g();
        mj0Var.m3118i(iM3116g);
        return iM3116g;
    }
}
