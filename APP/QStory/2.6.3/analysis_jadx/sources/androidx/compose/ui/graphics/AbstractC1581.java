package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.colorspace.C1489;
import com.android.dx.io.Opcodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4396;
import p052.InterfaceC6558;
import p112.C7328;
import p205.C7905;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean f4659;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Method f4660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Method f4661;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1577 f4662 = new C1577();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1573 f4663;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final PorterDuff.Mode m2870(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final C7328 m2871(RectF rectF) {
        return new C7328(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final Bitmap.Config m2872(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final int m2873(long j) {
        float[] fArr = C1489.f4216;
        return (int) (C1599.m2951(j, C1489.f4212) >>> 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final Shader.TileMode m2874(int i) {
        return i == 0 ? Shader.TileMode.CLAMP : i == 1 ? Shader.TileMode.REPEAT : i == 2 ? Shader.TileMode.MIRROR : i == 3 ? Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final RectF m2875(C7328 c7328) {
        return new RectF(c7328.f19540, c7328.f19539, c7328.f19538, c7328.f19537);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final int m2876(float f, float[] fArr, int i) {
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
    public static String m2877(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static String m2878(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m2880(long j) {
        long j2 = j << 32;
        int i = C1599.f4699;
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m2881(int i, int i2, int i3, int i4) {
        return m2882(((i & Opcodes.CONST_METHOD_TYPE) << 16) | ((i4 & Opcodes.CONST_METHOD_TYPE) << 24) | ((i2 & Opcodes.CONST_METHOD_TYPE) << 8) | (i3 & Opcodes.CONST_METHOD_TYPE));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m2882(int i) {
        long j = ((long) i) << 32;
        int i2 = C1599.f4699;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m2883(float r21, float r22, float r23, float r24, androidx.compose.ui.graphics.colorspace.AbstractC1490 r25) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AbstractC1581.m2883(float, float, float, float, androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1595 m2884(C1610 c1610) {
        Canvas canvas = AbstractC1594.f4687;
        C1595 c1595 = new C1595();
        c1595.f4690 = new Canvas(m2898(c1610));
        return c1595;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final void m2885(Matrix matrix, float[] fArr) {
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
    public static final boolean m2886(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final BlendMode m2887(int i) {
        return i == 0 ? BlendMode.CLEAR : i == 1 ? BlendMode.SRC : i == 2 ? BlendMode.DST : i == 3 ? BlendMode.SRC_OVER : i == 4 ? BlendMode.DST_OVER : i == 5 ? BlendMode.SRC_IN : i == 6 ? BlendMode.DST_IN : i == 7 ? BlendMode.SRC_OUT : i == 8 ? BlendMode.DST_OUT : i == 9 ? BlendMode.SRC_ATOP : i == 10 ? BlendMode.DST_ATOP : i == 11 ? BlendMode.XOR : i == 12 ? BlendMode.PLUS : i == 13 ? BlendMode.MODULATE : i == 14 ? BlendMode.SCREEN : i == 15 ? BlendMode.OVERLAY : i == 16 ? BlendMode.DARKEN : i == 17 ? BlendMode.LIGHTEN : i == 18 ? BlendMode.COLOR_DODGE : i == 19 ? BlendMode.COLOR_BURN : i == 20 ? BlendMode.HARD_LIGHT : i == 21 ? BlendMode.SOFT_LIGHT : i == 22 ? BlendMode.DIFFERENCE : i == 23 ? BlendMode.EXCLUSION : i == 24 ? BlendMode.MULTIPLY : i == 25 ? BlendMode.HUE : i == 26 ? BlendMode.SATURATION : i == 27 ? BlendMode.COLOR : i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final Rect m2888(C7905 c7905) {
        return new Rect(c7905.f21878, c7905.f21877, c7905.f21876, c7905.f21875);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m2889(Matrix matrix, float[] fArr) {
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
    public static final long m2890(C7328 c7328) {
        float f = c7328.f19538 - c7328.f19540;
        return (((long) Float.floatToRawIntBits(c7328.f19537 - c7328.f19539)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m2891(Canvas canvas, boolean z) {
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
        if (!f4659) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f4661 = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f4660 = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f4661 = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f4660 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f4661;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f4660;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f4659 = true;
        }
        if (z) {
            try {
                Method method4 = f4661;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f4660) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC2129 m2892(InterfaceC2129 interfaceC2129, float f, float f2, long j, InterfaceC1569 interfaceC1569, boolean z, long j2, long j3) {
        return interfaceC2129.mo3866(new C1582(f, f2, j, interfaceC1569, z, j2, j3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static InterfaceC2129 m2893(InterfaceC2129 interfaceC2129, float f, float f2, InterfaceC1569 interfaceC1569, boolean z, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f3 = f;
        if ((i & 32) != 0) {
            f2 = 0.0f;
        }
        float f4 = f2;
        long j = C1615.f4727;
        InterfaceC1569 interfaceC15692 = (i & 2048) != 0 ? f4662 : interfaceC1569;
        long j2 = AbstractC1579.f4658;
        return m2892(interfaceC2129, f3, f4, j, interfaceC15692, z, j2, j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Paint m2894(C1609 c1609) {
        if (c1609 == null) {
            AbstractC1589.m2908("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + AbstractC4396.f12975.mo8917(c1609.getClass()).mo8885());
        }
        return (Paint) c1609.f4716;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC2129 m2895(InterfaceC2129 interfaceC2129, InterfaceC6558 interfaceC6558) {
        return interfaceC2129.mo3866(new C1608(interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1609 m2896() {
        return new C1609(new Paint(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.compose.ui.graphics.C1610 m2897(int r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AbstractC1581.m2897(int, int, int):androidx.compose.ui.graphics.飘花落叶言子楪苏世哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Bitmap m2898(C1610 c1610) {
        if (c1610 instanceof C1610) {
            return c1610.f4719;
        }
        C5925.m11308("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long m2899(long j, long j2) {
        float f;
        float f2;
        long jM2951 = C1599.m2951(j, C1599.m2946(j2));
        float fM2948 = C1599.m2948(j2);
        float fM29482 = C1599.m2948(jM2951);
        float f3 = 1.0f - fM29482;
        float f4 = (fM2948 * f3) + fM29482;
        float fM2952 = C1599.m2952(jM2951);
        float fM29522 = C1599.m2952(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fM29522 * fM2948) * f3) + (fM2952 * fM29482)) / f4;
        }
        float fM2953 = C1599.m2953(jM2951);
        float fM29532 = C1599.m2953(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fM29532 * fM2948) * f3) + (fM2953 * fM29482)) / f4;
        }
        float fM2947 = C1599.m2947(jM2951);
        float fM29472 = C1599.m2947(j2);
        if (f4 != 0.0f) {
            f5 = (((fM29472 * fM2948) * f3) + (fM2947 * fM29482)) / f4;
        }
        return m2901(f, f2, f5, f4, C1599.m2946(j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m2900(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = C1615.f4726;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m2901(float r17, float r18, float r19, float r20, androidx.compose.ui.graphics.colorspace.AbstractC1490 r21) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AbstractC1581.m2901(float, float, float, float, androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract C7328 mo2869();
}
