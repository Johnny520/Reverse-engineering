package yyds;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛷᛴᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1531 extends C0437 implements ListIterator {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1311 f7363;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531(AbstractC1311 abstractC1311, int i) {
        super(0, abstractC1311);
        this.f7363 = abstractC1311;
        int iMo927 = abstractC1311.mo927();
        if (i < 0 || i > iMo927) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, iMo927, "index: ", ", size: "));
        }
        this.f2229 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2229 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2229;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2229 - 1;
        this.f2229 = i;
        return this.f7363.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2229 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
