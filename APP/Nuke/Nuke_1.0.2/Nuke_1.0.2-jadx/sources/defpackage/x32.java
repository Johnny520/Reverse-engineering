package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x32 {
    public static final s30 a = mi1.b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(uh1 uh1Var, final long j, final float f, long j2, int i, float f2, px pxVar, final int i2) {
        uh1 uh1Var2;
        final long j3;
        final int i3;
        final float f3;
        int i4;
        final long j4;
        final float f4;
        int i5;
        go0 go0Var = (go0) pxVar;
        go0Var.X(333154241);
        int i6 = i2 | (go0Var.e(j) ? 32 : 16) | 222208;
        if (go0Var.O(i6 & 1, (74899 & i6) != 74898)) {
            go0Var.T();
            if ((i2 & 1) == 0 || go0Var.y()) {
                i4 = i6 & (-7169);
                j4 = ju.f;
                f4 = 4.0f;
                i5 = 1;
            } else {
                go0Var.R();
                i4 = i6 & (-7169);
                j4 = j2;
                i5 = i;
                f4 = f2;
            }
            go0Var.q();
            final xv2 xv2Var = new xv2(((e70) go0Var.j(ly.h)).A(f), 0.0f, i5, 0, 26);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = new cz0();
                go0Var.f0(objL);
            }
            cz0 cz0Var = (cz0) objL;
            cz0Var.a(0, go0Var);
            final az0 az0VarI = op0.i(cz0Var, 0.0f, 1080.0f, new zy0(up0.J(6000, hd0.b, 2)), go0Var);
            final az0 az0VarI2 = op0.i(cz0Var, 0.0f, 360.0f, new zy0(up0.A(new eq1(14))), go0Var);
            p51 p51Var = new p51();
            p51Var.a = 6000;
            int i7 = i4;
            p51Var.a(Float.valueOf(0.87f), 3000).b = a;
            p51Var.a(Float.valueOf(0.1f), 6000);
            final az0 az0VarI3 = op0.i(cz0Var, 0.1f, 0.87f, new zy0(new q51(p51Var)), go0Var);
            uh1Var2 = uh1Var;
            uh1 uh1VarG0 = te.g0(nn2.a(uh1Var2, true, new eq1(15)), 40.0f);
            boolean zF = go0Var.f(az0VarI3) | go0Var.f(az0VarI) | go0Var.f(az0VarI2) | go0Var.e(j4) | go0Var.h(xv2Var) | ((((i7 & 112) ^ 48) > 32 && go0Var.e(j)) || (i7 & 48) == 32);
            Object objL2 = go0Var.L();
            if (zF || objL2 == ebVar) {
                final int i8 = i5;
                in0 in0Var = new in0() { // from class: v32
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj) {
                        long j5 = j4;
                        xv2 xv2Var2 = xv2Var;
                        long j6 = j;
                        nc0 nc0Var = (nc0) obj;
                        float fFloatValue = ((Number) az0VarI3.getValue()).floatValue() * 360.0f;
                        int i9 = i8;
                        float f5 = f4;
                        if (i9 != 0 && Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (nc0Var.d() >> 32))) {
                            f5 += f;
                        }
                        float fX0 = (f5 / ((float) (((double) nc0Var.x0(Float.intBitsToFloat((int) (nc0Var.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) az0VarI2.getValue()).floatValue() + ((Number) az0VarI.getValue()).floatValue();
                        long jA0 = nc0Var.a0();
                        b5 b5VarE = nc0Var.E();
                        long jU = b5VarE.u();
                        b5VarE.q().l();
                        try {
                            ((n4) b5VarE.i).z(fFloatValue2, jA0);
                            x32.c(nc0Var, Math.min(fFloatValue, fX0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fX0) * 2.0f), j5, xv2Var2);
                            x32.c(nc0Var, 0.0f, fFloatValue, j6, xv2Var2);
                            vi0.r(b5VarE, jU);
                            return a83.a;
                        } catch (Throwable th) {
                            vi0.r(b5VarE, jU);
                            throw th;
                        }
                    }
                };
                go0Var.f0(in0Var);
                objL2 = in0Var;
            }
            eu.b(uh1VarG0, (in0) objL2, go0Var, 0);
            j3 = j4;
            i3 = i5;
            f3 = f4;
        } else {
            uh1Var2 = uh1Var;
            go0Var.R();
            j3 = j2;
            i3 = i;
            f3 = f2;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            final uh1 uh1Var3 = uh1Var2;
            b62VarR.d = new mn0(j, f, j3, i3, f3, i2) { // from class: w32
                public final /* synthetic */ long i;
                public final /* synthetic */ float j;
                public final /* synthetic */ long k;
                public final /* synthetic */ int l;
                public final /* synthetic */ float m;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(391);
                    x32.a(this.h, this.i, this.j, this.k, this.l, this.m, (px) obj, iN);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(final xm0 xm0Var, final uh1 uh1Var, long j, long j2, int i, float f, in0 in0Var, px pxVar, final int i2) {
        final long j3;
        final long j4;
        final int i3;
        final float f2;
        final in0 in0Var2;
        long jB;
        long jB2;
        in0 in0Var3;
        int i4;
        final float f3;
        final int i5;
        final in0 in0Var4;
        final long j5;
        final long j6;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-339970038);
        int i6 = i2 | (go0Var.h(xm0Var) ? 4 : 2) | 746624;
        if (go0Var.O(i6 & 1, (599187 & i6) != 599186)) {
            go0Var.T();
            int i7 = i2 & 1;
            eb ebVar = nx.a;
            if (i7 == 0 || go0Var.y()) {
                jB = ru.b(eu.l, go0Var);
                jB2 = ru.b(eu.m, go0Var);
                boolean zE = go0Var.e(jB);
                Object objL = go0Var.L();
                if (zE || objL == ebVar) {
                    objL = new c8(jB, 8);
                    go0Var.f0(objL);
                }
                in0Var3 = (in0) objL;
                i4 = i6 & (-3678081);
                f3 = 4.0f;
                i5 = 1;
            } else {
                go0Var.R();
                i4 = i6 & (-3678081);
                jB = j;
                jB2 = j2;
                i5 = i;
                f3 = f;
                in0Var3 = in0Var;
            }
            go0Var.q();
            boolean z = (i4 & 14) == 4;
            Object objL2 = go0Var.L();
            if (z || objL2 == ebVar) {
                objL2 = new xr0(xm0Var, 1);
                go0Var.f0(objL2);
            }
            final xm0 xm0Var2 = (xm0) objL2;
            uh1 uh1VarC = uh1Var.c(p4.a);
            boolean zF = go0Var.f(xm0Var2);
            Object objL3 = go0Var.L();
            if (zF || objL3 == ebVar) {
                objL3 = new gp1(xm0Var2, 1);
                go0Var.f0(objL3);
            }
            uh1 uh1VarH0 = te.h0(nn2.a(uh1VarC, true, (in0) objL3), 240.0f, 4.0f);
            boolean zF2 = go0Var.f(xm0Var2) | go0Var.e(jB2) | go0Var.e(jB) | go0Var.f(in0Var3);
            Object objL4 = go0Var.L();
            if (zF2 || objL4 == ebVar) {
                in0Var4 = in0Var3;
                j5 = jB;
                j6 = jB2;
                in0 in0Var5 = new in0() { // from class: t32
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj) {
                        nc0 nc0Var = (nc0) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L));
                        int i8 = i5;
                        float fX0 = f3;
                        if (i8 != 0 && Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (nc0Var.d() >> 32))) {
                            fX0 += nc0Var.x0(fIntBitsToFloat);
                        }
                        float fX02 = fX0 / nc0Var.x0(Float.intBitsToFloat((int) (nc0Var.d() >> 32)));
                        float fFloatValue = ((Number) xm0Var2.a()).floatValue();
                        float fMin = Math.min(fFloatValue, fX02) + fFloatValue;
                        if (fMin <= 1.0f) {
                            x32.d(nc0Var, fMin, 1.0f, j6, fIntBitsToFloat, i8);
                        }
                        x32.d(nc0Var, 0.0f, fFloatValue, j5, fIntBitsToFloat, i8);
                        in0Var4.j(nc0Var);
                        return a83.a;
                    }
                };
                go0Var.f0(in0Var5);
                objL4 = in0Var5;
            } else {
                in0Var4 = in0Var3;
                j5 = jB;
                j6 = jB2;
            }
            eu.b(uh1VarH0, (in0) objL4, go0Var, 0);
            i3 = i5;
            f2 = f3;
            j4 = j6;
            j3 = j5;
            in0Var2 = in0Var4;
        } else {
            go0Var.R();
            j3 = j;
            j4 = j2;
            i3 = i;
            f2 = f;
            in0Var2 = in0Var;
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new mn0(uh1Var, j3, j4, i3, f2, in0Var2, i2) { // from class: u32
                public final /* synthetic */ uh1 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ int l;
                public final /* synthetic */ float m;
                public final /* synthetic */ in0 n;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = pp0.N(49);
                    x32.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (px) obj, iN);
                    return a83.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(nc0 nc0Var, float f, float f2, long j, xv2 xv2Var) {
        float f3 = xv2Var.h / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.d() >> 32)) - (2.0f * f3);
        nc0Var.z0(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), xv2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(nc0 nc0Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = nc0Var.getLayoutDirection() == d61.h;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            nc0Var.Y(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (496 & 16) != 0 ? 0 : 0);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            nc0Var.Y(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (496 & 16) != 0 ? 0 : i);
        }
    }
}
