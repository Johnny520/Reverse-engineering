package p000a;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: a.t3 */
/* JADX INFO: loaded from: classes.dex */
public class C0834t3 extends C0815s3 {
    /* JADX INFO: renamed from: A0 */
    public static <T> Set<T> m1946A0(Iterable<? extends T> iterable) {
        C0495b6 c0495b6 = C0495b6.f1840a;
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return c0495b6;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(C0480aa.m1169C(collection.size()));
            m1956t0(iterable, linkedHashSet);
            return linkedHashSet;
        }
        Set<T> setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        C0631i9.m1481d(setSingleton, "singleton(...)");
        return setSingleton;
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m1947k0(Iterable iterable, Serializable serializable) {
        int iIndexOf;
        C0631i9.m1482e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(serializable);
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
                    throw new ArithmeticException("Index overflow has happened.");
                }
                if (C0631i9.m1478a(serializable, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(serializable);
        }
        return iIndexOf >= 0;
    }

    /* JADX INFO: renamed from: l0 */
    public static Object m1948l0(Collection collection) {
        if (collection instanceof List) {
            return m1949m0((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX INFO: renamed from: m0 */
    public static <T> T m1949m0(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: n0 */
    public static <T> T m1950n0(List<? extends T> list) {
        C0631i9.m1482e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: o0 */
    public static <T> T m1951o0(List<? extends T> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: p0 */
    public static String m1952p0(Collection collection, String str, InterfaceC0064D7 interfaceC0064D7, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            interfaceC0064D7 = null;
        }
        C0631i9.m1482e(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : collection) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            C0726n9.m1662e(sb, obj, interfaceC0064D7);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q0 */
    public static ArrayList m1953q0(List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static List m1954r0(ArrayList arrayList, Comparator comparator) {
        if (arrayList.size() <= 1) {
            return m1959w0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        C0631i9.m1482e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        C0631i9.m1481d(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX INFO: renamed from: s0 */
    public static List m1955s0(int i, Collection collection) {
        if (i < 0) {
            throw new IllegalArgumentException(C0944z.m2223c(i, "Requested element count ", " is less than zero.").toString());
        }
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (i == 0) {
            return c0439y5;
        }
        if (i >= collection.size()) {
            return m1959w0(collection);
        }
        if (i == 1) {
            return C0889w1.m2124K(m1948l0(collection));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : C0889w1.m2124K(arrayList.get(0)) : c0439y5;
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m1956t0(Iterable iterable, AbstractCollection abstractCollection) {
        C0631i9.m1482e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static HashSet m1957u0(ArrayList arrayList) {
        HashSet hashSet = new HashSet(C0480aa.m1169C(C0758p3.m1800g0(arrayList, 12)));
        m1956t0(arrayList, hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: v0 */
    public static int[] m1958v0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: w0 */
    public static <T> List<T> m1959w0(Iterable<? extends T> iterable) {
        C0631i9.m1482e(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        if (!z) {
            List<T> listM1962z0 = m1962z0(iterable);
            ArrayList arrayList = (ArrayList) listM1962z0;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? listM1962z0 : C0889w1.m2124K(arrayList.get(0)) : c0439y5;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0439y5;
        }
        if (size2 != 1) {
            return m1961y0(collection);
        }
        return C0889w1.m2124K(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: x0 */
    public static long[] m1960x0(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: y0 */
    public static ArrayList m1961y0(Collection collection) {
        C0631i9.m1482e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: z0 */
    public static final <T> List<T> m1962z0(Iterable<? extends T> iterable) {
        C0631i9.m1482e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m1961y0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m1956t0(iterable, arrayList);
        return arrayList;
    }
}
