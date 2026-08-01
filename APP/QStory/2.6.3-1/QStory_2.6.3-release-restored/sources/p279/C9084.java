package p279;

import androidx.activity.AbstractC0900;
import com.android.p002dx.p005io.Opcodes;
import p263.AbstractC8986;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰世苏子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f23199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f23200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f23201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f23202;

    public C9084(int i) {
        double d;
        int i2;
        this.f23202 = i;
        C9083 c9083 = C9083.f23188;
        c9083.getClass();
        int i3 = i & Opcodes.CONST_METHOD_TYPE;
        double dM14166 = AbstractC8986.m14166((16711680 & i) >> 16);
        double dM141662 = AbstractC8986.m14166((65280 & i) >> 8);
        double dM141663 = AbstractC8986.m14166(i3);
        double d2 = (0.18051042d * dM141663) + (0.35762064d * dM141662) + (0.41233895d * dM14166);
        double d3 = (0.0722d * dM141663) + (0.7152d * dM141662) + (0.2126d * dM14166);
        double d4 = (dM141663 * 0.95034478d) + (dM141662 * 0.11916382d) + (dM14166 * 0.01932141d);
        double d5 = c9083.f23197;
        double d6 = c9083.f23190;
        double d7 = c9083.f23193;
        double[][] dArr = AbstractC9085.f23207;
        double[] dArr2 = dArr[0];
        double d8 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d9 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        double d10 = (d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]);
        double[] dArr5 = c9083.f23196;
        double d11 = dArr5[0] * d8;
        double d12 = dArr5[1] * d9;
        double d13 = dArr5[2] * d10;
        double d14 = c9083.f23195;
        double dPow = Math.pow((Math.abs(d11) * d14) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d12) * d14) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d13) * d14) / 100.0d, 0.42d);
        double d15 = ((((double) (d11 < 0.0d ? -1 : d11 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
        if (d12 < 0.0d) {
            d = 0.0d;
            i2 = -1;
        } else if (d12 == 0.0d) {
            d = 0.0d;
            i2 = 0;
        } else {
            d = 0.0d;
            i2 = 1;
        }
        double d16 = ((((double) i2) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double d17 = ((((double) (d13 >= d ? d13 == d ? 0 : 1 : -1)) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d18 = ((((-12.0d) * d16) + (d15 * 11.0d)) + d17) / 11.0d;
        double d19 = ((d15 + d16) - (d17 * 2.0d)) / 9.0d;
        double d20 = d16 * 20.0d;
        double d21 = ((21.0d * d17) + ((d15 * 20.0d) + d20)) / 20.0d;
        double d22 = (((d15 * 40.0d) + d20) + d17) / 20.0d;
        double dAtan2 = (Math.atan2(d19, d18) * 57.29577951308232d) % 360.0d;
        dAtan2 = dAtan2 < d ? dAtan2 + 360.0d : dAtan2;
        double d23 = dAtan2 * 0.017453292519943295d;
        double dPow4 = (Math.pow((d22 * c9083.f23192) / d7, c9083.f23198 * d6) * 100.0d) / 100.0d;
        Math.sqrt(dPow4);
        double d24 = d7 + 4.0d;
        double dPow5 = Math.pow((Math.hypot(d18, d19) * (((((Math.cos(((dAtan2 < 20.14d ? dAtan2 + 360.0d : dAtan2) * 0.017453292519943295d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * c9083.f23189) * c9083.f23191)) / (d21 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, c9083.f23194), 0.73d);
        double dSqrt = Math.sqrt(dPow4) * dPow5;
        Math.sqrt((dPow5 * d6) / d24);
        Math.log1p(dSqrt * d5 * 0.0228d);
        Math.cos(d23);
        Math.sin(d23);
        this.f23201 = dAtan2;
        this.f23200 = dSqrt;
        this.f23199 = (AbstractC8986.m14167(AbstractC8986.m14165(new double[]{AbstractC8986.m14166((i >> 16) & Opcodes.CONST_METHOD_TYPE), AbstractC8986.m14166((i >> 8) & Opcodes.CONST_METHOD_TYPE), AbstractC8986.m14166(i3)}, AbstractC8986.f22837)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9084) && this.f23202 == ((C9084) obj).f23202;
    }

    public final int hashCode() {
        return this.f23202;
    }

    public final String toString() {
        return AbstractC0900.m722(this.f23202, "Hct(argb=", ")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m14377() {
        double d = this.f23201;
        return d >= 105.0d && d < 125.0d;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m14378() {
        double d = this.f23201;
        return d >= 170.0d && d < 207.0d;
    }
}
