package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.internal.CheckableImageButton;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: cb */
/* JADX INFO: loaded from: classes.dex */
public final class C0098cb extends AbstractC0300hj {

    /* JADX INFO: renamed from: e */
    public final int f861e;

    /* JADX INFO: renamed from: f */
    public final int f862f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f863g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f864h;

    /* JADX INFO: renamed from: i */
    public EditText f865i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC0923ya f866j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC0960za f867k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f868l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f869m;

    public C0098cb(C0263gj c0263gj) {
        super(c0263gj);
        this.f866j = new ViewOnClickListenerC0923ya(0, this);
        this.f867k = new ViewOnFocusChangeListenerC0960za(this, 0);
        this.f861e = AbstractC0274gu.m1302E(c0263gj.getContext(), R.attr.motionDurationShort3, 100);
        this.f862f = AbstractC0274gu.m1302E(c0263gj.getContext(), R.attr.motionDurationShort3, 150);
        this.f863g = AbstractC0274gu.m1303F(c0263gj.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0618q2.f3770a);
        this.f864h = AbstractC0274gu.m1303F(c0263gj.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0618q2.f3773d);
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: a */
    public final void mo598a() {
        if (this.f2229b.f2012p != null) {
            return;
        }
        m608s(m609t());
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: c */
    public final int mo599c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: d */
    public final int mo600d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo601e() {
        return this.f867k;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo602f() {
        return this.f866j;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo603g() {
        return this.f867k;
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: l */
    public final void mo604l(EditText editText) {
        this.f865i = editText;
        this.f2228a.setEndIconVisible(m609t());
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: o */
    public final void mo605o(boolean z) {
        if (this.f2229b.f2012p == null) {
            return;
        }
        m608s(z);
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: q */
    public final void mo606q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f864h);
        valueAnimatorOfFloat.setDuration(this.f862f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ab

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0098cb f62b;

            {
                this.f62b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case Base64.DEFAULT /* 0 */:
                        C0098cb c0098cb = this.f62b;
                        c0098cb.getClass();
                        c0098cb.f2231d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0098cb c0098cb2 = this.f62b;
                        c0098cb2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0098cb2.f2231d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f863g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f861e;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ab

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0098cb f62b;

            {
                this.f62b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case Base64.DEFAULT /* 0 */:
                        C0098cb c0098cb = this.f62b;
                        c0098cb.getClass();
                        c0098cb.f2231d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0098cb c0098cb2 = this.f62b;
                        c0098cb2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0098cb2.f2231d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f868l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f868l.addListener(new C0062bb(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ab

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0098cb f62b;

            {
                this.f62b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case Base64.DEFAULT /* 0 */:
                        C0098cb c0098cb = this.f62b;
                        c0098cb.getClass();
                        c0098cb.f2231d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0098cb c0098cb2 = this.f62b;
                        c0098cb2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0098cb2.f2231d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f869m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0062bb(this, i));
    }

    @Override // p000.AbstractC0300hj
    /* JADX INFO: renamed from: r */
    public final void mo607r() {
        EditText editText = this.f865i;
        if (editText != null) {
            editText.post(new RunnableC0884x8(1, this));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m608s(boolean z) {
        boolean z2 = this.f2229b.m1286d() == z;
        if (z && !this.f868l.isRunning()) {
            this.f869m.cancel();
            this.f868l.start();
            if (z2) {
                this.f868l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f868l.cancel();
        this.f869m.start();
        if (z2) {
            this.f869m.end();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m609t() {
        EditText editText = this.f865i;
        if (editText != null) {
            return (editText.hasFocus() || this.f2231d.hasFocus()) && this.f865i.getText().length() > 0;
        }
        return false;
    }
}
