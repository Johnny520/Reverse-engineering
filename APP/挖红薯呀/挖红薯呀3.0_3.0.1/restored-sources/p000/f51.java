package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class f51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pe0 f1586d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ x01 f1587e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f1588f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f1589g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f1590h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0474mh f1591i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f51(pe0 pe0Var, x01 x01Var, long j, float f, rd0 rd0Var, float f2, C0474mh c0474mh) {
        this.f1586d = pe0Var;
        this.f1587e = x01Var;
        this.f1588f = j;
        this.f1589g = f;
        this.f1590h = f2;
        this.f1591i = c0474mh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        boolean zM3082O = c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2);
        na1 na1Var = na1.f4229a;
        if (!zM3082O) {
            c0616pi.m3085R();
            return na1Var;
        }
        pe0 pe0VarM1276b = h51.m1276b(this.f1586d, this.f1587e, h51.m1277c(this.f1588f, this.f1589g, c0616pi), null, ((InterfaceC0968ym) c0616pi.m3112j(AbstractC0131dj.f1121h)).mo654p(this.f1590h));
        Object objM3080L = c0616pi.m3080L();
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (objM3080L == c0675r3) {
            objM3080L = new sx0(16);
            c0616pi.m3107g0(objM3080L);
        }
        AtomicInteger atomicInteger = uz0.f6358a;
        pe0 pe0VarMo2499c = pe0VarM1276b.mo2499c(new C0606p8((InterfaceC0742sw) objM3080L));
        Object objM3080L2 = c0616pi.m3080L();
        if (objM3080L2 == c0675r3) {
            objM3080L2 = e51.f1302a;
            c0616pi.m3107g0(objM3080L2);
        }
        ir0 ir0Var = o51.f4465a;
        pe0 pe0VarMo2499c2 = pe0VarMo2499c.mo2499c(new n51(na1Var, null, (PointerInputEventHandler) objM3080L2, 6));
        xd0 xd0VarM5467d = AbstractC0993za.m5467d(C0496n2.f4145e, true);
        int iM2776p = o30.m2776p(c0616pi);
        fq0 fq0VarM3115l = c0616pi.m3115l();
        pe0 pe0VarM4020E = s91.m4020E(c0616pi, pe0VarMo2499c2);
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
        this.f1591i.invoke(c0616pi, 0);
        c0616pi.m3119p(true);
        return na1Var;
    }
}
