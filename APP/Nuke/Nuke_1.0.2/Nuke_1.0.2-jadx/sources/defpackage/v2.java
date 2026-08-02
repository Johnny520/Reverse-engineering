package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends w2 implements RandomAccess {
    public final w2 h;
    public final int i;
    public final int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v2(w2 w2Var, int i, int i2) {
        this.h = w2Var;
        this.i = i;
        sp0.u(i, i2, w2Var.a());
        this.j = i2 - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k2
    public final int a() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            s.d(vi0.h("index: ", i, ", size: ", i2));
            return null;
        }
        return this.h.get(this.i + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w2, java.util.List
    public final List subList(int i, int i2) {
        sp0.u(i, i2, this.j);
        int i3 = this.i;
        return new v2(this.h, i + i3, i3 + i2);
    }
}
