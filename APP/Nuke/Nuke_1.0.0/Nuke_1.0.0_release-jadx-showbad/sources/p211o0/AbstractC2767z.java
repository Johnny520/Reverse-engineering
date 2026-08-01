package p211o0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleUnaryOperator;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.C2015k;
import p169h0.InterfaceC2207p;
import p204n0.C2684c;
import p217p0.AbstractC2871b;
import p217p0.AbstractC2872c;
import p217p0.C2873d;
import p217p0.C2885p;
import p217p0.C2886q;
import p217p0.C2887r;

/* JADX INFO: renamed from: o0.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2767z {

    /* JADX INFO: renamed from: a */
    public static C2735J f8775a;

    /* JADX INFO: renamed from: b */
    public static final C2734I f8776b = new C2734I();

    /* JADX INFO: renamed from: c */
    public static Method f8777c;

    /* JADX INFO: renamed from: d */
    public static Method f8778d;

    /* JADX INFO: renamed from: e */
    public static boolean f8779e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final PorterDuff.Mode m4928A(int i5) {
        return i5 == 0 ? PorterDuff.Mode.CLEAR : i5 == 1 ? PorterDuff.Mode.SRC : i5 == 2 ? PorterDuff.Mode.DST : i5 == 3 ? PorterDuff.Mode.SRC_OVER : i5 == 4 ? PorterDuff.Mode.DST_OVER : i5 == 5 ? PorterDuff.Mode.SRC_IN : i5 == 6 ? PorterDuff.Mode.DST_IN : i5 == 7 ? PorterDuff.Mode.SRC_OUT : i5 == 8 ? PorterDuff.Mode.DST_OUT : i5 == 9 ? PorterDuff.Mode.SRC_ATOP : i5 == 10 ? PorterDuff.Mode.DST_ATOP : i5 == 11 ? PorterDuff.Mode.XOR : i5 == 12 ? PorterDuff.Mode.ADD : i5 == 14 ? PorterDuff.Mode.SCREEN : i5 == 15 ? PorterDuff.Mode.OVERLAY : i5 == 16 ? PorterDuff.Mode.DARKEN : i5 == 17 ? PorterDuff.Mode.LIGHTEN : i5 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static String m4929B(int i5) {
        return i5 == 0 ? "Clear" : i5 == 1 ? "Src" : i5 == 2 ? "Dst" : i5 == 3 ? "SrcOver" : i5 == 4 ? "DstOver" : i5 == 5 ? "SrcIn" : i5 == 6 ? "DstIn" : i5 == 7 ? "SrcOut" : i5 == 8 ? "DstOut" : i5 == 9 ? "SrcAtop" : i5 == 10 ? "DstAtop" : i5 == 11 ? "Xor" : i5 == 12 ? "Plus" : i5 == 13 ? "Modulate" : i5 == 14 ? "Screen" : i5 == 15 ? "Overlay" : i5 == 16 ? "Darken" : i5 == 17 ? "Lighten" : i5 == 18 ? "ColorDodge" : i5 == 19 ? "ColorBurn" : i5 == 20 ? "HardLight" : i5 == 21 ? "Softlight" : i5 == 22 ? "Difference" : i5 == 23 ? "Exclusion" : i5 == 24 ? "Multiply" : i5 == 25 ? "Hue" : i5 == 26 ? "Saturation" : i5 == 27 ? "Color" : i5 == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final int m4930C(float f2, float[] fArr, int i5) {
        float f5 = f2 >= 0.0f ? f2 : 0.0f;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (Math.abs(f5 - f2) > 1.05E-6f) {
            f5 = Float.NaN;
        }
        fArr[i5] = f5;
        return !Float.isNaN(f5) ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C2743b m4931a(C2747f c2747f) {
        Canvas canvas = AbstractC2744c.f8726a;
        C2743b c2743b = new C2743b();
        c2743b.f8723a = new Canvas(m4939i(c2747f));
        return c2743b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m4932b(float f2, float f5, float f6, float f7, AbstractC2872c abstractC2872c) {
        int i5;
        int i6;
        int i7;
        float fMo5071b;
        float fMo5070a;
        int i8;
        int i9;
        int i10;
        int i11;
        float fMo5071b2;
        float fMo5070a2;
        int i12;
        int i13;
        int i14;
        float f8;
        if (abstractC2872c.mo5072c()) {
            float f9 = f7 < 0.0f ? 0.0f : f7;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i15 = ((int) ((f9 * 255.0f) + 0.5f)) << 24;
            float f10 = f2 < 0.0f ? 0.0f : f2;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            int i16 = i15 | (((int) ((f10 * 255.0f) + 0.5f)) << 16);
            float f11 = f5 < 0.0f ? 0.0f : f5;
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            int i17 = i16 | (((int) ((f11 * 255.0f) + 0.5f)) << 8);
            f8 = f6 >= 0.0f ? f6 : 0.0f;
            long j5 = ((long) (i17 | ((int) (((f8 <= 1.0f ? f8 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i18 = C2762u.f8763h;
            return j5;
        }
        long j6 = abstractC2872c.f9069b;
        int i19 = AbstractC2871b.f9067e;
        if (((int) (j6 >> 32)) != 3) {
            AbstractC2728C.m4780a("Color only works with ColorSpaces with 3 components");
        }
        int i20 = abstractC2872c.f9070c;
        if (i20 == -1) {
            AbstractC2728C.m4780a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fMo5071b3 = abstractC2872c.mo5071b(0);
        float fMo5070a3 = abstractC2872c.mo5070a(0);
        if (f2 >= fMo5071b3) {
            fMo5071b3 = f2;
        }
        if (fMo5071b3 <= fMo5070a3) {
            fMo5070a3 = fMo5071b3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fMo5070a3);
        int i21 = iFloatToRawIntBits >>> 31;
        int i22 = (iFloatToRawIntBits >>> 23) & 255;
        int i23 = iFloatToRawIntBits & 8388607;
        if (i22 == 255) {
            i6 = i23 != 0 ? 512 : 0;
            i5 = 31;
        } else {
            i5 = i22 - 112;
            if (i5 >= 31) {
                i6 = 0;
                i5 = 49;
            } else if (i5 > 0) {
                int i24 = i23 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i7 = (((i5 << 10) | i24) + 1) | (i21 << 15);
                    short s5 = (short) i7;
                    fMo5071b = abstractC2872c.mo5071b(1);
                    fMo5070a = abstractC2872c.mo5070a(1);
                    if (f5 >= fMo5071b) {
                        fMo5071b = f5;
                    }
                    if (fMo5071b <= fMo5070a) {
                        fMo5070a = fMo5071b;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo5070a);
                    int i25 = iFloatToRawIntBits2 >>> 31;
                    i8 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i26 = iFloatToRawIntBits2 & 8388607;
                    if (i8 != 255) {
                        i10 = i26 != 0 ? 512 : 0;
                        i9 = 31;
                    } else {
                        i9 = i8 - 112;
                        if (i9 >= 31) {
                            i10 = 0;
                            i9 = 49;
                        } else if (i9 > 0) {
                            int i27 = i26 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i11 = (((i9 << 10) | i27) + 1) | (i25 << 15);
                                short s6 = (short) i11;
                                fMo5071b2 = abstractC2872c.mo5071b(2);
                                fMo5070a2 = abstractC2872c.mo5070a(2);
                                if (f6 >= fMo5071b2) {
                                    fMo5071b2 = f6;
                                }
                                if (fMo5071b2 <= fMo5070a2) {
                                    fMo5070a2 = fMo5071b2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo5070a2);
                                int i28 = iFloatToRawIntBits3 >>> 31;
                                i12 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i29 = 8388607 & iFloatToRawIntBits3;
                                if (i12 == 255) {
                                    i13 = i29 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i30 = i12 - 112;
                                    if (i30 >= 31) {
                                        i13 = 0;
                                        i = 49;
                                    } else if (i30 > 0) {
                                        int i31 = i29 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i14 = (((i30 << 10) | i31) + 1) | (i28 << 15);
                                            short s7 = (short) i14;
                                            f8 = f7 >= 0.0f ? f7 : 0.0f;
                                            long j7 = (((long) i20) & 63) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f8 <= 1.0f ? f8 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i32 = C2762u.f8763h;
                                            return j7;
                                        }
                                        i13 = i31;
                                        i = i30;
                                    } else if (i30 >= -10) {
                                        int i33 = (i29 | 8388608) >> (1 - i30);
                                        if ((i33 & 4096) != 0) {
                                            i33 += 8192;
                                        }
                                        i13 = i33 >> 13;
                                    } else {
                                        i13 = 0;
                                    }
                                }
                                i14 = i13 | (i28 << 15) | (i << 10);
                                short s72 = (short) i14;
                                if (f7 >= 0.0f) {
                                }
                                long j72 = (((long) i20) & 63) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s72)) << 16) | ((((long) ((int) (((f8 <= 1.0f ? f8 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i322 = C2762u.f8763h;
                                return j72;
                            }
                            i10 = i27;
                        } else if (i9 >= -10) {
                            int i34 = (i26 | 8388608) >> (1 - i9);
                            if ((i34 & 4096) != 0) {
                                i34 += 8192;
                            }
                            i10 = i34 >> 13;
                            i9 = 0;
                        } else {
                            i10 = 0;
                            i9 = 0;
                        }
                    }
                    i11 = i10 | (i25 << 15) | (i9 << 10);
                    short s62 = (short) i11;
                    fMo5071b2 = abstractC2872c.mo5071b(2);
                    fMo5070a2 = abstractC2872c.mo5070a(2);
                    if (f6 >= fMo5071b2) {
                    }
                    if (fMo5071b2 <= fMo5070a2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fMo5070a2);
                    int i282 = iFloatToRawIntBits32 >>> 31;
                    i12 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i292 = 8388607 & iFloatToRawIntBits32;
                    if (i12 == 255) {
                    }
                    i14 = i13 | (i282 << 15) | (i << 10);
                    short s722 = (short) i14;
                    if (f7 >= 0.0f) {
                    }
                    long j722 = (((long) i20) & 63) | ((((long) s5) & 65535) << 48) | ((((long) s62) & 65535) << 32) | ((65535 & ((long) s722)) << 16) | ((((long) ((int) (((f8 <= 1.0f ? f8 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i3222 = C2762u.f8763h;
                    return j722;
                }
                i6 = i24;
            } else if (i5 >= -10) {
                int i35 = (i23 | 8388608) >> (1 - i5);
                if ((i35 & 4096) != 0) {
                    i35 += 8192;
                }
                i6 = i35 >> 13;
                i5 = 0;
            } else {
                i6 = 0;
                i5 = 0;
            }
        }
        i7 = i6 | (i21 << 15) | (i5 << 10);
        short s52 = (short) i7;
        fMo5071b = abstractC2872c.mo5071b(1);
        fMo5070a = abstractC2872c.mo5070a(1);
        if (f5 >= fMo5071b) {
        }
        if (fMo5071b <= fMo5070a) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fMo5070a);
        int i252 = iFloatToRawIntBits22 >>> 31;
        i8 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i262 = iFloatToRawIntBits22 & 8388607;
        if (i8 != 255) {
        }
        i11 = i10 | (i252 << 15) | (i9 << 10);
        short s622 = (short) i11;
        fMo5071b2 = abstractC2872c.mo5071b(2);
        fMo5070a2 = abstractC2872c.mo5070a(2);
        if (f6 >= fMo5071b2) {
        }
        if (fMo5071b2 <= fMo5070a2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fMo5070a2);
        int i2822 = iFloatToRawIntBits322 >>> 31;
        i12 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2922 = 8388607 & iFloatToRawIntBits322;
        if (i12 == 255) {
        }
        i14 = i13 | (i2822 << 15) | (i << 10);
        short s7222 = (short) i14;
        if (f7 >= 0.0f) {
        }
        long j7222 = (((long) i20) & 63) | ((((long) s52) & 65535) << 48) | ((((long) s622) & 65535) << 32) | ((65535 & ((long) s7222)) << 16) | ((((long) ((int) (((f8 <= 1.0f ? f8 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i32222 = C2762u.f8763h;
        return j7222;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m4933c(int i5) {
        long j5 = ((long) i5) << 32;
        int i6 = C2762u.f8763h;
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m4934d(long j5) {
        long j6 = j5 << 32;
        int i5 = C2762u.f8763h;
        return j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static long m4935e(int i5, int i6, int i7) {
        return m4933c(((i5 & 255) << 16) | (-16777216) | ((i6 & 255) << 8) | (i7 & 255));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2747f m4936f(int i5, int i6, int i7) {
        ColorSpace colorSpace;
        ColorSpace rgb;
        ColorSpace rgb2;
        C2886q c2886q = C2873d.f9075e;
        m4953x(i7);
        int i8 = Build.VERSION.SDK_INT;
        Bitmap.Config configM4953x = m4953x(i7);
        if (AbstractC1665j.m2981a(c2886q, c2886q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9087q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9088r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9085o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9080j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9079i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9090t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9089s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9081k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9082l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9077g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9078h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9076f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9083m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (AbstractC1665j.m2981a(c2886q, C2873d.f9086p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!AbstractC1665j.m2981a(c2886q, C2873d.f9084n)) {
                if (i8 >= 34) {
                    rgb2 = AbstractC1665j.m2981a(c2886q, C2873d.f9092v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : AbstractC1665j.m2981a(c2886q, C2873d.f9093w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (rgb2 != null) {
                        rgb = rgb2;
                    }
                } else if (c2886q != null) {
                    String str = c2886q.f9068a;
                    float[] fArrM5089a = c2886q.f9123d.m5089a();
                    C2887r c2887r = c2886q.f9126g;
                    ColorSpace.Rgb.TransferParameters transferParameters = c2887r != null ? new ColorSpace.Rgb.TransferParameters(c2887r.f9138b, c2887r.f9139c, c2887r.f9140d, c2887r.f9141e, c2887r.f9142f, c2887r.f9143g, c2887r.f9137a) : null;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, c2886q.f9127h, fArrM5089a, transferParameters);
                        rgb = rgb2;
                    } else {
                        float[] fArr = c2886q.f9127h;
                        final C2885p c2885p = c2886q.f9131l;
                        final int i9 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: o0.v
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d5) {
                                switch (i9) {
                                }
                                return ((Number) c2885p.mo1h(Double.valueOf(d5))).doubleValue();
                            }
                        };
                        final C2885p c2885p2 = c2886q.f9134o;
                        final int i10 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrM5089a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: o0.v
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d5) {
                                switch (i10) {
                                }
                                return ((Number) c2885p2.mo1h(Double.valueOf(d5))).doubleValue();
                            }
                        }, c2886q.f9124e, c2886q.f9125f);
                    }
                } else {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new C2747f(Bitmap.createBitmap((DisplayMetrics) null, i5, i6, configM4953x, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb = colorSpace;
        return new C2747f(Bitmap.createBitmap((DisplayMetrics) null, i5, i6, configM4953x, true, rgb));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final C2748g m4937g() {
        return new C2748g(new Paint(7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final long m4938h(float f2, float f5) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        int i5 = C2741P.f8721c;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final Bitmap m4939i(C2747f c2747f) {
        if (c2747f instanceof C2747f) {
            return c2747f.f8734a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m4940j(Canvas canvas, boolean z5) {
        Method method;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            if (z5) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f8779e) {
            try {
                if (i5 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f8777c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f8778d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f8777c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f8778d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f8777c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f8778d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f8779e = true;
        }
        if (z5) {
            try {
                Method method4 = f8777c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z5 || (method = f8778d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC2207p m4941l(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C2755n(interfaceC1601c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC2207p m4942m(InterfaceC2207p interfaceC2207p, float f2, float f5, long j5, InterfaceC2738M interfaceC2738M, boolean z5, long j6, long j7) {
        return interfaceC2207p.mo4021c(new C2766y(f2, f5, j5, interfaceC2738M, z5, j6, j7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static InterfaceC2207p m4943n(InterfaceC2207p interfaceC2207p, float f2, InterfaceC2738M interfaceC2738M, int i5) {
        if ((i5 & 4) != 0) {
            f2 = 1.0f;
        }
        float f5 = f2;
        long j5 = C2741P.f8720b;
        if ((i5 & 2048) != 0) {
            interfaceC2738M = f8776b;
        }
        long j6 = AbstractC2726A.f8670a;
        return m4942m(interfaceC2207p, f5, 0.0f, j5, interfaceC2738M, true, j6, j6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m4944o(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final void m4945p(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f8;
        fArr[2] = f13;
        fArr[3] = f5;
        fArr[4] = f9;
        fArr[5] = f14;
        fArr[6] = f7;
        fArr[7] = f11;
        fArr[8] = f15;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = f6;
        fArr[3] = f7;
        fArr[4] = f8;
        fArr[5] = f9;
        fArr[6] = f10;
        fArr[7] = f11;
        fArr[8] = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m4946q(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f7;
        fArr[2] = 0.0f;
        fArr[3] = f10;
        fArr[4] = f5;
        fArr[5] = f8;
        fArr[6] = 0.0f;
        fArr[7] = f11;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f6;
        fArr[13] = f9;
        fArr[14] = 0.0f;
        fArr[15] = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final long m4947r(C2684c c2684c) {
        float f2 = c2684c.f8560c - c2684c.f8558a;
        return (((long) Float.floatToRawIntBits(c2684c.f8561d - c2684c.f8559b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o0.a.b():android.graphics.BlendMode */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final BlendMode m4948s(int i5) {
        return i5 == 0 ? BlendMode.CLEAR : i5 == 1 ? BlendMode.SRC : i5 == 2 ? BlendMode.DST : i5 == 3 ? BlendMode.SRC_OVER : i5 == 4 ? BlendMode.DST_OVER : i5 == 5 ? BlendMode.SRC_IN : i5 == 6 ? BlendMode.DST_IN : i5 == 7 ? BlendMode.SRC_OUT : i5 == 8 ? BlendMode.DST_OUT : i5 == 9 ? BlendMode.SRC_ATOP : i5 == 10 ? BlendMode.DST_ATOP : i5 == 11 ? BlendMode.XOR : i5 == 12 ? BlendMode.PLUS : i5 == 13 ? BlendMode.MODULATE : i5 == 14 ? BlendMode.SCREEN : i5 == 15 ? BlendMode.OVERLAY : i5 == 16 ? BlendMode.DARKEN : i5 == 17 ? BlendMode.LIGHTEN : i5 == 18 ? BlendMode.COLOR_DODGE : i5 == 19 ? BlendMode.COLOR_BURN : i5 == 20 ? BlendMode.HARD_LIGHT : i5 == 21 ? BlendMode.SOFT_LIGHT : i5 == 22 ? BlendMode.DIFFERENCE : i5 == 23 ? BlendMode.EXCLUSION : i5 == 24 ? BlendMode.MULTIPLY : i5 == 25 ? BlendMode.HUE : i5 == 26 ? BlendMode.SATURATION : i5 == 27 ? BlendMode.COLOR : i5 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final Rect m4949t(C2015k c2015k) {
        return new Rect(c2015k.f6737a, c2015k.f6738b, c2015k.f6739c, c2015k.f6740d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final RectF m4950u(C2684c c2684c) {
        return new RectF(c2684c.f8558a, c2684c.f8559b, c2684c.f8560c, c2684c.f8561d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final Shader.TileMode m4951v(int i5) {
        return i5 == 0 ? Shader.TileMode.CLAMP : i5 == 1 ? Shader.TileMode.REPEAT : i5 == 2 ? Shader.TileMode.MIRROR : i5 == 3 ? Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final int m4952w(long j5) {
        float[] fArr = C2873d.f9071a;
        return (int) (C2762u.m4919a(j5, C2873d.f9075e) >>> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final Bitmap.Config m4953x(int i5) {
        return i5 == 0 ? Bitmap.Config.ARGB_8888 : i5 == 1 ? Bitmap.Config.ALPHA_8 : i5 == 2 ? Bitmap.Config.RGB_565 : i5 == 3 ? Bitmap.Config.RGBA_F16 : i5 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final C2684c m4954y(Rect rect) {
        return new C2684c(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final C2684c m4955z(RectF rectF) {
        return new C2684c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: k */
    public abstract C2684c mo4788k();
}
