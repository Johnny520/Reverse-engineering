package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: y */
/* JADX INFO: loaded from: classes.dex */
public final class C2737y extends C2694x implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0000A f9343d;

    public C2737y(AbstractC0000A r4, int r5) {
        this.f9343d = r4;
        super(0, r4);
        int r42 = r4.mo0a();
        if (r5 < 0) goto L8;
        if (r5 > r42) goto L8;
        this.f9268b = r5;
        return;
    L8:
        throw new IndexOutOfBoundsException("index: " + r5 + ", size: " + r42);
    }

    @Override // java.util.ListIterator
    public final void add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f9268b <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9268b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious() == false) goto L7;
        int r0 = this.f9268b - 1;
        this.f9268b = r0;
        return this.f9343d.get(r0);
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9268b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
