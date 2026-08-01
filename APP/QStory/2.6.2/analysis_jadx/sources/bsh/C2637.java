package bsh;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2637 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f7903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f7904;

    public C2637(List list, List list2) {
        this.f7904 = list;
        this.f7903 = list2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        List list = this.f7903;
        int iIntValue = i == list.size() ? ((Integer) list.get(i - 1)).intValue() + 1 : ((Integer) list.get(i)).intValue();
        this.f7904.add(iIntValue, obj);
        for (int i2 = i; i2 < list.size(); i2++) {
            list.set(i2, Integer.valueOf(((Integer) list.get(i2)).intValue() + 1));
        }
        list.add(i, Integer.valueOf(iIntValue));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            add(i2 + i, it.next());
            i2++;
        }
        return i2 > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f7904.get(((Integer) this.f7903.get(i)).intValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C2638(this, new ArrayList(this.f7903).listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f7903;
        int iIntValue = ((Integer) list.get(i)).intValue();
        for (int i2 = i + 1; i2 < list.size(); i2++) {
            list.set(i2, Integer.valueOf(((Integer) list.get(i2)).intValue() - 1));
        }
        list.remove(i);
        return this.f7904.remove(iIntValue);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f7904.set(((Integer) this.f7903.get(i)).intValue(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7903.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        return new C2637(this.f7904, this.f7903.subList(i, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f7903.size(), collection);
    }
}
