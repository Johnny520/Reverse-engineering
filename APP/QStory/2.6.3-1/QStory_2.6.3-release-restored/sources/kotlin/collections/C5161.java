package kotlin.collections;

import androidx.compose.runtime.snapshots.C2099;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5161 extends AbstractC5180 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f13257;

    public C5161(ArrayList arrayList) {
        this.f13257 = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f13257.add(AbstractC5176.m9373(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13257.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f13257.get(AbstractC5176.m9372(i, this));
    }

    @Override // kotlin.collections.AbstractC5180
    /* JADX INFO: renamed from: getSize */
    public final int getLength() {
        return this.f13257.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2099(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C2099(this, 0);
    }

    @Override // kotlin.collections.AbstractC5180
    public final Object removeAt(int i) {
        return this.f13257.remove(AbstractC5176.m9372(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f13257.set(AbstractC5176.m9372(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C2099(this, i);
    }
}
