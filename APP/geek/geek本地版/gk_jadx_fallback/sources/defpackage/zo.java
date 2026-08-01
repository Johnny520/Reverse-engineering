package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zo {
    public android.content.res.ColorStateList A;
    public android.graphics.Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final android.animation.TimeInterpolator d;
    public final android.animation.TimeInterpolator e;
    public final android.animation.TimeInterpolator f;
    public final android.content.Context g;
    public final com.google.android.material.textfield.TextInputLayout h;
    public android.widget.LinearLayout i;
    public int j;
    public android.widget.FrameLayout k;
    public android.animation.AnimatorSet l;
    public final float m;
    public int n;
    public int o;
    public java.lang.CharSequence p;
    public boolean q;
    public defpackage.g5 r;
    public java.lang.CharSequence s;
    public int t;
    public int u;
    public android.content.res.ColorStateList v;
    public java.lang.CharSequence w;
    public boolean x;
    public defpackage.g5 y;
    public int z;

    public zo(com.google.android.material.textfield.TextInputLayout r4) {
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getContext()
            r3.g = r0
            r3.h = r4
            android.content.res.Resources r4 = r0.getResources()
            r1 = 2131165325(0x7f07008d, float:1.7944864E38)
            int r4 = r4.getDimensionPixelSize(r1)
            float r4 = (float) r4
            r3.m = r4
            r4 = 217(0xd9, float:3.04E-43)
            r1 = 2130969345(0x7f040301, float:1.754737E38)
            int r4 = defpackage.ct.v(r0, r1, r4)
            r3.a = r4
            r4 = 2130969341(0x7f0402fd, float:1.7547361E38)
            r2 = 167(0xa7, float:2.34E-43)
            int r4 = defpackage.ct.v(r0, r4, r2)
            r3.b = r4
            int r4 = defpackage.ct.v(r0, r1, r2)
            r3.c = r4
            tj r4 = defpackage.q2.d
            r1 = 2130969350(0x7f040306, float:1.754738E38)
            android.animation.TimeInterpolator r4 = defpackage.ct.w(r0, r1, r4)
            r3.d = r4
            android.view.animation.LinearInterpolator r4 = defpackage.q2.a
            android.animation.TimeInterpolator r1 = defpackage.ct.w(r0, r1, r4)
            r3.e = r1
            r1 = 2130969353(0x7f040309, float:1.7547385E38)
            android.animation.TimeInterpolator r4 = defpackage.ct.w(r0, r1, r4)
            r3.f = r4
            return
    }

    public final void a(defpackage.g5 r7, int r8) {
            r6 = this;
            android.widget.LinearLayout r0 = r6.i
            r1 = -2
            r2 = 0
            if (r0 != 0) goto L3c
            android.widget.FrameLayout r0 = r6.k
            if (r0 != 0) goto L3c
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r3 = r6.g
            r0.<init>(r3)
            r6.i = r0
            r0.setOrientation(r2)
            android.widget.LinearLayout r0 = r6.i
            r4 = -1
            com.google.android.material.textfield.TextInputLayout r5 = r6.h
            r5.addView(r0, r4, r1)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r3)
            r6.k = r0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r1, r3)
            android.widget.LinearLayout r3 = r6.i
            android.widget.FrameLayout r4 = r6.k
            r3.addView(r4, r0)
            android.widget.EditText r0 = r5.getEditText()
            if (r0 == 0) goto L3c
            r6.b()
        L3c:
            r0 = 1
            if (r8 == 0) goto L4d
            if (r8 != r0) goto L42
            goto L4d
        L42:
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r1, r1)
            android.widget.LinearLayout r1 = r6.i
            r1.addView(r7, r8)
            goto L57
        L4d:
            android.widget.FrameLayout r8 = r6.k
            r8.setVisibility(r2)
            android.widget.FrameLayout r8 = r6.k
            r8.addView(r7)
        L57:
            android.widget.LinearLayout r7 = r6.i
            r7.setVisibility(r2)
            int r7 = r6.j
            int r7 = r7 + r0
            r6.j = r7
            return
    }

    public final void b() {
            r8 = this;
            android.widget.LinearLayout r0 = r8.i
            if (r0 == 0) goto L55
            com.google.android.material.textfield.TextInputLayout r0 = r8.h
            android.widget.EditText r1 = r0.getEditText()
            if (r1 == 0) goto L55
            android.widget.EditText r0 = r0.getEditText()
            android.content.Context r1 = r8.g
            boolean r2 = defpackage.ct.s(r1)
            android.widget.LinearLayout r3 = r8.i
            java.util.WeakHashMap r4 = defpackage.ja0.a
            int r4 = defpackage.t90.f(r0)
            r5 = 2131165752(0x7f070238, float:1.794573E38)
            if (r2 == 0) goto L2b
            android.content.res.Resources r4 = r1.getResources()
            int r4 = r4.getDimensionPixelSize(r5)
        L2b:
            android.content.res.Resources r6 = r1.getResources()
            r7 = 2131165751(0x7f070237, float:1.7945728E38)
            int r6 = r6.getDimensionPixelSize(r7)
            if (r2 == 0) goto L43
            android.content.res.Resources r6 = r1.getResources()
            r7 = 2131165753(0x7f070239, float:1.7945732E38)
            int r6 = r6.getDimensionPixelSize(r7)
        L43:
            int r0 = defpackage.t90.e(r0)
            if (r2 == 0) goto L51
            android.content.res.Resources r0 = r1.getResources()
            int r0 = r0.getDimensionPixelSize(r5)
        L51:
            r1 = 0
            defpackage.t90.k(r3, r4, r6, r0, r1)
        L55:
            return
    }

    public final void c() {
            r1 = this;
            android.animation.AnimatorSet r0 = r1.l
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    public final void d(java.util.ArrayList r8, boolean r9, defpackage.g5 r10, int r11, int r12, int r13) {
            r7 = this;
            if (r10 == 0) goto L68
            if (r9 != 0) goto L5
            goto L68
        L5:
            if (r11 == r13) goto L9
            if (r11 != r12) goto L68
        L9:
            r9 = 0
            r0 = 1
            if (r13 != r11) goto Lf
            r1 = r0
            goto L10
        Lf:
            r1 = r9
        L10:
            r2 = 0
            if (r1 == 0) goto L16
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L17
        L16:
            r3 = r2
        L17:
            android.util.Property r4 = android.view.View.ALPHA
            float[] r5 = new float[r0]
            r5[r9] = r3
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r10, r4, r5)
            int r4 = r7.c
            if (r1 == 0) goto L29
            int r5 = r7.b
            long r5 = (long) r5
            goto L2a
        L29:
            long r5 = (long) r4
        L2a:
            r3.setDuration(r5)
            if (r1 == 0) goto L32
            android.animation.TimeInterpolator r1 = r7.e
            goto L34
        L32:
            android.animation.TimeInterpolator r1 = r7.f
        L34:
            r3.setInterpolator(r1)
            if (r11 != r13) goto L3f
            if (r12 == 0) goto L3f
            long r5 = (long) r4
            r3.setStartDelay(r5)
        L3f:
            r8.add(r3)
            if (r13 != r11) goto L68
            if (r12 == 0) goto L68
            android.util.Property r11 = android.view.View.TRANSLATION_Y
            float r12 = r7.m
            float r12 = -r12
            r13 = 2
            float[] r13 = new float[r13]
            r13[r9] = r12
            r13[r0] = r2
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r10, r11, r13)
            int r10 = r7.a
            long r10 = (long) r10
            r9.setDuration(r10)
            android.animation.TimeInterpolator r10 = r7.d
            r9.setInterpolator(r10)
            long r10 = (long) r4
            r9.setStartDelay(r10)
            r8.add(r9)
        L68:
            return
    }

    public final android.widget.TextView e(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto Lb
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            g5 r2 = r1.y
            return r2
        Lb:
            g5 r2 = r1.r
            return r2
    }

    public final void f() {
            r4 = this;
            r0 = 0
            r4.p = r0
            r4.c()
            int r0 = r4.n
            r1 = 1
            if (r0 != r1) goto L1e
            boolean r0 = r4.x
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.w
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            r0 = 2
            r4.o = r0
            goto L1e
        L1b:
            r0 = 0
            r4.o = r0
        L1e:
            int r0 = r4.n
            int r1 = r4.o
            g5 r2 = r4.r
            java.lang.String r3 = ""
            boolean r2 = r4.h(r2, r3)
            r4.i(r0, r1, r2)
            return
    }

    public final void g(defpackage.g5 r3, int r4) {
            r2 = this;
            android.widget.LinearLayout r0 = r2.i
            if (r0 != 0) goto L5
            goto L23
        L5:
            r1 = 1
            if (r4 == 0) goto La
            if (r4 != r1) goto L12
        La:
            android.widget.FrameLayout r4 = r2.k
            if (r4 == 0) goto L12
            r4.removeView(r3)
            goto L15
        L12:
            r0.removeView(r3)
        L15:
            int r3 = r2.j
            int r3 = r3 - r1
            r2.j = r3
            android.widget.LinearLayout r4 = r2.i
            if (r3 != 0) goto L23
            r3 = 8
            r4.setVisibility(r3)
        L23:
            return
    }

    public final boolean h(defpackage.g5 r3, java.lang.CharSequence r4) {
            r2 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            com.google.android.material.textfield.TextInputLayout r0 = r2.h
            boolean r1 = defpackage.v90.c(r0)
            if (r1 == 0) goto L24
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L24
            int r0 = r2.o
            int r1 = r2.n
            if (r0 != r1) goto L22
            if (r3 == 0) goto L22
            java.lang.CharSequence r3 = r3.getText()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L24
        L22:
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    public final void i(int r17, int r18, boolean r19) {
            r16 = this;
            r0 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            if (r5 != r6) goto Lb
            return
        Lb:
            r8 = 0
            if (r7 == 0) goto L7a
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r0.l = r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r0.x
            g5 r3 = r0.y
            r4 = 2
            r0.d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r0.q
            g5 r3 = r0.r
            r4 = 1
            r5 = r17
            r6 = r18
            r0.d(r1, r2, r3, r4, r5, r6)
            int r2 = r1.size()
            r3 = 0
            r5 = r8
        L35:
            if (r5 >= r2) goto L4d
            java.lang.Object r10 = r1.get(r5)
            android.animation.Animator r10 = (android.animation.Animator) r10
            long r11 = r10.getStartDelay()
            long r13 = r10.getDuration()
            long r13 = r13 + r11
            long r3 = java.lang.Math.max(r3, r13)
            int r5 = r5 + 1
            goto L35
        L4d:
            int[] r2 = new int[]{r8, r8}
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            r2.setDuration(r3)
            r1.add(r8, r2)
            r9.playTogether(r1)
            android.widget.TextView r3 = r16.e(r17)
            android.widget.TextView r5 = r0.e(r6)
            xo r0 = new xo
            r1 = r16
            r4 = r17
            r2 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r15 = r1
            r1 = r0
            r0 = r15
            r9.addListener(r1)
            r9.start()
            goto La2
        L7a:
            if (r5 != r6) goto L7d
            goto La2
        L7d:
            if (r6 == 0) goto L8d
            android.widget.TextView r1 = r0.e(r6)
            if (r1 == 0) goto L8d
            r1.setVisibility(r8)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
        L8d:
            if (r5 == 0) goto La0
            android.widget.TextView r1 = r16.e(r17)
            if (r1 == 0) goto La0
            r2 = 4
            r1.setVisibility(r2)
            r2 = 1
            if (r5 != r2) goto La0
            r2 = 0
            r1.setText(r2)
        La0:
            r0.n = r6
        La2:
            com.google.android.material.textfield.TextInputLayout r1 = r0.h
            r1.r()
            r1.u(r7, r8)
            r1.x()
            return
    }
}
