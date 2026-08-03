package Yue;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5389 {

    /* JADX INFO: renamed from: ۥ */
    public int f1480;

    /* JADX INFO: renamed from: ۥ۟ */
    public C0738[][] f1481;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f13273;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public double[] f13274;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double f13275;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public double[][] f13276;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨۨ$ۥ */
    public static class C0738 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final double f13277 = 0.3333333333333333d;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final double f13278 = 0.5d;

        /* JADX INFO: renamed from: ۥ */
        public double f1482;

        /* JADX INFO: renamed from: ۥ۟ */
        public double f1483;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public double f13279;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public double f13280;

        public C0738(double d, double d2, double d3, double d4) {
            this.f1482 = d;
            this.f1483 = d2;
            this.f13279 = d3;
            this.f13280 = d4;
        }

        /* JADX INFO: renamed from: ۥ */
        public double m2158(double d) {
            return (((((this.f13280 * d) + this.f13279) * d) + this.f1483) * d) + this.f1482;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public double m2159(double d) {
            return (((this.f13280 * 0.3333333333333333d * d) + (this.f13279 * 0.5d)) * d) + this.f1483;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5389(double[][] dArr) {
        m16873(dArr);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C0738[] m2156(int i, double[] dArr) {
        double[] dArr2 = new double[i];
        double[] dArr3 = new double[i];
        double[] dArr4 = new double[i];
        int i2 = i - 1;
        int i3 = 0;
        dArr2[0] = 0.5d;
        int i4 = 1;
        for (int i5 = 1; i5 < i2; i5++) {
            dArr2[i5] = 1.0d / (4.0d - dArr2[i5 - 1]);
        }
        int i6 = i - 2;
        dArr2[i2] = 1.0d / (2.0d - dArr2[i6]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i4 < i2) {
            int i7 = i4 + 1;
            int i8 = i4 - 1;
            dArr3[i4] = (((dArr[i7] - dArr[i8]) * 3.0d) - dArr3[i8]) * dArr2[i4];
            i4 = i7;
        }
        double d = (((dArr[i2] - dArr[i6]) * 3.0d) - dArr3[i6]) * dArr2[i2];
        dArr3[i2] = d;
        dArr4[i2] = d;
        while (i6 >= 0) {
            dArr4[i6] = dArr3[i6] - (dArr2[i6] * dArr4[i6 + 1]);
            i6--;
        }
        C0738[] c0738Arr = new C0738[i2];
        while (i3 < i2) {
            double d2 = dArr[i3];
            double d3 = dArr4[i3];
            int i9 = i3 + 1;
            double d4 = dArr[i9];
            double d5 = dArr4[i9];
            c0738Arr[i3] = new C0738((float) d2, d3, (((d4 - d2) * 3.0d) - (d3 * 2.0d)) - d5, ((d2 - d4) * 2.0d) + d3 + d5);
            i3 = i9;
        }
        return c0738Arr;
    }

    /* JADX INFO: renamed from: ۥ */
    public double m2157(C0738[] c0738Arr) {
        int i;
        int length = c0738Arr.length;
        double[] dArr = new double[c0738Arr.length];
        double d = 0.0d;
        double d2 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d3 = 0.0d;
            while (i < c0738Arr.length) {
                double d4 = dArr[i];
                double dM2158 = c0738Arr[i].m2158(d2);
                dArr[i] = dM2158;
                double d5 = d4 - dM2158;
                d3 += d5 * d5;
                i++;
            }
            if (d2 > 0.0d) {
                dSqrt += Math.sqrt(d3);
            }
            d2 += 0.1d;
        }
        while (i < c0738Arr.length) {
            double d6 = dArr[i];
            double dM21582 = c0738Arr[i].m2158(1.0d);
            dArr[i] = dM21582;
            double d7 = d6 - dM21582;
            d += d7 * d7;
            i++;
        }
        return dSqrt + Math.sqrt(d);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public double m16869(double d, int i) {
        double[] dArr;
        double d2 = d * this.f13275;
        int i2 = 0;
        while (true) {
            dArr = this.f13274;
            if (i2 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i2];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i2++;
        }
        return this.f1481[i][i2].m2158(d2 / dArr[i2]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m16870(double d, double[] dArr) {
        double d2 = d * this.f13275;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f13274;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f1481[i2][i].m2158(d2 / this.f13274[i]);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m16871(double d, float[] fArr) {
        double d2 = d * this.f13275;
        int i = 0;
        while (true) {
            double[] dArr = this.f13274;
            if (i >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) this.f1481[i2][i].m2158(d2 / this.f13274[i]);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m16872(double d, double[] dArr) {
        double d2 = d * this.f13275;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f13274;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f1481[i2][i].m2159(d2 / this.f13274[i]);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m16873(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.f13273 = length;
        int length2 = dArr.length;
        this.f1480 = length2;
        this.f13276 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.f1481 = new C0738[this.f13273][];
        for (int i2 = 0; i2 < this.f13273; i2++) {
            for (int i3 = 0; i3 < this.f1480; i3++) {
                this.f13276[i2][i3] = dArr[i3][i2];
            }
        }
        int i4 = 0;
        while (true) {
            i = this.f13273;
            if (i4 >= i) {
                break;
            }
            C0738[][] c0738Arr = this.f1481;
            double[] dArr2 = this.f13276[i4];
            c0738Arr[i4] = m2156(dArr2.length, dArr2);
            i4++;
        }
        this.f13274 = new double[this.f1480 - 1];
        this.f13275 = 0.0d;
        C0738[] c0738Arr2 = new C0738[i];
        for (int i5 = 0; i5 < this.f13274.length; i5++) {
            for (int i6 = 0; i6 < this.f13273; i6++) {
                c0738Arr2[i6] = this.f1481[i6][i5];
            }
            double d = this.f13275;
            double[] dArr3 = this.f13274;
            double dM2157 = m2157(c0738Arr2);
            dArr3[i5] = dM2157;
            this.f13275 = d + dM2157;
        }
    }

    public C5389() {
    }
}
