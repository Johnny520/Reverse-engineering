package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ta1 extends oe0 implements r50 {

    /* JADX INFO: renamed from: r */
    public float f5966r;

    /* JADX INFO: renamed from: s */
    public float f5967s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: G */
    public final int mo2086G(yb0 yb0Var, sd0 sd0Var, int i) {
        int iMo181I = sd0Var.mo181I(i);
        int iMo641F = !Float.isNaN(this.f5966r) ? yb0Var.mo641F(this.f5966r) : 0;
        return iMo181I < iMo641F ? iMo641F : iMo181I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        int iM3139j;
        int iM3138i;
        if (Float.isNaN(this.f5966r) || C0617pj.m3139j(j) != 0) {
            iM3139j = C0617pj.m3139j(j);
        } else {
            int iMo641F = zd0Var.mo641F(this.f5966r);
            iM3139j = C0617pj.m3137h(j);
            if (iMo641F < 0) {
                iMo641F = 0;
            }
            if (iMo641F <= iM3139j) {
                iM3139j = iMo641F;
            }
        }
        int iM3137h = C0617pj.m3137h(j);
        if (Float.isNaN(this.f5967s) || C0617pj.m3138i(j) != 0) {
            iM3138i = C0617pj.m3138i(j);
        } else {
            int iMo641F2 = zd0Var.mo641F(this.f5967s);
            iM3138i = C0617pj.m3136g(j);
            int i = iMo641F2 >= 0 ? iMo641F2 : 0;
            if (i <= iM3138i) {
                iM3138i = i;
            }
        }
        xq0 xq0VarMo184e = sd0Var.mo184e(AbstractC0654qj.m3254a(iM3139j, iM3137h, iM3138i, C0617pj.m3136g(j)));
        return zd0Var.mo1279Q(xq0VarMo184e.f7400d, xq0VarMo184e.f7401e, C0330is.f2614d, new C0918x9(xq0VarMo184e, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: d */
    public final int mo2087d(yb0 yb0Var, sd0 sd0Var, int i) {
        int iMo182O = sd0Var.mo182O(i);
        int iMo641F = !Float.isNaN(this.f5966r) ? yb0Var.mo641F(this.f5966r) : 0;
        return iMo182O < iMo641F ? iMo641F : iMo182O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: i */
    public final int mo2088i(yb0 yb0Var, sd0 sd0Var, int i) {
        int iMo185f = sd0Var.mo185f(i);
        int iMo641F = !Float.isNaN(this.f5967s) ? yb0Var.mo641F(this.f5967s) : 0;
        return iMo185f < iMo641F ? iMo641F : iMo185f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: s */
    public final int mo2089s(yb0 yb0Var, sd0 sd0Var, int i) {
        int iMo183R = sd0Var.mo183R(i);
        int iMo641F = !Float.isNaN(this.f5967s) ? yb0Var.mo641F(this.f5967s) : 0;
        return iMo183R < iMo641F ? iMo641F : iMo183R;
    }
}
