package tf;

import ac.AbstractC0063p;
import gg.AbstractC1416l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: tf.d0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4156d0 extends AbstractC0063p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static LinkedHashSet m8350R(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4178y.m8438a0(objArr.length));
        AbstractC4165l.m8373J0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static LinkedHashSet m8351S(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4178y.m8438a0(set.size()));
        boolean z9 = false;
        for (Object obj2 : set) {
            boolean z10 = true;
            if (!z9 && AbstractC1416l.m3825a(obj2, obj)) {
                z9 = true;
                z10 = false;
            }
            if (z10) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static Set m8352T(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> collectionM8407P1 = iterable instanceof Collection ? (Collection) iterable : AbstractC4166m.m8407P1(iterable);
        if (collectionM8407P1.isEmpty()) {
            return AbstractC4166m.m8412U1(set);
        }
        if (!(collectionM8407P1 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM8407P1);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionM8407P1).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static LinkedHashSet m8353U(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4178y.m8438a0(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC4171r.m8432h1(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static LinkedHashSet m8354V(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4178y.m8438a0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static Set m8355W(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C4175v.f13712g;
        }
        if (length == 1) {
            return AbstractC0063p.m404N(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4178y.m8438a0(objArr.length));
        AbstractC4165l.m8373J0(objArr, linkedHashSet);
        return linkedHashSet;
    }
}
