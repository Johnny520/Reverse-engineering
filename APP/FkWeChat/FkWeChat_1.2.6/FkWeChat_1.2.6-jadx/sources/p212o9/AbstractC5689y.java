package p212o9;

import gb.AbstractC2650c1;
import gb.AbstractC2719v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.AbstractC4734d;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5116y;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: o9.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5689y {
    /* JADX INFO: renamed from: a */
    public static final AbstractC2719v1 m22979a(InterfaceC5995e interfaceC5995e, InterfaceC5995e interfaceC5995e2) {
        interfaceC5995e.getClass();
        interfaceC5995e2.getClass();
        interfaceC5995e.mo5594z().size();
        interfaceC5995e2.mo5594z().size();
        AbstractC2719v1.a aVar = AbstractC2719v1.f7113c;
        List listMo5594z = interfaceC5995e.mo5594z();
        listMo5594z.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo5594z, 10));
        Iterator it = listMo5594z.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC6018l1) it.next()).mo5591o());
        }
        List listMo5594z2 = interfaceC5995e2.mo5594z();
        listMo5594z2.getClass();
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(listMo5594z2, 10));
        Iterator it2 = listMo5594z2.iterator();
        while (it2.hasNext()) {
            AbstractC2650c1 abstractC2650c1Mo7508x = ((InterfaceC6018l1) it2.next()).mo7508x();
            abstractC2650c1Mo7508x.getClass();
            arrayList2.add(AbstractC4734d.m18909d(abstractC2650c1Mo7508x));
        }
        return AbstractC2719v1.a.m9647e(aVar, AbstractC5109u0.m20778s(AbstractC5081g0.m20574h1(arrayList, arrayList2)), false, 2, null);
    }
}
