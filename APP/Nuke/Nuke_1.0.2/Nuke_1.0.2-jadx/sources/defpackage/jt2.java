package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jt2 implements ay, Iterable, q41 {
    public final qr2 h;
    public final int i;
    public final w72 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jt2(qr2 qr2Var, int i, io0 io0Var, w72 w72Var) {
        this.h = qr2Var;
        this.i = i;
        this.j = w72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof jt2)) {
            return false;
        }
        jt2 jt2Var = (jt2) obj;
        return jt2Var.i == this.i && jt2Var.h == this.h && jt2Var.j.equals(this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.j.hashCode() + ((this.h.hashCode() + (this.i * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b70(this.h, this.i, null, this.j);
    }
}
