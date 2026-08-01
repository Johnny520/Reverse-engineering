package androidx.compose.p001ui.graphics.colorspace;

import androidx.collection.C1123;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.C3775;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2330 extends AbstractC2325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1123 f4591 = new C1123(15);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4592;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4593;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2329 f4594;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC2332 f4595;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C2335 f4596;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f4597;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC7387 f4598;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2335 f4599;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float[] f4600;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2331 f4601;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC2332 f4602;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC7387 f4603;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float[] f4604;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float[] f4605;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2330(String str, float[] fArr, C2329 c2329, float[] fArr2, InterfaceC2332 interfaceC2332, InterfaceC2332 interfaceC23322, float f, float f2, C2331 c2331, int i) {
        int i2;
        float f3;
        float f4;
        boolean z;
        double d;
        super(i, 12884901888L, str);
        this.f4594 = c2329;
        this.f4593 = f;
        this.f4592 = f2;
        this.f4601 = c2331;
        this.f4602 = interfaceC2332;
        this.f4603 = new InterfaceC7387() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            public final Double invoke(double d2) {
                double dMo1413 = this.this$0.f4602.mo1413(d2);
                C2330 c2330 = this.this$0;
                return Double.valueOf(AbstractC3400.m5632(dMo1413, c2330.f4593, c2330.f4592));
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        this.f4596 = new C2335(this, 0);
        this.f4595 = interfaceC23322;
        this.f4598 = new InterfaceC7387() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            public final Double invoke(double d2) {
                return Double.valueOf(this.this$0.f4595.mo1413(AbstractC3400.m5632(d2, r8.f4593, r8.f4592)));
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        this.f4599 = new C2335(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            C6755.m11869("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.f4600 = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = c2329.f4590;
            i2 = 0;
            float f21 = c2329.f4589;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.f4604 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            i2 = 0;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                C3775.m6952(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.f4604 = fArr2;
        }
        this.f4605 = AbstractC2336.m3235(this.f4604);
        float fM3232 = AbstractC2336.m3232(fArr3);
        float[] fArr4 = C2324.f4561;
        if (fM3232 / AbstractC2336.m3232(C2324.f4560) > 0.9f) {
            float[] fArr5 = C2324.f4561;
            float f38 = fArr3[i2];
            float f39 = fArr5[i2];
            float f40 = fArr3[1];
            float f41 = fArr5[1];
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = fArr3[3];
            float f45 = fArr5[3];
            float f46 = fArr3[4];
            float f47 = fArr5[4];
            float f48 = fArr3[5];
            float f49 = fArr5[5];
            f4 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[i2] = f38 - f39;
            fArr6[1] = f40 - f41;
            fArr6[2] = f42 - f43;
            fArr6[3] = f44 - f45;
            fArr6[4] = f46 - f47;
            fArr6[5] = f48 - f49;
            float f50 = fArr6[i2];
            float f51 = fArr6[1];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr6[2];
                float f53 = fArr6[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr6[4];
                    float f55 = fArr6[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                float[] fArr7 = C2324.f4561;
                if (fArr3 != fArr7) {
                    for (int i3 = i2; i3 < 6; i3++) {
                        if (Float.compare(fArr3[i3], fArr7[i3]) != 0 && Math.abs(fArr3[i3] - fArr7[i3]) > 0.001f) {
                            break;
                        }
                    }
                    if (AbstractC2336.m3230(c2329, AbstractC2336.f4621)) {
                        float[] fArr8 = C2324.f4561;
                        C2330 c2330 = C2324.f4557;
                        while (d <= 1.0d) {
                        }
                        z = 1;
                    }
                    z = i2;
                    break;
                }
                if (AbstractC2336.m3230(c2329, AbstractC2336.f4621) && f == f4 && f2 == f3) {
                    float[] fArr82 = C2324.f4561;
                    C2330 c23302 = C2324.f4557;
                    for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                        if (Math.abs(interfaceC2332.mo1413(d) - c23302.f4602.mo1413(d)) <= 0.001d && Math.abs(interfaceC23322.mo1413(d) - c23302.f4595.mo1413(d)) <= 0.001d) {
                        }
                    }
                    z = 1;
                }
                z = i2;
                break;
            }
            z = 1;
            this.f4597 = z;
        }
        f4 = 0.0f;
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
        }
        this.f4597 = z;
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2330.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C2330 c2330 = (C2330) obj;
        if (Float.compare(c2330.f4593, this.f4593) != 0 || Float.compare(c2330.f4592, this.f4592) != 0 || !AbstractC5227.m9466(this.f4594, c2330.f4594) || !Arrays.equals(this.f4600, c2330.f4600)) {
            return false;
        }
        C2331 c2331 = c2330.f4601;
        C2331 c23312 = this.f4601;
        if (c23312 != null) {
            return AbstractC5227.m9466(c23312, c2331);
        }
        if (c2331 == null) {
            return true;
        }
        if (AbstractC5227.m9466(this.f4602, c2330.f4602)) {
            return AbstractC5227.m9466(this.f4595, c2330.f4595);
        }
        return false;
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f4600) + ((this.f4594.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f4593;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f4592;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        C2331 c2331 = this.f4601;
        int iHashCode2 = iFloatToIntBits2 + (c2331 != null ? c2331.hashCode() : 0);
        if (c2331 != null) {
            return iHashCode2;
        }
        return this.f4595.hashCode() + ((this.f4602.hashCode() + (iHashCode2 * 31)) * 31);
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final long mo3221(float f, float f2, float f3, float f4, AbstractC2325 abstractC2325) {
        float[] fArr = this.f4605;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        C2335 c2335 = this.f4596;
        return AbstractC2416.m3443((float) c2335.mo1413(f5), (float) c2335.mo1413(f6), (float) c2335.mo1413(f7), f4, abstractC2325);
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo3222(float f, float f2, float f3) {
        double d = f;
        C2335 c2335 = this.f4599;
        float fMo1413 = (float) c2335.mo1413(d);
        float fMo14132 = (float) c2335.mo1413(f2);
        float fMo14133 = (float) c2335.mo1413(f3);
        float[] fArr = this.f4604;
        return (fArr[8] * fMo14133) + (fArr[5] * fMo14132) + (fArr[2] * fMo1413);
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo3223(float f, float f2, float f3) {
        double d = f;
        C2335 c2335 = this.f4599;
        float fMo1413 = (float) c2335.mo1413(d);
        float fMo14132 = (float) c2335.mo1413(f2);
        float fMo14133 = (float) c2335.mo1413(f3);
        float[] fArr = this.f4604;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fMo14133) + ((fArr[3] * fMo14132) + (fArr[0] * fMo1413)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fMo14133) + (fArr[4] * fMo14132) + (fArr[1] * fMo1413))));
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo3224() {
        return this.f4597;
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo3225(int i) {
        return this.f4593;
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo3226(int i) {
        return this.f4592;
    }

    public C2330(String str, float[] fArr, C2329 c2329, final C2331 c2331, int i) {
        double d;
        InterfaceC2332 interfaceC2332;
        InterfaceC2332 interfaceC23322;
        double d2 = c2331.f4611;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = c2331.f4612;
        double d4 = c2331.f4606;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            interfaceC2332 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo1413(double d5) {
                    int i5 = i4;
                    C2331 c23312 = c2331;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = C2324.f4561;
                            return C2324.m3220(c23312, d5);
                        case 1:
                            float[] fArr3 = C2324.f4561;
                            return C2324.m3218(c23312, d5);
                        case 2:
                            double d6 = c23312.f4610;
                            return d5 >= c23312.f4607 ? Math.pow((d6 * d5) + c23312.f4609, c23312.f4611) : c23312.f4608 * d5;
                        case 3:
                            double d7 = c23312.f4610;
                            double d8 = c23312.f4609;
                            double d9 = c23312.f4608;
                            return d5 >= c23312.f4607 ? Math.pow((d7 * d5) + d8, c23312.f4611) + c23312.f4606 : (d9 * d5) + c23312.f4612;
                        case 4:
                            float[] fArr4 = C2324.f4561;
                            return C2324.m3219(c23312, d5);
                        case 5:
                            float[] fArr5 = C2324.f4561;
                            return C2324.m3217(c23312, d5);
                        case 6:
                            double d10 = c23312.f4610;
                            double d11 = c23312.f4609;
                            double d12 = c23312.f4608;
                            return d5 >= c23312.f4607 * d12 ? (Math.pow(d5, 1.0d / c23312.f4611) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c23312.f4610;
                            double d14 = c23312.f4609;
                            double d15 = c23312.f4608;
                            return d5 >= c23312.f4607 * d15 ? (Math.pow(d5 - c23312.f4606, 1.0d / c23312.f4611) - d14) / d13 : (d5 - c23312.f4612) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                interfaceC2332 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                    @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                    public final double mo1413(double d5) {
                        int i52 = i5;
                        C2331 c23312 = c2331;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = C2324.f4561;
                                return C2324.m3220(c23312, d5);
                            case 1:
                                float[] fArr3 = C2324.f4561;
                                return C2324.m3218(c23312, d5);
                            case 2:
                                double d6 = c23312.f4610;
                                return d5 >= c23312.f4607 ? Math.pow((d6 * d5) + c23312.f4609, c23312.f4611) : c23312.f4608 * d5;
                            case 3:
                                double d7 = c23312.f4610;
                                double d8 = c23312.f4609;
                                double d9 = c23312.f4608;
                                return d5 >= c23312.f4607 ? Math.pow((d7 * d5) + d8, c23312.f4611) + c23312.f4606 : (d9 * d5) + c23312.f4612;
                            case 4:
                                float[] fArr4 = C2324.f4561;
                                return C2324.m3219(c23312, d5);
                            case 5:
                                float[] fArr5 = C2324.f4561;
                                return C2324.m3217(c23312, d5);
                            case 6:
                                double d10 = c23312.f4610;
                                double d11 = c23312.f4609;
                                double d12 = c23312.f4608;
                                return d5 >= c23312.f4607 * d12 ? (Math.pow(d5, 1.0d / c23312.f4611) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c23312.f4610;
                                double d14 = c23312.f4609;
                                double d15 = c23312.f4608;
                                return d5 >= c23312.f4607 * d15 ? (Math.pow(d5 - c23312.f4606, 1.0d / c23312.f4611) - d14) / d13 : (d5 - c23312.f4612) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                interfaceC2332 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                    @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                    public final double mo1413(double d5) {
                        int i52 = i6;
                        C2331 c23312 = c2331;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = C2324.f4561;
                                return C2324.m3220(c23312, d5);
                            case 1:
                                float[] fArr3 = C2324.f4561;
                                return C2324.m3218(c23312, d5);
                            case 2:
                                double d6 = c23312.f4610;
                                return d5 >= c23312.f4607 ? Math.pow((d6 * d5) + c23312.f4609, c23312.f4611) : c23312.f4608 * d5;
                            case 3:
                                double d7 = c23312.f4610;
                                double d8 = c23312.f4609;
                                double d9 = c23312.f4608;
                                return d5 >= c23312.f4607 ? Math.pow((d7 * d5) + d8, c23312.f4611) + c23312.f4606 : (d9 * d5) + c23312.f4612;
                            case 4:
                                float[] fArr4 = C2324.f4561;
                                return C2324.m3219(c23312, d5);
                            case 5:
                                float[] fArr5 = C2324.f4561;
                                return C2324.m3217(c23312, d5);
                            case 6:
                                double d10 = c23312.f4610;
                                double d11 = c23312.f4609;
                                double d12 = c23312.f4608;
                                return d5 >= c23312.f4607 * d12 ? (Math.pow(d5, 1.0d / c23312.f4611) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c23312.f4610;
                                double d14 = c23312.f4609;
                                double d15 = c23312.f4608;
                                return d5 >= c23312.f4607 * d15 ? (Math.pow(d5 - c23312.f4606, 1.0d / c23312.f4611) - d14) / d13 : (d5 - c23312.f4612) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                interfaceC2332 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                    @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                    public final double mo1413(double d5) {
                        int i52 = i7;
                        C2331 c23312 = c2331;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = C2324.f4561;
                                return C2324.m3220(c23312, d5);
                            case 1:
                                float[] fArr3 = C2324.f4561;
                                return C2324.m3218(c23312, d5);
                            case 2:
                                double d6 = c23312.f4610;
                                return d5 >= c23312.f4607 ? Math.pow((d6 * d5) + c23312.f4609, c23312.f4611) : c23312.f4608 * d5;
                            case 3:
                                double d7 = c23312.f4610;
                                double d8 = c23312.f4609;
                                double d9 = c23312.f4608;
                                return d5 >= c23312.f4607 ? Math.pow((d7 * d5) + d8, c23312.f4611) + c23312.f4606 : (d9 * d5) + c23312.f4612;
                            case 4:
                                float[] fArr4 = C2324.f4561;
                                return C2324.m3219(c23312, d5);
                            case 5:
                                float[] fArr5 = C2324.f4561;
                                return C2324.m3217(c23312, d5);
                            case 6:
                                double d10 = c23312.f4610;
                                double d11 = c23312.f4609;
                                double d12 = c23312.f4608;
                                return d5 >= c23312.f4607 * d12 ? (Math.pow(d5, 1.0d / c23312.f4611) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c23312.f4610;
                                double d14 = c23312.f4609;
                                double d15 = c23312.f4608;
                                return d5 >= c23312.f4607 * d15 ? (Math.pow(d5 - c23312.f4606, 1.0d / c23312.f4611) - d14) / d13 : (d5 - c23312.f4612) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            interfaceC23322 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo1413(double d5) {
                    int i52 = i2;
                    C2331 c23312 = c2331;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C2324.f4561;
                            return C2324.m3220(c23312, d5);
                        case 1:
                            float[] fArr3 = C2324.f4561;
                            return C2324.m3218(c23312, d5);
                        case 2:
                            double d6 = c23312.f4610;
                            return d5 >= c23312.f4607 ? Math.pow((d6 * d5) + c23312.f4609, c23312.f4611) : c23312.f4608 * d5;
                        case 3:
                            double d7 = c23312.f4610;
                            double d8 = c23312.f4609;
                            double d9 = c23312.f4608;
                            return d5 >= c23312.f4607 ? Math.pow((d7 * d5) + d8, c23312.f4611) + c23312.f4606 : (d9 * d5) + c23312.f4612;
                        case 4:
                            float[] fArr4 = C2324.f4561;
                            return C2324.m3219(c23312, d5);
                        case 5:
                            float[] fArr5 = C2324.f4561;
                            return C2324.m3217(c23312, d5);
                        case 6:
                            double d10 = c23312.f4610;
                            double d11 = c23312.f4609;
                            double d12 = c23312.f4608;
                            return d5 >= c23312.f4607 * d12 ? (Math.pow(d5, 1.0d / c23312.f4611) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c23312.f4610;
                            double d14 = c23312.f4609;
                            double d15 = c23312.f4608;
                            return d5 >= c23312.f4607 * d15 ? (Math.pow(d5 - c23312.f4606, 1.0d / c23312.f4611) - d14) / d13 : (d5 - c23312.f4612) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            interfaceC23322 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo1413(double d5) {
                    int i52 = i3;
                    C2331 c23312 = c2331;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C2324.f4561;
                            return C2324.m3220(c23312, d5);
                        case 1:
                            float[] fArr3 = C2324.f4561;
                            return C2324.m3218(c23312, d5);
                        case 2:
                            double d6 = c23312.f4610;
                            return d5 >= c23312.f4607 ? Math.pow((d6 * d5) + c23312.f4609, c23312.f4611) : c23312.f4608 * d5;
                        case 3:
                            double d7 = c23312.f4610;
                            double d8 = c23312.f4609;
                            double d9 = c23312.f4608;
                            return d5 >= c23312.f4607 ? Math.pow((d7 * d5) + d8, c23312.f4611) + c23312.f4606 : (d9 * d5) + c23312.f4612;
                        case 4:
                            float[] fArr4 = C2324.f4561;
                            return C2324.m3219(c23312, d5);
                        case 5:
                            float[] fArr5 = C2324.f4561;
                            return C2324.m3217(c23312, d5);
                        case 6:
                            double d10 = c23312.f4610;
                            double d11 = c23312.f4609;
                            double d12 = c23312.f4608;
                            return d5 >= c23312.f4607 * d12 ? (Math.pow(d5, 1.0d / c23312.f4611) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c23312.f4610;
                            double d14 = c23312.f4609;
                            double d15 = c23312.f4608;
                            return d5 >= c23312.f4607 * d15 ? (Math.pow(d5 - c23312.f4606, 1.0d / c23312.f4611) - d14) / d13 : (d5 - c23312.f4612) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            interfaceC23322 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo1413(double d5) {
                    int i52 = i8;
                    C2331 c23312 = c2331;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C2324.f4561;
                            return C2324.m3220(c23312, d5);
                        case 1:
                            float[] fArr3 = C2324.f4561;
                            return C2324.m3218(c23312, d5);
                        case 2:
                            double d6 = c23312.f4610;
                            return d5 >= c23312.f4607 ? Math.pow((d6 * d5) + c23312.f4609, c23312.f4611) : c23312.f4608 * d5;
                        case 3:
                            double d7 = c23312.f4610;
                            double d8 = c23312.f4609;
                            double d9 = c23312.f4608;
                            return d5 >= c23312.f4607 ? Math.pow((d7 * d5) + d8, c23312.f4611) + c23312.f4606 : (d9 * d5) + c23312.f4612;
                        case 4:
                            float[] fArr4 = C2324.f4561;
                            return C2324.m3219(c23312, d5);
                        case 5:
                            float[] fArr5 = C2324.f4561;
                            return C2324.m3217(c23312, d5);
                        case 6:
                            double d10 = c23312.f4610;
                            double d11 = c23312.f4609;
                            double d12 = c23312.f4608;
                            return d5 >= c23312.f4607 * d12 ? (Math.pow(d5, 1.0d / c23312.f4611) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c23312.f4610;
                            double d14 = c23312.f4609;
                            double d15 = c23312.f4608;
                            return d5 >= c23312.f4607 * d15 ? (Math.pow(d5 - c23312.f4606, 1.0d / c23312.f4611) - d14) / d13 : (d5 - c23312.f4612) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            interfaceC23322 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo1413(double d5) {
                    int i52 = i9;
                    C2331 c23312 = c2331;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C2324.f4561;
                            return C2324.m3220(c23312, d5);
                        case 1:
                            float[] fArr3 = C2324.f4561;
                            return C2324.m3218(c23312, d5);
                        case 2:
                            double d6 = c23312.f4610;
                            return d5 >= c23312.f4607 ? Math.pow((d6 * d5) + c23312.f4609, c23312.f4611) : c23312.f4608 * d5;
                        case 3:
                            double d7 = c23312.f4610;
                            double d8 = c23312.f4609;
                            double d9 = c23312.f4608;
                            return d5 >= c23312.f4607 ? Math.pow((d7 * d5) + d8, c23312.f4611) + c23312.f4606 : (d9 * d5) + c23312.f4612;
                        case 4:
                            float[] fArr4 = C2324.f4561;
                            return C2324.m3219(c23312, d5);
                        case 5:
                            float[] fArr5 = C2324.f4561;
                            return C2324.m3217(c23312, d5);
                        case 6:
                            double d10 = c23312.f4610;
                            double d11 = c23312.f4609;
                            double d12 = c23312.f4608;
                            return d5 >= c23312.f4607 * d12 ? (Math.pow(d5, 1.0d / c23312.f4611) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c23312.f4610;
                            double d14 = c23312.f4609;
                            double d15 = c23312.f4608;
                            return d5 >= c23312.f4607 * d15 ? (Math.pow(d5 - c23312.f4606, 1.0d / c23312.f4611) - d14) / d13 : (d5 - c23312.f4612) / d15;
                    }
                }
            };
        }
        this(str, fArr, c2329, null, interfaceC2332, interfaceC23322, 0.0f, 1.0f, c2331, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2330(String str, float[] fArr, C2329 c2329, final double d, float f, float f2, int i) {
        InterfaceC2332 interfaceC2332;
        InterfaceC2332 interfaceC23322 = f4591;
        if (d == 1.0d) {
            interfaceC2332 = interfaceC23322;
        } else {
            final int i2 = 0;
            interfaceC2332 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世苏兰
                @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo1413(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            interfaceC23322 = new InterfaceC2332() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世苏兰
                @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo1413(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        InterfaceC2332 interfaceC23323 = interfaceC23322;
        this(str, fArr, c2329, null, interfaceC2332, interfaceC23323, f, f2, new C2331(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
