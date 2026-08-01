package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0225;
import com.android.dx.io.Opcodes;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import p034.AbstractC6347;
import p175.AbstractC7739;
import p317.AbstractC8672;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3185 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public Typeface f10693;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ColorStateList f10694;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f10695;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C0225 f10696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final TimeInterpolator f10697;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final TimeInterpolator f10698;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final TimeInterpolator f10699;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f10700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f10701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f10702;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10703;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public CharSequence f10704;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public CharSequence f10705;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f10706;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f10707;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ColorStateList f10708;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f10709;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final float f10710;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f10711;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0225 f10712;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f10713;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CharSequence f10714;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final TextInputLayout f10715;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Context f10716;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public FrameLayout f10717;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public AnimatorSet f10718;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public LinearLayout f10719;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10720;

    public C3185(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f10716 = context;
        this.f10715 = textInputLayout;
        this.f10710 = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f10702 = AbstractC6347.m11922(context, R.attr.motionDurationShort4, Opcodes.RSUB_INT_LIT8);
        this.f10701 = AbstractC6347.m11922(context, R.attr.motionDurationMedium4, 167);
        this.f10700 = AbstractC6347.m11922(context, R.attr.motionDurationShort4, 167);
        this.f10699 = AbstractC6347.m11923(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC8672.f24465);
        LinearInterpolator linearInterpolator = AbstractC8672.f24468;
        this.f10698 = AbstractC6347.m11923(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f10697 = AbstractC6347.m11923(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7232() {
        this.f10714 = null;
        m7235();
        if (this.f10709 == 1) {
            if (!this.f10706 || TextUtils.isEmpty(this.f10705)) {
                this.f10713 = 0;
            } else {
                this.f10713 = 2;
            }
        }
        m7240(this.f10709, this.f10713, m7238(this.f10712, ""));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final TextView m7233(int i) {
        if (i == 1) {
            return this.f10712;
        }
        if (i != 2) {
            return null;
        }
        return this.f10696;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7234(ArrayList arrayList, boolean z, C0225 c0225, int i, int i2, int i3) {
        if (c0225 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0225, (Property<C0225, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f10700;
            objectAnimatorOfFloat.setDuration(z2 ? this.f10701 : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f10698 : this.f10697);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0225, (Property<C0225, Float>) View.TRANSLATION_Y, -this.f10710, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f10702);
            objectAnimatorOfFloat2.setInterpolator(this.f10699);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7235() {
        AnimatorSet animatorSet = this.f10718;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7236() {
        if (this.f10719 != null) {
            TextInputLayout textInputLayout = this.f10715;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f10716;
                boolean zM13065 = AbstractC7739.m13065(context);
                LinearLayout linearLayout = this.f10719;
                int paddingStart = editText.getPaddingStart();
                if (zM13065) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM13065) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM13065) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7237(C0225 c0225, int i) {
        if (this.f10719 == null && this.f10717 == null) {
            Context context = this.f10716;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f10719 = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f10719;
            TextInputLayout textInputLayout = this.f10715;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f10717 = new FrameLayout(context);
            this.f10719.addView(this.f10717, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m7236();
            }
        }
        if (i == 0 || i == 1) {
            this.f10717.setVisibility(0);
            this.f10717.addView(c0225);
        } else {
            this.f10719.addView(c0225, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f10719.setVisibility(0);
        this.f10720++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m7238(C0225 c0225, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f10715;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f10713 == this.f10709 && c0225 != null && TextUtils.equals(c0225.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7239(C0225 c0225, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f10719;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f10717) != null) {
            frameLayout.removeView(c0225);
        } else {
            linearLayout.removeView(c0225);
        }
        int i2 = this.f10720 - 1;
        this.f10720 = i2;
        LinearLayout linearLayout2 = this.f10719;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7240(int i, int i2, boolean z) {
        TextView textViewM7233;
        TextView textViewM72332;
        C3185 c3185 = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c3185.f10718 = animatorSet;
            ArrayList arrayList = new ArrayList();
            c3185.m7234(arrayList, c3185.f10706, c3185.f10696, 2, i, i2);
            c3185.m7234(arrayList, c3185.f10711, c3185.f10712, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            C3193 c3193 = new C3193(this, i2, m7233(i), i, c3185.m7233(i2));
            c3185 = this;
            animatorSet.addListener(c3193);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM72332 = c3185.m7233(i2)) != null) {
                textViewM72332.setVisibility(0);
                textViewM72332.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM7233 = m7233(i)) != null) {
                textViewM7233.setVisibility(4);
                if (i == 1) {
                    textViewM7233.setText((CharSequence) null);
                }
            }
            c3185.f10709 = i2;
        }
        TextInputLayout textInputLayout = c3185.f10715;
        textInputLayout.m7202();
        textInputLayout.m7204(z, false);
        textInputLayout.m7194();
    }
}
