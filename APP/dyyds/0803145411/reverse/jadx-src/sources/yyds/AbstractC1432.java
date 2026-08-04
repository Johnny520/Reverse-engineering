package yyds;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: yyds.ᛶᲁᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1432 extends AbstractC0405 {
    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static void m2926(List list, InterfaceC1549 interfaceC1549) {
        int iM4850;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC0527) && !(list instanceof InterfaceC1654)) {
                AbstractC0395.m1141(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) interfaceC1549.mo371(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int iM48502 = AbstractC2725.m4850(list);
        int i = 0;
        if (iM48502 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) interfaceC1549.mo371(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM48502) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iM4850 = AbstractC2725.m4850(list))) {
            return;
        }
        while (true) {
            list.remove(iM4850);
            if (iM4850 == i) {
                return;
            } else {
                iM4850--;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static void m2927(AbstractCollection abstractCollection, Object[] objArr) {
        abstractCollection.addAll(Arrays.asList(objArr));
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static void m2928(Iterable iterable, AbstractCollection abstractCollection) {
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
