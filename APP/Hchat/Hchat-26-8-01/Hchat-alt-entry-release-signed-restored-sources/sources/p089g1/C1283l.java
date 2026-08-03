package p089g1;

import p071f1.AbstractC0996c0;

/* JADX INFO: renamed from: g1.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1283l extends AbstractC1274c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4274d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1283l(int i9, int i10, long j3, String str) {
        super(i9, str, j3);
        this.f4274d = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: a */
    public final float mo3404a(int i9) {
        switch (this.f4274d) {
            case 0:
                return i9 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: b */
    public final float mo3405b(int i9) {
        switch (this.f4274d) {
            case 0:
                return i9 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: d */
    public final long mo3407d(float f3, float f10, float f11) {
        switch (this.f4274d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f12 = (f3 + 16.0f) / 116.0f;
                float f13 = (f10 * 0.002f) + f12;
                float f14 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
                float[] fArr = AbstractC1282k.f4273e;
                return (((long) Float.floatToRawIntBits(f15 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f14 * fArr[0])) << 32);
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f10 <= 2.0f ? f10 : 2.0f)) & 4294967295L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: e */
    public final float mo3408e(float f3, float f10, float f11) {
        switch (this.f4274d) {
            case 0:
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 100.0f) {
                    f3 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f12 = ((f3 + 16.0f) / 116.0f) - (f11 * 0.005f);
                return (f12 > 0.20689656f ? f12 * f12 * f12 : 0.12841855f * (f12 - 0.13793103f)) * AbstractC1282k.f4273e[2];
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    return 2.0f;
                }
                return f11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: f */
    public final long mo3409f(float f3, float f10, float f11, float f12, AbstractC1274c abstractC1274c) {
        switch (this.f4274d) {
            case 0:
                float[] fArr = AbstractC1282k.f4273e;
                float f13 = f3 / fArr[0];
                float f14 = f10 / fArr[1];
                float f15 = f11 / fArr[2];
                float fCbrt = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
                float f16 = (116.0f * fCbrt2) - 16.0f;
                float f17 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f16 < 0.0f) {
                    f16 = 0.0f;
                }
                if (f16 > 100.0f) {
                    f16 = 100.0f;
                }
                if (f17 < -128.0f) {
                    f17 = -128.0f;
                }
                if (f17 > 128.0f) {
                    f17 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return AbstractC0996c0.m2506b(f16, f17, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f12, abstractC1274c);
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    f3 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                return AbstractC0996c0.m2506b(f3, f10, f11 <= 2.0f ? f11 : 2.0f, f12, abstractC1274c);
        }
    }
}
