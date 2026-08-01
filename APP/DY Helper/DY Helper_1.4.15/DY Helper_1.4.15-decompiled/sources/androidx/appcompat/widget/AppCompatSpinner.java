package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends android.widget.Spinner {

    /* JADX INFO: renamed from: ν */
    public static final int[] f577 = null;

    /* JADX INFO: renamed from: ε */
    public final p000.C0610o4 f578;

    /* JADX INFO: renamed from: ζ */
    public final android.content.Context f579;

    /* JADX INFO: renamed from: η */
    public final p000.C0712q5 f580;

    /* JADX INFO: renamed from: θ */
    public android.widget.SpinnerAdapter f581;

    /* JADX INFO: renamed from: ι */
    public final boolean f582;

    /* JADX INFO: renamed from: κ */
    public final p000.InterfaceC0972x5 f583;

    /* JADX INFO: renamed from: λ */
    public int f584;

    /* JADX INFO: renamed from: μ */
    public final android.graphics.Rect f585;

    static {
            r0 = 16843505(0x10102f1, float:2.3695668E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.AppCompatSpinner.f577 = r0
            return
    }

    public AppCompatSpinner(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatSpinner(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130968825(0x7f0400f9, float:1.7546315E38)
            r1 = -1
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public AppCompatSpinner(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AppCompatSpinner(android.content.Context r11, android.util.AttributeSet r12, int r13, int r14) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f585 = r0
            android.content.Context r0 = r10.getContext()
            p000.b42.m739(r10, r0)
            int[] r0 = p000.kk1.f5989
            m6 r1 = p000.C0538m6.m3752(r11, r12, r0, r13)
            java.lang.Object r2 = r1.f6967
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            o4 r3 = new o4
            r3.<init>(r10)
            r10.f578 = r3
            r3 = 4
            r4 = 0
            int r3 = r2.getResourceId(r3, r4)
            if (r3 == 0) goto L32
            np r5 = new np
            r5.<init>(r11, r3)
            r10.f579 = r5
            goto L34
        L32:
            r10.f579 = r11
        L34:
            r3 = -1
            r5 = 0
            if (r14 != r3) goto L66
            int[] r3 = androidx.appcompat.widget.AppCompatSpinner.f577     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r12, r3, r13, r4)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            boolean r6 = r3.hasValue(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            if (r6 == 0) goto L4e
            int r14 = r3.getInt(r4, r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            goto L4e
        L49:
            r10 = move-exception
            r5 = r3
            goto L60
        L4c:
            r6 = move-exception
            goto L56
        L4e:
            r3.recycle()
            goto L66
        L52:
            r10 = move-exception
            goto L60
        L54:
            r6 = move-exception
            r3 = r5
        L56:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L66
            goto L4e
        L60:
            if (r5 == 0) goto L65
            r5.recycle()
        L65:
            throw r10
        L66:
            r3 = 2
            r6 = 1
            if (r14 == 0) goto La0
            if (r14 == r6) goto L6d
            goto Lad
        L6d:
            androidx.appcompat.widget.δ r14 = new androidx.appcompat.widget.δ
            android.content.Context r7 = r10.f579
            r14.<init>(r10, r7, r12, r13)
            android.content.Context r7 = r10.f579
            m6 r0 = p000.C0538m6.m3752(r7, r12, r0, r13)
            java.lang.Object r7 = r0.f6967
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            r8 = 3
            r9 = -2
            int r7 = r7.getLayoutDimension(r8, r9)
            r10.f584 = r7
            android.graphics.drawable.Drawable r7 = r0.m3754(r6)
            r14.m345(r7)
            java.lang.String r3 = r2.getString(r3)
            r14.f810 = r3
            r0.m3765()
            r10.f583 = r14
            q5 r0 = new q5
            r0.<init>(r10, r10, r14)
            r10.f580 = r0
            goto Lad
        La0:
            s5 r14 = new s5
            r14.<init>(r10)
            r10.f583 = r14
            java.lang.String r0 = r2.getString(r3)
            r14.f9736 = r0
        Lad:
            java.lang.CharSequence[] r14 = r2.getTextArray(r4)
            if (r14 == 0) goto Lc4
            android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
            r2 = 17367048(0x1090008, float:2.5162948E-38)
            r0.<init>(r11, r2, r14)
            r11 = 2131492970(0x7f0c006a, float:1.8609407E38)
            r0.setDropDownViewResource(r11)
            r10.setAdapter(r0)
        Lc4:
            r1.m3765()
            r10.f582 = r6
            android.widget.SpinnerAdapter r11 = r10.f581
            if (r11 == 0) goto Ld2
            r10.setAdapter(r11)
            r10.f581 = r5
        Ld2:
            o4 r10 = r10.f578
            r10.m4197(r12, r13)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            o4 r0 = r0.f578
            if (r0 == 0) goto La
            r0.m4194()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto L9
            int r1 = r0.mo5366()
            return r1
        L9:
            int r1 = super.getDropDownHorizontalOffset()
            return r1
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto L9
            int r1 = r0.mo5371()
            return r1
        L9:
            int r1 = super.getDropDownVerticalOffset()
            return r1
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto L7
            int r1 = r1.f584
            return r1
        L7:
            int r1 = super.getDropDownWidth()
            return r1
    }

    public final p000.InterfaceC0972x5 getInternalPopup() {
            r0 = this;
            x5 r0 = r0.f583
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r1 = r0.mo5367()
            return r1
        L9:
            android.graphics.drawable.Drawable r1 = super.getPopupBackground()
            return r1
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r0 = this;
            android.content.Context r0 = r0.f579
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto L9
            java.lang.CharSequence r1 = r0.mo335()
            return r1
        L9:
            java.lang.CharSequence r1 = super.getPrompt()
            return r1
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            o4 r0 = r0.f578
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m4195()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            o4 r0 = r0.f578
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m4196()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            x5 r1 = r1.f583
            if (r1 == 0) goto L10
            boolean r0 = r1.mo5365()
            if (r0 == 0) goto L10
            r1.dismiss()
        L10:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            x5 r4 = r2.f583
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.m271(r0, r1)
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
            w5 r3 = (p000.C0935w5) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r3 = r3.f11566
            if (r3 == 0) goto L1c
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            if (r3 == 0) goto L1c
            d r0 = new d
            r1 = 1
            r0.<init>(r1, r2)
            r3.addOnGlobalLayoutListener(r0)
        L1c:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            w5 r0 = new w5
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            x5 r2 = r2.f583
            if (r2 == 0) goto L15
            boolean r2 = r2.mo5365()
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r0.f11566 = r2
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            q5 r0 = r1.f580
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
            x5 r0 = r2.f583
            if (r0 == 0) goto L17
            boolean r1 = r0.mo5365()
            if (r1 != 0) goto L15
            int r1 = r2.getTextDirection()
            int r2 = r2.getTextAlignment()
            r0.mo334(r1, r2)
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
            boolean r0 = r3.f582
            if (r0 != 0) goto L7
            r3.f581 = r4
            return
        L7:
            super.setAdapter(r4)
            x5 r0 = r3.f583
            if (r0 == 0) goto L38
            android.content.Context r1 = r3.f579
            if (r1 != 0) goto L16
            android.content.Context r1 = r3.getContext()
        L16:
            t5 r3 = new t5
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r3.<init>()
            r3.f10200 = r4
            boolean r2 = r4 instanceof android.widget.ListAdapter
            if (r2 == 0) goto L2a
            r2 = r4
            android.widget.ListAdapter r2 = (android.widget.ListAdapter) r2
            r3.f10201 = r2
        L2a:
            if (r1 == 0) goto L35
            boolean r2 = r4 instanceof android.widget.ThemedSpinnerAdapter
            if (r2 == 0) goto L35
            android.widget.ThemedSpinnerAdapter r4 = (android.widget.ThemedSpinnerAdapter) r4
            p000.AbstractC0749r5.m5066(r4, r1)
        L35:
            r0.mo336(r3)
        L38:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            o4 r0 = r0.f578
            if (r0 == 0) goto La
            r0.m4198()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            o4 r0 = r0.f578
            if (r0 == 0) goto La
            r0.m4199(r1)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto Lb
            r0.mo333(r2)
            r0.mo5370(r2)
            return
        Lb:
            super.setDropDownHorizontalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto L8
            r0.mo5369(r2)
            return
        L8:
            super.setDropDownVerticalOffset(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto L7
            r1.f584 = r2
            return
        L7:
            super.setDropDownWidth(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto L8
            r0.mo5368(r2)
            return
        L8:
            super.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            x5 r0 = r1.f583
            if (r0 == 0) goto L8
            r0.mo332(r2)
            return
        L8:
            super.setPrompt(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            o4 r0 = r0.f578
            if (r0 == 0) goto L7
            r0.m4201(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            o4 r0 = r0.f578
            if (r0 == 0) goto L7
            r0.m4202(r1)
        L7:
            return
    }

    /* JADX INFO: renamed from: α */
    public final int m271(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
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
            android.graphics.Rect r10 = r10.f585
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
