package p009E0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: E0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0173d extends C0172c implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0175f f387d;

    public C0173d(AbstractC0175f r4, int r5) {
        this.f387d = r4;
        super(r4);
        int r42 = r4.mo516a();
        if (r5 < 0) goto L8;
        if (r5 > r42) goto L8;
        this.f385b = r5;
        return;
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r42));
    }

    @Override // java.util.ListIterator
    public final void add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f385b <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f385b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious() == false) goto L7;
        int r02 = this.f385b - 1;
        this.f385b = r02;
        return this.f387d.get(r02);
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f385b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
