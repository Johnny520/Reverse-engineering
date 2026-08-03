package Yue;

import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3371 extends AbstractC4261 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f5376 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f5377 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f5378 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f5379 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f5380 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f5381 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f5382 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final double[] f5383;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C0124[] f5384;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۦ۠$ۥ */
    public static class C0124 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final String f5385 = "Arc";

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static double[] f5386 = new double[91];

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final double f5387 = 0.001d;

        /* JADX INFO: renamed from: ۥ */
        public double[] f258;

        /* JADX INFO: renamed from: ۥ۟ */
        public double f259;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public double f5388;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public double f5389;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public double f5390;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public double f5391;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public double f5392;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public double f5393;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public double f5394;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public double f5395;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public double f5396;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public double f5397;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public double f5398;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public double f5399;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public double f5400;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public double f5401;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public boolean f5402;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean f5403;

        public C0124(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.f5403 = false;
            this.f5402 = i == 1;
            this.f5388 = d;
            this.f5389 = d2;
            this.f5394 = 1.0d / (d2 - d);
            if (3 == i) {
                this.f5403 = true;
            }
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (!this.f5403 && Math.abs(d7) >= 0.001d && Math.abs(d8) >= 0.001d) {
                this.f258 = new double[101];
                boolean z = this.f5402;
                this.f5395 = d7 * ((double) (z ? -1 : 1));
                this.f5396 = d8 * ((double) (z ? 1 : -1));
                this.f5397 = z ? d5 : d3;
                this.f5398 = z ? d4 : d6;
                m457(d3, d4, d5, d6);
                this.f5399 = this.f259 * this.f5394;
                return;
            }
            this.f5403 = true;
            this.f5390 = d3;
            this.f5391 = d5;
            this.f5392 = d4;
            this.f5393 = d6;
            double dHypot = Math.hypot(d8, d7);
            this.f259 = dHypot;
            this.f5399 = dHypot * this.f5394;
            double d9 = this.f5389;
            double d10 = this.f5388;
            this.f5397 = d7 / (d9 - d10);
            this.f5398 = d8 / (d9 - d10);
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m457(double d, double d2, double d3, double d4) {
            double dHypot;
            double d5 = d3 - d;
            double d6 = d2 - d4;
            int i = 0;
            double d7 = 0.0d;
            double d8 = 0.0d;
            double d9 = 0.0d;
            while (true) {
                if (i >= f5386.length) {
                    break;
                }
                double d10 = d7;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (r15.length - 1)));
                double dSin = Math.sin(radians) * d5;
                double dCos = Math.cos(radians) * d6;
                if (i > 0) {
                    dHypot = Math.hypot(dSin - d8, dCos - d9) + d10;
                    f5386[i] = dHypot;
                } else {
                    dHypot = d10;
                }
                i++;
                d9 = dCos;
                d7 = dHypot;
                d8 = dSin;
            }
            double d11 = d7;
            this.f259 = d11;
            int i2 = 0;
            while (true) {
                double[] dArr = f5386;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] / d11;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.f258.length) {
                    return;
                }
                double length = ((double) i3) / ((double) (r1.length - 1));
                int iBinarySearch = Arrays.binarySearch(f5386, length);
                if (iBinarySearch >= 0) {
                    this.f258[i3] = iBinarySearch / (f5386.length - 1);
                } else if (iBinarySearch == -1) {
                    this.f258[i3] = 0.0d;
                } else {
                    int i4 = -iBinarySearch;
                    int i5 = i4 - 2;
                    double[] dArr2 = f5386;
                    double d12 = dArr2[i5];
                    this.f258[i3] = (((double) i5) + ((length - d12) / (dArr2[i4 - 1] - d12))) / ((double) (dArr2.length - 1));
                }
                i3++;
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public double m458() {
            double d = this.f5395 * this.f5401;
            double dHypot = this.f5399 / Math.hypot(d, (-this.f5396) * this.f5400);
            if (this.f5402) {
                d = -d;
            }
            return d * dHypot;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public double m6908() {
            double d = this.f5395 * this.f5401;
            double d2 = (-this.f5396) * this.f5400;
            double dHypot = this.f5399 / Math.hypot(d, d2);
            return this.f5402 ? (-d2) * dHypot : d2 * dHypot;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public double m6909(double d) {
            return this.f5397;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public double m6910(double d) {
            return this.f5398;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public double m6911(double d) {
            double d2 = (d - this.f5388) * this.f5394;
            double d3 = this.f5390;
            return d3 + (d2 * (this.f5391 - d3));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public double m6912(double d) {
            double d2 = (d - this.f5388) * this.f5394;
            double d3 = this.f5392;
            return d3 + (d2 * (this.f5393 - d3));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public double m6913() {
            return this.f5397 + (this.f5395 * this.f5400);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public double m6914() {
            return this.f5398 + (this.f5396 * this.f5401);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public double m6915(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f258;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            double d2 = length - ((double) i);
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m6916(double d) {
            double dM6915 = m6915((this.f5402 ? this.f5389 - d : d - this.f5388) * this.f5394) * 1.5707963267948966d;
            this.f5400 = Math.sin(dM6915);
            this.f5401 = Math.cos(dM6915);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3371(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f5383 = dArr;
        this.f5384 = new C0124[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C0124[] c0124Arr = this.f5384;
            if (i >= c0124Arr.length) {
                return;
            }
            int i4 = iArr[i];
            if (i4 == 0) {
                i3 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i3 = i2;
            } else {
                if (i4 != 2) {
                    if (i4 == 3) {
                        if (i2 == 1) {
                        }
                        i3 = i2;
                    }
                }
                i2 = 2;
                i3 = i2;
            }
            double d = dArr[i];
            int i5 = i + 1;
            double d2 = dArr[i5];
            double[] dArr3 = dArr2[i];
            double d3 = dArr3[0];
            double d4 = dArr3[1];
            double[] dArr4 = dArr2[i5];
            c0124Arr[i] = new C0124(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i = i5;
        }
    }

    @Override // Yue.AbstractC4261
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public double mo6902(double d, int i) {
        C0124[] c0124Arr = this.f5384;
        int i2 = 0;
        double d2 = c0124Arr[0].f5388;
        if (d < d2) {
            d = d2;
        } else if (d > c0124Arr[c0124Arr.length - 1].f5389) {
            d = c0124Arr[c0124Arr.length - 1].f5389;
        }
        while (true) {
            C0124[] c0124Arr2 = this.f5384;
            if (i2 >= c0124Arr2.length) {
                return Double.NaN;
            }
            C0124 c0124 = c0124Arr2[i2];
            if (d <= c0124.f5389) {
                if (c0124.f5403) {
                    return i == 0 ? c0124.m6911(d) : c0124.m6912(d);
                }
                c0124.m6916(d);
                return i == 0 ? this.f5384[i2].m6913() : this.f5384[i2].m6914();
            }
            i2++;
        }
    }

    @Override // Yue.AbstractC4261
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo6903(double d, double[] dArr) {
        C0124[] c0124Arr = this.f5384;
        double d2 = c0124Arr[0].f5388;
        if (d < d2) {
            d = d2;
        }
        if (d > c0124Arr[c0124Arr.length - 1].f5389) {
            d = c0124Arr[c0124Arr.length - 1].f5389;
        }
        int i = 0;
        while (true) {
            C0124[] c0124Arr2 = this.f5384;
            if (i >= c0124Arr2.length) {
                return;
            }
            C0124 c0124 = c0124Arr2[i];
            if (d <= c0124.f5389) {
                if (c0124.f5403) {
                    dArr[0] = c0124.m6911(d);
                    dArr[1] = this.f5384[i].m6912(d);
                    return;
                } else {
                    c0124.m6916(d);
                    dArr[0] = this.f5384[i].m6913();
                    dArr[1] = this.f5384[i].m6914();
                    return;
                }
            }
            i++;
        }
    }

    @Override // Yue.AbstractC4261
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo6904(double d, float[] fArr) {
        C0124[] c0124Arr = this.f5384;
        double d2 = c0124Arr[0].f5388;
        if (d < d2) {
            d = d2;
        } else if (d > c0124Arr[c0124Arr.length - 1].f5389) {
            d = c0124Arr[c0124Arr.length - 1].f5389;
        }
        int i = 0;
        while (true) {
            C0124[] c0124Arr2 = this.f5384;
            if (i >= c0124Arr2.length) {
                return;
            }
            C0124 c0124 = c0124Arr2[i];
            if (d <= c0124.f5389) {
                if (c0124.f5403) {
                    fArr[0] = (float) c0124.m6911(d);
                    fArr[1] = (float) this.f5384[i].m6912(d);
                    return;
                } else {
                    c0124.m6916(d);
                    fArr[0] = (float) this.f5384[i].m6913();
                    fArr[1] = (float) this.f5384[i].m6914();
                    return;
                }
            }
            i++;
        }
    }

    @Override // Yue.AbstractC4261
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public double mo6905(double d, int i) {
        C0124[] c0124Arr = this.f5384;
        int i2 = 0;
        double d2 = c0124Arr[0].f5388;
        if (d < d2) {
            d = d2;
        }
        if (d > c0124Arr[c0124Arr.length - 1].f5389) {
            d = c0124Arr[c0124Arr.length - 1].f5389;
        }
        while (true) {
            C0124[] c0124Arr2 = this.f5384;
            if (i2 >= c0124Arr2.length) {
                return Double.NaN;
            }
            C0124 c0124 = c0124Arr2[i2];
            if (d <= c0124.f5389) {
                if (c0124.f5403) {
                    return i == 0 ? c0124.m6909(d) : c0124.m6910(d);
                }
                c0124.m6916(d);
                return i == 0 ? this.f5384[i2].m458() : this.f5384[i2].m6908();
            }
            i2++;
        }
    }

    @Override // Yue.AbstractC4261
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo6906(double d, double[] dArr) {
        C0124[] c0124Arr = this.f5384;
        double d2 = c0124Arr[0].f5388;
        if (d < d2) {
            d = d2;
        } else if (d > c0124Arr[c0124Arr.length - 1].f5389) {
            d = c0124Arr[c0124Arr.length - 1].f5389;
        }
        int i = 0;
        while (true) {
            C0124[] c0124Arr2 = this.f5384;
            if (i >= c0124Arr2.length) {
                return;
            }
            C0124 c0124 = c0124Arr2[i];
            if (d <= c0124.f5389) {
                if (c0124.f5403) {
                    dArr[0] = c0124.m6909(d);
                    dArr[1] = this.f5384[i].m6910(d);
                    return;
                } else {
                    c0124.m6916(d);
                    dArr[0] = this.f5384[i].m458();
                    dArr[1] = this.f5384[i].m6908();
                    return;
                }
            }
            i++;
        }
    }

    @Override // Yue.AbstractC4261
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public double[] mo6907() {
        return this.f5383;
    }
}
