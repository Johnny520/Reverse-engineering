package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ua extends defpackage.fj {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public final android.animation.TimeInterpolator h;
    public android.widget.EditText i;
    public final defpackage.qa j;
    public final defpackage.ra k;
    public android.animation.AnimatorSet l;
    public android.animation.ValueAnimator m;

    public ua(defpackage.ej r4) {
            r3 = this;
            r3.<init>(r4)
            qa r0 = new qa
            r1 = 0
            r0.<init>(r1, r3)
            r3.j = r0
            ra r0 = new ra
            r0.<init>(r3, r1)
            r3.k = r0
            android.content.Context r0 = r4.getContext()
            r1 = 100
            r2 = 2130969344(0x7f040300, float:1.7547367E38)
            int r0 = defpackage.ct.v(r0, r2, r1)
            r3.e = r0
            android.content.Context r0 = r4.getContext()
            r1 = 150(0x96, float:2.1E-43)
            int r0 = defpackage.ct.v(r0, r2, r1)
            r3.f = r0
            android.content.Context r0 = r4.getContext()
            r1 = 2130969353(0x7f040309, float:1.7547385E38)
            android.view.animation.LinearInterpolator r2 = defpackage.q2.a
            android.animation.TimeInterpolator r0 = defpackage.ct.w(r0, r1, r2)
            r3.g = r0
            android.content.Context r4 = r4.getContext()
            r0 = 2130969351(0x7f040307, float:1.7547381E38)
            tj r1 = defpackage.q2.d
            android.animation.TimeInterpolator r4 = defpackage.ct.w(r4, r0, r1)
            r3.h = r4
            return
    }

    @Override // defpackage.fj
    public final void a() {
            r1 = this;
            ej r0 = r1.b
            java.lang.CharSequence r0 = r0.p
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r1.t()
            r1.s(r0)
            return
    }

    @Override // defpackage.fj
    public final int c() {
            r1 = this;
            r0 = 2131755047(0x7f100027, float:1.9140962E38)
            return r0
    }

    @Override // defpackage.fj
    public final int d() {
            r1 = this;
            r0 = 2131230906(0x7f0800ba, float:1.8077878E38)
            return r0
    }

    @Override // defpackage.fj
    public final android.view.View.OnFocusChangeListener e() {
            r1 = this;
            ra r0 = r1.k
            return r0
    }

    @Override // defpackage.fj
    public final android.view.View.OnClickListener f() {
            r1 = this;
            qa r0 = r1.j
            return r0
    }

    @Override // defpackage.fj
    public final android.view.View.OnFocusChangeListener g() {
            r1 = this;
            ra r0 = r1.k
            return r0
    }

    @Override // defpackage.fj
    public final void l(android.widget.EditText r2) {
            r1 = this;
            r1.i = r2
            com.google.android.material.textfield.TextInputLayout r2 = r1.a
            boolean r0 = r1.t()
            r2.setEndIconVisible(r0)
            return
    }

    @Override // defpackage.fj
    public final void o(boolean r2) {
            r1 = this;
            ej r0 = r1.b
            java.lang.CharSequence r0 = r0.p
            if (r0 != 0) goto L7
            return
        L7:
            r1.s(r2)
            return
    }

    @Override // defpackage.fj
    public final void q() {
            r9 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0078: FILL_ARRAY_DATA , data: [1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            android.animation.TimeInterpolator r2 = r9.h
            r1.setInterpolator(r2)
            int r2 = r9.f
            long r2 = (long) r2
            r1.setDuration(r2)
            sa r2 = new sa
            r3 = 1
            r2.<init>(r9, r3)
            r1.addUpdateListener(r2)
            float[] r2 = new float[r0]
            r2 = {x0080: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.animation.TimeInterpolator r4 = r9.g
            r2.setInterpolator(r4)
            int r5 = r9.e
            long r6 = (long) r5
            r2.setDuration(r6)
            sa r6 = new sa
            r7 = 0
            r6.<init>(r9, r7)
            r2.addUpdateListener(r6)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            r9.l = r6
            android.animation.Animator[] r8 = new android.animation.Animator[r0]
            r8[r7] = r1
            r8[r3] = r2
            r6.playTogether(r8)
            android.animation.AnimatorSet r1 = r9.l
            ta r2 = new ta
            r2.<init>(r9, r7)
            r1.addListener(r2)
            float[] r0 = new float[r0]
            r0 = {x0088: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r0.setInterpolator(r4)
            long r1 = (long) r5
            r0.setDuration(r1)
            sa r1 = new sa
            r1.<init>(r9, r7)
            r0.addUpdateListener(r1)
            r9.m = r0
            ta r1 = new ta
            r1.<init>(r9, r3)
            r0.addListener(r1)
            return
    }

    @Override // defpackage.fj
    public final void r() {
            r3 = this;
            android.widget.EditText r0 = r3.i
            if (r0 == 0) goto Ld
            p1 r1 = new p1
            r2 = 2
            r1.<init>(r2, r3)
            r0.post(r1)
        Ld:
            return
    }

    public final void s(boolean r3) {
            r2 = this;
            ej r0 = r2.b
            boolean r0 = r0.d()
            if (r0 != r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r3 == 0) goto L27
            android.animation.AnimatorSet r1 = r2.l
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L27
            android.animation.ValueAnimator r3 = r2.m
            r3.cancel()
            android.animation.AnimatorSet r3 = r2.l
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.AnimatorSet r3 = r2.l
            r3.end()
            return
        L27:
            if (r3 != 0) goto L3a
            android.animation.AnimatorSet r3 = r2.l
            r3.cancel()
            android.animation.ValueAnimator r3 = r2.m
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.ValueAnimator r3 = r2.m
            r3.end()
        L3a:
            return
    }

    public final boolean t() {
            r1 = this;
            android.widget.EditText r0 = r1.i
            if (r0 == 0) goto L20
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L12
            com.google.android.material.internal.CheckableImageButton r0 = r1.d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L20
        L12:
            android.widget.EditText r0 = r1.i
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L20
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }
}
