package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: Lx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0513Lx extends AbstractC0148Dc {
    /* JADX INFO: renamed from: A */
    public static Set m996A(Set set, Set set2) {
        if (set2.isEmpty()) {
            return AbstractC2453ra.m4909s0(set);
        }
        if (!(set2 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(set2);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!set2.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: B */
    public static Set m997B(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C0538Mf.f1751a;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2598uq.m5109K(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
