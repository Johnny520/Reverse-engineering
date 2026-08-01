package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h51 {

    /* JADX INFO: renamed from: a */
    public static final C0174ej f2147a = new C0174ej(new us0(12));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1275a(pe0 pe0Var, x01 x01Var, long j, long j2, float f, float f2, C0474mh c0474mh, InterfaceC0356ji interfaceC0356ji, int i, int i2) {
        if ((i2 & 2) != 0) {
            x01Var = pf1.f4843i;
        }
        if ((i2 & 8) != 0) {
            j2 = AbstractC0510nf.m2696b(j, interfaceC0356ji);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        C0174ej c0174ej = f2147a;
        float f3 = ((C0520np) c0616pi.m3112j(c0174ej)).f4301d + f;
        AbstractC0307i4.m1527c(new ct0[]{AbstractC0928xj.f7352a.mo206a(new C0207ff(j2)), c0174ej.mo206a(new C0520np(f3))}, AbstractC0398kl.m1937w(421772006, new f51(pe0Var, x01Var, j, f3, null, f2, c0474mh), c0616pi), c0616pi, 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final pe0 m1276b(pe0 pe0Var, x01 x01Var, long j, rd0 rd0Var, float f) {
        pe0 pe0VarM2973I;
        me0 me0Var = me0.f3922a;
        if (f > 0.0f) {
            long j2 = t81.f5953a;
            long j3 = AbstractC0979yx.f7702a;
            pe0VarM2973I = p30.m2973I(me0Var, f, j2, x01Var, false, j3, j3);
        } else {
            pe0VarM2973I = me0Var;
        }
        pe0 pe0VarMo2499c = pe0Var.mo2499c(pe0VarM2973I);
        if (rd0Var == null) {
            return p30.m2974J(s91.m4047l(pe0VarMo2499c.mo2499c(me0Var), j, x01Var), x01Var, 518143);
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m1277c(long j, float f, C0616pi c0616pi) {
        C0429lf c0429lf = (C0429lf) c0616pi.m3112j(AbstractC0510nf.f4248a);
        boolean zBooleanValue = ((Boolean) c0616pi.m3112j(AbstractC0510nf.f4249b)).booleanValue();
        long j2 = c0429lf.f3467p;
        return (C0207ff.m1094c(j, j2) && zBooleanValue) ? C0520np.m2732b(f, 0.0f) ? j2 : p30.m3011u(C0207ff.m1093b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, c0429lf.f3471t), j2) : j;
    }
}
