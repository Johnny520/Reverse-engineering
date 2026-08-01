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

/* JADX INFO: renamed from: hb */
/* JADX INFO: loaded from: classes.dex */
public final class C0292hb {

    /* JADX INFO: renamed from: A */
    public CharSequence f2156A;

    /* JADX INFO: renamed from: B */
    public CharSequence f2157B;

    /* JADX INFO: renamed from: C */
    public boolean f2158C;

    /* JADX INFO: renamed from: E */
    public Bitmap f2160E;

    /* JADX INFO: renamed from: F */
    public float f2161F;

    /* JADX INFO: renamed from: G */
    public float f2162G;

    /* JADX INFO: renamed from: H */
    public float f2163H;

    /* JADX INFO: renamed from: I */
    public float f2164I;

    /* JADX INFO: renamed from: J */
    public float f2165J;

    /* JADX INFO: renamed from: K */
    public int f2166K;

    /* JADX INFO: renamed from: L */
    public int[] f2167L;

    /* JADX INFO: renamed from: M */
    public boolean f2168M;

    /* JADX INFO: renamed from: N */
    public final TextPaint f2169N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f2170O;

    /* JADX INFO: renamed from: P */
    public TimeInterpolator f2171P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f2172Q;

    /* JADX INFO: renamed from: R */
    public float f2173R;

    /* JADX INFO: renamed from: S */
    public float f2174S;

    /* JADX INFO: renamed from: T */
    public float f2175T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f2176U;

    /* JADX INFO: renamed from: V */
    public float f2177V;

    /* JADX INFO: renamed from: W */
    public float f2178W;

    /* JADX INFO: renamed from: X */
    public float f2179X;

    /* JADX INFO: renamed from: Y */
    public StaticLayout f2180Y;

    /* JADX INFO: renamed from: Z */
    public float f2181Z;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f2182a;

    /* JADX INFO: renamed from: a0 */
    public float f2183a0;

    /* JADX INFO: renamed from: b */
    public float f2184b;

    /* JADX INFO: renamed from: b0 */
    public float f2185b0;

    /* JADX INFO: renamed from: c */
    public final Rect f2186c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f2187c0;

    /* JADX INFO: renamed from: d */
    public final Rect f2188d;

    /* JADX INFO: renamed from: e */
    public final RectF f2190e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f2197j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f2198k;

    /* JADX INFO: renamed from: l */
    public float f2199l;

    /* JADX INFO: renamed from: m */
    public float f2200m;

    /* JADX INFO: renamed from: n */
    public float f2201n;

    /* JADX INFO: renamed from: o */
    public float f2202o;

    /* JADX INFO: renamed from: p */
    public float f2203p;

    /* JADX INFO: renamed from: q */
    public float f2204q;

    /* JADX INFO: renamed from: r */
    public Typeface f2205r;

    /* JADX INFO: renamed from: s */
    public Typeface f2206s;

    /* JADX INFO: renamed from: t */
    public Typeface f2207t;

    /* JADX INFO: renamed from: u */
    public Typeface f2208u;

    /* JADX INFO: renamed from: v */
    public Typeface f2209v;

    /* JADX INFO: renamed from: w */
    public Typeface f2210w;

    /* JADX INFO: renamed from: x */
    public Typeface f2211x;

    /* JADX INFO: renamed from: y */
    public C0624q8 f2212y;

    /* JADX INFO: renamed from: f */
    public int f2192f = 16;

    /* JADX INFO: renamed from: g */
    public int f2194g = 16;

    /* JADX INFO: renamed from: h */
    public float f2195h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f2196i = 15.0f;

    /* JADX INFO: renamed from: z */
    public final TextUtils.TruncateAt f2213z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D */
    public final boolean f2159D = true;

    /* JADX INFO: renamed from: d0 */
    public final int f2189d0 = 1;

    /* JADX INFO: renamed from: e0 */
    public final float f2191e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public final int f2193f0 = 1;

    public C0292hb(TextInputLayout textInputLayout) {
        this.f2182a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f2169N = textPaint;
        this.f2170O = new TextPaint(textPaint);
        this.f2188d = new Rect();
        this.f2186c = new Rect();
        this.f2190e = new RectF();
        m1378g(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m1372a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: f */
    public static float m1373f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0618q2.m2108a(f, f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1374b(CharSequence charSequence) {
        WeakHashMap weakHashMap = oa0.f3426a;
        boolean z = y90.m2732d(this.f2182a) == 1;
        if (this.f2159D) {
            return (z ? h60.f2120d : h60.f2119c).m494b(charSequence, charSequence.length());
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m1375c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.f2156A == null) {
            return;
        }
        float fWidth = this.f2188d.width();
        float fWidth2 = this.f2186c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f2196i;
            f3 = this.f2177V;
            this.f2161F = 1.0f;
            typeface = this.f2205r;
        } else {
            float f4 = this.f2195h;
            float f5 = this.f2178W;
            Typeface typeface2 = this.f2208u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f2161F = 1.0f;
            } else {
                this.f2161F = m1373f(this.f2195h, this.f2196i, f, this.f2172Q) / this.f2195h;
            }
            float f6 = this.f2196i / this.f2195h;
            fWidth = (z || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f2169N;
        if (fWidth > 0.0f) {
            boolean z3 = this.f2162G != f2;
            boolean z4 = this.f2179X != f3;
            boolean z5 = this.f2211x != typeface;
            StaticLayout staticLayout = this.f2180Y;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f2168M;
            this.f2162G = f2;
            this.f2179X = f3;
            this.f2211x = typeface;
            this.f2168M = false;
            textPaint.setLinearText(this.f2161F != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f2157B == null || z2) {
            textPaint.setTextSize(this.f2162G);
            textPaint.setTypeface(this.f2211x);
            textPaint.setLetterSpacing(this.f2179X);
            boolean zM1374b = m1374b(this.f2156A);
            this.f2158C = zM1374b;
            int i = this.f2189d0;
            if (i <= 1 || zM1374b) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f2192f, zM1374b ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f2158C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f2158C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            a50 a50Var = new a50(this.f2156A, textPaint, (int) fWidth);
            a50Var.f37k = this.f2213z;
            a50Var.f36j = zM1374b;
            a50Var.f31e = alignment;
            a50Var.f35i = false;
            a50Var.f32f = i;
            a50Var.f33g = this.f2191e0;
            a50Var.f34h = this.f2193f0;
            StaticLayout staticLayoutM29a = a50Var.m29a();
            staticLayoutM29a.getClass();
            this.f2180Y = staticLayoutM29a;
            this.f2157B = staticLayoutM29a.getText();
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m1376d() {
        float f = this.f2196i;
        TextPaint textPaint = this.f2170O;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f2205r);
        textPaint.setLetterSpacing(this.f2177V);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: e */
    public final int m1377e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f2167L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    public final void m1378g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f2207t;
            if (typeface != null) {
                this.f2206s = AbstractC0274gu.m1299B(configuration, typeface);
            }
            Typeface typeface2 = this.f2210w;
            if (typeface2 != null) {
                this.f2209v = AbstractC0274gu.m1299B(configuration, typeface2);
            }
            Typeface typeface3 = this.f2206s;
            if (typeface3 == null) {
                typeface3 = this.f2207t;
            }
            this.f2205r = typeface3;
            Typeface typeface4 = this.f2209v;
            if (typeface4 == null) {
                typeface4 = this.f2210w;
            }
            this.f2208u = typeface4;
            m1379h(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1379h(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f2182a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m1375c(1.0f, z);
        CharSequence charSequence = this.f2157B;
        TextPaint textPaint = this.f2169N;
        if (charSequence != null && (staticLayout = this.f2180Y) != null) {
            this.f2187c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f2213z);
        }
        CharSequence charSequence2 = this.f2187c0;
        if (charSequence2 != null) {
            this.f2181Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f2181Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f2194g, this.f2158C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f2188d;
        if (i == 48) {
            this.f2200m = rect.top;
        } else if (i != 80) {
            this.f2200m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f2200m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f2202o = rect.centerX() - (this.f2181Z / 2.0f);
        } else if (i2 != 5) {
            this.f2202o = rect.left;
        } else {
            this.f2202o = rect.right - this.f2181Z;
        }
        m1375c(0.0f, z);
        float height = this.f2180Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f2180Y;
        if (staticLayout2 == null || this.f2189d0 <= 1) {
            CharSequence charSequence3 = this.f2157B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f2180Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f2192f, this.f2158C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f2186c;
        if (i3 == 48) {
            this.f2199l = rect2.top;
        } else if (i3 != 80) {
            this.f2199l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f2199l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f2201n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f2201n = rect2.left;
        } else {
            this.f2201n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f2160E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f2160E = null;
        }
        m1383l(this.f2184b);
        float f = this.f2184b;
        float fM1373f = m1373f(rect2.left, rect.left, f, this.f2171P);
        RectF rectF = this.f2190e;
        rectF.left = fM1373f;
        rectF.top = m1373f(this.f2199l, this.f2200m, f, this.f2171P);
        rectF.right = m1373f(rect2.right, rect.right, f, this.f2171P);
        rectF.bottom = m1373f(rect2.bottom, rect.bottom, f, this.f2171P);
        this.f2203p = m1373f(this.f2201n, this.f2202o, f, this.f2171P);
        this.f2204q = m1373f(this.f2199l, this.f2200m, f, this.f2171P);
        m1383l(f);
        C0820vj c0820vj = AbstractC0618q2.f3771b;
        this.f2183a0 = 1.0f - m1373f(0.0f, 1.0f, 1.0f - f, c0820vj);
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2663k(textInputLayout);
        this.f2185b0 = m1373f(1.0f, 0.0f, f, c0820vj);
        x90.m2663k(textInputLayout);
        ColorStateList colorStateList = this.f2198k;
        ColorStateList colorStateList2 = this.f2197j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m1372a(f, m1377e(colorStateList2), m1377e(this.f2198k)));
        } else {
            textPaint.setColor(m1377e(colorStateList));
        }
        float f2 = this.f2177V;
        float f3 = this.f2178W;
        if (f2 != f3) {
            textPaint.setLetterSpacing(m1373f(f3, f2, f, c0820vj));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.f2163H = AbstractC0618q2.m2108a(0.0f, this.f2173R, f);
        this.f2164I = AbstractC0618q2.m2108a(0.0f, this.f2174S, f);
        this.f2165J = AbstractC0618q2.m2108a(0.0f, this.f2175T, f);
        int iM1372a = m1372a(f, 0, m1377e(this.f2176U));
        this.f2166K = iM1372a;
        textPaint.setShadowLayer(this.f2163H, this.f2164I, this.f2165J, iM1372a);
        x90.m2663k(textInputLayout);
    }

    /* JADX INFO: renamed from: i */
    public final void m1380i(ColorStateList colorStateList) {
        if (this.f2198k == colorStateList && this.f2197j == colorStateList) {
            return;
        }
        this.f2198k = colorStateList;
        this.f2197j = colorStateList;
        m1379h(false);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1381j(Typeface typeface) {
        C0624q8 c0624q8 = this.f2212y;
        if (c0624q8 != null) {
            c0624q8.f3866e = true;
        }
        if (this.f2207t == typeface) {
            return false;
        }
        this.f2207t = typeface;
        Typeface typefaceM1299B = AbstractC0274gu.m1299B(this.f2182a.getContext().getResources().getConfiguration(), typeface);
        this.f2206s = typefaceM1299B;
        if (typefaceM1299B == null) {
            typefaceM1299B = this.f2207t;
        }
        this.f2205r = typefaceM1299B;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m1382k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f2184b) {
            this.f2184b = f;
            float f2 = this.f2186c.left;
            Rect rect = this.f2188d;
            float fM1373f = m1373f(f2, rect.left, f, this.f2171P);
            RectF rectF = this.f2190e;
            rectF.left = fM1373f;
            rectF.top = m1373f(this.f2199l, this.f2200m, f, this.f2171P);
            rectF.right = m1373f(r1.right, rect.right, f, this.f2171P);
            rectF.bottom = m1373f(r1.bottom, rect.bottom, f, this.f2171P);
            this.f2203p = m1373f(this.f2201n, this.f2202o, f, this.f2171P);
            this.f2204q = m1373f(this.f2199l, this.f2200m, f, this.f2171P);
            m1383l(f);
            C0820vj c0820vj = AbstractC0618q2.f3771b;
            this.f2183a0 = 1.0f - m1373f(0.0f, 1.0f, 1.0f - f, c0820vj);
            WeakHashMap weakHashMap = oa0.f3426a;
            TextInputLayout textInputLayout = this.f2182a;
            x90.m2663k(textInputLayout);
            this.f2185b0 = m1373f(1.0f, 0.0f, f, c0820vj);
            x90.m2663k(textInputLayout);
            ColorStateList colorStateList = this.f2198k;
            ColorStateList colorStateList2 = this.f2197j;
            TextPaint textPaint = this.f2169N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m1372a(f, m1377e(colorStateList2), m1377e(this.f2198k)));
            } else {
                textPaint.setColor(m1377e(colorStateList));
            }
            float f3 = this.f2177V;
            float f4 = this.f2178W;
            if (f3 != f4) {
                textPaint.setLetterSpacing(m1373f(f4, f3, f, c0820vj));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f2163H = AbstractC0618q2.m2108a(0.0f, this.f2173R, f);
            this.f2164I = AbstractC0618q2.m2108a(0.0f, this.f2174S, f);
            this.f2165J = AbstractC0618q2.m2108a(0.0f, this.f2175T, f);
            int iM1372a = m1372a(f, 0, m1377e(this.f2176U));
            this.f2166K = iM1372a;
            textPaint.setShadowLayer(this.f2163H, this.f2164I, this.f2165J, iM1372a);
            x90.m2663k(textInputLayout);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1383l(float f) {
        m1375c(f, false);
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2663k(this.f2182a);
    }

    /* JADX INFO: renamed from: m */
    public final void m1384m(Typeface typeface) {
        boolean z;
        boolean zM1381j = m1381j(typeface);
        if (this.f2210w != typeface) {
            this.f2210w = typeface;
            Typeface typefaceM1299B = AbstractC0274gu.m1299B(this.f2182a.getContext().getResources().getConfiguration(), typeface);
            this.f2209v = typefaceM1299B;
            if (typefaceM1299B == null) {
                typefaceM1299B = this.f2210w;
            }
            this.f2208u = typefaceM1299B;
            z = true;
        } else {
            z = false;
        }
        if (zM1381j || z) {
            m1379h(false);
        }
    }
}
