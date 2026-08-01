package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.compose.material.ripple.RunnableC1107;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.CheckableImageButton;
import p175.AbstractC7738;
import p317.AbstractC8680;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3178 extends AbstractC3191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f10668;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f10669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ValueAnimator f10670;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final TimeInterpolator f10671;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final TimeInterpolator f10672;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC3181 f10673;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public AnimatorSet f10674;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public EditText f10675;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ViewOnClickListenerC3182 f10676;

    public C3178(C3194 c3194) {
        super(c3194);
        this.f10676 = new ViewOnClickListenerC3182(this, 0);
        this.f10673 = new ViewOnFocusChangeListenerC3181(this, 0);
        this.f10669 = AbstractC7738.m13024(c3194.getContext(), R.attr.motionDurationShort3, 100);
        this.f10668 = AbstractC7738.m13024(c3194.getContext(), R.attr.motionDurationShort3, 150);
        this.f10672 = AbstractC7738.m13027(c3194.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC8680.f24476);
        this.f10671 = AbstractC7738.m13027(c3194.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8680.f24473);
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final View.OnClickListener mo7233() {
        return this.f10676;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo7234() {
        return this.f10673;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo7235() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int mo7236() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7237() {
        if (this.f10746.f10766 != null) {
            return;
        }
        m7239(m7238());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m7238() {
        EditText editText = this.f10675;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.f10744.hasFocus()) && ((this.f10675.getText().length() > 0) || (this.f10746.f10766 != null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7239(boolean z) {
        boolean z2 = this.f10746.m7274() == z;
        if (z && !this.f10674.isRunning()) {
            this.f10670.cancel();
            this.f10674.start();
            if (z2) {
                this.f10674.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f10674.cancel();
        this.f10670.start();
        if (z2) {
            this.f10670.end();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7232() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f10671);
        valueAnimatorOfFloat.setDuration(this.f10668);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C3178 f10679;

            {
                this.f10679 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                C3178 c3178 = this.f10679;
                switch (i2) {
                    case 0:
                        c3178.f10744.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c3178.f10744;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f10672;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f10669;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C3178 f10679;

            {
                this.f10679 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                C3178 c3178 = this.f10679;
                switch (i22) {
                    case 0:
                        c3178.f10744.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c3178.f10744;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f10674 = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f10674.addListener(new C3179(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C3178 f10679;

            {
                this.f10679 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                C3178 c3178 = this.f10679;
                switch (i22) {
                    case 0:
                        c3178.f10744.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c3178.f10744;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f10670 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C3179(this, i));
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo7240() {
        EditText editText = this.f10675;
        if (editText != null) {
            editText.post(new RunnableC1107(this, 5));
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo7241(boolean z) {
        if (this.f10746.f10766 == null) {
            return;
        }
        m7239(z);
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo7242() {
        return this.f10673;
    }

    @Override // com.google.android.material.textfield.AbstractC3191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo7243(EditText editText) {
        this.f10675 = editText;
        this.f10747.setEndIconVisible(m7238());
    }
}
