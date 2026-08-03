package p000a;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: a.s3 */
/* JADX INFO: loaded from: classes.dex */
public class C0815s3 extends C0796r3 {
    /* JADX INFO: renamed from: h0 */
    public static void m1886h0(AbstractCollection abstractCollection, Collection collection) {
        C0631i9.m1482e(collection, "elements");
        abstractCollection.addAll(collection);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m1887i0(List list, InterfaceC0064D7 interfaceC0064D7) {
        int iM1756c0;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC0783q9) && !(list instanceof InterfaceC0802r9)) {
                C0198Kf.m550c(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) interfaceC0064D7.mo53f(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int iM1756c02 = C0739o3.m1756c0(list);
        int i = 0;
        if (iM1756c02 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) interfaceC0064D7.mo53f(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM1756c02) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iM1756c0 = C0739o3.m1756c0(list))) {
            return;
        }
        while (true) {
            list.remove(iM1756c0);
            if (iM1756c0 == i) {
                return;
            } else {
                iM1756c0--;
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m1888j0(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
