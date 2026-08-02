package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 implements Iterator, q41 {
    public final qr2 h;
    public final int i;
    public int j;
    public final int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dr0(qr2 qr2Var, int i, int i2) {
        this.h = qr2Var;
        this.i = i2;
        this.j = i;
        this.k = qr2Var.o;
        if (qr2Var.n) {
            sr2.f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j < this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        qr2 qr2Var = this.h;
        int i = qr2Var.o;
        int i2 = this.k;
        if (i != i2) {
            sr2.f();
        }
        int i3 = this.j;
        this.j = qr2Var.h[(i3 * 5) + 3] + i3;
        return new rr2(qr2Var, i3, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
