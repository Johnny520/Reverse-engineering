package p011F0;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p006D.AbstractC0079h;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: F0.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0135w extends AbstractC0079h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static Set m300Y(Set set, Set set2) {
        if (set2.isEmpty()) {
            return AbstractC0123k.m265B0(set);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static LinkedHashSet m301Z(LinkedHashSet linkedHashSet, List list) {
        AbstractC0223g.m418e(linkedHashSet, "<this>");
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC0134v.m294Y(linkedHashSet.size() + Integer.valueOf(list.size()).intValue()));
        linkedHashSet2.addAll(linkedHashSet);
        AbstractC0129q.m291e0(list, linkedHashSet2);
        return linkedHashSet2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static Set m302a0(Object... objArr) {
        return objArr.length > 0 ? AbstractC0120h.m263k0(objArr) : C0133u.f428a;
    }
}
