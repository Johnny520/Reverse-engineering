package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hj2 {
    public final il1 a = new kl1();
    public gj2 b = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final gj2 a() {
        gj2 gj2Var = this.b;
        if (gj2Var == null) {
            return null;
        }
        Set set = wj2.h;
        if (!wj2.h.contains(gj2Var.b.o)) {
            return gj2Var;
        }
        this.b = null;
        return null;
    }
}
