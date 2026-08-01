package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v4 extends android.widget.Spinner {
    public static final int[] i = null;
    public final defpackage.v2 a;
    public final android.content.Context b;
    public final defpackage.j4 c;
    public android.widget.SpinnerAdapter d;
    public final boolean e;
    public final defpackage.u4 f;
    public int g;
    public final android.graphics.Rect h;

    static {
            r0 = 16843505(0x10102f1, float:2.3695668E-38)
            int[] r0 = new int[]{r0}
            defpackage.v4.i = r0
            return
    }

    public v4(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r0 = 2130969498(0x7f04039a, float:1.754768E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.h = r1
            android.content.Context r1 = r12.getContext()
            defpackage.r60.a(r12, r1)
            int[] r1 = defpackage.xy.v
            r5 r2 = defpackage.r5.y(r13, r14, r1, r0)
            java.lang.Object r3 = r2.b
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            v2 r4 = new v2
            r4.<init>(r12)
            r12.a = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            kd r6 = new kd
            r6.<init>(r13, r4)
            r12.b = r6
            goto L37
        L35:
            r12.b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = defpackage.v4.i     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            s4 r4 = new s4
            android.content.Context r9 = r12.b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.b
            r5 r1 = defpackage.r5.y(r9, r14, r1, r0)
            java.lang.Object r9 = r1.b
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.g = r9
            android.graphics.drawable.Drawable r9 = r1.m(r8)
            r4.l(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.C = r7
            r1.z()
            r12.f = r4
            j4 r1 = new j4
            r1.<init>(r12, r12, r4)
            r12.c = r1
            goto Laa
        L9d:
            o4 r1 = new o4
            r1.<init>(r12)
            r12.f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131492969(0x7f0c0069, float:1.8609405E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.z()
            r12.e = r8
            android.widget.SpinnerAdapter r13 = r12.d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.d = r6
        Lcf:
            v2 r13 = r12.a
            r13.d(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
    }

    public final int a(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r2 = r10.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = r10.getSelectedItemPosition()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r11.getCount()
            int r5 = r3 + 15
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r4 - r3
            int r5 = 15 - r5
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            r5 = 0
            r6 = r3
            r7 = r5
            r3 = r0
        L33:
            if (r6 >= r4) goto L5e
            int r8 = r11.getItemViewType(r6)
            if (r8 == r0) goto L3d
            r7 = r5
            r0 = r8
        L3d:
            android.view.View r7 = r11.getView(r6, r7, r10)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            if (r8 != 0) goto L50
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7.setLayoutParams(r8)
        L50:
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r8)
            int r6 = r6 + 1
            goto L33
        L5e:
            if (r12 == 0) goto L6c
            android.graphics.Rect r11 = r10.h
            r12.getPadding(r11)
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r12 = r12 + r3
            return r12
        L6c:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            v2 r0 = r1.a
            if (r0 == 0) goto La
            r0.a()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto L9
            int r0 = r0.d()
            return r0
        L9:
            int r0 = super.getDropDownHorizontalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto L9
            int r0 = r0.g()
            return r0
        L9:
            int r0 = super.getDropDownVerticalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto L7
            int r0 = r1.g
            return r0
        L7:
            int r0 = super.getDropDownWidth()
            return r0
    }

    public final defpackage.u4 getInternalPopup() {
            r1 = this;
            u4 r0 = r1.f
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.h()
            return r0
        L9:
            android.graphics.drawable.Drawable r0 = super.getPopupBackground()
            return r0
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.b
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.i()
            return r0
        L9:
            java.lang.CharSequence r0 = super.getPrompt()
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            u4 r0 = r2.f
            if (r0 == 0) goto L10
            boolean r1 = r0.b()
            if (r1 == 0) goto L10
            r0.dismiss()
        L10:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            u4 r4 = r2.f
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.a(r0, r1)
            int r4 = java.lang.Math.max(r4, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = java.lang.Math.min(r4, r3)
            int r4 = r2.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
        L32:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            t4 r3 = (defpackage.t4) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r3 = r3.a
            if (r3 == 0) goto L1c
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            if (r3 == 0) goto L1c
            k4 r0 = new k4
            r1 = 0
            r0.<init>(r1, r2)
            r3.addOnGlobalLayoutListener(r0)
        L1c:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            t4 r0 = new t4
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            u4 r1 = r2.f
            if (r1 == 0) goto L15
            boolean r1 = r1.b()
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.a = r1
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            j4 r0 = r1.c
            if (r0 == 0) goto Lc
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
            r3 = this;
            u4 r0 = r3.f
            if (r0 == 0) goto L17
            boolean r1 = r0.b()
            if (r1 != 0) goto L15
            int r1 = defpackage.m4.b(r3)
            int r2 = defpackage.m4.a(r3)
            r0.e(r1, r2)
        L15:
            r0 = 1
            return r0
        L17:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(android.widget.SpinnerAdapter r5) {
            r4 = this;
            boolean r0 = r4.e
            if (r0 != 0) goto L7
            r4.d = r5
            return
        L7:
            super.setAdapter(r5)
            u4 r0 = r4.f
            if (r0 == 0) goto L38
            android.content.Context r1 = r4.b
            if (r1 != 0) goto L16
            android.content.Context r1 = r4.getContext()
        L16:
            p4 r2 = new p4
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2.<init>()
            r2.a = r5
            boolean r3 = r5 instanceof android.widget.ListAdapter
            if (r3 == 0) goto L2a
            r3 = r5
            android.widget.ListAdapter r3 = (android.widget.ListAdapter) r3
            r2.b = r3
        L2a:
            if (r1 == 0) goto L35
            boolean r3 = r5 instanceof android.widget.ThemedSpinnerAdapter
            if (r3 == 0) goto L35
            android.widget.ThemedSpinnerAdapter r5 = (android.widget.ThemedSpinnerAdapter) r5
            defpackage.n4.a(r5, r1)
        L35:
            r0.n(r2)
        L38:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            v2 r1 = r0.a
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            v2 r0 = r1.a
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto Lb
            r0.o(r2)
            r0.c(r2)
            return
        Lb:
            super.setDropDownHorizontalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto L8
            r0.m(r2)
            return
        L8:
            super.setDropDownVerticalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto L7
            r1.g = r2
            return
        L7:
            super.setDropDownWidth(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto L8
            r0.l(r2)
            return
        L8:
            super.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            u4 r0 = r1.f
            if (r0 == 0) goto L8
            r0.k(r2)
            return
        L8:
            super.setPrompt(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            v2 r0 = r1.a
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }
}
