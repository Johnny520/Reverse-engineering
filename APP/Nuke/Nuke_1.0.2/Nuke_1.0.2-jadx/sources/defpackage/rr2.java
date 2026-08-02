package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rr2 implements ay, Iterable, q41 {
    public final qr2 h;
    public final int i;
    public final int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rr2(qr2 qr2Var, int i, int i2) {
        this.h = qr2Var;
        this.i = i;
        this.j = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof rr2)) {
            return false;
        }
        rr2 rr2Var = (rr2) obj;
        return rr2Var.i == this.i && rr2Var.j == this.j && rr2Var.h == this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.h.hashCode() * 31) + this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        qr2 qr2Var = this.h;
        if (qr2Var.o != this.j) {
            sr2.f();
        }
        int i = this.i;
        qr2Var.f(i);
        return new dr0(qr2Var, i + 1, qr2Var.h[(i * 5) + 3] + i);
    }
}
