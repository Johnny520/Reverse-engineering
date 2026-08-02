package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vc0 implements Iterator, q41 {
    public final /* synthetic */ int h = 1;
    public final Iterator i;
    public int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vc0(wc0 wc0Var) {
        this.i = wc0Var.a.iterator();
        this.j = wc0Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.h;
        Iterator it = this.i;
        switch (i) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.j > 0 && it.hasNext()) {
            it.next();
            this.j--;
        }
        return it.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.h;
        Iterator it = this.i;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.j;
                this.j = i2 + 1;
                if (i2 >= 0) {
                    return new jy0(i2, it.next());
                }
                eu.a0();
                throw null;
        }
        while (this.j > 0 && it.hasNext()) {
            it.next();
            this.j--;
        }
        return it.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public vc0(Iterator it) {
        it.getClass();
        this.i = it;
    }
}
