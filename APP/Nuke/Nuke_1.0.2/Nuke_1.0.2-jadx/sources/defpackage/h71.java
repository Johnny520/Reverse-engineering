package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h71 extends th1 implements ox1 {
    public float v;
    public boolean w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox1
    public final Object q0(Object obj) {
        mb2 mb2Var = obj instanceof mb2 ? (mb2) obj : null;
        if (mb2Var == null) {
            mb2Var = new mb2();
        }
        mb2Var.a = this.v;
        mb2Var.b = this.w;
        return mb2Var;
    }
}
