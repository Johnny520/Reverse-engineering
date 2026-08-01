package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class jp0 extends oe0 implements r50 {

    /* JADX INFO: renamed from: r */
    public float f2923r;

    /* JADX INFO: renamed from: s */
    public dp0 f2924s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        dp0 dp0Var = this.f2924s;
        int iRound = (dp0Var == null || ((Number) dp0Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) dp0Var.getValue()).floatValue() * this.f2923r);
        int iM3139j = iRound != Integer.MAX_VALUE ? iRound : C0617pj.m3139j(j);
        int iM3138i = C0617pj.m3138i(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = C0617pj.m3137h(j);
        }
        xq0 xq0VarMo184e = sd0Var.mo184e(AbstractC0654qj.m3254a(iM3139j, iRound, iM3138i, C0617pj.m3136g(j)));
        return zd0Var.mo1279Q(xq0VarMo184e.f7400d, xq0VarMo184e.f7401e, C0330is.f2614d, new C0918x9(xq0VarMo184e, 3));
    }
}
