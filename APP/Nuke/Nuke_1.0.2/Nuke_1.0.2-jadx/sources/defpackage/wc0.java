package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wc0 implements uo2, xc0 {
    public final uo2 a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wc0(uo2 uo2Var, int i) {
        uo2Var.getClass();
        this.a = uo2Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xc0
    public final uo2 a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new wc0(this, i) : new wc0(this.a, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uo2
    public final Iterator iterator() {
        return new vc0(this);
    }
}
