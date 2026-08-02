package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vo2 implements Iterator, t00, q41 {
    public int h;
    public Object i;
    public t00 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RuntimeException a() {
        int i = this.h;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(t00 t00Var, Object obj) {
        this.i = obj;
        this.h = 3;
        this.j = t00Var;
        t00Var.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final a20 f() {
        return zd0.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final void h(Object obj) {
        fg1.T(obj);
        this.h = 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.h;
            if (i != 0) {
                break;
            }
            this.h = 5;
            t00 t00Var = this.j;
            t00Var.getClass();
            this.j = null;
            t00Var.h(a83.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.h;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            um2.b();
            return null;
        }
        if (i == 2) {
            this.h = 1;
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.h = 0;
        Object obj = this.i;
        this.i = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
