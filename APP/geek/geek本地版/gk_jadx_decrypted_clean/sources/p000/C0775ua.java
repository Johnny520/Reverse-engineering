package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.internal.CheckableImageButton;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: ua */
/* JADX INFO: loaded from: classes.dex */
public final class C0775ua extends AbstractC0226fj {

    /* JADX INFO: renamed from: e */
    public final int f4699e;

    /* JADX INFO: renamed from: f */
    public final int f4700f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f4701g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f4702h;

    /* JADX INFO: renamed from: i */
    public EditText f4703i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC0627qa f4704j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC0664ra f4705k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f4706l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f4707m;

    public C0775ua(C0189ej c0189ej) {
        super(c0189ej);
        this.f4704j = new ViewOnClickListenerC0627qa(0, this);
        this.f4705k = new ViewOnFocusChangeListenerC0664ra(this, 0);
        this.f4699e = AbstractC0126ct.m824v(c0189ej.getContext(), R.attr.motionDurationShort3, 100);
        this.f4700f = AbstractC0126ct.m824v(c0189ej.getContext(), R.attr.motionDurationShort3, 150);
        this.f4701g = AbstractC0126ct.m825w(c0189ej.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0619q2.f3971a);
        this.f4702h = AbstractC0126ct.m825w(c0189ej.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0619q2.f3974d);
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: a */
    public final void mo1213a() {
        if (this.f1970b.f1801p != null) {
            return;
        }
        m2432s(m2433t());
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: c */
    public final int mo1215c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: d */
    public final int mo1216d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo1217e() {
        return this.f4705k;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo1218f() {
        return this.f4704j;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo1219g() {
        return this.f4705k;
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: l */
    public final void mo1224l(EditText editText) {
        this.f4703i = editText;
        this.f1969a.setEndIconVisible(m2433t());
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: o */
    public final void mo1227o(boolean z) {
        if (this.f1970b.f1801p == null) {
            return;
        }
        m2432s(z);
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: q */
    public final void mo1229q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f4702h);
        valueAnimatorOfFloat.setDuration(this.f4700f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: sa

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0775ua f4407b;

            {
                this.f4407b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case Base64.DEFAULT /* 0 */:
                        C0775ua c0775ua = this.f4407b;
                        c0775ua.getClass();
                        c0775ua.f1972d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0775ua c0775ua2 = this.f4407b;
                        c0775ua2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0775ua2.f1972d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f4701g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f4699e;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: sa

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0775ua f4407b;

            {
                this.f4407b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case Base64.DEFAULT /* 0 */:
                        C0775ua c0775ua = this.f4407b;
                        c0775ua.getClass();
                        c0775ua.f1972d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0775ua c0775ua2 = this.f4407b;
                        c0775ua2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0775ua2.f1972d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4706l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f4706l.addListener(new C0738ta(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: sa

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0775ua f4407b;

            {
                this.f4407b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case Base64.DEFAULT /* 0 */:
                        C0775ua c0775ua = this.f4407b;
                        c0775ua.getClass();
                        c0775ua.f1972d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0775ua c0775ua2 = this.f4407b;
                        c0775ua2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0775ua2.f1972d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f4707m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0738ta(this, i));
    }

    @Override // p000.AbstractC0226fj
    /* JADX INFO: renamed from: r */
    public final void mo1230r() {
        EditText editText = this.f4703i;
        if (editText != null) {
            editText.post(new RunnableC0581p1(2, this));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2432s(boolean z) {
        boolean z2 = this.f1970b.m1038d() == z;
        if (z && !this.f4706l.isRunning()) {
            this.f4707m.cancel();
            this.f4706l.start();
            if (z2) {
                this.f4706l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f4706l.cancel();
        this.f4707m.start();
        if (z2) {
            this.f4707m.end();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2433t() {
        EditText editText = this.f4703i;
        if (editText != null) {
            return (editText.hasFocus() || this.f1972d.hasFocus()) && this.f4703i.getText().length() > 0;
        }
        return false;
    }
}
