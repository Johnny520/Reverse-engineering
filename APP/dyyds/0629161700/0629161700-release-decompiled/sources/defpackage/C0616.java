package defpackage;

/* JADX INFO: renamed from: ᛴᛱᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0616 extends android.widget.Spinner {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final int[] f3016 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.InterfaceC1739 f3017;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f3018;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0159 f3019;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.Context f3020;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0866 f3021;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final android.graphics.Rect f3022;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.widget.SpinnerAdapter f3023;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean f3024;

    static {
            r0 = 16843505(0x10102f1, float:2.3695668E-38)
            int[] r0 = new int[]{r0}
            defpackage.C0616.f3016 = r0
            return
    }

    public C0616(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r0 = 1711538840(0x66040298, float:1.5585006E23)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f3022 = r1
            android.content.Context r1 = r12.getContext()
            defpackage.AbstractC2218.m3609(r1, r12)
            int[] r1 = defpackage.AbstractC1070.f4790
            ᛷᛸᛱᛸ r2 = defpackage.C1326.m2454(r13, r14, r1, r0)
            java.lang.Object r3 = r2.f5856
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            ᛵᛴᛴᛳ r4 = new ᛵᛴᛴᛳ
            r4.<init>(r12)
            r12.f3021 = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            ᛴᛱᲈᛳ r6 = new ᛴᛱᲈᛳ
            r6.<init>(r13, r4)
            r12.f3020 = r6
            goto L37
        L35:
            r12.f3020 = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = defpackage.C0616.f3016     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
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
            ᛵᛶᛵᛶ r4 = new ᛵᛶᛵᛶ
            android.content.Context r9 = r12.f3020
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f3020
            ᛷᛸᛱᛸ r1 = defpackage.C1326.m2454(r9, r14, r1, r0)
            java.lang.Object r9 = r1.f5856
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.f3018 = r9
            android.graphics.drawable.Drawable r9 = r1.m2470(r8)
            r4.m2725(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f4144 = r7
            r1.m2469()
            r12.f3017 = r4
            ᛱᲀᛲᛳ r1 = new ᛱᲀᛲᛳ
            r1.<init>(r12, r12, r4)
            r12.f3019 = r1
            goto Laa
        L9d:
            ᛴᛶᲁᛳ r1 = new ᛴᛶᲁᛳ
            r1.<init>(r12)
            r12.f3017 = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f3345 = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 1712062622(0x660c009e, float:1.6528567E23)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.m2469()
            r12.f3024 = r8
            android.widget.SpinnerAdapter r13 = r12.f3023
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f3023 = r6
        Lcf:
            ᛵᛴᛴᛳ r12 = r12.f3021
            r12.m1824(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r12
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            ᛵᛴᛴᛳ r0 = r0.f3021
            if (r0 == 0) goto La
            r0.m1836()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto L9
            int r1 = r0.mo1589()
            return r1
        L9:
            int r1 = super.getDropDownHorizontalOffset()
            return r1
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto L9
            int r1 = r0.mo1583()
            return r1
        L9:
            int r1 = super.getDropDownVerticalOffset()
            return r1
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto L7
            int r1 = r1.f3018
            return r1
        L7:
            int r1 = super.getDropDownWidth()
            return r1
    }

    public final defpackage.InterfaceC1739 getInternalPopup() {
            r0 = this;
            ᲀᲀᛴᲁ r0 = r0.f3017
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r1 = r0.mo1585()
            return r1
        L9:
            android.graphics.drawable.Drawable r1 = super.getPopupBackground()
            return r1
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r0 = this;
            android.content.Context r0 = r0.f3020
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto L9
            java.lang.CharSequence r1 = r0.mo1588()
            return r1
        L9:
            java.lang.CharSequence r1 = super.getPrompt()
            return r1
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f3021
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1823()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f3021
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1826()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            ᲀᲀᛴᲁ r1 = r1.f3017
            if (r1 == 0) goto L10
            boolean r0 = r1.mo1586()
            if (r0 == 0) goto L10
            r1.dismiss()
        L10:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            ᲀᲀᛴᲁ r4 = r2.f3017
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.m1414(r0, r1)
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
            ᲁᛴᛴᛸ r3 = (defpackage.C1843) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r3 = r3.f8039
            if (r3 == 0) goto L1c
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            if (r3 == 0) goto L1c
            ᛴᲈᛶᛳ r0 = new ᛴᲈᛶᛳ
            r1 = 0
            r0.<init>(r1, r2)
            r3.addOnGlobalLayoutListener(r0)
        L1c:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            ᲁᛴᛴᛸ r0 = new ᲁᛴᛴᛸ
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            ᲀᲀᛴᲁ r2 = r2.f3017
            if (r2 == 0) goto L15
            boolean r2 = r2.mo1586()
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r0.f8039 = r2
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            ᛱᲀᛲᛳ r0 = r1.f3019
            if (r0 == 0) goto Lc
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            boolean r1 = super.onTouchEvent(r2)
            return r1
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
            r2 = this;
            ᲀᲀᛴᲁ r0 = r2.f3017
            if (r0 == 0) goto L17
            boolean r1 = r0.mo1586()
            if (r1 != 0) goto L15
            int r1 = defpackage.AbstractC0044.m387(r2)
            int r2 = defpackage.AbstractC0044.m386(r2)
            r0.mo1580(r1, r2)
        L15:
            r2 = 1
            return r2
        L17:
            boolean r2 = super.performClick()
            return r2
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(android.widget.SpinnerAdapter r4) {
            r3 = this;
            boolean r0 = r3.f3024
            if (r0 != 0) goto L7
            r3.f3023 = r4
            return
        L7:
            super.setAdapter(r4)
            ᲀᲀᛴᲁ r0 = r3.f3017
            if (r0 == 0) goto L38
            android.content.Context r1 = r3.f3020
            if (r1 != 0) goto L16
            android.content.Context r1 = r3.getContext()
        L16:
            ᛱᛴᛴᛲ r3 = new ᛱᛴᛴᛲ
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r3.<init>()
            r3.f779 = r4
            boolean r2 = r4 instanceof android.widget.ListAdapter
            if (r2 == 0) goto L2a
            r2 = r4
            android.widget.ListAdapter r2 = (android.widget.ListAdapter) r2
            r3.f778 = r2
        L2a:
            if (r1 == 0) goto L35
            boolean r2 = r4 instanceof android.widget.ThemedSpinnerAdapter
            if (r2 == 0) goto L35
            android.widget.ThemedSpinnerAdapter r4 = (android.widget.ThemedSpinnerAdapter) r4
            defpackage.AbstractC1052.m2006(r4, r1)
        L35:
            r0.mo1581(r3)
        L38:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            ᛵᛴᛴᛳ r0 = r0.f3021
            if (r0 == 0) goto La
            r0.m1832()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            ᛵᛴᛴᛳ r0 = r0.f3021
            if (r0 == 0) goto La
            r0.m1838(r1)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto Lb
            r0.mo1587(r2)
            r0.mo1579(r2)
            return
        Lb:
            super.setDropDownHorizontalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto L8
            r0.mo1590(r2)
            return
        L8:
            super.setDropDownVerticalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto L7
            r1.f3018 = r2
            return
        L7:
            super.setDropDownWidth(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto L8
            r0.mo1582(r2)
            return
        L8:
            super.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            ᲀᲀᛴᲁ r0 = r1.f3017
            if (r0 == 0) goto L8
            r0.mo1584(r2)
            return
        L8:
            super.setPrompt(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f3021
            if (r0 == 0) goto L7
            r0.m1828(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f3021
            if (r0 == 0) goto L7
            r0.m1827(r1)
        L7:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1414(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
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
            android.graphics.Rect r10 = r10.f3022
            r12.getPadding(r10)
            int r11 = r10.left
            int r10 = r10.right
            int r11 = r11 + r10
            int r11 = r11 + r3
            return r11
        L6c:
            return r3
    }
}
