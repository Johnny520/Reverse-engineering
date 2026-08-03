package a;

/* JADX INFO: loaded from: classes.dex */
public final class F5 extends a.AbstractC0082c6 {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public android.widget.AutoCompleteTextView h;
    public final a.ViewOnClickListenerC0169h3 i;
    public final a.ViewOnFocusChangeListenerC0187i3 j;
    public final a.E5 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public android.view.accessibility.AccessibilityManager p;
    public android.animation.ValueAnimator q;
    public android.animation.ValueAnimator r;

    public F5(com.google.android.material.textfield.a r4) {
            r3 = this;
            r3.<init>(r4)
            a.h3 r0 = new a.h3
            r1 = 1
            r0.<init>(r1, r3)
            r3.i = r0
            a.i3 r0 = new a.i3
            r0.<init>(r3, r1)
            r3.j = r0
            a.E5 r0 = new a.E5
            r0.<init>(r3)
            r3.k = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.o = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationShort3
            r2 = 67
            int r0 = a.C0445wb.c(r0, r1, r2)
            r3.f = r0
            android.content.Context r0 = r4.getContext()
            int r1 = com.google.android.material.R.attr.motionDurationShort3
            r2 = 50
            int r0 = a.C0445wb.c(r0, r1, r2)
            r3.e = r0
            android.content.Context r4 = r4.getContext()
            int r0 = com.google.android.material.R.attr.motionEasingLinearInterpolator
            android.view.animation.LinearInterpolator r1 = a.C0434w0.f744a
            android.animation.TimeInterpolator r4 = a.C0445wb.d(r4, r0, r1)
            r3.g = r4
            return
    }

    @Override // a.AbstractC0082c6
    public final void a() {
            r3 = this;
            android.view.accessibility.AccessibilityManager r0 = r3.p
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L1d
            android.widget.AutoCompleteTextView r0 = r3.h
            boolean r0 = a.C0435w1.G(r0)
            if (r0 == 0) goto L1d
            com.google.android.material.internal.CheckableImageButton r0 = r3.d
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L1d
            android.widget.AutoCompleteTextView r0 = r3.h
            r0.dismissDropDown()
        L1d:
            android.widget.AutoCompleteTextView r0 = r3.h
            a.M2 r1 = new a.M2
            r2 = 7
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    @Override // a.AbstractC0082c6
    public final int c() {
            r1 = this;
            int r0 = com.google.android.material.R.string.exposed_dropdown_menu_content_description
            return r0
    }

    @Override // a.AbstractC0082c6
    public final int d() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.mtrl_dropdown_arrow
            return r0
    }

    @Override // a.AbstractC0082c6
    public final android.view.View.OnFocusChangeListener e() {
            r1 = this;
            a.i3 r0 = r1.j
            return r0
    }

    @Override // a.AbstractC0082c6
    public final android.view.View.OnClickListener f() {
            r1 = this;
            a.h3 r0 = r1.i
            return r0
    }

    @Override // a.AbstractC0082c6
    public final a.E5 h() {
            r1 = this;
            a.E5 r0 = r1.k
            return r0
    }

    @Override // a.AbstractC0082c6
    public final boolean i(int r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    @Override // a.AbstractC0082c6
    public final boolean j() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    @Override // a.AbstractC0082c6
    public final boolean l() {
            r1 = this;
            boolean r0 = r1.n
            return r0
    }

    @Override // a.AbstractC0082c6
    public final void m(android.widget.EditText r3) {
            r2 = this;
            boolean r0 = r3 instanceof android.widget.AutoCompleteTextView
            if (r0 == 0) goto L42
            r0 = r3
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            r2.h = r0
            a.C5 r1 = new a.C5
            r1.<init>(r2)
            r0.setOnTouchListener(r1)
            android.widget.AutoCompleteTextView r0 = r2.h
            a.D5 r1 = new a.D5
            r1.<init>(r2)
            r0.setOnDismissListener(r1)
            android.widget.AutoCompleteTextView r0 = r2.h
            r1 = 0
            r0.setThreshold(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r2.f418a
            r1 = 0
            r0.setErrorIconDrawable(r1)
            boolean r3 = a.C0435w1.G(r3)
            if (r3 != 0) goto L3d
            android.view.accessibility.AccessibilityManager r3 = r2.p
            boolean r3 = r3.isTouchExplorationEnabled()
            if (r3 == 0) goto L3d
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            com.google.android.material.internal.CheckableImageButton r3 = r2.d
            r1 = 2
            r3.setImportantForAccessibility(r1)
        L3d:
            r3 = 1
            r0.setEndIconVisible(r3)
            return
        L42:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
            r3.<init>(r0)
            throw r3
    }

    @Override // a.AbstractC0082c6
    public final void n(a.I r2) {
            r1 = this;
            android.widget.AutoCompleteTextView r0 = r1.h
            boolean r0 = a.C0435w1.G(r0)
            if (r0 != 0) goto L11
            java.lang.Class<android.widget.Spinner> r0 = android.widget.Spinner.class
            java.lang.String r0 = r0.getName()
            r2.h(r0)
        L11:
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f118a
            boolean r0 = r2.isShowingHintText()
            if (r0 == 0) goto L1d
            r0 = 0
            r2.setHintText(r0)
        L1d:
            return
    }

    @Override // a.AbstractC0082c6
    @android.annotation.SuppressLint({"WrongConstant"})
    public final void o(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            android.view.accessibility.AccessibilityManager r0 = r3.p
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L45
            android.widget.AutoCompleteTextView r0 = r3.h
            boolean r0 = a.C0435w1.G(r0)
            if (r0 == 0) goto L11
            goto L45
        L11:
            int r0 = r4.getEventType()
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = 1
            if (r0 == r1) goto L23
            int r0 = r4.getEventType()
            r1 = 8
            if (r0 != r1) goto L31
        L23:
            boolean r0 = r3.n
            if (r0 == 0) goto L31
            android.widget.AutoCompleteTextView r0 = r3.h
            boolean r0 = r0.isPopupShowing()
            if (r0 != 0) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = 0
        L32:
            int r4 = r4.getEventType()
            if (r4 == r2) goto L3a
            if (r0 == 0) goto L45
        L3a:
            r3.u()
            r3.m = r2
            long r0 = java.lang.System.currentTimeMillis()
            r3.o = r0
        L45:
            return
    }

    @Override // a.AbstractC0082c6
    public final void r() {
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
            a.B5 r3 = new a.B5
            r3.<init>(r5)
            r1.addUpdateListener(r3)
            r5.r = r1
            float[] r0 = new float[r0]
            r0 = {x005a: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r0.setInterpolator(r2)
            int r1 = r5.e
            long r1 = (long) r1
            r0.setDuration(r1)
            a.B5 r1 = new a.B5
            r1.<init>(r5)
            r0.addUpdateListener(r1)
            r5.q = r0
            a.v0 r1 = new a.v0
            r2 = 1
            r1.<init>(r2, r5)
            r0.addListener(r1)
            android.content.Context r0 = r5.c
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r5.p = r0
            return
    }

    @Override // a.AbstractC0082c6
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
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

    public final void t(boolean r2) {
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

    public final void u() {
            r7 = this;
            android.widget.AutoCompleteTextView r0 = r7.h
            if (r0 != 0) goto L5
            return
        L5:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.o
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 < 0) goto L1d
            r5 = 300(0x12c, double:1.48E-321)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L1d
        L1b:
            r0 = r4
            goto L1e
        L1d:
            r0 = r3
        L1e:
            if (r0 == 0) goto L22
            r7.m = r4
        L22:
            boolean r0 = r7.m
            if (r0 != 0) goto L41
            boolean r0 = r7.n
            r0 = r0 ^ r3
            r7.t(r0)
            boolean r0 = r7.n
            if (r0 == 0) goto L3b
            android.widget.AutoCompleteTextView r0 = r7.h
            r0.requestFocus()
            android.widget.AutoCompleteTextView r0 = r7.h
            r0.showDropDown()
            return
        L3b:
            android.widget.AutoCompleteTextView r0 = r7.h
            r0.dismissDropDown()
            return
        L41:
            r7.m = r4
            return
    }
}
