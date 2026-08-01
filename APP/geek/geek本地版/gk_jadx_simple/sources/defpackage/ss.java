package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ss implements Iterator {
    public final int a;
    public int b;
    public int c;
    public boolean d;
    public final /* synthetic */ m6 e;

    public ss(m6 r2, int r3) {
        this.e = r2;
        this.d = false;
        this.a = r3;
        this.b = r2.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c >= this.b) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        Object r0 = this.e.b(this.c, this.a);
        this.c++;
        this.d = true;
        return r0;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d == false) goto L7;
        int r0 = this.c - 1;
        this.c = r0;
        this.b--;
        this.d = false;
        this.e.g(r0);
        return;
    L7:
        throw new IllegalStateException();
    }
}
