package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i implements ListIterator {
    public final /* synthetic */ l d;

    public j(l r4, int r5) {
        this.d = r4;
        super(r4);
        int r42 = r4.a();
        if (r5 < 0) goto L8;
        if (r5 > r42) goto L8;
        this.b = r5;
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
        if (this.b <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious() == false) goto L7;
        int r0 = this.b - 1;
        this.b = r0;
        return this.d.get(r0);
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
