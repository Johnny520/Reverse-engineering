package p061L2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: L2.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0974n extends AbstractC2352g {
    /* JADX INFO: renamed from: K */
    public static int m2029K(Iterable iterable, int i5) {
        AbstractC1665j.m2985e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i5;
    }

    /* JADX INFO: renamed from: L */
    public static ArrayList m2030L(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0978r.m2032N((Iterable) it.next(), arrayList2);
        }
        return arrayList2;
    }
}
