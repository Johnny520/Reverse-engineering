package p000;

/* JADX INFO: renamed from: hb */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0277hb extends oe0 implements InterfaceC0123db, g50 {

    /* JADX INFO: renamed from: r */
    public C0095ck f2186r;

    /* JADX INFO: renamed from: s */
    public boolean f2187s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static final st0 m1285w0(C0277hb c0277hb, qj0 qj0Var, C0458m3 c0458m3) {
        st0 st0Var;
        if (c0277hb.f4542q && c0277hb.f2187s) {
            qj0 qj0VarM3038P = pf1.m3038P(c0277hb);
            if (!qj0Var.mo436G0().f4542q) {
                qj0Var = null;
            }
            if (qj0Var != null && (st0Var = (st0) c0458m3.invoke()) != null) {
                st0 st0VarMo341B = qj0VarM3038P.mo341B(qj0Var, false);
                return st0Var.m4105e((((long) Float.floatToRawIntBits(st0VarMo341B.f5833b)) & 4294967295L) | (((long) Float.floatToRawIntBits(st0VarMo341B.f5832a)) << 32));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0123db
    /* JADX INFO: renamed from: a0 */
    public final Object mo674a0(qj0 qj0Var, C0458m3 c0458m3, m51 m51Var) {
        Object objM3013w = p30.m3013w(new C0240gb(this, qj0Var, c0458m3, new C0607p9(this, qj0Var, c0458m3, 1), null), m51Var);
        return objM3013w == EnumC1007zk.f7916d ? objM3013w : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.g50
    /* JADX INFO: renamed from: j */
    public final void mo730j(i50 i50Var) {
        this.f2187s = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }
}
