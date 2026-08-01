package p124;

import androidx.compose.runtime.snapshots.C1284;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC4329;
import p125.C7421;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7414 extends AbstractC4329 {
    @Override // kotlin.collections.AbstractC4334, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC4334, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractC4329, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC4329, java.util.List
    public final List subList(int i, int i2) {
        return new C7421(this, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract C7410 mo12603();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC7414 mo12617(Collection collection) {
        C7410 c7410Mo12603 = mo12603();
        c7410Mo12603.addAll(collection);
        return c7410Mo12603.m12584();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract AbstractC7414 mo12604(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract AbstractC7414 mo12605(int i, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract AbstractC7414 mo12611(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract AbstractC7414 mo12612(C1284 c1284);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract AbstractC7414 mo12614(int i, Object obj);
}
