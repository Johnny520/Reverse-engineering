package p000;

/* JADX INFO: renamed from: yu */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0938yu {

    /* JADX INFO: renamed from: a */
    public static final C0032av f13618a = new C0032av(tp0.f10876c, C0700sn.f10233u);

    /* JADX INFO: renamed from: a */
    public static final C0032av m6346a(InterfaceC0921yf interfaceC0921yf, C0583pk c0583pk, InterfaceC0596px interfaceC0596px, int i) {
        if (interfaceC0921yf.equals(tp0.f10876c) && c0583pk.equals(C0700sn.f10233u)) {
            go0 go0Var = (go0) interfaceC0596px;
            go0Var.m1966W(-1446604504);
            go0Var.m1994p(false);
            return f13618a;
        }
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1966W(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && go0Var2.m1980f(interfaceC0921yf)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !go0Var2.m1980f(c0583pk)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM1956L = go0Var2.m1956L();
        if (z3 || objM1956L == C0520nx.f7360a) {
            objM1956L = new C0032av(interfaceC0921yf, c0583pk);
            go0Var2.m1981f0(objM1956L);
        }
        C0032av c0032av = (C0032av) objM1956L;
        go0Var2.m1994p(false);
        return c0032av;
    }
}
