package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends android.widget.TextView {

    /* JADX INFO: renamed from: ε */
    public final p000.C0610o4 f586;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0201d6 f587;

    /* JADX INFO: renamed from: η */
    public p000.C0500l5 f588;

    /* JADX INFO: renamed from: θ */
    public boolean f589;

    /* JADX INFO: renamed from: ι */
    public p000.C0574n5 f590;

    /* JADX INFO: renamed from: κ */
    public java.util.concurrent.Future f591;

    public AppCompatTextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatTextView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            p000.o42.m4207(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.f589 = r1
            r1 = 0
            r0.f590 = r1
            android.content.Context r1 = r0.getContext()
            p000.b42.m739(r0, r1)
            o4 r1 = new o4
            r1.<init>(r0)
            r0.f586 = r1
            r1.m4197(r2, r3)
            d6 r1 = new d6
            r1.<init>(r0)
            r0.f587 = r1
            r1.m1661(r2, r3)
            r1.m1658()
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3497(r2, r3)
            return
    }

    private p000.C0500l5 getEmojiTextViewHelper() {
            r1 = this;
            l5 r0 = r1.f588
            if (r0 != 0) goto Lb
            l5 r0 = new l5
            r0.<init>(r1)
            r1.f588 = r0
        Lb:
            l5 r1 = r1.f588
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ void m272(androidx.appcompat.widget.AppCompatTextView r0, int r1, float r2) {
            super.setLineHeight(r1, r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            o4 r0 = r1.f586
            if (r0 == 0) goto La
            r0.m4194()
        La:
            d6 r1 = r1.f587
            if (r1 == 0) goto L11
            r1.m1658()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7387
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7387
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            int r0 = super.getAutoSizeMinTextSize()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7387
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            int r0 = super.getAutoSizeStepGranularity()
            return r0
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7387
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
            r1 = this;
            e6 r1 = r1.getSuperCaller()
            n5 r1 = (p000.C0574n5) r1
            java.lang.Object r1 = r1.f7387
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            int r1 = super.getAutoSizeTextType()
            r0 = 1
            if (r1 != r0) goto L12
            return r0
        L12:
            r1 = 0
            return r1
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            return r0
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r1 = this;
            int r0 = r1.getPaddingTop()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r1 = this;
            int r0 = r1.getPaddingBottom()
            android.text.TextPaint r1 = r1.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    public p000.InterfaceC0237e6 getSuperCaller() {
            r2 = this;
            n5 r0 = r2.f590
            if (r0 != 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L12
            f6 r0 = new f6
            r0.<init>(r2)
            r2.f590 = r0
            goto L19
        L12:
            n5 r0 = new n5
            r0.<init>(r2)
            r2.f590 = r0
        L19:
            n5 r2 = r2.f590
            return r2
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            o4 r0 = r0.f586
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m4195()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            o4 r0 = r0.f586
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m4196()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            d6 r0 = r0.f587
            android.content.res.ColorStateList r0 = r0.m1659()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            d6 r0 = r0.f587
            android.graphics.PorterDuff$Mode r0 = r0.m1660()
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r2 = this;
            java.util.concurrent.Future r0 = r2.f591
            if (r0 != 0) goto L5
            goto L15
        L5:
            r1 = 0
            r2.f591 = r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto Lf
            throw r1     // Catch: java.lang.Throwable -> L15
        Lf:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L15:
            java.lang.CharSequence r2 = super.getText()
            return r2
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7387
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public p000.ni1 getTextMetricsParamsCompat() {
            r1 = this;
            ni1 r0 = new ni1
            android.text.PrecomputedText$Params r1 = r1.getTextMetricsParams()
            r0.<init>(r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            d6 r1 = r2.f587
            r1.getClass()
            p000.kn0.m3344(r3, r0, r2)
            return r0
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L1e
            boolean r0 = r2.onCheckIsTextEditor()
            if (r0 == 0) goto L1e
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L1e:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            d6 r0 = r0.f587
            if (r0 == 0) goto La
            r0.getClass()
        La:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            java.util.concurrent.Future r0 = r2.f591
            if (r0 != 0) goto L5
            goto L15
        L5:
            r1 = 0
            r2.f591 = r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto Lf
            throw r1     // Catch: java.lang.Throwable -> L15
        Lf:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L15:
            super.onMeasure(r3, r4)
            return
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3498(r1)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4) {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7387
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            super.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r1, int r2) {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7387
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            super.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r1) {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7387
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            super.setAutoSizeTextTypeWithDefaults(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            o4 r0 = r0.f586
            if (r0 == 0) goto La
            r0.m4198()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            o4 r0 = r0.f586
            if (r0 == 0) goto La
            r0.m4199(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            d6 r0 = r0.f587
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            d6 r0 = r0.f587
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = p000.ln0.m3603(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = p000.ln0.m3603(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = p000.ln0.m3603(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = p000.ln0.m3603(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            d6 r2 = r2.f587
            if (r2 == 0) goto L2d
            r2.m1658()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            d6 r0 = r0.f587
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = p000.ln0.m3603(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = p000.ln0.m3603(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = p000.ln0.m3603(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = p000.ln0.m3603(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            d6 r2 = r2.f587
            if (r2 == 0) goto L2d
            r2.m1658()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            d6 r0 = r0.f587
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3499(r1)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            l5 r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.m3496(r2)
            super.setFilters(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r1) {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7388
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            super.setFirstBaselineToTopHeight(r1)
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r1) {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7388
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            super.setLastBaselineToBottomHeight(r1)
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
            r0 = this;
            p000.v81.m6134(r0, r1)
            return
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int r3, float r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            e6 r2 = r2.getSuperCaller()
            r2.mo1848(r3, r4)
            return
        Le:
            if (r0 < r1) goto L14
            p000.AbstractC1117.m7300(r2, r3, r4)
            return
        L14:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r0)
            int r3 = java.lang.Math.round(r3)
            p000.v81.m6134(r2, r3)
            return
    }

    public void setPrecomputedText(p000.oi1 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            o4 r0 = r0.f586
            if (r0 == 0) goto L7
            r0.m4201(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            o4 r0 = r0.f586
            if (r0 == 0) goto L7
            r0.m4202(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            d6 r0 = r0.f587
            r0.m1663(r1)
            r0.m1658()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            d6 r0 = r0.f587
            r0.m1664(r1)
            r0.m1658()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            d6 r0 = r0.f587
            if (r0 == 0) goto La
            r0.m1662(r1, r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r1) {
            r0 = this;
            e6 r0 = r0.getSuperCaller()
            n5 r0 = (p000.C0574n5) r0
            java.lang.Object r0 = r0.f7387
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            super.setTextClassifier(r1)
            return
    }

    public void setTextFuture(java.util.concurrent.Future<p000.oi1> r1) {
            r0 = this;
            r0.f591 = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(p000.ni1 r6) {
            r5 = this;
            android.text.TextDirectionHeuristic r0 = r6.f7634
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            r2 = 1
            if (r0 != r1) goto L8
            goto L2c
        L8:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 != r3) goto Ld
            goto L2c
        Ld:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r0 != r4) goto L13
            r2 = 2
            goto L2c
        L13:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LTR
            if (r0 != r4) goto L19
            r2 = 3
            goto L2c
        L19:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.RTL
            if (r0 != r4) goto L1f
            r2 = 4
            goto L2c
        L1f:
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.LOCALE
            if (r0 != r4) goto L25
            r2 = 5
            goto L2c
        L25:
            if (r0 != r3) goto L29
            r2 = 6
            goto L2c
        L29:
            if (r0 != r1) goto L2c
            r2 = 7
        L2c:
            r5.setTextDirection(r2)
            android.text.TextPaint r0 = r5.getPaint()
            android.text.TextPaint r1 = r6.f7633
            r0.set(r1)
            int r0 = r6.f7635
            r5.setBreakStrategy(r0)
            int r6 = r6.f7636
            r5.setHyphenationFrequency(r6)
            return
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.f589
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 == 0) goto L1c
            if (r4 <= 0) goto L1c
            android.content.Context r0 = r2.getContext()
            zz1 r1 = p000.i62.f4928
            if (r0 == 0) goto L16
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r4)
            goto L1d
        L16:
            java.lang.String r2 = "Context cannot be null"
            p000.C1080.m7275(r2)
            return
        L1c:
            r0 = 0
        L1d:
            r1 = 1
            r2.f589 = r1
            if (r0 == 0) goto L23
            r3 = r0
        L23:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L2a
            r2.f589 = r0
            return
        L2a:
            r3 = move-exception
            r2.f589 = r0
            throw r3
    }
}
