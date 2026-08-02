package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n00 {

    /* JADX INFO: renamed from: a */
    public final ps2 f6948a = new ps2();

    /* JADX INFO: renamed from: b */
    public static void m3223b(n00 n00Var, mn0 mn0Var, C0402kw c0402kw, xm0 xm0Var, int i) {
        if ((i & 8) != 0) {
            c0402kw = null;
        }
        n00Var.f6948a.add(new C0402kw(-1789283891, true, new b81(mn0Var, n00Var, c0402kw, xm0Var)));
    }

    /* JADX INFO: renamed from: a */
    public final void m3224a(m00 m00Var, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-798501095);
        int i2 = 2;
        int i3 = (go0Var.m1980f(m00Var) ? 4 : 2) | i | (go0Var.m1980f(this) ? 32 : 16);
        if (go0Var.m1958O(i3 & 1, (i3 & 19) != 18)) {
            ps2 ps2Var = this.f6948a;
            int size = ps2Var.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((nn0) ps2Var.get(i4)).mo489e(m00Var, go0Var, Integer.valueOf(i3 & 14));
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0016af(i, i2, this, m00Var);
        }
    }
}
