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
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: du */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0142du extends AbstractC0325iu {
    /* JADX INFO: renamed from: A0 */
    public static List m1143A0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM1151I0 = m1151I0(iterable);
            AbstractC0290hu.m2231f0(listM1151I0, comparator);
            return listM1151I0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m1148F0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: B0 */
    public static List m1144B0(int i, List list) {
        Object next = null;
        if (i < 0) {
            C0676s.m4645c(hk1.m2208g(i, "Requested element count ", " is less than zero."));
            return null;
        }
        be0 be0Var = be0.f819h;
        if (i == 0) {
            return be0Var;
        }
        if (i >= list.size()) {
            return m1148F0(list);
        }
        if (i == 1) {
            list.getClass();
            if (list instanceof List) {
                next = m1159o0(list);
            } else {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    um2.m5519i("Collection is empty.");
                }
            }
            return AbstractC0179eu.m1434O(next);
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
        return size != 0 ? size != 1 ? arrayList : AbstractC0179eu.m1434O(arrayList.get(0)) : be0Var;
    }

    /* JADX INFO: renamed from: C0 */
    public static List m1145C0(int i, List list) {
        if (i < 0) {
            C0676s.m4645c(hk1.m2208g(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return be0.f819h;
        }
        int size = list.size();
        if (i >= size) {
            return m1148F0(list);
        }
        if (i == 1) {
            return AbstractC0179eu.m1434O(m1166v0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m1146D0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static int[] m1147E0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: F0 */
    public static List m1148F0(Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        be0 be0Var = be0.f819h;
        if (!z) {
            List listM1151I0 = m1151I0(iterable);
            ArrayList arrayList = (ArrayList) listM1151I0;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? listM1151I0 : AbstractC0179eu.m1434O(arrayList.get(0)) : be0Var;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return be0Var;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return AbstractC0179eu.m1434O(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: G0 */
    public static long[] m1149G0(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: H0 */
    public static ArrayList m1150H0(List list) {
        list.getClass();
        return new ArrayList(list);
    }

    /* JADX INFO: renamed from: I0 */
    public static final List m1151I0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m1146D0(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: J0 */
    public static Set m1152J0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m1146D0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: K0 */
    public static Set m1153K0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return t11.m5065Q(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(xe1.m6103U(collection.size()));
                m1146D0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m1146D0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : t11.m5065Q(linkedHashSet2.iterator().next());
            }
        }
        return fe0.f2918h;
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m1154j0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbM5695n = vi0.m5695n(i, "Element index ", " must be in range [");
        sbM5695n.append(new c11(0, list.size() - 1, 1));
        sbM5695n.append("].");
        throw new IndexOutOfBoundsException(sbM5695n.toString());
    }

    /* JADX INFO: renamed from: k0 */
    public static final int m1155k0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM5695n = vi0.m5695n(i, "Position index ", " must be in range [");
        sbM5695n.append(new c11(0, list.size(), 1));
        sbM5695n.append("].");
        throw new IndexOutOfBoundsException(sbM5695n.toString());
    }

    /* JADX INFO: renamed from: l0 */
    public static ArrayList m1156l0(int i, List list) {
        list.getClass();
        if (i <= 0 || i <= 0) {
            C0676s.m4645c(hk1.m2208g(i, "size ", " must be greater than zero."));
            return null;
        }
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            it.getClass();
            Iterator itM5340B = !it.hasNext() ? ae0.f171h : tp0.m5340B(new or2(i, i, it, null));
            while (itM5340B.hasNext()) {
                arrayList.add((List) itM5340B.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m1157m0(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    AbstractC0179eu.m1447a0();
                    throw null;
                }
                if (t11.m5086l(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    /* JADX INFO: renamed from: n0 */
    public static List m1158n0(Iterable iterable) {
        iterable.getClass();
        return m1148F0(m1152J0(iterable));
    }

    /* JADX INFO: renamed from: o0 */
    public static Object m1159o0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        um2.m5519i("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public static Object m1160p0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public static Object m1161q0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: r0 */
    public static Object m1162r0(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m1163s0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, in0 in0Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC0691se.m4854y(sb, obj, in0Var);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m1164t0(List list, StringBuilder sb, C0792v c0792v, int i) {
        if ((i & 64) != 0) {
            c0792v = null;
        }
        m1163s0(list, sb, "\n", "", "", "...", c0792v);
    }

    /* JADX INFO: renamed from: u0 */
    public static String m1165u0(Iterable iterable, CharSequence charSequence, String str, String str2, in0 in0Var, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            in0Var = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        StringBuilder sb = new StringBuilder();
        m1163s0(iterable, sb, charSequence2, str3, str4, "...", in0Var);
        return sb.toString();
    }

    /* JADX INFO: renamed from: v0 */
    public static Object m1166v0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        um2.m5519i("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public static Object m1167w0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: x0 */
    public static ArrayList m1168x0(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    /* JADX INFO: renamed from: y0 */
    public static ArrayList m1169y0(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: z0 */
    public static List m1170z0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM1151I0 = m1151I0(iterable);
            if (((ArrayList) listM1151I0).size() > 1) {
                Collections.sort(listM1151I0);
            }
            return listM1151I0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m1148F0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }
}
