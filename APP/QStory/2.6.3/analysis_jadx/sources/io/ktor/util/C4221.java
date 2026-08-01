package io.ktor.util;

import androidx.core.view.C2207;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4382;
import p052.InterfaceC6558;
import p054.InterfaceC6562;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4221 implements Set, InterfaceC6562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f12713;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6558 f12714;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6558 f12715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f12716;

    public C4221(Set set, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        set.getClass();
        this.f12716 = set;
        this.f12714 = interfaceC6558;
        this.f12715 = interfaceC65582;
        this.f12713 = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f12716.add(this.f12715.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.f12716.addAll(m8640(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12716.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12716.contains(this.f12715.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f12716.containsAll(m8640(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListM8639 = m8639(this.f12716);
        return ((Set) obj).containsAll(arrayListM8639) && arrayListM8639.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f12716.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12716.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2207(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12716.remove(this.f12715.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return this.f12716.removeAll(AbstractC4344.m8788(m8640(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f12716.retainAll(AbstractC4344.m8788(m8640(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12713;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC4382.m8874(this, objArr);
    }

    public final String toString() {
        return m8639(this.f12716).toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m8639(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f12714.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m8640(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f12715.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4382.m8875(this);
    }
}
