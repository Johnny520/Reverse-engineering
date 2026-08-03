package p000;

import java.util.ListIterator;

/* JADX INFO: renamed from: aD */
/* JADX INFO: loaded from: classes.dex */
public final class C1131aD implements ListIterator {

    /* JADX INFO: renamed from: a */
    public ListIterator f3581a;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3581a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3581a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f3581a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3581a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f3581a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3581a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
