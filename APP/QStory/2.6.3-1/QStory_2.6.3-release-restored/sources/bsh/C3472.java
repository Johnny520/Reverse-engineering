package bsh;

import java.util.ListIterator;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3472 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f8252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3471 f8253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f8254 = 0;

    public C3472(C3471 c3471, ListIterator listIterator) {
        this.f8253 = c3471;
        this.f8252 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f8254;
        C3471 c3471 = this.f8253;
        c3471.add(i, obj);
        this.f8252.add((Integer) c3471.f8250.get(this.f8254));
        this.f8254 = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8252.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8252.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f8252;
        listIterator.next();
        int iPreviousIndex = listIterator.previousIndex();
        this.f8254 = iPreviousIndex;
        return this.f8253.get(iPreviousIndex);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8252.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f8252;
        listIterator.previous();
        int iNextIndex = listIterator.nextIndex();
        this.f8254 = iNextIndex;
        return this.f8253.get(iNextIndex);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8252.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f8253.remove(this.f8254);
        this.f8252.remove();
        this.f8254 = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f8253.set(this.f8254, obj);
    }
}
