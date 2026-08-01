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
import androidx.appcompat.widget.C1072;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import p050.AbstractC7176;
import p191.AbstractC8568;
import p333.AbstractC9501;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4017 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public Typeface f11038;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ColorStateList f11039;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f11040;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C1072 f11041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final TimeInterpolator f11042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final TimeInterpolator f11043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final TimeInterpolator f11044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f11045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f11046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f11047;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11048;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public CharSequence f11049;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public CharSequence f11050;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f11051;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f11052;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ColorStateList f11053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f11054;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final float f11055;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f11056;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1072 f11057;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f11058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CharSequence f11059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final TextInputLayout f11060;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Context f11061;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public FrameLayout f11062;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public AnimatorSet f11063;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public LinearLayout f11064;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f11065;

    public C4017(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f11061 = context;
        this.f11060 = textInputLayout;
        this.f11055 = context.getResources().getDimensionPixelSize(C0328R.dimen.design_textinput_caption_translate_y);
        this.f11047 = AbstractC7176.m12481(context, C0328R.attr.motionDurationShort4, Opcodes.RSUB_INT_LIT8);
        this.f11046 = AbstractC7176.m12481(context, C0328R.attr.motionDurationMedium4, 167);
        this.f11045 = AbstractC7176.m12481(context, C0328R.attr.motionDurationShort4, 167);
        this.f11044 = AbstractC7176.m12482(context, C0328R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC9501.f24810);
        LinearInterpolator linearInterpolator = AbstractC9501.f24813;
        this.f11043 = AbstractC7176.m12482(context, C0328R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f11042 = AbstractC7176.m12482(context, C0328R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m7791() {
        this.f11059 = null;
        m7794();
        if (this.f11054 == 1) {
            if (!this.f11051 || TextUtils.isEmpty(this.f11050)) {
                this.f11058 = 0;
            } else {
                this.f11058 = 2;
            }
        }
        m7799(this.f11054, this.f11058, m7797(this.f11057, ""));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final TextView m7792(int i) {
        if (i == 1) {
            return this.f11057;
        }
        if (i != 2) {
            return null;
        }
        return this.f11041;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7793(ArrayList arrayList, boolean z, C1072 c1072, int i, int i2, int i3) {
        if (c1072 == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1072, (Property<C1072, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f11045;
            objectAnimatorOfFloat.setDuration(z2 ? this.f11046 : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f11043 : this.f11042);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1072, (Property<C1072, Float>) View.TRANSLATION_Y, -this.f11055, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f11047);
            objectAnimatorOfFloat2.setInterpolator(this.f11044);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7794() {
        AnimatorSet animatorSet = this.f11063;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7795() {
        if (this.f11064 != null) {
            TextInputLayout textInputLayout = this.f11060;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f11061;
                boolean zM13624 = AbstractC8568.m13624(context);
                LinearLayout linearLayout = this.f11064;
                int paddingStart = editText.getPaddingStart();
                if (zM13624) {
                    paddingStart = context.getResources().getDimensionPixelSize(C0328R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0328R.dimen.material_helper_text_default_padding_top);
                if (zM13624) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(C0328R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM13624) {
                    paddingEnd = context.getResources().getDimensionPixelSize(C0328R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7796(C1072 c1072, int i) {
        if (this.f11064 == null && this.f11062 == null) {
            Context context = this.f11061;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f11064 = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f11064;
            TextInputLayout textInputLayout = this.f11060;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f11062 = new FrameLayout(context);
            this.f11064.addView(this.f11062, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m7795();
            }
        }
        if (i == 0 || i == 1) {
            this.f11062.setVisibility(0);
            this.f11062.addView(c1072);
        } else {
            this.f11064.addView(c1072, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f11064.setVisibility(0);
        this.f11065++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m7797(C1072 c1072, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f11060;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f11058 == this.f11054 && c1072 != null && TextUtils.equals(c1072.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7798(C1072 c1072, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f11064;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f11062) != null) {
            frameLayout.removeView(c1072);
        } else {
            linearLayout.removeView(c1072);
        }
        int i2 = this.f11065 - 1;
        this.f11065 = i2;
        LinearLayout linearLayout2 = this.f11064;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7799(int i, int i2, boolean z) {
        TextView textViewM7792;
        TextView textViewM77922;
        C4017 c4017 = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            c4017.f11063 = animatorSet;
            ArrayList arrayList = new ArrayList();
            c4017.m7793(arrayList, c4017.f11051, c4017.f11041, 2, i, i2);
            c4017.m7793(arrayList, c4017.f11056, c4017.f11057, 1, i, i2);
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
            C4025 c4025 = new C4025(this, i2, m7792(i), i, c4017.m7792(i2));
            c4017 = this;
            animatorSet.addListener(c4025);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM77922 = c4017.m7792(i2)) != null) {
                textViewM77922.setVisibility(0);
                textViewM77922.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM7792 = m7792(i)) != null) {
                textViewM7792.setVisibility(4);
                if (i == 1) {
                    textViewM7792.setText((CharSequence) null);
                }
            }
            c4017.f11054 = i2;
        }
        TextInputLayout textInputLayout = c4017.f11060;
        textInputLayout.m7761();
        textInputLayout.m7763(z, false);
        textInputLayout.m7753();
    }
}
