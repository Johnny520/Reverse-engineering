package p185m8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1064u0;

/* JADX INFO: renamed from: m8.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5070c0 extends AbstractC5067b0 {
    /* JADX INFO: renamed from: E */
    public static boolean m20492E(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m20493F(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        return collection.addAll(AbstractC5102r.m20652d(objArr));
    }

    /* JADX INFO: renamed from: G */
    public static final Collection m20494G(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? (Collection) iterable : AbstractC5081g0.m20554X0(iterable);
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m20495H(Iterable iterable, InterfaceC0184l interfaceC0184l, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC0184l.mo27m(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m20496I(List list, InterfaceC0184l interfaceC0184l, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            list.getClass();
            return m20495H(AbstractC1064u0.m3854b(list), interfaceC0184l, z10);
        }
        int iM20802q = AbstractC5114x.m20802q(list);
        if (iM20802q >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) interfaceC0184l.mo27m(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iM20802q) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iM20802q2 = AbstractC5114x.m20802q(list);
        if (i10 > iM20802q2) {
            return true;
        }
        while (true) {
            list.remove(iM20802q2);
            if (iM20802q2 == i10) {
                return true;
            }
            iM20802q2--;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m20497J(List list, InterfaceC0184l interfaceC0184l) {
        list.getClass();
        interfaceC0184l.getClass();
        return m20496I(list, interfaceC0184l, true);
    }

    /* JADX INFO: renamed from: K */
    public static Object m20498K(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    /* JADX INFO: renamed from: L */
    public static Object m20499L(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC5114x.m20802q(list));
    }

    /* JADX INFO: renamed from: M */
    public static Object m20500M(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(AbstractC5114x.m20802q(list));
    }
}
