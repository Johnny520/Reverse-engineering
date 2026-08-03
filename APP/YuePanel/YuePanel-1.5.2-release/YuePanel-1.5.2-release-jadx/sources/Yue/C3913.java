package Yue;

import android.graphics.Color;
import com.google.android.material.color.utilities.Contrast;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3913 {

    /* JADX INFO: renamed from: ۥ */
    public static final double f571 = 95.047d;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final double f572 = 100.0d;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final double f7453 = 108.883d;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final double f7454 = 0.008856d;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final double f7455 = 903.3d;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f7456 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f7457 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final ThreadLocal<double[]> f7458 = new ThreadLocal<>();

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۤ۟$ۥ */
    @InterfaceC7113(26)
    public static class C0284 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Color m939(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float fAlpha = color.alpha();
            float fAlpha2 = color2.alpha() * (1.0f - fAlpha);
            int componentCount = color2.getComponentCount() - 1;
            float f = fAlpha + fAlpha2;
            components2[componentCount] = f;
            if (f > 0.0f) {
                fAlpha /= f;
                fAlpha2 /= f;
            }
            for (int i = 0; i < componentCount; i++) {
                components2[i] = (components[i] * fAlpha) + (components2[i] * fAlpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ */
    public static int m937(@InterfaceC6391 float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fAbs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f) / 60) {
            case 0:
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                iRound3 = Math.round(f4 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                iRound3 = Math.round(f4 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(m11169(iRound, 0, 255), m11169(iRound2, 0, 255), m11169(iRound3, 0, 255));
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟ */
    public static int m938(@InterfaceC4885(from = 0.0d, m1796to = f572) double d, @InterfaceC4885(from = -128.0d, m1796to = 127.0d) double d2, @InterfaceC4885(from = -128.0d, m1796to = 127.0d) double d3) {
        double[] dArrM11171 = m11171();
        m11146(d, d2, d3, dArrM11171);
        return m11151(dArrM11171[0], dArrM11171[1], dArrM11171[2]);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m11146(@InterfaceC4885(from = 0.0d, m1796to = f572) double d, @InterfaceC4885(from = -128.0d, m1796to = 127.0d) double d2, @InterfaceC4885(from = -128.0d, m1796to = 127.0d) double d3, @InterfaceC6391 double[] dArr) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double dPow = Math.pow(d5, 3.0d);
        if (dPow <= 0.008856d) {
            dPow = ((d5 * 116.0d) - 16.0d) / 903.3d;
        }
        double dPow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / 903.3d;
        double dPow3 = Math.pow(d6, 3.0d);
        if (dPow3 <= 0.008856d) {
            dPow3 = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = dPow * 95.047d;
        dArr[1] = dPow2 * 100.0d;
        dArr[2] = dPow3 * 108.883d;
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m11147(@InterfaceC4885(from = 0.0d, m1796to = 360.0d, toInclusive = false) float f, @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false) float f2, @InterfaceC4885(from = 0.0d, m1796to = f572) float f3) {
        return C3657.m9992(f, f2, f3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m11148(@InterfaceC5459(from = 0, m2228to = 255) int i, @InterfaceC5459(from = 0, m2228to = 255) int i2, @InterfaceC5459(from = 0, m2228to = 255) int i3, @InterfaceC6391 float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            f = fMax == f2 ? ((f3 - f4) / f5) % 6.0f : fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = m11168(f7, 0.0f, 360.0f);
        fArr[1] = m11168(fAbs, 0.0f, 1.0f);
        fArr[2] = m11168(f6, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m11149(@InterfaceC5459(from = 0, m2228to = 255) int i, @InterfaceC5459(from = 0, m2228to = 255) int i2, @InterfaceC5459(from = 0, m2228to = 255) int i3, @InterfaceC6391 double[] dArr) {
        m11150(i, i2, i3, dArr);
        m11152(dArr[0], dArr[1], dArr[2], dArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m11150(@InterfaceC5459(from = 0, m2228to = 255) int i, @InterfaceC5459(from = 0, m2228to = 255) int i2, @InterfaceC5459(from = 0, m2228to = 255) int i3, @InterfaceC6391 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) i2) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i3) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m11151(@InterfaceC4885(from = 0.0d, m1796to = f571) double d, @InterfaceC4885(from = 0.0d, m1796to = f572) double d2, @InterfaceC4885(from = 0.0d, m1796to = f7453) double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(m11169((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), m11169((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), m11169((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m11152(@InterfaceC4885(from = 0.0d, m1796to = f571) double d, @InterfaceC4885(from = 0.0d, m1796to = f572) double d2, @InterfaceC4885(from = 0.0d, m1796to = f7453) double d3, @InterfaceC6391 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dM11172 = m11172(d / 95.047d);
        double dM111722 = m11172(d2 / 100.0d);
        double dM111723 = m11172(d3 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * dM111722) - 16.0d);
        dArr[1] = (dM11172 - dM111722) * 500.0d;
        dArr[2] = (dM111722 - dM111723) * 200.0d;
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m11153(@InterfaceC3897 int i, @InterfaceC3897 int i2, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m11154(@InterfaceC6391 float[] fArr, @InterfaceC6391 float[] fArr2, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f, @InterfaceC6391 float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f2 = 1.0f - f;
        fArr3[0] = m11159(fArr[0], fArr2[0], f);
        fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
        fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m11155(@InterfaceC6391 double[] dArr, @InterfaceC6391 double[] dArr2, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) double d, @InterfaceC6391 double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d2 = 1.0d - d;
        dArr3[0] = (dArr[0] * d2) + (dArr2[0] * d);
        dArr3[1] = (dArr[1] * d2) + (dArr2[1] * d);
        dArr3[2] = (dArr[2] * d2) + (dArr2[2] * d);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static double m11156(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = m11165(i, i2);
        }
        double dM11157 = m11157(i) + 0.05d;
        double dM111572 = m11157(i2) + 0.05d;
        return Math.max(dM11157, dM111572) / Math.min(dM11157, dM111572);
    }

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static double m11157(@InterfaceC3897 int i) {
        double[] dArrM11171 = m11171();
        m11163(i, dArrM11171);
        return dArrM11171[1] / 100.0d;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static int m11158(@InterfaceC3897 int i, @InterfaceC3897 int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        double d = f;
        if (m11156(m11173(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (m11156(m11173(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static float m11159(float f, float f2, float f3) {
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > f) {
                f += 360.0f;
            } else {
                f2 += 360.0f;
            }
        }
        return (f + ((f2 - f) * f3)) % 360.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m11160(@InterfaceC3897 int i, @InterfaceC6391 float[] fArr) {
        m11148(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m11161(@InterfaceC3897 int i, @InterfaceC6391 double[] dArr) {
        m11149(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m11162(@InterfaceC3897 int i, @InterfaceC6391 @InterfaceC7473(3) float[] fArr) {
        C3657.m9991(i, fArr);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m11163(@InterfaceC3897 int i, @InterfaceC6391 double[] dArr) {
        m11150(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static int m11164(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static int m11165(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iM11164 = m11164(iAlpha2, iAlpha);
        return Color.argb(iM11164, m11167(Color.red(i), iAlpha2, Color.red(i2), iAlpha, iM11164), m11167(Color.green(i), iAlpha2, Color.green(i2), iAlpha, iM11164), m11167(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, iM11164));
    }

    @InterfaceC6391
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static Color m11166(@InterfaceC6391 Color color, @InterfaceC6391 Color color2) {
        return C0284.m939(color, color2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static int m11167(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static float m11168(float f, float f2, float f3) {
        return f < f2 ? f2 : Math.min(f, f3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static int m11169(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static double m11170(@InterfaceC6391 double[] dArr, @InterfaceC6391 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static double[] m11171() {
        ThreadLocal<double[]> threadLocal = f7458;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static double m11172(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static int m11173(@InterfaceC3897 int i, @InterfaceC5459(from = 0, m2228to = 255) int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & C8273.f24691) | (i2 << 24);
    }
}
