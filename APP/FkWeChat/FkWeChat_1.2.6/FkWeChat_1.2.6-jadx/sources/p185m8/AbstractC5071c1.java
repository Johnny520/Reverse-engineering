package p185m8;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: m8.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5071c1 extends AbstractC5068b1 {
    /* JADX INFO: renamed from: j */
    public static Set m20501j(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> collectionM20494G = AbstractC5070c0.m20494G(iterable);
        if (collectionM20494G.isEmpty()) {
            return AbstractC5081g0.m20564c1(set);
        }
        if (!(collectionM20494G instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM20494G);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionM20494G).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: k */
    public static Set m20502k(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5107t0.m20763e(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && AbstractC1061t.m3842c(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: l */
    public static Set m20503l(Set set, Iterable iterable) {
        int size;
        set.getClass();
        iterable.getClass();
        Integer numM20812A = AbstractC5116y.m20812A(iterable);
        if (numM20812A != null) {
            size = set.size() + numM20812A.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5107t0.m20763e(size));
        linkedHashSet.addAll(set);
        AbstractC5070c0.m20492E(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: m */
    public static Set m20504m(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5107t0.m20763e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
