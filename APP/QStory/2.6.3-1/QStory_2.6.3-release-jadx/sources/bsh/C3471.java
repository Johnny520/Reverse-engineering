package bsh;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3471 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f8250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f8251;

    public C3471(List list, List list2) {
        this.f8251 = list;
        this.f8250 = list2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        List list = this.f8250;
        int iIntValue = i == list.size() ? ((Integer) list.get(i - 1)).intValue() + 1 : ((Integer) list.get(i)).intValue();
        this.f8251.add(iIntValue, obj);
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
        return this.f8251.get(((Integer) this.f8250.get(i)).intValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3472(this, new ArrayList(this.f8250).listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f8250;
        int iIntValue = ((Integer) list.get(i)).intValue();
        for (int i2 = i + 1; i2 < list.size(); i2++) {
            list.set(i2, Integer.valueOf(((Integer) list.get(i2)).intValue() - 1));
        }
        list.remove(i);
        return this.f8251.remove(iIntValue);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f8251.set(((Integer) this.f8250.get(i)).intValue(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8250.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        return new C3471(this.f8251, this.f8250.subList(i, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f8250.size(), collection);
    }
}
