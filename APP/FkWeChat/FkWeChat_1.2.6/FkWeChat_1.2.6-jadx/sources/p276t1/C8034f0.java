package p276t1;

import java.util.Arrays;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5102r;
import p239q5.C6264o;
import p265s1.AbstractC7138s1;
import p276t1.C8034f0;
import p376zd.C9987e;

/* JADX INFO: renamed from: t1.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8034f0 extends AbstractC8027c {

    /* JADX INFO: renamed from: t */
    public static final a f26762t = new a(null);

    /* JADX INFO: renamed from: u */
    public static final int f26763u = 8;

    /* JADX INFO: renamed from: v */
    public static final InterfaceC8046n f26764v = new InterfaceC8046n() { // from class: t1.u
        @Override // p276t1.InterfaceC8046n
        /* JADX INFO: renamed from: a */
        public final double mo30836a(double d10) {
            return C8034f0.m30879n(d10);
        }
    };

    /* JADX INFO: renamed from: e */
    public final C8040i0 f26765e;

    /* JADX INFO: renamed from: f */
    public final float f26766f;

    /* JADX INFO: renamed from: g */
    public final float f26767g;

    /* JADX INFO: renamed from: h */
    public final C8036g0 f26768h;

    /* JADX INFO: renamed from: i */
    public final float[] f26769i;

    /* JADX INFO: renamed from: j */
    public final float[] f26770j;

    /* JADX INFO: renamed from: k */
    public final float[] f26771k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC8046n f26772l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC0184l f26773m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC8046n f26774n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC8046n f26775o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC0184l f26776p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC8046n f26777q;

    /* JADX INFO: renamed from: r */
    public final boolean f26778r;

    /* JADX INFO: renamed from: s */
    public final boolean f26779s;

    /* JADX INFO: renamed from: t1.f0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {
        public b() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final Double m30917a(double d10) {
            return Double.valueOf(C8034f0.this.m30887t().mo30836a(AbstractC2368o.m8584k(d10, C8034f0.this.f26766f, C8034f0.this.f26767g)));
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m30917a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: t1.f0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0184l {
        public c() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final Double m30918a(double d10) {
            return Double.valueOf(AbstractC2368o.m8584k(C8034f0.this.m30891x().mo30836a(d10), C8034f0.this.f26766f, C8034f0.this.f26767g));
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m30918a(((Number) obj).doubleValue());
        }
    }

    public C8034f0(String str, float[] fArr, C8040i0 c8040i0, float[] fArr2, InterfaceC8046n interfaceC8046n, InterfaceC8046n interfaceC8046n2, float f10, float f11, C8036g0 c8036g0, int i10) {
        super(str, AbstractC8025b.f26749a.m30846b(), i10, null);
        this.f26765e = c8040i0;
        this.f26766f = f10;
        this.f26767g = f11;
        this.f26768h = c8036g0;
        this.f26772l = interfaceC8046n;
        this.f26773m = new c();
        this.f26774n = new InterfaceC8046n() { // from class: t1.s
            @Override // p276t1.InterfaceC8046n
            /* JADX INFO: renamed from: a */
            public final double mo30836a(double d10) {
                return C8034f0.m30876k(this.f26856a, d10);
            }
        };
        this.f26775o = interfaceC8046n2;
        this.f26776p = new b();
        this.f26777q = new InterfaceC8046n() { // from class: t1.t
            @Override // p276t1.InterfaceC8046n
            /* JADX INFO: renamed from: a */
            public final double mo30836a(double d10) {
                return C8034f0.m30878m(this.f26857a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            C9987e.m38645a("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        a aVar = f26762t;
        float[] fArrM30916w = aVar.m30916w(fArr);
        this.f26769i = fArrM30916w;
        if (fArr2 == null) {
            this.f26770j = aVar.m30910q(fArrM30916w, c8040i0);
        } else {
            if (fArr2.length != 9) {
                C6264o.m24729a("Transform must have 9 entries! Has ", fArr2.length);
                throw null;
            }
            this.f26770j = fArr2;
        }
        this.f26771k = AbstractC8029d.m30868k(this.f26770j);
        this.f26778r = aVar.m30915v(fArrM30916w, f10, f11);
        this.f26779s = aVar.m30914u(fArrM30916w, c8040i0, interfaceC8046n, interfaceC8046n2, f10, f11, i10);
    }

    /* JADX INFO: renamed from: k */
    public static double m30876k(C8034f0 c8034f0, double d10) {
        return AbstractC2368o.m8584k(c8034f0.f26772l.mo30836a(d10), c8034f0.f26766f, c8034f0.f26767g);
    }

    /* JADX INFO: renamed from: l */
    public static double m30877l(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: renamed from: m */
    public static double m30878m(C8034f0 c8034f0, double d10) {
        return c8034f0.f26775o.mo30836a(AbstractC2368o.m8584k(d10, c8034f0.f26766f, c8034f0.f26767g));
    }

    /* JADX INFO: renamed from: o */
    public static double m30880o(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    /* JADX INFO: renamed from: A */
    public final float[] m30883A() {
        return this.f26770j;
    }

    /* JADX INFO: renamed from: B */
    public final C8040i0 m30884B() {
        return this.f26765e;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: c */
    public float mo30850c(int i10) {
        return this.f26767g;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: d */
    public float mo30851d(int i10) {
        return this.f26766f;
    }

    @Override // p276t1.AbstractC8027c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8034f0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C8034f0 c8034f0 = (C8034f0) obj;
        if (Float.compare(c8034f0.f26766f, this.f26766f) != 0 || Float.compare(c8034f0.f26767g, this.f26767g) != 0 || !AbstractC1061t.m3842c(this.f26765e, c8034f0.f26765e) || !Arrays.equals(this.f26769i, c8034f0.f26769i)) {
            return false;
        }
        C8036g0 c8036g0 = this.f26768h;
        C8036g0 c8036g02 = c8034f0.f26768h;
        if (c8036g0 != null) {
            return AbstractC1061t.m3842c(c8036g0, c8036g02);
        }
        if (c8036g02 == null) {
            return true;
        }
        if (AbstractC1061t.m3842c(this.f26772l, c8034f0.f26772l)) {
            return AbstractC1061t.m3842c(this.f26775o, c8034f0.f26775o);
        }
        return false;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: g */
    public boolean mo30854g() {
        return this.f26779s;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: h */
    public long mo30855h(float f10, float f11, float f12) {
        float fMo30836a = (float) this.f26777q.mo30836a(f10);
        float fMo30836a2 = (float) this.f26777q.mo30836a(f11);
        float fMo30836a3 = (float) this.f26777q.mo30836a(f12);
        float[] fArr = this.f26770j;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((fArr[0] * fMo30836a) + (fArr[3] * fMo30836a2)) + (fArr[6] * fMo30836a3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fMo30836a) + (fArr[4] * fMo30836a2) + (fArr[7] * fMo30836a3))) & 4294967295L);
    }

    @Override // p276t1.AbstractC8027c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f26765e.hashCode()) * 31) + Arrays.hashCode(this.f26769i)) * 31;
        float f10 = this.f26766f;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f26767g;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        C8036g0 c8036g0 = this.f26768h;
        int iHashCode2 = iFloatToIntBits2 + (c8036g0 != null ? c8036g0.hashCode() : 0);
        return this.f26768h == null ? (((iHashCode2 * 31) + this.f26772l.hashCode()) * 31) + this.f26775o.hashCode() : iHashCode2;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: i */
    public float mo30856i(float f10, float f11, float f12) {
        float fMo30836a = (float) this.f26777q.mo30836a(f10);
        float fMo30836a2 = (float) this.f26777q.mo30836a(f11);
        float fMo30836a3 = (float) this.f26777q.mo30836a(f12);
        float[] fArr = this.f26770j;
        return (fArr[2] * fMo30836a) + (fArr[5] * fMo30836a2) + (fArr[8] * fMo30836a3);
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: j */
    public long mo30857j(float f10, float f11, float f12, float f13, AbstractC8027c abstractC8027c) {
        float[] fArr = this.f26771k;
        return AbstractC7138s1.m28197a((float) this.f26774n.mo30836a((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12)), (float) this.f26774n.mo30836a((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12)), (float) this.f26774n.mo30836a((fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12)), f13, abstractC8027c);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC0184l m30885r() {
        return this.f26776p;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC8046n m30886s() {
        return this.f26777q;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC8046n m30887t() {
        return this.f26775o;
    }

    /* JADX INFO: renamed from: u */
    public final float[] m30888u() {
        return this.f26771k;
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC0184l m30889v() {
        return this.f26773m;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC8046n m30890w() {
        return this.f26774n;
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC8046n m30891x() {
        return this.f26772l;
    }

    /* JADX INFO: renamed from: y */
    public final float[] m30892y() {
        return this.f26769i;
    }

    /* JADX INFO: renamed from: z */
    public final C8036g0 m30893z() {
        return this.f26768h;
    }

    /* JADX INFO: renamed from: t1.f0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static double m30894a(C8036g0 c8036g0, double d10) {
            return C8043k.f26795a.m30942D(c8036g0, d10);
        }

        /* JADX INFO: renamed from: b */
        public static double m30895b(C8036g0 c8036g0, double d10) {
            return AbstractC8029d.m30874q(d10, c8036g0.m30919a(), c8036g0.m30920b(), c8036g0.m30921c(), c8036g0.m30922d(), c8036g0.m30925g());
        }

        /* JADX INFO: renamed from: c */
        public static double m30896c(C8036g0 c8036g0, double d10) {
            return AbstractC8029d.m30873p(d10, c8036g0.m30919a(), c8036g0.m30920b(), c8036g0.m30921c(), c8036g0.m30922d(), c8036g0.m30923e(), c8036g0.m30924f(), c8036g0.m30925g());
        }

        /* JADX INFO: renamed from: d */
        public static double m30897d(C8036g0 c8036g0, double d10) {
            return C8043k.f26795a.m30944F(c8036g0, d10);
        }

        /* JADX INFO: renamed from: e */
        public static double m30898e(C8036g0 c8036g0, double d10) {
            return C8043k.f26795a.m30945G(c8036g0, d10);
        }

        /* JADX INFO: renamed from: f */
        public static double m30899f(C8036g0 c8036g0, double d10) {
            return C8043k.f26795a.m30943E(c8036g0, d10);
        }

        /* JADX INFO: renamed from: g */
        public static double m30900g(C8036g0 c8036g0, double d10) {
            return AbstractC8029d.m30875r(d10, c8036g0.m30919a(), c8036g0.m30920b(), c8036g0.m30921c(), c8036g0.m30922d(), c8036g0.m30923e(), c8036g0.m30924f(), c8036g0.m30925g());
        }

        /* JADX INFO: renamed from: h */
        public static double m30901h(C8036g0 c8036g0, double d10) {
            return AbstractC8029d.m30872o(d10, c8036g0.m30919a(), c8036g0.m30920b(), c8036g0.m30921c(), c8036g0.m30922d(), c8036g0.m30925g());
        }

        /* JADX INFO: renamed from: o */
        public final float m30908o(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m30909p(double d10, InterfaceC8046n interfaceC8046n, InterfaceC8046n interfaceC8046n2) {
            return Math.abs(interfaceC8046n.mo30836a(d10) - interfaceC8046n2.mo30836a(d10)) <= 0.001d;
        }

        /* JADX INFO: renamed from: q */
        public final float[] m30910q(float[] fArr, C8040i0 c8040i0) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float fM30930a = c8040i0.m30930a();
            float fM30931b = c8040i0.m30931b();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - fM30930a) / fM30931b;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (fM30930a / fM30931b) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        /* JADX INFO: renamed from: r */
        public final boolean m30911r(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[2];
            float f15 = fArr2[2];
            float f16 = fArr[3];
            float f17 = fArr2[3];
            float f18 = fArr[4];
            float f19 = fArr2[4];
            float f20 = fArr[5];
            float f21 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, f14 - f15, f16 - f17, f18 - f19, f20 - f21};
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            if (((f13 - f21) * f22) - ((f11 - f19) * f23) >= 0.0f && ((f11 - f15) * f23) - ((f13 - f17) * f22) >= 0.0f) {
                float f24 = fArr3[2];
                float f25 = fArr3[3];
                if (((f17 - f13) * f24) - ((f15 - f11) * f25) >= 0.0f && ((f15 - f19) * f25) - ((f17 - f21) * f24) >= 0.0f) {
                    float f26 = fArr3[4];
                    float f27 = fArr3[5];
                    if (((f21 - f17) * f26) - ((f19 - f15) * f27) >= 0.0f && ((f19 - f11) * f27) - ((f21 - f13) * f26) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: s */
        public final InterfaceC8046n m30912s(final C8036g0 c8036g0) {
            return c8036g0.m30926h() ? new InterfaceC8046n() { // from class: t1.x
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d10) {
                    return C8034f0.a.m30894a(c8036g0, d10);
                }
            } : c8036g0.m30927i() ? new InterfaceC8046n() { // from class: t1.y
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d10) {
                    return C8034f0.a.m30897d(c8036g0, d10);
                }
            } : (c8036g0.m30923e() == 0.0d && c8036g0.m30924f() == 0.0d) ? new InterfaceC8046n() { // from class: t1.z
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d10) {
                    return C8034f0.a.m30895b(c8036g0, d10);
                }
            } : new InterfaceC8046n() { // from class: t1.a0
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d10) {
                    return C8034f0.a.m30900g(c8036g0, d10);
                }
            };
        }

        /* JADX INFO: renamed from: t */
        public final InterfaceC8046n m30913t(final C8036g0 c8036g0) {
            return c8036g0.m30926h() ? new InterfaceC8046n() { // from class: t1.b0
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d10) {
                    return C8034f0.a.m30899f(c8036g0, d10);
                }
            } : c8036g0.m30927i() ? new InterfaceC8046n() { // from class: t1.c0
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d10) {
                    return C8034f0.a.m30898e(c8036g0, d10);
                }
            } : (c8036g0.m30923e() == 0.0d && c8036g0.m30924f() == 0.0d) ? new InterfaceC8046n() { // from class: t1.d0
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d10) {
                    return C8034f0.a.m30901h(c8036g0, d10);
                }
            } : new InterfaceC8046n() { // from class: t1.e0
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d10) {
                    return C8034f0.a.m30896c(c8036g0, d10);
                }
            };
        }

        /* JADX INFO: renamed from: u */
        public final boolean m30914u(float[] fArr, C8040i0 c8040i0, InterfaceC8046n interfaceC8046n, InterfaceC8046n interfaceC8046n2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            C8043k c8043k = C8043k.f26795a;
            if (!AbstractC8029d.m30864g(fArr, c8043k.m30940B()) || !AbstractC8029d.m30863f(c8040i0, C8047o.f26833a.m30976e()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            C8034f0 c8034f0M30939A = c8043k.m30939A();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!m30909p(d10, interfaceC8046n, c8034f0M30939A.m30891x()) || !m30909p(d10, interfaceC8046n2, c8034f0M30939A.m30887t())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: v */
        public final boolean m30915v(float[] fArr, float f10, float f11) {
            float fM30908o = m30908o(fArr);
            C8043k c8043k = C8043k.f26795a;
            if (fM30908o / m30908o(c8043k.m30962w()) <= 0.9f || !m30911r(fArr, c8043k.m30940B())) {
                return f10 < 0.0f && f11 > 1.0f;
            }
            return true;
        }

        /* JADX INFO: renamed from: w */
        public final float[] m30916w(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                AbstractC5102r.m20662n(fArr, fArr2, 0, 0, 6, 6, null);
                return fArr2;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = f10 + f11 + fArr[2];
            fArr2[0] = f10 / f12;
            fArr2[1] = f11 / f12;
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = f13 + f14 + fArr[5];
            fArr2[2] = f13 / f15;
            fArr2[3] = f14 / f15;
            float f16 = fArr[6];
            float f17 = fArr[7];
            float f18 = f16 + f17 + fArr[8];
            fArr2[4] = f16 / f18;
            fArr2[5] = f17 / f18;
            return fArr2;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: n */
    public static double m30879n(double d10) {
        return d10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8034f0(String str, float[] fArr, C8040i0 c8040i0, C8036g0 c8036g0, int i10) {
        a aVar = f26762t;
        this(str, fArr, c8040i0, null, aVar.m30913t(c8036g0), aVar.m30912s(c8036g0), 0.0f, 1.0f, c8036g0, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8034f0(String str, float[] fArr, C8040i0 c8040i0, final double d10, float f10, float f11, int i10) {
        InterfaceC8046n interfaceC8046n;
        InterfaceC8046n interfaceC8046n2;
        if (d10 == 1.0d) {
            interfaceC8046n = f26764v;
        } else {
            interfaceC8046n = new InterfaceC8046n() { // from class: t1.v
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d11) {
                    return C8034f0.m30877l(d10, d11);
                }
            };
        }
        InterfaceC8046n interfaceC8046n3 = interfaceC8046n;
        if (d10 == 1.0d) {
            interfaceC8046n2 = f26764v;
        } else {
            interfaceC8046n2 = new InterfaceC8046n() { // from class: t1.w
                @Override // p276t1.InterfaceC8046n
                /* JADX INFO: renamed from: a */
                public final double mo30836a(double d11) {
                    return C8034f0.m30880o(d10, d11);
                }
            };
        }
        this(str, fArr, c8040i0, null, interfaceC8046n3, interfaceC8046n2, f10, f11, new C8036g0(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    public C8034f0(C8034f0 c8034f0, float[] fArr, C8040i0 c8040i0) {
        this(c8034f0.m30853f(), c8034f0.f26769i, c8040i0, fArr, c8034f0.f26772l, c8034f0.f26775o, c8034f0.f26766f, c8034f0.f26767g, c8034f0.f26768h, -1);
    }
}
