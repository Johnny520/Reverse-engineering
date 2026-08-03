package p000;

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

/* JADX INFO: renamed from: ra */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2453ra extends AbstractC2711xa {
    /* JADX INFO: renamed from: g0 */
    public static boolean m4897g0(Collection collection, Object obj) {
        int iIndexOf;
        if (collection != null) {
            return collection.contains(obj);
        }
        if (!(collection instanceof List)) {
            Iterator it = collection.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    AbstractC2496sa.m4978c0();
                    throw null;
                }
                if (AbstractC0585Nj.m1134a(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) collection).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    /* JADX INFO: renamed from: h0 */
    public static Object m4898h0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m4899i0(Iterable iterable, StringBuilder sb, String str, CharSequence charSequence, CharSequence charSequence2, InterfaceC1416fj interfaceC1416fj) {
        sb.append(charSequence);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC0671Pj.m1344b(sb, obj, interfaceC1416fj);
        }
        sb.append(charSequence2);
    }

    /* JADX INFO: renamed from: k0 */
    public static String m4901k0(Iterable iterable, String str, String str2, String str3, InterfaceC1416fj interfaceC1416fj, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            interfaceC1416fj = null;
        }
        InterfaceC1416fj interfaceC1416fj2 = interfaceC1416fj;
        StringBuilder sb = new StringBuilder();
        m4899i0(iterable, sb, str, str2, str3, interfaceC1416fj2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l0 */
    public static Object m4902l0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC2496sa.m4976a0(list));
    }

    /* JADX INFO: renamed from: m0 */
    public static Object m4903m0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: n0 */
    public static List m4904n0(List list, Comparator comparator) {
        ArrayList arrayList;
        if (list != null) {
            if (list.size() <= 1) {
                return m4908r0(list);
            }
            Object[] array = list.toArray(new Object[0]);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return Arrays.asList(array);
        }
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
            m4906p0(list, arrayList);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList, comparator);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o0 */
    public static List m4905o0(int i, List list) {
        Object next;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Requested element count ", " is less than zero.").toString());
        }
        C0452Kf c0452Kf = C0452Kf.f1484a;
        if (i == 0) {
            return c0452Kf;
        }
        if (list != null) {
            if (i >= list.size()) {
                return m4908r0(list);
            }
            if (i == 1) {
                if (list != null) {
                    next = m4898h0(list);
                } else {
                    Iterator it = list.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    next = it.next();
                }
                return Collections.singletonList(next);
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : Collections.singletonList(arrayList.get(0)) : c0452Kf;
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m4906p0(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static int[] m4907q0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: r0 */
    public static List m4908r0(Iterable iterable) {
        ArrayList arrayList;
        boolean z = iterable instanceof Collection;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        if (!z) {
            if (z) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                m4906p0(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : Collections.singletonList(arrayList.get(0)) : c0452Kf;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0452Kf;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: s0 */
    public static Set m4909s0(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return C0538Mf.f1751a;
        }
        if (size == 1) {
            return Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2598uq.m5109K(collection.size()));
        m4906p0(collection, linkedHashSet);
        return linkedHashSet;
    }
}
