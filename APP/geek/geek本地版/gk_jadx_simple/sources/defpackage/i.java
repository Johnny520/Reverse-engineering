package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class i implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public i(Object[] r2) {
        this.a = 1;
        ip.o("array", r2);
        this.c = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.a) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (this.b >= ((Object[]) this.c).length) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (this.b >= ((l) this.c).a()) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.a) {
            case 0: goto L10;
            default: goto L15;
        };
    L15:
        Object[] r0 = (Object[]) this.c;     // Catch: ArrayIndexOutOfBoundsException -> L6
        int r1 = this.b;     // Catch: ArrayIndexOutOfBoundsException -> L6
        this.b = r1 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L6
        return r0[r1];
    L6:
        e = move-exception;
        this.b--;
        throw new NoSuchElementException(e.getMessage());
    L10:
        if (hasNext() == false) goto L14;
        l r02 = (l) this.c;
        int r12 = this.b;
        this.b = r12 + 1;
        return r02.get(r12);
    L14:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public i(l r2) {
        this.a = 0;
        this.c = r2;
    }
}
