package bsh;

import java.util.ListIterator;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2638 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ListIterator f7905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2637 f7906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7907 = 0;

    public C2638(C2637 c2637, ListIterator listIterator) {
        this.f7906 = c2637;
        this.f7905 = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f7907;
        C2637 c2637 = this.f7906;
        c2637.add(i, obj);
        this.f7905.add((Integer) c2637.f7903.get(this.f7907));
        this.f7907 = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7905.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7905.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f7905;
        listIterator.next();
        int iPreviousIndex = listIterator.previousIndex();
        this.f7907 = iPreviousIndex;
        return this.f7906.get(iPreviousIndex);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7905.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f7905;
        listIterator.previous();
        int iNextIndex = listIterator.nextIndex();
        this.f7907 = iNextIndex;
        return this.f7906.get(iNextIndex);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7905.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f7906.remove(this.f7907);
        this.f7905.remove();
        this.f7907 = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f7906.set(this.f7907, obj);
    }
}
