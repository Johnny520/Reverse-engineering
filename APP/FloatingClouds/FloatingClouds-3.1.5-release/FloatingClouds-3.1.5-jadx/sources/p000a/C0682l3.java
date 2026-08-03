package p000a;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.C1247R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C1318a;

/* JADX INFO: renamed from: a.l3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0682l3 extends AbstractC0514c6 {

    /* JADX INFO: renamed from: e */
    public final int f2535e;

    /* JADX INFO: renamed from: f */
    public final int f2536f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f2537g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f2538h;

    /* JADX INFO: renamed from: i */
    public EditText f2539i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC0606h3 f2540j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC0625i3 f2541k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f2542l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f2543m;

    public C0682l3(C1318a c1318a) {
        super(c1318a);
        this.f2540j = new ViewOnClickListenerC0606h3(0, this);
        this.f2541k = new ViewOnFocusChangeListenerC0625i3(this, 0);
        this.f2535e = C0899wb.m2187c(c1318a.getContext(), C1247R.attr.motionDurationShort3, 100);
        this.f2536f = C0899wb.m2187c(c1318a.getContext(), C1247R.attr.motionDurationShort3, 150);
        this.f2537g = C0899wb.m2188d(c1318a.getContext(), C1247R.attr.motionEasingLinearInterpolator, C0888w0.f3468a);
        this.f2538h = C0899wb.m2188d(c1318a.getContext(), C1247R.attr.motionEasingEmphasizedInterpolator, C0888w0.f3471d);
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: a */
    public final void mo261a() {
        if (this.f1876b.f5979p != null) {
            return;
        }
        m1548t(m1549u());
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: c */
    public final int mo262c() {
        return C1247R.string.clear_text_end_icon_content_description;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: d */
    public final int mo263d() {
        return C1247R.drawable.mtrl_ic_cancel;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo264e() {
        return this.f2541k;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo265f() {
        return this.f2540j;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo1266g() {
        return this.f2541k;
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: m */
    public final void mo270m(EditText editText) {
        this.f2539i = editText;
        this.f1875a.setEndIconVisible(m1549u());
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: p */
    public final void mo1268p(boolean z) {
        if (this.f1876b.f5979p == null) {
            return;
        }
        m1548t(z);
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: r */
    public final void mo155r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f2538h);
        valueAnimatorOfFloat.setDuration(this.f2536f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.j3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0682l3 f2364b;

            {
                this.f2364b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0682l3 c0682l3 = this.f2364b;
                        c0682l3.getClass();
                        c0682l3.f1878d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0682l3 c0682l32 = this.f2364b;
                        c0682l32.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0682l32.f1878d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2537g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f2535e;
        valueAnimatorOfFloat2.setDuration(i3);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.j3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0682l3 f2364b;

            {
                this.f2364b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0682l3 c0682l3 = this.f2364b;
                        c0682l3.getClass();
                        c0682l3.f1878d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0682l3 c0682l32 = this.f2364b;
                        c0682l32.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0682l32.f1878d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2542l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f2542l.addListener(new C0663k3(this, i2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i3);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a.j3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0682l3 f2364b;

            {
                this.f2364b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0682l3 c0682l3 = this.f2364b;
                        c0682l3.getClass();
                        c0682l3.f1878d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0682l3 c0682l32 = this.f2364b;
                        c0682l32.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0682l32.f1878d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f2543m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0663k3(this, i));
    }

    @Override // p000a.AbstractC0514c6
    /* JADX INFO: renamed from: s */
    public final void mo273s() {
        EditText editText = this.f2539i;
        if (editText != null) {
            editText.post(new RunnableC0221M2(1, this));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m1548t(boolean z) {
        boolean z2 = this.f1876b.m3285d() == z;
        if (z && !this.f2542l.isRunning()) {
            this.f2543m.cancel();
            this.f2542l.start();
            if (z2) {
                this.f2542l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f2542l.cancel();
        this.f2543m.start();
        if (z2) {
            this.f2543m.end();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1549u() {
        EditText editText = this.f2539i;
        if (editText != null) {
            return (editText.hasFocus() || this.f1878d.hasFocus()) && this.f2539i.getText().length() > 0;
        }
        return false;
    }
}
