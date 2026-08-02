package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yd1 extends wd1 {
    public bf0 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd1
    public final int d(Object obj) {
        d92 d92Var = (d92) obj;
        if (d92Var == null) {
            return 1;
        }
        return d92Var.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd1
    public final void e(Object obj, Object obj2) {
        d92 d92Var = (d92) obj2;
        bf0 bf0Var = this.k;
        if (bf0Var == null || d92Var == null) {
            return;
        }
        bf0Var.e.j(d92Var, true);
    }
}
