package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: N9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0569N9 extends AbstractC1221bg {

    /* JADX INFO: renamed from: e */
    public final int f1853e;

    /* JADX INFO: renamed from: f */
    public final int f1854f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f1855g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f1856h;

    /* JADX INFO: renamed from: i */
    public EditText f1857i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC1477h f1858j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC0440K9 f1859k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f1860l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f1861m;

    public C0569N9(C1141ag c1141ag) {
        super(c1141ag);
        this.f1858j = new ViewOnClickListenerC1477h(3, this);
        this.f1859k = new ViewOnFocusChangeListenerC0440K9(this, 0);
        this.f1853e = AbstractC0714Qj.m1473D(c1141ag.getContext(), R.attr.motionDurationShort3, 100);
        this.f1854f = AbstractC0714Qj.m1473D(c1141ag.getContext(), R.attr.motionDurationShort3, 150);
        this.f1855g = AbstractC0714Qj.m1474E(c1141ag.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0776S2.f2453a);
        this.f1856h = AbstractC0714Qj.m1474E(c1141ag.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2456d);
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: a */
    public final void mo946a() {
        if (this.f4174b.f3621p != null) {
            return;
        }
        m1114s(m1115t());
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: c */
    public final int mo947c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: d */
    public final int mo948d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo949e() {
        return this.f1859k;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo950f() {
        return this.f1858j;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo1112g() {
        return this.f1859k;
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: l */
    public final void mo954l(EditText editText) {
        this.f1857i = editText;
        this.f4173a.setEndIconVisible(m1115t());
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: o */
    public final void mo1113o(boolean z) {
        if (this.f4174b.f3621p == null) {
            return;
        }
        m1114s(z);
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: q */
    public final void mo957q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f1856h);
        valueAnimatorOfFloat.setDuration(this.f1854f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0569N9 f1586b;

            {
                this.f1586b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0569N9 c0569n9 = this.f1586b;
                        c0569n9.getClass();
                        c0569n9.f4176d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0569N9 c0569n92 = this.f1586b;
                        c0569n92.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0569n92.f4176d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1855g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f1853e;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0569N9 f1586b;

            {
                this.f1586b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0569N9 c0569n9 = this.f1586b;
                        c0569n9.getClass();
                        c0569n9.f4176d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0569N9 c0569n92 = this.f1586b;
                        c0569n92.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0569n92.f4176d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1860l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f1860l.addListener(new C0526M9(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L9

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0569N9 f1586b;

            {
                this.f1586b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0569N9 c0569n9 = this.f1586b;
                        c0569n9.getClass();
                        c0569n9.f4176d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0569N9 c0569n92 = this.f1586b;
                        c0569n92.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0569n92.f4176d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f1861m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0526M9(this, i));
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: r */
    public final void mo958r() {
        EditText editText = this.f1857i;
        if (editText != null) {
            editText.post(new RunnableC0562N2(5, this));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1114s(boolean z) {
        boolean z2 = this.f4174b.m2061d() == z;
        if (z && !this.f1860l.isRunning()) {
            this.f1861m.cancel();
            this.f1860l.start();
            if (z2) {
                this.f1860l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f1860l.cancel();
        this.f1861m.start();
        if (z2) {
            this.f1861m.end();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1115t() {
        EditText editText = this.f1857i;
        if (editText != null) {
            return (editText.hasFocus() || this.f4176d.hasFocus()) && this.f1857i.getText().length() > 0;
        }
        return false;
    }
}
