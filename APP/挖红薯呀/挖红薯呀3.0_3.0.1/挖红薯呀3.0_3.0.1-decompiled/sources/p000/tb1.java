package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class tb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f5973a;

    /* JADX INFO: renamed from: b */
    public final sb1 f5974b;

    /* JADX INFO: renamed from: c */
    public final int f5975c;

    /* JADX INFO: renamed from: d */
    public final C0323il[] f5976d;

    /* JADX INFO: renamed from: e */
    public int f5977e;

    /* JADX INFO: renamed from: f */
    public final float[] f5978f;

    /* JADX INFO: renamed from: g */
    public final float[] f5979g;

    /* JADX INFO: renamed from: h */
    public final float[] f5980h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tb1(boolean z, sb1 sb1Var) {
        int i;
        this.f5973a = z;
        this.f5974b = sb1Var;
        if (z && sb1Var.equals(sb1.f5736d)) {
            C0921xc.m5134o("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = sb1Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                C0921xc.m5129j();
                throw null;
            }
            i = 2;
        }
        this.f5975c = i;
        this.f5976d = new C0323il[20];
        this.f5978f = new float[20];
        this.f5979g = new float[20];
        this.f5980h = new float[3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4194a(float f, long j) {
        int i = (this.f5977e + 1) % 20;
        this.f5977e = i;
        C0323il[] c0323ilArr = this.f5976d;
        C0323il c0323il = c0323ilArr[i];
        if (c0323il != null) {
            c0323il.f2582a = j;
            c0323il.f2583b = f;
        } else {
            C0323il c0323il2 = new C0323il();
            c0323il2.f2582a = j;
            c0323il2.f2583b = f;
            c0323ilArr[i] = c0323il2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m4195b(float f) {
        sb1 sb1Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            w10.m4824b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.f5977e;
        C0323il[] c0323ilArr = this.f5976d;
        C0323il c0323il = c0323ilArr[i2];
        if (c0323il == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            C0323il c0323il2 = c0323il;
            while (true) {
                C0323il c0323il3 = c0323ilArr[i2];
                boolean z2 = this.f5973a;
                sb1Var = this.f5974b;
                fArr = this.f5978f;
                fArr2 = this.f5979g;
                if (c0323il3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = c0323il.f2582a;
                f2 = f4;
                int i4 = i2;
                long j2 = c0323il3.f2582a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - c0323il2.f2582a);
                c0323il2 = (sb1Var == sb1.f5736d || z) ? c0323il3 : c0323il;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = c0323il3.f2583b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.f5975c) {
                int iOrdinal = sb1Var.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f5980h;
                        r60.m3421w(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        C0921xc.m5129j();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR false, (wrap:sb1:0x0000: SGET  A[WRAPPED] (LINE:64) sb1.d sb1) A[MD:(boolean, sb1):void (m)] (LINE:64) call: tb1.<init>(boolean, sb1):void type: THIS */
    public /* synthetic */ tb1() {
        this(false, sb1.f5736d);
    }

    public tb1(int i) {
        this(true, sb1.f5737e);
    }
}
