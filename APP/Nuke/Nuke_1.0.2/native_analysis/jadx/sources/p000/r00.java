package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r00 {

    /* JADX INFO: renamed from: a */
    public static final m00 f9306a;

    static {
        C0478my c0478my = AbstractC0573pa.f8061a;
        long j = C0363ju.f5213c;
        long j2 = C0363ju.f5212b;
        f9306a = new m00(j, j2, j2, C0363ju.m2565b(0.38f, j2), C0363ju.m2565b(0.38f, j2));
    }

    /* JADX INFO: renamed from: a */
    public static final void m4302a(m00 m00Var, uh1 uh1Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-527864079);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(m00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1980f(uh1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            C0622qk c0622qk = o00.f7388a;
            uh1 uh1VarM1882b0 = gf1.m1882b0(fg1.m1613E(rp0.m4556q0(gf1.m1896n(fg1.m1622O(uh1Var, 3.0f, gb2.m1827a(4.0f), 28), m00Var.f6419a, sp0.f10267h)), 0.0f, o00.f7391d, 1), gf1.m1868P(go0Var));
            int i3 = (i2 << 3) & 7168;
            C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1882b0);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
            yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
            yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
            yf3.m6267b(go0Var, C0256gx.f3732g);
            yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
            c0402kw.mo489e(C0069bv.f1040a, go0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(m00Var, uh1Var, c0402kw, i, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4303b(uh1 uh1Var, m00 m00Var, in0 in0Var, InterfaceC0596px interfaceC0596px, int i, int i2) {
        int i3;
        int i4;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (go0Var.m1980f(m00Var) ? 32 : 16);
        }
        int i7 = i4 | (go0Var.m1984h(in0Var) ? 256 : 128);
        if (go0Var.m1958O(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                uh1Var = rh1.f9587a;
            }
            if (i6 != 0) {
                m00Var = f9306a;
            }
            m4302a(m00Var, uh1Var, xe1.m6126i0(-250345048, new C0866x(8, in0Var, m00Var), go0Var), go0Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            go0Var.m1961R();
        }
        uh1 uh1Var2 = uh1Var;
        m00 m00Var2 = m00Var;
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(uh1Var2, m00Var2, in0Var, i, i2, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4304c(final String str, final boolean z, final m00 m00Var, final uh1 uh1Var, final nn0 nn0Var, final xm0 xm0Var, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        int i3;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-2001167027);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1982g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1980f(m00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1980f(uh1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go0Var.m1984h(nn0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 131072 : 65536;
        }
        if (go0Var.m1958O(i2 & 1, (74899 & i2) != 74898)) {
            C0622qk c0622qk = o00.f7388a;
            float f = o00.f7390c;
            C0884xf c0884xf = new C0884xf(f, new C0676s(2));
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objM1956L = go0Var.m1956L();
            if (z2 || objM1956L == C0520nx.f7360a) {
                objM1956L = new p00(0, xm0Var, z);
                go0Var.m1981f0(objM1956L);
            }
            uh1 uh1VarM1613E = fg1.m1613E(AbstractC0731te.m5234s(uh1Var, z, str, (xm0) objM1956L).mo4491c(AbstractC0731te.f10693e).mo4491c(new kr2(112.0f, 48.0f, 280.0f, 48.0f, true)), f, 0.0f, 2);
            ob2 ob2VarM3265a = nb2.m3265a(c0884xf, c0622qk, go0Var, 54);
            int iHashCode = Long.hashCode(go0Var.f3614T);
            yy1 yy1VarM1990l = go0Var.m1990l();
            uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, uh1VarM1613E);
            InterfaceC0293hx.f4166c.getClass();
            C0367jy c0367jy = C0256gx.f3727b;
            go0Var.m1969Z();
            if (go0Var.f3613S) {
                go0Var.m1989k(c0367jy);
            } else {
                go0Var.m1987i0();
            }
            C0419lc c0419lc = C0256gx.f3730e;
            yf3.m6268c(go0Var, c0419lc, ob2VarM3265a);
            C0419lc c0419lc2 = C0256gx.f3729d;
            yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0419lc c0419lc3 = C0256gx.f3731f;
            yf3.m6268c(go0Var, c0419lc3, numValueOf);
            C0799v6 c0799v6 = C0256gx.f3732g;
            yf3.m6267b(go0Var, c0799v6);
            C0419lc c0419lc4 = C0256gx.f3728c;
            yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M);
            if (nn0Var == null) {
                go0Var.m1966W(-1597947094);
                go0Var.m1994p(false);
                i3 = i2;
            } else {
                go0Var.m1966W(-1597947093);
                float f2 = o00.f7392e;
                uh1 uh1VarM5201b0 = AbstractC0731te.m5201b0(rh1.f9587a, f2, 0.0f, f2, f2, 2);
                i3 = i2;
                nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, false);
                int iHashCode2 = Long.hashCode(go0Var.f3614T);
                yy1 yy1VarM1990l2 = go0Var.m1990l();
                uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var, uh1VarM5201b0);
                go0Var.m1969Z();
                if (go0Var.f3613S) {
                    go0Var.m1989k(c0367jy);
                } else {
                    go0Var.m1987i0();
                }
                yf3.m6268c(go0Var, c0419lc, nf1VarM1060d);
                yf3.m6268c(go0Var, c0419lc2, yy1VarM1990l2);
                vi0.m5698q(iHashCode2, go0Var, c0419lc3, go0Var, c0799v6);
                yf3.m6268c(go0Var, c0419lc4, uh1VarM5285M2);
                nn0Var.mo489e(new C0363ju(z ? m00Var.f6421c : m00Var.f6423e), go0Var, 0);
                go0Var.m1994p(true);
                go0Var.m1994p(false);
            }
            long j = z ? m00Var.f6420b : m00Var.f6422d;
            AbstractC0179eu.m1446a(str, new g71(1.0f, true), new m13(j, o00.f7395h, o00.f7396i, o00.f7398k, o00.f7389b, o00.f7397j, null, null, 16613240), 0, false, 1, 0, go0Var, (i3 & 14) | 1572864, 952);
            go0Var.m1994p(true);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0() { // from class: q00
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r00.m4304c(str, z, m00Var, uh1Var, nn0Var, xm0Var, (InterfaceC0596px) obj, pp0.m3902N(i | 1));
                    return a83.f116a;
                }
            };
        }
    }
}
