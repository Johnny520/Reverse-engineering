package p089g1;

import gg.AbstractC1416l;
import java.util.Arrays;
import p071f1.AbstractC0996c0;
import p136j8.C2104o;

/* JADX INFO: renamed from: g1.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1289r extends AbstractC1274c {

    /* JADX INFO: renamed from: r */
    public static final C1275d f4287r = new C1275d(4);

    /* JADX INFO: renamed from: d */
    public final C1291t f4288d;

    /* JADX INFO: renamed from: e */
    public final float f4289e;

    /* JADX INFO: renamed from: f */
    public final float f4290f;

    /* JADX INFO: renamed from: g */
    public final C1290s f4291g;

    /* JADX INFO: renamed from: h */
    public final float[] f4292h;

    /* JADX INFO: renamed from: i */
    public final float[] f4293i;

    /* JADX INFO: renamed from: j */
    public final float[] f4294j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1281j f4295k;

    /* JADX INFO: renamed from: l */
    public final C1288q f4296l;

    /* JADX INFO: renamed from: m */
    public final C1285n f4297m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC1281j f4298n;

    /* JADX INFO: renamed from: o */
    public final C1288q f4299o;

    /* JADX INFO: renamed from: p */
    public final C1285n f4300p;

    /* JADX INFO: renamed from: q */
    public final boolean f4301q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x01e8 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0262 A[EDGE_INSN: B:68:0x0262->B:69:0x0264 BREAK  A[LOOP:1: B:61:0x022a->B:67:0x025b], EDGE_INSN: B:75:0x0262->B:68:0x0262 BREAK  A[LOOP:0: B:46:0x01f3->B:52:0x0210]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1289r(String str, float[] fArr, C1291t c1291t, float[] fArr2, InterfaceC1281j interfaceC1281j, InterfaceC1281j interfaceC1281j2, float f3, float f10, C1290s c1290s, int i9) {
        int i10;
        float f11;
        float f12;
        double d10;
        super(i9, str, AbstractC1273b.f4226a);
        this.f4288d = c1291t;
        this.f4289e = f3;
        this.f4290f = f10;
        this.f4291g = c1290s;
        this.f4295k = interfaceC1281j;
        boolean z9 = 1;
        z9 = 1;
        this.f4296l = new C1288q(this, z9 ? 1 : 0);
        int i11 = 0;
        this.f4297m = new C1285n(this, i11);
        this.f4298n = interfaceC1281j2;
        this.f4299o = new C1288q(this, i11);
        this.f4300p = new C1285n(this, z9 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            C2104o.m5294t("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f3 >= f10) {
            throw new IllegalArgumentException("Invalid range: min=" + f3 + ", max=" + f10 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = f13 + f14 + fArr[2];
            fArr3[0] = f13 / f15;
            fArr3[1] = f14 / f15;
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = f16 + f17 + fArr[5];
            fArr3[2] = f16 / f18;
            fArr3[3] = f17 / f18;
            float f19 = fArr[6];
            float f20 = fArr[7];
            float f21 = f19 + f20 + fArr[8];
            fArr3[4] = f19 / f21;
            fArr3[5] = f20 / f21;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.f4292h = fArr3;
        if (fArr2 == null) {
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr3[2];
            float f25 = fArr3[3];
            float f26 = fArr3[4];
            float f27 = fArr3[5];
            f11 = 1.0f;
            float f28 = c1291t.f4309a;
            i10 = 0;
            float f29 = c1291t.f4310b;
            float f30 = 1;
            float f31 = (f30 - f22) / f23;
            float f32 = (f30 - f24) / f25;
            float f33 = (f30 - f26) / f27;
            float f34 = (f30 - f28) / f29;
            float f35 = f22 / f23;
            float f36 = (f24 / f25) - f35;
            float f37 = (f28 / f29) - f35;
            float f38 = f32 - f31;
            float f39 = (f26 / f27) - f35;
            float f40 = (((f34 - f31) * f36) - (f37 * f38)) / (((f33 - f31) * f36) - (f38 * f39));
            float f41 = (f37 - (f39 * f40)) / f36;
            float f42 = (1.0f - f41) - f40;
            float f43 = f42 / f23;
            float f44 = f41 / f25;
            float f45 = f40 / f27;
            this.f4293i = new float[]{f43 * f22, f42, ((1.0f - f22) - f23) * f43, f44 * f24, f41, ((1.0f - f24) - f25) * f44, f45 * f26, f40, ((1.0f - f26) - f27) * f45};
        } else {
            i10 = 0;
            f11 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f4293i = fArr2;
        }
        this.f4294j = AbstractC1282k.m3427f(this.f4293i);
        float fM3423b = AbstractC1282k.m3423b(fArr3);
        float[] fArr4 = C1276e.f4236a;
        if (fM3423b / AbstractC1282k.m3423b(C1276e.f4237b) > 0.9f) {
            float[] fArr5 = C1276e.f4236a;
            float f46 = fArr3[i10];
            float f47 = fArr5[i10];
            float f48 = fArr3[1];
            float f49 = fArr5[1];
            float f50 = fArr3[2];
            float f51 = fArr5[2];
            float f52 = fArr3[3];
            float f53 = fArr5[3];
            float f54 = fArr3[4];
            float f55 = fArr5[4];
            float f56 = fArr3[5];
            float f57 = fArr5[5];
            f12 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[i10] = f46 - f47;
            fArr6[1] = f48 - f49;
            fArr6[2] = f50 - f51;
            fArr6[3] = f52 - f53;
            fArr6[4] = f54 - f55;
            fArr6[5] = f56 - f57;
            float f58 = fArr6[i10];
            float f59 = fArr6[1];
            if (((f49 - f57) * f58) - ((f47 - f55) * f59) >= 0.0f && ((f47 - f51) * f59) - ((f49 - f53) * f58) >= 0.0f) {
                float f60 = fArr6[2];
                float f61 = fArr6[3];
                if (((f53 - f49) * f60) - ((f51 - f47) * f61) >= 0.0f && ((f51 - f55) * f61) - ((f53 - f57) * f60) >= 0.0f) {
                    float f62 = fArr6[4];
                    float f63 = fArr6[5];
                    if (((f57 - f53) * f62) - ((f55 - f51) * f63) < 0.0f || ((f55 - f47) * f63) - ((f57 - f49) * f62) < 0.0f) {
                    }
                }
            }
            if (i9 != 0) {
                float[] fArr7 = C1276e.f4236a;
                if (fArr3 != fArr7) {
                    for (int i12 = i10; i12 < 6; i12++) {
                        if (Float.compare(fArr3[i12], fArr7[i12]) != 0 && Math.abs(fArr3[i12] - fArr7[i12]) > 0.001f) {
                            break;
                        }
                    }
                    if (!AbstractC1282k.m3425d(c1291t, AbstractC1282k.f4272d)) {
                        float[] fArr8 = C1276e.f4236a;
                        C1289r c1289r = C1276e.f4240e;
                        while (d10 <= 1.0d) {
                        }
                    }
                } else {
                    if (!AbstractC1282k.m3425d(c1291t, AbstractC1282k.f4272d) || f3 != f12 || f10 != f11) {
                        z9 = i10;
                        break;
                    }
                    float[] fArr82 = C1276e.f4236a;
                    C1289r c1289r2 = C1276e.f4240e;
                    for (d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                        if (Math.abs(interfaceC1281j.mo469c(d10) - c1289r2.f4295k.mo469c(d10)) > 0.001d || Math.abs(interfaceC1281j2.mo469c(d10) - c1289r2.f4298n.mo469c(d10)) > 0.001d) {
                            z9 = i10;
                            break;
                        }
                    }
                }
            }
            this.f4301q = z9;
        }
        f12 = 0.0f;
        int i13 = (f3 > f12 ? 1 : (f3 == f12 ? 0 : -1));
        if (i9 != 0) {
        }
        this.f4301q = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: a */
    public final float mo3404a(int i9) {
        return this.f4290f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: b */
    public final float mo3405b(int i9) {
        return this.f4289e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: c */
    public final boolean mo3406c() {
        return this.f4301q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: d */
    public final long mo3407d(float f3, float f10, float f11) {
        double d10 = f3;
        C1285n c1285n = this.f4300p;
        float fMo469c = (float) c1285n.mo469c(d10);
        float fMo469c2 = (float) c1285n.mo469c(f10);
        float fMo469c3 = (float) c1285n.mo469c(f11);
        float[] fArr = this.f4293i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f12 = (fArr[6] * fMo469c3) + (fArr[3] * fMo469c2) + (fArr[0] * fMo469c);
        return (((long) Float.floatToRawIntBits((fArr[7] * fMo469c3) + (fArr[4] * fMo469c2) + (fArr[1] * fMo469c))) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: e */
    public final float mo3408e(float f3, float f10, float f11) {
        double d10 = f3;
        C1285n c1285n = this.f4300p;
        float fMo469c = (float) c1285n.mo469c(d10);
        float fMo469c2 = (float) c1285n.mo469c(f10);
        float fMo469c3 = (float) c1285n.mo469c(f11);
        float[] fArr = this.f4293i;
        return (fArr[8] * fMo469c3) + (fArr[5] * fMo469c2) + (fArr[2] * fMo469c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1289r.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1289r c1289r = (C1289r) obj;
        if (Float.compare(c1289r.f4289e, this.f4289e) != 0 || Float.compare(c1289r.f4290f, this.f4290f) != 0 || !AbstractC1416l.m3825a(this.f4288d, c1289r.f4288d) || !Arrays.equals(this.f4292h, c1289r.f4292h)) {
            return false;
        }
        C1290s c1290s = c1289r.f4291g;
        C1290s c1290s2 = this.f4291g;
        if (c1290s2 != null) {
            return AbstractC1416l.m3825a(c1290s2, c1290s);
        }
        if (c1290s == null) {
            return true;
        }
        if (AbstractC1416l.m3825a(this.f4295k, c1289r.f4295k)) {
            return AbstractC1416l.m3825a(this.f4298n, c1289r.f4298n);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: f */
    public final long mo3409f(float f3, float f10, float f11, float f12, AbstractC1274c abstractC1274c) {
        float[] fArr = this.f4294j;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
        C1285n c1285n = this.f4297m;
        return AbstractC0996c0.m2506b((float) c1285n.mo469c(f13), (float) c1285n.mo469c(f14), (float) c1285n.mo469c(f15), f12, abstractC1274c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f4292h) + ((this.f4288d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f3 = this.f4289e;
        int iFloatToIntBits = (iHashCode + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        float f10 = this.f4290f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        C1290s c1290s = this.f4291g;
        int iHashCode2 = iFloatToIntBits2 + (c1290s != null ? c1290s.hashCode() : 0);
        if (c1290s == null) {
            return this.f4298n.hashCode() + ((this.f4295k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public C1289r(String str, float[] fArr, C1291t c1291t, final C1290s c1290s, int i9) {
        InterfaceC1281j interfaceC1281j;
        InterfaceC1281j interfaceC1281j2;
        double d10 = c1290s.f4302a;
        boolean z9 = d10 == -3.0d;
        double d11 = c1290s.f4308g;
        double d12 = c1290s.f4307f;
        if (z9) {
            final int i10 = 4;
            interfaceC1281j = new InterfaceC1281j() { // from class: g1.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d13) {
                    int i11 = i10;
                    C1290s c1290s2 = c1290s;
                    switch (i11) {
                        case 0:
                            float[] fArr2 = C1276e.f4236a;
                            return C1276e.m3417a(c1290s2, d13);
                        case 1:
                            float[] fArr3 = C1276e.f4236a;
                            return C1276e.m3419c(c1290s2, d13);
                        case 2:
                            double d14 = c1290s2.f4303b;
                            return d13 >= c1290s2.f4306e ? Math.pow((d14 * d13) + c1290s2.f4304c, c1290s2.f4302a) : d13 * c1290s2.f4305d;
                        case 3:
                            double d15 = c1290s2.f4303b;
                            double d16 = c1290s2.f4304c;
                            double d17 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e ? Math.pow((d15 * d13) + d16, c1290s2.f4302a) + c1290s2.f4307f : (d17 * d13) + c1290s2.f4308g;
                        case 4:
                            float[] fArr4 = C1276e.f4236a;
                            return C1276e.m3418b(c1290s2, d13);
                        case 5:
                            float[] fArr5 = C1276e.f4236a;
                            return C1276e.m3420d(c1290s2, d13);
                        case 6:
                            double d18 = c1290s2.f4303b;
                            double d19 = c1290s2.f4304c;
                            double d20 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d20 ? (Math.pow(d13, 1.0d / c1290s2.f4302a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = c1290s2.f4303b;
                            double d22 = c1290s2.f4304c;
                            double d23 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d23 ? (Math.pow(d13 - c1290s2.f4307f, 1.0d / c1290s2.f4302a) - d22) / d21 : (d13 - c1290s2.f4308g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i11 = 5;
            interfaceC1281j = new InterfaceC1281j() { // from class: g1.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d13) {
                    int i112 = i11;
                    C1290s c1290s2 = c1290s;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = C1276e.f4236a;
                            return C1276e.m3417a(c1290s2, d13);
                        case 1:
                            float[] fArr3 = C1276e.f4236a;
                            return C1276e.m3419c(c1290s2, d13);
                        case 2:
                            double d14 = c1290s2.f4303b;
                            return d13 >= c1290s2.f4306e ? Math.pow((d14 * d13) + c1290s2.f4304c, c1290s2.f4302a) : d13 * c1290s2.f4305d;
                        case 3:
                            double d15 = c1290s2.f4303b;
                            double d16 = c1290s2.f4304c;
                            double d17 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e ? Math.pow((d15 * d13) + d16, c1290s2.f4302a) + c1290s2.f4307f : (d17 * d13) + c1290s2.f4308g;
                        case 4:
                            float[] fArr4 = C1276e.f4236a;
                            return C1276e.m3418b(c1290s2, d13);
                        case 5:
                            float[] fArr5 = C1276e.f4236a;
                            return C1276e.m3420d(c1290s2, d13);
                        case 6:
                            double d18 = c1290s2.f4303b;
                            double d19 = c1290s2.f4304c;
                            double d20 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d20 ? (Math.pow(d13, 1.0d / c1290s2.f4302a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = c1290s2.f4303b;
                            double d22 = c1290s2.f4304c;
                            double d23 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d23 ? (Math.pow(d13 - c1290s2.f4307f, 1.0d / c1290s2.f4302a) - d22) / d21 : (d13 - c1290s2.f4308g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i12 = 6;
            interfaceC1281j = new InterfaceC1281j() { // from class: g1.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d13) {
                    int i112 = i12;
                    C1290s c1290s2 = c1290s;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = C1276e.f4236a;
                            return C1276e.m3417a(c1290s2, d13);
                        case 1:
                            float[] fArr3 = C1276e.f4236a;
                            return C1276e.m3419c(c1290s2, d13);
                        case 2:
                            double d14 = c1290s2.f4303b;
                            return d13 >= c1290s2.f4306e ? Math.pow((d14 * d13) + c1290s2.f4304c, c1290s2.f4302a) : d13 * c1290s2.f4305d;
                        case 3:
                            double d15 = c1290s2.f4303b;
                            double d16 = c1290s2.f4304c;
                            double d17 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e ? Math.pow((d15 * d13) + d16, c1290s2.f4302a) + c1290s2.f4307f : (d17 * d13) + c1290s2.f4308g;
                        case 4:
                            float[] fArr4 = C1276e.f4236a;
                            return C1276e.m3418b(c1290s2, d13);
                        case 5:
                            float[] fArr5 = C1276e.f4236a;
                            return C1276e.m3420d(c1290s2, d13);
                        case 6:
                            double d18 = c1290s2.f4303b;
                            double d19 = c1290s2.f4304c;
                            double d20 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d20 ? (Math.pow(d13, 1.0d / c1290s2.f4302a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = c1290s2.f4303b;
                            double d22 = c1290s2.f4304c;
                            double d23 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d23 ? (Math.pow(d13 - c1290s2.f4307f, 1.0d / c1290s2.f4302a) - d22) / d21 : (d13 - c1290s2.f4308g) / d23;
                    }
                }
            };
        } else {
            final int i13 = 7;
            interfaceC1281j = new InterfaceC1281j() { // from class: g1.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d13) {
                    int i112 = i13;
                    C1290s c1290s2 = c1290s;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = C1276e.f4236a;
                            return C1276e.m3417a(c1290s2, d13);
                        case 1:
                            float[] fArr3 = C1276e.f4236a;
                            return C1276e.m3419c(c1290s2, d13);
                        case 2:
                            double d14 = c1290s2.f4303b;
                            return d13 >= c1290s2.f4306e ? Math.pow((d14 * d13) + c1290s2.f4304c, c1290s2.f4302a) : d13 * c1290s2.f4305d;
                        case 3:
                            double d15 = c1290s2.f4303b;
                            double d16 = c1290s2.f4304c;
                            double d17 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e ? Math.pow((d15 * d13) + d16, c1290s2.f4302a) + c1290s2.f4307f : (d17 * d13) + c1290s2.f4308g;
                        case 4:
                            float[] fArr4 = C1276e.f4236a;
                            return C1276e.m3418b(c1290s2, d13);
                        case 5:
                            float[] fArr5 = C1276e.f4236a;
                            return C1276e.m3420d(c1290s2, d13);
                        case 6:
                            double d18 = c1290s2.f4303b;
                            double d19 = c1290s2.f4304c;
                            double d20 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d20 ? (Math.pow(d13, 1.0d / c1290s2.f4302a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = c1290s2.f4303b;
                            double d22 = c1290s2.f4304c;
                            double d23 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d23 ? (Math.pow(d13 - c1290s2.f4307f, 1.0d / c1290s2.f4302a) - d22) / d21 : (d13 - c1290s2.f4308g) / d23;
                    }
                }
            };
        }
        if (d10 == -3.0d) {
            final int i14 = 0;
            interfaceC1281j2 = new InterfaceC1281j() { // from class: g1.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d13) {
                    int i112 = i14;
                    C1290s c1290s2 = c1290s;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = C1276e.f4236a;
                            return C1276e.m3417a(c1290s2, d13);
                        case 1:
                            float[] fArr3 = C1276e.f4236a;
                            return C1276e.m3419c(c1290s2, d13);
                        case 2:
                            double d14 = c1290s2.f4303b;
                            return d13 >= c1290s2.f4306e ? Math.pow((d14 * d13) + c1290s2.f4304c, c1290s2.f4302a) : d13 * c1290s2.f4305d;
                        case 3:
                            double d15 = c1290s2.f4303b;
                            double d16 = c1290s2.f4304c;
                            double d17 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e ? Math.pow((d15 * d13) + d16, c1290s2.f4302a) + c1290s2.f4307f : (d17 * d13) + c1290s2.f4308g;
                        case 4:
                            float[] fArr4 = C1276e.f4236a;
                            return C1276e.m3418b(c1290s2, d13);
                        case 5:
                            float[] fArr5 = C1276e.f4236a;
                            return C1276e.m3420d(c1290s2, d13);
                        case 6:
                            double d18 = c1290s2.f4303b;
                            double d19 = c1290s2.f4304c;
                            double d20 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d20 ? (Math.pow(d13, 1.0d / c1290s2.f4302a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = c1290s2.f4303b;
                            double d22 = c1290s2.f4304c;
                            double d23 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d23 ? (Math.pow(d13 - c1290s2.f4307f, 1.0d / c1290s2.f4302a) - d22) / d21 : (d13 - c1290s2.f4308g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i15 = 1;
            interfaceC1281j2 = new InterfaceC1281j() { // from class: g1.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d13) {
                    int i112 = i15;
                    C1290s c1290s2 = c1290s;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = C1276e.f4236a;
                            return C1276e.m3417a(c1290s2, d13);
                        case 1:
                            float[] fArr3 = C1276e.f4236a;
                            return C1276e.m3419c(c1290s2, d13);
                        case 2:
                            double d14 = c1290s2.f4303b;
                            return d13 >= c1290s2.f4306e ? Math.pow((d14 * d13) + c1290s2.f4304c, c1290s2.f4302a) : d13 * c1290s2.f4305d;
                        case 3:
                            double d15 = c1290s2.f4303b;
                            double d16 = c1290s2.f4304c;
                            double d17 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e ? Math.pow((d15 * d13) + d16, c1290s2.f4302a) + c1290s2.f4307f : (d17 * d13) + c1290s2.f4308g;
                        case 4:
                            float[] fArr4 = C1276e.f4236a;
                            return C1276e.m3418b(c1290s2, d13);
                        case 5:
                            float[] fArr5 = C1276e.f4236a;
                            return C1276e.m3420d(c1290s2, d13);
                        case 6:
                            double d18 = c1290s2.f4303b;
                            double d19 = c1290s2.f4304c;
                            double d20 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d20 ? (Math.pow(d13, 1.0d / c1290s2.f4302a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = c1290s2.f4303b;
                            double d22 = c1290s2.f4304c;
                            double d23 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d23 ? (Math.pow(d13 - c1290s2.f4307f, 1.0d / c1290s2.f4302a) - d22) / d21 : (d13 - c1290s2.f4308g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i16 = 2;
            interfaceC1281j2 = new InterfaceC1281j() { // from class: g1.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d13) {
                    int i112 = i16;
                    C1290s c1290s2 = c1290s;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = C1276e.f4236a;
                            return C1276e.m3417a(c1290s2, d13);
                        case 1:
                            float[] fArr3 = C1276e.f4236a;
                            return C1276e.m3419c(c1290s2, d13);
                        case 2:
                            double d14 = c1290s2.f4303b;
                            return d13 >= c1290s2.f4306e ? Math.pow((d14 * d13) + c1290s2.f4304c, c1290s2.f4302a) : d13 * c1290s2.f4305d;
                        case 3:
                            double d15 = c1290s2.f4303b;
                            double d16 = c1290s2.f4304c;
                            double d17 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e ? Math.pow((d15 * d13) + d16, c1290s2.f4302a) + c1290s2.f4307f : (d17 * d13) + c1290s2.f4308g;
                        case 4:
                            float[] fArr4 = C1276e.f4236a;
                            return C1276e.m3418b(c1290s2, d13);
                        case 5:
                            float[] fArr5 = C1276e.f4236a;
                            return C1276e.m3420d(c1290s2, d13);
                        case 6:
                            double d18 = c1290s2.f4303b;
                            double d19 = c1290s2.f4304c;
                            double d20 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d20 ? (Math.pow(d13, 1.0d / c1290s2.f4302a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = c1290s2.f4303b;
                            double d22 = c1290s2.f4304c;
                            double d23 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d23 ? (Math.pow(d13 - c1290s2.f4307f, 1.0d / c1290s2.f4302a) - d22) / d21 : (d13 - c1290s2.f4308g) / d23;
                    }
                }
            };
        } else {
            final int i17 = 3;
            interfaceC1281j2 = new InterfaceC1281j() { // from class: g1.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d13) {
                    int i112 = i17;
                    C1290s c1290s2 = c1290s;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = C1276e.f4236a;
                            return C1276e.m3417a(c1290s2, d13);
                        case 1:
                            float[] fArr3 = C1276e.f4236a;
                            return C1276e.m3419c(c1290s2, d13);
                        case 2:
                            double d14 = c1290s2.f4303b;
                            return d13 >= c1290s2.f4306e ? Math.pow((d14 * d13) + c1290s2.f4304c, c1290s2.f4302a) : d13 * c1290s2.f4305d;
                        case 3:
                            double d15 = c1290s2.f4303b;
                            double d16 = c1290s2.f4304c;
                            double d17 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e ? Math.pow((d15 * d13) + d16, c1290s2.f4302a) + c1290s2.f4307f : (d17 * d13) + c1290s2.f4308g;
                        case 4:
                            float[] fArr4 = C1276e.f4236a;
                            return C1276e.m3418b(c1290s2, d13);
                        case 5:
                            float[] fArr5 = C1276e.f4236a;
                            return C1276e.m3420d(c1290s2, d13);
                        case 6:
                            double d18 = c1290s2.f4303b;
                            double d19 = c1290s2.f4304c;
                            double d20 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d20 ? (Math.pow(d13, 1.0d / c1290s2.f4302a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = c1290s2.f4303b;
                            double d22 = c1290s2.f4304c;
                            double d23 = c1290s2.f4305d;
                            return d13 >= c1290s2.f4306e * d23 ? (Math.pow(d13 - c1290s2.f4307f, 1.0d / c1290s2.f4302a) - d22) / d21 : (d13 - c1290s2.f4308g) / d23;
                    }
                }
            };
        }
        this(str, fArr, c1291t, null, interfaceC1281j, interfaceC1281j2, 0.0f, 1.0f, c1290s, i9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1289r(String str, float[] fArr, C1291t c1291t, final double d10, float f3, float f10, int i9) {
        InterfaceC1281j interfaceC1281j;
        InterfaceC1281j interfaceC1281j2 = f4287r;
        if (d10 == 1.0d) {
            interfaceC1281j = interfaceC1281j2;
        } else {
            final int i10 = 0;
            interfaceC1281j = new InterfaceC1281j() { // from class: g1.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d11) {
                    switch (i10) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i11 = 1;
            interfaceC1281j2 = new InterfaceC1281j() { // from class: g1.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p089g1.InterfaceC1281j
                /* JADX INFO: renamed from: c */
                public final double mo469c(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        InterfaceC1281j interfaceC1281j3 = interfaceC1281j2;
        this(str, fArr, c1291t, null, interfaceC1281j, interfaceC1281j3, f3, f10, new C1290s(d10, 1.0d, 0.0d, 0.0d, 0.0d), i9);
    }
}
