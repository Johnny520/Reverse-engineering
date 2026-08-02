package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uy2 implements ry2 {
    public final long h;
    public final /* synthetic */ vy2 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uy2(vy2 vy2Var, long j) {
        this.i = vy2Var;
        this.h = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ry2
    public final long h(c61 c61Var) {
        c61 c61Var2 = (c61) this.i.y.getValue();
        if (c61Var2 != null) {
            return c61Var.r(c61Var2, this.h);
        }
        nz0.d("Tried to open context menu before the anchor was placed.");
        s.b();
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ry2
    public final o62 n(c61 c61Var) {
        return eu.q(h(c61Var), 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ry2
    public final qy2 v0() {
        return pp0.o(this.i);
    }
}
