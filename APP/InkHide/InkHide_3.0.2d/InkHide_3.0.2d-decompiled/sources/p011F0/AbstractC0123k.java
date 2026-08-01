package p011F0;

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
import p006D.AbstractC0079h;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: F0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0123k extends AbstractC0129q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static Set m264A0(Collection collection) {
        AbstractC0223g.m418e(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static Set m265B0(Collection collection) {
        C0133u c0133u = C0133u.f428a;
        int size = collection.size();
        if (size == 0) {
            return c0133u;
        }
        if (size == 1) {
            return AbstractC0079h.m175T(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0134v.m294Y(collection.size()));
        m279u0(collection, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static ArrayList m266h0(List list) {
        AbstractC0223g.m418e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static Object m267i0(List list) {
        AbstractC0223g.m418e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static Object m268j0(List list) {
        AbstractC0223g.m418e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static Object m269k0(List list, int i2) {
        AbstractC0223g.m418e(list, "<this>");
        if (i2 < 0 || i2 > AbstractC0124l.m285Y(list)) {
            return null;
        }
        return list.get(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static final void m270l0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC0204l interfaceC0204l) {
        AbstractC0223g.m418e(iterable, "<this>");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            AbstractC0079h.m180d(sb, obj, interfaceC0204l);
        }
        sb.append(charSequence3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public static String m271m0(Iterable iterable, String str, String str2, String str3, InterfaceC0204l interfaceC0204l, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i2 & 2) != 0 ? "" : str2;
        String str6 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            interfaceC0204l = null;
        }
        AbstractC0223g.m418e(iterable, "<this>");
        StringBuilder sb = new StringBuilder();
        m270l0(iterable, sb, str4, str5, str6, "...", interfaceC0204l);
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static ArrayList m272n0(Collection collection, String str) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(str);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static ArrayList m273o0(Collection collection, Collection collection2) {
        AbstractC0223g.m418e(collection2, "elements");
        ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static ArrayList m274p0(List list, Object[] objArr) {
        AbstractC0223g.m418e(objArr, "elements");
        ArrayList arrayList = new ArrayList(list.size() + objArr.length);
        arrayList.addAll(list);
        AbstractC0129q.m292f0(arrayList, objArr);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static List m275q0(Iterable iterable) {
        AbstractC0223g.m418e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM284z0 = m284z0(iterable);
            if (((ArrayList) listM284z0).size() > 1) {
                Collections.sort(listM284z0);
            }
            return listM284z0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m281w0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        AbstractC0223g.m418e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC0120h.m252Z(array);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static List m276r0(Collection collection, Comparator comparator) {
        AbstractC0223g.m418e(collection, "<this>");
        if (collection.size() <= 1) {
            return m281w0(collection);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC0223g.m418e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC0120h.m252Z(array);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static List m277s0(Iterable iterable, int i2) {
        Object next;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        C0131s c0131s = C0131s.f426a;
        if (i2 == 0) {
            return c0131s;
        }
        if (i2 >= ((Collection) iterable).size()) {
            return m281w0(iterable);
        }
        if (i2 == 1) {
            if (iterable instanceof List) {
                next = m267i0((List) iterable);
            } else {
                Iterator it = iterable.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                next = it.next();
            }
            return AbstractC0079h.m167E(next);
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : AbstractC0079h.m167E(arrayList.get(0)) : c0131s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public static byte[] m278t0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bArr[i2] = ((Number) it.next()).byteValue();
            i2++;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static final void m279u0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC0223g.m418e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static int[] m280v0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static List m281w0(Iterable iterable) {
        AbstractC0223g.m418e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        C0131s c0131s = C0131s.f426a;
        if (!z2) {
            List listM284z0 = m284z0(iterable);
            ArrayList arrayList = (ArrayList) listM284z0;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? listM284z0 : AbstractC0079h.m167E(arrayList.get(0)) : c0131s;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0131s;
        }
        if (size2 != 1) {
            return m283y0(collection);
        }
        return AbstractC0079h.m167E(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static long[] m282x0(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static ArrayList m283y0(Collection collection) {
        AbstractC0223g.m418e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static final List m284z0(Iterable iterable) {
        AbstractC0223g.m418e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m283y0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m279u0(iterable, arrayList);
        return arrayList;
    }
}
