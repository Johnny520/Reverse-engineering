package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements Iterator, q41 {
    public final Iterator h;
    public int i = -1;
    public Object j;
    public final /* synthetic */ bj0 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public aj0(bj0 bj0Var) {
        this.k = bj0Var;
        this.h = bj0Var.b.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        Object next;
        do {
            Iterator it = this.h;
            if (!it.hasNext()) {
                this.i = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) this.k.c.j(next)).booleanValue());
        this.j = next;
        this.i = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.i == -1) {
            a();
        }
        return this.i == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.i == -1) {
            a();
        }
        if (this.i == 0) {
            um2.b();
            return null;
        }
        Object obj = this.j;
        this.j = null;
        this.i = -1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
