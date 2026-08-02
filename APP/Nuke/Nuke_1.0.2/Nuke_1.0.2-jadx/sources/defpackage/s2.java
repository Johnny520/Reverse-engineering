package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s2 implements Iterator, q41 {
    public int h;
    public Object i;

    public abstract void a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.h;
        if (i == 0) {
            this.h = 3;
            a();
            return this.h == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        s.j("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.h;
        if (i == 1) {
            this.h = 0;
            return this.i;
        }
        if (i != 2) {
            this.h = 3;
            a();
            if (this.h == 1) {
                this.h = 0;
                return this.i;
            }
        }
        um2.b();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
