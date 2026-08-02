package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ff1 {

    /* JADX INFO: renamed from: a */
    public static final tu2 f2950a;

    static {
        AbstractC0570p7.m3747C(new n31(11));
        f2950a = new tu2(new n31(12));
    }

    /* JADX INFO: renamed from: a */
    public static final void m1607a(final C0593pu c0593pu, final li1 li1Var, final hq2 hq2Var, final o63 o63Var, final C0402kw c0402kw, InterfaceC0596px interfaceC0596px, final int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(904511636);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(c0593pu) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1980f(li1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1980f(hq2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= go0Var.m1980f(o63Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 16384 : 8192;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 9363) != 9362)) {
            go0Var.m1963T();
            if ((i & 1) != 0 && !go0Var.m2003y()) {
                go0Var.m1961R();
            }
            go0Var.m1995q();
            C0478my c0478my = sa2.f10013a;
            long j = C0363ju.f5217g;
            ua2 ua2Var = (za0.m6404b(Float.NaN, Float.NaN) && C0363ju.m2566c(j, j)) ? sa2.f10014b : new ua2(j, true);
            long j2 = c0593pu.f8587a;
            boolean zM1978e = go0Var.m1978e(j2);
            Object objM1956L = go0Var.m1956L();
            if (zM1978e || objM1956L == C0520nx.f7360a) {
                objM1956L = new g13(j2, C0363ju.m2565b(0.4f, j2));
                go0Var.m1981f0(objM1956L);
            }
            ci0.m801b(new f42[]{AbstractC0670ru.f9755a.mo1251a(c0593pu), f2950a.mo1251a(li1Var), ly0.f6399a.mo1251a(ua2Var), iq2.f4749a.mo1251a(hq2Var), h13.f3782a.mo1251a((g13) objM1956L), p63.f7991a.mo1251a(o63Var)}, xe1.m6126i0(-1750539308, new ef1(o63Var, c0402kw), go0Var), go0Var, 56);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0() { // from class: df1
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ff1.m1607a(c0593pu, li1Var, hq2Var, o63Var, c0402kw, (InterfaceC0596px) obj, pp0.m3902N(i | 1));
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1608b(C0593pu c0593pu, hq2 hq2Var, o63 o63Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        hq2 hq2Var2;
        hq2 hq2Var3;
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-449719819);
        int i3 = i | (go0Var.m1980f(c0593pu) ? 4 : 2) | 16 | (go0Var.m1980f(o63Var) ? 256 : 128);
        if (go0Var.m1958O(i3 & 1, (i3 & 1171) != 1170)) {
            go0Var.m1963T();
            if ((i & 1) == 0 || go0Var.m2003y()) {
                hq2Var3 = (hq2) go0Var.m1988j(iq2.f4749a);
                i2 = i3 & (-113);
            } else {
                go0Var.m1961R();
                i2 = i3 & (-113);
                hq2Var3 = hq2Var;
            }
            go0Var.m1995q();
            m1607a(c0593pu, (li1) go0Var.m1988j(f2950a), hq2Var3, o63Var, c0402kw, go0Var, ((i2 << 3) & 7168) | (i2 & 14) | 24576);
            hq2Var2 = hq2Var3;
        } else {
            go0Var.m1961R();
            hq2Var2 = hq2Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0794v1(c0593pu, hq2Var2, o63Var, c0402kw, i, 7);
        }
    }
}
