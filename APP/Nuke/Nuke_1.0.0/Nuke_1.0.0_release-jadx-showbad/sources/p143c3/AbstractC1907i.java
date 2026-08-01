package p143c3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p061L2.C0981u;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: c3.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1907i extends AbstractC1908j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static List m3392v(InterfaceC1905g interfaceC1905g) {
        Iterator it = interfaceC1905g.iterator();
        if (!it.hasNext()) {
            return C0981u.f3047d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC2352g.m4211y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
