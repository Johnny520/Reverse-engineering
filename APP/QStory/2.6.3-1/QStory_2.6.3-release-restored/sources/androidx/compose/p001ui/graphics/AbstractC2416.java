package androidx.compose.p001ui.graphics;

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
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.colorspace.AbstractC2325;
import androidx.compose.p001ui.graphics.colorspace.C2324;
import androidx.compose.p001ui.graphics.colorspace.C2330;
import androidx.compose.p001ui.graphics.colorspace.C2331;
import com.android.p002dx.p005io.Opcodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import p068.InterfaceC7387;
import p128.C8157;
import p221.C8734;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean f5004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Method f5005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Method f5006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2412 f5007 = new C2412();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2408 f5008;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final PorterDuff.Mode m3430(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C8157 m3431(RectF rectF) {
        return new C8157(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final Bitmap.Config m3432(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int m3433(long j) {
        float[] fArr = C2324.f4561;
        return (int) (C2434.m3511(j, C2324.f4557) >>> 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final Shader.TileMode m3434(int i) {
        return i == 0 ? Shader.TileMode.CLAMP : i == 1 ? Shader.TileMode.REPEAT : i == 2 ? Shader.TileMode.MIRROR : i == 3 ? Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final RectF m3435(C8157 c8157) {
        return new RectF(c8157.f19885, c8157.f19884, c8157.f19883, c8157.f19882);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final int m3436(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static String m3437(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static String m3438(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m3440(long j) {
        long j2 = j << 32;
        int i = C2434.f5044;
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m3441(int i, int i2, int i3, int i4) {
        return m3442(((i & Opcodes.CONST_METHOD_TYPE) << 16) | ((i4 & Opcodes.CONST_METHOD_TYPE) << 24) | ((i2 & Opcodes.CONST_METHOD_TYPE) << 8) | (i3 & Opcodes.CONST_METHOD_TYPE));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m3442(int i) {
        long j = ((long) i) << 32;
        int i2 = C2434.f5044;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m3443(float f, float f2, float f3, float f4, AbstractC2325 abstractC2325) {
        int i;
        int i2;
        int i3;
        float fMo3225;
        float fMo3226;
        int i4;
        int i5;
        int i6;
        int i7;
        float fMo32252;
        float fMo32262;
        int i8;
        int i9;
        int i10;
        float f5;
        if (abstractC2325.mo3224()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i11 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i12 = i11 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i13 = i12 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i13 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i14 = C2434.f5044;
            return j;
        }
        if (((int) (abstractC2325.f4581 >> 32)) != 3) {
            AbstractC2424.m3468("Color only works with ColorSpaces with 3 components");
        }
        int i15 = abstractC2325.f4580;
        if (i15 == -1) {
            AbstractC2424.m3468("Unknown color space, please use a color space in ColorSpaces");
        }
        float fMo32253 = abstractC2325.mo3225(0);
        float fMo32263 = abstractC2325.mo3226(0);
        if (f >= fMo32253) {
            fMo32253 = f;
        }
        if (fMo32253 <= fMo32263) {
            fMo32263 = fMo32253;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fMo32263);
        int i16 = iFloatToRawIntBits >>> 31;
        int i17 = (iFloatToRawIntBits >>> 23) & Opcodes.CONST_METHOD_TYPE;
        int i18 = iFloatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    fMo3225 = abstractC2325.mo3225(1);
                    fMo3226 = abstractC2325.mo3226(1);
                    if (f2 >= fMo3225) {
                        fMo3225 = f2;
                    }
                    if (fMo3225 <= fMo3226) {
                        fMo3226 = fMo3225;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo3226);
                    int i20 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & Opcodes.CONST_METHOD_TYPE;
                    int i21 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                fMo32252 = abstractC2325.mo3225(2);
                                fMo32262 = abstractC2325.mo3226(2);
                                if (f3 >= fMo32252) {
                                    fMo32252 = f3;
                                }
                                if (fMo32252 <= fMo32262) {
                                    fMo32262 = fMo32252;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo32262);
                                int i23 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & Opcodes.CONST_METHOD_TYPE;
                                int i24 = 8388607 & iFloatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    i = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        i = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            short s3 = (short) i10;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i27 = C2434.f5044;
                                            return j2;
                                        }
                                        i9 = i26;
                                        i = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (i << 10);
                                short s32 = (short) i10;
                                if (f4 >= 0.0f) {
                                }
                                long j22 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s32)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i272 = C2434.f5044;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    fMo32252 = abstractC2325.mo3225(2);
                    fMo32262 = abstractC2325.mo3226(2);
                    if (f3 >= fMo32252) {
                    }
                    if (fMo32252 <= fMo32262) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fMo32262);
                    int i232 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & Opcodes.CONST_METHOD_TYPE;
                    int i242 = 8388607 & iFloatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (i << 10);
                    short s322 = (short) i10;
                    if (f4 >= 0.0f) {
                    }
                    long j222 = (((long) i15) & 63) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((65535 & ((long) s322)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i2722 = C2434.f5044;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s4 = (short) i3;
        fMo3225 = abstractC2325.mo3225(1);
        fMo3226 = abstractC2325.mo3226(1);
        if (f2 >= fMo3225) {
        }
        if (fMo3225 <= fMo3226) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fMo3226);
        int i202 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & Opcodes.CONST_METHOD_TYPE;
        int i212 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        fMo32252 = abstractC2325.mo3225(2);
        fMo32262 = abstractC2325.mo3226(2);
        if (f3 >= fMo32252) {
        }
        if (fMo32252 <= fMo32262) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fMo32262);
        int i2322 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & Opcodes.CONST_METHOD_TYPE;
        int i2422 = 8388607 & iFloatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (i << 10);
        short s3222 = (short) i10;
        if (f4 >= 0.0f) {
        }
        long j2222 = (((long) i15) & 63) | ((((long) s4) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((65535 & ((long) s3222)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i27222 = C2434.f5044;
        return j2222;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2430 m3444(C2445 c2445) {
        Canvas canvas = AbstractC2429.f5032;
        C2430 c2430 = new C2430();
        c2430.f5035 = new Canvas(m3458(c2445));
        return c2430;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final void m3445(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final boolean m3446(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final BlendMode m3447(int i) {
        return i == 0 ? BlendMode.CLEAR : i == 1 ? BlendMode.SRC : i == 2 ? BlendMode.DST : i == 3 ? BlendMode.SRC_OVER : i == 4 ? BlendMode.DST_OVER : i == 5 ? BlendMode.SRC_IN : i == 6 ? BlendMode.DST_IN : i == 7 ? BlendMode.SRC_OUT : i == 8 ? BlendMode.DST_OUT : i == 9 ? BlendMode.SRC_ATOP : i == 10 ? BlendMode.DST_ATOP : i == 11 ? BlendMode.XOR : i == 12 ? BlendMode.PLUS : i == 13 ? BlendMode.MODULATE : i == 14 ? BlendMode.SCREEN : i == 15 ? BlendMode.OVERLAY : i == 16 ? BlendMode.DARKEN : i == 17 ? BlendMode.LIGHTEN : i == 18 ? BlendMode.COLOR_DODGE : i == 19 ? BlendMode.COLOR_BURN : i == 20 ? BlendMode.HARD_LIGHT : i == 21 ? BlendMode.SOFT_LIGHT : i == 22 ? BlendMode.DIFFERENCE : i == 23 ? BlendMode.EXCLUSION : i == 24 ? BlendMode.MULTIPLY : i == 25 ? BlendMode.HUE : i == 26 ? BlendMode.SATURATION : i == 27 ? BlendMode.COLOR : i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final Rect m3448(C8734 c8734) {
        return new Rect(c8734.f22223, c8734.f22222, c8734.f22221, c8734.f22220);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m3449(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final long m3450(C8157 c8157) {
        float f = c8157.f19883 - c8157.f19885;
        return (((long) Float.floatToRawIntBits(c8157.f19882 - c8157.f19884)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m3451(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f5004) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f5006 = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f5005 = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f5006 = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f5005 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f5006;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f5005;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f5004 = true;
        }
        if (z) {
            try {
                Method method4 = f5006;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f5005) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC2962 m3452(InterfaceC2962 interfaceC2962, float f, float f2, long j, InterfaceC2404 interfaceC2404, boolean z, long j2, long j3) {
        return interfaceC2962.mo4426(new C2417(f, f2, j, interfaceC2404, z, j2, j3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static InterfaceC2962 m3453(InterfaceC2962 interfaceC2962, float f, float f2, InterfaceC2404 interfaceC2404, boolean z, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f3 = f;
        if ((i & 32) != 0) {
            f2 = 0.0f;
        }
        float f4 = f2;
        long j = C2450.f5072;
        InterfaceC2404 interfaceC24042 = (i & 2048) != 0 ? f5007 : interfaceC2404;
        long j2 = AbstractC2414.f5003;
        return m3452(interfaceC2962, f3, f4, j, interfaceC24042, z, j2, j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Paint m3454(C2444 c2444) {
        if (c2444 == null) {
            AbstractC2424.m3468("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + AbstractC5228.f13320.mo9476(c2444.getClass()).mo9444());
        }
        return (Paint) c2444.f5061;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC2962 m3455(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387) {
        return interfaceC2962.mo4426(new C2443(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2444 m3456() {
        return new C2444(new Paint(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2445 m3457(int i, int i2, int i3) {
        ColorSpace rgb;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        C2330 c2330 = C2324.f4557;
        m3432(i3);
        Bitmap.Config configM3432 = m3432(i3);
        if (AbstractC5227.m9466(c2330, c2330)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (AbstractC5227.m9466(c2330, C2324.f4570)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (AbstractC5227.m9466(c2330, C2324.f4571)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (AbstractC5227.m9466(c2330, C2324.f4572)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (AbstractC5227.m9466(c2330, C2324.f4579)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (AbstractC5227.m9466(c2330, C2324.f4578)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (AbstractC5227.m9466(c2330, C2324.f4562)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (AbstractC5227.m9466(c2330, C2324.f4563)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (AbstractC5227.m9466(c2330, C2324.f4576)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (AbstractC5227.m9466(c2330, C2324.f4577)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (AbstractC5227.m9466(c2330, C2324.f4575)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (AbstractC5227.m9466(c2330, C2324.f4574)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (AbstractC5227.m9466(c2330, C2324.f4556)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (AbstractC5227.m9466(c2330, C2324.f4569)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (AbstractC5227.m9466(c2330, C2324.f4573)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!AbstractC5227.m9466(c2330, C2324.f4568)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    ColorSpace colorSpace2 = AbstractC5227.m9466(c2330, C2324.f4567) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : AbstractC5227.m9466(c2330, C2324.f4564) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    }
                } else if (c2330 != null) {
                    String str = c2330.f4582;
                    float[] fArrM3227 = c2330.f4594.m3227();
                    C2331 c2331 = c2330.f4601;
                    ColorSpace.Rgb.TransferParameters transferParameters = c2331 != null ? new ColorSpace.Rgb.TransferParameters(c2331.f4610, c2331.f4609, c2331.f4608, c2331.f4607, c2331.f4606, c2331.f4612, c2331.f4611) : null;
                    float[] fArr = c2330.f4604;
                    final int i4 = 0;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, c2330.f4600, fArrM3227, transferParameters);
                        if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr2 = c2330.f4600;
                        final InterfaceC7387 interfaceC7387 = c2330.f4603;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.飘花落叶言子楪兰哲苏世
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i5 = i4;
                                InterfaceC7387 interfaceC73872 = interfaceC7387;
                                switch (i5) {
                                }
                                return ((Number) interfaceC73872.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final InterfaceC7387 interfaceC73872 = c2330.f4598;
                        final int i5 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr2, fArrM3227, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.飘花落叶言子楪兰哲苏世
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i52 = i5;
                                InterfaceC7387 interfaceC738722 = interfaceC73872;
                                switch (i52) {
                                }
                                return ((Number) interfaceC738722.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, c2330.f4593, c2330.f4592);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new C2445(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM3432, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new C2445(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM3432, true, colorSpace));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Bitmap m3458(C2445 c2445) {
        if (c2445 instanceof C2445) {
            return c2445.f5064;
        }
        C6755.m11867("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long m3459(long j, long j2) {
        float f;
        float f2;
        long jM3511 = C2434.m3511(j, C2434.m3506(j2));
        float fM3508 = C2434.m3508(j2);
        float fM35082 = C2434.m3508(jM3511);
        float f3 = 1.0f - fM35082;
        float f4 = (fM3508 * f3) + fM35082;
        float fM3512 = C2434.m3512(jM3511);
        float fM35122 = C2434.m3512(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fM35122 * fM3508) * f3) + (fM3512 * fM35082)) / f4;
        }
        float fM3513 = C2434.m3513(jM3511);
        float fM35132 = C2434.m3513(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fM35132 * fM3508) * f3) + (fM3513 * fM35082)) / f4;
        }
        float fM3507 = C2434.m3507(jM3511);
        float fM35072 = C2434.m3507(j2);
        if (f4 != 0.0f) {
            f5 = (((fM35072 * fM3508) * f3) + (fM3507 * fM35082)) / f4;
        }
        return m3461(f, f2, f5, f4, C2434.m3506(j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m3460(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = C2450.f5071;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m3461(float f, float f2, float f3, float f4, AbstractC2325 abstractC2325) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (abstractC2325.mo3224()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i10 = C2434.f5044;
            return j;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & Opcodes.CONST_METHOD_TYPE;
        int i13 = iFloatToRawIntBits & 8388607;
        int i14 = 49;
        int i15 = 0;
        if (i12 == 255) {
            i2 = i13 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i12 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i13 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i11 << 15);
                    short s = (short) i3;
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    int i17 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & Opcodes.CONST_METHOD_TYPE;
                    int i18 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(f3);
                                int i20 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & Opcodes.CONST_METHOD_TYPE;
                                int i21 = 8388607 & iFloatToRawIntBits3;
                                if (i8 != 255) {
                                    int i22 = i8 - 112;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                            } else {
                                                i14 = i22;
                                            }
                                        } else if (i22 >= -10) {
                                            int i23 = (i21 | 8388608) >> (1 - i22);
                                            if ((i23 & 4096) != 0) {
                                                i23 += 8192;
                                            }
                                            i14 = 0;
                                            i15 = i23 >> 13;
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC2325.f4580) & 63);
                                    int i24 = C2434.f5044;
                                    return jMax;
                                }
                                i15 = i21 == 0 ? 0 : 512;
                                i14 = 31;
                                i9 = (i20 << 15) | (i14 << 10) | i15;
                                long jMax2 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC2325.f4580) & 63);
                                int i242 = C2434.f5044;
                                return jMax2;
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i25 = (i18 | 8388608) >> (1 - i5);
                            if ((i25 & 4096) != 0) {
                                i25 += 8192;
                            }
                            i6 = i25 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(f3);
                    int i202 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & Opcodes.CONST_METHOD_TYPE;
                    int i212 = 8388607 & iFloatToRawIntBits32;
                    if (i8 != 255) {
                    }
                    i9 = (i202 << 15) | (i14 << 10) | i15;
                    long jMax22 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s22) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC2325.f4580) & 63);
                    int i2422 = C2434.f5044;
                    return jMax22;
                }
                i2 = i16;
            } else if (i >= -10) {
                int i26 = (i13 | 8388608) >> (1 - i);
                if ((i26 & 4096) != 0) {
                    i26 += 8192;
                }
                i2 = i26 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i11 << 15) | (i << 10);
        short s3 = (short) i3;
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(f2);
        int i172 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & Opcodes.CONST_METHOD_TYPE;
        int i182 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(f3);
        int i2022 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & Opcodes.CONST_METHOD_TYPE;
        int i2122 = 8388607 & iFloatToRawIntBits322;
        if (i8 != 255) {
        }
        i9 = (i2022 << 15) | (i14 << 10) | i15;
        long jMax222 = ((((long) ((short) i9)) & 65535) << 16) | ((((long) s3) & 65535) << 48) | ((((long) s222) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC2325.f4580) & 63);
        int i24222 = C2434.f5044;
        return jMax222;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract C8157 mo3429();
}
