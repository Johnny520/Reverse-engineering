package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r01 extends s01 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static List m3372x(p01 p01Var) {
        Iterator it = p01Var.iterator();
        if (!it.hasNext()) {
            return C0294hs.f2354d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return o30.m2782v(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
