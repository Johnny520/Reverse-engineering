package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Ax */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0040Ax extends AbstractC0083Bx {
    /* JADX INFO: renamed from: I */
    public static List m59I(InterfaceC2777yx interfaceC2777yx) {
        Iterator it = interfaceC2777yx.iterator();
        if (!it.hasNext()) {
            return C0452Kf.f1484a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
