package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j20 extends k20 {
    /* JADX INFO: renamed from: I */
    public static List m1545I(i20 i20Var) {
        Iterator it = i20Var.iterator();
        if (!it.hasNext()) {
            return C0931yi.f5342a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0346ip.m1469C(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
