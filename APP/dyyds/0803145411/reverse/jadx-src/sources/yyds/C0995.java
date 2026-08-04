package yyds;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: renamed from: yyds.ᛴᲈᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0995 implements ListIterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ListIterator f4517;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1057 f4518;

    public C0995(C1057 c1057, int i) {
        this.f4518 = c1057;
        ArrayList arrayList = (ArrayList) c1057.f4827;
        if (i >= 0 && i <= c1057.mo927()) {
            this.f4517 = arrayList.listIterator(c1057.mo927() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C2807(0, c1057.mo927(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4517.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4517.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f4517.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC2725.m4850(this.f4518) - this.f4517.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f4517.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC2725.m4850(this.f4518) - this.f4517.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
