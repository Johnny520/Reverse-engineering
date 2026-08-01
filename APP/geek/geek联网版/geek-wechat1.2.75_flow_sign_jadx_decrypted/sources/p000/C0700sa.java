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

/* JADX INFO: renamed from: sa */
/* JADX INFO: loaded from: classes.dex */
public final class C0700sa extends C0350iu implements Drawable.Callback, i60 {

    /* JADX INFO: renamed from: F0 */
    public static final int[] f4225F0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: G0 */
    public static final ShapeDrawable f4226G0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A */
    public float f4227A;

    /* JADX INFO: renamed from: A0 */
    public WeakReference f4228A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f4229B;

    /* JADX INFO: renamed from: B0 */
    public TextUtils.TruncateAt f4230B0;

    /* JADX INFO: renamed from: C */
    public float f4231C;

    /* JADX INFO: renamed from: C0 */
    public boolean f4232C0;

    /* JADX INFO: renamed from: D */
    public ColorStateList f4233D;

    /* JADX INFO: renamed from: D0 */
    public int f4234D0;

    /* JADX INFO: renamed from: E */
    public CharSequence f4235E;

    /* JADX INFO: renamed from: E0 */
    public boolean f4236E0;

    /* JADX INFO: renamed from: F */
    public boolean f4237F;

    /* JADX INFO: renamed from: G */
    public Drawable f4238G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f4239H;

    /* JADX INFO: renamed from: I */
    public float f4240I;

    /* JADX INFO: renamed from: J */
    public boolean f4241J;

    /* JADX INFO: renamed from: K */
    public boolean f4242K;

    /* JADX INFO: renamed from: L */
    public Drawable f4243L;

    /* JADX INFO: renamed from: M */
    public RippleDrawable f4244M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f4245N;

    /* JADX INFO: renamed from: O */
    public float f4246O;

    /* JADX INFO: renamed from: P */
    public SpannableStringBuilder f4247P;

    /* JADX INFO: renamed from: Q */
    public boolean f4248Q;

    /* JADX INFO: renamed from: R */
    public boolean f4249R;

    /* JADX INFO: renamed from: S */
    public Drawable f4250S;

    /* JADX INFO: renamed from: T */
    public ColorStateList f4251T;

    /* JADX INFO: renamed from: U */
    public C0352iw f4252U;

    /* JADX INFO: renamed from: V */
    public C0352iw f4253V;

    /* JADX INFO: renamed from: W */
    public float f4254W;

    /* JADX INFO: renamed from: X */
    public float f4255X;

    /* JADX INFO: renamed from: Y */
    public float f4256Y;

    /* JADX INFO: renamed from: Z */
    public float f4257Z;

    /* JADX INFO: renamed from: a0 */
    public float f4258a0;

    /* JADX INFO: renamed from: b0 */
    public float f4259b0;

    /* JADX INFO: renamed from: c0 */
    public float f4260c0;

    /* JADX INFO: renamed from: d0 */
    public float f4261d0;

    /* JADX INFO: renamed from: e0 */
    public final Context f4262e0;

    /* JADX INFO: renamed from: f0 */
    public final Paint f4263f0;

    /* JADX INFO: renamed from: g0 */
    public final Paint.FontMetrics f4264g0;

    /* JADX INFO: renamed from: h0 */
    public final RectF f4265h0;

    /* JADX INFO: renamed from: i0 */
    public final PointF f4266i0;

    /* JADX INFO: renamed from: j0 */
    public final Path f4267j0;

    /* JADX INFO: renamed from: k0 */
    public final j60 f4268k0;

    /* JADX INFO: renamed from: l0 */
    public int f4269l0;

    /* JADX INFO: renamed from: m0 */
    public int f4270m0;

    /* JADX INFO: renamed from: n0 */
    public int f4271n0;

    /* JADX INFO: renamed from: o0 */
    public int f4272o0;

    /* JADX INFO: renamed from: p0 */
    public int f4273p0;

    /* JADX INFO: renamed from: q0 */
    public int f4274q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f4275r0;

    /* JADX INFO: renamed from: s0 */
    public int f4276s0;

    /* JADX INFO: renamed from: t0 */
    public int f4277t0;

    /* JADX INFO: renamed from: u0 */
    public ColorFilter f4278u0;

    /* JADX INFO: renamed from: v0 */
    public PorterDuffColorFilter f4279v0;

    /* JADX INFO: renamed from: w0 */
    public ColorStateList f4280w0;

    /* JADX INFO: renamed from: x */
    public ColorStateList f4281x;

    /* JADX INFO: renamed from: x0 */
    public PorterDuff.Mode f4282x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f4283y;

    /* JADX INFO: renamed from: y0 */
    public int[] f4284y0;

    /* JADX INFO: renamed from: z */
    public float f4285z;

    /* JADX INFO: renamed from: z0 */
    public ColorStateList f4286z0;

    public C0700sa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        this.f4227A = -1.0f;
        this.f4263f0 = new Paint(1);
        this.f4264g0 = new Paint.FontMetrics();
        this.f4265h0 = new RectF();
        this.f4266i0 = new PointF();
        this.f4267j0 = new Path();
        this.f4277t0 = 255;
        this.f4282x0 = PorterDuff.Mode.SRC_IN;
        this.f4228A0 = new WeakReference(null);
        m1535h(context);
        this.f4262e0 = context;
        j60 j60Var = new j60(this);
        this.f4268k0 = j60Var;
        this.f4235E = "";
        j60Var.f2664a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f4225F0;
        setState(iArr);
        if (!Arrays.equals(this.f4284y0, iArr)) {
            this.f4284y0 = iArr;
            if (m2349T()) {
                m2356v(getState(), iArr);
            }
        }
        this.f4232C0 = true;
        int[] iArr2 = n10.f3204a;
        f4226G0.setTint(-1);
    }

    /* JADX INFO: renamed from: U */
    public static void m2327U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2328s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m2329t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: A */
    public final void m2330A(float f) {
        if (this.f4227A != f) {
            this.f4227A = f;
            l30 l30VarM1802e = this.f2585a.f2266a.m1802e();
            l30VarM1802e.f2908e = new C0169e(f);
            l30VarM1802e.f2909f = new C0169e(f);
            l30VarM1802e.f2910g = new C0169e(f);
            l30VarM1802e.f2911h = new C0169e(f);
            setShapeAppearanceModel(l30VarM1802e.m1731a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: B */
    public final void m2331B(Drawable drawable) {
        ?? r0;
        Object obj = this.f4238G;
        if (obj != null) {
            boolean z = obj instanceof fd0;
            r0 = obj;
            if (z) {
                r0 = 0;
            }
        } else {
            r0 = 0;
        }
        if (r0 != drawable) {
            float fM2352p = m2352p();
            this.f4238G = drawable != null ? drawable.mutate() : null;
            float fM2352p2 = m2352p();
            m2327U(r0);
            if (m2348S()) {
                m2350n(this.f4238G);
            }
            invalidateSelf();
            if (fM2352p != fM2352p2) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2332C(float f) {
        if (this.f4240I != f) {
            float fM2352p = m2352p();
            this.f4240I = f;
            float fM2352p2 = m2352p();
            invalidateSelf();
            if (fM2352p != fM2352p2) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2333D(ColorStateList colorStateList) {
        this.f4241J = true;
        if (this.f4239H != colorStateList) {
            this.f4239H = colorStateList;
            if (m2348S()) {
                AbstractC0187eh.m995h(this.f4238G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2334E(boolean z) {
        if (this.f4237F != z) {
            boolean zM2348S = m2348S();
            this.f4237F = z;
            boolean zM2348S2 = m2348S();
            if (zM2348S != zM2348S2) {
                if (zM2348S2) {
                    m2350n(this.f4238G);
                } else {
                    m2327U(this.f4238G);
                }
                invalidateSelf();
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m2335F(ColorStateList colorStateList) {
        if (this.f4229B != colorStateList) {
            this.f4229B = colorStateList;
            if (this.f4236E0) {
                C0311hu c0311hu = this.f2585a;
                if (c0311hu.f2269d != colorStateList) {
                    c0311hu.f2269d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m2336G(float f) {
        if (this.f4231C != f) {
            this.f4231C = f;
            this.f4263f0.setStrokeWidth(f);
            if (this.f4236E0) {
                this.f2585a.f2275j = f;
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
    public final void m2337H(Drawable drawable) {
        ?? r0;
        Object obj = this.f4243L;
        if (obj != null) {
            boolean z = obj instanceof fd0;
            r0 = obj;
            if (z) {
                r0 = 0;
            }
        } else {
            r0 = 0;
        }
        if (r0 != drawable) {
            float fM2353q = m2353q();
            this.f4243L = drawable != null ? drawable.mutate() : null;
            int[] iArr = n10.f3204a;
            this.f4244M = new RippleDrawable(n10.m1909a(this.f4233D), this.f4243L, f4226G0);
            float fM2353q2 = m2353q();
            m2327U(r0);
            if (m2349T()) {
                m2350n(this.f4243L);
            }
            invalidateSelf();
            if (fM2353q != fM2353q2) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m2338I(float f) {
        if (this.f4260c0 != f) {
            this.f4260c0 = f;
            invalidateSelf();
            if (m2349T()) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m2339J(float f) {
        if (this.f4246O != f) {
            this.f4246O = f;
            invalidateSelf();
            if (m2349T()) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m2340K(float f) {
        if (this.f4259b0 != f) {
            this.f4259b0 = f;
            invalidateSelf();
            if (m2349T()) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m2341L(ColorStateList colorStateList) {
        if (this.f4245N != colorStateList) {
            this.f4245N = colorStateList;
            if (m2349T()) {
                AbstractC0187eh.m995h(this.f4243L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m2342M(boolean z) {
        if (this.f4242K != z) {
            boolean zM2349T = m2349T();
            this.f4242K = z;
            boolean zM2349T2 = m2349T();
            if (zM2349T != zM2349T2) {
                if (zM2349T2) {
                    m2350n(this.f4243L);
                } else {
                    m2327U(this.f4243L);
                }
                invalidateSelf();
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m2343N(float f) {
        if (this.f4256Y != f) {
            float fM2352p = m2352p();
            this.f4256Y = f;
            float fM2352p2 = m2352p();
            invalidateSelf();
            if (fM2352p != fM2352p2) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m2344O(float f) {
        if (this.f4255X != f) {
            float fM2352p = m2352p();
            this.f4255X = f;
            float fM2352p2 = m2352p();
            invalidateSelf();
            if (fM2352p != fM2352p2) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m2345P(ColorStateList colorStateList) {
        if (this.f4233D != colorStateList) {
            this.f4233D = colorStateList;
            this.f4286z0 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m2346Q(g60 g60Var) {
        j60 j60Var = this.f4268k0;
        C0589pa c0589pa = j60Var.f2665b;
        TextPaint textPaint = j60Var.f2664a;
        if (j60Var.f2669f != g60Var) {
            j60Var.f2669f = g60Var;
            if (g60Var != null) {
                Context context = this.f4262e0;
                g60Var.m1168f(context, textPaint, c0589pa);
                i60 i60Var = (i60) j60Var.f2668e.get();
                if (i60Var != null) {
                    textPaint.drawableState = i60Var.getState();
                }
                g60Var.m1167e(context, textPaint, c0589pa);
                j60Var.f2667d = true;
            }
            i60 i60Var2 = (i60) j60Var.f2668e.get();
            if (i60Var2 != null) {
                C0700sa c0700sa = (C0700sa) i60Var2;
                c0700sa.m2355u();
                c0700sa.invalidateSelf();
                c0700sa.onStateChange(i60Var2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m2347R() {
        return this.f4249R && this.f4250S != null && this.f4275r0;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m2348S() {
        return this.f4237F && this.f4238G != null;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m2349T() {
        return this.f4242K && this.f4243L != null;
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f4277t0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f4236E0;
        Paint paint = this.f4263f0;
        RectF rectF = this.f4265h0;
        if (!z) {
            paint.setColor(this.f4269l0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m2354r(), m2354r(), paint);
        }
        if (!this.f4236E0) {
            paint.setColor(this.f4270m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f4278u0;
            if (colorFilter == null) {
                colorFilter = this.f4279v0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m2354r(), m2354r(), paint);
        }
        if (this.f4236E0) {
            super.draw(canvas);
        }
        if (this.f4231C > 0.0f && !this.f4236E0) {
            paint.setColor(this.f4272o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f4236E0) {
                ColorFilter colorFilter2 = this.f4278u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f4279v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f4231C / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f4227A - (this.f4231C / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f4273p0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f4236E0) {
            RectF rectF2 = new RectF(bounds);
            C0311hu c0311hu = this.f2585a;
            m30 m30Var = c0311hu.f2266a;
            float f4 = c0311hu.f2274i;
            C0431l0 c0431l0 = this.f2601q;
            o30 o30Var = this.f2602r;
            Path path = this.f4267j0;
            o30Var.m1970a(m30Var, f4, rectF2, c0431l0, path);
            m1532d(canvas2, paint, path, this.f2585a.f2266a, m1533f());
        } else {
            canvas2.drawRoundRect(rectF, m2354r(), m2354r(), paint);
        }
        if (m2348S()) {
            m2351o(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.f4238G.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f4238G.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (m2347R()) {
            m2351o(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.f4250S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f4250S.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.f4232C0 && this.f4235E != null) {
            PointF pointF = this.f4266i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f4235E;
            j60 j60Var = this.f4268k0;
            if (charSequence != null) {
                float fM2352p = m2352p() + this.f4254W + this.f4257Z;
                if (AbstractC0224fh.m1100a(this) == 0) {
                    pointF.x = bounds.left + fM2352p;
                } else {
                    pointF.x = bounds.right - fM2352p;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = j60Var.f2664a;
                Paint.FontMetrics fontMetrics = this.f4264g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f4235E != null) {
                float fM2352p2 = m2352p() + this.f4254W + this.f4257Z;
                float fM2353q = m2353q() + this.f4261d0 + this.f4258a0;
                if (AbstractC0224fh.m1100a(this) == 0) {
                    rectF.left = bounds.left + fM2352p2;
                    rectF.right = bounds.right - fM2353q;
                } else {
                    rectF.left = bounds.left + fM2353q;
                    rectF.right = bounds.right - fM2352p2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            g60 g60Var = j60Var.f2669f;
            TextPaint textPaint2 = j60Var.f2664a;
            if (g60Var != null) {
                textPaint2.drawableState = getState();
                j60Var.f2669f.m1167e(this.f4262e0, textPaint2, j60Var.f2665b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(j60Var.m1575a(this.f4235E.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f4235E;
            if (z2 && this.f4230B0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f4230B0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m2349T()) {
            rectF.setEmpty();
            if (m2349T()) {
                float f9 = this.f4261d0 + this.f4260c0;
                if (AbstractC0224fh.m1100a(this) == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.f4246O;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.f4246O;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.f4246O;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f4243L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = n10.f3204a;
            this.f4244M.setBounds(this.f4243L.getBounds());
            this.f4244M.jumpToCurrentState();
            this.f4244M.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.f4277t0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4277t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4278u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f4285z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m2353q() + this.f4268k0.m1575a(this.f4235E.toString()) + m2352p() + this.f4254W + this.f4257Z + this.f4258a0 + this.f4261d0), this.f4234D0);
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f4236E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f4285z, this.f4227A);
        } else {
            outline.setRoundRect(bounds, this.f4227A);
            outline2 = outline;
        }
        outline2.setAlpha(this.f4277t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m2328s(this.f4281x) || m2328s(this.f4283y) || m2328s(this.f4229B)) {
            return true;
        }
        g60 g60Var = this.f4268k0.f2669f;
        if (g60Var == null || (colorStateList = g60Var.f1891j) == null || !colorStateList.isStateful()) {
            return (this.f4249R && this.f4250S != null && this.f4248Q) || m2329t(this.f4238G) || m2329t(this.f4250S) || m2328s(this.f4280w0);
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m2350n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0224fh.m1101b(drawable, AbstractC0224fh.m1100a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f4243L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f4284y0);
            }
            AbstractC0187eh.m995h(drawable, this.f4245N);
            return;
        }
        Drawable drawable2 = this.f4238G;
        if (drawable == drawable2 && this.f4241J) {
            AbstractC0187eh.m995h(drawable2, this.f4239H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2351o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m2348S() || m2347R()) {
            float f = this.f4254W + this.f4255X;
            Drawable drawable = this.f4275r0 ? this.f4250S : this.f4238G;
            float intrinsicWidth = this.f4240I;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (AbstractC0224fh.m1100a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f4275r0 ? this.f4250S : this.f4238G;
            float fCeil = this.f4240I;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f4262e0.getResources().getDisplayMetrics()));
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
        if (m2348S()) {
            zOnLayoutDirectionChanged |= AbstractC0224fh.m1101b(this.f4238G, i);
        }
        if (m2347R()) {
            zOnLayoutDirectionChanged |= AbstractC0224fh.m1101b(this.f4250S, i);
        }
        if (m2349T()) {
            zOnLayoutDirectionChanged |= AbstractC0224fh.m1101b(this.f4243L, i);
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
        if (m2348S()) {
            zOnLevelChange |= this.f4238G.setLevel(i);
        }
        if (m2347R()) {
            zOnLevelChange |= this.f4250S.setLevel(i);
        }
        if (m2349T()) {
            zOnLevelChange |= this.f4243L.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f4236E0) {
            super.onStateChange(iArr);
        }
        return m2356v(iArr, this.f4284y0);
    }

    /* JADX INFO: renamed from: p */
    public final float m2352p() {
        if (!m2348S() && !m2347R()) {
            return 0.0f;
        }
        float f = this.f4255X;
        Drawable drawable = this.f4275r0 ? this.f4250S : this.f4238G;
        float intrinsicWidth = this.f4240I;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f4256Y;
    }

    /* JADX INFO: renamed from: q */
    public final float m2353q() {
        if (m2349T()) {
            return this.f4259b0 + this.f4246O + this.f4260c0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: r */
    public final float m2354r() {
        return this.f4236E0 ? this.f2585a.f2266a.f3065e.mo943a(m1533f()) : this.f4227A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f4277t0 != i) {
            this.f4277t0 = i;
            invalidateSelf();
        }
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4278u0 != colorFilter) {
            this.f4278u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4280w0 != colorStateList) {
            this.f4280w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f4282x0 != mode) {
            this.f4282x0 = mode;
            ColorStateList colorStateList = this.f4280w0;
            this.f4279v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m2348S()) {
            visible |= this.f4238G.setVisible(z, z2);
        }
        if (m2347R()) {
            visible |= this.f4250S.setVisible(z, z2);
        }
        if (m2349T()) {
            visible |= this.f4243L.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: u */
    public final void m2355u() {
        InterfaceC0663ra interfaceC0663ra = (InterfaceC0663ra) this.f4228A0.get();
        if (interfaceC0663ra != null) {
            Chip chip = (Chip) interfaceC0663ra;
            chip.m708b(chip.f1037p);
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
    public final boolean m2356v(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f4281x;
        int iM1530b = m1530b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f4269l0) : 0);
        boolean state = true;
        if (this.f4269l0 != iM1530b) {
            this.f4269l0 = iM1530b;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f4283y;
        int iM1530b2 = m1530b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f4270m0) : 0);
        if (this.f4270m0 != iM1530b2) {
            this.f4270m0 = iM1530b2;
            zOnStateChange = true;
        }
        int iM2142b = AbstractC0627qb.m2142b(iM1530b2, iM1530b);
        if ((this.f4271n0 != iM2142b) | (this.f2585a.f2268c == null)) {
            this.f4271n0 = iM2142b;
            m1537j(ColorStateList.valueOf(iM2142b));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f4229B;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f4272o0) : 0;
        if (this.f4272o0 != colorForState) {
            this.f4272o0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f4286z0 == null || !n10.m1910b(iArr)) ? 0 : this.f4286z0.getColorForState(iArr, this.f4273p0);
        if (this.f4273p0 != colorForState2) {
            this.f4273p0 = colorForState2;
        }
        g60 g60Var = this.f4268k0.f2669f;
        int colorForState3 = (g60Var == null || (colorStateList = g60Var.f1891j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f4274q0);
        if (this.f4274q0 != colorForState3) {
            this.f4274q0 = colorForState3;
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
                } else if (this.f4248Q) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.f4275r0 == z || this.f4250S == null) {
            z2 = false;
        } else {
            float fM2352p = m2352p();
            this.f4275r0 = z;
            if (fM2352p != m2352p()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f4280w0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f4276s0) : 0;
        if (this.f4276s0 != colorForState4) {
            this.f4276s0 = colorForState4;
            ColorStateList colorStateList6 = this.f4280w0;
            PorterDuff.Mode mode = this.f4282x0;
            this.f4279v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m2329t(this.f4238G)) {
            state |= this.f4238G.setState(iArr);
        }
        if (m2329t(this.f4250S)) {
            state |= this.f4250S.setState(iArr);
        }
        if (m2329t(this.f4243L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f4243L.setState(iArr3);
        }
        int[] iArr4 = n10.f3204a;
        if (m2329t(this.f4244M)) {
            state |= this.f4244M.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m2355u();
        }
        return state;
    }

    /* JADX INFO: renamed from: w */
    public final void m2357w(boolean z) {
        if (this.f4248Q != z) {
            this.f4248Q = z;
            float fM2352p = m2352p();
            if (!z && this.f4275r0) {
                this.f4275r0 = false;
            }
            float fM2352p2 = m2352p();
            invalidateSelf();
            if (fM2352p != fM2352p2) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2358x(Drawable drawable) {
        if (this.f4250S != drawable) {
            float fM2352p = m2352p();
            this.f4250S = drawable;
            float fM2352p2 = m2352p();
            m2327U(this.f4250S);
            m2350n(this.f4250S);
            invalidateSelf();
            if (fM2352p != fM2352p2) {
                m2355u();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2359y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f4251T != colorStateList) {
            this.f4251T = colorStateList;
            if (this.f4249R && (drawable = this.f4250S) != null && this.f4248Q) {
                AbstractC0187eh.m995h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2360z(boolean z) {
        if (this.f4249R != z) {
            boolean zM2347R = m2347R();
            this.f4249R = z;
            boolean zM2347R2 = m2347R();
            if (zM2347R != zM2347R2) {
                if (zM2347R2) {
                    m2350n(this.f4250S);
                } else {
                    m2327U(this.f4250S);
                }
                invalidateSelf();
                m2355u();
            }
        }
    }
}
