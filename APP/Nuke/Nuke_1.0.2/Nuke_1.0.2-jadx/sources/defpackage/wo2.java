package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wo2 extends xo2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List T(uo2 uo2Var) {
        Iterator it = uo2Var.iterator();
        if (!it.hasNext()) {
            return be0.h;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return eu.O(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
