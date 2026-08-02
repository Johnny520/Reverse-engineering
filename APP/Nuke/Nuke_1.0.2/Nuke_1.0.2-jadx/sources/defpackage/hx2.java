package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hx2 implements j71, Serializable {
    public xm0 h;
    public volatile Object i;
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hx2(xm0 xm0Var) {
        xm0Var.getClass();
        this.h = xm0Var;
        this.i = sn.V;
        this.j = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j71
    public final Object getValue() {
        Object objA;
        Object obj = this.i;
        sn snVar = sn.V;
        if (obj != snVar) {
            return obj;
        }
        synchronized (this.j) {
            objA = this.i;
            if (objA == snVar) {
                xm0 xm0Var = this.h;
                xm0Var.getClass();
                objA = xm0Var.a();
                this.i = objA;
                this.h = null;
            }
        }
        return objA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.i != sn.V ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
