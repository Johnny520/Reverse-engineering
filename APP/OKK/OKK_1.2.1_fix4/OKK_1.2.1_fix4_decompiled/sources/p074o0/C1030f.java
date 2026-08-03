package p074o0;

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
import org.luckypray.dexkit.C1031R;
import p060h0.C0946b;
import p081s0.C1075i;
import p081s0.InterfaceC1074h;
import p084u0.C1099d;
import p085v.AbstractC1100a;
import p086v0.AbstractC1110a;
import p087w.AbstractC1111a;
import p087w.AbstractC1112b;
import p087w.AbstractC1115e;
import p087w.InterfaceC1114d;
import p089x0.C1117a;
import p089x0.C1122f;
import p089x0.C1123g;
import p089x0.C1126j;
import p089x0.C1127k;

/* JADX INFO: renamed from: o0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1030f extends C1123g implements Drawable.Callback, InterfaceC1074h {

    /* JADX INFO: renamed from: G0 */
    public static final int[] f3777G0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: H0 */
    public static final ShapeDrawable f3778H0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A */
    public float f3779A;

    /* JADX INFO: renamed from: A0 */
    public ColorStateList f3780A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f3781B;

    /* JADX INFO: renamed from: B0 */
    public WeakReference f3782B0;

    /* JADX INFO: renamed from: C */
    public float f3783C;

    /* JADX INFO: renamed from: C0 */
    public TextUtils.TruncateAt f3784C0;

    /* JADX INFO: renamed from: D */
    public ColorStateList f3785D;

    /* JADX INFO: renamed from: D0 */
    public boolean f3786D0;

    /* JADX INFO: renamed from: E */
    public CharSequence f3787E;

    /* JADX INFO: renamed from: E0 */
    public int f3788E0;

    /* JADX INFO: renamed from: F */
    public boolean f3789F;

    /* JADX INFO: renamed from: F0 */
    public boolean f3790F0;

    /* JADX INFO: renamed from: G */
    public Drawable f3791G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f3792H;

    /* JADX INFO: renamed from: I */
    public float f3793I;

    /* JADX INFO: renamed from: J */
    public boolean f3794J;

    /* JADX INFO: renamed from: K */
    public boolean f3795K;

    /* JADX INFO: renamed from: L */
    public Drawable f3796L;

    /* JADX INFO: renamed from: M */
    public RippleDrawable f3797M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f3798N;

    /* JADX INFO: renamed from: O */
    public float f3799O;

    /* JADX INFO: renamed from: P */
    public SpannableStringBuilder f3800P;

    /* JADX INFO: renamed from: Q */
    public boolean f3801Q;

    /* JADX INFO: renamed from: R */
    public boolean f3802R;

    /* JADX INFO: renamed from: S */
    public Drawable f3803S;

    /* JADX INFO: renamed from: T */
    public ColorStateList f3804T;

    /* JADX INFO: renamed from: U */
    public C0946b f3805U;

    /* JADX INFO: renamed from: V */
    public C0946b f3806V;

    /* JADX INFO: renamed from: W */
    public float f3807W;

    /* JADX INFO: renamed from: X */
    public float f3808X;

    /* JADX INFO: renamed from: Y */
    public float f3809Y;

    /* JADX INFO: renamed from: Z */
    public float f3810Z;

    /* JADX INFO: renamed from: a0 */
    public float f3811a0;

    /* JADX INFO: renamed from: b0 */
    public float f3812b0;

    /* JADX INFO: renamed from: c0 */
    public float f3813c0;

    /* JADX INFO: renamed from: d0 */
    public float f3814d0;

    /* JADX INFO: renamed from: e0 */
    public final Context f3815e0;

    /* JADX INFO: renamed from: f0 */
    public final Paint f3816f0;

    /* JADX INFO: renamed from: g0 */
    public final Paint.FontMetrics f3817g0;

    /* JADX INFO: renamed from: h0 */
    public final RectF f3818h0;

    /* JADX INFO: renamed from: i0 */
    public final PointF f3819i0;

    /* JADX INFO: renamed from: j0 */
    public final Path f3820j0;

    /* JADX INFO: renamed from: k0 */
    public final C1075i f3821k0;

    /* JADX INFO: renamed from: l0 */
    public int f3822l0;

    /* JADX INFO: renamed from: m0 */
    public int f3823m0;

    /* JADX INFO: renamed from: n0 */
    public int f3824n0;

    /* JADX INFO: renamed from: o0 */
    public int f3825o0;

    /* JADX INFO: renamed from: p0 */
    public int f3826p0;

    /* JADX INFO: renamed from: q0 */
    public int f3827q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f3828r0;

    /* JADX INFO: renamed from: s0 */
    public int f3829s0;

    /* JADX INFO: renamed from: t0 */
    public int f3830t0;

    /* JADX INFO: renamed from: u0 */
    public ColorFilter f3831u0;

    /* JADX INFO: renamed from: v0 */
    public PorterDuffColorFilter f3832v0;

    /* JADX INFO: renamed from: w0 */
    public ColorStateList f3833w0;

    /* JADX INFO: renamed from: x */
    public ColorStateList f3834x;

    /* JADX INFO: renamed from: x0 */
    public PorterDuff.Mode f3835x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f3836y;

    /* JADX INFO: renamed from: y0 */
    public int[] f3837y0;

    /* JADX INFO: renamed from: z */
    public float f3838z;

    /* JADX INFO: renamed from: z0 */
    public boolean f3839z0;

    public C1030f(Context context, AttributeSet attributeSet) {
        super(C1127k.m2657a(context, attributeSet, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action).m2656a());
        this.f3779A = -1.0f;
        this.f3816f0 = new Paint(1);
        this.f3817g0 = new Paint.FontMetrics();
        this.f3818h0 = new RectF();
        this.f3819i0 = new PointF();
        this.f3820j0 = new Path();
        this.f3830t0 = 255;
        this.f3835x0 = PorterDuff.Mode.SRC_IN;
        this.f3782B0 = new WeakReference(null);
        m2649i(context);
        this.f3815e0 = context;
        C1075i c1075i = new C1075i(this);
        this.f3821k0 = c1075i;
        this.f3787E = "";
        c1075i.f4172a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f3777G0;
        setState(iArr);
        if (!Arrays.equals(this.f3837y0, iArr)) {
            this.f3837y0 = iArr;
            if (m2500U()) {
                m2507w(getState(), iArr);
            }
        }
        this.f3786D0 = true;
        f3778H0.setTint(-1);
    }

    /* JADX INFO: renamed from: V */
    public static void m2477V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m2478t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2479u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: A */
    public final void m2480A(boolean z2) {
        if (this.f3802R != z2) {
            boolean zM2498S = m2498S();
            this.f3802R = z2;
            boolean zM2498S2 = m2498S();
            if (zM2498S != zM2498S2) {
                if (zM2498S2) {
                    m2501o(this.f3803S);
                } else {
                    m2477V(this.f3803S);
                }
                invalidateSelf();
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m2481B(float f2) {
        if (this.f3779A != f2) {
            this.f3779A = f2;
            C1126j c1126jM2660d = this.f4312a.f4290a.m2660d();
            c1126jM2660d.f4339e = new C1117a(f2);
            c1126jM2660d.f4340f = new C1117a(f2);
            c1126jM2660d.f4341g = new C1117a(f2);
            c1126jM2660d.f4342h = new C1117a(f2);
            setShapeAppearanceModel(c1126jM2660d.m2656a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: C */
    public final void m2482C(Drawable drawable) {
        ?? r02;
        Object obj = this.f3791G;
        if (obj != null) {
            boolean z2 = obj instanceof InterfaceC1114d;
            r02 = obj;
            if (z2) {
                ((AbstractC1115e) ((InterfaceC1114d) obj)).getClass();
                r02 = 0;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fM2503q = m2503q();
            this.f3791G = drawable != null ? drawable.mutate() : null;
            float fM2503q2 = m2503q();
            m2477V(r02);
            if (m2499T()) {
                m2501o(this.f3791G);
            }
            invalidateSelf();
            if (fM2503q != fM2503q2) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2483D(float f2) {
        if (this.f3793I != f2) {
            float fM2503q = m2503q();
            this.f3793I = f2;
            float fM2503q2 = m2503q();
            invalidateSelf();
            if (fM2503q != fM2503q2) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2484E(ColorStateList colorStateList) {
        this.f3794J = true;
        if (this.f3792H != colorStateList) {
            this.f3792H = colorStateList;
            if (m2499T()) {
                AbstractC1111a.m2626h(this.f3791G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m2485F(boolean z2) {
        if (this.f3789F != z2) {
            boolean zM2499T = m2499T();
            this.f3789F = z2;
            boolean zM2499T2 = m2499T();
            if (zM2499T != zM2499T2) {
                if (zM2499T2) {
                    m2501o(this.f3791G);
                } else {
                    m2477V(this.f3791G);
                }
                invalidateSelf();
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m2486G(ColorStateList colorStateList) {
        if (this.f3781B != colorStateList) {
            this.f3781B = colorStateList;
            if (this.f3790F0) {
                C1122f c1122f = this.f4312a;
                if (c1122f.f4293d != colorStateList) {
                    c1122f.f4293d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2487H(float f2) {
        if (this.f3783C != f2) {
            this.f3783C = f2;
            this.f3816f0.setStrokeWidth(f2);
            if (this.f3790F0) {
                this.f4312a.f4300k = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: I */
    public final void m2488I(Drawable drawable) {
        ?? r02;
        Object obj = this.f3796L;
        if (obj != null) {
            boolean z2 = obj instanceof InterfaceC1114d;
            r02 = obj;
            if (z2) {
                ((AbstractC1115e) ((InterfaceC1114d) obj)).getClass();
                r02 = 0;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fM2504r = m2504r();
            this.f3796L = drawable != null ? drawable.mutate() : null;
            this.f3797M = new RippleDrawable(AbstractC1110a.m2618a(this.f3785D), this.f3796L, f3778H0);
            float fM2504r2 = m2504r();
            m2477V(r02);
            if (m2500U()) {
                m2501o(this.f3796L);
            }
            invalidateSelf();
            if (fM2504r != fM2504r2) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m2489J(float f2) {
        if (this.f3813c0 != f2) {
            this.f3813c0 = f2;
            invalidateSelf();
            if (m2500U()) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m2490K(float f2) {
        if (this.f3799O != f2) {
            this.f3799O = f2;
            invalidateSelf();
            if (m2500U()) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m2491L(float f2) {
        if (this.f3812b0 != f2) {
            this.f3812b0 = f2;
            invalidateSelf();
            if (m2500U()) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m2492M(ColorStateList colorStateList) {
        if (this.f3798N != colorStateList) {
            this.f3798N = colorStateList;
            if (m2500U()) {
                AbstractC1111a.m2626h(this.f3796L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m2493N(boolean z2) {
        if (this.f3795K != z2) {
            boolean zM2500U = m2500U();
            this.f3795K = z2;
            boolean zM2500U2 = m2500U();
            if (zM2500U != zM2500U2) {
                if (zM2500U2) {
                    m2501o(this.f3796L);
                } else {
                    m2477V(this.f3796L);
                }
                invalidateSelf();
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m2494O(float f2) {
        if (this.f3809Y != f2) {
            float fM2503q = m2503q();
            this.f3809Y = f2;
            float fM2503q2 = m2503q();
            invalidateSelf();
            if (fM2503q != fM2503q2) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m2495P(float f2) {
        if (this.f3808X != f2) {
            float fM2503q = m2503q();
            this.f3808X = f2;
            float fM2503q2 = m2503q();
            invalidateSelf();
            if (fM2503q != fM2503q2) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m2496Q(ColorStateList colorStateList) {
        if (this.f3785D != colorStateList) {
            this.f3785D = colorStateList;
            this.f3780A0 = this.f3839z0 ? AbstractC1110a.m2618a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m2497R(C1099d c1099d) {
        C1075i c1075i = this.f3821k0;
        if (c1075i.f4177f != c1099d) {
            c1075i.f4177f = c1099d;
            if (c1099d != null) {
                TextPaint textPaint = c1075i.f4172a;
                Context context = this.f3815e0;
                C1026b c1026b = c1075i.f4173b;
                c1099d.m2590f(context, textPaint, c1026b);
                InterfaceC1074h interfaceC1074h = (InterfaceC1074h) c1075i.f4176e.get();
                if (interfaceC1074h != null) {
                    textPaint.drawableState = interfaceC1074h.getState();
                }
                c1099d.m2589e(context, textPaint, c1026b);
                c1075i.f4175d = true;
            }
            InterfaceC1074h interfaceC1074h2 = (InterfaceC1074h) c1075i.f4176e.get();
            if (interfaceC1074h2 != null) {
                C1030f c1030f = (C1030f) interfaceC1074h2;
                c1030f.m2506v();
                c1030f.invalidateSelf();
                c1030f.onStateChange(interfaceC1074h2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m2498S() {
        return this.f3802R && this.f3803S != null && this.f3828r0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m2499T() {
        return this.f3789F && this.f3791G != null;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m2500U() {
        return this.f3795K && this.f3796L != null;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2;
        RectF rectF;
        int i3;
        int i4;
        int i5;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.f3830t0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i2 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i2) : 0;
        boolean z2 = this.f3790F0;
        Paint paint = this.f3816f0;
        RectF rectF3 = this.f3818h0;
        if (!z2) {
            paint.setColor(this.f3822l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m2505s(), m2505s(), paint);
        }
        if (!this.f3790F0) {
            paint.setColor(this.f3823m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f3831u0;
            if (colorFilter == null) {
                colorFilter = this.f3832v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, m2505s(), m2505s(), paint);
        }
        if (this.f3790F0) {
            super.draw(canvas);
        }
        if (this.f3783C > 0.0f && !this.f3790F0) {
            paint.setColor(this.f3825o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f3790F0) {
                ColorFilter colorFilter2 = this.f3831u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f3832v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f3783C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f3779A - (this.f3783C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.f3826p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f3790F0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f3820j0;
            C1122f c1122f = this.f4312a;
            this.f4329r.m2661a(c1122f.f4290a, c1122f.f4299j, rectF4, this.f4328q, path);
            m2646e(canvas, paint, path, this.f4312a.f4290a, m2647g());
        } else {
            canvas.drawRoundRect(rectF3, m2505s(), m2505s(), paint);
        }
        if (m2499T()) {
            m2502p(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.f3791G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f3791G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (m2498S()) {
            m2502p(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f3803S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f3803S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.f3786D0 || this.f3787E == null) {
            rectF = rectF3;
            i3 = iSaveLayerAlpha;
            i4 = 0;
            i5 = 255;
        } else {
            PointF pointF = this.f3819i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f3787E;
            C1075i c1075i = this.f3821k0;
            if (charSequence != null) {
                float fM2503q = m2503q() + this.f3807W + this.f3810Z;
                if (AbstractC1112b.m2628a(this) == 0) {
                    pointF.x = bounds.left + fM2503q;
                } else {
                    pointF.x = bounds.right - fM2503q;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c1075i.f4172a;
                Paint.FontMetrics fontMetrics = this.f3817g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f3787E != null) {
                float fM2503q2 = m2503q() + this.f3807W + this.f3810Z;
                float fM2504r = m2504r() + this.f3814d0 + this.f3811a0;
                if (AbstractC1112b.m2628a(this) == 0) {
                    rectF3.left = bounds.left + fM2503q2;
                    rectF3.right = bounds.right - fM2504r;
                } else {
                    rectF3.left = bounds.left + fM2504r;
                    rectF3.right = bounds.right - fM2503q2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            C1099d c1099d = c1075i.f4177f;
            TextPaint textPaint2 = c1075i.f4172a;
            if (c1099d != null) {
                textPaint2.drawableState = getState();
                c1075i.f4177f.m2589e(this.f3815e0, textPaint2, c1075i.f4173b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(c1075i.m2552a(this.f3787E.toString())) > Math.round(rectF3.width());
            if (z3) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f3787E;
            if (z3 && this.f3784C0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f3784C0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f9 = pointF.x;
            float f10 = pointF.y;
            rectF = rectF3;
            i3 = iSaveLayerAlpha;
            i4 = 0;
            i5 = 255;
            canvas.drawText(charSequence2, 0, length, f9, f10, textPaint2);
            if (z3) {
                canvas.restoreToCount(iSave);
            }
        }
        if (m2500U()) {
            rectF.setEmpty();
            if (m2500U()) {
                float f11 = this.f3814d0 + this.f3813c0;
                if (AbstractC1112b.m2628a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f3799O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f3799O;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f14 = this.f3799O;
                float f15 = fExactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f3796L.setBounds(i4, i4, (int) rectF2.width(), (int) rectF2.height());
            this.f3797M.setBounds(this.f3796L.getBounds());
            this.f3797M.jumpToCurrentState();
            this.f3797M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f3830t0 < i5) {
            canvas.restoreToCount(i3);
        }
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3830t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f3831u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f3838z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m2504r() + this.f3821k0.m2552a(this.f3787E.toString()) + m2503q() + this.f3807W + this.f3810Z + this.f3811a0 + this.f3814d0), this.f3788E0);
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f3790F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f3838z, this.f3779A);
        } else {
            outline.setRoundRect(bounds, this.f3779A);
        }
        outline.setAlpha(this.f3830t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C1099d c1099d;
        ColorStateList colorStateList;
        return m2478t(this.f3834x) || m2478t(this.f3836y) || m2478t(this.f3781B) || (this.f3839z0 && m2478t(this.f3780A0)) || (!((c1099d = this.f3821k0.f4177f) == null || (colorStateList = c1099d.f4242j) == null || !colorStateList.isStateful()) || ((this.f3802R && this.f3803S != null && this.f3801Q) || m2479u(this.f3791G) || m2479u(this.f3803S) || m2478t(this.f3833w0)));
    }

    /* JADX INFO: renamed from: o */
    public final void m2501o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC1112b.m2629b(drawable, AbstractC1112b.m2628a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f3796L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f3837y0);
            }
            AbstractC1111a.m2626h(drawable, this.f3798N);
            return;
        }
        Drawable drawable2 = this.f3791G;
        if (drawable == drawable2 && this.f3794J) {
            AbstractC1111a.m2626h(drawable2, this.f3792H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (m2499T()) {
            zOnLayoutDirectionChanged |= AbstractC1112b.m2629b(this.f3791G, i2);
        }
        if (m2498S()) {
            zOnLayoutDirectionChanged |= AbstractC1112b.m2629b(this.f3803S, i2);
        }
        if (m2500U()) {
            zOnLayoutDirectionChanged |= AbstractC1112b.m2629b(this.f3796L, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (m2499T()) {
            zOnLevelChange |= this.f3791G.setLevel(i2);
        }
        if (m2498S()) {
            zOnLevelChange |= this.f3803S.setLevel(i2);
        }
        if (m2500U()) {
            zOnLevelChange |= this.f3796L.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f3790F0) {
            super.onStateChange(iArr);
        }
        return m2507w(iArr, this.f3837y0);
    }

    /* JADX INFO: renamed from: p */
    public final void m2502p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2499T() || m2498S()) {
            float f2 = this.f3807W + this.f3808X;
            Drawable drawable = this.f3828r0 ? this.f3803S : this.f3791G;
            float intrinsicWidth = this.f3793I;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (AbstractC1112b.m2628a(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + intrinsicWidth;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - intrinsicWidth;
            }
            Drawable drawable2 = this.f3828r0 ? this.f3803S : this.f3791G;
            float fCeil = this.f3793I;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f3815e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* JADX INFO: renamed from: q */
    public final float m2503q() {
        if (!m2499T() && !m2498S()) {
            return 0.0f;
        }
        float f2 = this.f3808X;
        Drawable drawable = this.f3828r0 ? this.f3803S : this.f3791G;
        float intrinsicWidth = this.f3793I;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f2 + this.f3809Y;
    }

    /* JADX INFO: renamed from: r */
    public final float m2504r() {
        if (m2500U()) {
            return this.f3812b0 + this.f3799O + this.f3813c0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: s */
    public final float m2505s() {
        return this.f3790F0 ? this.f4312a.f4290a.f4351e.mo2634a(m2647g()) : this.f3779A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f3830t0 != i2) {
            this.f3830t0 = i2;
            invalidateSelf();
        }
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f3831u0 != colorFilter) {
            this.f3831u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f3833w0 != colorStateList) {
            this.f3833w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f3835x0 != mode) {
            this.f3835x0 = mode;
            ColorStateList colorStateList = this.f3833w0;
            this.f3832v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (m2499T()) {
            visible |= this.f3791G.setVisible(z2, z3);
        }
        if (m2498S()) {
            visible |= this.f3803S.setVisible(z2, z3);
        }
        if (m2500U()) {
            visible |= this.f3796L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2506v() {
        InterfaceC1029e interfaceC1029e = (InterfaceC1029e) this.f3782B0.get();
        if (interfaceC1029e != null) {
            Chip chip = (Chip) interfaceC1029e;
            chip.m1869b(chip.f2381p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2507w(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z2;
        boolean z3;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f3834x;
        int iM2644c = m2644c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f3822l0) : 0);
        boolean state = true;
        if (this.f3822l0 != iM2644c) {
            this.f3822l0 = iM2644c;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f3836y;
        int iM2644c2 = m2644c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f3823m0) : 0);
        if (this.f3823m0 != iM2644c2) {
            this.f3823m0 = iM2644c2;
            zOnStateChange = true;
        }
        int iM2593b = AbstractC1100a.m2593b(iM2644c2, iM2644c);
        if ((this.f3824n0 != iM2593b) | (this.f4312a.f4292c == null)) {
            this.f3824n0 = iM2593b;
            m2651k(ColorStateList.valueOf(iM2593b));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f3781B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f3825o0) : 0;
        if (this.f3825o0 != colorForState2) {
            this.f3825o0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f3780A0 != null) {
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z5 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z6 = true;
                }
            }
            if (z5 && z6) {
                z4 = true;
            }
            colorForState = z4 ? this.f3780A0.getColorForState(iArr, this.f3826p0) : 0;
        }
        if (this.f3826p0 != colorForState) {
            this.f3826p0 = colorForState;
            if (this.f3839z0) {
                zOnStateChange = true;
            }
        }
        C1099d c1099d = this.f3821k0.f4177f;
        int colorForState3 = (c1099d == null || (colorStateList = c1099d.f4242j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f3827q0);
        if (this.f3827q0 != colorForState3) {
            this.f3827q0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z2 = false;
        } else {
            int length = state2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (state2[i3] != 16842912) {
                    i3++;
                } else if (this.f3801Q) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (this.f3828r0 == z2 || this.f3803S == null) {
            z3 = false;
        } else {
            float fM2503q = m2503q();
            this.f3828r0 = z2;
            if (fM2503q != m2503q()) {
                zOnStateChange = true;
                z3 = true;
            } else {
                z3 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f3833w0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f3829s0) : 0;
        if (this.f3829s0 != colorForState4) {
            this.f3829s0 = colorForState4;
            ColorStateList colorStateList6 = this.f3833w0;
            PorterDuff.Mode mode = this.f3835x0;
            this.f3832v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m2479u(this.f3791G)) {
            state |= this.f3791G.setState(iArr);
        }
        if (m2479u(this.f3803S)) {
            state |= this.f3803S.setState(iArr);
        }
        if (m2479u(this.f3796L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f3796L.setState(iArr3);
        }
        if (m2479u(this.f3797M)) {
            state |= this.f3797M.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z3) {
            m2506v();
        }
        return state;
    }

    /* JADX INFO: renamed from: x */
    public final void m2508x(boolean z2) {
        if (this.f3801Q != z2) {
            this.f3801Q = z2;
            float fM2503q = m2503q();
            if (!z2 && this.f3828r0) {
                this.f3828r0 = false;
            }
            float fM2503q2 = m2503q();
            invalidateSelf();
            if (fM2503q != fM2503q2) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2509y(Drawable drawable) {
        if (this.f3803S != drawable) {
            float fM2503q = m2503q();
            this.f3803S = drawable;
            float fM2503q2 = m2503q();
            m2477V(this.f3803S);
            m2501o(this.f3803S);
            invalidateSelf();
            if (fM2503q != fM2503q2) {
                m2506v();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2510z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f3804T != colorStateList) {
            this.f3804T = colorStateList;
            if (this.f3802R && (drawable = this.f3803S) != null && this.f3801Q) {
                AbstractC1111a.m2626h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
