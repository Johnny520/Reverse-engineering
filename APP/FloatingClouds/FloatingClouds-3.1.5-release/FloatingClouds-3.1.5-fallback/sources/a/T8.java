package a;

/* JADX INFO: loaded from: classes.dex */
public final class T8 {
    public android.content.res.ColorStateList A;
    public android.graphics.Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f275a;
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
    public a.C0345r1 r;
    public java.lang.CharSequence s;
    public int t;
    public int u;
    public android.content.res.ColorStateList v;
    public java.lang.CharSequence w;
    public boolean x;
    public a.C0345r1 y;
    public int z;

    public class a extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f276a;
        public final /* synthetic */ android.widget.TextView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ android.widget.TextView d;
        public final /* synthetic */ a.T8 e;

        public a(a.T8 r1, int r2, android.widget.TextView r3, int r4, android.widget.TextView r5) {
                r0 = this;
                r0.e = r1
                r0.f276a = r2
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r4) {
                r3 = this;
                int r4 = r3.f276a
                a.T8 r0 = r3.e
                r0.n = r4
                r4 = 0
                r0.l = r4
                android.widget.TextView r1 = r3.b
                if (r1 == 0) goto L1d
                r2 = 4
                r1.setVisibility(r2)
                int r1 = r3.c
                r2 = 1
                if (r1 != r2) goto L1d
                a.r1 r0 = r0.r
                if (r0 == 0) goto L1d
                r0.setText(r4)
            L1d:
                android.widget.TextView r4 = r3.d
                if (r4 == 0) goto L2a
                r0 = 0
                r4.setTranslationY(r0)
                r0 = 1065353216(0x3f800000, float:1.0)
                r4.setAlpha(r0)
            L2a:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                android.widget.TextView r2 = r1.d
                if (r2 == 0) goto Lc
                r0 = 0
                r2.setVisibility(r0)
                r0 = 0
                r2.setAlpha(r0)
            Lc:
                return
        }
    }

    public T8(com.google.android.material.textfield.TextInputLayout r3) {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = r3.getContext()
            r2.g = r0
            r2.h = r3
            android.content.res.Resources r3 = r0.getResources()
            int r1 = com.google.android.material.R.dimen.design_textinput_caption_translate_y
            int r3 = r3.getDimensionPixelSize(r1)
            float r3 = (float) r3
            r2.m = r3
            int r3 = com.google.android.material.R.attr.motionDurationShort4
            r1 = 217(0xd9, float:3.04E-43)
            int r3 = a.C0445wb.c(r0, r3, r1)
            r2.f275a = r3
            int r3 = com.google.android.material.R.attr.motionDurationMedium4
            r1 = 167(0xa7, float:2.34E-43)
            int r3 = a.C0445wb.c(r0, r3, r1)
            r2.b = r3
            int r3 = com.google.android.material.R.attr.motionDurationShort4
            int r3 = a.C0445wb.c(r0, r3, r1)
            r2.c = r3
            int r3 = com.google.android.material.R.attr.motionEasingEmphasizedDecelerateInterpolator
            a.l6 r1 = a.C0434w0.d
            android.animation.TimeInterpolator r3 = a.C0445wb.d(r0, r3, r1)
            r2.d = r3
            int r3 = com.google.android.material.R.attr.motionEasingEmphasizedDecelerateInterpolator
            android.view.animation.LinearInterpolator r1 = a.C0434w0.f744a
            android.animation.TimeInterpolator r3 = a.C0445wb.d(r0, r3, r1)
            r2.e = r3
            int r3 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.animation.TimeInterpolator r3 = a.C0445wb.d(r0, r3, r1)
            r2.f = r3
            return
    }

    public final void a(a.C0345r1 r7, int r8) {
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
            com.google.android.material.textfield.TextInputLayout r4 = r6.h
            r5 = -1
            r4.addView(r0, r5, r1)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r3)
            r6.k = r0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r1, r3)
            android.widget.LinearLayout r3 = r6.i
            android.widget.FrameLayout r5 = r6.k
            r3.addView(r5, r0)
            android.widget.EditText r0 = r4.getEditText()
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
            if (r0 == 0) goto L54
            com.google.android.material.textfield.TextInputLayout r0 = r8.h
            android.widget.EditText r1 = r0.getEditText()
            if (r1 == 0) goto L54
            android.widget.EditText r0 = r0.getEditText()
            android.content.Context r1 = r8.g
            boolean r2 = a.Sa.d(r1)
            android.widget.LinearLayout r3 = r8.i
            int r4 = com.google.android.material.R.dimen.material_helper_text_font_1_3_padding_horizontal
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            int r5 = r0.getPaddingStart()
            if (r2 == 0) goto L2a
            android.content.res.Resources r5 = r1.getResources()
            int r5 = r5.getDimensionPixelSize(r4)
        L2a:
            int r4 = com.google.android.material.R.dimen.material_helper_text_font_1_3_padding_top
            android.content.res.Resources r6 = r1.getResources()
            int r7 = com.google.android.material.R.dimen.material_helper_text_default_padding_top
            int r6 = r6.getDimensionPixelSize(r7)
            if (r2 == 0) goto L40
            android.content.res.Resources r6 = r1.getResources()
            int r6 = r6.getDimensionPixelSize(r4)
        L40:
            int r4 = com.google.android.material.R.dimen.material_helper_text_font_1_3_padding_horizontal
            int r0 = r0.getPaddingEnd()
            if (r2 == 0) goto L50
            android.content.res.Resources r0 = r1.getResources()
            int r0 = r0.getDimensionPixelSize(r4)
        L50:
            r1 = 0
            r3.setPaddingRelative(r5, r6, r0, r1)
        L54:
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

    public final void d(java.util.ArrayList r8, boolean r9, a.C0345r1 r10, int r11, int r12, int r13) {
            r7 = this;
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L68
            if (r9 != 0) goto L7
            goto L68
        L7:
            if (r11 == r13) goto Lb
            if (r11 != r12) goto L68
        Lb:
            if (r13 != r11) goto Lf
            r9 = r1
            goto L10
        Lf:
            r9 = r0
        L10:
            r2 = 0
            if (r9 == 0) goto L16
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L17
        L16:
            r3 = r2
        L17:
            android.util.Property r4 = android.view.View.ALPHA
            float[] r5 = new float[r1]
            r5[r0] = r3
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r10, r4, r5)
            int r4 = r7.c
            if (r9 == 0) goto L29
            int r5 = r7.b
            long r5 = (long) r5
            goto L2a
        L29:
            long r5 = (long) r4
        L2a:
            r3.setDuration(r5)
            if (r9 == 0) goto L32
            android.animation.TimeInterpolator r9 = r7.e
            goto L34
        L32:
            android.animation.TimeInterpolator r9 = r7.f
        L34:
            r3.setInterpolator(r9)
            if (r11 != r13) goto L3f
            if (r12 == 0) goto L3f
            long r5 = (long) r4
            r3.setStartDelay(r5)
        L3f:
            r8.add(r3)
            if (r13 != r11) goto L68
            if (r12 == 0) goto L68
            android.util.Property r9 = android.view.View.TRANSLATION_Y
            float r11 = r7.m
            float r11 = -r11
            r12 = 2
            float[] r12 = new float[r12]
            r12[r0] = r11
            r12[r1] = r2
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r10, r9, r12)
            int r10 = r7.f275a
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
            a.r1 r2 = r1.y
            return r2
        Lb:
            a.r1 r2 = r1.r
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
            a.r1 r2 = r4.r
            java.lang.String r3 = ""
            boolean r2 = r4.h(r2, r3)
            r4.i(r0, r1, r2)
            return
    }

    public final void g(a.C0345r1 r3, int r4) {
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

    public final boolean h(a.C0345r1 r3, java.lang.CharSequence r4) {
            r2 = this;
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            com.google.android.material.textfield.TextInputLayout r0 = r2.h
            boolean r1 = r0.isLaidOut()
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

    public final void i(int r10, int r11, boolean r12) {
            r9 = this;
            if (r10 != r11) goto L3
            return
        L3:
            r7 = 0
            if (r12 == 0) goto L40
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            r9.l = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r9.x
            a.r1 r3 = r9.y
            r4 = 2
            r0 = r9
            r5 = r10
            r6 = r11
            r0.d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r9.q
            a.r1 r3 = r9.r
            r4 = 1
            r0.d(r1, r2, r3, r4, r5, r6)
            a.C0435w1.N(r8, r1)
            android.widget.TextView r3 = r9.e(r10)
            android.widget.TextView r5 = r9.e(r11)
            a.T8$a r0 = new a.T8$a
            r1 = r9
            r4 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r8.addListener(r1)
            r8.start()
            goto L68
        L40:
            if (r10 != r11) goto L43
            goto L68
        L43:
            if (r11 == 0) goto L53
            android.widget.TextView r1 = r9.e(r11)
            if (r1 == 0) goto L53
            r1.setVisibility(r7)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
        L53:
            if (r10 == 0) goto L66
            android.widget.TextView r1 = r9.e(r10)
            if (r1 == 0) goto L66
            r2 = 4
            r1.setVisibility(r2)
            r2 = 1
            if (r10 != r2) goto L66
            r2 = 0
            r1.setText(r2)
        L66:
            r9.n = r11
        L68:
            com.google.android.material.textfield.TextInputLayout r1 = r9.h
            r1.r()
            r1.u(r12, r7)
            r1.x()
            return
    }
}
