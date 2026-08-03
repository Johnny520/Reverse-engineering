package p071f1;

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
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.AbstractC1426v;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
import okhttp3.internal.p221ws.WebSocketProtocol;
import okio.C3193a;
import p057e1.C0808c;
import p057e1.C0809d;
import p085fg.InterfaceC1231l;
import p089g1.AbstractC1273b;
import p089g1.AbstractC1274c;
import p089g1.C1276e;
import p089g1.C1288q;
import p089g1.C1289r;
import p089g1.C1290s;
import p136j8.C2104o;
import p293u2.C4241k;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: f1.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0996c0 {

    /* JADX INFO: renamed from: a */
    public static C1020o0 f3161a;

    /* JADX INFO: renamed from: b */
    public static final C1016m0 f3162b = new C1016m0();

    /* JADX INFO: renamed from: c */
    public static Method f3163c;

    /* JADX INFO: renamed from: d */
    public static Method f3164d;

    /* JADX INFO: renamed from: e */
    public static boolean f3165e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m2503A(int i9) {
        return i9 == 0 ? "Clear" : i9 == 1 ? "Src" : i9 == 2 ? "Dst" : i9 == 3 ? "SrcOver" : i9 == 4 ? "DstOver" : i9 == 5 ? "SrcIn" : i9 == 6 ? "DstIn" : i9 == 7 ? "SrcOut" : i9 == 8 ? "DstOut" : i9 == 9 ? "SrcAtop" : i9 == 10 ? "DstAtop" : i9 == 11 ? "Xor" : i9 == 12 ? "Plus" : i9 == 13 ? "Modulate" : i9 == 14 ? "Screen" : i9 == 15 ? "Overlay" : i9 == 16 ? "Darken" : i9 == 17 ? "Lighten" : i9 == 18 ? "ColorDodge" : i9 == 19 ? "ColorBurn" : i9 == 20 ? "HardLight" : i9 == 21 ? "Softlight" : i9 == 22 ? "Difference" : i9 == 23 ? "Exclusion" : i9 == 24 ? "Multiply" : i9 == 25 ? "Hue" : i9 == 26 ? "Saturation" : i9 == 27 ? "Color" : i9 == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final int m2504B(float f3, float[] fArr, int i9) {
        float f10 = f3 >= 0.0f ? f3 : 0.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (Math.abs(f10 - f3) > 1.05E-6f) {
            f10 = Float.NaN;
        }
        fArr[i9] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C0993b m2505a(C1003g c1003g) {
        Canvas canvas = AbstractC0995c.f3160a;
        C0993b c0993b = new C0993b();
        c0993b.f3149a = new Canvas(m2512h(c1003g));
        return c0993b;
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
    public static final long m2506b(float f3, float f10, float f11, float f12, AbstractC1274c abstractC1274c) {
        int i9;
        int i10;
        int i11;
        float fMo3405b;
        float fMo3404a;
        int i12;
        int i13;
        int i14;
        int i15;
        float fMo3405b2;
        float fMo3404a2;
        int i16;
        int i17;
        int i18;
        float f13;
        if (abstractC1274c.mo3406c()) {
            float f14 = f12 < 0.0f ? 0.0f : f12;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i19 = ((int) ((f14 * 255.0f) + 0.5f)) << 24;
            float f15 = f3 < 0.0f ? 0.0f : f3;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i20 = i19 | (((int) ((f15 * 255.0f) + 0.5f)) << 16);
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i21 = i20 | (((int) ((f16 * 255.0f) + 0.5f)) << 8);
            f13 = f11 >= 0.0f ? f11 : 0.0f;
            long j3 = ((long) (i21 | ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i22 = C1034w.f3264h;
            return j3;
        }
        long j4 = abstractC1274c.f4232b;
        int i23 = AbstractC1273b.f4230e;
        if (((int) (j4 >> 32)) != 3) {
            AbstractC1004g0.m2560a("Color only works with ColorSpaces with 3 components");
        }
        int i24 = abstractC1274c.f4233c;
        if (i24 == -1) {
            AbstractC1004g0.m2560a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fMo3405b3 = abstractC1274c.mo3405b(0);
        float fMo3404a3 = abstractC1274c.mo3404a(0);
        if (f3 >= fMo3405b3) {
            fMo3405b3 = f3;
        }
        if (fMo3405b3 <= fMo3404a3) {
            fMo3404a3 = fMo3405b3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fMo3404a3);
        int i25 = iFloatToRawIntBits >>> 31;
        int i26 = (iFloatToRawIntBits >>> 23) & 255;
        int i27 = iFloatToRawIntBits & 8388607;
        if (i26 == 255) {
            i10 = i27 != 0 ? 512 : 0;
            i9 = 31;
        } else {
            i9 = i26 - 112;
            if (i9 >= 31) {
                i10 = 0;
                i9 = 49;
            } else if (i9 > 0) {
                int i28 = i27 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i11 = (((i9 << 10) | i28) + 1) | (i25 << 15);
                    short s10 = (short) i11;
                    fMo3405b = abstractC1274c.mo3405b(1);
                    fMo3404a = abstractC1274c.mo3404a(1);
                    if (f10 >= fMo3405b) {
                        fMo3405b = f10;
                    }
                    if (fMo3405b <= fMo3404a) {
                        fMo3404a = fMo3405b;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo3404a);
                    int i29 = iFloatToRawIntBits2 >>> 31;
                    i12 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i30 = iFloatToRawIntBits2 & 8388607;
                    if (i12 != 255) {
                        i14 = i30 != 0 ? 512 : 0;
                        i13 = 31;
                    } else {
                        i13 = i12 - 112;
                        if (i13 >= 31) {
                            i14 = 0;
                            i13 = 49;
                        } else if (i13 > 0) {
                            int i31 = i30 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i15 = (((i13 << 10) | i31) + 1) | (i29 << 15);
                                short s11 = (short) i15;
                                fMo3405b2 = abstractC1274c.mo3405b(2);
                                fMo3404a2 = abstractC1274c.mo3404a(2);
                                if (f11 >= fMo3405b2) {
                                    fMo3405b2 = f11;
                                }
                                if (fMo3405b2 <= fMo3404a2) {
                                    fMo3404a2 = fMo3405b2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo3404a2);
                                int i32 = iFloatToRawIntBits3 >>> 31;
                                i16 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i33 = 8388607 & iFloatToRawIntBits3;
                                if (i16 == 255) {
                                    i17 = i33 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i34 = i16 - 112;
                                    if (i34 >= 31) {
                                        i17 = 0;
                                        i = 49;
                                    } else if (i34 > 0) {
                                        int i35 = i33 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i18 = (((i34 << 10) | i35) + 1) | (i32 << 15);
                                            short s12 = (short) i18;
                                            f13 = f12 >= 0.0f ? f12 : 0.0f;
                                            long j5 = (((long) i24) & 63) | ((((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s12)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i36 = C1034w.f3264h;
                                            return j5;
                                        }
                                        i17 = i35;
                                        i = i34;
                                    } else if (i34 >= -10) {
                                        int i37 = (i33 | 8388608) >> (1 - i34);
                                        if ((i37 & 4096) != 0) {
                                            i37 += 8192;
                                        }
                                        i17 = i37 >> 13;
                                    } else {
                                        i17 = 0;
                                    }
                                }
                                i18 = i17 | (i32 << 15) | (i << 10);
                                short s122 = (short) i18;
                                if (f12 >= 0.0f) {
                                }
                                long j52 = (((long) i24) & 63) | ((((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s122)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i362 = C1034w.f3264h;
                                return j52;
                            }
                            i14 = i31;
                        } else if (i13 >= -10) {
                            int i38 = (i30 | 8388608) >> (1 - i13);
                            if ((i38 & 4096) != 0) {
                                i38 += 8192;
                            }
                            i14 = i38 >> 13;
                            i13 = 0;
                        } else {
                            i14 = 0;
                            i13 = 0;
                        }
                    }
                    i15 = i14 | (i29 << 15) | (i13 << 10);
                    short s112 = (short) i15;
                    fMo3405b2 = abstractC1274c.mo3405b(2);
                    fMo3404a2 = abstractC1274c.mo3404a(2);
                    if (f11 >= fMo3405b2) {
                    }
                    if (fMo3405b2 <= fMo3404a2) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fMo3404a2);
                    int i322 = iFloatToRawIntBits32 >>> 31;
                    i16 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i332 = 8388607 & iFloatToRawIntBits32;
                    if (i16 == 255) {
                    }
                    i18 = i17 | (i322 << 15) | (i << 10);
                    short s1222 = (short) i18;
                    if (f12 >= 0.0f) {
                    }
                    long j522 = (((long) i24) & 63) | ((((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s112) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s1222)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i3622 = C1034w.f3264h;
                    return j522;
                }
                i10 = i28;
            } else if (i9 >= -10) {
                int i39 = (i27 | 8388608) >> (1 - i9);
                if ((i39 & 4096) != 0) {
                    i39 += 8192;
                }
                i10 = i39 >> 13;
                i9 = 0;
            } else {
                i10 = 0;
                i9 = 0;
            }
        }
        i11 = i10 | (i25 << 15) | (i9 << 10);
        short s102 = (short) i11;
        fMo3405b = abstractC1274c.mo3405b(1);
        fMo3404a = abstractC1274c.mo3404a(1);
        if (f10 >= fMo3405b) {
        }
        if (fMo3405b <= fMo3404a) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fMo3404a);
        int i292 = iFloatToRawIntBits22 >>> 31;
        i12 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i302 = iFloatToRawIntBits22 & 8388607;
        if (i12 != 255) {
        }
        i15 = i14 | (i292 << 15) | (i13 << 10);
        short s1122 = (short) i15;
        fMo3405b2 = abstractC1274c.mo3405b(2);
        fMo3404a2 = abstractC1274c.mo3404a(2);
        if (f11 >= fMo3405b2) {
        }
        if (fMo3405b2 <= fMo3404a2) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fMo3404a2);
        int i3222 = iFloatToRawIntBits322 >>> 31;
        i16 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i3322 = 8388607 & iFloatToRawIntBits322;
        if (i16 == 255) {
        }
        i18 = i17 | (i3222 << 15) | (i << 10);
        short s12222 = (short) i18;
        if (f12 >= 0.0f) {
        }
        long j5222 = (((long) i24) & 63) | ((((long) s102) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s1122) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s12222)) << 16) | ((((long) ((int) (((f13 <= 1.0f ? f13 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i36222 = C1034w.f3264h;
        return j5222;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m2507c(int i9) {
        long j3 = ((long) i9) << 32;
        int i10 = C1034w.f3264h;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m2508d(long j3) {
        long j4 = j3 << 32;
        int i9 = C1034w.f3264h;
        return j4;
    }

    /* JADX DEBUG: Class process forced to load method for inline: f0.k.g():android.graphics.ColorSpace$Named */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1003g m2509e(int i9, int i10, int i11) {
        ColorSpace rgb;
        ColorSpace rgb2;
        C1289r c1289r = C1276e.f4240e;
        m2527x(i11);
        Bitmap.Config configM2527x = m2527x(i11);
        if (AbstractC1416l.m3825a(c1289r, c1289r)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4252q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4253r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4250o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4245j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4244i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4255t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4254s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4246k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4247l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4242g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4243h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4241f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4248m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (AbstractC1416l.m3825a(c1289r, C1276e.f4251p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!AbstractC1416l.m3825a(c1289r, C1276e.f4249n)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    ColorSpace colorSpace = AbstractC1416l.m3825a(c1289r, C1276e.f4257v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : AbstractC1416l.m3825a(c1289r, C1276e.f4258w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (colorSpace != null) {
                        rgb2 = colorSpace;
                    }
                } else if (c1289r != null) {
                    String str = c1289r.f4231a;
                    float[] fArrM3430a = c1289r.f4288d.m3430a();
                    C1290s c1290s = c1289r.f4291g;
                    ColorSpace.Rgb.TransferParameters transferParameters = c1290s != null ? new ColorSpace.Rgb.TransferParameters(c1290s.f4303b, c1290s.f4304c, c1290s.f4305d, c1290s.f4306e, c1290s.f4307f, c1290s.f4308g, c1290s.f4302a) : null;
                    float[] fArr = c1289r.f4293i;
                    if (transferParameters != null) {
                        ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, c1289r.f4292h, fArrM3430a, transferParameters);
                        if (Float.isNaN(fArr[0]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                            rgb2 = rgb3;
                        } else {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr2 = c1289r.f4292h;
                        final C1288q c1288q = c1289r.f4296l;
                        final int i12 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: f1.x
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d10) {
                                switch (i12) {
                                }
                                return ((Number) c1288q.invoke(Double.valueOf(d10))).doubleValue();
                            }
                        };
                        final C1288q c1288q2 = c1289r.f4299o;
                        final int i13 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr2, fArrM3430a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: f1.x
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d10) {
                                switch (i13) {
                                }
                                return ((Number) c1288q2.invoke(Double.valueOf(d10))).doubleValue();
                            }
                        }, c1289r.f4289e, c1289r.f4290f);
                    }
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new C1003g(Bitmap.createBitmap((DisplayMetrics) null, i9, i10, configM2527x, true, rgb2));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb2 = rgb;
        return new C1003g(Bitmap.createBitmap((DisplayMetrics) null, i9, i10, configM2527x, true, rgb2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final C1005h m2510f() {
        return new C1005h(new Paint(7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final long m2511g(float f3, float f10) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i9 = C1032u0.f3255c;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final Bitmap m2512h(C1003g c1003g) {
        if (c1003g instanceof C1003g) {
            return c1003g.f3179a;
        }
        C2104o.m5297w("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final void m2513i(InterfaceC1031u interfaceC1031u, AbstractC0996c0 abstractC0996c0, C1005h c1005h) {
        if (abstractC0996c0 instanceof C1012k0) {
            C0808c c0808c = ((C1012k0) abstractC0996c0).f3197f;
            interfaceC1031u.mo2501t(c0808c.f2416a, c0808c.f2417b, c0808c.f2418c, c0808c.f2419d, c1005h);
            return;
        }
        if (!(abstractC0996c0 instanceof C1014l0)) {
            if (abstractC0996c0 instanceof C1010j0) {
                interfaceC1031u.mo2492j(((C1010j0) abstractC0996c0).f3195f, c1005h);
                return;
            } else {
                C3193a.m6822k();
                return;
            }
        }
        C1014l0 c1014l0 = (C1014l0) abstractC0996c0;
        C0809d c0809d = c1014l0.f3198f;
        long j3 = c0809d.f2427h;
        C1009j c1009j = c1014l0.f3199g;
        if (c1009j != null) {
            interfaceC1031u.mo2492j(c1009j, c1005h);
        } else {
            interfaceC1031u.mo2498q(c0809d.f2420a, c0809d.f2421b, c0809d.f2422c, c0809d.f2423d, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)), c1005h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m2514j(Canvas canvas, boolean z9) {
        Method method;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            if (z9) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f3165e) {
            try {
                if (i9 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f3163c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f3164d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f3163c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f3164d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f3163c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f3164d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f3165e = true;
        }
        if (z9) {
            try {
                Method method4 = f3163c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z9 || (method = f3164d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final Paint m2515l(C1005h c1005h) {
        if (c1005h == null) {
            AbstractC1004g0.m2560a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + AbstractC1426v.m3834a(c1005h.getClass()).m3819b());
        }
        return (Paint) c1005h.f3182i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC5853o m2516m(InterfaceC5853o interfaceC5853o, InterfaceC1231l interfaceC1231l) {
        return interfaceC5853o.mo10549d(new C1019o(interfaceC1231l));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static InterfaceC5853o m2517n(InterfaceC5853o interfaceC5853o, float f3, float f10, InterfaceC1026r0 interfaceC1026r0, boolean z9, C1017n c1017n, int i9) {
        if ((i9 & 4) != 0) {
            f3 = 1.0f;
        }
        float f11 = f3;
        float f12 = (i9 & 32) != 0 ? 0.0f : f10;
        long j3 = C1032u0.f3254b;
        InterfaceC1026r0 interfaceC1026r02 = (i9 & Opcodes.ACC_STRICT) != 0 ? f3162b : interfaceC1026r0;
        boolean z10 = (i9 & 4096) != 0 ? false : z9;
        long j4 = AbstractC1000e0.f3169a;
        return interfaceC5853o.mo10549d(new C0994b0(f11, f12, j3, interfaceC1026r02, z10, j4, j4, (262144 & i9) != 0 ? null : c1017n));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final boolean m2518o(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final void m2519p(Matrix matrix, float[] fArr) {
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f3;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f10;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f3;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m2520q(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f3;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final long m2521r(C0808c c0808c) {
        float f3 = c0808c.f2418c - c0808c.f2416a;
        return (((long) Float.floatToRawIntBits(c0808c.f2419d - c0808c.f2417b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final BlendMode m2522s(int i9) {
        return i9 == 0 ? BlendMode.CLEAR : i9 == 1 ? BlendMode.SRC : i9 == 2 ? BlendMode.DST : i9 == 3 ? BlendMode.SRC_OVER : i9 == 4 ? BlendMode.DST_OVER : i9 == 5 ? BlendMode.SRC_IN : i9 == 6 ? BlendMode.DST_IN : i9 == 7 ? BlendMode.SRC_OUT : i9 == 8 ? BlendMode.DST_OUT : i9 == 9 ? BlendMode.SRC_ATOP : i9 == 10 ? BlendMode.DST_ATOP : i9 == 11 ? BlendMode.XOR : i9 == 12 ? BlendMode.PLUS : i9 == 13 ? BlendMode.MODULATE : i9 == 14 ? BlendMode.SCREEN : i9 == 15 ? BlendMode.OVERLAY : i9 == 16 ? BlendMode.DARKEN : i9 == 17 ? BlendMode.LIGHTEN : i9 == 18 ? BlendMode.COLOR_DODGE : i9 == 19 ? BlendMode.COLOR_BURN : i9 == 20 ? BlendMode.HARD_LIGHT : i9 == 21 ? BlendMode.SOFT_LIGHT : i9 == 22 ? BlendMode.DIFFERENCE : i9 == 23 ? BlendMode.EXCLUSION : i9 == 24 ? BlendMode.MULTIPLY : i9 == 25 ? BlendMode.HUE : i9 == 26 ? BlendMode.SATURATION : i9 == 27 ? BlendMode.COLOR : i9 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final Rect m2523t(C4241k c4241k) {
        return new Rect(c4241k.f13914a, c4241k.f13915b, c4241k.f13916c, c4241k.f13917d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final RectF m2524u(C0808c c0808c) {
        return new RectF(c0808c.f2416a, c0808c.f2417b, c0808c.f2418c, c0808c.f2419d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final Shader.TileMode m2525v(int i9) {
        return i9 == 0 ? Shader.TileMode.CLAMP : i9 == 1 ? Shader.TileMode.REPEAT : i9 == 2 ? Shader.TileMode.MIRROR : i9 == 3 ? Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final int m2526w(long j3) {
        float[] fArr = C1276e.f4236a;
        return (int) (C1034w.m2633a(j3, C1276e.f4240e) >>> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final Bitmap.Config m2527x(int i9) {
        return i9 == 0 ? Bitmap.Config.ARGB_8888 : i9 == 1 ? Bitmap.Config.ALPHA_8 : i9 == 2 ? Bitmap.Config.RGB_565 : i9 == 3 ? Bitmap.Config.RGBA_F16 : i9 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final C0808c m2528y(RectF rectF) {
        return new C0808c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final PorterDuff.Mode m2529z(int i9) {
        return i9 == 0 ? PorterDuff.Mode.CLEAR : i9 == 1 ? PorterDuff.Mode.SRC : i9 == 2 ? PorterDuff.Mode.DST : i9 == 3 ? PorterDuff.Mode.SRC_OVER : i9 == 4 ? PorterDuff.Mode.DST_OVER : i9 == 5 ? PorterDuff.Mode.SRC_IN : i9 == 6 ? PorterDuff.Mode.DST_IN : i9 == 7 ? PorterDuff.Mode.SRC_OUT : i9 == 8 ? PorterDuff.Mode.DST_OUT : i9 == 9 ? PorterDuff.Mode.SRC_ATOP : i9 == 10 ? PorterDuff.Mode.DST_ATOP : i9 == 11 ? PorterDuff.Mode.XOR : i9 == 12 ? PorterDuff.Mode.ADD : i9 == 14 ? PorterDuff.Mode.SCREEN : i9 == 15 ? PorterDuff.Mode.OVERLAY : i9 == 16 ? PorterDuff.Mode.DARKEN : i9 == 17 ? PorterDuff.Mode.LIGHTEN : i9 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: k */
    public abstract C0808c mo2530k();
}
