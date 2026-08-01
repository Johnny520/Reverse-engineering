package p029F0;

import java.util.ArrayList;
import java.util.List;
import p041H0.AbstractC0559F;
import p061L2.C0982v;
import p153e1.AbstractC2006b;
import p153e1.C2005a;

/* JADX INFO: renamed from: F0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0401g0 extends AbstractC0559F {

    /* JADX INFO: renamed from: b */
    public static final C0401g0 f1225b = new C0401g0("Undefined intrinsics block and it is required");

    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        int size = list.size();
        C0982v c0982v = C0982v.f3048d;
        if (size == 0) {
            return interfaceC0379Q.mo604f0(C2005a.m3682j(j5), C2005a.m3681i(j5), c0982v, C0393c0.f1213g);
        }
        if (size == 1) {
            AbstractC0391b0 abstractC0391b0Mo648e = ((InterfaceC0376N) list.get(0)).mo648e(j5);
            return interfaceC0379Q.mo604f0(AbstractC2006b.m3690g(j5, abstractC0391b0Mo648e.f1206d), AbstractC2006b.m3689f(j5, abstractC0391b0Mo648e.f1207e), c0982v, new C0397e0(abstractC0391b0Mo648e, 0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            AbstractC0391b0 abstractC0391b0Mo648e2 = ((InterfaceC0376N) list.get(i5)).mo648e(j5);
            iMax = Math.max(abstractC0391b0Mo648e2.f1206d, iMax);
            iMax2 = Math.max(abstractC0391b0Mo648e2.f1207e, iMax2);
            arrayList.add(abstractC0391b0Mo648e2);
        }
        return interfaceC0379Q.mo604f0(AbstractC2006b.m3690g(j5, iMax), AbstractC2006b.m3689f(j5, iMax2), c0982v, new C0399f0(0, arrayList));
    }
}
