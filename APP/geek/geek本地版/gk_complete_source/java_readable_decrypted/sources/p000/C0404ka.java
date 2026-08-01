package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: ka */
/* JADX INFO: loaded from: classes.dex */
public final class C0404ka extends C0200eu implements Drawable.Callback, c60 {

    /* JADX INFO: renamed from: F0 */
    public static final int[] f2746F0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: G0 */
    public static final ShapeDrawable f2747G0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A */
    public float f2748A;

    /* JADX INFO: renamed from: A0 */
    public WeakReference f2749A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f2750B;

    /* JADX INFO: renamed from: B0 */
    public TextUtils.TruncateAt f2751B0;

    /* JADX INFO: renamed from: C */
    public float f2752C;

    /* JADX INFO: renamed from: C0 */
    public boolean f2753C0;

    /* JADX INFO: renamed from: D */
    public ColorStateList f2754D;

    /* JADX INFO: renamed from: D0 */
    public int f2755D0;

    /* JADX INFO: renamed from: E */
    public CharSequence f2756E;

    /* JADX INFO: renamed from: E0 */
    public boolean f2757E0;

    /* JADX INFO: renamed from: F */
    public boolean f2758F;

    /* JADX INFO: renamed from: G */
    public Drawable f2759G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f2760H;

    /* JADX INFO: renamed from: I */
    public float f2761I;

    /* JADX INFO: renamed from: J */
    public boolean f2762J;

    /* JADX INFO: renamed from: K */
    public boolean f2763K;

    /* JADX INFO: renamed from: L */
    public Drawable f2764L;

    /* JADX INFO: renamed from: M */
    public RippleDrawable f2765M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f2766N;

    /* JADX INFO: renamed from: O */
    public float f2767O;

    /* JADX INFO: renamed from: P */
    public SpannableStringBuilder f2768P;

    /* JADX INFO: renamed from: Q */
    public boolean f2769Q;

    /* JADX INFO: renamed from: R */
    public boolean f2770R;

    /* JADX INFO: renamed from: S */
    public Drawable f2771S;

    /* JADX INFO: renamed from: T */
    public ColorStateList f2772T;

    /* JADX INFO: renamed from: U */
    public C0083bw f2773U;

    /* JADX INFO: renamed from: V */
    public C0083bw f2774V;

    /* JADX INFO: renamed from: W */
    public float f2775W;

    /* JADX INFO: renamed from: X */
    public float f2776X;

    /* JADX INFO: renamed from: Y */
    public float f2777Y;

    /* JADX INFO: renamed from: Z */
    public float f2778Z;

    /* JADX INFO: renamed from: a0 */
    public float f2779a0;

    /* JADX INFO: renamed from: b0 */
    public float f2780b0;

    /* JADX INFO: renamed from: c0 */
    public float f2781c0;

    /* JADX INFO: renamed from: d0 */
    public float f2782d0;

    /* JADX INFO: renamed from: e0 */
    public final Context f2783e0;

    /* JADX INFO: renamed from: f0 */
    public final Paint f2784f0;

    /* JADX INFO: renamed from: g0 */
    public final Paint.FontMetrics f2785g0;

    /* JADX INFO: renamed from: h0 */
    public final RectF f2786h0;

    /* JADX INFO: renamed from: i0 */
    public final PointF f2787i0;

    /* JADX INFO: renamed from: j0 */
    public final Path f2788j0;

    /* JADX INFO: renamed from: k0 */
    public final d60 f2789k0;

    /* JADX INFO: renamed from: l0 */
    public int f2790l0;

    /* JADX INFO: renamed from: m0 */
    public int f2791m0;

    /* JADX INFO: renamed from: n0 */
    public int f2792n0;

    /* JADX INFO: renamed from: o0 */
    public int f2793o0;

    /* JADX INFO: renamed from: p0 */
    public int f2794p0;

    /* JADX INFO: renamed from: q0 */
    public int f2795q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f2796r0;

    /* JADX INFO: renamed from: s0 */
    public int f2797s0;

    /* JADX INFO: renamed from: t0 */
    public int f2798t0;

    /* JADX INFO: renamed from: u0 */
    public ColorFilter f2799u0;

    /* JADX INFO: renamed from: v0 */
    public PorterDuffColorFilter f2800v0;

    /* JADX INFO: renamed from: w0 */
    public ColorStateList f2801w0;

    /* JADX INFO: renamed from: x */
    public ColorStateList f2802x;

    /* JADX INFO: renamed from: x0 */
    public PorterDuff.Mode f2803x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f2804y;

    /* JADX INFO: renamed from: y0 */
    public int[] f2805y0;

    /* JADX INFO: renamed from: z */
    public float f2806z;

    /* JADX INFO: renamed from: z0 */
    public ColorStateList f2807z0;

    public C0404ka(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2748A = -1.0f;
        this.f2784f0 = new Paint(1);
        this.f2785g0 = new Paint.FontMetrics();
        this.f2786h0 = new RectF();
        this.f2787i0 = new PointF();
        this.f2788j0 = new Path();
        this.f2798t0 = 255;
        this.f2803x0 = PorterDuff.Mode.SRC_IN;
        this.f2749A0 = new WeakReference(null);
        m1083h(context);
        this.f2783e0 = context;
        d60 d60Var = new d60(this);
        this.f2789k0 = d60Var;
        this.f2756E = "";
        d60Var.f1389a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f2746F0;
        setState(iArr);
        if (!Arrays.equals(this.f2805y0, iArr)) {
            this.f2805y0 = iArr;
            if (m1675T()) {
                m1682v(getState(), iArr);
            }
        }
        this.f2753C0 = true;
        int[] iArr2 = g10.f2002a;
        f2747G0.setTint(-1);
    }

    /* JADX INFO: renamed from: U */
    public static void m1653U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1654s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1655t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: A */
    public final void m1656A(float f) {
        if (this.f2748A != f) {
            this.f2748A = f;
            e30 e30VarM1139e = this.f1842a.f1633a.m1139e();
            e30VarM1139e.f1697e = new C0169e(f);
            e30VarM1139e.f1698f = new C0169e(f);
            e30VarM1139e.f1699g = new C0169e(f);
            e30VarM1139e.f1700h = new C0169e(f);
            setShapeAppearanceModel(e30VarM1139e.m982a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: B */
    public final void m1657B(Drawable drawable) {
        ?? r0;
        Object obj = this.f2759G;
        if (obj != null) {
            boolean z = obj instanceof ad0;
            r0 = obj;
            if (z) {
                r0 = 0;
            }
        } else {
            r0 = 0;
        }
        if (r0 != drawable) {
            float fM1678p = m1678p();
            this.f2759G = drawable != null ? drawable.mutate() : null;
            float fM1678p2 = m1678p();
            m1653U(r0);
            if (m1674S()) {
                m1676n(this.f2759G);
            }
            invalidateSelf();
            if (fM1678p != fM1678p2) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1658C(float f) {
        if (this.f2761I != f) {
            float fM1678p = m1678p();
            this.f2761I = f;
            float fM1678p2 = m1678p();
            invalidateSelf();
            if (fM1678p != fM1678p2) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m1659D(ColorStateList colorStateList) {
        this.f2762J = true;
        if (this.f2760H != colorStateList) {
            this.f2760H = colorStateList;
            if (m1674S()) {
                AbstractC0104ch.m688h(this.f2759G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1660E(boolean z) {
        if (this.f2758F != z) {
            boolean zM1674S = m1674S();
            this.f2758F = z;
            boolean zM1674S2 = m1674S();
            if (zM1674S != zM1674S2) {
                if (zM1674S2) {
                    m1676n(this.f2759G);
                } else {
                    m1653U(this.f2759G);
                }
                invalidateSelf();
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m1661F(ColorStateList colorStateList) {
        if (this.f2750B != colorStateList) {
            this.f2750B = colorStateList;
            if (this.f2757E0) {
                C0163du c0163du = this.f1842a;
                if (c0163du.f1636d != colorStateList) {
                    c0163du.f1636d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m1662G(float f) {
        if (this.f2752C != f) {
            this.f2752C = f;
            this.f2784f0.setStrokeWidth(f);
            if (this.f2757E0) {
                this.f1842a.f1642j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: H */
    public final void m1663H(Drawable drawable) {
        ?? r0;
        Object obj = this.f2764L;
        if (obj != null) {
            boolean z = obj instanceof ad0;
            r0 = obj;
            if (z) {
                r0 = 0;
            }
        } else {
            r0 = 0;
        }
        if (r0 != drawable) {
            float fM1679q = m1679q();
            this.f2764L = drawable != null ? drawable.mutate() : null;
            int[] iArr = g10.f2002a;
            this.f2765M = new RippleDrawable(g10.m1247a(this.f2754D), this.f2764L, f2747G0);
            float fM1679q2 = m1679q();
            m1653U(r0);
            if (m1675T()) {
                m1676n(this.f2764L);
            }
            invalidateSelf();
            if (fM1679q != fM1679q2) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1664I(float f) {
        if (this.f2781c0 != f) {
            this.f2781c0 = f;
            invalidateSelf();
            if (m1675T()) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m1665J(float f) {
        if (this.f2767O != f) {
            this.f2767O = f;
            invalidateSelf();
            if (m1675T()) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m1666K(float f) {
        if (this.f2780b0 != f) {
            this.f2780b0 = f;
            invalidateSelf();
            if (m1675T()) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m1667L(ColorStateList colorStateList) {
        if (this.f2766N != colorStateList) {
            this.f2766N = colorStateList;
            if (m1675T()) {
                AbstractC0104ch.m688h(this.f2764L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m1668M(boolean z) {
        if (this.f2763K != z) {
            boolean zM1675T = m1675T();
            this.f2763K = z;
            boolean zM1675T2 = m1675T();
            if (zM1675T != zM1675T2) {
                if (zM1675T2) {
                    m1676n(this.f2764L);
                } else {
                    m1653U(this.f2764L);
                }
                invalidateSelf();
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m1669N(float f) {
        if (this.f2777Y != f) {
            float fM1678p = m1678p();
            this.f2777Y = f;
            float fM1678p2 = m1678p();
            invalidateSelf();
            if (fM1678p != fM1678p2) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m1670O(float f) {
        if (this.f2776X != f) {
            float fM1678p = m1678p();
            this.f2776X = f;
            float fM1678p2 = m1678p();
            invalidateSelf();
            if (fM1678p != fM1678p2) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m1671P(ColorStateList colorStateList) {
        if (this.f2754D != colorStateList) {
            this.f2754D = colorStateList;
            this.f2807z0 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m1672Q(a60 a60Var) {
        d60 d60Var = this.f2789k0;
        C0291ha c0291ha = d60Var.f1390b;
        TextPaint textPaint = d60Var.f1389a;
        if (d60Var.f1394f != a60Var) {
            d60Var.f1394f = a60Var;
            if (a60Var != null) {
                Context context = this.f2783e0;
                a60Var.m23f(context, textPaint, c0291ha);
                c60 c60Var = (c60) d60Var.f1393e.get();
                if (c60Var != null) {
                    textPaint.drawableState = c60Var.getState();
                }
                a60Var.m22e(context, textPaint, c0291ha);
                d60Var.f1392d = true;
            }
            c60 c60Var2 = (c60) d60Var.f1393e.get();
            if (c60Var2 != null) {
                C0404ka c0404ka = (C0404ka) c60Var2;
                c0404ka.m1681u();
                c0404ka.invalidateSelf();
                c0404ka.onStateChange(c60Var2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m1673R() {
        return this.f2770R && this.f2771S != null && this.f2796r0;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m1674S() {
        return this.f2758F && this.f2759G != null;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m1675T() {
        return this.f2763K && this.f2764L != null;
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f2798t0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f2757E0;
        Paint paint = this.f2784f0;
        RectF rectF = this.f2786h0;
        if (!z) {
            paint.setColor(this.f2790l0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m1680r(), m1680r(), paint);
        }
        if (!this.f2757E0) {
            paint.setColor(this.f2791m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f2799u0;
            if (colorFilter == null) {
                colorFilter = this.f2800v0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m1680r(), m1680r(), paint);
        }
        if (this.f2757E0) {
            super.draw(canvas);
        }
        if (this.f2752C > 0.0f && !this.f2757E0) {
            paint.setColor(this.f2793o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f2757E0) {
                ColorFilter colorFilter2 = this.f2799u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f2800v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f2752C / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f2748A - (this.f2752C / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f2794p0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f2757E0) {
            RectF rectF2 = new RectF(bounds);
            C0163du c0163du = this.f1842a;
            f30 f30Var = c0163du.f1633a;
            float f4 = c0163du.f1641i;
            C0431l0 c0431l0 = this.f1858q;
            h30 h30Var = this.f1859r;
            Path path = this.f2788j0;
            h30Var.m1337a(f30Var, f4, rectF2, c0431l0, path);
            m1080d(canvas2, paint, path, this.f1842a.f1633a, m1081f());
        } else {
            canvas2.drawRoundRect(rectF, m1680r(), m1680r(), paint);
        }
        if (m1674S()) {
            m1677o(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.f2759G.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f2759G.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (m1673R()) {
            m1677o(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.f2771S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f2771S.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.f2753C0 && this.f2756E != null) {
            PointF pointF = this.f2787i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f2756E;
            d60 d60Var = this.f2789k0;
            if (charSequence != null) {
                float fM1678p = m1678p() + this.f2775W + this.f2778Z;
                if (AbstractC0151dh.m941a(this) == 0) {
                    pointF.x = bounds.left + fM1678p;
                } else {
                    pointF.x = bounds.right - fM1678p;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = d60Var.f1389a;
                Paint.FontMetrics fontMetrics = this.f2785g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f2756E != null) {
                float fM1678p2 = m1678p() + this.f2775W + this.f2778Z;
                float fM1679q = m1679q() + this.f2782d0 + this.f2779a0;
                if (AbstractC0151dh.m941a(this) == 0) {
                    rectF.left = bounds.left + fM1678p2;
                    rectF.right = bounds.right - fM1679q;
                } else {
                    rectF.left = bounds.left + fM1679q;
                    rectF.right = bounds.right - fM1678p2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            a60 a60Var = d60Var.f1394f;
            TextPaint textPaint2 = d60Var.f1389a;
            if (a60Var != null) {
                textPaint2.drawableState = getState();
                d60Var.f1394f.m22e(this.f2783e0, textPaint2, d60Var.f1390b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(d60Var.m924a(this.f2756E.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f2756E;
            if (z2 && this.f2751B0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f2751B0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m1675T()) {
            rectF.setEmpty();
            if (m1675T()) {
                float f9 = this.f2782d0 + this.f2781c0;
                if (AbstractC0151dh.m941a(this) == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.f2767O;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.f2767O;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.f2767O;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f2764L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = g10.f2002a;
            this.f2765M.setBounds(this.f2764L.getBounds());
            this.f2765M.jumpToCurrentState();
            this.f2765M.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.f2798t0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2798t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f2799u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f2806z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m1679q() + this.f2789k0.m924a(this.f2756E.toString()) + m1678p() + this.f2775W + this.f2778Z + this.f2779a0 + this.f2782d0), this.f2755D0);
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f2757E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f2806z, this.f2748A);
        } else {
            outline.setRoundRect(bounds, this.f2748A);
            outline2 = outline;
        }
        outline2.setAlpha(this.f2798t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m1654s(this.f2802x) || m1654s(this.f2804y) || m1654s(this.f2750B)) {
            return true;
        }
        a60 a60Var = this.f2789k0.f1394f;
        if (a60Var == null || (colorStateList = a60Var.f55j) == null || !colorStateList.isStateful()) {
            return (this.f2770R && this.f2771S != null && this.f2769Q) || m1655t(this.f2759G) || m1655t(this.f2771S) || m1654s(this.f2801w0);
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m1676n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0151dh.m942b(drawable, AbstractC0151dh.m941a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f2764L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f2805y0);
            }
            AbstractC0104ch.m688h(drawable, this.f2766N);
            return;
        }
        Drawable drawable2 = this.f2759G;
        if (drawable == drawable2 && this.f2762J) {
            AbstractC0104ch.m688h(drawable2, this.f2760H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1677o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m1674S() || m1673R()) {
            float f = this.f2775W + this.f2776X;
            Drawable drawable = this.f2796r0 ? this.f2771S : this.f2759G;
            float intrinsicWidth = this.f2761I;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (AbstractC0151dh.m941a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f2796r0 ? this.f2771S : this.f2759G;
            float fCeil = this.f2761I;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f2783e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m1674S()) {
            zOnLayoutDirectionChanged |= AbstractC0151dh.m942b(this.f2759G, i);
        }
        if (m1673R()) {
            zOnLayoutDirectionChanged |= AbstractC0151dh.m942b(this.f2771S, i);
        }
        if (m1675T()) {
            zOnLayoutDirectionChanged |= AbstractC0151dh.m942b(this.f2764L, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m1674S()) {
            zOnLevelChange |= this.f2759G.setLevel(i);
        }
        if (m1673R()) {
            zOnLevelChange |= this.f2771S.setLevel(i);
        }
        if (m1675T()) {
            zOnLevelChange |= this.f2764L.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f2757E0) {
            super.onStateChange(iArr);
        }
        return m1682v(iArr, this.f2805y0);
    }

    /* JADX INFO: renamed from: p */
    public final float m1678p() {
        if (!m1674S() && !m1673R()) {
            return 0.0f;
        }
        float f = this.f2776X;
        Drawable drawable = this.f2796r0 ? this.f2771S : this.f2759G;
        float intrinsicWidth = this.f2761I;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f2777Y;
    }

    /* JADX INFO: renamed from: q */
    public final float m1679q() {
        if (m1675T()) {
            return this.f2780b0 + this.f2767O + this.f2781c0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: r */
    public final float m1680r() {
        return this.f2757E0 ? this.f1842a.f1633a.f1879e.mo940a(m1081f()) : this.f2748A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f2798t0 != i) {
            this.f2798t0 = i;
            invalidateSelf();
        }
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2799u0 != colorFilter) {
            this.f2799u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2801w0 != colorStateList) {
            this.f2801w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f2803x0 != mode) {
            this.f2803x0 = mode;
            ColorStateList colorStateList = this.f2801w0;
            this.f2800v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m1674S()) {
            visible |= this.f2759G.setVisible(z, z2);
        }
        if (m1673R()) {
            visible |= this.f2771S.setVisible(z, z2);
        }
        if (m1675T()) {
            visible |= this.f2764L.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: u */
    public final void m1681u() {
        InterfaceC0367ja interfaceC0367ja = (InterfaceC0367ja) this.f2749A0.get();
        if (interfaceC0367ja != null) {
            Chip chip = (Chip) interfaceC0367ja;
            chip.m750b(chip.f1112p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1682v(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f2802x;
        int iM1078b = m1078b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f2790l0) : 0);
        boolean state = true;
        if (this.f2790l0 != iM1078b) {
            this.f2790l0 = iM1078b;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f2804y;
        int iM1078b2 = m1078b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f2791m0) : 0);
        if (this.f2791m0 != iM1078b2) {
            this.f2791m0 = iM1078b2;
            zOnStateChange = true;
        }
        int iM1426b = AbstractC0329ib.m1426b(iM1078b2, iM1078b);
        if ((this.f2792n0 != iM1426b) | (this.f1842a.f1635c == null)) {
            this.f2792n0 = iM1426b;
            m1085j(ColorStateList.valueOf(iM1426b));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f2750B;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f2793o0) : 0;
        if (this.f2793o0 != colorForState) {
            this.f2793o0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f2807z0 == null || !g10.m1248b(iArr)) ? 0 : this.f2807z0.getColorForState(iArr, this.f2794p0);
        if (this.f2794p0 != colorForState2) {
            this.f2794p0 = colorForState2;
        }
        a60 a60Var = this.f2789k0.f1394f;
        int colorForState3 = (a60Var == null || (colorStateList = a60Var.f55j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f2795q0);
        if (this.f2795q0 != colorForState3) {
            this.f2795q0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.f2769Q) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.f2796r0 == z || this.f2771S == null) {
            z2 = false;
        } else {
            float fM1678p = m1678p();
            this.f2796r0 = z;
            if (fM1678p != m1678p()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f2801w0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f2797s0) : 0;
        if (this.f2797s0 != colorForState4) {
            this.f2797s0 = colorForState4;
            ColorStateList colorStateList6 = this.f2801w0;
            PorterDuff.Mode mode = this.f2803x0;
            this.f2800v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m1655t(this.f2759G)) {
            state |= this.f2759G.setState(iArr);
        }
        if (m1655t(this.f2771S)) {
            state |= this.f2771S.setState(iArr);
        }
        if (m1655t(this.f2764L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f2764L.setState(iArr3);
        }
        int[] iArr4 = g10.f2002a;
        if (m1655t(this.f2765M)) {
            state |= this.f2765M.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m1681u();
        }
        return state;
    }

    /* JADX INFO: renamed from: w */
    public final void m1683w(boolean z) {
        if (this.f2769Q != z) {
            this.f2769Q = z;
            float fM1678p = m1678p();
            if (!z && this.f2796r0) {
                this.f2796r0 = false;
            }
            float fM1678p2 = m1678p();
            invalidateSelf();
            if (fM1678p != fM1678p2) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1684x(Drawable drawable) {
        if (this.f2771S != drawable) {
            float fM1678p = m1678p();
            this.f2771S = drawable;
            float fM1678p2 = m1678p();
            m1653U(this.f2771S);
            m1676n(this.f2771S);
            invalidateSelf();
            if (fM1678p != fM1678p2) {
                m1681u();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1685y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f2772T != colorStateList) {
            this.f2772T = colorStateList;
            if (this.f2770R && (drawable = this.f2771S) != null && this.f2769Q) {
                AbstractC0104ch.m688h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m1686z(boolean z) {
        if (this.f2770R != z) {
            boolean zM1673R = m1673R();
            this.f2770R = z;
            boolean zM1673R2 = m1673R();
            if (zM1673R != zM1673R2) {
                if (zM1673R2) {
                    m1676n(this.f2771S);
                } else {
                    m1653U(this.f2771S);
                }
                invalidateSelf();
                m1681u();
            }
        }
    }
}
