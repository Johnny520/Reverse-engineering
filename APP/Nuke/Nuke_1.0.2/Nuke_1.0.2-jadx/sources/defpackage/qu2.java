package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qu2 implements pu2 {
    public final xg h = new xg(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(int i) {
        return (this.h.get() & i) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        xg xgVar;
        int i2;
        do {
            xgVar = this.h;
            i2 = xgVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!xgVar.compareAndSet(i2, i2 | i));
    }
}
