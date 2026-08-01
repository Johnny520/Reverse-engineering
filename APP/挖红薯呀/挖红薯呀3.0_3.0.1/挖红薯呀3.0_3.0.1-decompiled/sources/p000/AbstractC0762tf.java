package p000;

/* JADX INFO: renamed from: tf */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762tf {

    /* JADX INFO: renamed from: a */
    public static final C0838vf f5992a = new C0838vf(C0496n2.f4157q);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C0838vf m4197a(C0202fa c0202fa, InterfaceC0356ji interfaceC0356ji, int i) {
        C0675r3 c0675r3 = rd0.f5363b;
        if (c0202fa.equals(C0496n2.f4157q)) {
            C0616pi c0616pi = (C0616pi) interfaceC0356ji;
            c0616pi.m3090W(-1446604504);
            c0616pi.m3119p(false);
            return f5992a;
        }
        C0616pi c0616pi2 = (C0616pi) interfaceC0356ji;
        c0616pi2.m3090W(-1446550657);
        boolean zM3104f = ((((i & 112) ^ 48) > 32 && c0616pi2.m3104f(c0202fa)) || (i & 48) == 32) | c0616pi2.m3104f(c0675r3);
        Object objM3080L = c0616pi2.m3080L();
        if (zM3104f || objM3080L == C0320ii.f2572a) {
            objM3080L = new C0838vf(c0202fa);
            c0616pi2.m3107g0(objM3080L);
        }
        C0838vf c0838vf = (C0838vf) objM3080L;
        c0616pi2.m3119p(false);
        return c0838vf;
    }
}
