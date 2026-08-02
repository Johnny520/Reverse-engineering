package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ah1 extends qp0 {

    /* JADX INFO: renamed from: t */
    public List f202t;

    @Override // p000.qp0
    /* JADX INFO: renamed from: D */
    public final int mo170D(mj0 mj0Var) {
        int iM3115f;
        List<yg1> list = this.f202t;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
            for (yg1 yg1Var : list) {
                yg1Var.getClass();
                arrayList.add(Integer.valueOf(yg1Var.mo170D(mj0Var)));
            }
            iM3115f = mj0Var.m3115f(AbstractC0142du.m1147E0(arrayList));
        } else {
            iM3115f = 0;
        }
        mj0Var.m3122m(3);
        mj0Var.m3112c(2, 0);
        mj0Var.m3112c(0, iM3115f);
        int iM3116g = mj0Var.m3116g();
        mj0Var.m3118i(iM3116g);
        return iM3116g;
    }
}
