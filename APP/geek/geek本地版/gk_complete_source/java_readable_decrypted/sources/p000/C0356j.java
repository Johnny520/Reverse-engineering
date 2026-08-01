package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: classes.dex */
public final class C0356j extends C0317i implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0430l f2512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0356j(AbstractC0430l abstractC0430l, int i) {
        super(abstractC0430l);
        this.f2512d = abstractC0430l;
        int iMo1236a = abstractC0430l.mo1236a();
        if (i >= 0 && i <= iMo1236a) {
            this.f2321b = i;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + iMo1236a);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2321b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2321b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2321b - 1;
        this.f2321b = i;
        return this.f2512d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2321b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
