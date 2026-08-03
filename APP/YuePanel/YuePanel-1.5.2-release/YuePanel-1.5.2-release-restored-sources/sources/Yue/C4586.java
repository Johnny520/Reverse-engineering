package Yue;

import android.util.Log;
import androidx.constraintlayout.widget.C8770;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4586 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f9855 = "cubic(0.4, 0.0, 0.2, 1)";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f9856 = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f9857 = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f9858 = "cubic(1, 1, 0, 0)";

    /* JADX INFO: renamed from: ۥ */
    public String f984 = "identity";

    /* JADX INFO: renamed from: ۥ۟ */
    public static C4586 f983 = new C4586();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f9861 = "standard";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f9860 = "accelerate";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f9859 = "decelerate";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f9862 = "linear";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static String[] f9863 = {f9861, f9860, f9859, f9862};

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C4586 m13632(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C0444(str);
        }
        switch (str) {
            case "accelerate":
                return new C0444(f9856);
            case "decelerate":
                return new C0444(f9857);
            case "linear":
                return new C0444(f9858);
            case "standard":
                return new C0444(f9855);
            default:
                Log.e(C8770.f26658, "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f9863));
                return f983;
        }
    }

    public String toString() {
        return this.f984;
    }

    /* JADX INFO: renamed from: ۥ */
    public double mo1543(double d) {
        return d;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public double mo1544(double d) {
        return 1.0d;
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۨ$ۥ */
    public static class C0444 extends C4586 {

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static double f9864 = 0.01d;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static double f9865 = 1.0E-4d;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public double f9866;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public double f9867;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public double f9868;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public double f9869;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0444(String str) {
            this.f984 = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f9866 = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.f9867 = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.f9868 = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.f9869 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // Yue.C4586
        /* JADX INFO: renamed from: ۥ */
        public double mo1543(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f9864) {
                d2 *= 0.5d;
                d3 = m13635(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double dM13635 = m13635(d4);
            double d5 = d3 + d2;
            double dM136352 = m13635(d5);
            double dM13636 = m13636(d4);
            return (((m13636(d5) - dM13636) * (d - dM13635)) / (dM136352 - dM13635)) + dM13636;
        }

        @Override // Yue.C4586
        /* JADX INFO: renamed from: ۥ۟ */
        public double mo1544(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f9865) {
                d2 *= 0.5d;
                d3 = m13635(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (m13636(d5) - m13636(d4)) / (m13635(d5) - m13635(d4));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final double m13633(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f9866;
            double d4 = this.f9868;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final double m13634(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f9867;
            double d4 = this.f9869;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final double m13635(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f9866 * d2 * d3 * d) + (this.f9868 * d3 * d * d) + (d * d * d);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final double m13636(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f9867 * d2 * d3 * d) + (this.f9869 * d3 * d * d) + (d * d * d);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m13637(double d, double d2, double d3, double d4) {
            this.f9866 = d;
            this.f9867 = d2;
            this.f9868 = d3;
            this.f9869 = d4;
        }

        public C0444(double d, double d2, double d3, double d4) {
            m13637(d, d2, d3, d4);
        }
    }
}
