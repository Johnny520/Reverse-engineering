package p000;

import android.content.Context;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: renamed from: hm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0288hm implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2292d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2293e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0288hm(int i, Object obj) {
        this.f2292d = i;
        this.f2293e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2292d;
        na1 na1Var = na1.f4229a;
        Object obj3 = this.f2293e;
        switch (i) {
            case 0:
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue = ((Number) obj2).intValue();
                pi0 pi0Var = (pi0) obj3;
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (!c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0616pi.m3085R();
                } else {
                    pe0 pe0VarM4362a = uz0.m4362a(s11.m3998a(rd0.m3466Y(s11.f5620a, pi0Var.f4910e), Float.NaN, oi0.f4572a), new sx0(14));
                    C0831v8 c0831v8 = new C0831v8(oi0.f4573b, true, new C0717s8(0));
                    C0239ga c0239ga = C0496n2.f4155o;
                    C0474mh c0474mh = pi0Var.f4911f;
                    iw0 iw0VarM1508a = hw0.m1508a(c0831v8, c0239ga, c0616pi, 54);
                    int iM2776p = o30.m2776p(c0616pi);
                    fq0 fq0VarM3115l = c0616pi.m3115l();
                    pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarM4362a);
                    InterfaceC0210fi.f1733b.getClass();
                    C0094cj c0094cj = C0173ei.f1457b;
                    c0616pi.m3093Z();
                    if (c0616pi.f4877S) {
                        c0616pi.m3114k(c0094cj);
                    } else {
                        c0616pi.m3113j0();
                    }
                    w60.m4888J(c0616pi, C0173ei.f1460e, iw0VarM1508a);
                    w60.m4888J(c0616pi, C0173ei.f1459d, fq0VarM3115l);
                    C0462m7 c0462m7 = C0173ei.f1461f;
                    if (c0616pi.f4877S || !p30.m3002l(c0616pi.m3080L(), Integer.valueOf(iM2776p))) {
                        AbstractC0748t1.m4157o(iM2776p, c0616pi, iM2776p, c0462m7);
                    }
                    w60.m4888J(c0616pi, C0173ei.f1458c, pe0VarM4020E);
                    c0474mh.mo353a(kw0.f3279a, c0616pi, 6);
                    c0616pi.m3119p(true);
                }
                break;
            case 1:
                InterfaceC0356ji interfaceC0356ji2 = (InterfaceC0356ji) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C0948y2 c0948y2 = (C0948y2) obj3;
                C0616pi c0616pi2 = (C0616pi) interfaceC0356ji2;
                if (!c0616pi2.m3082O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0616pi2.m3085R();
                } else {
                    c0616pi2.m3112j(AbstractC0676r4.f5290a);
                    String string = ((Context) c0616pi2.m3112j(AbstractC0676r4.f5291b)).getResources().getString(C0587R.string.m3c_dialog);
                    pe0 pe0Var = (pe0) c0948y2.f7492e;
                    ln0 ln0Var = AbstractC0457m2.f3787a;
                    pe0 pe0VarM4001d = s11.m4001d(pe0Var);
                    boolean zM3104f = c0616pi2.m3104f(string);
                    Object objM3080L = c0616pi2.m3080L();
                    if (zM3104f || objM3080L == C0320ii.f2572a) {
                        objM3080L = new C0516nl(string, 0);
                        c0616pi2.m3107g0(objM3080L);
                    }
                    pe0 pe0VarMo2499c = pe0VarM4001d.mo2499c(uz0.m4362a(me0.f3922a, (InterfaceC0742sw) objM3080L));
                    xd0 xd0VarM5467d = AbstractC0993za.m5467d(C0496n2.f4145e, true);
                    int iM2776p2 = o30.m2776p(c0616pi2);
                    fq0 fq0VarM3115l2 = c0616pi2.m3115l();
                    pe0 pe0VarM4020E2 = s91.m4020E(c0616pi2, pe0VarMo2499c);
                    InterfaceC0210fi.f1733b.getClass();
                    C0094cj c0094cj2 = C0173ei.f1457b;
                    c0616pi2.m3093Z();
                    if (c0616pi2.f4877S) {
                        c0616pi2.m3114k(c0094cj2);
                    } else {
                        c0616pi2.m3113j0();
                    }
                    w60.m4888J(c0616pi2, C0173ei.f1460e, xd0VarM5467d);
                    w60.m4888J(c0616pi2, C0173ei.f1459d, fq0VarM3115l2);
                    C0462m7 c0462m72 = C0173ei.f1461f;
                    if (c0616pi2.f4877S || !p30.m3002l(c0616pi2.m3080L(), Integer.valueOf(iM2776p2))) {
                        AbstractC0748t1.m4157o(iM2776p2, c0616pi2, iM2776p2, c0462m72);
                    }
                    w60.m4888J(c0616pi2, C0173ei.f1458c, pe0VarM4020E2);
                    ((C0474mh) c0948y2.f7494g).invoke(c0616pi2, 0);
                    c0616pi2.m3119p(true);
                }
                break;
            default:
                InterfaceC0356ji interfaceC0356ji3 = (InterfaceC0356ji) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C0616pi c0616pi3 = (C0616pi) interfaceC0356ji3;
                if (!c0616pi3.m3082O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c0616pi3.m3085R();
                } else {
                    AbstractC0993za.m5464a(c10.m386a(p30.m2974J(pf1.m3029E("indicatorRipple"), c11.m387a(AbstractC0307i4.f2427h, c0616pi3), 518143), (ld0) obj3, uv0.m4359a(0.0f, 7)), c0616pi3, 0);
                }
                break;
        }
        return na1Var;
    }
}
