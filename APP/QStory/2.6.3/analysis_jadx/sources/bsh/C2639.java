package bsh;

import java.util.ListIterator;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2639 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f7907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2638 f7908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7909 = 0;

    public C2639(C2638 c2638, ListIterator listIterator) {
        this.f7908 = c2638;
        this.f7907 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f7909;
        C2638 c2638 = this.f7908;
        c2638.add(i, obj);
        this.f7907.add((Integer) c2638.f7905.get(this.f7909));
        this.f7909 = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7907.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7907.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f7907;
        listIterator.next();
        int iPreviousIndex = listIterator.previousIndex();
        this.f7909 = iPreviousIndex;
        return this.f7908.get(iPreviousIndex);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7907.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f7907;
        listIterator.previous();
        int iNextIndex = listIterator.nextIndex();
        this.f7909 = iNextIndex;
        return this.f7908.get(iNextIndex);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7907.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f7908.remove(this.f7909);
        this.f7907.remove();
        this.f7909 = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f7908.set(this.f7909, obj);
    }
}
