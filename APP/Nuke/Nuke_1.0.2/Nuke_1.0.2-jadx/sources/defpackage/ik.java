package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ik {
    public static final /* synthetic */ int a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        p7.a(40.0f, 40.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r11v16, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final in0 in0Var, final uh1 uh1Var, final boolean z, final boolean z2, final m13 m13Var, final m51 m51Var, final k51 k51Var, final boolean z3, final int i, final int i2, final wb3 wb3Var, in0 in0Var2, final ft2 ft2Var, final kw kwVar, px pxVar, final int i3) {
        go0 go0Var;
        final in0 in0Var3;
        in0 in0Var4;
        int i4;
        go0 go0Var2 = (go0) pxVar;
        go0Var2.X(2026950908);
        int i5 = i3 | (go0Var2.f(str) ? 4 : 2) | (go0Var2.h(in0Var) ? 32 : 16) | (go0Var2.f(uh1Var) ? 256 : 128) | (go0Var2.g(z) ? 2048 : 1024) | (go0Var2.g(z2) ? 16384 : 8192) | (go0Var2.f(m13Var) ? 131072 : 65536) | (go0Var2.f(m51Var) ? 1048576 : 524288) | (go0Var2.f(k51Var) ? 8388608 : 4194304) | (go0Var2.g(z3) ? 67108864 : 33554432) | (go0Var2.d(i) ? 536870912 : 268435456);
        int i6 = 196608 | (go0Var2.d(i2) ? 4 : 2) | (go0Var2.f(wb3Var) ? 32 : 16) | 3456 | (go0Var2.f(ft2Var) ? 16384 : 8192);
        if (go0Var2.O(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 74899) == 74898) ? false : true)) {
            go0Var2.T();
            int i7 = i3 & 1;
            eb ebVar = nx.a;
            if (i7 == 0 || go0Var2.y()) {
                Object objL = go0Var2.L();
                if (objL == ebVar) {
                    objL = new w(20);
                    go0Var2.f0(objL);
                }
                in0Var4 = (in0) objL;
            } else {
                go0Var2.R();
                in0Var4 = in0Var2;
            }
            go0Var2.q();
            Object objL2 = go0Var2.L();
            if (objL2 == ebVar) {
                i4 = 1;
                objL2 = op0.u(new k03(str, 0L, 6));
                go0Var2.f0(objL2);
            } else {
                i4 = 1;
            }
            xk1 xk1Var = (xk1) objL2;
            k03 k03Var = (k03) xk1Var.getValue();
            k03 k03Var2 = new k03(new sd(str), k03Var.b, k03Var.c);
            boolean zF = go0Var2.f(k03Var2);
            Object objL3 = go0Var2.L();
            if (zF || objL3 == ebVar) {
                objL3 = new r1(9, k03Var2, xk1Var);
                go0Var2.f0(objL3);
            }
            eu.r((xm0) objL3, go0Var2);
            int i8 = (i5 & 14) == 4 ? i4 : 0;
            Object objL4 = go0Var2.L();
            if (i8 != 0 || objL4 == ebVar) {
                objL4 = op0.u(str);
                go0Var2.f0(objL4);
            }
            xk1 xk1Var2 = (xk1) objL4;
            m51Var.getClass();
            int i9 = m51Var.a;
            l51 l51Var = new l51(i9);
            if (i9 == -1) {
                l51Var = null;
            }
            int i10 = l51Var != null ? l51Var.a : 0;
            int i11 = m51Var.b;
            n51 n51Var = new n51(i11);
            if (i11 == 0) {
                n51Var = null;
            }
            boolean z4 = i4;
            xx0 xx0Var = new xx0(z3, i10, z4, n51Var != null ? n51Var.a : i4, i4, kc1.j);
            boolean z5 = !z3;
            int i12 = z3 ? z4 ? 1 : 0 : i2;
            int i13 = z3 ? z4 ? 1 : 0 : i;
            boolean z6 = (go0Var2.f(xk1Var2) ? 1 : 0) | ((i5 & 112) == 32 ? z4 ? 1 : 0 : (char) 0);
            Object objL5 = go0Var2.L();
            if (z6 != 0 || objL5 == ebVar) {
                objL5 = new m0(in0Var, xk1Var, xk1Var2);
                go0Var2.f0(objL5);
            }
            int i14 = i6 << 9;
            go0Var = go0Var2;
            in0Var3 = in0Var4;
            gf1.a(k03Var2, (in0) objL5, uh1Var, m13Var, wb3Var, in0Var3, ft2Var, z5, i13, i12, xx0Var, k51Var, z, z2, kwVar, go0Var, (i5 & 896) | ((i5 >> 6) & 7168) | (i14 & 57344) | 1769472 | (i14 & 29360128), ((i5 >> 15) & 896) | (i5 & 7168) | (i5 & 57344) | 196608);
        } else {
            go0Var = go0Var2;
            go0Var.R();
            in0Var3 = in0Var2;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(str, in0Var, uh1Var, z, z2, m13Var, m51Var, k51Var, z3, i, i2, wb3Var, in0Var3, ft2Var, kwVar, i3) { // from class: hk
                public final /* synthetic */ String h;
                public final /* synthetic */ in0 i;
                public final /* synthetic */ uh1 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ m13 m;
                public final /* synthetic */ m51 n;
                public final /* synthetic */ k51 o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ int q;
                public final /* synthetic */ int r;
                public final /* synthetic */ wb3 s;
                public final /* synthetic */ in0 t;
                public final /* synthetic */ ft2 u;
                public final /* synthetic */ kw v;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(1);
                    ik.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (px) obj, iN);
                    return a83.a;
                }
            };
        }
    }
}
