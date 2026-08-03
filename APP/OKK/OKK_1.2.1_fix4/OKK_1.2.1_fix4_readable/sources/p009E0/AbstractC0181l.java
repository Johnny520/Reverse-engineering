package p009E0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p001A0.AbstractC0040p;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: E0.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0181l extends AbstractC0188s {
    /* JADX INFO: renamed from: A0 */
    public static ArrayList m541A0(Collection collection) {
        AbstractC0307g.m703e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: B0 */
    public static Set m542B0(ArrayList arrayList) {
        C0192w c0192w = C0192w.f403a;
        int size = arrayList.size();
        if (size == 0) {
            return c0192w;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0193x.m563g0(arrayList.size()));
            m551w0(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(arrayList.get(0));
        AbstractC0307g.m702d(setSingleton, "singleton(...)");
        return setSingleton;
    }

    /* JADX INFO: renamed from: o0 */
    public static List m543o0(List list) {
        AbstractC0307g.m703e(list, "<this>");
        return m553y0(new LinkedHashSet(list));
    }

    /* JADX INFO: renamed from: p0 */
    public static Object m544p0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(0);
    }

    /* JADX INFO: renamed from: q0 */
    public static Object m545q0(List list, int i2) {
        AbstractC0307g.m703e(list, "<this>");
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    /* JADX INFO: renamed from: r0 */
    public static String m546r0(Iterable iterable, String str, String str2, String str3, InterfaceC0286l interfaceC0286l, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            interfaceC0286l = null;
        }
        AbstractC0307g.m703e(iterable, "<this>");
        AbstractC0307g.m703e(str, "separator");
        AbstractC0307g.m703e(str2, "prefix");
        AbstractC0307g.m703e(str3, "postfix");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC0358S.m879c(sb, obj, interfaceC0286l);
        }
        sb.append((CharSequence) str3);
        String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: s0 */
    public static Comparable m547s0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: t0 */
    public static List m548t0(Collection collection, Comparator comparator) {
        if (collection.size() <= 1) {
            return m553y0(collection);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC0307g.m703e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC0179j.m530g0(array);
    }

    /* JADX INFO: renamed from: u0 */
    public static List m549u0(int i2, Collection collection) {
        Object next;
        AbstractC0307g.m703e(collection, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        C0190u c0190u = C0190u.f401a;
        if (i2 == 0) {
            return c0190u;
        }
        if (i2 >= collection.size()) {
            return m553y0(collection);
        }
        if (i2 == 1) {
            if (collection instanceof List) {
                List list = (List) collection;
                if (list.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                next = list.get(0);
            } else {
                Iterator it = collection.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                next = it.next();
            }
            return AbstractC0040p.m82F(next);
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it2 = collection.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : AbstractC0040p.m82F(arrayList.get(0)) : c0190u;
    }

    /* JADX INFO: renamed from: v0 */
    public static List m550v0(ArrayList arrayList, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return C0190u.f401a;
        }
        int size = arrayList.size();
        if (i2 >= size) {
            return m553y0(arrayList);
        }
        if (i2 == 1) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return AbstractC0040p.m82F(arrayList.get(AbstractC0182m.m555g0(arrayList)));
        }
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = size - i2; i3 < size; i3++) {
            arrayList2.add(arrayList.get(i3));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m551w0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC0307g.m703e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static int[] m552x0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: y0 */
    public static List m553y0(Iterable iterable) {
        ArrayList arrayListM541A0;
        AbstractC0307g.m703e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        C0190u c0190u = C0190u.f401a;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return c0190u;
            }
            if (size != 1) {
                return m541A0(collection);
            }
            return AbstractC0040p.m82F(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z2) {
            arrayListM541A0 = m541A0((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            m551w0(iterable, arrayList);
            arrayListM541A0 = arrayList;
        }
        int size2 = arrayListM541A0.size();
        return size2 != 0 ? size2 != 1 ? arrayListM541A0 : AbstractC0040p.m82F(arrayListM541A0.get(0)) : c0190u;
    }

    /* JADX INFO: renamed from: z0 */
    public static long[] m554z0(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }
}
