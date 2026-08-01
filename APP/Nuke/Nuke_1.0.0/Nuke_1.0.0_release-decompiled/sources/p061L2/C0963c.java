package p061L2;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: L2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0963c extends C0962b implements ListIterator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC0965e f3034g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963c(AbstractC0965e abstractC0965e, int i5) {
        super(abstractC0965e);
        this.f3034g = abstractC0965e;
        int iMo1974a = abstractC0965e.mo1974a();
        if (i5 < 0 || i5 > iMo1974a) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", iMo1974a));
        }
        this.f3032e = i5;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3032e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3032e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f3032e - 1;
        this.f3032e = i5;
        return this.f3034g.get(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3032e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
