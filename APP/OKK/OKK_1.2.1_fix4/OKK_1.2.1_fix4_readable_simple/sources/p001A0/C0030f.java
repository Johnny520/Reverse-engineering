package p001A0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.abc.core.runtime.AbstractC0805P;
import org.luckypray.dexkit.C1031R;
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

    public C0030f(C0045u r4) {
        super(r4);
        this.f79j = new ViewOnClickListenerC0025a(0, this);
        this.f80k = new ViewOnFocusChangeListenerC0026b(this, 0);
        this.f74e = AbstractC0805P.m2038R(r4.getContext(), C1031R.attr.motionDurationShort3, 100);
        this.f75f = AbstractC0805P.m2038R(r4.getContext(), C1031R.attr.motionDurationShort3, 150);
        this.f76g = AbstractC0805P.m2039S(r4.getContext(), C1031R.attr.motionEasingLinearInterpolator, AbstractC0945a.f3354a);
        this.f77h = AbstractC0805P.m2039S(r4.getContext(), C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3357d);
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: a */
    public final void mo57a() {
        if (this.f139b.f131p == null) goto L5;
        return;
    L5:
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
    public final void mo63m(EditText r2) {
        this.f78i = r2;
        this.f138a.setEndIconVisible(m68u());
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: p */
    public final void mo64p(boolean r2) {
        if (this.f139b.f131p != null) goto L5;
        return;
    L5:
        m67t(r2);
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: r */
    public final void mo65r() {
        final int r02 = 1;
        final int r1 = 0;
        ValueAnimator r3 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        r3.setInterpolator(this.f77h);
        r3.setDuration(this.f75f);
        r3.addUpdateListener(new C0027c(this, r02));
        ValueAnimator r4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator r5 = this.f76g;
        r4.setInterpolator(r5);
        int r6 = this.f74e;
        r4.setDuration(r6);
        r4.addUpdateListener(new C0027c(this, r1));
        AnimatorSet r7 = new AnimatorSet();
        this.f81l = r7;
        r7.playTogether(new Animator[]{r3, r4});
        this.f81l.addListener(new C0029e(this, r1));
        ValueAnimator r2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r2.setInterpolator(r5);
        r2.setDuration(r6);
        r2.addUpdateListener(new C0027c(this, r1));
        this.f82m = r2;
        r2.addListener(new C0029e(this, r02));
    }

    @Override // p001A0.AbstractC0046v
    /* JADX INFO: renamed from: s */
    public final void mo66s() {
        EditText r02 = this.f78i;
        if (r02 == null) goto L6;
        r02.post(new RunnableC0028d(0, this));
        return;
    }

    /* JADX INFO: renamed from: t */
    public final void m67t(boolean r3) {
        if (this.f139b.m143d() != r3) goto L5;
        boolean r02 = true;
    L6:
        if (r3 == true) goto L8;
    L12:
        if (r3 == true) goto L19;
        this.f81l.cancel();
        this.f82m.start();
        if (r02 == false) goto L20;
        this.f82m.end();
        return;
    L20:
        return;
    L19:
        return;
    L8:
        if (this.f81l.isRunning() == true) goto L12;
        this.f82m.cancel();
        this.f81l.start();
        if (r02 == false) goto L17;
        this.f81l.end();
        return;
    L17:
        return;
    L5:
        r02 = false;
        goto L6
    }

    /* JADX INFO: renamed from: u */
    public final boolean m68u() {
        EditText r02 = this.f78i;
        if (r02 != null) goto L5;
    L11:
        return false;
    L5:
        if (r02.hasFocus() == true) goto L9;
        if (this.f141d.hasFocus() == false) goto L11;
    L9:
        if (this.f78i.getText().length() <= 0) goto L11;
        return true;
    }
}
