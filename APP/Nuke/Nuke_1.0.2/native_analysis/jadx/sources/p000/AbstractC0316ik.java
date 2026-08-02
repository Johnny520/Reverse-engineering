package p000;

/* JADX INFO: renamed from: ik */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0316ik {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4659a = 0;

    static {
        AbstractC0570p7.m3765a(40.0f, 40.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m2359a(final String str, final in0 in0Var, final uh1 uh1Var, final boolean z, final boolean z2, final m13 m13Var, final m51 m51Var, final k51 k51Var, final boolean z3, final int i, final int i2, final wb3 wb3Var, in0 in0Var2, final ft2 ft2Var, final C0402kw c0402kw, InterfaceC0596px interfaceC0596px, final int i3) {
        go0 go0Var;
        final in0 in0Var3;
        in0 in0Var4;
        int i4;
        go0 go0Var2 = (go0) interfaceC0596px;
        go0Var2.m1967X(2026950908);
        int i5 = i3 | (go0Var2.m1980f(str) ? 4 : 2) | (go0Var2.m1984h(in0Var) ? 32 : 16) | (go0Var2.m1980f(uh1Var) ? 256 : 128) | (go0Var2.m1982g(z) ? 2048 : 1024) | (go0Var2.m1982g(z2) ? 16384 : 8192) | (go0Var2.m1980f(m13Var) ? 131072 : 65536) | (go0Var2.m1980f(m51Var) ? 1048576 : 524288) | (go0Var2.m1980f(k51Var) ? 8388608 : 4194304) | (go0Var2.m1982g(z3) ? 67108864 : 33554432) | (go0Var2.m1976d(i) ? 536870912 : 268435456);
        int i6 = 196608 | (go0Var2.m1976d(i2) ? 4 : 2) | (go0Var2.m1980f(wb3Var) ? 32 : 16) | 3456 | (go0Var2.m1980f(ft2Var) ? 16384 : 8192);
        if (go0Var2.m1958O(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 74899) == 74898) ? false : true)) {
            go0Var2.m1963T();
            int i7 = i3 & 1;
            C0160eb c0160eb = C0520nx.f7360a;
            if (i7 == 0 || go0Var2.m2003y()) {
                Object objM1956L = go0Var2.m1956L();
                if (objM1956L == c0160eb) {
                    objM1956L = new C0829w(20);
                    go0Var2.m1981f0(objM1956L);
                }
                in0Var4 = (in0) objM1956L;
            } else {
                go0Var2.m1961R();
                in0Var4 = in0Var2;
            }
            go0Var2.m1995q();
            Object objM1956L2 = go0Var2.m1956L();
            if (objM1956L2 == c0160eb) {
                i4 = 1;
                objM1956L2 = op0.m3598u(new k03(str, 0L, 6));
                go0Var2.m1981f0(objM1956L2);
            } else {
                i4 = 1;
            }
            xk1 xk1Var = (xk1) objM1956L2;
            k03 k03Var = (k03) xk1Var.getValue();
            k03 k03Var2 = new k03(new C0690sd(str), k03Var.f5297b, k03Var.f5298c);
            boolean zM1980f = go0Var2.m1980f(k03Var2);
            Object objM1956L3 = go0Var2.m1956L();
            if (zM1980f || objM1956L3 == c0160eb) {
                objM1956L3 = new C0640r1(9, k03Var2, xk1Var);
                go0Var2.m1981f0(objM1956L3);
            }
            AbstractC0179eu.m1468r((xm0) objM1956L3, go0Var2);
            int i8 = (i5 & 14) == 4 ? i4 : 0;
            Object objM1956L4 = go0Var2.m1956L();
            if (i8 != 0 || objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(str);
                go0Var2.m1981f0(objM1956L4);
            }
            xk1 xk1Var2 = (xk1) objM1956L4;
            m51Var.getClass();
            int i9 = m51Var.f6482a;
            l51 l51Var = new l51(i9);
            if (i9 == -1) {
                l51Var = null;
            }
            int i10 = l51Var != null ? l51Var.f5938a : 0;
            int i11 = m51Var.f6483b;
            n51 n51Var = new n51(i11);
            if (i11 == 0) {
                n51Var = null;
            }
            boolean z4 = i4;
            xx0 xx0Var = new xx0(z3, i10, z4, n51Var != null ? n51Var.f7009a : i4, i4, kc1.f5453j);
            boolean z5 = !z3;
            int i12 = z3 ? z4 ? 1 : 0 : i2;
            int i13 = z3 ? z4 ? 1 : 0 : i;
            boolean z6 = (go0Var2.m1980f(xk1Var2) ? 1 : 0) | ((i5 & 112) == 32 ? z4 ? 1 : 0 : (char) 0);
            Object objM1956L5 = go0Var2.m1956L();
            if (z6 != 0 || objM1956L5 == c0160eb) {
                objM1956L5 = new C0444m0(in0Var, xk1Var, xk1Var2);
                go0Var2.m1981f0(objM1956L5);
            }
            int i14 = i6 << 9;
            go0Var = go0Var2;
            in0Var3 = in0Var4;
            gf1.m1879a(k03Var2, (in0) objM1956L5, uh1Var, m13Var, wb3Var, in0Var3, ft2Var, z5, i13, i12, xx0Var, k51Var, z, z2, c0402kw, go0Var, (i5 & 896) | ((i5 >> 6) & 7168) | (i14 & 57344) | 1769472 | (i14 & 29360128), ((i5 >> 15) & 896) | (i5 & 7168) | (i5 & 57344) | 196608);
        } else {
            go0Var = go0Var2;
            go0Var.m1961R();
            in0Var3 = in0Var2;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(str, in0Var, uh1Var, z, z2, m13Var, m51Var, k51Var, z3, i, i2, wb3Var, in0Var3, ft2Var, c0402kw, i3) { // from class: hk

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ String f4040h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ in0 f4041i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ uh1 f4042j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ boolean f4043k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ boolean f4044l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ m13 f4045m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ m51 f4046n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ k51 f4047o;

                /* JADX INFO: renamed from: p */
                public final /* synthetic */ boolean f4048p;

                /* JADX INFO: renamed from: q */
                public final /* synthetic */ int f4049q;

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ int f4050r;

                /* JADX INFO: renamed from: s */
                public final /* synthetic */ wb3 f4051s;

                /* JADX INFO: renamed from: t */
                public final /* synthetic */ in0 f4052t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ ft2 f4053u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ C0402kw f4054v;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(1);
                    AbstractC0316ik.m2359a(this.f4040h, this.f4041i, this.f4042j, this.f4043k, this.f4044l, this.f4045m, this.f4046n, this.f4047o, this.f4048p, this.f4049q, this.f4050r, this.f4051s, this.f4052t, this.f4053u, this.f4054v, (InterfaceC0596px) obj, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }
}
