package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wo2 extends xo2 {
    /* JADX INFO: renamed from: T */
    public static List m5947T(uo2 uo2Var) {
        Iterator it = uo2Var.iterator();
        if (!it.hasNext()) {
            return be0.f819h;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0179eu.m1434O(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
