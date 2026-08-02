package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ff1 {
    public static final tu2 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        p7.C(new n31(11));
        a = new tu2(new n31(12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(final pu puVar, final li1 li1Var, final hq2 hq2Var, final o63 o63Var, final kw kwVar, px pxVar, final int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(904511636);
        if ((i & 6) == 0) {
            i2 = (go0Var.f(puVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.f(li1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.f(hq2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.f(o63Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go0Var.h(kwVar) ? 16384 : 8192;
        }
        if (go0Var.O(i2 & 1, (i2 & 9363) != 9362)) {
            go0Var.T();
            if ((i & 1) != 0 && !go0Var.y()) {
                go0Var.R();
            }
            go0Var.q();
            my myVar = sa2.a;
            long j = ju.g;
            ua2 ua2Var = (za0.b(Float.NaN, Float.NaN) && ju.c(j, j)) ? sa2.b : new ua2(j, true);
            long j2 = puVar.a;
            boolean zE = go0Var.e(j2);
            Object objL = go0Var.L();
            if (zE || objL == nx.a) {
                objL = new g13(j2, ju.b(0.4f, j2));
                go0Var.f0(objL);
            }
            ci0.b(new f42[]{ru.a.a(puVar), a.a(li1Var), ly0.a.a(ua2Var), iq2.a.a(hq2Var), h13.a.a((g13) objL), p63.a.a(o63Var)}, xe1.i0(-1750539308, new ef1(o63Var, kwVar), go0Var), go0Var, 56);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0() { // from class: df1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ff1.a(puVar, li1Var, hq2Var, o63Var, kwVar, (px) obj, pp0.N(i | 1));
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(pu puVar, hq2 hq2Var, o63 o63Var, kw kwVar, px pxVar, int i) {
        hq2 hq2Var2;
        hq2 hq2Var3;
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-449719819);
        int i3 = i | (go0Var.f(puVar) ? 4 : 2) | 16 | (go0Var.f(o63Var) ? 256 : 128);
        if (go0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            go0Var.T();
            if ((i & 1) == 0 || go0Var.y()) {
                hq2Var3 = (hq2) go0Var.j(iq2.a);
                i2 = i3 & (-113);
            } else {
                go0Var.R();
                i2 = i3 & (-113);
                hq2Var3 = hq2Var;
            }
            go0Var.q();
            a(puVar, (li1) go0Var.j(a), hq2Var3, o63Var, kwVar, go0Var, ((i2 << 3) & 7168) | (i2 & 14) | 24576);
            hq2Var2 = hq2Var3;
        } else {
            go0Var.R();
            hq2Var2 = hq2Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new v1(puVar, hq2Var2, o63Var, kwVar, i, 7);
        }
    }
}
