package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class li0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ei0 f3499d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f3500e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f3501f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ o31 f3502g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0904ww f3503h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f3504i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0904ww f3505j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public li0(ei0 ei0Var, boolean z, boolean z2, o31 o31Var, InterfaceC0904ww interfaceC0904ww, boolean z3, InterfaceC0904ww interfaceC0904ww2) {
        this.f3499d = ei0Var;
        this.f3500e = z;
        this.f3501f = z2;
        this.f3502g = o31Var;
        this.f3503h = interfaceC0904ww;
        this.f3504i = z3;
        this.f3505j = interfaceC0904ww2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        pe0 c0509ne;
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        if (c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.f3501f;
            boolean z2 = this.f3500e;
            ei0 ei0Var = this.f3499d;
            w31 w31VarM2964a = p11.m2964a(!z ? ei0Var.f1468f : z2 ? ei0Var.f1463a : ei0Var.f1466d, this.f3502g, c0616pi);
            if (this.f3503h == null || !(this.f3504i || z2)) {
                c0616pi.m3090W(-634793532);
                c0616pi.m3119p(false);
                c0509ne = me0.f3922a;
            } else {
                c0616pi.m3090W(-634794445);
                Object objM3080L = c0616pi.m3080L();
                if (objM3080L == C0320ii.f2572a) {
                    objM3080L = new pg0(1);
                    c0616pi.m3107g0(objM3080L);
                }
                AtomicInteger atomicInteger = uz0.f6358a;
                c0509ne = new C0509ne((InterfaceC0742sw) objM3080L);
                c0616pi.m3119p(false);
            }
            xd0 xd0VarM5467d = AbstractC0993za.m5467d(C0496n2.f4145e, false);
            int iM2776p = o30.m2776p(c0616pi);
            fq0 fq0VarM3115l = c0616pi.m3115l();
            pe0 pe0VarM4020E = s91.m4020E(c0616pi, c0509ne);
            InterfaceC0210fi.f1733b.getClass();
            C0094cj c0094cj = C0173ei.f1457b;
            c0616pi.m3093Z();
            if (c0616pi.f4877S) {
                c0616pi.m3114k(c0094cj);
            } else {
                c0616pi.m3113j0();
            }
            w60.m4888J(c0616pi, C0173ei.f1460e, xd0VarM5467d);
            w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
            C0462m7 c0462m7 = C0173ei.f1461f;
            if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p))) {
                AbstractC0748t1.m4157o(iM2776p, c0616pi, iM2776p, c0462m7);
            }
            w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
            AbstractC0307i4.m1526b(AbstractC0928xj.f7352a.mo206a(new C0207ff(((C0207ff) w31VarM2964a.getValue()).f1709a)), this.f3505j, c0616pi, 8);
            c0616pi.m3119p(true);
        } else {
            c0616pi.m3085R();
        }
        return na1.f4229a;
    }
}
