package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class ua extends fj {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final qa j;
    public final ra k;
    public AnimatorSet l;
    public ValueAnimator m;

    public ua(ej r4) {
        super(r4);
        this.j = new qa(0, this);
        this.k = new ra(this, 0);
        this.e = ct.v(r4.getContext(), R.attr.motionDurationShort3, 100);
        this.f = ct.v(r4.getContext(), R.attr.motionDurationShort3, 150);
        this.g = ct.w(r4.getContext(), R.attr.motionEasingLinearInterpolator, q2.a);
        this.h = ct.w(r4.getContext(), R.attr.motionEasingEmphasizedInterpolator, q2.d);
    }

    @Override // defpackage.fj
    public final void a() {
        if (this.b.p == null) goto L5;
        return;
    L5:
        s(t());
    }

    @Override // defpackage.fj
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.fj
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.fj
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.fj
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.fj
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.fj
    public final void l(EditText r2) {
        this.i = r2;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.fj
    public final void o(boolean r2) {
        if (this.b.p != null) goto L5;
        return;
    L5:
        s(r2);
    }

    @Override // defpackage.fj
    public final void q() {
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        r1.setInterpolator(this.h);
        r1.setDuration(this.f);
        final int r3 = 1;
        r1.addUpdateListener(new sa(this, r3));
        ValueAnimator r2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator r4 = this.g;
        r2.setInterpolator(r4);
        int r5 = this.e;
        r2.setDuration(r5);
        final int r7 = 0;
        r2.addUpdateListener(new sa(this, r7));
        AnimatorSet r6 = new AnimatorSet();
        this.l = r6;
        r6.playTogether(new Animator[]{r1, r2});
        this.l.addListener(new ta(this, r7));
        ValueAnimator r0 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r0.setInterpolator(r4);
        r0.setDuration(r5);
        r0.addUpdateListener(new sa(this, r7));
        this.m = r0;
        r0.addListener(new ta(this, r3));
    }

    @Override // defpackage.fj
    public final void r() {
        EditText r0 = this.i;
        if (r0 == null) goto L6;
        r0.post(new p1(2, this));
        return;
    }

    public final void s(boolean r3) {
        if (this.b.d() != r3) goto L5;
        boolean r0 = true;
    L6:
        if (r3 == true) goto L8;
    L13:
        if (r3 == true) goto L19;
        this.l.cancel();
        this.m.start();
        if (r0 == false) goto L20;
        this.m.end();
        return;
    L20:
        return;
    L19:
        return;
    L8:
        if (this.l.isRunning() == true) goto L13;
        this.m.cancel();
        this.l.start();
        if (r0 == false) goto L18;
        this.l.end();
        return;
    L18:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final boolean t() {
        EditText r0 = this.i;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.hasFocus() == true) goto L9;
        if (this.d.hasFocus() == true) goto L9;
        return false;
    L9:
        if (this.i.getText().length() <= 0) goto L15;
        return true;
    L15:
        return false;
    }
}
