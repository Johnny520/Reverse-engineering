package p000;

/* JADX INFO: renamed from: za */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0993za {

    /* JADX INFO: renamed from: a */
    public static final jh0 f7853a = m5466c(true);

    /* JADX INFO: renamed from: b */
    public static final jh0 f7854b = m5466c(false);

    /* JADX INFO: renamed from: c */
    public static final C0043b5 f7855c = C0043b5.f375c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5464a(pe0 pe0Var, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-211209833);
        int i2 = (c0616pi.m3104f(pe0Var) ? 4 : 2) | i;
        if (c0616pi.m3082O(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(c0616pi.f4878T);
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0Var);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, f7855c);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            w60.m4885G(c0616pi, C0173ei.f1462g);
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            w60.m4918y(c0616pi, Integer.valueOf(iHashCode), C0173ei.f1461f);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0956ya(pe0Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m5465b(wq0 wq0Var, xq0 xq0Var, sd0 sd0Var, k50 k50Var, int i, int i2, C0276ha c0276ha) {
        C0276ha c0276ha2;
        Object objMo50j = sd0Var.mo50j();
        C0919xa c0919xa = objMo50j instanceof C0919xa ? (C0919xa) objMo50j : null;
        wq0.m5016j(wq0Var, xq0Var, ((c0919xa == null || (c0276ha2 = c0919xa.f7289r) == null) ? c0276ha : c0276ha2).m1284a((((long) xq0Var.f7400d) << 32) | (((long) xq0Var.f7401e) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), k50Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final jh0 m5466c(boolean z) {
        jh0 jh0Var = new jh0(9);
        C0276ha c0276ha = C0496n2.f4145e;
        jh0Var.m1707m(c0276ha, new C0085cb(c0276ha, z));
        C0276ha c0276ha2 = C0496n2.f4146f;
        jh0Var.m1707m(c0276ha2, new C0085cb(c0276ha2, z));
        C0276ha c0276ha3 = C0496n2.f4147g;
        jh0Var.m1707m(c0276ha3, new C0085cb(c0276ha3, z));
        C0276ha c0276ha4 = C0496n2.f4148h;
        jh0Var.m1707m(c0276ha4, new C0085cb(c0276ha4, z));
        C0276ha c0276ha5 = C0496n2.f4149i;
        jh0Var.m1707m(c0276ha5, new C0085cb(c0276ha5, z));
        C0276ha c0276ha6 = C0496n2.f4150j;
        jh0Var.m1707m(c0276ha6, new C0085cb(c0276ha6, z));
        C0276ha c0276ha7 = C0496n2.f4151k;
        jh0Var.m1707m(c0276ha7, new C0085cb(c0276ha7, z));
        C0276ha c0276ha8 = C0496n2.f4152l;
        jh0Var.m1707m(c0276ha8, new C0085cb(c0276ha8, z));
        C0276ha c0276ha9 = C0496n2.f4153m;
        jh0Var.m1707m(c0276ha9, new C0085cb(c0276ha9, z));
        return jh0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final xd0 m5467d(C0276ha c0276ha, boolean z) {
        xd0 xd0Var = (xd0) (z ? f7853a : f7854b).m1701g(c0276ha);
        return xd0Var == null ? new C0085cb(c0276ha, z) : xd0Var;
    }
}
