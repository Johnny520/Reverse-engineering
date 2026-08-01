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
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.google.android.material.textfield.TextInputLayout;
import p152.AbstractC7589;
import p157.InterpolatorC7623;
import p310.C8665;
import p317.AbstractC8680;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3149 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public float f10429;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public ColorStateList f10430;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public TimeInterpolator f10431;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public TimeInterpolator f10432;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public float f10433;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public float f10434;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final TextPaint f10435;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final TextPaint f10436;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f10437;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f10438;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f10439;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int[] f10440;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10441;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public CharSequence f10442;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public CharSequence f10443;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C8665 f10445;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Typeface f10446;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public float f10447;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f10448;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f10449;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f10450;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f10451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final RectF f10454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect f10455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Rect f10456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f10457;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextInputLayout f10458;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Typeface f10459;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Typeface f10460;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Typeface f10461;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Typeface f10462;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Typeface f10463;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Typeface f10464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f10465;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f10466;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f10467;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f10468;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f10469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f10470;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ColorStateList f10473;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10474;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public ColorStateList f10476;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public CharSequence f10481;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public float f10482;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f10483;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public float f10486;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public float f10487;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public float f10488;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public float f10489;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public float f10490;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public StaticLayout f10491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10453 = 16;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f10472 = 16;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f10471 = 15.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f10475 = 15.0f;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final TextUtils.TruncateAt f10444 = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f10452 = true;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public int f10480 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public int f10479 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final float f10478 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final int f10477 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f10484 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f10485 = -1;

    public C3149(TextInputLayout textInputLayout) {
        this.f10458 = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f10435 = textPaint;
        this.f10436 = new TextPaint(textPaint);
        this.f10455 = new Rect();
        this.f10456 = new Rect();
        this.f10454 = new RectF();
        m7183(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7170(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static float m7171(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC8680.m14378(f, f2, f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m7172() {
        int i = this.f10484;
        if (i != -1) {
            return i;
        }
        float f = this.f10475;
        TextPaint textPaint = this.f10436;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f10460);
        textPaint.setLetterSpacing(this.f10487);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final StaticLayout m7173(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        StaticLayout staticLayoutM7200 = null;
        try {
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f10453, this.f10441 ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.f10441;
                    alignment = absoluteGravity != 5 ? z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : z2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            C3163 c3163 = new C3163(charSequence, textPaint, (int) f);
            c3163.f10532 = this.f10444;
            c3163.f10531 = z;
            c3163.f10523 = alignment;
            c3163.f10534 = false;
            c3163.f10522 = i;
            float f2 = this.f10478;
            c3163.f10530 = 0.0f;
            c3163.f10529 = f2;
            c3163.f10533 = this.f10477;
            c3163.f10528 = null;
            staticLayoutM7200 = c3163.m7200();
        } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        staticLayoutM7200.getClass();
        return staticLayoutM7200;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7174(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        if (this.f10443 == null) {
            return;
        }
        float fWidth = this.f10455.width();
        float fWidth2 = this.f10456.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = m7179() ? this.f10475 : this.f10471;
            f3 = m7179() ? this.f10487 : this.f10486;
            this.f10451 = m7179() ? 1.0f : m7171(this.f10471, this.f10475, f, this.f10431) / this.f10471;
            if (!m7179()) {
                fWidth = fWidth2;
            }
            typeface = this.f10460;
            fWidth2 = fWidth;
        } else {
            f2 = this.f10471;
            float f4 = this.f10486;
            typeface = this.f10464;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f10451 = 1.0f;
            } else {
                this.f10451 = m7171(this.f10471, this.f10475, f, this.f10431) / this.f10471;
            }
            float f5 = this.f10475 / this.f10471;
            float f6 = fWidth2 * f5;
            if (!z && f6 > fWidth && m7179()) {
                fWidth2 = Math.min(fWidth / f5, fWidth2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.f10480 : this.f10479;
        TextPaint textPaint = this.f10435;
        if (fWidth2 > 0.0f) {
            boolean z2 = this.f10450 != f2;
            boolean z3 = this.f10490 != f3;
            boolean z4 = this.f10446 != typeface;
            StaticLayout staticLayout = this.f10491;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.f10437 != i) || this.f10439;
            this.f10450 = f2;
            this.f10490 = f3;
            this.f10446 = typeface;
            this.f10439 = false;
            this.f10437 = i;
            textPaint.setLinearText(this.f10451 != 1.0f);
            z = z5;
        }
        if (this.f10442 == null || z) {
            textPaint.setTextSize(this.f10450);
            textPaint.setTypeface(this.f10446);
            textPaint.setLetterSpacing(this.f10490);
            boolean zM7175 = m7175(this.f10443);
            this.f10441 = zM7175;
            StaticLayout staticLayoutM7173 = m7173(((this.f10480 > 1 || this.f10479 > 1) && !zM7175) ? i : 1, textPaint, this.f10443, fWidth2 * (m7179() ? 1.0f : this.f10451), this.f10441);
            this.f10491 = staticLayoutM7173;
            this.f10442 = staticLayoutM7173.getText();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m7175(CharSequence charSequence) {
        boolean z = this.f10458.getLayoutDirection() == 1;
        if (this.f10452) {
            return (z ? AbstractC7589.f20578 : AbstractC7589.f20579).m185(charSequence.length(), charSequence);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7176() {
        float f = this.f10457;
        float f2 = this.f10456.left;
        Rect rect = this.f10455;
        float fM7171 = m7171(f2, rect.left, f, this.f10432);
        RectF rectF = this.f10454;
        rectF.left = fM7171;
        rectF.top = m7171(this.f10466, this.f10465, f, this.f10432);
        rectF.right = m7171(r1.right, rect.right, f, this.f10432);
        rectF.bottom = m7171(r1.bottom, rect.bottom, f, this.f10432);
        this.f10467 = m7171(this.f10469, this.f10470, f, this.f10432);
        this.f10468 = m7171(this.f10466, this.f10465, f, this.f10432);
        m7174(f, false);
        TextInputLayout textInputLayout = this.f10458;
        textInputLayout.postInvalidateOnAnimation();
        float f3 = this.f10487;
        float f4 = this.f10486;
        TextPaint textPaint = this.f10435;
        if (f3 != f4) {
            textPaint.setLetterSpacing(m7171(f4, f3, f, AbstractC8680.f24475));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        InterpolatorC7623 interpolatorC7623 = AbstractC8680.f24475;
        this.f10489 = 1.0f - m7171(0.0f, 1.0f, 1.0f - f, interpolatorC7623);
        textInputLayout.postInvalidateOnAnimation();
        this.f10482 = m7171(1.0f, 0.0f, f, interpolatorC7623);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f10473;
        ColorStateList colorStateList2 = this.f10476;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m7170(m7180(colorStateList2), f, m7180(this.f10473)));
        } else {
            textPaint.setColor(m7180(colorStateList));
        }
        this.f10449 = AbstractC8680.m14378(0.0f, this.f10434, f);
        this.f10448 = AbstractC8680.m14378(0.0f, this.f10433, f);
        this.f10447 = AbstractC8680.m14378(0.0f, this.f10429, f);
        int iM7170 = m7170(0, f, m7180(this.f10430));
        this.f10438 = iM7170;
        textPaint.setShadowLayer(this.f10449, this.f10448, this.f10447, iM7170);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7177(Typeface typeface) {
        boolean z;
        boolean zM7182 = m7182(typeface);
        if (this.f10462 != typeface) {
            this.f10462 = typeface;
            Typeface typefaceM1158 = AbstractC0455.m1158(this.f10458.getContext().getResources().getConfiguration(), typeface);
            this.f10461 = typefaceM1158;
            if (typefaceM1158 == null) {
                typefaceM1158 = this.f10462;
            }
            this.f10464 = typefaceM1158;
            z = true;
        } else {
            z = false;
        }
        if (zM7182 || z) {
            m7184(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7178(float r3) {
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
            float r0 = r2.f10457
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.f10457 = r3
            r2.m7176()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C3149.m7178(float):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m7179() {
        return this.f10479 == 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7180(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f10440;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7181(ColorStateList colorStateList) {
        if (this.f10473 == colorStateList && this.f10476 == colorStateList) {
            return;
        }
        this.f10473 = colorStateList;
        this.f10476 = colorStateList;
        m7184(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m7182(Typeface typeface) {
        C8665 c8665 = this.f10445;
        if (c8665 != null) {
            c8665.f24408 = true;
        }
        if (this.f10463 == typeface) {
            return false;
        }
        this.f10463 = typeface;
        Typeface typefaceM1158 = AbstractC0455.m1158(this.f10458.getContext().getResources().getConfiguration(), typeface);
        this.f10459 = typefaceM1158;
        if (typefaceM1158 == null) {
            typefaceM1158 = this.f10463;
        }
        this.f10460 = typefaceM1158;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7183(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f10463;
            if (typeface != null) {
                this.f10459 = AbstractC0455.m1158(configuration, typeface);
            }
            Typeface typeface2 = this.f10462;
            if (typeface2 != null) {
                this.f10461 = AbstractC0455.m1158(configuration, typeface2);
            }
            Typeface typeface3 = this.f10459;
            if (typeface3 == null) {
                typeface3 = this.f10463;
            }
            this.f10460 = typeface3;
            Typeface typeface4 = this.f10461;
            if (typeface4 == null) {
                typeface4 = this.f10462;
            }
            this.f10464 = typeface4;
            m7184(true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7184(boolean z) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f10458;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m7174(1.0f, z);
        CharSequence charSequence = this.f10442;
        TextPaint textPaint = this.f10435;
        if (charSequence != null && this.f10491 != null) {
            boolean zM7179 = m7179();
            CharSequence charSequenceEllipsize = this.f10442;
            if (zM7179) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, this.f10491.getWidth(), this.f10444);
            }
            this.f10481 = charSequenceEllipsize;
        }
        CharSequence charSequence2 = this.f10481;
        if (charSequence2 != null) {
            this.f10488 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f10488 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f10472, this.f10441 ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f10455;
        if (i == 48) {
            this.f10465 = rect.top;
        } else if (i != 80) {
            this.f10465 = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f10465 = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f10470 = rect.centerX() - (this.f10488 / 2.0f);
        } else if (i2 != 5) {
            this.f10470 = rect.left;
        } else {
            this.f10470 = rect.right - this.f10488;
        }
        if (this.f10488 <= rect.width()) {
            float f = this.f10470;
            float fMax = Math.max(0.0f, rect.left - f) + f;
            this.f10470 = fMax;
            this.f10470 = Math.min(0.0f, rect.right - (this.f10488 + fMax)) + fMax;
        }
        float f2 = this.f10475;
        TextPaint textPaint2 = this.f10436;
        textPaint2.setTextSize(f2);
        textPaint2.setTypeface(this.f10460);
        textPaint2.setLetterSpacing(this.f10487);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f3 = this.f10465;
            float fMax2 = Math.max(0.0f, rect.top - f3) + f3;
            this.f10465 = fMax2;
            this.f10465 = Math.min(0.0f, rect.bottom - (m7172() + fMax2)) + fMax2;
        }
        m7174(0.0f, z);
        float height = this.f10491 != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f10491;
        if (staticLayout == null || this.f10480 <= 1) {
            CharSequence charSequence3 = this.f10442;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f10491;
        this.f10474 = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f10453, this.f10441 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f10456;
        if (i3 == 48) {
            this.f10466 = rect2.top;
        } else if (i3 != 80) {
            this.f10466 = rect2.centerY() - (height / 2.0f);
        } else {
            this.f10466 = (rect2.bottom - height) + (this.f10483 ? textPaint.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f10469 = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f10469 = rect2.left;
        } else {
            this.f10469 = rect2.right - fMeasureText;
        }
        m7174(this.f10457, false);
        textInputLayout.postInvalidateOnAnimation();
        m7176();
    }
}
