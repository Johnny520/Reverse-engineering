package p000;

/* JADX INFO: renamed from: st */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0738st extends oe0 implements r50 {

    /* JADX INFO: renamed from: r */
    public EnumC0062bo f5829r;

    /* JADX INFO: renamed from: s */
    public float f5830s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        int iM3139j;
        int iM3137h;
        int iM3136g;
        int i;
        if (!C0617pj.m3133d(j) || this.f5829r == EnumC0062bo.f549d) {
            iM3139j = C0617pj.m3139j(j);
            iM3137h = C0617pj.m3137h(j);
        } else {
            int iRound = Math.round(C0617pj.m3137h(j) * this.f5830s);
            int iM3139j2 = C0617pj.m3139j(j);
            iM3139j = C0617pj.m3137h(j);
            if (iRound < iM3139j2) {
                iRound = iM3139j2;
            }
            if (iRound <= iM3139j) {
                iM3139j = iRound;
            }
            iM3137h = iM3139j;
        }
        if (!C0617pj.m3132c(j) || this.f5829r == EnumC0062bo.f550e) {
            int iM3138i = C0617pj.m3138i(j);
            int iM3136g2 = C0617pj.m3136g(j);
            iM3136g = iM3138i;
            i = iM3136g2;
        } else {
            int iRound2 = Math.round(C0617pj.m3136g(j) * this.f5830s);
            int iM3138i2 = C0617pj.m3138i(j);
            iM3136g = C0617pj.m3136g(j);
            if (iRound2 < iM3138i2) {
                iRound2 = iM3138i2;
            }
            if (iRound2 <= iM3136g) {
                iM3136g = iRound2;
            }
            i = iM3136g;
        }
        xq0 xq0VarMo184e = sd0Var.mo184e(AbstractC0654qj.m3254a(iM3139j, iM3137h, iM3136g, i));
        return zd0Var.mo1279Q(xq0VarMo184e.f7400d, xq0VarMo184e.f7401e, C0330is.f2614d, new C0918x9(xq0VarMo184e, 1));
    }
}
