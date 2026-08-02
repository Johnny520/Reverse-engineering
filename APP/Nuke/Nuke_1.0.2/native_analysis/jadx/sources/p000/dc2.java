package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dc2 implements cc2 {

    /* JADX INFO: renamed from: l */
    public static final dq1 f1984l;

    /* JADX INFO: renamed from: h */
    public final Map f1985h;

    /* JADX INFO: renamed from: i */
    public final rk1 f1986i;

    /* JADX INFO: renamed from: j */
    public fc2 f1987j;

    /* JADX INFO: renamed from: k */
    public final C0792v f1988k;

    static {
        int i = 10;
        f1984l = new dq1(i, new eg1((byte) 0, 16), new eq1(20));
    }

    public dc2(Map map) {
        this.f1985h = map;
        long[] jArr = ed2.f2401a;
        this.f1986i = new rk1();
        this.f1988k = new C0792v(25, this);
    }

    @Override // p000.cc2
    /* JADX INFO: renamed from: e */
    public final void mo742e(Object obj, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(533563200);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(this) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            go0Var.m1968Y(obj);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                C0792v c0792v = this.f1988k;
                if (!((Boolean) c0792v.mo5j(obj)).booleanValue()) {
                    c80.m670n("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.f1985h.get(obj);
                tu2 tu2Var = hc2.f3953a;
                ic2 ic2Var = new ic2(new gc2(map, c0792v));
                go0Var.m1981f0(ic2Var);
                objM1956L = ic2Var;
            }
            ic2 ic2Var2 = (ic2) objM1956L;
            ci0.m801b(new f42[]{hc2.f3953a.mo1251a(ic2Var2), fc1.f2903a.mo1251a(ic2Var2)}, c0402kw, go0Var, (i2 & 112) | 8);
            boolean zM1984h = go0Var.m1984h(this) | go0Var.m1984h(obj) | go0Var.m1984h(ic2Var2);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1984h || objM1956L2 == c0160eb) {
                objM1956L2 = new C0444m0(this, obj, ic2Var2, 10);
                go0Var.m1981f0(objM1956L2);
            }
            AbstractC0179eu.m1450c(a83.f116a, (in0) objM1956L2, go0Var);
            if (go0Var.f3640y && go0Var.f3601G.f8523i == go0Var.f3641z) {
                go0Var.f3641z = -1;
                go0Var.f3640y = false;
            }
            go0Var.m1994p(false);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(this, obj, c0402kw, i, 12);
        }
    }
}
