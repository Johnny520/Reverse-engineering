package Yue;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۡۨۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
public class C7388 extends C7387 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final <T> Set<T> m23138(@InterfaceC6399 Set<? extends T> set, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(set, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C3885.m10788(linkedHashSet, interfaceC7326);
        return linkedHashSet;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final <T> Set<T> m23139(@InterfaceC6399 Set<? extends T> set, @InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(set, "<this>");
        C5499.m17103(iterable, "elements");
        Collection<?> collectionM10774 = C3885.m10774(iterable);
        if (collectionM10774.isEmpty()) {
            return C3888.m11067(set);
        }
        if (!(collectionM10774 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM10774);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t : set) {
            if (!collectionM10774.contains(t)) {
                linkedHashSet2.add(t);
            }
        }
        return linkedHashSet2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final <T> Set<T> m23140(@InterfaceC6399 Set<? extends T> set, T t) {
        C5499.m17103(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C5942.m18568(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && C5499.m17094(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final <T> Set<T> m23141(@InterfaceC6399 Set<? extends T> set, @InterfaceC6399 T[] tArr) {
        C5499.m17103(set, "<this>");
        C5499.m17103(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C3885.m10791(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final <T> Set<T> m23142(Set<? extends T> set, T t) {
        C5499.m17103(set, "<this>");
        return m23140(set, t);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <T> Set<T> m23143(@InterfaceC6399 Set<? extends T> set, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(set, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C5942.m18568(set.size() * 2));
        linkedHashSet.addAll(set);
        C3885.m10771(linkedHashSet, interfaceC7326);
        return linkedHashSet;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static <T> Set<T> m23144(@InterfaceC6399 Set<? extends T> set, @InterfaceC6399 Iterable<? extends T> iterable) {
        int size;
        C5499.m17103(set, "<this>");
        C5499.m17103(iterable, "elements");
        Integer numM10757 = C3881.m10757(iterable);
        if (numM10757 != null) {
            size = set.size() + numM10757.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C5942.m18568(size));
        linkedHashSet.addAll(set);
        C3885.m10772(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <T> Set<T> m23145(@InterfaceC6399 Set<? extends T> set, T t) {
        C5499.m17103(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C5942.m18568(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final <T> Set<T> m23146(@InterfaceC6399 Set<? extends T> set, @InterfaceC6399 T[] tArr) {
        C5499.m17103(set, "<this>");
        C5499.m17103(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C5942.m18568(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        C3885.m10773(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final <T> Set<T> m23147(Set<? extends T> set, T t) {
        C5499.m17103(set, "<this>");
        return m23145(set, t);
    }
}
