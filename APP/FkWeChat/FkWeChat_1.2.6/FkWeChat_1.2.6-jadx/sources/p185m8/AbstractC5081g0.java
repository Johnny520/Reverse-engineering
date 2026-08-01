package p185m8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p172l8.AbstractC4717x;
import p215oc.C5704b;
import p299ub.AbstractC8635q;
import p376zd.C9987e;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: m8.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5081g0 extends AbstractC5076e0 {

    /* JADX INFO: renamed from: m8.g0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC7282h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterable f15396a;

        public a(Iterable iterable) {
            this.f15396a = iterable;
        }

        @Override // sb.InterfaceC7282h
        public Iterator iterator() {
            return this.f15396a.iterator();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static List m20529A0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionM20494G = AbstractC5070c0.m20494G(iterable2);
        if (collectionM20494G.isEmpty()) {
            return m20554X0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionM20494G.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B0 */
    public static List m20530B0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && AbstractC1061t.m3842c(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C0 */
    public static List m20531C0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof Collection) {
            return m20533E0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC5070c0.m20492E(arrayList, iterable);
        AbstractC5070c0.m20492E(arrayList, iterable2);
        return arrayList;
    }

    /* JADX INFO: renamed from: D0 */
    public static List m20532D0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return m20534F0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC5070c0.m20492E(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: E0 */
    public static List m20533E0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC5070c0.m20492E(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: F0 */
    public static List m20534F0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: G0 */
    public static List m20535G0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m20554X0(iterable);
        }
        List listM20558Z0 = m20558Z0(iterable);
        AbstractC5076e0.m20518V(listM20558Z0);
        return listM20558Z0;
    }

    /* JADX INFO: renamed from: H0 */
    public static Object m20536H0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return m20537I0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        C9987e.m38645a("Collection has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public static Object m20537I0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        C9987e.m38645a("List has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: J0 */
    public static Object m20538J0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* JADX INFO: renamed from: K0 */
    public static Object m20539K0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public static List m20540L0(List list, C2363j c2363j) {
        list.getClass();
        c2363j.getClass();
        return c2363j.isEmpty() ? AbstractC5114x.m20800o() : m20554X0(list.subList(c2363j.m8568v().intValue(), c2363j.m8567u().intValue() + 1));
    }

    /* JADX INFO: renamed from: M0 */
    public static List m20541M0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM20558Z0 = m20558Z0(iterable);
            AbstractC5067b0.m20481C(listM20558Z0);
            return listM20558Z0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m20554X0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC5102r.m20648H((Comparable[]) array);
        return AbstractC5102r.m20652d(array);
    }

    /* JADX INFO: renamed from: N0 */
    public static List m20542N0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (!(iterable instanceof Collection)) {
            List listM20558Z0 = m20558Z0(iterable);
            AbstractC5067b0.m20482D(listM20558Z0, comparator);
            return listM20558Z0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m20554X0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC5102r.m20649I(array, comparator);
        return AbstractC5102r.m20652d(array);
    }

    /* JADX INFO: renamed from: O0 */
    public static int m20543O0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: P0 */
    public static List m20544P0(Iterable iterable, int i10) {
        iterable.getClass();
        if (i10 < 0) {
            C5704b.m23087a("Requested element count ", i10, " is less than zero.");
            return null;
        }
        if (i10 == 0) {
            return AbstractC5114x.m20800o();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return m20554X0(iterable);
            }
            if (i10 == 1) {
                return AbstractC5112w.m20789e(m20575i0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return AbstractC5114x.m20807v(arrayList);
    }

    /* JADX INFO: renamed from: Q0 */
    public static List m20545Q0(List list, int i10) {
        list.getClass();
        if (i10 < 0) {
            C5704b.m23087a("Requested element count ", i10, " is less than zero.");
            return null;
        }
        if (i10 == 0) {
            return AbstractC5114x.m20800o();
        }
        int size = list.size();
        if (i10 >= size) {
            return m20554X0(list);
        }
        if (i10 == 1) {
            return AbstractC5112w.m20789e(m20587u0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R0 */
    public static boolean[] m20546R0(Collection collection) {
        collection.getClass();
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: S0 */
    public static byte[] m20547S0(Collection collection) {
        collection.getClass();
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: T0 */
    public static final Collection m20548T0(Iterable iterable, Collection collection) {
        iterable.getClass();
        collection.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    /* JADX INFO: renamed from: U0 */
    public static float[] m20549U0(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: V0 */
    public static HashSet m20550V0(Iterable iterable) {
        iterable.getClass();
        return (HashSet) m20548T0(iterable, new HashSet(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(iterable, 12))));
    }

    /* JADX INFO: renamed from: W0 */
    public static int[] m20552W0(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: X */
    public static boolean m20553X(Iterable iterable, InterfaceC0184l interfaceC0184l) {
        iterable.getClass();
        interfaceC0184l.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) interfaceC0184l.mo27m(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: X0 */
    public static List m20554X0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return AbstractC5114x.m20807v(m20558Z0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC5114x.m20800o();
        }
        if (size != 1) {
            return m20560a1(collection);
        }
        return AbstractC5112w.m20789e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: Y */
    public static InterfaceC7282h m20555Y(Iterable iterable) {
        iterable.getClass();
        return new a(iterable);
    }

    /* JADX INFO: renamed from: Y0 */
    public static long[] m20556Y0(Collection collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: Z */
    public static List m20557Z(Iterable iterable, int i10) {
        iterable.getClass();
        return m20568e1(iterable, i10, i10, true);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final List m20558Z0(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? m20560a1((Collection) iterable) : (List) m20548T0(iterable, new ArrayList());
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m20559a0(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : m20580n0(iterable, obj) >= 0;
    }

    /* JADX INFO: renamed from: a1 */
    public static List m20560a1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: b0 */
    public static int m20561b0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC5114x.m20809x();
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: b1 */
    public static Set m20562b1(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m20548T0(iterable, new LinkedHashSet());
    }

    /* JADX INFO: renamed from: c0 */
    public static List m20563c0(Iterable iterable) {
        iterable.getClass();
        return m20554X0(m20562b1(iterable));
    }

    /* JADX INFO: renamed from: c1 */
    public static Set m20564c1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return AbstractC5068b1.m20486h((Set) m20548T0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC5068b1.m20483e();
        }
        if (size != 1) {
            return (Set) m20548T0(iterable, new LinkedHashSet(AbstractC5107t0.m20763e(collection.size())));
        }
        return AbstractC5065a1.m20479d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: d0 */
    public static List m20565d0(Iterable iterable, int i10) {
        ArrayList arrayList;
        iterable.getClass();
        if (i10 < 0) {
            C5704b.m23087a("Requested element count ", i10, " is less than zero.");
            return null;
        }
        if (i10 == 0) {
            return m20554X0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return AbstractC5114x.m20800o();
            }
            if (size == 1) {
                return AbstractC5112w.m20789e(m20586t0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return AbstractC5114x.m20807v(arrayList);
    }

    /* JADX INFO: renamed from: d1 */
    public static Set m20566d1(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set setM20562b1 = m20562b1(iterable);
        AbstractC5070c0.m20492E(setM20562b1, iterable2);
        return setM20562b1;
    }

    /* JADX INFO: renamed from: e0 */
    public static List m20567e0(List list, int i10) {
        list.getClass();
        if (i10 >= 0) {
            return m20544P0(list, AbstractC2368o.m8578e(list.size() - i10, 0));
        }
        C5704b.m23087a("Requested element count ", i10, " is less than zero.");
        return null;
    }

    /* JADX INFO: renamed from: e1 */
    public static final List m20568e1(Iterable iterable, int i10, int i11, boolean z10) {
        iterable.getClass();
        AbstractC5074d1.m20514a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM20515b = AbstractC5074d1.m20515b(iterable.iterator(), i10, i11, z10, false);
            while (itM20515b.hasNext()) {
                arrayList.add((List) itM20515b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int iM8582i = AbstractC2368o.m8582i(i10, size - i12);
            if (iM8582i < i10 && !z10) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(iM8582i);
            for (int i13 = 0; i13 < iM8582i; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: f0 */
    public static List m20569f0(Iterable iterable, InterfaceC0184l interfaceC0184l) {
        iterable.getClass();
        interfaceC0184l.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) interfaceC0184l.mo27m(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f1 */
    public static Iterable m20570f1(final Iterable iterable) {
        iterable.getClass();
        return new C5097o0(new InterfaceC0173a() { // from class: m8.f0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC5081g0.m20572g1(iterable);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public static List m20571g0(Iterable iterable) {
        iterable.getClass();
        return (List) m20573h0(iterable, new ArrayList());
    }

    /* JADX INFO: renamed from: g1 */
    public static final Iterator m20572g1(Iterable iterable) {
        return iterable.iterator();
    }

    /* JADX INFO: renamed from: h0 */
    public static final Collection m20573h0(Iterable iterable, Collection collection) {
        iterable.getClass();
        collection.getClass();
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    /* JADX INFO: renamed from: h1 */
    public static List m20574h1(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC5116y.m20814z(iterable, 10), AbstractC5116y.m20814z(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(AbstractC4717x.m18815a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i0 */
    public static Object m20575i0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return m20576j0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX INFO: renamed from: j0 */
    public static Object m20576j0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: k0 */
    public static Object m20577k0(Iterable iterable) {
        iterable.getClass();
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

    /* JADX INFO: renamed from: l0 */
    public static Object m20578l0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: m0 */
    public static Object m20579m0(List list, int i10) {
        list.getClass();
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    /* JADX INFO: renamed from: n0 */
    public static final int m20580n0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                AbstractC5114x.m20810y();
            }
            if (AbstractC1061t.m3842c(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: o0 */
    public static Set m20581o0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionM20494G = AbstractC5070c0.m20494G(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionM20494G.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Appendable m20582p0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) throws IOException {
        iterable.getClass();
        appendable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            AbstractC8635q.m33234a(appendable, obj, interfaceC0184l);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Appendable m20583q0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        CharSequence charSequence5 = (i11 & 2) != 0 ? ", " : charSequence;
        int i12 = i11 & 4;
        CharSequence charSequence6 = _UrlKt.FRAGMENT_ENCODE_SET;
        CharSequence charSequence7 = i12 != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return m20582p0(iterable, appendable, charSequence5, charSequence7, charSequence6, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : interfaceC0184l);
    }

    /* JADX INFO: renamed from: r0 */
    public static final String m20584r0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) {
        iterable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        return ((StringBuilder) m20582p0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC0184l)).toString();
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ String m20585s0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC0184l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        return m20584r0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC0184l2);
    }

    /* JADX INFO: renamed from: t0 */
    public static Object m20586t0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return m20587u0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: u0 */
    public static Object m20587u0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC5114x.m20802q(list));
    }

    /* JADX INFO: renamed from: v0 */
    public static Object m20588v0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: w0 */
    public static Object m20589w0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: x0 */
    public static List m20590x0(Iterable iterable, InterfaceC0184l interfaceC0184l) {
        iterable.getClass();
        interfaceC0184l.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC0184l.mo27m(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y0 */
    public static Comparable m20591y0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: z0 */
    public static Comparable m20592z0(Iterable iterable) {
        iterable.getClass();
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
}
