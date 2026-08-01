package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hw0 {

    /* JADX INFO: renamed from: a */
    public static final iw0 f2370a = new iw0(rd0.f5362a, C0496n2.f4154n);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final iw0 m1508a(InterfaceC0794u8 interfaceC0794u8, C0239ga c0239ga, C0616pi c0616pi, int i) {
        if (interfaceC0794u8.equals(rd0.f5362a) && c0239ga.equals(C0496n2.f4154n)) {
            c0616pi.m3090W(-1073830487);
            c0616pi.m3119p(false);
            return f2370a;
        }
        c0616pi.m3090W(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c0616pi.m3104f(interfaceC0794u8)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c0616pi.m3104f(c0239ga)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM3080L = c0616pi.m3080L();
        if (z3 || objM3080L == C0320ii.f2572a) {
            objM3080L = new iw0(interfaceC0794u8, c0239ga);
            c0616pi.m3107g0(objM3080L);
        }
        iw0 iw0Var = (iw0) objM3080L;
        c0616pi.m3119p(false);
        return iw0Var;
    }
}
