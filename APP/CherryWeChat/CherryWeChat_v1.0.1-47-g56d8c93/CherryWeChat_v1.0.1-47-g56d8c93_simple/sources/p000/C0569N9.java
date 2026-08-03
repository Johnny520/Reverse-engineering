package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
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

    public C0569N9(C1141ag r4) {
        super(r4);
        this.f1858j = new ViewOnClickListenerC1477h(3, this);
        this.f1859k = new ViewOnFocusChangeListenerC0440K9(this, 0);
        this.f1853e = AbstractC0714Qj.m1473D(r4.getContext(), R.attr.motionDurationShort3, 100);
        this.f1854f = AbstractC0714Qj.m1473D(r4.getContext(), R.attr.motionDurationShort3, 150);
        this.f1855g = AbstractC0714Qj.m1474E(r4.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0776S2.f2453a);
        this.f1856h = AbstractC0714Qj.m1474E(r4.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2456d);
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: a */
    public final void mo946a() {
        if (this.f4174b.f3621p == null) goto L5;
        return;
    L5:
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
    public final void mo954l(EditText r2) {
        this.f1857i = r2;
        this.f4173a.setEndIconVisible(m1115t());
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: o */
    public final void mo1113o(boolean r2) {
        if (this.f4174b.f3621p != null) goto L5;
        return;
    L5:
        m1114s(r2);
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: q */
    public final void mo957q() {
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        r1.setInterpolator(this.f1856h);
        r1.setDuration(this.f1854f);
        final int r3 = 1;
        r1.addUpdateListener(new C0483L9(this, r3));
        ValueAnimator r2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator r4 = this.f1855g;
        r2.setInterpolator(r4);
        int r5 = this.f1853e;
        r2.setDuration(r5);
        final int r7 = 0;
        r2.addUpdateListener(new C0483L9(this, r7));
        AnimatorSet r6 = new AnimatorSet();
        this.f1860l = r6;
        r6.playTogether(new Animator[]{r1, r2});
        this.f1860l.addListener(new C0526M9(this, r7));
        ValueAnimator r0 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r0.setInterpolator(r4);
        r0.setDuration(r5);
        r0.addUpdateListener(new C0483L9(this, r7));
        this.f1861m = r0;
        r0.addListener(new C0526M9(this, r3));
    }

    @Override // p000.AbstractC1221bg
    /* JADX INFO: renamed from: r */
    public final void mo958r() {
        EditText r0 = this.f1857i;
        if (r0 == null) goto L6;
        r0.post(new RunnableC0562N2(5, this));
        return;
    }

    /* JADX INFO: renamed from: s */
    public final void m1114s(boolean r3) {
        if (this.f4174b.m2061d() != r3) goto L5;
        boolean r0 = true;
    L6:
        if (r3 == true) goto L8;
    L13:
        if (r3 == true) goto L19;
        this.f1860l.cancel();
        this.f1861m.start();
        if (r0 == false) goto L20;
        this.f1861m.end();
        return;
    L20:
        return;
    L19:
        return;
    L8:
        if (this.f1860l.isRunning() == true) goto L13;
        this.f1861m.cancel();
        this.f1860l.start();
        if (r0 == false) goto L18;
        this.f1860l.end();
        return;
    L18:
        return;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1115t() {
        EditText r0 = this.f1857i;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.hasFocus() == true) goto L9;
        if (this.f4176d.hasFocus() == true) goto L9;
        return false;
    L9:
        if (this.f1857i.getText().length() <= 0) goto L15;
        return true;
    L15:
        return false;
    }
}
