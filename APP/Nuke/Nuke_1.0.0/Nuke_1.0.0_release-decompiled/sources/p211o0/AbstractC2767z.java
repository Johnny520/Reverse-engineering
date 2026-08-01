package p211o0;

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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p112W2.InterfaceC1601c;
import p153e1.C2015k;
import p169h0.InterfaceC2207p;
import p204n0.C2684c;
import p217p0.C2873d;

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

    /* JADX INFO: renamed from: A */
    public static final PorterDuff.Mode m4928A(int i5) {
        return i5 == 0 ? PorterDuff.Mode.CLEAR : i5 == 1 ? PorterDuff.Mode.SRC : i5 == 2 ? PorterDuff.Mode.DST : i5 == 3 ? PorterDuff.Mode.SRC_OVER : i5 == 4 ? PorterDuff.Mode.DST_OVER : i5 == 5 ? PorterDuff.Mode.SRC_IN : i5 == 6 ? PorterDuff.Mode.DST_IN : i5 == 7 ? PorterDuff.Mode.SRC_OUT : i5 == 8 ? PorterDuff.Mode.DST_OUT : i5 == 9 ? PorterDuff.Mode.SRC_ATOP : i5 == 10 ? PorterDuff.Mode.DST_ATOP : i5 == 11 ? PorterDuff.Mode.XOR : i5 == 12 ? PorterDuff.Mode.ADD : i5 == 14 ? PorterDuff.Mode.SCREEN : i5 == 15 ? PorterDuff.Mode.OVERLAY : i5 == 16 ? PorterDuff.Mode.DARKEN : i5 == 17 ? PorterDuff.Mode.LIGHTEN : i5 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: B */
    public static String m4929B(int i5) {
        return i5 == 0 ? "Clear" : i5 == 1 ? "Src" : i5 == 2 ? "Dst" : i5 == 3 ? "SrcOver" : i5 == 4 ? "DstOver" : i5 == 5 ? "SrcIn" : i5 == 6 ? "DstIn" : i5 == 7 ? "SrcOut" : i5 == 8 ? "DstOut" : i5 == 9 ? "SrcAtop" : i5 == 10 ? "DstAtop" : i5 == 11 ? "Xor" : i5 == 12 ? "Plus" : i5 == 13 ? "Modulate" : i5 == 14 ? "Screen" : i5 == 15 ? "Overlay" : i5 == 16 ? "Darken" : i5 == 17 ? "Lighten" : i5 == 18 ? "ColorDodge" : i5 == 19 ? "ColorBurn" : i5 == 20 ? "HardLight" : i5 == 21 ? "Softlight" : i5 == 22 ? "Difference" : i5 == 23 ? "Exclusion" : i5 == 24 ? "Multiply" : i5 == 25 ? "Hue" : i5 == 26 ? "Saturation" : i5 == 27 ? "Color" : i5 == 28 ? "Luminosity" : "Unknown";
    }

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

    /* JADX INFO: renamed from: a */
    public static final C2743b m4931a(C2747f c2747f) {
        Canvas canvas = AbstractC2744c.f8726a;
        C2743b c2743b = new C2743b();
        c2743b.f8723a = new Canvas(m4939i(c2747f));
        return c2743b;
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m4932b(float r21, float r22, float r23, float r24, p217p0.AbstractC2872c r25) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p211o0.AbstractC2767z.m4932b(float, float, float, float, p0.c):long");
    }

    /* JADX INFO: renamed from: c */
    public static final long m4933c(int i5) {
        long j5 = ((long) i5) << 32;
        int i6 = C2762u.f8763h;
        return j5;
    }

    /* JADX INFO: renamed from: d */
    public static final long m4934d(long j5) {
        long j6 = j5 << 32;
        int i5 = C2762u.f8763h;
        return j6;
    }

    /* JADX INFO: renamed from: e */
    public static long m4935e(int i5, int i6, int i7) {
        return m4933c(((i5 & 255) << 16) | (-16777216) | ((i6 & 255) << 8) | (i7 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p211o0.C2747f m4936f(int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p211o0.AbstractC2767z.m4936f(int, int, int):o0.f");
    }

    /* JADX INFO: renamed from: g */
    public static final C2748g m4937g() {
        return new C2748g(new Paint(7));
    }

    /* JADX INFO: renamed from: h */
    public static final long m4938h(float f2, float f5) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        int i5 = C2741P.f8721c;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: i */
    public static final Bitmap m4939i(C2747f c2747f) {
        if (c2747f instanceof C2747f) {
            return c2747f.f8734a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

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

    /* JADX INFO: renamed from: l */
    public static final InterfaceC2207p m4941l(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C2755n(interfaceC1601c));
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC2207p m4942m(InterfaceC2207p interfaceC2207p, float f2, float f5, long j5, InterfaceC2738M interfaceC2738M, boolean z5, long j6, long j7) {
        return interfaceC2207p.mo4021c(new C2766y(f2, f5, j5, interfaceC2738M, z5, j6, j7));
    }

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

    /* JADX INFO: renamed from: o */
    public static final boolean m4944o(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

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

    /* JADX INFO: renamed from: r */
    public static final long m4947r(C2684c c2684c) {
        float f2 = c2684c.f8560c - c2684c.f8558a;
        return (((long) Float.floatToRawIntBits(c2684c.f8561d - c2684c.f8559b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX INFO: renamed from: s */
    public static final BlendMode m4948s(int i5) {
        return i5 == 0 ? BlendMode.CLEAR : i5 == 1 ? BlendMode.SRC : i5 == 2 ? BlendMode.DST : i5 == 3 ? BlendMode.SRC_OVER : i5 == 4 ? BlendMode.DST_OVER : i5 == 5 ? BlendMode.SRC_IN : i5 == 6 ? BlendMode.DST_IN : i5 == 7 ? BlendMode.SRC_OUT : i5 == 8 ? BlendMode.DST_OUT : i5 == 9 ? BlendMode.SRC_ATOP : i5 == 10 ? BlendMode.DST_ATOP : i5 == 11 ? BlendMode.XOR : i5 == 12 ? BlendMode.PLUS : i5 == 13 ? BlendMode.MODULATE : i5 == 14 ? BlendMode.SCREEN : i5 == 15 ? BlendMode.OVERLAY : i5 == 16 ? BlendMode.DARKEN : i5 == 17 ? BlendMode.LIGHTEN : i5 == 18 ? BlendMode.COLOR_DODGE : i5 == 19 ? BlendMode.COLOR_BURN : i5 == 20 ? BlendMode.HARD_LIGHT : i5 == 21 ? BlendMode.SOFT_LIGHT : i5 == 22 ? BlendMode.DIFFERENCE : i5 == 23 ? BlendMode.EXCLUSION : i5 == 24 ? BlendMode.MULTIPLY : i5 == 25 ? BlendMode.HUE : i5 == 26 ? BlendMode.SATURATION : i5 == 27 ? BlendMode.COLOR : i5 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: t */
    public static final Rect m4949t(C2015k c2015k) {
        return new Rect(c2015k.f6737a, c2015k.f6738b, c2015k.f6739c, c2015k.f6740d);
    }

    /* JADX INFO: renamed from: u */
    public static final RectF m4950u(C2684c c2684c) {
        return new RectF(c2684c.f8558a, c2684c.f8559b, c2684c.f8560c, c2684c.f8561d);
    }

    /* JADX INFO: renamed from: v */
    public static final Shader.TileMode m4951v(int i5) {
        return i5 == 0 ? Shader.TileMode.CLAMP : i5 == 1 ? Shader.TileMode.REPEAT : i5 == 2 ? Shader.TileMode.MIRROR : i5 == 3 ? Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    /* JADX INFO: renamed from: w */
    public static final int m4952w(long j5) {
        float[] fArr = C2873d.f9071a;
        return (int) (C2762u.m4919a(j5, C2873d.f9075e) >>> 32);
    }

    /* JADX INFO: renamed from: x */
    public static final Bitmap.Config m4953x(int i5) {
        return i5 == 0 ? Bitmap.Config.ARGB_8888 : i5 == 1 ? Bitmap.Config.ALPHA_8 : i5 == 2 ? Bitmap.Config.RGB_565 : i5 == 3 ? Bitmap.Config.RGBA_F16 : i5 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: y */
    public static final C2684c m4954y(Rect rect) {
        return new C2684c(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: z */
    public static final C2684c m4955z(RectF rectF) {
        return new C2684c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: k */
    public abstract C2684c mo4788k();
}
