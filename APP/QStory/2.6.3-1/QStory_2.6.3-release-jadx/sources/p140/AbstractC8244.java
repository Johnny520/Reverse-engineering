package p140;

import androidx.compose.runtime.snapshots.C2119;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC5162;
import p141.C8251;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8244 extends AbstractC5162 {
    @Override // kotlin.collections.AbstractC5167, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC5167, java.util.Collection
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

    @Override // kotlin.collections.AbstractC5162, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final List subList(int i, int i2) {
        return new C8251(this, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract C8240 mo13189();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC8244 mo13203(Collection collection) {
        C8240 c8240Mo13189 = mo13189();
        c8240Mo13189.addAll(collection);
        return c8240Mo13189.m13169();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract AbstractC8244 mo13190(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract AbstractC8244 mo13191(int i, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract AbstractC8244 mo13197(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract AbstractC8244 mo13198(C2119 c2119);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract AbstractC8244 mo13200(int i, Object obj);
}
