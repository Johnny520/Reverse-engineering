package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class e70 extends oe0 implements r50 {

    /* JADX INFO: renamed from: u */
    public static final c70 f1318u = new c70();

    /* JADX INFO: renamed from: r */
    public f70 f1319r;

    /* JADX INFO: renamed from: s */
    public C0166eb f1320s;

    /* JADX INFO: renamed from: t */
    public um0 f1321t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        xq0 xq0VarMo184e = sd0Var.mo184e(j);
        return zd0Var.mo1279Q(xq0VarMo184e.f7400d, xq0VarMo184e.f7401e, C0330is.f2614d, new C0918x9(xq0VarMo184e, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final boolean m791w0(a70 a70Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.f1321t != um0.f6264d) {
                }
            } else if (i != 1 && i != 2) {
                C0921xc.m5134o("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (m792x0(i) ? a70Var.f63a > 0 : a70Var.f64b < this.f1319r.mo1044a() - 1) {
                return true;
            }
        } else if (this.f1321t != um0.f6265e) {
            if (m792x0(i)) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final boolean m792x0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = pf1.m3039Q(this).f389C.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            C0921xc.m5129j();
            return false;
        }
        if (i != 4) {
            C0921xc.m5134o("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = pf1.m3039Q(this).f389C.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        C0921xc.m5129j();
        return false;
    }
}
