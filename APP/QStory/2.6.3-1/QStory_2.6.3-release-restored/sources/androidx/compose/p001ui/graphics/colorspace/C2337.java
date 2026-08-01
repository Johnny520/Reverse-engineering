package androidx.compose.p001ui.graphics.colorspace;

import androidx.compose.p001ui.graphics.AbstractC2416;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2337 extends AbstractC2325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f4625;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2337(int i, int i2, long j, String str) {
        super(i, j, str);
        this.f4625 = i2;
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final long mo3221(float f, float f2, float f3, float f4, AbstractC2325 abstractC2325) {
        switch (this.f4625) {
            case 0:
                float[] fArr = AbstractC2336.f4620;
                float f5 = f / fArr[0];
                float f6 = f2 / fArr[1];
                float f7 = f3 / fArr[2];
                float fCbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
                float fCbrt3 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
                float f8 = (116.0f * fCbrt2) - 16.0f;
                float f9 = (fCbrt - fCbrt2) * 500.0f;
                float f10 = (fCbrt2 - fCbrt3) * 200.0f;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                return AbstractC2416.m3443(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, abstractC2325);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                return AbstractC2416.m3443(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, abstractC2325);
        }
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo3222(float f, float f2, float f3) {
        switch (this.f4625) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f3 < -128.0f) {
                    f3 = -128.0f;
                }
                if (f3 > 128.0f) {
                    f3 = 128.0f;
                }
                float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
                return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * AbstractC2336.f4620[2];
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    return 2.0f;
                }
                return f3;
        }
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo3223(float f, float f2, float f3) {
        long jFloatToRawIntBits;
        long j;
        switch (this.f4625) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f2 < -128.0f) {
                    f2 = -128.0f;
                }
                if (f2 > 128.0f) {
                    f2 = 128.0f;
                }
                float f4 = (f + 16.0f) / 116.0f;
                float f5 = (f2 * 0.002f) + f4;
                float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
                float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
                float[] fArr = AbstractC2336.f4620;
                float f8 = f6 * fArr[0];
                float f9 = f7 * fArr[1];
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(f8);
                jFloatToRawIntBits = Float.floatToRawIntBits(f9);
                j = jFloatToRawIntBits2 << 32;
                break;
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                float f10 = f2 <= 2.0f ? f2 : 2.0f;
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(f);
                jFloatToRawIntBits = Float.floatToRawIntBits(f10);
                j = jFloatToRawIntBits3 << 32;
                break;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo3225(int i) {
        switch (this.f4625) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo3226(int i) {
        switch (this.f4625) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }
}
