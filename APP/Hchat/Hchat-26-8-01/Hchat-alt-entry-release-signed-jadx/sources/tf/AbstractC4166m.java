package tf;

import ac.AbstractC0063p;
import gg.AbstractC1416l;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p015b0.C0136d0;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p172lg.C2564d;

/* JADX INFO: renamed from: tf.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4166m extends AbstractC4171r {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A1 */
    public static String m8392A1(Iterable iterable, CharSequence charSequence, String str, String str2, InterfaceC1231l interfaceC1231l, int i9) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i9 & 2) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        String str4 = (i9 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        if ((i9 & 32) != 0) {
            interfaceC1231l = null;
        }
        iterable.getClass();
        StringBuilder sb2 = new StringBuilder();
        m8427y1(iterable, sb2, charSequence2, str3, str4, "...", interfaceC1231l);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B1 */
    public static Object m8393B1(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        C2104o.m5287l("List is empty.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C1 */
    public static Object m8394C1(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D1 */
    public static Comparable m8395D1(Iterable iterable) {
        Iterator it = iterable.iterator();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E1 */
    public static Object m8396E1(ArrayList arrayList, Comparator comparator) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F1 */
    public static ArrayList m8397F1(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC4171r.m8432h1(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G1 */
    public static ArrayList m8398G1(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H1 */
    public static Object m8399H1(List list) {
        int size = list.size();
        if (size == 0) {
            C2104o.m5287l("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        C2104o.m5294t("List has more than one element.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I1 */
    public static Object m8400I1(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J1 */
    public static List m8401J1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM8410S1 = m8410S1(iterable);
            AbstractC4170q.m8430f1(listM8410S1);
            return listM8410S1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m8407P1(iterable);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K1 */
    public static List m8402K1(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM8410S1 = m8410S1(iterable);
            AbstractC4170q.m8431g1(listM8410S1, comparator);
            return listM8410S1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m8407P1(iterable);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L1 */
    public static List m8403L1(int i9, Iterable iterable) {
        iterable.getClass();
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i9 == 0) {
            return C4173t.f13710g;
        }
        if (iterable instanceof Collection) {
            if (i9 >= ((Collection) iterable).size()) {
                return m8407P1(iterable);
            }
            if (i9 == 1) {
                return AbstractC0000a.m99x0(m8421s1(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i9);
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i9) {
                break;
            }
        }
        return AbstractC0000a.m12G0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M1 */
    public static List m8404M1(int i9, List list) {
        list.getClass();
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i9 == 0) {
            return C4173t.f13710g;
        }
        int size = list.size();
        if (i9 >= size) {
            return m8407P1(list);
        }
        if (i9 == 1) {
            return AbstractC0000a.m99x0(m8393B1(list));
        }
        ArrayList arrayList = new ArrayList(i9);
        if (list instanceof RandomAccess) {
            for (int i10 = size - i9; i10 < size; i10++) {
                arrayList.add(list.get(i10));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i9);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N1 */
    public static void m8405N1(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O1 */
    public static int[] m8406O1(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Number) it.next()).intValue();
            i9++;
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P1 */
    public static List m8407P1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return AbstractC0000a.m12G0(m8410S1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C4173t.f13710g;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return AbstractC0000a.m99x0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q1 */
    public static long[] m8408Q1(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            jArr[i9] = ((Number) it.next()).longValue();
            i9++;
        }
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R1 */
    public static ArrayList m8409R1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S1 */
    public static final List m8410S1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m8405N1(iterable, arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T1 */
    public static Set m8411T1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m8405N1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U1 */
    public static Set m8412U1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return AbstractC0063p.m404N(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4178y.m8438a0(collection.size()));
                m8405N1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m8405N1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : AbstractC0063p.m404N(linkedHashSet2.iterator().next());
            }
        }
        return C4175v.f13712g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public static final int m8413k1(int i9, List list) {
        if (i9 >= 0 && i9 <= list.size() - 1) {
            return (list.size() - 1) - i9;
        }
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Element index ", " must be in range [");
        sbM2257t.append(new C2564d(0, list.size() - 1, 1));
        sbM2257t.append("].");
        throw new IndexOutOfBoundsException(sbM2257t.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public static final int m8414l1(int i9, List list) {
        if (i9 >= 0 && i9 <= list.size()) {
            return list.size() - i9;
        }
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Position index ", " must be in range [");
        sbM2257t.append(new C2564d(0, list.size(), 1));
        sbM2257t.append("].");
        throw new IndexOutOfBoundsException(sbM2257t.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public static C0795n m8415m1(Iterable iterable) {
        iterable.getClass();
        return new C0795n(iterable, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public static ArrayList m8416n1(int i9, List list) {
        list.getClass();
        if (i9 <= 0 || i9 <= 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "size ", " must be greater than zero."));
            return null;
        }
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            it.getClass();
            Iterator itM3175B = !it.hasNext() ? C4172s.f13709g : AbstractC1184v0.m3175B(new C4158e0(i9, i9, it, null));
            while (itM3175B.hasNext()) {
                arrayList.add((List) itM3175B.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i9) + (size % i9 == 0 ? 0 : 1));
        int i10 = 0;
        while (i10 >= 0 && i10 < size) {
            int i11 = size - i10;
            if (i9 <= i11) {
                i11 = i9;
            }
            ArrayList arrayList3 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList3.add(list.get(i12 + i10));
            }
            arrayList2.add(arrayList3);
            i10 += i9;
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public static boolean m8417o1(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i9 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i9 < 0) {
                    AbstractC0000a.m32Q0();
                    throw null;
                }
                if (AbstractC1416l.m3825a(obj, next)) {
                    iIndexOf = i9;
                    break;
                }
                i9++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p1 */
    public static List m8418p1(Iterable iterable) {
        iterable.getClass();
        return m8407P1(m8411T1(iterable));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public static List m8419q1(int i9, Iterable iterable) {
        ArrayList arrayList;
        Object objM8393B1;
        iterable.getClass();
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i9 == 0) {
            return m8407P1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i9;
            if (size <= 0) {
                return C4173t.f13710g;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objM8393B1 = m8393B1((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        C2104o.m5287l("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objM8393B1 = next;
                }
                return AbstractC0000a.m99x0(objM8393B1);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i9 < size2) {
                        arrayList.add(list.get(i9));
                        i9++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i9);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i10 = 0;
        for (Object obj : iterable) {
            if (i10 >= i9) {
                arrayList.add(obj);
            } else {
                i10++;
            }
        }
        return AbstractC0000a.m12G0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r1 */
    public static List m8420r1(int i9, List list) {
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested element count ", " is less than zero."));
            return null;
        }
        int size = list.size() - i9;
        if (size < 0) {
            size = 0;
        }
        return m8403L1(size, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s1 */
    public static Object m8421s1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return m8422t1((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        C2104o.m5287l("Collection is empty.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t1 */
    public static Object m8422t1(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        C2104o.m5287l("List is empty.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u1 */
    public static Object m8423u1(Iterable iterable) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v1 */
    public static Object m8424v1(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w1 */
    public static Object m8425w1(int i9, List list) {
        list.getClass();
        if (i9 < 0 || i9 >= list.size()) {
            return null;
        }
        return list.get(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x1 */
    public static LinkedHashSet m8426x1(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionM8407P1 = iterable2 instanceof Collection ? (Collection) iterable2 : m8407P1(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionM8407P1.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y1 */
    public static final void m8427y1(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC1231l interfaceC1231l) {
        iterable.getClass();
        sb2.append(charSequence2);
        int i9 = 0;
        for (Object obj : iterable) {
            i9++;
            if (i9 > 1) {
                sb2.append(charSequence);
            }
            AbstractC0063p.m413f(sb2, obj, interfaceC1231l);
        }
        sb2.append(charSequence3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m8428z1(List list, StringBuilder sb2, String str, C0136d0 c0136d0, int i9) {
        if ((i9 & 64) != 0) {
            c0136d0 = null;
        }
        m8427y1(list, sb2, str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "...", c0136d0);
    }
}
