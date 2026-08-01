package kotlin.collections;

import androidx.compose.runtime.snapshots.C1264;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C4328 extends AbstractC4347 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f12908;

    public C4328(ArrayList arrayList) {
        this.f12908 = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f12908.add(AbstractC4343.m8793(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f12908.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f12908.get(AbstractC4343.m8795(i, this));
    }

    @Override // kotlin.collections.AbstractC4347
    /* JADX INFO: renamed from: getSize */
    public final int getLength() {
        return this.f12908.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1264(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C1264(this, 0);
    }

    @Override // kotlin.collections.AbstractC4347
    public final Object removeAt(int i) {
        return this.f12908.remove(AbstractC4343.m8795(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f12908.set(AbstractC4343.m8795(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C1264(this, i);
    }
}
