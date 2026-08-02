package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class np2 extends t11 {
    /* JADX INFO: renamed from: a0 */
    public static LinkedHashSet m3352a0(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(xe1.m6103U(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && t11.m5086l(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b0 */
    public static Set m3353b0(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> collectionM1148F0 = iterable instanceof Collection ? (Collection) iterable : AbstractC0142du.m1148F0(iterable);
        if (collectionM1148F0.isEmpty()) {
            return AbstractC0142du.m1153K0(set);
        }
        if (!(collectionM1148F0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM1148F0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionM1148F0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: c0 */
    public static LinkedHashSet m3354c0(Set set, Iterable iterable) {
        set.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(xe1.m6103U(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC0325iu.m2393g0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: d0 */
    public static LinkedHashSet m3355d0(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(xe1.m6103U(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
