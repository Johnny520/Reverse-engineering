package p263;

import androidx.window.area.AbstractC2567;
import p247.AbstractC8157;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰世苏子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C8254 f22843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final double f22844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final double f22845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f22846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f22847;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f22848;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f22849;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final double f22850;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final double[] f22851;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final double f22852;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final double f22853;

    static {
        double dMax = Math.max(0.1d, 50.0d);
        double[][] dArr = AbstractC8256.f22862;
        double[] dArr2 = AbstractC8157.f22491;
        double d = dArr2[0];
        double[] dArr3 = dArr[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr2[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr2[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double dM5072 = AbstractC2567.m5072((1.0d - (Math.exp(-0.5839747603136626d) * 0.2777777777777778d)) * 1.0d, 0.0d, 1.0d);
        double[] dArr6 = {(((100.0d / d6) * dM5072) + 1.0d) - dM5072, (((100.0d / d7) * dM5072) + 1.0d) - dM5072, (((100.0d / d8) * dM5072) + 1.0d) - dM5072};
        double dCbrt = (Math.cbrt(58.62838974428476d) * 0.09999998417959298d) + 9.275250255162799E-7d;
        double d9 = (dMax + 16.0d) / 116.0d;
        double d10 = d9 * d9 * d9;
        if (d10 <= 0.008856451679035631d) {
            d10 = ((116.0d * d9) - 16.0d) / 903.2962962962963d;
        }
        double d11 = (d10 * 100.0d) / dArr2[1];
        double dSqrt = Math.sqrt(d11) + 1.48d;
        double dPow = 0.725d / Math.pow(d11, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d6) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d7) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d8) / 100.0d, 0.42d)};
        double d12 = dArr7[0];
        double d13 = (d12 * 400.0d) / (d12 + 27.13d);
        double d14 = dArr7[1];
        double d15 = (d14 * 400.0d) / (d14 + 27.13d);
        double d16 = dArr7[2];
        double[] dArr8 = {d13, d15, (400.0d * d16) / (d16 + 27.13d)};
        f22843 = new C8254(d11, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * dPow, dPow, dPow, 0.69d, 1.0d, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public C8254(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f22849 = d;
        this.f22848 = d2;
        this.f22847 = d3;
        this.f22846 = d4;
        this.f22845 = d5;
        this.f22844 = d6;
        this.f22851 = dArr;
        this.f22850 = d7;
        this.f22852 = d8;
        this.f22853 = d9;
    }
}
