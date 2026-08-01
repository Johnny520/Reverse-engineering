package p061L2;

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
import java.util.RandomAccess;
import java.util.Set;
import p000A.C0049a;
import p011B4.AbstractC0231b;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p128a.AbstractC1785a;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: L2.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0973m extends AbstractC0978r {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static double m2008O(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i5++;
            if (i5 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static ArrayList m2009P(int i5, List list) {
        AbstractC1665j.m2985e(list, "<this>");
        if (i5 <= 0 || i5 <= 0) {
            throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "size ", " must be greater than zero.").toString());
        }
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            AbstractC1665j.m2985e(it, "iterator");
            Iterator itM3252m = !it.hasNext() ? C0980t.f3046d : AbstractC1785a.m3252m(new C0960C(i5, i5, it, null));
            while (itM3252m.hasNext()) {
                arrayList.add((List) itM3252m.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i5) + (size % i5 == 0 ? 0 : 1));
        int i6 = 0;
        while (i6 >= 0 && i6 < size) {
            int i7 = size - i6;
            if (i5 <= i7) {
                i7 = i5;
            }
            ArrayList arrayList3 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList3.add(list.get(i8 + i6));
            }
            arrayList2.add(arrayList3);
            i6 += i5;
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static boolean m2010Q(Iterable iterable, Object obj) {
        int iIndexOf;
        AbstractC1665j.m2985e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i5 < 0) {
                    AbstractC2352g.m4187J();
                    throw null;
                }
                if (AbstractC1665j.m2981a(obj, next)) {
                    iIndexOf = i5;
                    break;
                }
                i5++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static List m2011R(ArrayList arrayList) {
        return m2024e0(new LinkedHashSet(arrayList));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static Object m2012S(List list) {
        AbstractC1665j.m2985e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static Object m2013T(List list) {
        AbstractC1665j.m2985e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static final void m2014U(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC1601c interfaceC1601c) {
        AbstractC1665j.m2985e(iterable, "<this>");
        sb.append(charSequence2);
        int i5 = 0;
        for (Object obj : iterable) {
            i5++;
            if (i5 > 1) {
                sb.append(charSequence);
            }
            AbstractC2352g.m4194g(sb, obj, interfaceC1601c);
        }
        sb.append(charSequence3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m2015V(List list, StringBuilder sb, C0049a c0049a, int i5) {
        if ((i5 & 64) != 0) {
            c0049a = null;
        }
        m2014U(list, sb, "\n", "", "", "...", c0049a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static String m2016W(Iterable iterable, String str, String str2, String str3, InterfaceC1601c interfaceC1601c, int i5) {
        if ((i5 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i5 & 2) != 0 ? "" : str2;
        String str6 = (i5 & 4) != 0 ? "" : str3;
        if ((i5 & 32) != 0) {
            interfaceC1601c = null;
        }
        AbstractC1665j.m2985e(iterable, "<this>");
        AbstractC1665j.m2985e(str5, "prefix");
        StringBuilder sb = new StringBuilder();
        m2014U(iterable, sb, str4, str5, str6, "...", interfaceC1601c);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static Object m2017X(List list) {
        AbstractC1665j.m2985e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC2352g.m4208u(list));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static Object m2018Y(List list) {
        AbstractC1665j.m2985e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static ArrayList m2019Z(Collection collection, Iterable iterable) {
        AbstractC1665j.m2985e(collection, "<this>");
        AbstractC1665j.m2985e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC0978r.m2032N(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static ArrayList m2020a0(Collection collection, Object obj) {
        AbstractC1665j.m2985e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static List m2021b0(ArrayList arrayList, Comparator comparator) {
        AbstractC1665j.m2985e(arrayList, "<this>");
        if (arrayList.size() <= 1) {
            return m2024e0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        AbstractC1665j.m2985e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC0972l.m1987K(array);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static final void m2022c0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC1665j.m2985e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static int[] m2023d0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            iArr[i5] = ((Number) it.next()).intValue();
            i5++;
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static List m2024e0(Iterable iterable) {
        AbstractC1665j.m2985e(iterable, "<this>");
        boolean z5 = iterable instanceof Collection;
        C0981u c0981u = C0981u.f3047d;
        if (!z5) {
            List listM2027h0 = m2027h0(iterable);
            ArrayList arrayList = (ArrayList) listM2027h0;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? listM2027h0 : AbstractC2352g.m4211y(arrayList.get(0)) : c0981u;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0981u;
        }
        if (size2 != 1) {
            return m2026g0(collection);
        }
        return AbstractC2352g.m4211y(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static long[] m2025f0(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            jArr[i5] = ((Number) it.next()).longValue();
            i5++;
        }
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static ArrayList m2026g0(Collection collection) {
        AbstractC1665j.m2985e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static final List m2027h0(Iterable iterable) {
        AbstractC1665j.m2985e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m2026g0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m2022c0(iterable, arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static Set m2028i0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C0983w.f3049d;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0984x.m2034F(arrayList.size()));
            m2022c0(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(arrayList.get(0));
        AbstractC1665j.m2984d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
