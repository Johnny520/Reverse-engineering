package io.ktor.util;

import androidx.core.view.C3040;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5214;
import p068.InterfaceC7387;
import p070.InterfaceC7391;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5053 implements Set, InterfaceC7391 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f13058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7387 f13059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7387 f13060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f13061;

    public C5053(Set set, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        set.getClass();
        this.f13061 = set;
        this.f13059 = interfaceC7387;
        this.f13060 = interfaceC73872;
        this.f13058 = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f13061.add(this.f13060.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.f13061.addAll(m9199(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f13061.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13061.contains(this.f13060.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f13061.containsAll(m9199(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListM9198 = m9198(this.f13061);
        return ((Set) obj).containsAll(arrayListM9198) && arrayListM9198.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f13061.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f13061.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3040(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f13061.remove(this.f13060.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return this.f13061.removeAll(AbstractC5176.m9347(m9199(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f13061.retainAll(AbstractC5176.m9347(m9199(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f13058;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC5214.m9433(this, objArr);
    }

    public final String toString() {
        return m9198(this.f13061).toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m9198(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f13059.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m9199(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f13060.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC5214.m9434(this);
    }
}
