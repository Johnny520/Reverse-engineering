package p040V0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001A0.AbstractC0040p;
import p009E0.C0180k;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: V0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0407j extends AbstractC0408k {
    /* JADX INFO: renamed from: A0 */
    public static List m993A0(InterfaceC0405h interfaceC0405h) {
        AbstractC0307g.m703e(interfaceC0405h, "<this>");
        Iterator it = interfaceC0405h.iterator();
        if (!it.hasNext()) {
            return C0190u.f401a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0040p.m82F(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y0 */
    public static C0403f m994y0(C0180k c0180k, InterfaceC0286l interfaceC0286l) {
        C0411n c0411n = C0411n.f911i;
        return new C0403f(c0180k, interfaceC0286l);
    }

    /* JADX INFO: renamed from: z0 */
    public static C0402e m995z0(C0402e c0402e, InterfaceC0286l interfaceC0286l) {
        return new C0402e(new C0403f(c0402e, interfaceC0286l), false, C0410m.f910a);
    }
}
