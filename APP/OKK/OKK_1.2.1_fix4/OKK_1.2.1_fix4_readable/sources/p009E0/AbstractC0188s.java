package p009E0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0317q;
import p033R0.InterfaceC0319a;
import p033R0.InterfaceC0320b;

/* JADX INFO: renamed from: E0.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0188s extends AbstractC0187r {
    /* JADX INFO: renamed from: m0 */
    public static void m561m0(ArrayList arrayList, Object[] objArr) {
        arrayList.addAll(AbstractC0179j.m530g0(objArr));
    }

    /* JADX INFO: renamed from: n0 */
    public static void m562n0(List list, InterfaceC0286l interfaceC0286l) {
        int iM555g0;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC0319a) && !(list instanceof InterfaceC0320b)) {
                AbstractC0317q.m715d(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) interfaceC0286l.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int iM555g02 = AbstractC0182m.m555g0(list);
        int i2 = 0;
        if (iM555g02 >= 0) {
            int i3 = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) interfaceC0286l.invoke(obj)).booleanValue()) {
                    if (i3 != i2) {
                        list.set(i3, obj);
                    }
                    i3++;
                }
                if (i2 == iM555g02) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = i3;
        }
        if (i2 >= list.size() || i2 > (iM555g0 = AbstractC0182m.m555g0(list))) {
            return;
        }
        while (true) {
            list.remove(iM555g0);
            if (iM555g0 == i2) {
                return;
            } else {
                iM555g0--;
            }
        }
    }
}
