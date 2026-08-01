package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class gp implements Iterator {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public gp(int r3, int r4, int r5) {
        this.a = r5;
        this.b = r4;
        boolean r0 = false;
        if (r5 <= 0) goto L6;
        if (r3 > r4) goto L8;
    L5:
        r0 = true;
    L8:
        this.c = r0;
        if (r0 == true) goto L12;
        r3 = r4;
    L12:
        this.d = r3;
        return;
    L6:
        if (r3 < r4) goto L8;
        goto L8
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.d;
        if (r0 == this.b) goto L5;
        this.d = this.a + r0;
    L11:
        return Integer.valueOf(r0);
    L5:
        if (this.c == false) goto L8;
        this.c = false;
        goto L11
    L8:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
