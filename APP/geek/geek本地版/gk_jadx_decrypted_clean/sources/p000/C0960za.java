package p000;

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
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: za */
/* JADX INFO: loaded from: classes.dex */
public final class C0960za {

    /* JADX INFO: renamed from: A */
    public CharSequence f5475A;

    /* JADX INFO: renamed from: B */
    public CharSequence f5476B;

    /* JADX INFO: renamed from: C */
    public boolean f5477C;

    /* JADX INFO: renamed from: E */
    public Bitmap f5479E;

    /* JADX INFO: renamed from: F */
    public float f5480F;

    /* JADX INFO: renamed from: G */
    public float f5481G;

    /* JADX INFO: renamed from: H */
    public float f5482H;

    /* JADX INFO: renamed from: I */
    public float f5483I;

    /* JADX INFO: renamed from: J */
    public float f5484J;

    /* JADX INFO: renamed from: K */
    public int f5485K;

    /* JADX INFO: renamed from: L */
    public int[] f5486L;

    /* JADX INFO: renamed from: M */
    public boolean f5487M;

    /* JADX INFO: renamed from: N */
    public final TextPaint f5488N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f5489O;

    /* JADX INFO: renamed from: P */
    public TimeInterpolator f5490P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f5491Q;

    /* JADX INFO: renamed from: R */
    public float f5492R;

    /* JADX INFO: renamed from: S */
    public float f5493S;

    /* JADX INFO: renamed from: T */
    public float f5494T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f5495U;

    /* JADX INFO: renamed from: V */
    public float f5496V;

    /* JADX INFO: renamed from: W */
    public float f5497W;

    /* JADX INFO: renamed from: X */
    public float f5498X;

    /* JADX INFO: renamed from: Y */
    public StaticLayout f5499Y;

    /* JADX INFO: renamed from: Z */
    public float f5500Z;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f5501a;

    /* JADX INFO: renamed from: a0 */
    public float f5502a0;

    /* JADX INFO: renamed from: b */
    public float f5503b;

    /* JADX INFO: renamed from: b0 */
    public float f5504b0;

    /* JADX INFO: renamed from: c */
    public final Rect f5505c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f5506c0;

    /* JADX INFO: renamed from: d */
    public final Rect f5507d;

    /* JADX INFO: renamed from: e */
    public final RectF f5509e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f5516j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f5517k;

    /* JADX INFO: renamed from: l */
    public float f5518l;

    /* JADX INFO: renamed from: m */
    public float f5519m;

    /* JADX INFO: renamed from: n */
    public float f5520n;

    /* JADX INFO: renamed from: o */
    public float f5521o;

    /* JADX INFO: renamed from: p */
    public float f5522p;

    /* JADX INFO: renamed from: q */
    public float f5523q;

    /* JADX INFO: renamed from: r */
    public Typeface f5524r;

    /* JADX INFO: renamed from: s */
    public Typeface f5525s;

    /* JADX INFO: renamed from: t */
    public Typeface f5526t;

    /* JADX INFO: renamed from: u */
    public Typeface f5527u;

    /* JADX INFO: renamed from: v */
    public Typeface f5528v;

    /* JADX INFO: renamed from: w */
    public Typeface f5529w;

    /* JADX INFO: renamed from: x */
    public Typeface f5530x;

    /* JADX INFO: renamed from: y */
    public C0252g8 f5531y;

    /* JADX INFO: renamed from: f */
    public int f5511f = 16;

    /* JADX INFO: renamed from: g */
    public int f5513g = 16;

    /* JADX INFO: renamed from: h */
    public float f5514h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f5515i = 15.0f;

    /* JADX INFO: renamed from: z */
    public final TextUtils.TruncateAt f5532z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D */
    public final boolean f5478D = true;

    /* JADX INFO: renamed from: d0 */
    public final int f5508d0 = 1;

    /* JADX INFO: renamed from: e0 */
    public final float f5510e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public final int f5512f0 = 1;

    public C0960za(TextInputLayout textInputLayout) {
        this.f5501a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f5488N = textPaint;
        this.f5489O = new TextPaint(textPaint);
        this.f5507d = new Rect();
        this.f5505c = new Rect();
        this.f5509e = new RectF();
        m2792g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m2786a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: f */
    public static float m2787f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0619q2.m2139a(f, f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2788b(CharSequence charSequence) {
        WeakHashMap weakHashMap = ja0.f2600a;
        boolean z = t90.m2367d(this.f5501a) == 1;
        if (this.f5478D) {
            return (z ? b60.f755d : b60.f754c).m2252b(charSequence, charSequence.length());
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m2789c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.f5475A == null) {
            return;
        }
        float fWidth = this.f5507d.width();
        float fWidth2 = this.f5505c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f5515i;
            f3 = this.f5496V;
            this.f5480F = 1.0f;
            typeface = this.f5524r;
        } else {
            float f4 = this.f5514h;
            float f5 = this.f5497W;
            Typeface typeface2 = this.f5527u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f5480F = 1.0f;
            } else {
                this.f5480F = m2787f(this.f5514h, this.f5515i, f, this.f5491Q) / this.f5514h;
            }
            float f6 = this.f5515i / this.f5514h;
            fWidth = (z || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f5488N;
        if (fWidth > 0.0f) {
            boolean z3 = this.f5481G != f2;
            boolean z4 = this.f5498X != f3;
            boolean z5 = this.f5530x != typeface;
            StaticLayout staticLayout = this.f5499Y;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f5487M;
            this.f5481G = f2;
            this.f5498X = f3;
            this.f5530x = typeface;
            this.f5487M = false;
            textPaint.setLinearText(this.f5480F != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f5476B == null || z2) {
            textPaint.setTextSize(this.f5481G);
            textPaint.setTypeface(this.f5530x);
            textPaint.setLetterSpacing(this.f5498X);
            boolean zM2788b = m2788b(this.f5475A);
            this.f5477C = zM2788b;
            int i = this.f5508d0;
            if (i <= 1 || zM2788b) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f5511f, zM2788b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f5477C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f5477C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            t40 t40Var = new t40(this.f5475A, textPaint, (int) fWidth);
            t40Var.f4506k = this.f5532z;
            t40Var.f4505j = zM2788b;
            t40Var.f4500e = alignment;
            t40Var.f4504i = false;
            t40Var.f4501f = i;
            t40Var.f4502g = this.f5510e0;
            t40Var.f4503h = this.f5512f0;
            StaticLayout staticLayoutM2358a = t40Var.m2358a();
            staticLayoutM2358a.getClass();
            this.f5499Y = staticLayoutM2358a;
            this.f5476B = staticLayoutM2358a.getText();
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m2790d() {
        float f = this.f5515i;
        TextPaint textPaint = this.f5489O;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f5524r);
        textPaint.setLetterSpacing(this.f5496V);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: e */
    public final int m2791e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f5486L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    public final void m2792g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f5526t;
            if (typeface != null) {
                this.f5525s = AbstractC0979zt.m2816G(configuration, typeface);
            }
            Typeface typeface2 = this.f5529w;
            if (typeface2 != null) {
                this.f5528v = AbstractC0979zt.m2816G(configuration, typeface2);
            }
            Typeface typeface3 = this.f5525s;
            if (typeface3 == null) {
                typeface3 = this.f5526t;
            }
            this.f5524r = typeface3;
            Typeface typeface4 = this.f5528v;
            if (typeface4 == null) {
                typeface4 = this.f5529w;
            }
            this.f5527u = typeface4;
            m2793h(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2793h(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f5501a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m2789c(1.0f, z);
        CharSequence charSequence = this.f5476B;
        TextPaint textPaint = this.f5488N;
        if (charSequence != null && (staticLayout = this.f5499Y) != null) {
            this.f5506c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f5532z);
        }
        CharSequence charSequence2 = this.f5506c0;
        if (charSequence2 != null) {
            this.f5500Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f5500Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f5513g, this.f5477C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f5507d;
        if (i == 48) {
            this.f5519m = rect.top;
        } else if (i != 80) {
            this.f5519m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f5519m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f5521o = rect.centerX() - (this.f5500Z / 2.0f);
        } else if (i2 != 5) {
            this.f5521o = rect.left;
        } else {
            this.f5521o = rect.right - this.f5500Z;
        }
        m2789c(0.0f, z);
        float height = this.f5499Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f5499Y;
        if (staticLayout2 == null || this.f5508d0 <= 1) {
            CharSequence charSequence3 = this.f5476B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f5499Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f5511f, this.f5477C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f5505c;
        if (i3 == 48) {
            this.f5518l = rect2.top;
        } else if (i3 != 80) {
            this.f5518l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f5518l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f5520n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f5520n = rect2.left;
        } else {
            this.f5520n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f5479E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f5479E = null;
        }
        m2797l(this.f5503b);
        float f = this.f5503b;
        float fM2787f = m2787f(rect2.left, rect.left, f, this.f5490P);
        RectF rectF = this.f5509e;
        rectF.left = fM2787f;
        rectF.top = m2787f(this.f5518l, this.f5519m, f, this.f5490P);
        rectF.right = m2787f(rect2.right, rect.right, f, this.f5490P);
        rectF.bottom = m2787f(rect2.bottom, rect.bottom, f, this.f5490P);
        this.f5522p = m2787f(this.f5520n, this.f5521o, f, this.f5490P);
        this.f5523q = m2787f(this.f5518l, this.f5519m, f, this.f5490P);
        m2797l(f);
        C0747tj c0747tj = AbstractC0619q2.f3972b;
        this.f5502a0 = 1.0f - m2787f(0.0f, 1.0f, 1.0f - f, c0747tj);
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2319k(textInputLayout);
        this.f5504b0 = m2787f(1.0f, 0.0f, f, c0747tj);
        s90.m2319k(textInputLayout);
        ColorStateList colorStateList = this.f5517k;
        ColorStateList colorStateList2 = this.f5516j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m2786a(f, m2791e(colorStateList2), m2791e(this.f5517k)));
        } else {
            textPaint.setColor(m2791e(colorStateList));
        }
        float f2 = this.f5496V;
        float f3 = this.f5497W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m2787f(f3, f2, f, c0747tj));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f5482H = AbstractC0619q2.m2139a(0.0f, this.f5492R, f);
        this.f5483I = AbstractC0619q2.m2139a(0.0f, this.f5493S, f);
        this.f5484J = AbstractC0619q2.m2139a(0.0f, this.f5494T, f);
        int iM2786a = m2786a(f, 0, m2791e(this.f5495U));
        this.f5485K = iM2786a;
        textPaint.setShadowLayer(this.f5482H, this.f5483I, this.f5484J, iM2786a);
        s90.m2319k(textInputLayout);
    }

    /* JADX INFO: renamed from: i */
    public final void m2794i(ColorStateList colorStateList) {
        if (this.f5517k == colorStateList && this.f5516j == colorStateList) {
            return;
        }
        this.f5517k = colorStateList;
        this.f5516j = colorStateList;
        m2793h(false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2795j(Typeface typeface) {
        C0252g8 c0252g8 = this.f5531y;
        if (c0252g8 != null) {
            c0252g8.f2037c = true;
        }
        if (this.f5526t == typeface) {
            return false;
        }
        this.f5526t = typeface;
        Typeface typefaceM2816G = AbstractC0979zt.m2816G(this.f5501a.getContext().getResources().getConfiguration(), typeface);
        this.f5525s = typefaceM2816G;
        if (typefaceM2816G == null) {
            typefaceM2816G = this.f5526t;
        }
        this.f5524r = typefaceM2816G;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m2796k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f5503b) {
            this.f5503b = f;
            float f2 = this.f5505c.left;
            Rect rect = this.f5507d;
            float fM2787f = m2787f(f2, rect.left, f, this.f5490P);
            RectF rectF = this.f5509e;
            rectF.left = fM2787f;
            rectF.top = m2787f(this.f5518l, this.f5519m, f, this.f5490P);
            rectF.right = m2787f(r1.right, rect.right, f, this.f5490P);
            rectF.bottom = m2787f(r1.bottom, rect.bottom, f, this.f5490P);
            this.f5522p = m2787f(this.f5520n, this.f5521o, f, this.f5490P);
            this.f5523q = m2787f(this.f5518l, this.f5519m, f, this.f5490P);
            m2797l(f);
            C0747tj c0747tj = AbstractC0619q2.f3972b;
            this.f5502a0 = 1.0f - m2787f(0.0f, 1.0f, 1.0f - f, c0747tj);
            WeakHashMap weakHashMap = ja0.f2600a;
            TextInputLayout textInputLayout = this.f5501a;
            s90.m2319k(textInputLayout);
            this.f5504b0 = m2787f(1.0f, 0.0f, f, c0747tj);
            s90.m2319k(textInputLayout);
            ColorStateList colorStateList = this.f5517k;
            ColorStateList colorStateList2 = this.f5516j;
            TextPaint textPaint = this.f5488N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m2786a(f, m2791e(colorStateList2), m2791e(this.f5517k)));
            } else {
                textPaint.setColor(m2791e(colorStateList));
            }
            float f3 = this.f5496V;
            float f4 = this.f5497W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m2787f(f4, f3, f, c0747tj));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f5482H = AbstractC0619q2.m2139a(0.0f, this.f5492R, f);
            this.f5483I = AbstractC0619q2.m2139a(0.0f, this.f5493S, f);
            this.f5484J = AbstractC0619q2.m2139a(0.0f, this.f5494T, f);
            int iM2786a = m2786a(f, 0, m2791e(this.f5495U));
            this.f5485K = iM2786a;
            textPaint.setShadowLayer(this.f5482H, this.f5483I, this.f5484J, iM2786a);
            s90.m2319k(textInputLayout);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2797l(float f) {
        m2789c(f, false);
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2319k(this.f5501a);
    }

    /* JADX INFO: renamed from: m */
    public final void m2798m(Typeface typeface) {
        boolean z;
        boolean zM2795j = m2795j(typeface);
        if (this.f5529w != typeface) {
            this.f5529w = typeface;
            Typeface typefaceM2816G = AbstractC0979zt.m2816G(this.f5501a.getContext().getResources().getConfiguration(), typeface);
            this.f5528v = typefaceM2816G;
            if (typefaceM2816G == null) {
                typefaceM2816G = this.f5529w;
            }
            this.f5527u = typefaceM2816G;
            z = true;
        } else {
            z = false;
        }
        if (zM2795j || z) {
            m2793h(false);
        }
    }
}
