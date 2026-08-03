package p000a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: a.pc */
/* JADX INFO: loaded from: classes.dex */
public final class C0767pc extends AbstractC0472a2 {

    /* JADX INFO: renamed from: a */
    public List<C0748oc> f3033a;

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: b */
    public final int mo1150b(C0026B6 c0026b6) {
        int iM63d;
        List<C0748oc> list = this.f3033a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C0758p3.m1800g0(list, 10));
            for (C0748oc c0748oc : list) {
                if (c0748oc == null) {
                    c0748oc = new C0748oc();
                }
                arrayList.add(Integer.valueOf(c0748oc.mo1150b(c0026b6)));
            }
            iM63d = c0026b6.m63d(C0834t3.m1958v0(arrayList));
        } else {
            iM63d = 0;
        }
        c0026b6.m68i(2);
        c0026b6.m60a(1, 0);
        c0026b6.m60a(0, iM63d);
        int iM64e = c0026b6.m64e();
        c0026b6.m65f(iM64e);
        return iM64e;
    }
}
