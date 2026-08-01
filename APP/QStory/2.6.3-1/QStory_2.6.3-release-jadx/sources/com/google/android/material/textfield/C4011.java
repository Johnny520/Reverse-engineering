package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.compose.material.ripple.RunnableC1945;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.CheckableImageButton;
import p050.AbstractC7176;
import p333.AbstractC9501;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4011 extends AbstractC4024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f11018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f11019;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ValueAnimator f11020;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final TimeInterpolator f11021;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final TimeInterpolator f11022;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC4014 f11023;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public AnimatorSet f11024;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public EditText f11025;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ViewOnClickListenerC4015 f11026;

    public C4011(C4027 c4027) {
        super(c4027);
        this.f11026 = new ViewOnClickListenerC4015(this, 0);
        this.f11023 = new ViewOnFocusChangeListenerC4014(this, 0);
        this.f11019 = AbstractC7176.m12481(c4027.getContext(), C0328R.attr.motionDurationShort3, 100);
        this.f11018 = AbstractC7176.m12481(c4027.getContext(), C0328R.attr.motionDurationShort3, 150);
        this.f11022 = AbstractC7176.m12482(c4027.getContext(), C0328R.attr.motionEasingLinearInterpolator, AbstractC9501.f24813);
        this.f11021 = AbstractC7176.m12482(c4027.getContext(), C0328R.attr.motionEasingEmphasizedInterpolator, AbstractC9501.f24810);
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final View.OnClickListener mo7779() {
        return this.f11026;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo7780() {
        return this.f11023;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo7781() {
        return C0328R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int mo7782() {
        return C0328R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7783() {
        if (this.f11096.f11116 != null) {
            return;
        }
        m7785(m7784());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m7784() {
        EditText editText = this.f11025;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.f11094.hasFocus()) && ((this.f11025.getText().length() > 0) || (this.f11096.f11116 != null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7785(boolean z) {
        boolean z2 = this.f11096.m7820() == z;
        if (z && !this.f11024.isRunning()) {
            this.f11020.cancel();
            this.f11024.start();
            if (z2) {
                this.f11024.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f11024.cancel();
        this.f11020.start();
        if (z2) {
            this.f11020.end();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7778() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f11021);
        valueAnimatorOfFloat.setDuration(this.f11018);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C4011 f11029;

            {
                this.f11029 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                C4011 c4011 = this.f11029;
                switch (i2) {
                    case 0:
                        c4011.f11094.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c4011.f11094;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f11022;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f11019;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C4011 f11029;

            {
                this.f11029 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                C4011 c4011 = this.f11029;
                switch (i22) {
                    case 0:
                        c4011.f11094.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c4011.f11094;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f11024 = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f11024.addListener(new C4012(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C4011 f11029;

            {
                this.f11029 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                C4011 c4011 = this.f11029;
                switch (i22) {
                    case 0:
                        c4011.f11094.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c4011.f11094;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f11020 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C4012(this, i));
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo7786() {
        EditText editText = this.f11025;
        if (editText != null) {
            editText.post(new RunnableC1945(this, 5));
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo7787(boolean z) {
        if (this.f11096.f11116 == null) {
            return;
        }
        m7785(z);
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo7788() {
        return this.f11023;
    }

    @Override // com.google.android.material.textfield.AbstractC4024
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo7789(EditText editText) {
        this.f11025 = editText;
        this.f11097.setEndIconVisible(m7784());
    }
}
