package tf;

import gg.AbstractC1428x;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p085fg.InterfaceC1231l;
import p114hg.InterfaceC1711a;
import p114hg.InterfaceC1712b;

/* JADX INFO: renamed from: tf.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4171r extends AbstractC4170q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    public static void m8432h1(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public static boolean m8433i1(InterfaceC1231l interfaceC1231l, List list) {
        int i9;
        list.getClass();
        boolean z9 = false;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC1711a) && !(list instanceof InterfaceC1712b)) {
                AbstractC1428x.m3841f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) interfaceC1231l.invoke(it.next())).booleanValue()) {
                    it.remove();
                    z9 = true;
                }
            }
            return z9;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            i9 = 0;
            while (true) {
                Object obj = list.get(i10);
                if (!((Boolean) interfaceC1231l.invoke(obj)).booleanValue()) {
                    if (i9 != i10) {
                        list.set(i9, obj);
                    }
                    i9++;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        } else {
            i9 = 0;
        }
        if (i9 >= list.size()) {
            return false;
        }
        int size2 = list.size() - 1;
        if (i9 <= size2) {
            while (true) {
                list.remove(size2);
                if (size2 == i9) {
                    break;
                }
                size2--;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j1 */
    public static Object m8434j1(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }
}
