package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
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

/* JADX INFO: renamed from: pa */
/* JADX INFO: loaded from: classes.dex */
public final class C2359pa {

    /* JADX INFO: renamed from: B */
    public CharSequence f8250B;

    /* JADX INFO: renamed from: C */
    public CharSequence f8251C;

    /* JADX INFO: renamed from: D */
    public boolean f8252D;

    /* JADX INFO: renamed from: F */
    public float f8254F;

    /* JADX INFO: renamed from: G */
    public float f8255G;

    /* JADX INFO: renamed from: H */
    public float f8256H;

    /* JADX INFO: renamed from: I */
    public float f8257I;

    /* JADX INFO: renamed from: J */
    public float f8258J;

    /* JADX INFO: renamed from: K */
    public int f8259K;

    /* JADX INFO: renamed from: L */
    public int f8260L;

    /* JADX INFO: renamed from: M */
    public int[] f8261M;

    /* JADX INFO: renamed from: N */
    public boolean f8262N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f8263O;

    /* JADX INFO: renamed from: P */
    public final TextPaint f8264P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f8265Q;

    /* JADX INFO: renamed from: R */
    public TimeInterpolator f8266R;

    /* JADX INFO: renamed from: S */
    public float f8267S;

    /* JADX INFO: renamed from: T */
    public float f8268T;

    /* JADX INFO: renamed from: U */
    public float f8269U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f8270V;

    /* JADX INFO: renamed from: W */
    public float f8271W;

    /* JADX INFO: renamed from: X */
    public float f8272X;

    /* JADX INFO: renamed from: Y */
    public float f8273Y;

    /* JADX INFO: renamed from: Z */
    public StaticLayout f8274Z;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f8275a;

    /* JADX INFO: renamed from: a0 */
    public float f8276a0;

    /* JADX INFO: renamed from: b */
    public float f8277b;

    /* JADX INFO: renamed from: b0 */
    public float f8278b0;

    /* JADX INFO: renamed from: c */
    public final Rect f8279c;

    /* JADX INFO: renamed from: c0 */
    public float f8280c0;

    /* JADX INFO: renamed from: d */
    public final Rect f8281d;

    /* JADX INFO: renamed from: d0 */
    public CharSequence f8282d0;

    /* JADX INFO: renamed from: e */
    public final RectF f8283e;

    /* JADX INFO: renamed from: j */
    public ColorStateList f8293j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f8295k;

    /* JADX INFO: renamed from: k0 */
    public boolean f8296k0;

    /* JADX INFO: renamed from: l */
    public int f8297l;

    /* JADX INFO: renamed from: m */
    public float f8298m;

    /* JADX INFO: renamed from: n */
    public float f8299n;

    /* JADX INFO: renamed from: o */
    public float f8300o;

    /* JADX INFO: renamed from: p */
    public float f8301p;

    /* JADX INFO: renamed from: q */
    public float f8302q;

    /* JADX INFO: renamed from: r */
    public float f8303r;

    /* JADX INFO: renamed from: s */
    public Typeface f8304s;

    /* JADX INFO: renamed from: t */
    public Typeface f8305t;

    /* JADX INFO: renamed from: u */
    public Typeface f8306u;

    /* JADX INFO: renamed from: v */
    public Typeface f8307v;

    /* JADX INFO: renamed from: w */
    public Typeface f8308w;

    /* JADX INFO: renamed from: x */
    public Typeface f8309x;

    /* JADX INFO: renamed from: y */
    public Typeface f8310y;

    /* JADX INFO: renamed from: z */
    public C0437K6 f8311z;

    /* JADX INFO: renamed from: f */
    public int f8285f = 16;

    /* JADX INFO: renamed from: g */
    public int f8287g = 16;

    /* JADX INFO: renamed from: h */
    public float f8289h = 15.0f;

    /* JADX INFO: renamed from: i */
    public float f8291i = 15.0f;

    /* JADX INFO: renamed from: A */
    public final TextUtils.TruncateAt f8249A = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: E */
    public final boolean f8253E = true;

    /* JADX INFO: renamed from: e0 */
    public int f8284e0 = 1;

    /* JADX INFO: renamed from: f0 */
    public int f8286f0 = 1;

    /* JADX INFO: renamed from: g0 */
    public final float f8288g0 = 1.0f;

    /* JADX INFO: renamed from: h0 */
    public final int f8290h0 = 1;

    /* JADX INFO: renamed from: i0 */
    public int f8292i0 = -1;

    /* JADX INFO: renamed from: j0 */
    public int f8294j0 = -1;

    public C2359pa(TextInputLayout textInputLayout) {
        this.f8275a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f8263O = textPaint;
        this.f8264P = new TextPaint(textPaint);
        this.f8281d = new Rect();
        this.f8279c = new Rect();
        this.f8283e = new RectF();
        m4788i(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m4780a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: h */
    public static float m4781h(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC0776S2.m1596a(f, f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public final void m4782b() {
        float f = this.f8277b;
        float f2 = this.f8279c.left;
        Rect rect = this.f8281d;
        float fM4781h = m4781h(f2, rect.left, f, this.f8265Q);
        RectF rectF = this.f8283e;
        rectF.left = fM4781h;
        rectF.top = m4781h(this.f8298m, this.f8299n, f, this.f8265Q);
        rectF.right = m4781h(r1.right, rect.right, f, this.f8265Q);
        rectF.bottom = m4781h(r1.bottom, rect.bottom, f, this.f8265Q);
        this.f8302q = m4781h(this.f8300o, this.f8301p, f, this.f8265Q);
        this.f8303r = m4781h(this.f8298m, this.f8299n, f, this.f8265Q);
        m4784d(f, false);
        TextInputLayout textInputLayout = this.f8275a;
        textInputLayout.postInvalidateOnAnimation();
        C1370eh c1370eh = AbstractC0776S2.f2454b;
        this.f8278b0 = 1.0f - m4781h(0.0f, 1.0f, 1.0f - f, c1370eh);
        textInputLayout.postInvalidateOnAnimation();
        this.f8280c0 = m4781h(1.0f, 0.0f, f, c1370eh);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f8295k;
        ColorStateList colorStateList2 = this.f8293j;
        TextPaint textPaint = this.f8263O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m4780a(m4787g(colorStateList2), m4787g(this.f8295k), f));
        } else {
            textPaint.setColor(m4787g(colorStateList));
        }
        float f3 = this.f8271W;
        float f4 = this.f8272X;
        if (f3 != f4) {
            textPaint.setLetterSpacing(m4781h(f4, f3, f, c1370eh));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.f8256H = AbstractC0776S2.m1596a(0.0f, this.f8267S, f);
        this.f8257I = AbstractC0776S2.m1596a(0.0f, this.f8268T, f);
        this.f8258J = AbstractC0776S2.m1596a(0.0f, this.f8269U, f);
        int iM4780a = m4780a(0, m4787g(this.f8270V), f);
        this.f8259K = iM4780a;
        textPaint.setShadowLayer(this.f8256H, this.f8257I, this.f8258J, iM4780a);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4783c(CharSequence charSequence) {
        boolean z = this.f8275a.getLayoutDirection() == 1;
        if (this.f8253E) {
            return (z ? AbstractC2447rA.f8575d : AbstractC2447rA.f8574c).m1985c(charSequence, charSequence.length());
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m4784d(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        if (this.f8250B == null) {
            return;
        }
        float fWidth = this.f8281d.width();
        float fWidth2 = this.f8279c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = m4794o() ? this.f8291i : this.f8289h;
            f3 = m4794o() ? this.f8271W : this.f8272X;
            this.f8254F = m4794o() ? 1.0f : m4781h(this.f8289h, this.f8291i, f, this.f8266R) / this.f8289h;
            if (!m4794o()) {
                fWidth = fWidth2;
            }
            typeface = this.f8304s;
            fWidth2 = fWidth;
        } else {
            f2 = this.f8289h;
            float f4 = this.f8272X;
            typeface = this.f8307v;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f8254F = 1.0f;
            } else {
                this.f8254F = m4781h(this.f8289h, this.f8291i, f, this.f8266R) / this.f8289h;
            }
            float f5 = this.f8291i / this.f8289h;
            float f6 = fWidth2 * f5;
            if (!z && f6 > fWidth && m4794o()) {
                fWidth2 = Math.min(fWidth / f5, fWidth2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.f8284e0 : this.f8286f0;
        TextPaint textPaint = this.f8263O;
        if (fWidth2 > 0.0f) {
            boolean z2 = this.f8255G != f2;
            boolean z3 = this.f8273Y != f3;
            boolean z4 = this.f8310y != typeface;
            StaticLayout staticLayout = this.f8274Z;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.f8260L != i) || this.f8262N;
            this.f8255G = f2;
            this.f8273Y = f3;
            this.f8310y = typeface;
            this.f8262N = false;
            this.f8260L = i;
            textPaint.setLinearText(this.f8254F != 1.0f);
            z = z5;
        }
        if (this.f8251C == null || z) {
            textPaint.setTextSize(this.f8255G);
            textPaint.setTypeface(this.f8310y);
            textPaint.setLetterSpacing(this.f8273Y);
            boolean zM4783c = m4783c(this.f8250B);
            this.f8252D = zM4783c;
            StaticLayout staticLayoutM4785e = m4785e(((this.f8284e0 > 1 || this.f8286f0 > 1) && !zM4783c) ? i : 1, textPaint, this.f8250B, fWidth2 * (m4794o() ? 1.0f : this.f8254F), this.f8252D);
            this.f8274Z = staticLayoutM4785e;
            this.f8251C = staticLayoutM4785e.getText();
        }
    }

    /* JADX INFO: renamed from: e */
    public final StaticLayout m4785e(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f8285f, this.f8252D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f8252D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f8252D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        C1520hz c1520hz = new C1520hz(charSequence, textPaint, (int) f);
        c1520hz.f5388l = this.f8249A;
        c1520hz.f5387k = z;
        c1520hz.f5381e = alignment;
        c1520hz.f5386j = false;
        c1520hz.f5382f = i;
        float f2 = this.f8288g0;
        c1520hz.f5383g = 0.0f;
        c1520hz.f5384h = f2;
        c1520hz.f5385i = this.f8290h0;
        c1520hz.f5389m = null;
        StaticLayout staticLayoutM2900a = c1520hz.m2900a();
        staticLayoutM2900a.getClass();
        return staticLayoutM2900a;
    }

    /* JADX INFO: renamed from: f */
    public final float m4786f() {
        int i = this.f8292i0;
        if (i != -1) {
            return i;
        }
        float f = this.f8291i;
        TextPaint textPaint = this.f8264P;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f8304s);
        textPaint.setLetterSpacing(this.f8271W);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: g */
    public final int m4787g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f8261M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: i */
    public final void m4788i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f8306u;
            if (typeface != null) {
                this.f8305t = AbstractC0828TB.m1651u(configuration, typeface);
            }
            Typeface typeface2 = this.f8309x;
            if (typeface2 != null) {
                this.f8308w = AbstractC0828TB.m1651u(configuration, typeface2);
            }
            Typeface typeface3 = this.f8305t;
            if (typeface3 == null) {
                typeface3 = this.f8306u;
            }
            this.f8304s = typeface3;
            Typeface typeface4 = this.f8308w;
            if (typeface4 == null) {
                typeface4 = this.f8309x;
            }
            this.f8307v = typeface4;
            m4789j(true);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4789j(boolean z) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f8275a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m4784d(1.0f, z);
        CharSequence charSequence = this.f8251C;
        TextPaint textPaint = this.f8263O;
        if (charSequence != null && this.f8274Z != null) {
            this.f8282d0 = m4794o() ? TextUtils.ellipsize(this.f8251C, textPaint, this.f8274Z.getWidth(), this.f8249A) : this.f8251C;
        }
        CharSequence charSequence2 = this.f8282d0;
        if (charSequence2 != null) {
            this.f8276a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f8276a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f8287g, this.f8252D ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f8281d;
        if (i == 48) {
            this.f8299n = rect.top;
        } else if (i != 80) {
            this.f8299n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f8299n = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f8301p = rect.centerX() - (this.f8276a0 / 2.0f);
        } else if (i2 != 5) {
            this.f8301p = rect.left;
        } else {
            this.f8301p = rect.right - this.f8276a0;
        }
        if (this.f8276a0 <= rect.width()) {
            float f = this.f8301p;
            float fMax = Math.max(0.0f, rect.left - f) + f;
            this.f8301p = fMax;
            this.f8301p = Math.min(0.0f, rect.right - (this.f8276a0 + fMax)) + fMax;
        }
        float f2 = this.f8291i;
        TextPaint textPaint2 = this.f8264P;
        textPaint2.setTextSize(f2);
        textPaint2.setTypeface(this.f8304s);
        textPaint2.setLetterSpacing(this.f8271W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f3 = this.f8299n;
            float fMax2 = Math.max(0.0f, rect.top - f3) + f3;
            this.f8299n = fMax2;
            this.f8299n = Math.min(0.0f, rect.bottom - (m4786f() + fMax2)) + fMax2;
        }
        m4784d(0.0f, z);
        float height = this.f8274Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f8274Z;
        if (staticLayout == null || this.f8284e0 <= 1) {
            CharSequence charSequence3 = this.f8251C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f8274Z;
        this.f8297l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f8285f, this.f8252D ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f8279c;
        if (i3 == 48) {
            this.f8298m = rect2.top;
        } else if (i3 != 80) {
            this.f8298m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f8298m = (rect2.bottom - height) + (this.f8296k0 ? textPaint.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f8300o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f8300o = rect2.left;
        } else {
            this.f8300o = rect2.right - fMeasureText;
        }
        m4784d(this.f8277b, false);
        textInputLayout.postInvalidateOnAnimation();
        m4782b();
    }

    /* JADX INFO: renamed from: k */
    public final void m4790k(ColorStateList colorStateList) {
        if (this.f8295k == colorStateList && this.f8293j == colorStateList) {
            return;
        }
        this.f8295k = colorStateList;
        this.f8293j = colorStateList;
        m4789j(false);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4791l(Typeface typeface) {
        C0437K6 c0437k6 = this.f8311z;
        if (c0437k6 != null) {
            c0437k6.f1436p = true;
        }
        if (this.f8306u == typeface) {
            return false;
        }
        this.f8306u = typeface;
        Typeface typefaceM1651u = AbstractC0828TB.m1651u(this.f8275a.getContext().getResources().getConfiguration(), typeface);
        this.f8305t = typefaceM1651u;
        if (typefaceM1651u == null) {
            typefaceM1651u = this.f8306u;
        }
        this.f8304s = typefaceM1651u;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4792m(float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
            }
        }
        if (f != this.f8277b) {
            this.f8277b = f;
            m4782b();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4793n(Typeface typeface) {
        boolean z;
        boolean zM4791l = m4791l(typeface);
        if (this.f8309x != typeface) {
            this.f8309x = typeface;
            Typeface typefaceM1651u = AbstractC0828TB.m1651u(this.f8275a.getContext().getResources().getConfiguration(), typeface);
            this.f8308w = typefaceM1651u;
            if (typefaceM1651u == null) {
                typefaceM1651u = this.f8309x;
            }
            this.f8307v = typefaceM1651u;
            z = true;
        } else {
            z = false;
        }
        if (zM4791l || z) {
            m4789j(false);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4794o() {
        return this.f8286f0 == 1;
    }
}
