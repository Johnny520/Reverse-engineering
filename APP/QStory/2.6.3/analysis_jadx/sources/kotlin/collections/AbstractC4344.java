package kotlin.collections;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.lazy.C0750;
import io.ktor.util.C4211;
import java.io.IOException;
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
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;
import p048.C6519;
import p052.InterfaceC6558;
import p054.InterfaceC6566;
import p054.InterfaceC6567;
import p175.AbstractC7739;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4344 extends AbstractC4336 {
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public static List m8777(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM8783 = m8783(iterable);
            if (((ArrayList) listM8783).size() > 1) {
                Collections.sort(listM8783);
            }
            return listM8783;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m8797(iterable);
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

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public static List m8778(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM8783 = m8783(iterable);
            AbstractC4336.m8766(listM8783, comparator);
            return listM8783;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m8797(iterable);
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

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public static Object m8779(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            C4211.m8617("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        C5925.m11310("List has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public static Object m8780(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return m8779((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            C4211.m8617("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        C5925.m11310("Collection has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public static Object m8781(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public static Object m8782(Iterable iterable) {
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

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public static final List m8783(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m8795(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public static Set m8784(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m8795(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public static long[] m8785(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public static ArrayList m8786(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public static C4342 m8787(List list) {
        list.getClass();
        return new C4342(new C1030(list, 20), 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public static Set m8788(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m8795(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : AbstractC7739.m13055(linkedHashSet.iterator().next()) : EmptySet.INSTANCE;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return EmptySet.INSTANCE;
        }
        if (size2 == 1) {
            return AbstractC7739.m13055(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC4339.m8772(collection.size()));
        m8795(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public static ArrayList m8789(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return m8794((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        m8804(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static ArrayList m8790(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof Collection) {
            return m8793(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m8804(iterable, arrayList);
        m8804(iterable2, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public static void m8791(List list, InterfaceC6558 interfaceC6558) {
        int size;
        interfaceC6558.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC6567) && !(list instanceof InterfaceC6566)) {
                AbstractC4388.m8895(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) interfaceC6558.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) interfaceC6558.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public static Object m8792(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        C4211.m8617("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public static ArrayList m8793(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            m8804(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public static ArrayList m8794(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public static final void m8795(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public static byte[] m8796(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public static List m8797(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return AbstractC6347.m11924(m8783(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.INSTANCE;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return AbstractC6347.m11928(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public static int[] m8798(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public static List m8799(int i, List list) {
        list.getClass();
        if (i < 0) {
            C5925.m11314(AbstractC0053.m162(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return EmptyList.INSTANCE;
        }
        if (i >= list.size()) {
            return m8797(list);
        }
        if (i == 1) {
            return AbstractC6347.m11928(m8819(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return AbstractC6347.m11924(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public static List m8800(int i, List list) {
        list.getClass();
        if (i < 0) {
            C5925.m11314(AbstractC0053.m162(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return EmptyList.INSTANCE;
        }
        int size = list.size();
        if (i >= size) {
            return m8797(list);
        }
        if (i == 1) {
            return AbstractC6347.m11928(m8808(list));
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

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public static List m8801(int i, List list) {
        list.getClass();
        if (i < 0) {
            C5925.m11314(AbstractC0053.m162(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return m8799(size, list);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public static Object m8802(Iterable iterable, int i) {
        iterable.getClass();
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        C0750 c0750 = new C0750(i);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            c0750.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            c0750.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        c0750.invoke(Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public static C4346 m8803(Iterable iterable) {
        iterable.getClass();
        return new C4346(iterable, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public static void m8804(Iterable iterable, Collection collection) {
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

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public static List m8805(int i, List list) {
        list.getClass();
        if (i < 0) {
            C5925.m11314(AbstractC0053.m162(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return m8797(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return EmptyList.INSTANCE;
        }
        if (size == 1) {
            return AbstractC6347.m11928(m8807(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public static boolean m8806(Iterable iterable, Object obj) {
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
                    AbstractC6347.m11920();
                    throw null;
                }
                if (AbstractC4395.m8907(obj, next)) {
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

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public static Object m8807(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return m8808((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            C4211.m8617("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static Object m8808(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        C4211.m8617("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public static /* synthetic */ void m8809(Iterable iterable, Appendable appendable, String str, String str2, String str3, InterfaceC6558 interfaceC6558, int i) throws IOException {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            interfaceC6558 = null;
        }
        m8817(iterable, appendable, str4, str5, str6, "...", interfaceC6558);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public static String m8810(Iterable iterable, String str, String str2, String str3, InterfaceC6558 interfaceC6558, int i) throws IOException {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC6558 = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        m8817(iterable, sb, str4, str5, str6, "...", interfaceC6558);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static ArrayList m8811(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && AbstractC4395.m8907(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static Object m8812(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public static final int m8813(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbM150 = AbstractC0053.m150(i, "Element index ", " must be in range [");
        sbM150.append(new C6519(0, list.size() - 1, 1));
        sbM150.append("].");
        throw new IndexOutOfBoundsException(sbM150.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public static final int m8814(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM150 = AbstractC0053.m150(i, "Position index ", " must be in range [");
        sbM150.append(new C6519(0, list.size(), 1));
        sbM150.append("].");
        throw new IndexOutOfBoundsException(sbM150.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public static Object m8815(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public static Object m8816(Iterable iterable) {
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

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public static final void m8817(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC6558 interfaceC6558) throws IOException {
        iterable.getClass();
        appendable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        appendable.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            AbstractC8175.m13650(appendable, obj, interfaceC6558);
        }
        appendable.append(charSequence3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public static Object m8818(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public static Object m8819(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return m8820((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        C4211.m8617("Collection is empty.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public static Object m8820(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        C4211.m8617("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public static ArrayList m8821(List list, List list2) {
        list.getClass();
        list2.getClass();
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC4345.m8822(list, 10), AbstractC4345.m8822(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }
}
