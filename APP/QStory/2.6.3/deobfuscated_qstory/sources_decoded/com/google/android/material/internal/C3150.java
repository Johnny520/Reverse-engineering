package com.google.android.material.internal;

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
import android.util.Log;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;
import p152.AbstractC7590;
import p157.InterpolatorC7624;
import p253.AbstractC8190;
import p310.C8657;
import p317.AbstractC8672;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3150 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public float f10434;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public ColorStateList f10435;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public TimeInterpolator f10436;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public TimeInterpolator f10437;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public float f10438;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public float f10439;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final TextPaint f10440;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final TextPaint f10441;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f10442;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f10443;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f10444;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int[] f10445;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10446;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public CharSequence f10447;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public CharSequence f10448;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C8657 f10450;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Typeface f10451;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public float f10452;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f10453;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f10454;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f10455;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f10456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final RectF f10459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect f10460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Rect f10461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f10462;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextInputLayout f10463;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Typeface f10464;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Typeface f10465;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Typeface f10466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Typeface f10467;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Typeface f10468;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Typeface f10469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f10470;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f10471;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f10472;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f10473;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f10474;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f10475;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ColorStateList f10478;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10479;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public ColorStateList f10481;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public CharSequence f10486;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public float f10487;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f10488;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public float f10491;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public float f10492;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public float f10493;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public float f10494;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public float f10495;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public StaticLayout f10496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10458 = 16;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f10477 = 16;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f10476 = 15.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f10480 = 15.0f;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final TextUtils.TruncateAt f10449 = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f10457 = true;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public int f10485 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public int f10484 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final float f10483 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final int f10482 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f10489 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f10490 = -1;

    public C3150(TextInputLayout textInputLayout) {
        this.f10463 = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f10440 = textPaint;
        this.f10441 = new TextPaint(textPaint);
        this.f10460 = new Rect();
        this.f10461 = new Rect();
        this.f10459 = new RectF();
        m7170(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7157(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static float m7158(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC8672.m14398(f, f2, f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m7159() {
        int i = this.f10489;
        if (i != -1) {
            return i;
        }
        float f = this.f10480;
        TextPaint textPaint = this.f10441;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f10465);
        textPaint.setLetterSpacing(this.f10492);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final StaticLayout m7160(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        StaticLayout staticLayoutM7187 = null;
        try {
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f10458, this.f10446 ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.f10446;
                    alignment = absoluteGravity != 5 ? z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : z2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            C3164 c3164 = new C3164(charSequence, textPaint, (int) f);
            c3164.f10537 = this.f10449;
            c3164.f10536 = z;
            c3164.f10528 = alignment;
            c3164.f10539 = false;
            c3164.f10527 = i;
            float f2 = this.f10483;
            c3164.f10535 = 0.0f;
            c3164.f10534 = f2;
            c3164.f10538 = this.f10482;
            c3164.f10533 = null;
            staticLayoutM7187 = c3164.m7187();
        } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        staticLayoutM7187.getClass();
        return staticLayoutM7187;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7161(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        if (this.f10448 == null) {
            return;
        }
        float fWidth = this.f10460.width();
        float fWidth2 = this.f10461.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = m7166() ? this.f10480 : this.f10476;
            f3 = m7166() ? this.f10492 : this.f10491;
            this.f10456 = m7166() ? 1.0f : m7158(this.f10476, this.f10480, f, this.f10436) / this.f10476;
            if (!m7166()) {
                fWidth = fWidth2;
            }
            typeface = this.f10465;
            fWidth2 = fWidth;
        } else {
            f2 = this.f10476;
            float f4 = this.f10491;
            typeface = this.f10469;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f10456 = 1.0f;
            } else {
                this.f10456 = m7158(this.f10476, this.f10480, f, this.f10436) / this.f10476;
            }
            float f5 = this.f10480 / this.f10476;
            float f6 = fWidth2 * f5;
            if (!z && f6 > fWidth && m7166()) {
                fWidth2 = Math.min(fWidth / f5, fWidth2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.f10485 : this.f10484;
        TextPaint textPaint = this.f10440;
        if (fWidth2 > 0.0f) {
            boolean z2 = this.f10455 != f2;
            boolean z3 = this.f10495 != f3;
            boolean z4 = this.f10451 != typeface;
            StaticLayout staticLayout = this.f10496;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.f10442 != i) || this.f10444;
            this.f10455 = f2;
            this.f10495 = f3;
            this.f10451 = typeface;
            this.f10444 = false;
            this.f10442 = i;
            textPaint.setLinearText(this.f10456 != 1.0f);
            z = z5;
        }
        if (this.f10447 == null || z) {
            textPaint.setTextSize(this.f10455);
            textPaint.setTypeface(this.f10451);
            textPaint.setLetterSpacing(this.f10495);
            boolean zM7162 = m7162(this.f10448);
            this.f10446 = zM7162;
            StaticLayout staticLayoutM7160 = m7160(((this.f10485 > 1 || this.f10484 > 1) && !zM7162) ? i : 1, textPaint, this.f10448, fWidth2 * (m7166() ? 1.0f : this.f10456), this.f10446);
            this.f10496 = staticLayoutM7160;
            this.f10447 = staticLayoutM7160.getText();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m7162(CharSequence charSequence) {
        boolean z = this.f10463.getLayoutDirection() == 1;
        if (this.f10457) {
            return (z ? AbstractC7590.f20573 : AbstractC7590.f20574).m186(charSequence.length(), charSequence);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7163() {
        float f = this.f10462;
        float f2 = this.f10461.left;
        Rect rect = this.f10460;
        float fM7158 = m7158(f2, rect.left, f, this.f10437);
        RectF rectF = this.f10459;
        rectF.left = fM7158;
        rectF.top = m7158(this.f10471, this.f10470, f, this.f10437);
        rectF.right = m7158(r1.right, rect.right, f, this.f10437);
        rectF.bottom = m7158(r1.bottom, rect.bottom, f, this.f10437);
        this.f10472 = m7158(this.f10474, this.f10475, f, this.f10437);
        this.f10473 = m7158(this.f10471, this.f10470, f, this.f10437);
        m7161(f, false);
        TextInputLayout textInputLayout = this.f10463;
        textInputLayout.postInvalidateOnAnimation();
        float f3 = this.f10492;
        float f4 = this.f10491;
        TextPaint textPaint = this.f10440;
        if (f3 != f4) {
            textPaint.setLetterSpacing(m7158(f4, f3, f, AbstractC8672.f24467));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        InterpolatorC7624 interpolatorC7624 = AbstractC8672.f24467;
        this.f10494 = 1.0f - m7158(0.0f, 1.0f, 1.0f - f, interpolatorC7624);
        textInputLayout.postInvalidateOnAnimation();
        this.f10487 = m7158(1.0f, 0.0f, f, interpolatorC7624);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f10478;
        ColorStateList colorStateList2 = this.f10481;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m7157(m7167(colorStateList2), f, m7167(this.f10478)));
        } else {
            textPaint.setColor(m7167(colorStateList));
        }
        this.f10454 = AbstractC8672.m14398(0.0f, this.f10439, f);
        this.f10453 = AbstractC8672.m14398(0.0f, this.f10438, f);
        this.f10452 = AbstractC8672.m14398(0.0f, this.f10434, f);
        int iM7157 = m7157(0, f, m7167(this.f10435));
        this.f10443 = iM7157;
        textPaint.setShadowLayer(this.f10454, this.f10453, this.f10452, iM7157);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7164(Typeface typeface) {
        boolean z;
        boolean zM7169 = m7169(typeface);
        if (this.f10467 != typeface) {
            this.f10467 = typeface;
            Typeface typefaceM13691 = AbstractC8190.m13691(this.f10463.getContext().getResources().getConfiguration(), typeface);
            this.f10466 = typefaceM13691;
            if (typefaceM13691 == null) {
                typefaceM13691 = this.f10467;
            }
            this.f10469 = typefaceM13691;
            z = true;
        } else {
            z = false;
        }
        if (zM7169 || z) {
            m7171(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7165(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.f10462
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.f10462 = r3
            r2.m7163()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C3150.m7165(float):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m7166() {
        return this.f10484 == 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7167(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f10445;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7168(ColorStateList colorStateList) {
        if (this.f10478 == colorStateList && this.f10481 == colorStateList) {
            return;
        }
        this.f10478 = colorStateList;
        this.f10481 = colorStateList;
        m7171(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m7169(Typeface typeface) {
        C8657 c8657 = this.f10450;
        if (c8657 != null) {
            c8657.f24401 = true;
        }
        if (this.f10468 == typeface) {
            return false;
        }
        this.f10468 = typeface;
        Typeface typefaceM13691 = AbstractC8190.m13691(this.f10463.getContext().getResources().getConfiguration(), typeface);
        this.f10464 = typefaceM13691;
        if (typefaceM13691 == null) {
            typefaceM13691 = this.f10468;
        }
        this.f10465 = typefaceM13691;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7170(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f10468;
            if (typeface != null) {
                this.f10464 = AbstractC8190.m13691(configuration, typeface);
            }
            Typeface typeface2 = this.f10467;
            if (typeface2 != null) {
                this.f10466 = AbstractC8190.m13691(configuration, typeface2);
            }
            Typeface typeface3 = this.f10464;
            if (typeface3 == null) {
                typeface3 = this.f10468;
            }
            this.f10465 = typeface3;
            Typeface typeface4 = this.f10466;
            if (typeface4 == null) {
                typeface4 = this.f10467;
            }
            this.f10469 = typeface4;
            m7171(true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7171(boolean z) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f10463;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m7161(1.0f, z);
        CharSequence charSequence = this.f10447;
        TextPaint textPaint = this.f10440;
        if (charSequence != null && this.f10496 != null) {
            boolean zM7166 = m7166();
            CharSequence charSequenceEllipsize = this.f10447;
            if (zM7166) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, this.f10496.getWidth(), this.f10449);
            }
            this.f10486 = charSequenceEllipsize;
        }
        CharSequence charSequence2 = this.f10486;
        if (charSequence2 != null) {
            this.f10493 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f10493 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f10477, this.f10446 ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f10460;
        if (i == 48) {
            this.f10470 = rect.top;
        } else if (i != 80) {
            this.f10470 = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f10470 = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f10475 = rect.centerX() - (this.f10493 / 2.0f);
        } else if (i2 != 5) {
            this.f10475 = rect.left;
        } else {
            this.f10475 = rect.right - this.f10493;
        }
        if (this.f10493 <= rect.width()) {
            float f = this.f10475;
            float fMax = Math.max(0.0f, rect.left - f) + f;
            this.f10475 = fMax;
            this.f10475 = Math.min(0.0f, rect.right - (this.f10493 + fMax)) + fMax;
        }
        float f2 = this.f10480;
        TextPaint textPaint2 = this.f10441;
        textPaint2.setTextSize(f2);
        textPaint2.setTypeface(this.f10465);
        textPaint2.setLetterSpacing(this.f10492);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f3 = this.f10470;
            float fMax2 = Math.max(0.0f, rect.top - f3) + f3;
            this.f10470 = fMax2;
            this.f10470 = Math.min(0.0f, rect.bottom - (m7159() + fMax2)) + fMax2;
        }
        m7161(0.0f, z);
        float height = this.f10496 != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f10496;
        if (staticLayout == null || this.f10485 <= 1) {
            CharSequence charSequence3 = this.f10447;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f10496;
        this.f10479 = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f10458, this.f10446 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f10461;
        if (i3 == 48) {
            this.f10471 = rect2.top;
        } else if (i3 != 80) {
            this.f10471 = rect2.centerY() - (height / 2.0f);
        } else {
            this.f10471 = (rect2.bottom - height) + (this.f10488 ? textPaint.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f10474 = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f10474 = rect2.left;
        } else {
            this.f10474 = rect2.right - fMeasureText;
        }
        m7161(this.f10462, false);
        textInputLayout.postInvalidateOnAnimation();
        m7163();
    }
}
