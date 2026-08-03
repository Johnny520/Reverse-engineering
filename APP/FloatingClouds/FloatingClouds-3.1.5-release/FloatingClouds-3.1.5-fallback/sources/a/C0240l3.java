package a;

/* JADX INFO: renamed from: a.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0240l3 extends a.AbstractC0082c6 {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public final android.animation.TimeInterpolator h;
    public android.widget.EditText i;
    public final a.ViewOnClickListenerC0169h3 j;
    public final a.ViewOnFocusChangeListenerC0187i3 k;
    public android.animation.AnimatorSet l;
    public android.animation.ValueAnimator m;

    public C0240l3(com.google.android.material.textfield.a r4) {
            r3 = this;
            r3.<init>(r4)
            a.h3 r0 = new a.h3
            r1 = 0
            r0.<init>(r1, r3)
            r3.j = r0
            a.i3 r0 = new a.i3
            r0.<init>(r3, r1)
            r3.k = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationShort3
            r2 = 100
            int r0 = a.C0445wb.c(r0, r1, r2)
            r3.e = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationShort3
            r2 = 150(0x96, float:2.1E-43)
            int r0 = a.C0445wb.c(r0, r1, r2)
            r3.f = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.view.animation.LinearInterpolator r2 = a.C0434w0.f744a
            android.animation.TimeInterpolator r0 = a.C0445wb.d(r0, r1, r2)
            r3.g = r0
            android.content.Context r4 = r4.getContext()
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            a.l6 r1 = a.C0434w0.d
            android.animation.TimeInterpolator r4 = a.C0445wb.d(r4, r0, r1)
            r3.h = r4
            return
    }

    @Override // a.AbstractC0082c6
    public final void a() {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.b
            java.lang.CharSequence r0 = r0.p
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r1.u()
            r1.t(r0)
            return
    }

    @Override // a.AbstractC0082c6
    public final int c() {
            r1 = this;
            int r0 = com.google.android.material.R.string.clear_text_end_icon_content_description
            return r0
    }

    @Override // a.AbstractC0082c6
    public final int d() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.mtrl_ic_cancel
            return r0
    }

    @Override // a.AbstractC0082c6
    public final android.view.View.OnFocusChangeListener e() {
            r1 = this;
            a.i3 r0 = r1.k
            return r0
    }

    @Override // a.AbstractC0082c6
    public final android.view.View.OnClickListener f() {
            r1 = this;
            a.h3 r0 = r1.j
            return r0
    }

    @Override // a.AbstractC0082c6
    public final android.view.View.OnFocusChangeListener g() {
            r1 = this;
            a.i3 r0 = r1.k
            return r0
    }

    @Override // a.AbstractC0082c6
    public final void m(android.widget.EditText r2) {
            r1 = this;
            r1.i = r2
            com.google.android.material.textfield.TextInputLayout r2 = r1.f418a
            boolean r0 = r1.u()
            r2.setEndIconVisible(r0)
            return
    }

    @Override // a.AbstractC0082c6
    public final void p(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.a r0 = r1.b
            java.lang.CharSequence r0 = r0.p
            if (r0 != 0) goto L7
            return
        L7:
            r1.t(r2)
            return
    }

    @Override // a.AbstractC0082c6
    public final void r() {
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            float[] r3 = new float[r2]
            r3 = {x0078: FILL_ARRAY_DATA , data: [1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            android.animation.TimeInterpolator r4 = r9.h
            r3.setInterpolator(r4)
            int r4 = r9.f
            long r4 = (long) r4
            r3.setDuration(r4)
            a.j3 r4 = new a.j3
            r4.<init>(r9, r0)
            r3.addUpdateListener(r4)
            float[] r4 = new float[r2]
            r4 = {x0080: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r4)
            android.animation.TimeInterpolator r5 = r9.g
            r4.setInterpolator(r5)
            int r6 = r9.e
            long r7 = (long) r6
            r4.setDuration(r7)
            a.j3 r7 = new a.j3
            r7.<init>(r9, r1)
            r4.addUpdateListener(r7)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r9.l = r7
            android.animation.Animator[] r8 = new android.animation.Animator[r2]
            r8[r1] = r3
            r8[r0] = r4
            r7.playTogether(r8)
            android.animation.AnimatorSet r3 = r9.l
            a.k3 r4 = new a.k3
            r4.<init>(r9, r1)
            r3.addListener(r4)
            float[] r2 = new float[r2]
            r2 = {x0088: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            r2.setInterpolator(r5)
            long r3 = (long) r6
            r2.setDuration(r3)
            a.j3 r3 = new a.j3
            r3.<init>(r9, r1)
            r2.addUpdateListener(r3)
            r9.m = r2
            a.k3 r1 = new a.k3
            r1.<init>(r9, r0)
            r2.addListener(r1)
            return
    }

    @Override // a.AbstractC0082c6
    public final void s() {
            r3 = this;
            android.widget.EditText r0 = r3.i
            if (r0 == 0) goto Ld
            a.M2 r1 = new a.M2
            r2 = 1
            r1.<init>(r2, r3)
            r0.post(r1)
        Ld:
            return
    }

    public final void t(boolean r3) {
            r2 = this;
            com.google.android.material.textfield.a r0 = r2.b
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

    public final boolean u() {
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
