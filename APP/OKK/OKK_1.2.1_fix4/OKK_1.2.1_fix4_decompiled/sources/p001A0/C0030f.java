package p001A0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import org.luckypray.dexkit.C1031R;
import p056f0.AbstractC0805P;
import p060h0.AbstractC0945a;

/* JADX INFO: renamed from: A0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0030f extends AbstractC0046v {

    /* JADX INFO: renamed from: e */
    public final int f74e;

    /* JADX INFO: renamed from: f */
    public final int f75f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f76g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f77h;

    /* JADX INFO: renamed from: i */
    public EditText f78i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC0025a f79j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC0026b f80k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f81l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f82m;

    public C0030f(C0045u c0045u) {
        super(c0045u);
        this.f79j = new ViewOnClickListenerC0025a(0, this);
        this.f80k = new ViewOnFocusChangeListenerC0026b(this, 0);
        this.f74e = AbstractC0805P.m2038R(c0045u.getContext(), C1031R.attr.motionDurationShort3, 100);
        this.f75f = AbstractC0805P.m2038R(c0045u.getContext(), C1031R.attr.motionDurationShort3, 150);
        this.f76g = AbstractC0805P.m2039S(c0045u.getContext(), C1031R.attr.motionEasingLinearInterpolator, AbstractC0945a.f3354a);
        this.f77h = AbstractC0805P.m2039S(c0045u.getContext(), C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3357d);
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: a */
    public final void mo57a() {
        if (this.f139b.f131p != null) {
            return;
        }
        m67t(m68u());
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: c */
    public final int mo58c() {
        return C1031R.string.clear_text_end_icon_content_description;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: d */
    public final int mo59d() {
        return C1031R.drawable.mtrl_ic_cancel;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo60e() {
        return this.f80k;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo61f() {
        return this.f79j;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo62g() {
        return this.f80k;
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: m */
    public final void mo63m(EditText editText) {
        this.f78i = editText;
        this.f138a.setEndIconVisible(m68u());
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: p */
    public final void mo64p(boolean z2) {
        if (this.f139b.f131p == null) {
            return;
        }
        m67t(z2);
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: r */
    public final void mo65r() {
        final int i2 = 1;
        final int i3 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f77h);
        valueAnimatorOfFloat.setDuration(this.f75f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: A0.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0030f f69b;

            {
                this.f69b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0030f c0030f = this.f69b;
                        c0030f.getClass();
                        c0030f.f141d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0030f c0030f2 = this.f69b;
                        c0030f2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0030f2.f141d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f76g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i4 = this.f74e;
        valueAnimatorOfFloat2.setDuration(i4);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: A0.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0030f f69b;

            {
                this.f69b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0030f c0030f = this.f69b;
                        c0030f.getClass();
                        c0030f.f141d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0030f c0030f2 = this.f69b;
                        c0030f2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0030f2.f141d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f81l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f81l.addListener(new C0029e(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i4);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: A0.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0030f f69b;

            {
                this.f69b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0030f c0030f = this.f69b;
                        c0030f.getClass();
                        c0030f.f141d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0030f c0030f2 = this.f69b;
                        c0030f2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0030f2.f141d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f82m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0029e(this, i2));
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: s */
    public final void mo66s() {
        EditText editText = this.f78i;
        if (editText != null) {
            editText.post(new RunnableC0028d(0, this));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m67t(boolean z2) {
        boolean z3 = this.f139b.m143d() == z2;
        if (z2 && !this.f81l.isRunning()) {
            this.f82m.cancel();
            this.f81l.start();
            if (z3) {
                this.f81l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f81l.cancel();
        this.f82m.start();
        if (z3) {
            this.f82m.end();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m68u() {
        EditText editText = this.f78i;
        return editText != null && (editText.hasFocus() || this.f141d.hasFocus()) && this.f78i.getText().length() > 0;
    }
}
