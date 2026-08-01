package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q20 extends r20 {
    /* JADX INFO: renamed from: J */
    public static List m2111J(p20 p20Var) {
        Iterator it = p20Var.iterator();
        if (!it.hasNext()) {
            return C0020aj.f84a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0493mp.m1872w(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
