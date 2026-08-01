package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.compose.material.ripple.RunnableC1107;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.CheckableImageButton;
import p034.AbstractC6347;
import p317.AbstractC8672;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3179 extends AbstractC3192 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f10673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f10674;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public ValueAnimator f10675;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final TimeInterpolator f10676;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final TimeInterpolator f10677;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ViewOnFocusChangeListenerC3182 f10678;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public AnimatorSet f10679;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public EditText f10680;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ViewOnClickListenerC3183 f10681;

    public C3179(C3195 c3195) {
        super(c3195);
        this.f10681 = new ViewOnClickListenerC3183(this, 0);
        this.f10678 = new ViewOnFocusChangeListenerC3182(this, 0);
        this.f10674 = AbstractC6347.m11922(c3195.getContext(), R.attr.motionDurationShort3, 100);
        this.f10673 = AbstractC6347.m11922(c3195.getContext(), R.attr.motionDurationShort3, 150);
        this.f10677 = AbstractC6347.m11923(c3195.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC8672.f24468);
        this.f10676 = AbstractC6347.m11923(c3195.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC8672.f24465);
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final View.OnClickListener mo7220() {
        return this.f10681;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo7221() {
        return this.f10678;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo7222() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int mo7223() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7224() {
        if (this.f10751.f10771 != null) {
            return;
        }
        m7226(m7225());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m7225() {
        EditText editText = this.f10680;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.f10749.hasFocus()) && ((this.f10680.getText().length() > 0) || (this.f10751.f10771 != null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7226(boolean z) {
        boolean z2 = this.f10751.m7261() == z;
        if (z && !this.f10679.isRunning()) {
            this.f10675.cancel();
            this.f10679.start();
            if (z2) {
                this.f10679.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f10679.cancel();
        this.f10675.start();
        if (z2) {
            this.f10675.end();
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo7219() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f10676);
        valueAnimatorOfFloat.setDuration(this.f10673);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C3179 f10684;

            {
                this.f10684 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                C3179 c3179 = this.f10684;
                switch (i2) {
                    case 0:
                        c3179.f10749.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c3179.f10749;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f10677;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f10674;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C3179 f10684;

            {
                this.f10684 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                C3179 c3179 = this.f10684;
                switch (i22) {
                    case 0:
                        c3179.f10749.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c3179.f10749;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f10679 = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f10679.addListener(new C3180(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.material.textfield.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
            public final /* synthetic */ C3179 f10684;

            {
                this.f10684 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                C3179 c3179 = this.f10684;
                switch (i22) {
                    case 0:
                        c3179.f10749.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c3179.f10749;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f10675 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C3180(this, i));
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo7227() {
        EditText editText = this.f10680;
        if (editText != null) {
            editText.post(new RunnableC1107(this, 5));
        }
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo7228(boolean z) {
        if (this.f10751.f10771 == null) {
            return;
        }
        m7226(z);
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View.OnFocusChangeListener mo7229() {
        return this.f10678;
    }

    @Override // com.google.android.material.textfield.AbstractC3192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo7230(EditText editText) {
        this.f10680 = editText;
        this.f10752.setEndIconVisible(m7225());
    }
}
