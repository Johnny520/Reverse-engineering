package p000a;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.n3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0720n3 {

    /* JADX INFO: renamed from: A */
    public CharSequence f2742A;

    /* JADX INFO: renamed from: B */
    public CharSequence f2743B;

    /* JADX INFO: renamed from: C */
    public boolean f2744C;

    /* JADX INFO: renamed from: E */
    public Bitmap f2746E;

    /* JADX INFO: renamed from: F */
    public float f2747F;

    /* JADX INFO: renamed from: G */
    public float f2748G;

    /* JADX INFO: renamed from: H */
    public float f2749H;

    /* JADX INFO: renamed from: I */
    public float f2750I;

    /* JADX INFO: renamed from: J */
    public float f2751J;

    /* JADX INFO: renamed from: K */
    public int f2752K;

    /* JADX INFO: renamed from: L */
    public int[] f2753L;

    /* JADX INFO: renamed from: M */
    public boolean f2754M;

    /* JADX INFO: renamed from: N */
    public final TextPaint f2755N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f2756O;

    /* JADX INFO: renamed from: P */
    public LinearInterpolator f2757P;

    /* JADX INFO: renamed from: Q */
    public LinearInterpolator f2758Q;

    /* JADX INFO: renamed from: R */
    public float f2759R;

    /* JADX INFO: renamed from: S */
    public float f2760S;

    /* JADX INFO: renamed from: T */
    public float f2761T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f2762U;

    /* JADX INFO: renamed from: V */
    public float f2763V;

    /* JADX INFO: renamed from: W */
    public float f2764W;

    /* JADX INFO: renamed from: X */
    public float f2765X;

    /* JADX INFO: renamed from: Y */
    public StaticLayout f2766Y;

    /* JADX INFO: renamed from: Z */
    public float f2767Z;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f2768a;

    /* JADX INFO: renamed from: a0 */
    public float f2769a0;

    /* JADX INFO: renamed from: b */
    public float f2770b;

    /* JADX INFO: renamed from: b0 */
    public float f2771b0;

    /* JADX INFO: renamed from: c */
    public final Rect f2772c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f2773c0;

    /* JADX INFO: renamed from: d */
    public final Rect f2774d;

    /* JADX INFO: renamed from: e */
    public final RectF f2776e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f2783j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f2784k;

    /* JADX INFO: renamed from: l */
    public float f2785l;

    /* JADX INFO: renamed from: m */
    public float f2786m;

    /* JADX INFO: renamed from: n */
    public float f2787n;

    /* JADX INFO: renamed from: o */
    public float f2788o;

    /* JADX INFO: renamed from: p */
    public float f2789p;

    /* JADX INFO: renamed from: q */
    public float f2790q;

    /* JADX INFO: renamed from: r */
    public Typeface f2791r;

    /* JADX INFO: renamed from: s */
    public Typeface f2792s;

    /* JADX INFO: renamed from: t */
    public Typeface f2793t;

    /* JADX INFO: renamed from: u */
    public Typeface f2794u;

    /* JADX INFO: renamed from: v */
    public Typeface f2795v;

    /* JADX INFO: renamed from: w */
    public Typeface f2796w;

    /* JADX INFO: renamed from: x */
    public Typeface f2797x;

    /* JADX INFO: renamed from: y */
    public C0167J2 f2798y;

    /* JADX INFO: renamed from: f */
    public int f2778f = 16;

    /* JADX INFO: renamed from: g */
    public int f2780g = 16;

    /* JADX INFO: renamed from: h */
    public float f2781h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f2782i = 15.0f;

    /* JADX INFO: renamed from: z */
    public final TextUtils.TruncateAt f2799z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D */
    public final boolean f2745D = true;

    /* JADX INFO: renamed from: d0 */
    public final int f2775d0 = 1;

    /* JADX INFO: renamed from: e0 */
    public final float f2777e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public final int f2779f0 = 1;

    public C0720n3(TextInputLayout textInputLayout) {
        this.f2768a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f2755N = textPaint;
        this.f2756O = new TextPaint(textPaint);
        this.f2774d = new Rect();
        this.f2772c = new Rect();
        this.f2776e = new RectF();
        m1646g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m1640a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: f */
    public static float m1641f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C0888w0.m2112a(f, f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1642b(CharSequence charSequence) {
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        boolean z = this.f2768a.getLayoutDirection() == 1;
        if (this.f2745D) {
            return (z ? C0430Xe.f1612d : C0430Xe.f1611c).m1076b(charSequence, charSequence.length());
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m1643c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.f2742A == null) {
            return;
        }
        float fWidth = this.f2774d.width();
        float fWidth2 = this.f2772c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f2782i;
            f3 = this.f2763V;
            this.f2747F = 1.0f;
            typeface = this.f2791r;
        } else {
            float f4 = this.f2781h;
            float f5 = this.f2764W;
            Typeface typeface2 = this.f2794u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f2747F = 1.0f;
            } else {
                this.f2747F = m1641f(this.f2781h, this.f2782i, f, this.f2758Q) / this.f2781h;
            }
            float f6 = this.f2782i / this.f2781h;
            fWidth = (z || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f2755N;
        if (fWidth > 0.0f) {
            boolean z3 = this.f2748G != f2;
            boolean z4 = this.f2765X != f3;
            boolean z5 = this.f2797x != typeface;
            StaticLayout staticLayout = this.f2766Y;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f2754M;
            this.f2748G = f2;
            this.f2765X = f3;
            this.f2797x = typeface;
            this.f2754M = false;
            textPaint.setLinearText(this.f2747F != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f2743B == null || z2) {
            textPaint.setTextSize(this.f2748G);
            textPaint.setTypeface(this.f2797x);
            textPaint.setLetterSpacing(this.f2765X);
            boolean zM1642b = m1642b(this.f2742A);
            this.f2744C = zM1642b;
            int i = this.f2775d0;
            if (i <= 1 || zM1642b) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f2778f, zM1642b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f2744C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f2744C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C0864ue c0864ue = new C0864ue(this.f2742A, textPaint, (int) fWidth);
            c0864ue.f3380k = this.f2799z;
            c0864ue.f3379j = zM1642b;
            c0864ue.f3374e = alignment;
            c0864ue.f3378i = false;
            c0864ue.f3375f = i;
            c0864ue.f3376g = this.f2777e0;
            c0864ue.f3377h = this.f2779f0;
            StaticLayout staticLayoutM1992a = c0864ue.m1992a();
            staticLayoutM1992a.getClass();
            this.f2766Y = staticLayoutM1992a;
            this.f2743B = staticLayoutM1992a.getText();
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m1644d() {
        TextPaint textPaint = this.f2756O;
        textPaint.setTextSize(this.f2782i);
        textPaint.setTypeface(this.f2791r);
        textPaint.setLetterSpacing(this.f2763V);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: e */
    public final int m1645e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f2753L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    public final void m1646g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f2793t;
            if (typeface != null) {
                this.f2792s = C0395Vf.m1038a(configuration, typeface);
            }
            Typeface typeface2 = this.f2796w;
            if (typeface2 != null) {
                this.f2795v = C0395Vf.m1038a(configuration, typeface2);
            }
            Typeface typeface3 = this.f2792s;
            if (typeface3 == null) {
                typeface3 = this.f2793t;
            }
            this.f2791r = typeface3;
            Typeface typeface4 = this.f2795v;
            if (typeface4 == null) {
                typeface4 = this.f2796w;
            }
            this.f2794u = typeface4;
            m1647h(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1647h(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f2768a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m1643c(1.0f, z);
        CharSequence charSequence = this.f2743B;
        TextPaint textPaint = this.f2755N;
        if (charSequence != null && (staticLayout = this.f2766Y) != null) {
            this.f2773c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f2799z);
        }
        CharSequence charSequence2 = this.f2773c0;
        if (charSequence2 != null) {
            this.f2767Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f2767Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f2780g, this.f2744C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f2774d;
        if (i == 48) {
            this.f2786m = rect.top;
        } else if (i != 80) {
            this.f2786m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f2786m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f2788o = rect.centerX() - (this.f2767Z / 2.0f);
        } else if (i2 != 5) {
            this.f2788o = rect.left;
        } else {
            this.f2788o = rect.right - this.f2767Z;
        }
        m1643c(0.0f, z);
        float height = this.f2766Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f2766Y;
        if (staticLayout2 == null || this.f2775d0 <= 1) {
            CharSequence charSequence3 = this.f2743B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f2766Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f2778f, this.f2744C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f2772c;
        if (i3 == 48) {
            this.f2785l = rect2.top;
        } else if (i3 != 80) {
            this.f2785l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f2785l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f2787n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f2787n = rect2.left;
        } else {
            this.f2787n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f2746E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f2746E = null;
        }
        m1651l(this.f2770b);
        float f = this.f2770b;
        float fM1641f = m1641f(rect2.left, rect.left, f, this.f2757P);
        RectF rectF = this.f2776e;
        rectF.left = fM1641f;
        rectF.top = m1641f(this.f2785l, this.f2786m, f, this.f2757P);
        rectF.right = m1641f(rect2.right, rect.right, f, this.f2757P);
        rectF.bottom = m1641f(rect2.bottom, rect.bottom, f, this.f2757P);
        this.f2789p = m1641f(this.f2787n, this.f2788o, f, this.f2757P);
        this.f2790q = m1641f(this.f2785l, this.f2786m, f, this.f2757P);
        m1651l(f);
        C0685l6 c0685l6 = C0888w0.f3469b;
        this.f2769a0 = 1.0f - m1641f(0.0f, 1.0f, 1.0f - f, c0685l6);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        textInputLayout.postInvalidateOnAnimation();
        this.f2771b0 = m1641f(1.0f, 0.0f, f, c0685l6);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f2784k;
        ColorStateList colorStateList2 = this.f2783j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m1640a(m1645e(colorStateList2), m1645e(this.f2784k), f));
        } else {
            textPaint.setColor(m1645e(colorStateList));
        }
        float f2 = this.f2763V;
        float f3 = this.f2764W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m1641f(f3, f2, f, c0685l6));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f2749H = C0888w0.m2112a(0.0f, this.f2759R, f);
        this.f2750I = C0888w0.m2112a(0.0f, this.f2760S, f);
        this.f2751J = C0888w0.m2112a(0.0f, this.f2761T, f);
        int iM1640a = m1640a(0, m1645e(this.f2762U), f);
        this.f2752K = iM1640a;
        textPaint.setShadowLayer(this.f2749H, this.f2750I, this.f2751J, iM1640a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: i */
    public final void m1648i(ColorStateList colorStateList) {
        if (this.f2784k == colorStateList && this.f2783j == colorStateList) {
            return;
        }
        this.f2784k = colorStateList;
        this.f2783j = colorStateList;
        m1647h(false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1649j(Typeface typeface) {
        C0167J2 c0167j2 = this.f2798y;
        if (c0167j2 != null) {
            c0167j2.f595c = true;
        }
        if (this.f2793t == typeface) {
            return false;
        }
        this.f2793t = typeface;
        Typeface typefaceM1038a = C0395Vf.m1038a(this.f2768a.getContext().getResources().getConfiguration(), typeface);
        this.f2792s = typefaceM1038a;
        if (typefaceM1038a == null) {
            typefaceM1038a = this.f2793t;
        }
        this.f2791r = typefaceM1038a;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m1650k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f2770b) {
            this.f2770b = f;
            float f2 = this.f2772c.left;
            Rect rect = this.f2774d;
            float fM1641f = m1641f(f2, rect.left, f, this.f2757P);
            RectF rectF = this.f2776e;
            rectF.left = fM1641f;
            rectF.top = m1641f(this.f2785l, this.f2786m, f, this.f2757P);
            rectF.right = m1641f(r1.right, rect.right, f, this.f2757P);
            rectF.bottom = m1641f(r1.bottom, rect.bottom, f, this.f2757P);
            this.f2789p = m1641f(this.f2787n, this.f2788o, f, this.f2757P);
            this.f2790q = m1641f(this.f2785l, this.f2786m, f, this.f2757P);
            m1651l(f);
            C0685l6 c0685l6 = C0888w0.f3469b;
            this.f2769a0 = 1.0f - m1641f(0.0f, 1.0f, 1.0f - f, c0685l6);
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            TextInputLayout textInputLayout = this.f2768a;
            textInputLayout.postInvalidateOnAnimation();
            this.f2771b0 = m1641f(1.0f, 0.0f, f, c0685l6);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f2784k;
            ColorStateList colorStateList2 = this.f2783j;
            TextPaint textPaint = this.f2755N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m1640a(m1645e(colorStateList2), m1645e(this.f2784k), f));
            } else {
                textPaint.setColor(m1645e(colorStateList));
            }
            float f3 = this.f2763V;
            float f4 = this.f2764W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m1641f(f4, f3, f, c0685l6));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f2749H = C0888w0.m2112a(0.0f, this.f2759R, f);
            this.f2750I = C0888w0.m2112a(0.0f, this.f2760S, f);
            this.f2751J = C0888w0.m2112a(0.0f, this.f2761T, f);
            int iM1640a = m1640a(0, m1645e(this.f2762U), f);
            this.f2752K = iM1640a;
            textPaint.setShadowLayer(this.f2749H, this.f2750I, this.f2751J, iM1640a);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1651l(float f) {
        m1643c(f, false);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        this.f2768a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: m */
    public final void m1652m(Typeface typeface) {
        boolean z;
        boolean zM1649j = m1649j(typeface);
        if (this.f2796w != typeface) {
            this.f2796w = typeface;
            Typeface typefaceM1038a = C0395Vf.m1038a(this.f2768a.getContext().getResources().getConfiguration(), typeface);
            this.f2795v = typefaceM1038a;
            if (typefaceM1038a == null) {
                typefaceM1038a = this.f2796w;
            }
            this.f2794u = typefaceM1038a;
            z = true;
        } else {
            z = false;
        }
        if (zM1649j || z) {
            m1647h(false);
        }
    }
}
