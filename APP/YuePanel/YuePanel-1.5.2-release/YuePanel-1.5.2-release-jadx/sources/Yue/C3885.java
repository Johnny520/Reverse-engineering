package Yue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3885 extends C3884 {
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static <T> boolean m10771(@InterfaceC6399 Collection<? super T> collection, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        Iterator<? extends T> it = interfaceC7326.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static <T> boolean m10772(@InterfaceC6399 Collection<? super T> collection, @InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static <T> boolean m10773(@InterfaceC6399 Collection<? super T> collection, @InterfaceC6399 T[] tArr) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(tArr, "elements");
        return collection.addAll(C3404.m7069(tArr));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static <T> Collection<T> m10774(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : C3888.m11062(iterable);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final <T> boolean m10775(Iterable<? extends T> iterable, InterfaceC5124<? super T, Boolean> interfaceC5124, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final <T> boolean m10776(List<T> list, InterfaceC5124<? super T, Boolean> interfaceC5124, boolean z) {
        if (!(list instanceof RandomAccess)) {
            C5499.m17101(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m10775(C8012.m25251(list), interfaceC5124, z);
        }
        AbstractC5455 it = new C5458(0, C3880.m10737(list)).iterator();
        int i = 0;
        while (it.hasNext()) {
            int iMo471 = it.mo471();
            T t = list.get(iMo471);
            if (interfaceC5124.invoke(t).booleanValue() != z) {
                if (i != iMo471) {
                    list.set(i, t);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int iM10737 = C3880.m10737(list);
        if (i > iM10737) {
            return true;
        }
        while (true) {
            list.remove(iM10737);
            if (iM10737 == i) {
                return true;
            }
            iM10737--;
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final <T> void m10777(Collection<? super T> collection, InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        m10788(collection, interfaceC7326);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final <T> void m10778(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(iterable, "elements");
        m10789(collection, iterable);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final <T> void m10779(Collection<? super T> collection, T t) {
        C5499.m17103(collection, "<this>");
        collection.remove(t);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final <T> void m10780(Collection<? super T> collection, T[] tArr) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(tArr, "elements");
        m10791(collection, tArr);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final <T> void m10781(Collection<? super T> collection, InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        m10771(collection, interfaceC7326);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final <T> void m10782(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(iterable, "elements");
        m10772(collection, iterable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final <T> void m10783(Collection<? super T> collection, T t) {
        C5499.m17103(collection, "<this>");
        collection.add(t);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final <T> void m10784(Collection<? super T> collection, T[] tArr) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(tArr, "elements");
        m10773(collection, tArr);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8971, message = "Use removeAt(index) instead.", replaceWith = @InterfaceC7097(expression = "removeAt(index)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final <T> T m10785(List<T> list, int i) {
        C5499.m17103(list, "<this>");
        return list.remove(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final <T> boolean m10786(Collection<? extends T> collection, T t) {
        C5499.m17103(collection, "<this>");
        return C8012.m4026(collection).remove(t);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final <T> boolean m10787(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        return m10775(iterable, interfaceC5124, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final <T> boolean m10788(@InterfaceC6399 Collection<? super T> collection, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        List listM23081 = C7342.m23081(interfaceC7326);
        return (listM23081.isEmpty() ^ true) && collection.removeAll(listM23081);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final <T> boolean m10789(@InterfaceC6399 Collection<? super T> collection, @InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(iterable, "elements");
        return collection.removeAll(m10774(iterable));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final <T> boolean m10790(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(collection2, "elements");
        return C8012.m4026(collection).removeAll(collection2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final <T> boolean m10791(@InterfaceC6399 Collection<? super T> collection, @InterfaceC6399 T[] tArr) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(tArr, "elements");
        return ((tArr.length == 0) ^ true) && collection.removeAll(C3404.m7069(tArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final <T> boolean m10792(@InterfaceC6399 List<T> list, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        return m10776(list, interfaceC5124, true);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final <T> T m10793(@InterfaceC6399 List<T> list) {
        C5499.m17103(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final <T> T m10794(@InterfaceC6399 List<T> list) {
        C5499.m17103(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static <T> T m10795(@InterfaceC6399 List<T> list) {
        C5499.m17103(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(C3880.m10737(list));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static <T> T m10796(@InterfaceC6399 List<T> list) {
        C5499.m17103(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C3880.m10737(list));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static <T> boolean m10797(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        return m10775(iterable, interfaceC5124, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final <T> boolean m10798(@InterfaceC6399 Collection<? super T> collection, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        List listM23081 = C7342.m23081(interfaceC7326);
        return listM23081.isEmpty() ^ true ? collection.retainAll(listM23081) : m10803(collection);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final <T> boolean m10799(@InterfaceC6399 Collection<? super T> collection, @InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(iterable, "elements");
        return collection.retainAll(m10774(iterable));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final <T> boolean m10800(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(collection2, "elements");
        return C8012.m4026(collection).retainAll(collection2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final <T> boolean m10801(@InterfaceC6399 Collection<? super T> collection, @InterfaceC6399 T[] tArr) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(tArr, "elements");
        return (tArr.length == 0) ^ true ? collection.retainAll(C3404.m7069(tArr)) : m10803(collection);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <T> boolean m10802(@InterfaceC6399 List<T> list, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        return m10776(list, interfaceC5124, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final boolean m10803(Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }
}
