package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb2 {

    /* JADX INFO: renamed from: a */
    public static final ob2 f7105a = new ob2(tp0.f10874a, C0700sn.f10231s);

    /* JADX INFO: renamed from: a */
    public static final ob2 m3265a(InterfaceC0845wf interfaceC0845wf, C0622qk c0622qk, InterfaceC0596px interfaceC0596px, int i) {
        if (interfaceC0845wf.equals(tp0.f10874a) && t11.m5086l(c0622qk, C0700sn.f10231s)) {
            go0 go0Var = (go0) interfaceC0596px;
            go0Var.m1966W(-1073830487);
            go0Var.m1994p(false);
            return f7105a;
        }
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1966W(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && go0Var2.m1980f(interfaceC0845wf)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !go0Var2.m1980f(c0622qk)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM1956L = go0Var2.m1956L();
        if (z3 || objM1956L == C0520nx.f7360a) {
            objM1956L = new ob2(interfaceC0845wf, c0622qk);
            go0Var2.m1981f0(objM1956L);
        }
        ob2 ob2Var = (ob2) objM1956L;
        go0Var2.m1994p(false);
        return ob2Var;
    }
}
