package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 {

    /* JADX INFO: renamed from: a */
    public final zk1 f1788a = new zk1(new az0[16]);

    /* JADX INFO: renamed from: b */
    public final nx1 f1789b = op0.m3598u(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public long f1790c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public final nx1 f1791d = op0.m3598u(Boolean.TRUE);

    /* JADX INFO: renamed from: a */
    public final void m924a(int i, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-318043801);
        int i2 = (go0Var.m1984h(this) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            Object objM1956L = go0Var.m1956L();
            t00 t00Var = null;
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u(null);
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            if (((Boolean) this.f1791d.getValue()).booleanValue() || ((Boolean) this.f1789b.getValue()).booleanValue()) {
                go0Var.m1966W(-144841960);
                boolean zM1984h = go0Var.m1984h(this);
                Object objM1956L2 = go0Var.m1956L();
                if (zM1984h || objM1956L2 == c0160eb) {
                    objM1956L2 = new C0379k9(xk1Var, this, t00Var, 6);
                    go0Var.m1981f0(objM1956L2);
                }
                AbstractC0179eu.m1456f(go0Var, (mn0) objM1956L2, this);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-143455237);
                go0Var.m1994p(false);
            }
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0686s9(i, 10, this);
        }
    }
}
