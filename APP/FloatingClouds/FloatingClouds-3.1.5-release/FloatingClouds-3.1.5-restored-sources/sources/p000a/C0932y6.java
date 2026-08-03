package p000a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: a.y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0932y6 extends AbstractC0453Z1 {

    /* JADX INFO: renamed from: a */
    public List f3542a;

    /* JADX INFO: renamed from: b */
    public C0549e3 f3543b;

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: b */
    public final int mo1150b(C0026B6 c0026b6) {
        int iM63d;
        List list = this.f3542a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C0758p3.m1800g0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c0026b6.m62c((String) it.next())));
            }
            iM63d = c0026b6.m63d(C0834t3.m1958v0(arrayList));
        } else {
            iM63d = 0;
        }
        C0549e3 c0549e3 = this.f3543b;
        int iMo1150b = c0549e3 != null ? c0549e3.mo1150b(c0026b6) : 0;
        c0026b6.m68i(6);
        c0026b6.m60a(5, iMo1150b);
        c0026b6.m60a(3, 0);
        c0026b6.m60a(1, 0);
        c0026b6.m60a(0, iM63d);
        int iM64e = c0026b6.m64e();
        c0026b6.m65f(iM64e);
        return iM64e;
    }
}
