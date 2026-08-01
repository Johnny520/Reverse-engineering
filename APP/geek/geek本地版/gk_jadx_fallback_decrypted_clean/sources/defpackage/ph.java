package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph extends defpackage.fj {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public android.widget.AutoCompleteTextView h;
    public final defpackage.qa i;
    public final defpackage.ra j;
    public final defpackage.oh k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public android.view.accessibility.AccessibilityManager p;
    public android.animation.ValueAnimator q;
    public android.animation.ValueAnimator r;

    public ph(defpackage.ej r4) {
            r3 = this;
            r3.<init>(r4)
            qa r0 = new qa
            r1 = 1
            r0.<init>(r1, r3)
            r3.i = r0
            ra r0 = new ra
            r0.<init>(r3, r1)
            r3.j = r0
            oh r0 = new oh
            r0.<init>(r3)
            r3.k = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.o = r0
            android.content.Context r0 = r4.getContext()
            r1 = 67
            r2 = 2130969344(0x7f040300, float:1.7547367E38)
            int r0 = defpackage.ct.v(r0, r2, r1)
            r3.f = r0
            android.content.Context r0 = r4.getContext()
            r1 = 50
            int r0 = defpackage.ct.v(r0, r2, r1)
            r3.e = r0
            android.content.Context r4 = r4.getContext()
            r0 = 2130969353(0x7f040309, float:1.7547385E38)
            android.view.animation.LinearInterpolator r1 = defpackage.q2.a
            android.animation.TimeInterpolator r4 = defpackage.ct.w(r4, r0, r1)
            r3.g = r4
            return
    }

    @Override // defpackage.fj
    public final void a() {
            r3 = this;
            android.view.accessibility.AccessibilityManager r0 = r3.p
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L1d
            android.widget.AutoCompleteTextView r0 = r3.h
            int r0 = r0.getInputType()
            if (r0 == 0) goto L1d
            com.google.android.material.internal.CheckableImageButton r0 = r3.d
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L1d
            android.widget.AutoCompleteTextView r0 = r3.h
            r0.dismissDropDown()
        L1d:
            android.widget.AutoCompleteTextView r0 = r3.h
            p1 r1 = new p1
            r2 = 6
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // defpackage.fj
    public final int c() {
            r1 = this;
            r0 = 2131755050(0x7f10002a, float:1.9140968E38)
            return r0
    }

    @Override // defpackage.fj
    public final int d() {
            r1 = this;
            r0 = 2131230903(0x7f0800b7, float:1.8077872E38)
            return r0
    }

    @Override // defpackage.fj
    public final android.view.View.OnFocusChangeListener e() {
            r1 = this;
            ra r0 = r1.j
            return r0
    }

    @Override // defpackage.fj
    public final android.view.View.OnClickListener f() {
            r1 = this;
            qa r0 = r1.i
            return r0
    }

    @Override // defpackage.fj
    public final defpackage.a0 h() {
            r1 = this;
            oh r0 = r1.k
            return r0
    }

    @Override // defpackage.fj
    public final boolean i(int r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    @Override // defpackage.fj
    public final boolean k() {
            r1 = this;
            boolean r0 = r1.n
            return r0
    }

    @Override // defpackage.fj
    public final void l(android.widget.EditText r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.widget.AutoCompleteTextView
            if (r0 == 0) goto L43
            r0 = r4
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            r3.h = r0
            mh r1 = new mh
            r2 = 0
            r1.<init>(r2, r3)
            r0.setOnTouchListener(r1)
            android.widget.AutoCompleteTextView r0 = r3.h
            nh r1 = new nh
            r1.<init>(r3)
            r0.setOnDismissListener(r1)
            android.widget.AutoCompleteTextView r0 = r3.h
            r0.setThreshold(r2)
            r0 = 0
            com.google.android.material.textfield.TextInputLayout r1 = r3.a
            r1.setErrorIconDrawable(r0)
            int r4 = r4.getInputType()
            if (r4 == 0) goto L2e
            goto L3e
        L2e:
            android.view.accessibility.AccessibilityManager r4 = r3.p
            boolean r4 = r4.isTouchExplorationEnabled()
            if (r4 == 0) goto L3e
            java.util.WeakHashMap r4 = defpackage.ja0.a
            com.google.android.material.internal.CheckableImageButton r4 = r3.d
            r0 = 2
            defpackage.s90.s(r4, r0)
        L3e:
            r4 = 1
            r1.setEndIconVisible(r4)
            return
        L43:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
            r4.<init>(r0)
            throw r4
    }

    @Override // defpackage.fj
    public final void m(defpackage.j0 r2) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.a
            android.widget.AutoCompleteTextView r0 = r1.h
            int r0 = r0.getInputType()
            if (r0 == 0) goto Lb
            goto L14
        Lb:
            java.lang.Class<android.widget.Spinner> r0 = android.widget.Spinner.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
        L14:
            boolean r0 = r2.isShowingHintText()
            if (r0 == 0) goto L1e
            r0 = 0
            r2.setHintText(r0)
        L1e:
            return
    }

    @Override // defpackage.fj
    public final void n(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            android.view.accessibility.AccessibilityManager r0 = r3.p
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L3d
            android.widget.AutoCompleteTextView r0 = r3.h
            int r0 = r0.getInputType()
            if (r0 == 0) goto L11
            return
        L11:
            int r0 = r4.getEventType()
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = 1
            if (r0 != r1) goto L29
            boolean r0 = r3.n
            if (r0 == 0) goto L29
            android.widget.AutoCompleteTextView r0 = r3.h
            boolean r0 = r0.isPopupShowing()
            if (r0 != 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = 0
        L2a:
            int r4 = r4.getEventType()
            if (r4 == r2) goto L32
            if (r0 == 0) goto L3d
        L32:
            r3.t()
            r3.m = r2
            long r0 = java.lang.System.currentTimeMillis()
            r3.o = r0
        L3d:
            return
    }

    @Override // defpackage.fj
    public final void q() {
            r5 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0052: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            android.animation.TimeInterpolator r2 = r5.g
            r1.setInterpolator(r2)
            int r3 = r5.f
            long r3 = (long) r3
            r1.setDuration(r3)
            lh r3 = new lh
            r4 = 0
            r3.<init>(r4, r5)
            r1.addUpdateListener(r3)
            r5.r = r1
            float[] r1 = new float[r0]
            r1 = {x005a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r1.setInterpolator(r2)
            int r2 = r5.e
            long r2 = (long) r2
            r1.setDuration(r2)
            lh r2 = new lh
            r2.<init>(r4, r5)
            r1.addUpdateListener(r2)
            r5.q = r1
            y0 r2 = new y0
            r2.<init>(r0, r5)
            r1.addListener(r2)
            android.content.Context r0 = r5.c
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r5.p = r0
            return
    }

    @Override // defpackage.fj
    public final void r() {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = r2.h
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setOnTouchListener(r1)
            android.widget.AutoCompleteTextView r0 = r2.h
            r0.setOnDismissListener(r1)
        Ld:
            return
    }

    public final void s(boolean r2) {
            r1 = this;
            boolean r0 = r1.n
            if (r0 == r2) goto L10
            r1.n = r2
            android.animation.ValueAnimator r2 = r1.r
            r2.cancel()
            android.animation.ValueAnimator r2 = r1.q
            r2.start()
        L10:
            return
    }

    public final void t() {
            r6 = this;
            android.widget.AutoCompleteTextView r0 = r6.h
            if (r0 != 0) goto L5
            return
        L5:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.o
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L19
            r4 = 300(0x12c, double:1.48E-321)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1b
        L19:
            r6.m = r3
        L1b:
            boolean r0 = r6.m
            if (r0 != 0) goto L3b
            boolean r0 = r6.n
            r0 = r0 ^ 1
            r6.s(r0)
            boolean r0 = r6.n
            if (r0 == 0) goto L35
            android.widget.AutoCompleteTextView r0 = r6.h
            r0.requestFocus()
            android.widget.AutoCompleteTextView r0 = r6.h
            r0.showDropDown()
            return
        L35:
            android.widget.AutoCompleteTextView r0 = r6.h
            r0.dismissDropDown()
            return
        L3b:
            r6.m = r3
            return
    }
}
