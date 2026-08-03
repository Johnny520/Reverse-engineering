package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
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
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000a.C0354Ta;
import p000a.C0393Vd;
import p000a.C0394Ve;
import p000a.C0448Ye;
import p000a.C0811s;
import p000a.C0861ub;
import p000a.C0872v3;
import p000a.C0893w5;
import p000a.InterfaceC0886vh;

/* JADX INFO: renamed from: com.google.android.material.chip.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1281a extends C0354Ta implements Drawable.Callback, C0448Ye.b {

    /* JADX INFO: renamed from: G0 */
    public static final int[] f5616G0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: H0 */
    public static final ShapeDrawable f5617H0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A */
    public float f5618A;

    /* JADX INFO: renamed from: A0 */
    public ColorStateList f5619A0;

    /* JADX INFO: renamed from: B */
    public float f5620B;

    /* JADX INFO: renamed from: B0 */
    public WeakReference<a> f5621B0;

    /* JADX INFO: renamed from: C */
    public ColorStateList f5622C;

    /* JADX INFO: renamed from: C0 */
    public TextUtils.TruncateAt f5623C0;

    /* JADX INFO: renamed from: D */
    public float f5624D;

    /* JADX INFO: renamed from: D0 */
    public boolean f5625D0;

    /* JADX INFO: renamed from: E */
    public ColorStateList f5626E;

    /* JADX INFO: renamed from: E0 */
    public int f5627E0;

    /* JADX INFO: renamed from: F */
    public CharSequence f5628F;

    /* JADX INFO: renamed from: F0 */
    public boolean f5629F0;

    /* JADX INFO: renamed from: G */
    public boolean f5630G;

    /* JADX INFO: renamed from: H */
    public Drawable f5631H;

    /* JADX INFO: renamed from: I */
    public ColorStateList f5632I;

    /* JADX INFO: renamed from: J */
    public float f5633J;

    /* JADX INFO: renamed from: K */
    public boolean f5634K;

    /* JADX INFO: renamed from: L */
    public boolean f5635L;

    /* JADX INFO: renamed from: M */
    public Drawable f5636M;

    /* JADX INFO: renamed from: N */
    public RippleDrawable f5637N;

    /* JADX INFO: renamed from: O */
    public ColorStateList f5638O;

    /* JADX INFO: renamed from: P */
    public float f5639P;

    /* JADX INFO: renamed from: Q */
    public SpannableStringBuilder f5640Q;

    /* JADX INFO: renamed from: R */
    public boolean f5641R;

    /* JADX INFO: renamed from: S */
    public boolean f5642S;

    /* JADX INFO: renamed from: T */
    public Drawable f5643T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f5644U;

    /* JADX INFO: renamed from: V */
    public C0861ub f5645V;

    /* JADX INFO: renamed from: W */
    public C0861ub f5646W;

    /* JADX INFO: renamed from: X */
    public float f5647X;

    /* JADX INFO: renamed from: Y */
    public float f5648Y;

    /* JADX INFO: renamed from: Z */
    public float f5649Z;

    /* JADX INFO: renamed from: a0 */
    public float f5650a0;

    /* JADX INFO: renamed from: b0 */
    public float f5651b0;

    /* JADX INFO: renamed from: c0 */
    public float f5652c0;

    /* JADX INFO: renamed from: d0 */
    public float f5653d0;

    /* JADX INFO: renamed from: e0 */
    public float f5654e0;

    /* JADX INFO: renamed from: f0 */
    public final Context f5655f0;

    /* JADX INFO: renamed from: g0 */
    public final Paint f5656g0;

    /* JADX INFO: renamed from: h0 */
    public final Paint.FontMetrics f5657h0;

    /* JADX INFO: renamed from: i0 */
    public final RectF f5658i0;

    /* JADX INFO: renamed from: j0 */
    public final PointF f5659j0;

    /* JADX INFO: renamed from: k0 */
    public final Path f5660k0;

    /* JADX INFO: renamed from: l0 */
    public final C0448Ye f5661l0;

    /* JADX INFO: renamed from: m0 */
    public int f5662m0;

    /* JADX INFO: renamed from: n0 */
    public int f5663n0;

    /* JADX INFO: renamed from: o0 */
    public int f5664o0;

    /* JADX INFO: renamed from: p0 */
    public int f5665p0;

    /* JADX INFO: renamed from: q0 */
    public int f5666q0;

    /* JADX INFO: renamed from: r0 */
    public int f5667r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f5668s0;

    /* JADX INFO: renamed from: t0 */
    public int f5669t0;

    /* JADX INFO: renamed from: u0 */
    public int f5670u0;

    /* JADX INFO: renamed from: v0 */
    public ColorFilter f5671v0;

    /* JADX INFO: renamed from: w0 */
    public PorterDuffColorFilter f5672w0;

    /* JADX INFO: renamed from: x0 */
    public ColorStateList f5673x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f5674y;

    /* JADX INFO: renamed from: y0 */
    public PorterDuff.Mode f5675y0;

    /* JADX INFO: renamed from: z */
    public ColorStateList f5676z;

    /* JADX INFO: renamed from: z0 */
    public int[] f5677z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3171a();
    }

    public C1281a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, Chip.f5592w);
        this.f5620B = -1.0f;
        this.f5656g0 = new Paint(1);
        this.f5657h0 = new Paint.FontMetrics();
        this.f5658i0 = new RectF();
        this.f5659j0 = new PointF();
        this.f5660k0 = new Path();
        this.f5670u0 = 255;
        this.f5675y0 = PorterDuff.Mode.SRC_IN;
        this.f5621B0 = new WeakReference<>(null);
        m965i(context);
        this.f5655f0 = context;
        C0448Ye c0448Ye = new C0448Ye(this);
        this.f5661l0 = c0448Ye;
        this.f5628F = "";
        c0448Ye.f1686a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f5616G0;
        setState(iArr);
        if (!Arrays.equals(this.f5677z0, iArr)) {
            this.f5677z0 = iArr;
            if (m3201U()) {
                m3208w(getState(), iArr);
            }
        }
        this.f5625D0 = true;
        f5617H0.setTint(-1);
    }

    /* JADX INFO: renamed from: V */
    public static void m3178V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m3179t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: u */
    public static boolean m3180u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: A */
    public final void m3181A(boolean z) {
        if (this.f5642S != z) {
            boolean zM3199S = m3199S();
            this.f5642S = z;
            boolean zM3199S2 = m3199S();
            if (zM3199S != zM3199S2) {
                if (zM3199S2) {
                    m3202o(this.f5643T);
                } else {
                    m3178V(this.f5643T);
                }
                invalidateSelf();
                m3207v();
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public final void m3182B(float f) {
        if (this.f5620B != f) {
            this.f5620B = f;
            C0393Vd.a aVarM1026e = this.f1310a.f1334a.m1026e();
            aVarM1026e.f1498e = new C0811s(f);
            aVarM1026e.f1499f = new C0811s(f);
            aVarM1026e.f1500g = new C0811s(f);
            aVarM1026e.f1501h = new C0811s(f);
            setShapeAppearanceModel(aVarM1026e.m1028a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: C */
    public final void m3183C(Drawable drawable) {
        ?? M2109a;
        Object obj = this.f5631H;
        if (obj != null) {
            boolean z = obj instanceof InterfaceC0886vh;
            M2109a = obj;
            if (z) {
                M2109a = ((InterfaceC0886vh) obj).m2109a();
            }
        } else {
            M2109a = 0;
        }
        if (M2109a != drawable) {
            float fM3204q = m3204q();
            this.f5631H = drawable != null ? drawable.mutate() : null;
            float fM3204q2 = m3204q();
            m3178V(M2109a);
            if (m3200T()) {
                m3202o(this.f5631H);
            }
            invalidateSelf();
            if (fM3204q != fM3204q2) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m3184D(float f) {
        if (this.f5633J != f) {
            float fM3204q = m3204q();
            this.f5633J = f;
            float fM3204q2 = m3204q();
            invalidateSelf();
            if (fM3204q != fM3204q2) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m3185E(ColorStateList colorStateList) {
        this.f5634K = true;
        if (this.f5632I != colorStateList) {
            this.f5632I = colorStateList;
            if (m3200T()) {
                C0893w5.a.m2176h(this.f5631H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3186F(boolean z) {
        if (this.f5630G != z) {
            boolean zM3200T = m3200T();
            this.f5630G = z;
            boolean zM3200T2 = m3200T();
            if (zM3200T != zM3200T2) {
                if (zM3200T2) {
                    m3202o(this.f5631H);
                } else {
                    m3178V(this.f5631H);
                }
                invalidateSelf();
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m3187G(ColorStateList colorStateList) {
        if (this.f5622C != colorStateList) {
            this.f5622C = colorStateList;
            if (this.f5629F0) {
                C0354Ta.b bVar = this.f1310a;
                if (bVar.f1337d != colorStateList) {
                    bVar.f1337d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m3188H(float f) {
        if (this.f5624D != f) {
            this.f5624D = f;
            this.f5656g0.setStrokeWidth(f);
            if (this.f5629F0) {
                this.f1310a.f1343j = f;
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
    public final void m3189I(Drawable drawable) {
        ?? M2109a;
        Object obj = this.f5636M;
        if (obj != null) {
            boolean z = obj instanceof InterfaceC0886vh;
            M2109a = obj;
            if (z) {
                M2109a = ((InterfaceC0886vh) obj).m2109a();
            }
        } else {
            M2109a = 0;
        }
        if (M2109a != drawable) {
            float fM3205r = m3205r();
            this.f5636M = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.f5626E;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.f5637N = new RippleDrawable(colorStateListValueOf, this.f5636M, f5617H0);
            float fM3205r2 = m3205r();
            m3178V(M2109a);
            if (m3201U()) {
                m3202o(this.f5636M);
            }
            invalidateSelf();
            if (fM3205r != fM3205r2) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m3190J(float f) {
        if (this.f5653d0 != f) {
            this.f5653d0 = f;
            invalidateSelf();
            if (m3201U()) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m3191K(float f) {
        if (this.f5639P != f) {
            this.f5639P = f;
            invalidateSelf();
            if (m3201U()) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m3192L(float f) {
        if (this.f5652c0 != f) {
            this.f5652c0 = f;
            invalidateSelf();
            if (m3201U()) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m3193M(ColorStateList colorStateList) {
        if (this.f5638O != colorStateList) {
            this.f5638O = colorStateList;
            if (m3201U()) {
                C0893w5.a.m2176h(this.f5636M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m3194N(boolean z) {
        if (this.f5635L != z) {
            boolean zM3201U = m3201U();
            this.f5635L = z;
            boolean zM3201U2 = m3201U();
            if (zM3201U != zM3201U2) {
                if (zM3201U2) {
                    m3202o(this.f5636M);
                } else {
                    m3178V(this.f5636M);
                }
                invalidateSelf();
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m3195O(float f) {
        if (this.f5649Z != f) {
            float fM3204q = m3204q();
            this.f5649Z = f;
            float fM3204q2 = m3204q();
            invalidateSelf();
            if (fM3204q != fM3204q2) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m3196P(float f) {
        if (this.f5648Y != f) {
            float fM3204q = m3204q();
            this.f5648Y = f;
            float fM3204q2 = m3204q();
            invalidateSelf();
            if (fM3204q != fM3204q2) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m3197Q(ColorStateList colorStateList) {
        if (this.f5626E != colorStateList) {
            this.f5626E = colorStateList;
            this.f5619A0 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m3198R(C0394Ve c0394Ve) {
        C0448Ye c0448Ye = this.f5661l0;
        if (c0448Ye.f1691f != c0394Ve) {
            c0448Ye.f1691f = c0394Ve;
            if (c0394Ve != null) {
                TextPaint textPaint = c0448Ye.f1686a;
                Context context = this.f5655f0;
                C0448Ye.a aVar = c0448Ye.f1687b;
                c0394Ve.m1034f(context, textPaint, aVar);
                C0448Ye.b bVar = c0448Ye.f1690e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                c0394Ve.m1033e(context, textPaint, aVar);
                c0448Ye.f1689d = true;
            }
            C0448Ye.b bVar2 = c0448Ye.f1690e.get();
            if (bVar2 != null) {
                bVar2.mo1111a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m3199S() {
        return this.f5642S && this.f5643T != null && this.f5668s0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m3200T() {
        return this.f5630G && this.f5631H != null;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m3201U() {
        return this.f5635L && this.f5636M != null;
    }

    @Override // p000a.C0448Ye.b
    /* JADX INFO: renamed from: a */
    public final void mo1111a() {
        m3207v();
        invalidateSelf();
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f5670u0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f5629F0;
        Paint paint = this.f5656g0;
        RectF rectF = this.f5658i0;
        if (!z) {
            paint.setColor(this.f5662m0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m3206s(), m3206s(), paint);
        }
        if (!this.f5629F0) {
            paint.setColor(this.f5663n0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f5671v0;
            if (colorFilter == null) {
                colorFilter = this.f5672w0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m3206s(), m3206s(), paint);
        }
        if (this.f5629F0) {
            super.draw(canvas);
        }
        if (this.f5624D > 0.0f && !this.f5629F0) {
            paint.setColor(this.f5665p0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f5629F0) {
                ColorFilter colorFilter2 = this.f5671v0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f5672w0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f5624D / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.f5620B - (this.f5624D / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f5666q0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f5629F0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f5660k0;
            C0354Ta.b bVar = this.f1310a;
            this.f1327r.m1055a(bVar.f1334a, bVar.f1342i, rectF2, this.f1326q, path);
            m962e(canvas2, paint, path, this.f1310a.f1334a, m963g());
        } else {
            canvas2.drawRoundRect(rectF, m3206s(), m3206s(), paint);
        }
        if (m3200T()) {
            m3203p(bounds, rectF);
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas2.translate(f4, f5);
            this.f5631H.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f5631H.draw(canvas2);
            canvas2.translate(-f4, -f5);
        }
        if (m3199S()) {
            m3203p(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f5643T.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f5643T.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (this.f5625D0 && this.f5628F != null) {
            PointF pointF = this.f5659j0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f5628F;
            C0448Ye c0448Ye = this.f5661l0;
            if (charSequence != null) {
                float fM3204q = m3204q() + this.f5647X + this.f5650a0;
                if (C0893w5.b.m2178a(this) == 0) {
                    pointF.x = bounds.left + fM3204q;
                } else {
                    pointF.x = bounds.right - fM3204q;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c0448Ye.f1686a;
                Paint.FontMetrics fontMetrics = this.f5657h0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f5628F != null) {
                float fM3204q2 = m3204q() + this.f5647X + this.f5650a0;
                float fM3205r = m3205r() + this.f5654e0 + this.f5651b0;
                if (C0893w5.b.m2178a(this) == 0) {
                    rectF.left = bounds.left + fM3204q2;
                    rectF.right = bounds.right - fM3205r;
                } else {
                    rectF.left = bounds.left + fM3205r;
                    rectF.right = bounds.right - fM3204q2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C0394Ve c0394Ve = c0448Ye.f1691f;
            TextPaint textPaint2 = c0448Ye.f1686a;
            if (c0394Ve != null) {
                textPaint2.drawableState = getState();
                c0448Ye.f1691f.m1033e(this.f5655f0, textPaint2, c0448Ye.f1687b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c0448Ye.m1110a(this.f5628F.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f5628F;
            if (z2 && this.f5623C0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f5623C0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m3201U()) {
            rectF.setEmpty();
            if (m3201U()) {
                float f8 = this.f5654e0 + this.f5653d0;
                if (C0893w5.b.m2178a(this) == 0) {
                    float f9 = bounds.right - f8;
                    rectF.right = f9;
                    rectF.left = f9 - this.f5639P;
                } else {
                    float f10 = bounds.left + f8;
                    rectF.left = f10;
                    rectF.right = f10 + this.f5639P;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f11 = this.f5639P;
                float f12 = fExactCenterY - (f11 / 2.0f);
                rectF.top = f12;
                rectF.bottom = f12 + f11;
            }
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f5636M.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f5637N.setBounds(this.f5636M.getBounds());
            this.f5637N.jumpToCurrentState();
            this.f5637N.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.f5670u0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5670u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f5671v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f5618A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(m3205r() + this.f5661l0.m1110a(this.f5628F.toString()) + m3204q() + this.f5647X + this.f5650a0 + this.f5651b0 + this.f5654e0), this.f5627E0);
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f5629F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f5618A, this.f5620B);
        } else {
            outline.setRoundRect(bounds, this.f5620B);
            outline2 = outline;
        }
        outline2.setAlpha(this.f5670u0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m3179t(this.f5674y) || m3179t(this.f5676z) || m3179t(this.f5622C)) {
            return true;
        }
        C0394Ve c0394Ve = this.f5661l0.f1691f;
        if (c0394Ve == null || (colorStateList = c0394Ve.f1515j) == null || !colorStateList.isStateful()) {
            return (this.f5642S && this.f5643T != null && this.f5641R) || m3180u(this.f5631H) || m3180u(this.f5643T) || m3179t(this.f5673x0);
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m3202o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C0893w5.b.m2179b(drawable, C0893w5.b.m2178a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f5636M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f5677z0);
            }
            C0893w5.a.m2176h(drawable, this.f5638O);
            return;
        }
        Drawable drawable2 = this.f5631H;
        if (drawable == drawable2 && this.f5634K) {
            C0893w5.a.m2176h(drawable2, this.f5632I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m3200T()) {
            zOnLayoutDirectionChanged |= C0893w5.b.m2179b(this.f5631H, i);
        }
        if (m3199S()) {
            zOnLayoutDirectionChanged |= C0893w5.b.m2179b(this.f5643T, i);
        }
        if (m3201U()) {
            zOnLayoutDirectionChanged |= C0893w5.b.m2179b(this.f5636M, i);
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
        if (m3200T()) {
            zOnLevelChange |= this.f5631H.setLevel(i);
        }
        if (m3199S()) {
            zOnLevelChange |= this.f5643T.setLevel(i);
        }
        if (m3201U()) {
            zOnLevelChange |= this.f5636M.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f5629F0) {
            super.onStateChange(iArr);
        }
        return m3208w(iArr, this.f5677z0);
    }

    /* JADX INFO: renamed from: p */
    public final void m3203p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m3200T() || m3199S()) {
            float f = this.f5647X + this.f5648Y;
            Drawable drawable = this.f5668s0 ? this.f5643T : this.f5631H;
            float intrinsicWidth = this.f5633J;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (C0893w5.b.m2178a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f5668s0 ? this.f5643T : this.f5631H;
            float fCeil = this.f5633J;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f5655f0.getResources().getDisplayMetrics()));
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
    public final float m3204q() {
        if (!m3200T() && !m3199S()) {
            return 0.0f;
        }
        float f = this.f5648Y;
        Drawable drawable = this.f5668s0 ? this.f5643T : this.f5631H;
        float intrinsicWidth = this.f5633J;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f5649Z;
    }

    /* JADX INFO: renamed from: r */
    public final float m3205r() {
        if (m3201U()) {
            return this.f5652c0 + this.f5639P + this.f5653d0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: s */
    public final float m3206s() {
        return this.f5629F0 ? this.f1310a.f1334a.f1486e.mo1073a(m963g()) : this.f5620B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f5670u0 != i) {
            this.f5670u0 = i;
            invalidateSelf();
        }
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f5671v0 != colorFilter) {
            this.f5671v0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f5673x0 != colorStateList) {
            this.f5673x0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000a.C0354Ta, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f5675y0 != mode) {
            this.f5675y0 = mode;
            ColorStateList colorStateList = this.f5673x0;
            this.f5672w0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m3200T()) {
            visible |= this.f5631H.setVisible(z, z2);
        }
        if (m3199S()) {
            visible |= this.f5643T.setVisible(z, z2);
        }
        if (m3201U()) {
            visible |= this.f5636M.setVisible(z, z2);
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
    public final void m3207v() {
        a aVar = this.f5621B0.get();
        if (aVar != null) {
            aVar.mo3171a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3208w(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f5674y;
        int iM960c = m960c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f5662m0) : 0);
        boolean state = true;
        if (this.f5662m0 != iM960c) {
            this.f5662m0 = iM960c;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f5676z;
        int iM960c2 = m960c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f5663n0) : 0);
        if (this.f5663n0 != iM960c2) {
            this.f5663n0 = iM960c2;
            zOnStateChange = true;
        }
        int iM2084b = C0872v3.m2084b(iM960c2, iM960c);
        if ((this.f5664o0 != iM2084b) | (this.f1310a.f1336c == null)) {
            this.f5664o0 = iM2084b;
            m967k(ColorStateList.valueOf(iM2084b));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f5622C;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f5665p0) : 0;
        if (this.f5665p0 != colorForState2) {
            this.f5665p0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f5619A0 != null) {
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (int i : iArr) {
                if (i == 16842910) {
                    z4 = true;
                } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                z3 = true;
            }
            colorForState = z3 ? this.f5619A0.getColorForState(iArr, this.f5666q0) : 0;
        }
        if (this.f5666q0 != colorForState) {
            this.f5666q0 = colorForState;
        }
        C0394Ve c0394Ve = this.f5661l0.f1691f;
        int colorForState3 = (c0394Ve == null || (colorStateList = c0394Ve.f1515j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f5667r0);
        if (this.f5667r0 != colorForState3) {
            this.f5667r0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (state2[i2] != 16842912) {
                    i2++;
                } else if (this.f5641R) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.f5668s0 == z || this.f5643T == null) {
            z2 = false;
        } else {
            float fM3204q = m3204q();
            this.f5668s0 = z;
            if (fM3204q != m3204q()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f5673x0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f5669t0) : 0;
        if (this.f5669t0 != colorForState4) {
            this.f5669t0 = colorForState4;
            ColorStateList colorStateList6 = this.f5673x0;
            PorterDuff.Mode mode = this.f5675y0;
            this.f5672w0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m3180u(this.f5631H)) {
            state |= this.f5631H.setState(iArr);
        }
        if (m3180u(this.f5643T)) {
            state |= this.f5643T.setState(iArr);
        }
        if (m3180u(this.f5636M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f5636M.setState(iArr3);
        }
        if (m3180u(this.f5637N)) {
            state |= this.f5637N.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m3207v();
        }
        return state;
    }

    /* JADX INFO: renamed from: x */
    public final void m3209x(boolean z) {
        if (this.f5641R != z) {
            this.f5641R = z;
            float fM3204q = m3204q();
            if (!z && this.f5668s0) {
                this.f5668s0 = false;
            }
            float fM3204q2 = m3204q();
            invalidateSelf();
            if (fM3204q != fM3204q2) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3210y(Drawable drawable) {
        if (this.f5643T != drawable) {
            float fM3204q = m3204q();
            this.f5643T = drawable;
            float fM3204q2 = m3204q();
            m3178V(this.f5643T);
            m3202o(this.f5643T);
            invalidateSelf();
            if (fM3204q != fM3204q2) {
                m3207v();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m3211z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f5644U != colorStateList) {
            this.f5644U = colorStateList;
            if (this.f5642S && (drawable = this.f5643T) != null && this.f5641R) {
                C0893w5.a.m2176h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
