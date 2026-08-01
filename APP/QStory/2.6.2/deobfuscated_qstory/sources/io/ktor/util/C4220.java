package io.ktor.util;

import androidx.core.view.C2207;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4381;
import p052.InterfaceC6557;
import p054.InterfaceC6561;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4220 implements Set, InterfaceC6561 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f12709;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6557 f12710;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6557 f12711;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f12712;

    public C4220(Set set, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        set.getClass();
        this.f12712 = set;
        this.f12710 = interfaceC6557;
        this.f12711 = interfaceC65572;
        this.f12709 = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f12712.add(this.f12711.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.f12712.addAll(m8650(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12712.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12712.contains(this.f12711.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f12712.containsAll(m8650(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListM8649 = m8649(this.f12712);
        return ((Set) obj).containsAll(arrayListM8649) && arrayListM8649.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f12712.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12712.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2207(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12712.remove(this.f12711.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return this.f12712.removeAll(AbstractC4343.m8800(m8650(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f12712.retainAll(AbstractC4343.m8800(m8650(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12709;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC4381.m8884(this, objArr);
    }

    public final String toString() {
        return m8649(this.f12712).toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m8649(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f12710.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m8650(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f12711.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4381.m8885(this);
    }
}
