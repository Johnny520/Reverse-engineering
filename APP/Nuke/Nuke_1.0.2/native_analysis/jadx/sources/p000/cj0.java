package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cj0 extends AbstractC0775uj {

    /* JADX INFO: renamed from: t */
    public List f1584t;

    /* JADX INFO: renamed from: u */
    public C0030at f1585u;

    @Override // p000.qp0
    /* JADX INFO: renamed from: D */
    public final int mo170D(mj0 mj0Var) {
        int iM3115f;
        List list = this.f1584t;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(mj0Var.m3114e((String) it.next())));
            }
            iM3115f = mj0Var.m3115f(AbstractC0142du.m1147E0(arrayList));
        } else {
            iM3115f = 0;
        }
        C0030at c0030at = this.f1585u;
        int iMo170D = c0030at != null ? c0030at.mo170D(mj0Var) : 0;
        mj0Var.m3122m(6);
        mj0Var.m3112c(5, iMo170D);
        mj0Var.m3112c(3, 0);
        mj0Var.m3112c(1, 0);
        mj0Var.m3112c(0, iM3115f);
        int iM3116g = mj0Var.m3116g();
        mj0Var.m3118i(iM3116g);
        return iM3116g;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m845c0(in0 in0Var) {
        C0030at c0030at = new C0030at();
        in0Var.mo5j(c0030at);
        this.f1585u = c0030at;
    }
}
