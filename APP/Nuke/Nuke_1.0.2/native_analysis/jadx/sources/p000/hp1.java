package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hp1 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f4100h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4101i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ in0 f4102j;

    public /* synthetic */ hp1(int i, in0 in0Var, boolean z) {
        this.f4100h = z;
        this.f4101i = i;
        this.f4102j = in0Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        xk1 xk1Var;
        float f;
        float fM778C;
        xk1 xk1Var2;
        xk1 xk1Var3;
        final xk1 xk1Var4;
        boolean z;
        uh1 uh1Var = (uh1) obj;
        ((Integer) obj3).getClass();
        uh1Var.getClass();
        go0 go0Var = (go0) ((InterfaceC0596px) obj2);
        go0Var.m1966W(778348949);
        Object objM1956L = go0Var.m1956L();
        C0160eb c0160eb = C0520nx.f7360a;
        if (objM1956L == c0160eb) {
            objM1956L = new bk1();
            go0Var.m1981f0(objM1956L);
        }
        bk1 bk1Var = (bk1) objM1956L;
        xk1 xk1VarM4484t = rg3.m4484t(bk1Var, go0Var);
        final bs0 bs0Var = (bs0) go0Var.m1988j(AbstractC0441ly.f6386l);
        go0Var.m1966W(669038151);
        final boolean zBooleanValue = ((Boolean) go0Var.m1988j(ur1.f11453b)).booleanValue();
        go0Var.m1994p(false);
        Object objM1956L2 = go0Var.m1956L();
        if (objM1956L2 == c0160eb) {
            objM1956L2 = op0.m3598u(new h11(0L));
            go0Var.m1981f0(objM1956L2);
        }
        final xk1 xk1Var5 = (xk1) objM1956L2;
        Object objM1956L3 = go0Var.m1956L();
        if (objM1956L3 == c0160eb) {
            objM1956L3 = op0.m3598u(new rs1(0L));
            go0Var.m1981f0(objM1956L3);
        }
        xk1 xk1Var6 = (xk1) objM1956L3;
        Object objM1956L4 = go0Var.m1956L();
        if (objM1956L4 == c0160eb) {
            objM1956L4 = op0.m3598u(Boolean.FALSE);
            go0Var.m1981f0(objM1956L4);
        }
        xk1 xk1Var7 = (xk1) objM1956L4;
        Object objM1956L5 = go0Var.m1956L();
        if (objM1956L5 == c0160eb) {
            objM1956L5 = op0.m3598u(null);
            go0Var.m1981f0(objM1956L5);
        }
        final xk1 xk1Var8 = (xk1) objM1956L5;
        boolean zM1978e = go0Var.m1978e(((rs1) xk1Var6.getValue()).f9744a) | go0Var.m1982g(((Boolean) xk1VarM4484t.getValue()).booleanValue()) | go0Var.m1978e(((h11) xk1Var5.getValue()).f3775a);
        Object objM1956L6 = go0Var.m1956L();
        if (zM1978e || objM1956L6 == c0160eb) {
            if (((int) (((h11) xk1Var5.getValue()).f3775a >> 32)) == 0) {
                xk1Var = xk1Var6;
                fM778C = 0.0f;
                f = 2.0f;
            } else {
                xk1Var = xk1Var6;
                f = 2.0f;
                fM778C = ci0.m778C((Float.intBitsToFloat((int) (((rs1) xk1Var6.getValue()).f9744a >> 32)) - (((int) (((h11) xk1Var5.getValue()).f3775a >> 32)) / 2.0f)) / (((int) (((h11) xk1Var5.getValue()).f3775a >> 32)) / 2.0f), -1.0f, 1.0f);
            }
            objM1956L6 = Float.valueOf(fM778C);
            go0Var.m1981f0(objM1956L6);
        } else {
            xk1Var = xk1Var6;
            f = 2.0f;
        }
        float fFloatValue = ((Number) objM1956L6).floatValue();
        boolean zM1982g = go0Var.m1982g(((Boolean) xk1VarM4484t.getValue()).booleanValue()) | go0Var.m1978e(((rs1) xk1Var.getValue()).f9744a) | go0Var.m1978e(((h11) xk1Var5.getValue()).f3775a);
        Object objM1956L7 = go0Var.m1956L();
        if (zM1982g || objM1956L7 == c0160eb) {
            objM1956L7 = Float.valueOf(((int) (((h11) xk1Var5.getValue()).f3775a & 4294967295L)) == 0 ? 0.0f : ci0.m778C((Float.intBitsToFloat((int) (((rs1) xk1Var.getValue()).f9744a & 4294967295L)) - (((int) (((h11) xk1Var5.getValue()).f3775a & 4294967295L)) / f)) / (((int) (((h11) xk1Var5.getValue()).f3775a & 4294967295L)) / f), -1.0f, 1.0f));
            go0Var.m1981f0(objM1956L7);
        }
        float fFloatValue2 = ((Number) objM1956L7).floatValue();
        boolean zBooleanValue2 = ((Boolean) xk1VarM4484t.getValue()).booleanValue();
        boolean z2 = this.f4100h;
        gu2 gu2VarM5481b = AbstractC0768uc.m5481b((zBooleanValue2 && z2) ? 1.0f : 0.0f, ((Boolean) xk1VarM4484t.getValue()).booleanValue() ? up0.m5528G(1.0f, 10000.0f, null, 4) : up0.m5528G(0.4f, 120.0f, null, 4), "JellyProgress", go0Var, 3072);
        final float fFloatValue3 = 1.0f - (((Number) gu2VarM5481b.getValue()).floatValue() * 0.03f);
        final float fFloatValue4 = ((Number) gu2VarM5481b.getValue()).floatValue() * (-fFloatValue2) * 6.0f;
        final float fFloatValue5 = ((Number) gu2VarM5481b.getValue()).floatValue() * fFloatValue * 6.0f;
        Object objM1956L8 = go0Var.m1956L();
        if (objM1956L8 == c0160eb) {
            objM1956L8 = new C0590pr(xk1Var5, 15);
            go0Var.m1981f0(objM1956L8);
        }
        uh1 uh1VarM1859G = gf1.m1859G(uh1Var, (in0) objM1956L8);
        Object objM1956L9 = go0Var.m1956L();
        if (objM1956L9 == c0160eb) {
            objM1956L9 = new C0590pr(xk1Var8, 16);
            go0Var.m1981f0(objM1956L9);
        }
        uh1 uh1VarM5053E = t11.m5053E(uh1VarM1859G, (in0) objM1956L9);
        Boolean boolValueOf = Boolean.valueOf(z2);
        boolean zM1982g2 = go0Var.m1982g(z2);
        Object objM1956L10 = go0Var.m1956L();
        if (zM1982g2 || objM1956L10 == c0160eb) {
            xk1Var2 = xk1Var7;
            xk1Var3 = xk1Var;
            objM1956L10 = new kp1(z2, xk1Var3, xk1Var2);
            go0Var.m1981f0(objM1956L10);
        } else {
            xk1Var2 = xk1Var7;
            xk1Var3 = xk1Var;
        }
        uh1 uh1VarM5804a = vw2.m5804a(uh1VarM5053E, boolValueOf, (PointerInputEventHandler) objM1956L10);
        boolean zM1974c = go0Var.m1974c(fFloatValue3) | go0Var.m1974c(fFloatValue4) | go0Var.m1974c(fFloatValue5);
        Object objM1956L11 = go0Var.m1956L();
        if (zM1974c || objM1956L11 == c0160eb) {
            xk1Var4 = xk1Var3;
            in0 in0Var = new in0() { // from class: ip1
                @Override // p000.in0
                /* JADX INFO: renamed from: j */
                public final Object mo5j(Object obj4) {
                    ca2 ca2Var = (ca2) obj4;
                    ca2Var.getClass();
                    float f2 = fFloatValue3;
                    ca2Var.m726k(f2);
                    ca2Var.m727l(f2);
                    xk1 xk1Var9 = xk1Var5;
                    if (((int) (((h11) xk1Var9.getValue()).f3775a >> 32)) > 0 && ((int) (((h11) xk1Var9.getValue()).f3775a & 4294967295L)) > 0) {
                        xk1 xk1Var10 = xk1Var4;
                        ca2Var.m731r(rb3.m4426a(Float.intBitsToFloat((int) (((rs1) xk1Var10.getValue()).f9744a >> 32)) / ((int) (((h11) xk1Var9.getValue()).f3775a >> 32)), Float.intBitsToFloat((int) (((rs1) xk1Var10.getValue()).f9744a & 4294967295L)) / ((int) (((h11) xk1Var9.getValue()).f3775a & 4294967295L))));
                    }
                    ca2Var.m721f(ca2Var.f1277x.mo693b() * 16.0f);
                    ca2Var.m723h(fFloatValue4);
                    ca2Var.m724i(fFloatValue5);
                    return a83.f116a;
                }
            };
            xk1Var5 = xk1Var5;
            go0Var.m1981f0(in0Var);
            objM1956L11 = in0Var;
        } else {
            xk1Var4 = xk1Var3;
        }
        uh1 uh1VarM5183L = AbstractC0731te.m5183L(uh1VarM5804a, (in0) objM1956L11);
        boolean zM1982g3 = go0Var.m1982g(zBooleanValue) | go0Var.m1984h(bs0Var);
        final int i = this.f4101i;
        boolean zM1976d = zM1982g3 | go0Var.m1976d(i);
        final in0 in0Var2 = this.f4102j;
        boolean zM1980f = go0Var.m1980f(in0Var2) | zM1976d;
        Object objM1956L12 = go0Var.m1956L();
        if (zM1980f || objM1956L12 == c0160eb) {
            final xk1 xk1Var9 = xk1Var2;
            z = z2;
            final xk1 xk1Var10 = xk1Var4;
            xm0 xm0Var = new xm0() { // from class: jp1
                /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
                @Override // p000.xm0
                /* JADX INFO: renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo6a() {
                    long jFloatToRawIntBits;
                    long jMo646M;
                    if (zBooleanValue) {
                        ((b02) bs0Var).m336a(i);
                    }
                    xk1 xk1Var11 = xk1Var9;
                    if (((Boolean) xk1Var11.getValue()).booleanValue()) {
                        jFloatToRawIntBits = ((rs1) xk1Var10.getValue()).f9744a;
                    } else {
                        xk1 xk1Var12 = xk1Var5;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((int) (((h11) xk1Var12.getValue()).f3775a >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(((int) (((h11) xk1Var12.getValue()).f3775a & 4294967295L)) / 2.0f)) & 4294967295L);
                    }
                    c61 c61Var = (c61) xk1Var8.getValue();
                    if (c61Var == null) {
                        jMo646M = 0;
                    } else {
                        if (!c61Var.mo653w()) {
                            c61Var = null;
                        }
                        if (c61Var != null) {
                            jMo646M = c61Var.mo646M(jFloatToRawIntBits);
                        }
                    }
                    xk1Var11.setValue(Boolean.FALSE);
                    in0Var2.mo5j(new rs1(jMo646M));
                    return a83.f116a;
                }
            };
            go0Var.m1981f0(xm0Var);
            objM1956L12 = xm0Var;
        } else {
            z = z2;
        }
        uh1 uh1VarM5232r = AbstractC0731te.m5232r(uh1VarM5183L, bk1Var, z, (xm0) objM1956L12);
        go0Var.m1994p(false);
        return uh1VarM5232r;
    }
}
