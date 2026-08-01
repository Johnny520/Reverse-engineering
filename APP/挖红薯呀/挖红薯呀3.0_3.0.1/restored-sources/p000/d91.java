package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d91 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f1007a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        z60.m5422I(new us0(15));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final w81 m671a(b91 b91Var, q91 q91Var, String str, InterfaceC0356ji interfaceC0356ji) {
        v81 v81Var;
        boolean zM3104f = ((C0616pi) interfaceC0356ji).m3104f(b91Var);
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        Object objM3080L = c0616pi.m3080L();
        C0675r3 c0675r3 = C0320ii.f2572a;
        if (zM3104f || objM3080L == c0675r3) {
            objM3080L = new w81(b91Var, q91Var, str);
            c0616pi.m3107g0(objM3080L);
        }
        w81 w81Var = (w81) objM3080L;
        boolean zM3104f2 = c0616pi.m3104f(b91Var) | c0616pi.m3108h(w81Var);
        Object objM3080L2 = c0616pi.m3080L();
        if (zM3104f2 || objM3080L2 == c0675r3) {
            objM3080L2 = new C0073c(22, b91Var, w81Var);
            c0616pi.m3107g0(objM3080L2);
        }
        s91.m4038c(w81Var, (InterfaceC0742sw) objM3080L2, c0616pi);
        if (b91Var.m332g() && (v81Var = (v81) w81Var.f7047b.getValue()) != null) {
            b91 b91Var2 = w81Var.f7048c;
            v81Var.f6462d.m5221f(v81Var.f6464f.invoke(b91Var2.m331f().f7285a), v81Var.f6464f.invoke(b91Var2.m331f().f7286b), (InterfaceC0778tt) v81Var.f6463e.invoke(b91Var2.m331f()));
        }
        return w81Var;
    }
}
