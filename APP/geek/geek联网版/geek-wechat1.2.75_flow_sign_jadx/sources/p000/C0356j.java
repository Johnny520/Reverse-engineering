package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: classes.dex */
public final class C0356j extends C0317i implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0430l f2618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0356j(AbstractC0430l abstractC0430l, int i) {
        super(abstractC0430l);
        this.f2618d = abstractC0430l;
        int iMo1640a = abstractC0430l.mo1640a();
        if (i >= 0 && i <= iMo1640a) {
            this.f2291b = i;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + iMo1640a);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2291b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2291b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2291b - 1;
        this.f2291b = i;
        return this.f2618d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2291b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
