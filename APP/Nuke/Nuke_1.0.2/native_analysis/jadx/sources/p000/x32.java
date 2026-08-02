package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x32 {

    /* JADX INFO: renamed from: a */
    public static final s30 f12797a = mi1.f6656b;

    /* JADX INFO: renamed from: a */
    public static final void m6030a(uh1 uh1Var, final long j, final float f, long j2, int i, float f2, InterfaceC0596px interfaceC0596px, final int i2) {
        uh1 uh1Var2;
        final long j3;
        final int i3;
        final float f3;
        int i4;
        final long j4;
        final float f4;
        int i5;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(333154241);
        int i6 = i2 | (go0Var.m1978e(j) ? 32 : 16) | 222208;
        if (go0Var.m1958O(i6 & 1, (74899 & i6) != 74898)) {
            go0Var.m1963T();
            if ((i2 & 1) == 0 || go0Var.m2003y()) {
                i4 = i6 & (-7169);
                j4 = C0363ju.f5216f;
                f4 = 4.0f;
                i5 = 1;
            } else {
                go0Var.m1961R();
                i4 = i6 & (-7169);
                j4 = j2;
                i5 = i;
                f4 = f2;
            }
            go0Var.m1995q();
            final xv2 xv2Var = new xv2(((e70) go0Var.m1988j(AbstractC0441ly.f6382h)).mo689A(f), 0.0f, i5, 0, 26);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = new cz0();
                go0Var.m1981f0(objM1956L);
            }
            cz0 cz0Var = (cz0) objM1956L;
            cz0Var.m924a(0, go0Var);
            final az0 az0VarM3587i = op0.m3587i(cz0Var, 0.0f, 1080.0f, new zy0(up0.m5531J(6000, hd0.f3956b, 2)), go0Var);
            final az0 az0VarM3587i2 = op0.m3587i(cz0Var, 0.0f, 360.0f, new zy0(up0.m5522A(new eq1(14))), go0Var);
            p51 p51Var = new p51();
            p51Var.f7980a = 6000;
            int i7 = i4;
            p51Var.m3744a(Float.valueOf(0.87f), 3000).f7528b = f12797a;
            p51Var.m3744a(Float.valueOf(0.1f), 6000);
            final az0 az0VarM3587i3 = op0.m3587i(cz0Var, 0.1f, 0.87f, new zy0(new q51(p51Var)), go0Var);
            uh1Var2 = uh1Var;
            uh1 uh1VarM5211g0 = AbstractC0731te.m5211g0(nn2.m3321a(uh1Var2, true, new eq1(15)), 40.0f);
            boolean zM1980f = go0Var.m1980f(az0VarM3587i3) | go0Var.m1980f(az0VarM3587i) | go0Var.m1980f(az0VarM3587i2) | go0Var.m1978e(j4) | go0Var.m1984h(xv2Var) | ((((i7 & 112) ^ 48) > 32 && go0Var.m1978e(j)) || (i7 & 48) == 32);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1980f || objM1956L2 == c0160eb) {
                final int i8 = i5;
                in0 in0Var = new in0() { // from class: v32
                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj) {
                        long j5 = j4;
                        xv2 xv2Var2 = xv2Var;
                        long j6 = j;
                        nc0 nc0Var = (nc0) obj;
                        float fFloatValue = ((Number) az0VarM3587i3.getValue()).floatValue() * 360.0f;
                        int i9 = i8;
                        float f5 = f4;
                        if (i9 != 0 && Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) <= Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32))) {
                            f5 += f;
                        }
                        float fMo702x0 = (f5 / ((float) (((double) nc0Var.mo702x0(Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) az0VarM3587i2.getValue()).floatValue() + ((Number) az0VarM3587i.getValue()).floatValue();
                        long jMo3278a0 = nc0Var.mo3278a0();
                        C0043b5 c0043b5Mo3274E = nc0Var.mo3274E();
                        long jM434u = c0043b5Mo3274E.m434u();
                        c0043b5Mo3274E.m430q().mo1522l();
                        try {
                            ((C0485n4) c0043b5Mo3274E.f562i).m3247z(fFloatValue2, jMo3278a0);
                            x32.m6032c(nc0Var, Math.min(fFloatValue, fMo702x0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo702x0) * 2.0f), j5, xv2Var2);
                            x32.m6032c(nc0Var, 0.0f, fFloatValue, j6, xv2Var2);
                            vi0.m5699r(c0043b5Mo3274E, jM434u);
                            return a83.f116a;
                        } catch (Throwable th) {
                            vi0.m5699r(c0043b5Mo3274E, jM434u);
                            throw th;
                        }
                    }
                };
                go0Var.m1981f0(in0Var);
                objM1956L2 = in0Var;
            }
            AbstractC0179eu.m1448b(uh1VarM5211g0, (in0) objM1956L2, go0Var, 0);
            j3 = j4;
            i3 = i5;
            f3 = f4;
        } else {
            uh1Var2 = uh1Var;
            go0Var.m1961R();
            j3 = j2;
            i3 = i;
            f3 = f2;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            final uh1 uh1Var3 = uh1Var2;
            b62VarM1996r.f616d = new mn0(j, f, j3, i3, f3, i2) { // from class: w32

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ long f12295i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ float f12296j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ long f12297k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ int f12298l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ float f12299m;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(391);
                    x32.m6030a(this.f12294h, this.f12295i, this.f12296j, this.f12297k, this.f12298l, this.f12299m, (InterfaceC0596px) obj, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6031b(final xm0 xm0Var, final uh1 uh1Var, long j, long j2, int i, float f, in0 in0Var, InterfaceC0596px interfaceC0596px, final int i2) {
        final long j3;
        final long j4;
        final int i3;
        final float f2;
        final in0 in0Var2;
        long jM4618b;
        long jM4618b2;
        in0 in0Var3;
        int i4;
        final float f3;
        final int i5;
        final in0 in0Var4;
        final long j5;
        final long j6;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-339970038);
        int i6 = i2 | (go0Var.m1984h(xm0Var) ? 4 : 2) | 746624;
        if (go0Var.m1958O(i6 & 1, (599187 & i6) != 599186)) {
            go0Var.m1963T();
            int i7 = i2 & 1;
            C0160eb c0160eb = C0520nx.f7360a;
            if (i7 == 0 || go0Var.m2003y()) {
                jM4618b = AbstractC0670ru.m4618b(AbstractC0179eu.f2638l, go0Var);
                jM4618b2 = AbstractC0670ru.m4618b(AbstractC0179eu.f2639m, go0Var);
                boolean zM1978e = go0Var.m1978e(jM4618b);
                Object objM1956L = go0Var.m1956L();
                if (zM1978e || objM1956L == c0160eb) {
                    objM1956L = new C0082c8(jM4618b, 8);
                    go0Var.m1981f0(objM1956L);
                }
                in0Var3 = (in0) objM1956L;
                i4 = i6 & (-3678081);
                f3 = 4.0f;
                i5 = 1;
            } else {
                go0Var.m1961R();
                i4 = i6 & (-3678081);
                jM4618b = j;
                jM4618b2 = j2;
                i5 = i;
                f3 = f;
                in0Var3 = in0Var;
            }
            go0Var.m1995q();
            boolean z = (i4 & 14) == 4;
            Object objM1956L2 = go0Var.m1956L();
            if (z || objM1956L2 == c0160eb) {
                objM1956L2 = new xr0(xm0Var, 1);
                go0Var.m1981f0(objM1956L2);
            }
            final xm0 xm0Var2 = (xm0) objM1956L2;
            uh1 uh1VarMo4491c = uh1Var.mo4491c(AbstractC0567p4.f7964a);
            boolean zM1980f = go0Var.m1980f(xm0Var2);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1980f || objM1956L3 == c0160eb) {
                objM1956L3 = new gp1(xm0Var2, 1);
                go0Var.m1981f0(objM1956L3);
            }
            uh1 uh1VarM5213h0 = AbstractC0731te.m5213h0(nn2.m3321a(uh1VarMo4491c, true, (in0) objM1956L3), 240.0f, 4.0f);
            boolean zM1980f2 = go0Var.m1980f(xm0Var2) | go0Var.m1978e(jM4618b2) | go0Var.m1978e(jM4618b) | go0Var.m1980f(in0Var3);
            Object objM1956L4 = go0Var.m1956L();
            if (zM1980f2 || objM1956L4 == c0160eb) {
                in0Var4 = in0Var3;
                j5 = jM4618b;
                j6 = jM4618b2;
                in0 in0Var5 = new in0() { // from class: t32
                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj) {
                        nc0 nc0Var = (nc0) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L));
                        int i8 = i5;
                        float fMo702x0 = f3;
                        if (i8 != 0 && Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) <= Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32))) {
                            fMo702x0 += nc0Var.mo702x0(fIntBitsToFloat);
                        }
                        float fMo702x02 = fMo702x0 / nc0Var.mo702x0(Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)));
                        float fFloatValue = ((Number) xm0Var2.mo6a()).floatValue();
                        float fMin = Math.min(fFloatValue, fMo702x02) + fFloatValue;
                        if (fMin <= 1.0f) {
                            x32.m6033d(nc0Var, fMin, 1.0f, j6, fIntBitsToFloat, i8);
                        }
                        x32.m6033d(nc0Var, 0.0f, fFloatValue, j5, fIntBitsToFloat, i8);
                        in0Var4.mo5j(nc0Var);
                        return a83.f116a;
                    }
                };
                go0Var.m1981f0(in0Var5);
                objM1956L4 = in0Var5;
            } else {
                in0Var4 = in0Var3;
                j5 = jM4618b;
                j6 = jM4618b2;
            }
            AbstractC0179eu.m1448b(uh1VarM5213h0, (in0) objM1956L4, go0Var, 0);
            i3 = i5;
            f2 = f3;
            j4 = j6;
            j3 = j5;
            in0Var2 = in0Var4;
        } else {
            go0Var.m1961R();
            j3 = j;
            j4 = j2;
            i3 = i;
            f2 = f;
            in0Var2 = in0Var;
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new mn0(uh1Var, j3, j4, i3, f2, in0Var2, i2) { // from class: u32

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ uh1 f11088i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ long f11089j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ long f11090k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ int f11091l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ float f11092m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ in0 f11093n;

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3902N = pp0.m3902N(49);
                    x32.m6031b(this.f11087h, this.f11088i, this.f11089j, this.f11090k, this.f11091l, this.f11092m, this.f11093n, (InterfaceC0596px) obj, iM3902N);
                    return a83.f116a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m6032c(nc0 nc0Var, float f, float f2, long j, xv2 xv2Var) {
        float f3 = xv2Var.f13195h / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32)) - (2.0f * f3);
        nc0Var.mo3284z0(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), xv2Var);
    }

    /* JADX INFO: renamed from: d */
    public static final void m6033d(nc0 nc0Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = nc0Var.getLayoutDirection() == d61.f1885h;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            nc0Var.mo3277Y(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (496 & 16) != 0 ? 0 : 0);
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
            nc0Var.mo3277Y(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (496 & 16) != 0 ? 0 : i);
        }
    }
}
