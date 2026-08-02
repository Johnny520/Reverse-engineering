package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n83 implements j71, Serializable {
    public xm0 h;
    public Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j71
    public final Object getValue() {
        if (this.i == sn.V) {
            xm0 xm0Var = this.h;
            xm0Var.getClass();
            this.i = xm0Var.a();
            this.h = null;
        }
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.i != sn.V ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
