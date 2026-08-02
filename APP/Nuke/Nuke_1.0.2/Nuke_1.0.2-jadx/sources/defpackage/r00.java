package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r00 {
    public static final m00 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        my myVar = pa.a;
        long j = ju.c;
        long j2 = ju.b;
        a = new m00(j, j2, j2, ju.b(0.38f, j2), ju.b(0.38f, j2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(m00 m00Var, uh1 uh1Var, kw kwVar, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-527864079);
        if ((i & 6) == 0) {
            i2 = (go0Var.f(m00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.f(uh1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.h(kwVar) ? 256 : 128;
        }
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            qk qkVar = o00.a;
            uh1 uh1VarB0 = gf1.b0(fg1.E(rp0.q0(gf1.n(fg1.O(uh1Var, 3.0f, gb2.a(4.0f), 28), m00Var.a, sp0.h)), 0.0f, o00.d, 1), gf1.P(go0Var));
            int i3 = (i2 << 3) & 7168;
            av avVarA = yu.a(tp0.c, sn.u, go0Var, 0);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarB0);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            yf3.c(go0Var, gx.e, avVarA);
            yf3.c(go0Var, gx.d, yy1VarL);
            yf3.c(go0Var, gx.f, Integer.valueOf(iHashCode));
            yf3.b(go0Var, gx.g);
            yf3.c(go0Var, gx.c, uh1VarM);
            kwVar.e(bv.a, go0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(m00Var, uh1Var, kwVar, i, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(uh1 uh1Var, m00 m00Var, in0 in0Var, px pxVar, int i, int i2) {
        int i3;
        int i4;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (go0Var.f(uh1Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (go0Var.f(m00Var) ? 32 : 16);
        }
        int i7 = i4 | (go0Var.h(in0Var) ? 256 : 128);
        if (go0Var.O(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                uh1Var = rh1.a;
            }
            if (i6 != 0) {
                m00Var = a;
            }
            a(m00Var, uh1Var, xe1.i0(-250345048, new x(8, in0Var, m00Var), go0Var), go0Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            go0Var.R();
        }
        uh1 uh1Var2 = uh1Var;
        m00 m00Var2 = m00Var;
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(uh1Var2, m00Var2, in0Var, i, i2, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(final String str, final boolean z, final m00 m00Var, final uh1 uh1Var, final nn0 nn0Var, final xm0 xm0Var, px pxVar, final int i) {
        int i2;
        int i3;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-2001167027);
        if ((i & 6) == 0) {
            i2 = (go0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.f(m00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.f(uh1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go0Var.h(nn0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go0Var.h(xm0Var) ? 131072 : 65536;
        }
        if (go0Var.O(i2 & 1, (74899 & i2) != 74898)) {
            qk qkVar = o00.a;
            float f = o00.c;
            xf xfVar = new xf(f, new s(2));
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objL = go0Var.L();
            if (z2 || objL == nx.a) {
                objL = new p00(0, xm0Var, z);
                go0Var.f0(objL);
            }
            uh1 uh1VarE = fg1.E(te.s(uh1Var, z, str, (xm0) objL).c(te.e).c(new kr2(112.0f, 48.0f, 280.0f, 48.0f, true)), f, 0.0f, 2);
            ob2 ob2VarA = nb2.a(xfVar, qkVar, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.T);
            yy1 yy1VarL = go0Var.l();
            uh1 uh1VarM = tl.M(go0Var, uh1VarE);
            hx.c.getClass();
            jy jyVar = gx.b;
            go0Var.Z();
            if (go0Var.S) {
                go0Var.k(jyVar);
            } else {
                go0Var.i0();
            }
            lc lcVar = gx.e;
            yf3.c(go0Var, lcVar, ob2VarA);
            lc lcVar2 = gx.d;
            yf3.c(go0Var, lcVar2, yy1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            lc lcVar3 = gx.f;
            yf3.c(go0Var, lcVar3, numValueOf);
            v6 v6Var = gx.g;
            yf3.b(go0Var, v6Var);
            lc lcVar4 = gx.c;
            yf3.c(go0Var, lcVar4, uh1VarM);
            if (nn0Var == null) {
                go0Var.W(-1597947094);
                go0Var.p(false);
                i3 = i2;
            } else {
                go0Var.W(-1597947093);
                float f2 = o00.e;
                uh1 uh1VarB0 = te.b0(rh1.a, f2, 0.0f, f2, f2, 2);
                i3 = i2;
                nf1 nf1VarD = dm.d(sn.j, false);
                int iHashCode2 = Long.hashCode(go0Var.T);
                yy1 yy1VarL2 = go0Var.l();
                uh1 uh1VarM2 = tl.M(go0Var, uh1VarB0);
                go0Var.Z();
                if (go0Var.S) {
                    go0Var.k(jyVar);
                } else {
                    go0Var.i0();
                }
                yf3.c(go0Var, lcVar, nf1VarD);
                yf3.c(go0Var, lcVar2, yy1VarL2);
                vi0.q(iHashCode2, go0Var, lcVar3, go0Var, v6Var);
                yf3.c(go0Var, lcVar4, uh1VarM2);
                nn0Var.e(new ju(z ? m00Var.c : m00Var.e), go0Var, 0);
                go0Var.p(true);
                go0Var.p(false);
            }
            long j = z ? m00Var.b : m00Var.d;
            eu.a(str, new g71(1.0f, true), new m13(j, o00.h, o00.i, o00.k, o00.b, o00.j, null, null, 16613240), 0, false, 1, 0, go0Var, (i3 & 14) | 1572864, 952);
            go0Var.p(true);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0() { // from class: q00
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r00.c(str, z, m00Var, uh1Var, nn0Var, xm0Var, (px) obj, pp0.N(i | 1));
                    return a83.a;
                }
            };
        }
    }
}
