package p124;

import androidx.compose.runtime.snapshots.C1284;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC4330;
import p125.C7422;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7415 extends AbstractC4330 {
    @Override // kotlin.collections.AbstractC4335, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection
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

    @Override // kotlin.collections.AbstractC4330, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final List subList(int i, int i2) {
        return new C7422(this, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract C7411 mo12630();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC7415 mo12644(Collection collection) {
        C7411 c7411Mo12630 = mo12630();
        c7411Mo12630.addAll(collection);
        return c7411Mo12630.m12610();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract AbstractC7415 mo12631(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract AbstractC7415 mo12632(int i, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract AbstractC7415 mo12638(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract AbstractC7415 mo12639(C1284 c1284);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract AbstractC7415 mo12641(int i, Object obj);
}
