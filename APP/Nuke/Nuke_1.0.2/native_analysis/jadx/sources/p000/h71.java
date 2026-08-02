package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h71 extends th1 implements ox1 {

    /* JADX INFO: renamed from: v */
    public float f3882v;

    /* JADX INFO: renamed from: w */
    public boolean f3883w;

    @Override // p000.ox1
    /* JADX INFO: renamed from: q0 */
    public final Object mo566q0(Object obj) {
        mb2 mb2Var = obj instanceof mb2 ? (mb2) obj : null;
        if (mb2Var == null) {
            mb2Var = new mb2();
        }
        mb2Var.f6551a = this.f3882v;
        mb2Var.f6552b = this.f3883w;
        return mb2Var;
    }
}
