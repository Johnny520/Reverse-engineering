package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hp1 implements nn0 {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ in0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hp1(int i, in0 in0Var, boolean z) {
        this.h = z;
        this.i = i;
        this.j = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        xk1 xk1Var;
        float f;
        float fC;
        xk1 xk1Var2;
        xk1 xk1Var3;
        final xk1 xk1Var4;
        boolean z;
        uh1 uh1Var = (uh1) obj;
        ((Integer) obj3).getClass();
        uh1Var.getClass();
        go0 go0Var = (go0) ((px) obj2);
        go0Var.W(778348949);
        Object objL = go0Var.L();
        eb ebVar = nx.a;
        if (objL == ebVar) {
            objL = new bk1();
            go0Var.f0(objL);
        }
        bk1 bk1Var = (bk1) objL;
        xk1 xk1VarT = rg3.t(bk1Var, go0Var);
        final bs0 bs0Var = (bs0) go0Var.j(ly.l);
        go0Var.W(669038151);
        final boolean zBooleanValue = ((Boolean) go0Var.j(ur1.b)).booleanValue();
        go0Var.p(false);
        Object objL2 = go0Var.L();
        if (objL2 == ebVar) {
            objL2 = op0.u(new h11(0L));
            go0Var.f0(objL2);
        }
        final xk1 xk1Var5 = (xk1) objL2;
        Object objL3 = go0Var.L();
        if (objL3 == ebVar) {
            objL3 = op0.u(new rs1(0L));
            go0Var.f0(objL3);
        }
        xk1 xk1Var6 = (xk1) objL3;
        Object objL4 = go0Var.L();
        if (objL4 == ebVar) {
            objL4 = op0.u(Boolean.FALSE);
            go0Var.f0(objL4);
        }
        xk1 xk1Var7 = (xk1) objL4;
        Object objL5 = go0Var.L();
        if (objL5 == ebVar) {
            objL5 = op0.u(null);
            go0Var.f0(objL5);
        }
        final xk1 xk1Var8 = (xk1) objL5;
        boolean zE = go0Var.e(((rs1) xk1Var6.getValue()).a) | go0Var.g(((Boolean) xk1VarT.getValue()).booleanValue()) | go0Var.e(((h11) xk1Var5.getValue()).a);
        Object objL6 = go0Var.L();
        if (zE || objL6 == ebVar) {
            if (((int) (((h11) xk1Var5.getValue()).a >> 32)) == 0) {
                xk1Var = xk1Var6;
                fC = 0.0f;
                f = 2.0f;
            } else {
                xk1Var = xk1Var6;
                f = 2.0f;
                fC = ci0.C((Float.intBitsToFloat((int) (((rs1) xk1Var6.getValue()).a >> 32)) - (((int) (((h11) xk1Var5.getValue()).a >> 32)) / 2.0f)) / (((int) (((h11) xk1Var5.getValue()).a >> 32)) / 2.0f), -1.0f, 1.0f);
            }
            objL6 = Float.valueOf(fC);
            go0Var.f0(objL6);
        } else {
            xk1Var = xk1Var6;
            f = 2.0f;
        }
        float fFloatValue = ((Number) objL6).floatValue();
        boolean zG = go0Var.g(((Boolean) xk1VarT.getValue()).booleanValue()) | go0Var.e(((rs1) xk1Var.getValue()).a) | go0Var.e(((h11) xk1Var5.getValue()).a);
        Object objL7 = go0Var.L();
        if (zG || objL7 == ebVar) {
            objL7 = Float.valueOf(((int) (((h11) xk1Var5.getValue()).a & 4294967295L)) == 0 ? 0.0f : ci0.C((Float.intBitsToFloat((int) (((rs1) xk1Var.getValue()).a & 4294967295L)) - (((int) (((h11) xk1Var5.getValue()).a & 4294967295L)) / f)) / (((int) (((h11) xk1Var5.getValue()).a & 4294967295L)) / f), -1.0f, 1.0f));
            go0Var.f0(objL7);
        }
        float fFloatValue2 = ((Number) objL7).floatValue();
        boolean zBooleanValue2 = ((Boolean) xk1VarT.getValue()).booleanValue();
        boolean z2 = this.h;
        gu2 gu2VarB = uc.b((zBooleanValue2 && z2) ? 1.0f : 0.0f, ((Boolean) xk1VarT.getValue()).booleanValue() ? up0.G(1.0f, 10000.0f, null, 4) : up0.G(0.4f, 120.0f, null, 4), "JellyProgress", go0Var, 3072);
        final float fFloatValue3 = 1.0f - (((Number) gu2VarB.getValue()).floatValue() * 0.03f);
        final float fFloatValue4 = ((Number) gu2VarB.getValue()).floatValue() * (-fFloatValue2) * 6.0f;
        final float fFloatValue5 = ((Number) gu2VarB.getValue()).floatValue() * fFloatValue * 6.0f;
        Object objL8 = go0Var.L();
        if (objL8 == ebVar) {
            objL8 = new pr(xk1Var5, 15);
            go0Var.f0(objL8);
        }
        uh1 uh1VarG = gf1.G(uh1Var, (in0) objL8);
        Object objL9 = go0Var.L();
        if (objL9 == ebVar) {
            objL9 = new pr(xk1Var8, 16);
            go0Var.f0(objL9);
        }
        uh1 uh1VarE = t11.E(uh1VarG, (in0) objL9);
        Boolean boolValueOf = Boolean.valueOf(z2);
        boolean zG2 = go0Var.g(z2);
        Object objL10 = go0Var.L();
        if (zG2 || objL10 == ebVar) {
            xk1Var2 = xk1Var7;
            xk1Var3 = xk1Var;
            objL10 = new kp1(z2, xk1Var3, xk1Var2);
            go0Var.f0(objL10);
        } else {
            xk1Var2 = xk1Var7;
            xk1Var3 = xk1Var;
        }
        uh1 uh1VarA = vw2.a(uh1VarE, boolValueOf, (PointerInputEventHandler) objL10);
        boolean zC = go0Var.c(fFloatValue3) | go0Var.c(fFloatValue4) | go0Var.c(fFloatValue5);
        Object objL11 = go0Var.L();
        if (zC || objL11 == ebVar) {
            xk1Var4 = xk1Var3;
            in0 in0Var = new in0() { // from class: ip1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.in0
                public final Object j(Object obj4) {
                    ca2 ca2Var = (ca2) obj4;
                    ca2Var.getClass();
                    float f2 = fFloatValue3;
                    ca2Var.k(f2);
                    ca2Var.l(f2);
                    xk1 xk1Var9 = xk1Var5;
                    if (((int) (((h11) xk1Var9.getValue()).a >> 32)) > 0 && ((int) (((h11) xk1Var9.getValue()).a & 4294967295L)) > 0) {
                        xk1 xk1Var10 = xk1Var4;
                        ca2Var.r(rb3.a(Float.intBitsToFloat((int) (((rs1) xk1Var10.getValue()).a >> 32)) / ((int) (((h11) xk1Var9.getValue()).a >> 32)), Float.intBitsToFloat((int) (((rs1) xk1Var10.getValue()).a & 4294967295L)) / ((int) (((h11) xk1Var9.getValue()).a & 4294967295L))));
                    }
                    ca2Var.f(ca2Var.x.b() * 16.0f);
                    ca2Var.h(fFloatValue4);
                    ca2Var.i(fFloatValue5);
                    return a83.a;
                }
            };
            xk1Var5 = xk1Var5;
            go0Var.f0(in0Var);
            objL11 = in0Var;
        } else {
            xk1Var4 = xk1Var3;
        }
        uh1 uh1VarL = te.L(uh1VarA, (in0) objL11);
        boolean zG3 = go0Var.g(zBooleanValue) | go0Var.h(bs0Var);
        final int i = this.i;
        boolean zD = zG3 | go0Var.d(i);
        final in0 in0Var2 = this.j;
        boolean zF = go0Var.f(in0Var2) | zD;
        Object objL12 = go0Var.L();
        if (zF || objL12 == ebVar) {
            final xk1 xk1Var9 = xk1Var2;
            z = z2;
            final xk1 xk1Var10 = xk1Var4;
            xm0 xm0Var = new xm0() { // from class: jp1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
                @Override // defpackage.xm0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object a() {
                    long jFloatToRawIntBits;
                    long jM;
                    if (zBooleanValue) {
                        ((b02) bs0Var).a(i);
                    }
                    xk1 xk1Var11 = xk1Var9;
                    if (((Boolean) xk1Var11.getValue()).booleanValue()) {
                        jFloatToRawIntBits = ((rs1) xk1Var10.getValue()).a;
                    } else {
                        xk1 xk1Var12 = xk1Var5;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((int) (((h11) xk1Var12.getValue()).a >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(((int) (((h11) xk1Var12.getValue()).a & 4294967295L)) / 2.0f)) & 4294967295L);
                    }
                    c61 c61Var = (c61) xk1Var8.getValue();
                    if (c61Var == null) {
                        jM = 0;
                    } else {
                        if (!c61Var.w()) {
                            c61Var = null;
                        }
                        if (c61Var != null) {
                            jM = c61Var.M(jFloatToRawIntBits);
                        }
                    }
                    xk1Var11.setValue(Boolean.FALSE);
                    in0Var2.j(new rs1(jM));
                    return a83.a;
                }
            };
            go0Var.f0(xm0Var);
            objL12 = xm0Var;
        } else {
            z = z2;
        }
        uh1 uh1VarR = te.r(uh1VarL, bk1Var, z, (xm0) objL12);
        go0Var.p(false);
        return uh1VarR;
    }
}
