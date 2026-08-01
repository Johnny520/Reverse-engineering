package p289u0;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: u0.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8479c {

    /* JADX INFO: renamed from: k */
    public static final a f28308k;

    /* JADX INFO: renamed from: l */
    public static final int f28309l;

    /* JADX INFO: renamed from: m */
    public static final C8479c f28310m;

    /* JADX INFO: renamed from: a */
    public final float f28311a;

    /* JADX INFO: renamed from: b */
    public final float f28312b;

    /* JADX INFO: renamed from: c */
    public final float f28313c;

    /* JADX INFO: renamed from: d */
    public final float f28314d;

    /* JADX INFO: renamed from: e */
    public final float f28315e;

    /* JADX INFO: renamed from: f */
    public final float f28316f;

    /* JADX INFO: renamed from: g */
    public final float[] f28317g;

    /* JADX INFO: renamed from: h */
    public final float f28318h;

    /* JADX INFO: renamed from: i */
    public final float f28319i;

    /* JADX INFO: renamed from: j */
    public final float f28320j;

    static {
        a aVar = new a(null);
        f28308k = aVar;
        f28309l = 8;
        C8478b c8478b = C8478b.f28301a;
        f28310m = aVar.m32581b(c8478b.m32559h(), (float) ((c8478b.m32568q(50.0d) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    public C8479c(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f28311a = f10;
        this.f28312b = f11;
        this.f28313c = f12;
        this.f28314d = f13;
        this.f28315e = f14;
        this.f28316f = f15;
        this.f28317g = fArr;
        this.f28318h = f16;
        this.f28319i = f17;
        this.f28320j = f18;
    }

    /* JADX INFO: renamed from: b */
    public final float m32570b() {
        return this.f28312b;
    }

    /* JADX INFO: renamed from: c */
    public final float m32571c() {
        return this.f28315e;
    }

    /* JADX INFO: renamed from: d */
    public final float m32572d() {
        return this.f28318h;
    }

    /* JADX INFO: renamed from: e */
    public final float m32573e() {
        return this.f28319i;
    }

    /* JADX INFO: renamed from: f */
    public final float m32574f() {
        return this.f28311a;
    }

    /* JADX INFO: renamed from: g */
    public final float m32575g() {
        return this.f28313c;
    }

    /* JADX INFO: renamed from: h */
    public final float m32576h() {
        return this.f28316f;
    }

    /* JADX INFO: renamed from: i */
    public final float m32577i() {
        return this.f28314d;
    }

    /* JADX INFO: renamed from: j */
    public final float[] m32578j() {
        return this.f28317g;
    }

    /* JADX INFO: renamed from: k */
    public final float m32579k() {
        return this.f28320j;
    }

    /* JADX INFO: renamed from: u0.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8479c m32580a() {
            return C8479c.f28310m;
        }

        /* JADX INFO: renamed from: b */
        public final C8479c m32581b(float[] fArr, float f10, float f11, float f12, boolean z10) {
            C8478b c8478b = C8478b.f28301a;
            float[][] fArrM32560i = c8478b.m32560i();
            float f13 = fArr[0];
            float[] fArr2 = fArrM32560i[0];
            float f14 = fArr2[0] * f13;
            float f15 = fArr[1];
            float f16 = f14 + (fArr2[1] * f15);
            float f17 = fArr[2];
            float f18 = f16 + (fArr2[2] * f17);
            float[] fArr3 = fArrM32560i[1];
            float f19 = (fArr3[0] * f13) + (fArr3[1] * f15) + (fArr3[2] * f17);
            float[] fArr4 = fArrM32560i[2];
            float f20 = (f13 * fArr4[0]) + (f15 * fArr4[1]) + (f17 * fArr4[2]);
            float f21 = (f12 / 10.0f) + 0.8f;
            float fM32583b = ((double) f21) >= 0.9d ? AbstractC8480d.m32583b(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : AbstractC8480d.m32583b(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
            float fExp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
            double d10 = fExp;
            if (d10 > 1.0d) {
                fExp = 1.0f;
            } else if (d10 < 0.0d) {
                fExp = 0.0f;
            }
            float[] fArr5 = {(((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp, (((100.0f / f20) * fExp) + 1.0f) - fExp};
            float f22 = 1.0f / ((5.0f * f10) + 1.0f);
            float f23 = f22 * f22 * f22 * f22;
            float f24 = 1.0f - f23;
            float fCbrt = (f23 * f10) + (0.1f * f24 * f24 * ((float) Math.cbrt(((double) f10) * 5.0d)));
            float fM32568q = ((float) c8478b.m32568q(f11)) / fArr[1];
            double d11 = fM32568q;
            float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
            float fPow = 0.725f / ((float) Math.pow(d11, 0.2f));
            double d12 = 0.42f;
            float[] fArr6 = {(float) Math.pow(((fArr5[0] * fCbrt) * f18) / 100.0f, d12), (float) Math.pow(((fArr5[1] * fCbrt) * f19) / 100.0f, d12), (float) Math.pow(((fArr5[2] * fCbrt) * f20) / 100.0f, d12)};
            float f25 = fArr6[0];
            float f26 = (f25 * 400.0f) / (f25 + 27.13f);
            float f27 = fArr6[1];
            float f28 = (f27 * 400.0f) / (f27 + 27.13f);
            float f29 = fArr6[2];
            float[] fArr7 = {f26, f28, (400.0f * f29) / (f29 + 27.13f)};
            return new C8479c(fM32568q, ((fArr7[0] * 2.0f) + fArr7[1] + (fArr7[2] * 0.05f)) * fPow, fPow, fPow, fM32583b, f21, fArr5, fCbrt, (float) Math.pow(fCbrt, 0.25f), fSqrt, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C8479c(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13, f14, f15, fArr, f16, f17, f18);
    }
}
