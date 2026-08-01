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
import p175.AbstractC7738;
import p253.AbstractC8189;
import p317.AbstractC8680;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3184 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public Typeface f10688;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ColorStateList f10689;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f10690;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C0225 f10691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final TimeInterpolator f10692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final TimeInterpolator f10693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final TimeInterpolator f10694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f10695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f10696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f10697;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10698;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public CharSequence f10699;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public CharSequence f10700;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f10701;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f10702;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ColorStateList f10703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f10704;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final float f10705;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f10706;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0225 f10707;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f10708;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CharSequence f10709;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final TextInputLayout f10710;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Context f10711;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public FrameLayout f10712;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public AnimatorSet f10713;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public LinearLayout f10714;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f10715;

    public C3184(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f10711 = context;
        this.f10710 = textInputLayout;
        this.f10705 = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f10697 = AbstractC7738.m13024(context, R.attr.motionDurationShort4, Opcodes.RSUB_INT_LIT8);
        this.f10696 = AbstractC7738.m13024(context, R.attr.motionDurationMedium4, 167);
        this.f10695 = AbstractC7738.m13024(context, R.attr.motionDurationShort4, 167);
        this.f10694 = AbstractC7738.m13027(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC8680.f24473);
        LinearInterpolator linearInterpolator = AbstractC8680.f24476;
        this.f10693 = AbstractC7738.m13027(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f10692 = AbstractC7738.m13027(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7245() {
        this.f10709 = null;
        m7248();
        if (this.f10704 == 1) {
            if (!this.f10701 || TextUtils.isEmpty(this.f10700)) {
                this.f10708 = 0;
            } else {
                this.f10708 = 2;
            }
        }
        m7253(this.f10704, this.f10708, m7251(this.f10707, ""));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final TextView m7246(int i) {
        if (i == 1) {
            return this.f10707;
        }
        if (i != 2) {
            return null;
        }
        return this.f10691;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7247(ArrayList arrayList, boolean z, C0225 c0225, int i, int i2, int i3) {
        if (c0225 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0225, (Property<C0225, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f10695;
            objectAnimatorOfFloat.setDuration(z2 ? this.f10696 : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f10693 : this.f10692);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c0225, (Property<C0225, Float>) View.TRANSLATION_Y, -this.f10705, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f10697);
            objectAnimatorOfFloat2.setInterpolator(this.f10694);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7248() {
        AnimatorSet animatorSet = this.f10713;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7249() {
        if (this.f10714 != null) {
            TextInputLayout textInputLayout = this.f10710;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f10711;
                boolean zM13674 = AbstractC8189.m13674(context);
                LinearLayout linearLayout = this.f10714;
                int paddingStart = editText.getPaddingStart();
                if (zM13674) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM13674) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM13674) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7250(C0225 c0225, int i) {
        if (this.f10714 == null && this.f10712 == null) {
            Context context = this.f10711;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f10714 = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f10714;
            TextInputLayout textInputLayout = this.f10710;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f10712 = new FrameLayout(context);
            this.f10714.addView(this.f10712, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m7249();
            }
        }
        if (i == 0 || i == 1) {
            this.f10712.setVisibility(0);
            this.f10712.addView(c0225);
        } else {
            this.f10714.addView(c0225, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f10714.setVisibility(0);
        this.f10715++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m7251(C0225 c0225, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f10710;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f10708 == this.f10704 && c0225 != null && TextUtils.equals(c0225.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7252(C0225 c0225, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f10714;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f10712) != null) {
            frameLayout.removeView(c0225);
        } else {
            linearLayout.removeView(c0225);
        }
        int i2 = this.f10715 - 1;
        this.f10715 = i2;
        LinearLayout linearLayout2 = this.f10714;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7253(int i, int i2, boolean z) {
        TextView textViewM7246;
        TextView textViewM72462;
        C3184 c3184 = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c3184.f10713 = animatorSet;
            ArrayList arrayList = new ArrayList();
            c3184.m7247(arrayList, c3184.f10701, c3184.f10691, 2, i, i2);
            c3184.m7247(arrayList, c3184.f10706, c3184.f10707, 1, i, i2);
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
            C3192 c3192 = new C3192(this, i2, m7246(i), i, c3184.m7246(i2));
            c3184 = this;
            animatorSet.addListener(c3192);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM72462 = c3184.m7246(i2)) != null) {
                textViewM72462.setVisibility(0);
                textViewM72462.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM7246 = m7246(i)) != null) {
                textViewM7246.setVisibility(4);
                if (i == 1) {
                    textViewM7246.setText((CharSequence) null);
                }
            }
            c3184.f10704 = i2;
        }
        TextInputLayout textInputLayout = c3184.f10710;
        textInputLayout.m7215();
        textInputLayout.m7217(z, false);
        textInputLayout.m7207();
    }
}
