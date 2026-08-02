package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dc2 implements cc2 {
    public static final dq1 l;
    public final Map h;
    public final rk1 i;
    public fc2 j;
    public final v k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 10;
        l = new dq1(i, new eg1((byte) 0, 16), new eq1(20));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dc2(Map map) {
        this.h = map;
        long[] jArr = ed2.a;
        this.i = new rk1();
        this.k = new v(25, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cc2
    public final void e(Object obj, kw kwVar, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(533563200);
        if ((i & 6) == 0) {
            i2 = (go0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.h(kwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.h(this) ? 256 : 128;
        }
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            go0Var.Y(obj);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                v vVar = this.k;
                if (!((Boolean) vVar.j(obj)).booleanValue()) {
                    c80.n("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.h.get(obj);
                tu2 tu2Var = hc2.a;
                ic2 ic2Var = new ic2(new gc2(map, vVar));
                go0Var.f0(ic2Var);
                objL = ic2Var;
            }
            ic2 ic2Var2 = (ic2) objL;
            ci0.b(new f42[]{hc2.a.a(ic2Var2), fc1.a.a(ic2Var2)}, kwVar, go0Var, (i2 & 112) | 8);
            boolean zH = go0Var.h(this) | go0Var.h(obj) | go0Var.h(ic2Var2);
            Object objL2 = go0Var.L();
            if (zH || objL2 == ebVar) {
                objL2 = new m0(this, obj, ic2Var2, 10);
                go0Var.f0(objL2);
            }
            eu.c(a83.a, (in0) objL2, go0Var);
            if (go0Var.y && go0Var.G.i == go0Var.z) {
                go0Var.z = -1;
                go0Var.y = false;
            }
            go0Var.p(false);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(this, obj, kwVar, i, 12);
        }
    }
}
