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
import p168.AbstractC8419;
import p173.InterpolatorC8453;
import p269.AbstractC9019;
import p326.C9486;
import p333.AbstractC9501;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3982 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public float f10779;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public ColorStateList f10780;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public TimeInterpolator f10781;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public TimeInterpolator f10782;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public float f10783;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public float f10784;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final TextPaint f10785;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final TextPaint f10786;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f10787;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f10788;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f10789;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public int[] f10790;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10791;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public CharSequence f10792;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public CharSequence f10793;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C9486 f10795;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Typeface f10796;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public float f10797;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public float f10798;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public float f10799;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f10800;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f10801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final RectF f10804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect f10805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Rect f10806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f10807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextInputLayout f10808;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Typeface f10809;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Typeface f10810;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Typeface f10811;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Typeface f10812;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Typeface f10813;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Typeface f10814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f10815;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f10816;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f10817;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f10818;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f10819;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f10820;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public ColorStateList f10823;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10824;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public ColorStateList f10826;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public CharSequence f10831;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public float f10832;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f10833;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public float f10836;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public float f10837;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public float f10838;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public float f10839;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public float f10840;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public StaticLayout f10841;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10803 = 16;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f10822 = 16;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f10821 = 15.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f10825 = 15.0f;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final TextUtils.TruncateAt f10794 = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f10802 = true;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public int f10830 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public int f10829 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final float f10828 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final int f10827 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f10834 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f10835 = -1;

    public C3982(TextInputLayout textInputLayout) {
        this.f10808 = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f10785 = textPaint;
        this.f10786 = new TextPaint(textPaint);
        this.f10805 = new Rect();
        this.f10806 = new Rect();
        this.f10804 = new RectF();
        m7729(textInputLayout.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7716(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static float m7717(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AbstractC9501.m14957(f, f2, f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m7718() {
        int i = this.f10834;
        if (i != -1) {
            return i;
        }
        float f = this.f10825;
        TextPaint textPaint = this.f10786;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.f10810);
        textPaint.setLetterSpacing(this.f10837);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final StaticLayout m7719(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        StaticLayout staticLayoutM7746 = null;
        try {
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f10803, this.f10791 ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.f10791;
                    alignment = absoluteGravity != 5 ? z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : z2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            C3996 c3996 = new C3996(charSequence, textPaint, (int) f);
            c3996.f10882 = this.f10794;
            c3996.f10881 = z;
            c3996.f10873 = alignment;
            c3996.f10884 = false;
            c3996.f10872 = i;
            float f2 = this.f10828;
            c3996.f10880 = 0.0f;
            c3996.f10879 = f2;
            c3996.f10883 = this.f10827;
            c3996.f10878 = null;
            staticLayoutM7746 = c3996.m7746();
        } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        staticLayoutM7746.getClass();
        return staticLayoutM7746;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7720(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        if (this.f10793 == null) {
            return;
        }
        float fWidth = this.f10805.width();
        float fWidth2 = this.f10806.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = m7725() ? this.f10825 : this.f10821;
            f3 = m7725() ? this.f10837 : this.f10836;
            this.f10801 = m7725() ? 1.0f : m7717(this.f10821, this.f10825, f, this.f10781) / this.f10821;
            if (!m7725()) {
                fWidth = fWidth2;
            }
            typeface = this.f10810;
            fWidth2 = fWidth;
        } else {
            f2 = this.f10821;
            float f4 = this.f10836;
            typeface = this.f10814;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f10801 = 1.0f;
            } else {
                this.f10801 = m7717(this.f10821, this.f10825, f, this.f10781) / this.f10821;
            }
            float f5 = this.f10825 / this.f10821;
            float f6 = fWidth2 * f5;
            if (!z && f6 > fWidth && m7725()) {
                fWidth2 = Math.min(fWidth / f5, fWidth2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.f10830 : this.f10829;
        TextPaint textPaint = this.f10785;
        if (fWidth2 > 0.0f) {
            boolean z2 = this.f10800 != f2;
            boolean z3 = this.f10840 != f3;
            boolean z4 = this.f10796 != typeface;
            StaticLayout staticLayout = this.f10841;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.f10787 != i) || this.f10789;
            this.f10800 = f2;
            this.f10840 = f3;
            this.f10796 = typeface;
            this.f10789 = false;
            this.f10787 = i;
            textPaint.setLinearText(this.f10801 != 1.0f);
            z = z5;
        }
        if (this.f10792 == null || z) {
            textPaint.setTextSize(this.f10800);
            textPaint.setTypeface(this.f10796);
            textPaint.setLetterSpacing(this.f10840);
            boolean zM7721 = m7721(this.f10793);
            this.f10791 = zM7721;
            StaticLayout staticLayoutM7719 = m7719(((this.f10830 > 1 || this.f10829 > 1) && !zM7721) ? i : 1, textPaint, this.f10793, fWidth2 * (m7725() ? 1.0f : this.f10801), this.f10791);
            this.f10841 = staticLayoutM7719;
            this.f10792 = staticLayoutM7719.getText();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m7721(CharSequence charSequence) {
        boolean z = this.f10808.getLayoutDirection() == 1;
        if (this.f10802) {
            return (z ? AbstractC8419.f20918 : AbstractC8419.f20919).m746(charSequence.length(), charSequence);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7722() {
        float f = this.f10807;
        float f2 = this.f10806.left;
        Rect rect = this.f10805;
        float fM7717 = m7717(f2, rect.left, f, this.f10782);
        RectF rectF = this.f10804;
        rectF.left = fM7717;
        rectF.top = m7717(this.f10816, this.f10815, f, this.f10782);
        rectF.right = m7717(r1.right, rect.right, f, this.f10782);
        rectF.bottom = m7717(r1.bottom, rect.bottom, f, this.f10782);
        this.f10817 = m7717(this.f10819, this.f10820, f, this.f10782);
        this.f10818 = m7717(this.f10816, this.f10815, f, this.f10782);
        m7720(f, false);
        TextInputLayout textInputLayout = this.f10808;
        textInputLayout.postInvalidateOnAnimation();
        float f3 = this.f10837;
        float f4 = this.f10836;
        TextPaint textPaint = this.f10785;
        if (f3 != f4) {
            textPaint.setLetterSpacing(m7717(f4, f3, f, AbstractC9501.f24812));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        InterpolatorC8453 interpolatorC8453 = AbstractC9501.f24812;
        this.f10839 = 1.0f - m7717(0.0f, 1.0f, 1.0f - f, interpolatorC8453);
        textInputLayout.postInvalidateOnAnimation();
        this.f10832 = m7717(1.0f, 0.0f, f, interpolatorC8453);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f10823;
        ColorStateList colorStateList2 = this.f10826;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m7716(m7726(colorStateList2), f, m7726(this.f10823)));
        } else {
            textPaint.setColor(m7726(colorStateList));
        }
        this.f10799 = AbstractC9501.m14957(0.0f, this.f10784, f);
        this.f10798 = AbstractC9501.m14957(0.0f, this.f10783, f);
        this.f10797 = AbstractC9501.m14957(0.0f, this.f10779, f);
        int iM7716 = m7716(0, f, m7726(this.f10780));
        this.f10788 = iM7716;
        textPaint.setShadowLayer(this.f10799, this.f10798, this.f10797, iM7716);
        textInputLayout.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m7723(Typeface typeface) {
        boolean z;
        boolean zM7728 = m7728(typeface);
        if (this.f10812 != typeface) {
            this.f10812 = typeface;
            Typeface typefaceM14250 = AbstractC9019.m14250(this.f10808.getContext().getResources().getConfiguration(), typeface);
            this.f10811 = typefaceM14250;
            if (typefaceM14250 == null) {
                typefaceM14250 = this.f10812;
            }
            this.f10814 = typefaceM14250;
            z = true;
        } else {
            z = false;
        }
        if (zM7728 || z) {
            m7730(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7724(float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
            }
        }
        if (f != this.f10807) {
            this.f10807 = f;
            m7722();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m7725() {
        return this.f10829 == 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7726(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f10790;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7727(ColorStateList colorStateList) {
        if (this.f10823 == colorStateList && this.f10826 == colorStateList) {
            return;
        }
        this.f10823 = colorStateList;
        this.f10826 = colorStateList;
        m7730(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m7728(Typeface typeface) {
        C9486 c9486 = this.f10795;
        if (c9486 != null) {
            c9486.f24746 = true;
        }
        if (this.f10813 == typeface) {
            return false;
        }
        this.f10813 = typeface;
        Typeface typefaceM14250 = AbstractC9019.m14250(this.f10808.getContext().getResources().getConfiguration(), typeface);
        this.f10809 = typefaceM14250;
        if (typefaceM14250 == null) {
            typefaceM14250 = this.f10813;
        }
        this.f10810 = typefaceM14250;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7729(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f10813;
            if (typeface != null) {
                this.f10809 = AbstractC9019.m14250(configuration, typeface);
            }
            Typeface typeface2 = this.f10812;
            if (typeface2 != null) {
                this.f10811 = AbstractC9019.m14250(configuration, typeface2);
            }
            Typeface typeface3 = this.f10809;
            if (typeface3 == null) {
                typeface3 = this.f10813;
            }
            this.f10810 = typeface3;
            Typeface typeface4 = this.f10811;
            if (typeface4 == null) {
                typeface4 = this.f10812;
            }
            this.f10814 = typeface4;
            m7730(true);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7730(boolean z) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f10808;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        m7720(1.0f, z);
        CharSequence charSequence = this.f10792;
        TextPaint textPaint = this.f10785;
        if (charSequence != null && this.f10841 != null) {
            boolean zM7725 = m7725();
            CharSequence charSequenceEllipsize = this.f10792;
            if (zM7725) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, this.f10841.getWidth(), this.f10794);
            }
            this.f10831 = charSequenceEllipsize;
        }
        CharSequence charSequence2 = this.f10831;
        if (charSequence2 != null) {
            this.f10838 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f10838 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f10822, this.f10791 ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f10805;
        if (i == 48) {
            this.f10815 = rect.top;
        } else if (i != 80) {
            this.f10815 = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f10815 = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f10820 = rect.centerX() - (this.f10838 / 2.0f);
        } else if (i2 != 5) {
            this.f10820 = rect.left;
        } else {
            this.f10820 = rect.right - this.f10838;
        }
        if (this.f10838 <= rect.width()) {
            float f = this.f10820;
            float fMax = Math.max(0.0f, rect.left - f) + f;
            this.f10820 = fMax;
            this.f10820 = Math.min(0.0f, rect.right - (this.f10838 + fMax)) + fMax;
        }
        float f2 = this.f10825;
        TextPaint textPaint2 = this.f10786;
        textPaint2.setTextSize(f2);
        textPaint2.setTypeface(this.f10810);
        textPaint2.setLetterSpacing(this.f10837);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f3 = this.f10815;
            float fMax2 = Math.max(0.0f, rect.top - f3) + f3;
            this.f10815 = fMax2;
            this.f10815 = Math.min(0.0f, rect.bottom - (m7718() + fMax2)) + fMax2;
        }
        m7720(0.0f, z);
        float height = this.f10841 != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f10841;
        if (staticLayout == null || this.f10830 <= 1) {
            CharSequence charSequence3 = this.f10792;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f10841;
        this.f10824 = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f10803, this.f10791 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f10806;
        if (i3 == 48) {
            this.f10816 = rect2.top;
        } else if (i3 != 80) {
            this.f10816 = rect2.centerY() - (height / 2.0f);
        } else {
            this.f10816 = (rect2.bottom - height) + (this.f10833 ? textPaint.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f10819 = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f10819 = rect2.left;
        } else {
            this.f10819 = rect2.right - fMeasureText;
        }
        m7720(this.f10807, false);
        textInputLayout.postInvalidateOnAnimation();
        m7722();
    }
}
