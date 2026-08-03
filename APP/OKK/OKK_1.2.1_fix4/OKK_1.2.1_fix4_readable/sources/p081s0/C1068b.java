package p081s0;

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
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import p002B.AbstractC0058h;
import p006D.AbstractC0080Q;
import p028P.C0273a;
import p060h0.AbstractC0945a;
import p084u0.C1096a;

/* JADX INFO: renamed from: s0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1068b {

    /* JADX INFO: renamed from: A */
    public CharSequence f4094A;

    /* JADX INFO: renamed from: B */
    public CharSequence f4095B;

    /* JADX INFO: renamed from: C */
    public boolean f4096C;

    /* JADX INFO: renamed from: E */
    public Bitmap f4098E;

    /* JADX INFO: renamed from: F */
    public float f4099F;

    /* JADX INFO: renamed from: G */
    public float f4100G;

    /* JADX INFO: renamed from: H */
    public float f4101H;

    /* JADX INFO: renamed from: I */
    public float f4102I;

    /* JADX INFO: renamed from: J */
    public float f4103J;

    /* JADX INFO: renamed from: K */
    public int f4104K;

    /* JADX INFO: renamed from: L */
    public int[] f4105L;

    /* JADX INFO: renamed from: M */
    public boolean f4106M;

    /* JADX INFO: renamed from: N */
    public final TextPaint f4107N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f4108O;

    /* JADX INFO: renamed from: P */
    public TimeInterpolator f4109P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f4110Q;

    /* JADX INFO: renamed from: R */
    public float f4111R;

    /* JADX INFO: renamed from: S */
    public float f4112S;

    /* JADX INFO: renamed from: T */
    public float f4113T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f4114U;

    /* JADX INFO: renamed from: V */
    public float f4115V;

    /* JADX INFO: renamed from: W */
    public float f4116W;

    /* JADX INFO: renamed from: X */
    public float f4117X;

    /* JADX INFO: renamed from: Y */
    public StaticLayout f4118Y;

    /* JADX INFO: renamed from: Z */
    public float f4119Z;

    /* JADX INFO: renamed from: a */
    public final View f4120a;

    /* JADX INFO: renamed from: a0 */
    public float f4121a0;

    /* JADX INFO: renamed from: b */
    public float f4122b;

    /* JADX INFO: renamed from: b0 */
    public float f4123b0;

    /* JADX INFO: renamed from: c */
    public final Rect f4124c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f4125c0;

    /* JADX INFO: renamed from: d */
    public final Rect f4126d;

    /* JADX INFO: renamed from: e */
    public final RectF f4128e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f4135j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f4136k;

    /* JADX INFO: renamed from: l */
    public float f4137l;

    /* JADX INFO: renamed from: m */
    public float f4138m;

    /* JADX INFO: renamed from: n */
    public float f4139n;

    /* JADX INFO: renamed from: o */
    public float f4140o;

    /* JADX INFO: renamed from: p */
    public float f4141p;

    /* JADX INFO: renamed from: q */
    public float f4142q;

    /* JADX INFO: renamed from: r */
    public Typeface f4143r;

    /* JADX INFO: renamed from: s */
    public Typeface f4144s;

    /* JADX INFO: renamed from: t */
    public Typeface f4145t;

    /* JADX INFO: renamed from: u */
    public Typeface f4146u;

    /* JADX INFO: renamed from: v */
    public Typeface f4147v;

    /* JADX INFO: renamed from: w */
    public Typeface f4148w;

    /* JADX INFO: renamed from: x */
    public Typeface f4149x;

    /* JADX INFO: renamed from: y */
    public C1096a f4150y;

    /* JADX INFO: renamed from: f */
    public int f4130f = 16;

    /* JADX INFO: renamed from: g */
    public int f4132g = 16;

    /* JADX INFO: renamed from: h */
    public float f4133h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f4134i = 15.0f;

    /* JADX INFO: renamed from: z */
    public final TextUtils.TruncateAt f4151z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D */
    public final boolean f4097D = true;

    /* JADX INFO: renamed from: d0 */
    public final int f4127d0 = 1;

    /* JADX INFO: renamed from: e0 */
    public final float f4129e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public final int f4131f0 = 1;

    public C1068b(View view) {
        this.f4120a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f4107N = textPaint;
        this.f4108O = new TextPaint(textPaint);
        this.f4126d = new Rect();
        this.f4124c = new Rect();
        this.f4128e = new RectF();
        m2543g(view.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m2537a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i3) * f2) + (Color.alpha(i2) * f3)), Math.round((Color.red(i3) * f2) + (Color.red(i2) * f3)), Math.round((Color.green(i3) * f2) + (Color.green(i2) * f3)), Math.round((Color.blue(i3) * f2) + (Color.blue(i2) * f3)));
    }

    /* JADX INFO: renamed from: f */
    public static float m2538f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AbstractC0945a.m2275a(f2, f3, f4);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2539b(CharSequence charSequence) {
        Field field = AbstractC0080Q.f219a;
        boolean z2 = this.f4120a.getLayoutDirection() == 1;
        if (this.f4097D) {
            return (z2 ? AbstractC0058h.f202d : AbstractC0058h.f201c).m196b(charSequence.length(), charSequence);
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m2540c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f4094A == null) {
            return;
        }
        float fWidth = this.f4126d.width();
        float fWidth2 = this.f4124c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.f4134i;
            f4 = this.f4115V;
            this.f4099F = 1.0f;
            typeface = this.f4143r;
        } else {
            float f5 = this.f4133h;
            float f6 = this.f4116W;
            Typeface typeface2 = this.f4146u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f4099F = 1.0f;
            } else {
                this.f4099F = m2538f(this.f4133h, this.f4134i, f2, this.f4110Q) / this.f4133h;
            }
            float f7 = this.f4134i / this.f4133h;
            fWidth = (z2 || fWidth2 * f7 <= fWidth) ? fWidth2 : Math.min(fWidth / f7, fWidth2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f4107N;
        if (fWidth > 0.0f) {
            boolean z4 = this.f4100G != f3;
            boolean z5 = this.f4117X != f4;
            boolean z6 = this.f4149x != typeface;
            StaticLayout staticLayout = this.f4118Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f4106M;
            this.f4100G = f3;
            this.f4117X = f4;
            this.f4149x = typeface;
            this.f4106M = false;
            textPaint.setLinearText(this.f4099F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f4095B == null || z3) {
            textPaint.setTextSize(this.f4100G);
            textPaint.setTypeface(this.f4149x);
            textPaint.setLetterSpacing(this.f4117X);
            boolean zM2539b = m2539b(this.f4094A);
            this.f4096C = zM2539b;
            int i2 = this.f4127d0;
            if (i2 <= 1 || zM2539b) {
                i2 = 1;
            }
            if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f4130f, zM2539b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f4096C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f4096C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            C1073g c1073g = new C1073g(this.f4094A, textPaint, (int) fWidth);
            c1073g.f4171l = this.f4151z;
            c1073g.f4170k = zM2539b;
            c1073g.f4164e = alignment;
            c1073g.f4169j = false;
            c1073g.f4165f = i2;
            float f8 = this.f4129e0;
            c1073g.f4166g = 0.0f;
            c1073g.f4167h = f8;
            c1073g.f4168i = this.f4131f0;
            StaticLayout staticLayoutM2551a = c1073g.m2551a();
            staticLayoutM2551a.getClass();
            this.f4118Y = staticLayoutM2551a;
            this.f4095B = staticLayoutM2551a.getText();
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m2541d() {
        TextPaint textPaint = this.f4108O;
        textPaint.setTextSize(this.f4134i);
        textPaint.setTypeface(this.f4143r);
        textPaint.setLetterSpacing(this.f4115V);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: e */
    public final int m2542e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f4105L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    public final void m2543g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f4145t;
            if (typeface != null) {
                this.f4144s = AbstractC0805P.m2034J(configuration, typeface);
            }
            Typeface typeface2 = this.f4148w;
            if (typeface2 != null) {
                this.f4147v = AbstractC0805P.m2034J(configuration, typeface2);
            }
            Typeface typeface3 = this.f4144s;
            if (typeface3 == null) {
                typeface3 = this.f4145t;
            }
            this.f4143r = typeface3;
            Typeface typeface4 = this.f4147v;
            if (typeface4 == null) {
                typeface4 = this.f4148w;
            }
            this.f4146u = typeface4;
            m2544h(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2544h(boolean z2) {
        float fMeasureText;
        StaticLayout staticLayout;
        View view = this.f4120a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z2) {
            return;
        }
        m2540c(1.0f, z2);
        CharSequence charSequence = this.f4095B;
        TextPaint textPaint = this.f4107N;
        if (charSequence != null && (staticLayout = this.f4118Y) != null) {
            this.f4125c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f4151z);
        }
        CharSequence charSequence2 = this.f4125c0;
        if (charSequence2 != null) {
            this.f4119Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f4119Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f4132g, this.f4096C ? 1 : 0);
        int i2 = absoluteGravity & 112;
        Rect rect = this.f4126d;
        if (i2 == 48) {
            this.f4138m = rect.top;
        } else if (i2 != 80) {
            this.f4138m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f4138m = textPaint.ascent() + rect.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.f4140o = rect.centerX() - (this.f4119Z / 2.0f);
        } else if (i3 != 5) {
            this.f4140o = rect.left;
        } else {
            this.f4140o = rect.right - this.f4119Z;
        }
        m2540c(0.0f, z2);
        float height = this.f4118Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f4118Y;
        if (staticLayout2 == null || this.f4127d0 <= 1) {
            CharSequence charSequence3 = this.f4095B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f4118Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f4130f, this.f4096C ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        Rect rect2 = this.f4124c;
        if (i4 == 48) {
            this.f4137l = rect2.top;
        } else if (i4 != 80) {
            this.f4137l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f4137l = textPaint.descent() + (rect2.bottom - height);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.f4139n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i5 != 5) {
            this.f4139n = rect2.left;
        } else {
            this.f4139n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f4098E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f4098E = null;
        }
        m2548l(this.f4122b);
        float f2 = this.f4122b;
        float fM2538f = m2538f(rect2.left, rect.left, f2, this.f4109P);
        RectF rectF = this.f4128e;
        rectF.left = fM2538f;
        rectF.top = m2538f(this.f4137l, this.f4138m, f2, this.f4109P);
        rectF.right = m2538f(rect2.right, rect.right, f2, this.f4109P);
        rectF.bottom = m2538f(rect2.bottom, rect.bottom, f2, this.f4109P);
        this.f4141p = m2538f(this.f4139n, this.f4140o, f2, this.f4109P);
        this.f4142q = m2538f(this.f4137l, this.f4138m, f2, this.f4109P);
        m2548l(f2);
        C0273a c0273a = AbstractC0945a.f3355b;
        this.f4121a0 = 1.0f - m2538f(0.0f, 1.0f, 1.0f - f2, c0273a);
        Field field = AbstractC0080Q.f219a;
        view.postInvalidateOnAnimation();
        this.f4123b0 = m2538f(1.0f, 0.0f, f2, c0273a);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f4136k;
        ColorStateList colorStateList2 = this.f4135j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m2537a(m2542e(colorStateList2), m2542e(this.f4136k), f2));
        } else {
            textPaint.setColor(m2542e(colorStateList));
        }
        float f3 = this.f4115V;
        float f4 = this.f4116W;
        if (f3 != f4) {
            textPaint.setLetterSpacing(m2538f(f4, f3, f2, c0273a));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.f4101H = AbstractC0945a.m2275a(0.0f, this.f4111R, f2);
        this.f4102I = AbstractC0945a.m2275a(0.0f, this.f4112S, f2);
        this.f4103J = AbstractC0945a.m2275a(0.0f, this.f4113T, f2);
        int iM2537a = m2537a(0, m2542e(this.f4114U), f2);
        this.f4104K = iM2537a;
        textPaint.setShadowLayer(this.f4101H, this.f4102I, this.f4103J, iM2537a);
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: i */
    public final void m2545i(ColorStateList colorStateList) {
        if (this.f4136k == colorStateList && this.f4135j == colorStateList) {
            return;
        }
        this.f4136k = colorStateList;
        this.f4135j = colorStateList;
        m2544h(false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2546j(Typeface typeface) {
        C1096a c1096a = this.f4150y;
        if (c1096a != null) {
            c1096a.f4226d = true;
        }
        if (this.f4145t == typeface) {
            return false;
        }
        this.f4145t = typeface;
        Typeface typefaceM2034J = AbstractC0805P.m2034J(this.f4120a.getContext().getResources().getConfiguration(), typeface);
        this.f4144s = typefaceM2034J;
        if (typefaceM2034J == null) {
            typefaceM2034J = this.f4145t;
        }
        this.f4143r = typefaceM2034J;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m2547k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f4122b) {
            this.f4122b = f2;
            float f3 = this.f4124c.left;
            Rect rect = this.f4126d;
            float fM2538f = m2538f(f3, rect.left, f2, this.f4109P);
            RectF rectF = this.f4128e;
            rectF.left = fM2538f;
            rectF.top = m2538f(this.f4137l, this.f4138m, f2, this.f4109P);
            rectF.right = m2538f(r1.right, rect.right, f2, this.f4109P);
            rectF.bottom = m2538f(r1.bottom, rect.bottom, f2, this.f4109P);
            this.f4141p = m2538f(this.f4139n, this.f4140o, f2, this.f4109P);
            this.f4142q = m2538f(this.f4137l, this.f4138m, f2, this.f4109P);
            m2548l(f2);
            C0273a c0273a = AbstractC0945a.f3355b;
            this.f4121a0 = 1.0f - m2538f(0.0f, 1.0f, 1.0f - f2, c0273a);
            Field field = AbstractC0080Q.f219a;
            View view = this.f4120a;
            view.postInvalidateOnAnimation();
            this.f4123b0 = m2538f(1.0f, 0.0f, f2, c0273a);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f4136k;
            ColorStateList colorStateList2 = this.f4135j;
            TextPaint textPaint = this.f4107N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m2537a(m2542e(colorStateList2), m2542e(this.f4136k), f2));
            } else {
                textPaint.setColor(m2542e(colorStateList));
            }
            float f4 = this.f4115V;
            float f5 = this.f4116W;
            if (f4 != f5) {
                textPaint.setLetterSpacing(m2538f(f5, f4, f2, c0273a));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.f4101H = AbstractC0945a.m2275a(0.0f, this.f4111R, f2);
            this.f4102I = AbstractC0945a.m2275a(0.0f, this.f4112S, f2);
            this.f4103J = AbstractC0945a.m2275a(0.0f, this.f4113T, f2);
            int iM2537a = m2537a(0, m2542e(this.f4114U), f2);
            this.f4104K = iM2537a;
            textPaint.setShadowLayer(this.f4101H, this.f4102I, this.f4103J, iM2537a);
            view.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2548l(float f2) {
        m2540c(f2, false);
        Field field = AbstractC0080Q.f219a;
        this.f4120a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: m */
    public final void m2549m(Typeface typeface) {
        boolean z2;
        boolean zM2546j = m2546j(typeface);
        if (this.f4148w != typeface) {
            this.f4148w = typeface;
            Typeface typefaceM2034J = AbstractC0805P.m2034J(this.f4120a.getContext().getResources().getConfiguration(), typeface);
            this.f4147v = typefaceM2034J;
            if (typefaceM2034J == null) {
                typefaceM2034J = this.f4148w;
            }
            this.f4146u = typefaceM2034J;
            z2 = true;
        } else {
            z2 = false;
        }
        if (zM2546j || z2) {
            m2544h(false);
        }
    }
}
