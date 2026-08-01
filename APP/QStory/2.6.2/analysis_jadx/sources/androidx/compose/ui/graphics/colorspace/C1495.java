package androidx.compose.ui.graphics.colorspace;

import androidx.collection.C0276;
import androidx.compose.ui.graphics.AbstractC1581;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1495 extends AbstractC1490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C0276 f4245 = new C0276(15);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4247;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1494 f4248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC1497 f4249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1500 f4250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f4251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC6557 f4252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1500 f4253;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float[] f4254;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1496 f4255;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC1497 f4256;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC6557 f4257;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float[] f4258;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float[] f4259;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1495(java.lang.String r36, float[] r37, androidx.compose.ui.graphics.colorspace.C1494 r38, float[] r39, androidx.compose.ui.graphics.colorspace.InterfaceC1497 r40, androidx.compose.ui.graphics.colorspace.InterfaceC1497 r41, float r42, float r43, androidx.compose.ui.graphics.colorspace.C1496 r44, int r45) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.C1495.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲兰世苏, float[], androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏世兰哲, androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏世兰哲, float, float, androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲苏兰世, int):void");
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1495.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1495 c1495 = (C1495) obj;
        if (Float.compare(c1495.f4247, this.f4247) != 0 || Float.compare(c1495.f4246, this.f4246) != 0 || !AbstractC4394.m8917(this.f4248, c1495.f4248) || !Arrays.equals(this.f4254, c1495.f4254)) {
            return false;
        }
        C1496 c1496 = c1495.f4255;
        C1496 c14962 = this.f4255;
        if (c14962 != null) {
            return AbstractC4394.m8917(c14962, c1496);
        }
        if (c1496 == null) {
            return true;
        }
        if (AbstractC4394.m8917(this.f4256, c1495.f4256)) {
            return AbstractC4394.m8917(this.f4249, c1495.f4249);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f4254) + ((this.f4248.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f4247;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f4246;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        C1496 c1496 = this.f4255;
        int iHashCode2 = iFloatToIntBits2 + (c1496 != null ? c1496.hashCode() : 0);
        if (c1496 != null) {
            return iHashCode2;
        }
        return this.f4249.hashCode() + ((this.f4256.hashCode() + (iHashCode2 * 31)) * 31);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final long mo2651(float f, float f2, float f3, float f4, AbstractC1490 abstractC1490) {
        float[] fArr = this.f4259;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        C1500 c1500 = this.f4250;
        return AbstractC1581.m2873((float) c1500.mo852(f5), (float) c1500.mo852(f6), (float) c1500.mo852(f7), f4, abstractC1490);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo2652(float f, float f2, float f3) {
        double d = f;
        C1500 c1500 = this.f4253;
        float fMo852 = (float) c1500.mo852(d);
        float fMo8522 = (float) c1500.mo852(f2);
        float fMo8523 = (float) c1500.mo852(f3);
        float[] fArr = this.f4258;
        return (fArr[8] * fMo8523) + (fArr[5] * fMo8522) + (fArr[2] * fMo852);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo2653(float f, float f2, float f3) {
        double d = f;
        C1500 c1500 = this.f4253;
        float fMo852 = (float) c1500.mo852(d);
        float fMo8522 = (float) c1500.mo852(f2);
        float fMo8523 = (float) c1500.mo852(f3);
        float[] fArr = this.f4258;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fMo8523) + ((fArr[3] * fMo8522) + (fArr[0] * fMo852)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fMo8523) + (fArr[4] * fMo8522) + (fArr[1] * fMo852))));
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo2654() {
        return this.f4251;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo2655(int i) {
        return this.f4247;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo2656(int i) {
        return this.f4246;
    }

    public C1495(String str, float[] fArr, C1494 c1494, final C1496 c1496, int i) {
        double d;
        InterfaceC1497 interfaceC1497;
        InterfaceC1497 interfaceC14972;
        double d2 = c1496.f4265;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = c1496.f4266;
        double d4 = c1496.f4260;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            interfaceC1497 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo852(double d5) {
                    int i5 = i4;
                    C1496 c14962 = c1496;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = C1489.f4215;
                            return C1489.m2650(c14962, d5);
                        case 1:
                            float[] fArr3 = C1489.f4215;
                            return C1489.m2648(c14962, d5);
                        case 2:
                            double d6 = c14962.f4264;
                            return d5 >= c14962.f4261 ? Math.pow((d6 * d5) + c14962.f4263, c14962.f4265) : c14962.f4262 * d5;
                        case 3:
                            double d7 = c14962.f4264;
                            double d8 = c14962.f4263;
                            double d9 = c14962.f4262;
                            return d5 >= c14962.f4261 ? Math.pow((d7 * d5) + d8, c14962.f4265) + c14962.f4260 : (d9 * d5) + c14962.f4266;
                        case 4:
                            float[] fArr4 = C1489.f4215;
                            return C1489.m2649(c14962, d5);
                        case 5:
                            float[] fArr5 = C1489.f4215;
                            return C1489.m2647(c14962, d5);
                        case 6:
                            double d10 = c14962.f4264;
                            double d11 = c14962.f4263;
                            double d12 = c14962.f4262;
                            return d5 >= c14962.f4261 * d12 ? (Math.pow(d5, 1.0d / c14962.f4265) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c14962.f4264;
                            double d14 = c14962.f4263;
                            double d15 = c14962.f4262;
                            return d5 >= c14962.f4261 * d15 ? (Math.pow(d5 - c14962.f4260, 1.0d / c14962.f4265) - d14) / d13 : (d5 - c14962.f4266) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                interfaceC1497 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                    @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                    public final double mo852(double d5) {
                        int i52 = i5;
                        C1496 c14962 = c1496;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = C1489.f4215;
                                return C1489.m2650(c14962, d5);
                            case 1:
                                float[] fArr3 = C1489.f4215;
                                return C1489.m2648(c14962, d5);
                            case 2:
                                double d6 = c14962.f4264;
                                return d5 >= c14962.f4261 ? Math.pow((d6 * d5) + c14962.f4263, c14962.f4265) : c14962.f4262 * d5;
                            case 3:
                                double d7 = c14962.f4264;
                                double d8 = c14962.f4263;
                                double d9 = c14962.f4262;
                                return d5 >= c14962.f4261 ? Math.pow((d7 * d5) + d8, c14962.f4265) + c14962.f4260 : (d9 * d5) + c14962.f4266;
                            case 4:
                                float[] fArr4 = C1489.f4215;
                                return C1489.m2649(c14962, d5);
                            case 5:
                                float[] fArr5 = C1489.f4215;
                                return C1489.m2647(c14962, d5);
                            case 6:
                                double d10 = c14962.f4264;
                                double d11 = c14962.f4263;
                                double d12 = c14962.f4262;
                                return d5 >= c14962.f4261 * d12 ? (Math.pow(d5, 1.0d / c14962.f4265) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c14962.f4264;
                                double d14 = c14962.f4263;
                                double d15 = c14962.f4262;
                                return d5 >= c14962.f4261 * d15 ? (Math.pow(d5 - c14962.f4260, 1.0d / c14962.f4265) - d14) / d13 : (d5 - c14962.f4266) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                interfaceC1497 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                    @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                    public final double mo852(double d5) {
                        int i52 = i6;
                        C1496 c14962 = c1496;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = C1489.f4215;
                                return C1489.m2650(c14962, d5);
                            case 1:
                                float[] fArr3 = C1489.f4215;
                                return C1489.m2648(c14962, d5);
                            case 2:
                                double d6 = c14962.f4264;
                                return d5 >= c14962.f4261 ? Math.pow((d6 * d5) + c14962.f4263, c14962.f4265) : c14962.f4262 * d5;
                            case 3:
                                double d7 = c14962.f4264;
                                double d8 = c14962.f4263;
                                double d9 = c14962.f4262;
                                return d5 >= c14962.f4261 ? Math.pow((d7 * d5) + d8, c14962.f4265) + c14962.f4260 : (d9 * d5) + c14962.f4266;
                            case 4:
                                float[] fArr4 = C1489.f4215;
                                return C1489.m2649(c14962, d5);
                            case 5:
                                float[] fArr5 = C1489.f4215;
                                return C1489.m2647(c14962, d5);
                            case 6:
                                double d10 = c14962.f4264;
                                double d11 = c14962.f4263;
                                double d12 = c14962.f4262;
                                return d5 >= c14962.f4261 * d12 ? (Math.pow(d5, 1.0d / c14962.f4265) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c14962.f4264;
                                double d14 = c14962.f4263;
                                double d15 = c14962.f4262;
                                return d5 >= c14962.f4261 * d15 ? (Math.pow(d5 - c14962.f4260, 1.0d / c14962.f4265) - d14) / d13 : (d5 - c14962.f4266) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                interfaceC1497 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                    @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                    public final double mo852(double d5) {
                        int i52 = i7;
                        C1496 c14962 = c1496;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = C1489.f4215;
                                return C1489.m2650(c14962, d5);
                            case 1:
                                float[] fArr3 = C1489.f4215;
                                return C1489.m2648(c14962, d5);
                            case 2:
                                double d6 = c14962.f4264;
                                return d5 >= c14962.f4261 ? Math.pow((d6 * d5) + c14962.f4263, c14962.f4265) : c14962.f4262 * d5;
                            case 3:
                                double d7 = c14962.f4264;
                                double d8 = c14962.f4263;
                                double d9 = c14962.f4262;
                                return d5 >= c14962.f4261 ? Math.pow((d7 * d5) + d8, c14962.f4265) + c14962.f4260 : (d9 * d5) + c14962.f4266;
                            case 4:
                                float[] fArr4 = C1489.f4215;
                                return C1489.m2649(c14962, d5);
                            case 5:
                                float[] fArr5 = C1489.f4215;
                                return C1489.m2647(c14962, d5);
                            case 6:
                                double d10 = c14962.f4264;
                                double d11 = c14962.f4263;
                                double d12 = c14962.f4262;
                                return d5 >= c14962.f4261 * d12 ? (Math.pow(d5, 1.0d / c14962.f4265) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = c14962.f4264;
                                double d14 = c14962.f4263;
                                double d15 = c14962.f4262;
                                return d5 >= c14962.f4261 * d15 ? (Math.pow(d5 - c14962.f4260, 1.0d / c14962.f4265) - d14) / d13 : (d5 - c14962.f4266) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            interfaceC14972 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo852(double d5) {
                    int i52 = i2;
                    C1496 c14962 = c1496;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C1489.f4215;
                            return C1489.m2650(c14962, d5);
                        case 1:
                            float[] fArr3 = C1489.f4215;
                            return C1489.m2648(c14962, d5);
                        case 2:
                            double d6 = c14962.f4264;
                            return d5 >= c14962.f4261 ? Math.pow((d6 * d5) + c14962.f4263, c14962.f4265) : c14962.f4262 * d5;
                        case 3:
                            double d7 = c14962.f4264;
                            double d8 = c14962.f4263;
                            double d9 = c14962.f4262;
                            return d5 >= c14962.f4261 ? Math.pow((d7 * d5) + d8, c14962.f4265) + c14962.f4260 : (d9 * d5) + c14962.f4266;
                        case 4:
                            float[] fArr4 = C1489.f4215;
                            return C1489.m2649(c14962, d5);
                        case 5:
                            float[] fArr5 = C1489.f4215;
                            return C1489.m2647(c14962, d5);
                        case 6:
                            double d10 = c14962.f4264;
                            double d11 = c14962.f4263;
                            double d12 = c14962.f4262;
                            return d5 >= c14962.f4261 * d12 ? (Math.pow(d5, 1.0d / c14962.f4265) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c14962.f4264;
                            double d14 = c14962.f4263;
                            double d15 = c14962.f4262;
                            return d5 >= c14962.f4261 * d15 ? (Math.pow(d5 - c14962.f4260, 1.0d / c14962.f4265) - d14) / d13 : (d5 - c14962.f4266) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            interfaceC14972 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo852(double d5) {
                    int i52 = i3;
                    C1496 c14962 = c1496;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C1489.f4215;
                            return C1489.m2650(c14962, d5);
                        case 1:
                            float[] fArr3 = C1489.f4215;
                            return C1489.m2648(c14962, d5);
                        case 2:
                            double d6 = c14962.f4264;
                            return d5 >= c14962.f4261 ? Math.pow((d6 * d5) + c14962.f4263, c14962.f4265) : c14962.f4262 * d5;
                        case 3:
                            double d7 = c14962.f4264;
                            double d8 = c14962.f4263;
                            double d9 = c14962.f4262;
                            return d5 >= c14962.f4261 ? Math.pow((d7 * d5) + d8, c14962.f4265) + c14962.f4260 : (d9 * d5) + c14962.f4266;
                        case 4:
                            float[] fArr4 = C1489.f4215;
                            return C1489.m2649(c14962, d5);
                        case 5:
                            float[] fArr5 = C1489.f4215;
                            return C1489.m2647(c14962, d5);
                        case 6:
                            double d10 = c14962.f4264;
                            double d11 = c14962.f4263;
                            double d12 = c14962.f4262;
                            return d5 >= c14962.f4261 * d12 ? (Math.pow(d5, 1.0d / c14962.f4265) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c14962.f4264;
                            double d14 = c14962.f4263;
                            double d15 = c14962.f4262;
                            return d5 >= c14962.f4261 * d15 ? (Math.pow(d5 - c14962.f4260, 1.0d / c14962.f4265) - d14) / d13 : (d5 - c14962.f4266) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            interfaceC14972 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo852(double d5) {
                    int i52 = i8;
                    C1496 c14962 = c1496;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C1489.f4215;
                            return C1489.m2650(c14962, d5);
                        case 1:
                            float[] fArr3 = C1489.f4215;
                            return C1489.m2648(c14962, d5);
                        case 2:
                            double d6 = c14962.f4264;
                            return d5 >= c14962.f4261 ? Math.pow((d6 * d5) + c14962.f4263, c14962.f4265) : c14962.f4262 * d5;
                        case 3:
                            double d7 = c14962.f4264;
                            double d8 = c14962.f4263;
                            double d9 = c14962.f4262;
                            return d5 >= c14962.f4261 ? Math.pow((d7 * d5) + d8, c14962.f4265) + c14962.f4260 : (d9 * d5) + c14962.f4266;
                        case 4:
                            float[] fArr4 = C1489.f4215;
                            return C1489.m2649(c14962, d5);
                        case 5:
                            float[] fArr5 = C1489.f4215;
                            return C1489.m2647(c14962, d5);
                        case 6:
                            double d10 = c14962.f4264;
                            double d11 = c14962.f4263;
                            double d12 = c14962.f4262;
                            return d5 >= c14962.f4261 * d12 ? (Math.pow(d5, 1.0d / c14962.f4265) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c14962.f4264;
                            double d14 = c14962.f4263;
                            double d15 = c14962.f4262;
                            return d5 >= c14962.f4261 * d15 ? (Math.pow(d5 - c14962.f4260, 1.0d / c14962.f4265) - d14) / d13 : (d5 - c14962.f4266) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            interfaceC14972 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世兰苏
                @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo852(double d5) {
                    int i52 = i9;
                    C1496 c14962 = c1496;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C1489.f4215;
                            return C1489.m2650(c14962, d5);
                        case 1:
                            float[] fArr3 = C1489.f4215;
                            return C1489.m2648(c14962, d5);
                        case 2:
                            double d6 = c14962.f4264;
                            return d5 >= c14962.f4261 ? Math.pow((d6 * d5) + c14962.f4263, c14962.f4265) : c14962.f4262 * d5;
                        case 3:
                            double d7 = c14962.f4264;
                            double d8 = c14962.f4263;
                            double d9 = c14962.f4262;
                            return d5 >= c14962.f4261 ? Math.pow((d7 * d5) + d8, c14962.f4265) + c14962.f4260 : (d9 * d5) + c14962.f4266;
                        case 4:
                            float[] fArr4 = C1489.f4215;
                            return C1489.m2649(c14962, d5);
                        case 5:
                            float[] fArr5 = C1489.f4215;
                            return C1489.m2647(c14962, d5);
                        case 6:
                            double d10 = c14962.f4264;
                            double d11 = c14962.f4263;
                            double d12 = c14962.f4262;
                            return d5 >= c14962.f4261 * d12 ? (Math.pow(d5, 1.0d / c14962.f4265) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = c14962.f4264;
                            double d14 = c14962.f4263;
                            double d15 = c14962.f4262;
                            return d5 >= c14962.f4261 * d15 ? (Math.pow(d5 - c14962.f4260, 1.0d / c14962.f4265) - d14) / d13 : (d5 - c14962.f4266) / d15;
                    }
                }
            };
        }
        this(str, fArr, c1494, null, interfaceC1497, interfaceC14972, 0.0f, 1.0f, c1496, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1495(String str, float[] fArr, C1494 c1494, final double d, float f, float f2, int i) {
        InterfaceC1497 interfaceC1497;
        InterfaceC1497 interfaceC14972 = f4245;
        if (d == 1.0d) {
            interfaceC1497 = interfaceC14972;
        } else {
            final int i2 = 0;
            interfaceC1497 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世苏兰
                @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo852(double d2) {
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
            interfaceC14972 = new InterfaceC1497() { // from class: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲世苏兰
                @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final double mo852(double d2) {
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
        InterfaceC1497 interfaceC14973 = interfaceC14972;
        this(str, fArr, c1494, null, interfaceC1497, interfaceC14973, f, f2, new C1496(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
