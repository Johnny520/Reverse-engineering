package Yue;

import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6583 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static String f16903 = "Oscillator";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f16904 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f16905 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f16906 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f16907 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f16908 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f16909 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f16910 = 6;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public double[] f16911;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f16912;

    /* JADX INFO: renamed from: ۥ */
    public float[] f2152 = new float[0];

    /* JADX INFO: renamed from: ۥ۟ */
    public double[] f2153 = new double[0];

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double f16913 = 6.283185307179586d;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f16914 = false;

    public String toString() {
        return "pos =" + Arrays.toString(this.f2153) + " period=" + Arrays.toString(this.f2152);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3040(double d, float f) {
        int length = this.f2152.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f2153, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f2153 = Arrays.copyOf(this.f2153, length);
        this.f2152 = Arrays.copyOf(this.f2152, length);
        this.f16911 = new double[length];
        double[] dArr = this.f2153;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f2153[iBinarySearch] = d;
        this.f2152[iBinarySearch] = f;
        this.f16914 = false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public double m3041(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f2153, d);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f2152;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f2153;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return (d * d4) + (((double) f2) - (d4 * d3));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public double m20909(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f2153, d);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i = -iBinarySearch;
        int i2 = i - 1;
        float[] fArr = this.f2152;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f2153;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = ((double) (f - f2)) / (d2 - d3);
        return this.f16911[i3] + ((((double) f2) - (d4 * d3)) * (d - d3)) + ((d4 * ((d * d) - (d3 * d3))) / 2.0d);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public double m20910(double d) {
        double dM3041;
        double dSignum;
        double dM30412;
        double dM30413;
        double dSin;
        switch (this.f16912) {
            case 1:
                return 0.0d;
            case 2:
                dM3041 = m3041(d) * 4.0d;
                dSignum = Math.signum((((m20909(d) * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                return dM3041 * dSignum;
            case 3:
                dM30412 = m3041(d);
                return dM30412 * 2.0d;
            case 4:
                dM30412 = -m3041(d);
                return dM30412 * 2.0d;
            case 5:
                dM30413 = (-this.f16913) * m3041(d);
                dSin = Math.sin(this.f16913 * m20909(d));
                return dM30413 * dSin;
            case 6:
                dM3041 = m3041(d) * 4.0d;
                dSignum = (((m20909(d) * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                return dM3041 * dSignum;
            default:
                dM30413 = this.f16913 * m3041(d);
                dSin = Math.cos(this.f16913 * m20909(d));
                return dM30413 * dSin;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double m20911(double d) {
        double dAbs;
        switch (this.f16912) {
            case 1:
                return Math.signum(0.5d - (m20909(d) % 1.0d));
            case 2:
                dAbs = Math.abs((((m20909(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((m20909(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((m20909(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f16913 * m20909(d));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((m20909(d) * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            default:
                return Math.sin(this.f16913 * m20909(d));
        }
        return 1.0d - dAbs;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m20912() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.f2152;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr2 = this.f2152;
            if (i2 >= fArr2.length) {
                break;
            }
            int i3 = i2 - 1;
            float f = (fArr2[i3] + fArr2[i2]) / 2.0f;
            double[] dArr = this.f2153;
            d2 += (dArr[i2] - dArr[i3]) * ((double) f);
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.f2152;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = (float) (((double) fArr3[i4]) * (d / d2));
            i4++;
        }
        this.f16911[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr4 = this.f2152;
            if (i5 >= fArr4.length) {
                this.f16914 = true;
                return;
            }
            int i6 = i5 - 1;
            float f2 = (fArr4[i6] + fArr4[i5]) / 2.0f;
            double[] dArr2 = this.f2153;
            double d3 = dArr2[i5] - dArr2[i6];
            double[] dArr3 = this.f16911;
            dArr3[i5] = dArr3[i6] + (d3 * ((double) f2));
            i5++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m20913(int i) {
        this.f16912 = i;
    }
}
