package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲀᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0796 extends android.widget.TextView {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0797 f2591;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0925 f2592;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0230 f2593;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0524 f2594;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f2595;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public java.util.concurrent.Future f2596;

    public AbstractC0796(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            java.lang.Object r0 = xhss.AbstractC0635.f2188
            android.content.res.Resources r0 = r4.getResources()
            boolean r0 = r0 instanceof xhss.AbstractC1117
            if (r0 != 0) goto Lf
            r4.getResources()
            int r0 = xhss.AbstractC1182.f3815
        Lf:
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r3.<init>(r4, r5, r0)
            r4 = 0
            r3.f2595 = r4
            r1 = 0
            r3.f2593 = r1
            android.content.Context r1 = r3.getContext()
            xhss.AbstractC0313.m652(r3, r1)
            xhss.ᛵᲇᲇᲇ r1 = new xhss.ᛵᲇᲇᲇ
            r1.<init>(r3)
            r3.f2594 = r1
            r1.m937(r5, r0)
            xhss.ᛸᲀᛳᲁ r1 = new xhss.ᛸᲀᛳᲁ
            r1.<init>(r3)
            r3.f2591 = r1
            r1.m1366(r5, r0)
            r1.m1363()
            xhss.ᲁᛱᲇᲈ r3 = r3.getEmojiTextViewHelper()
            xhss.ᛸᲀᛲᛴ r1 = r3.f2982
            android.content.Context r1 = r1.getContext()
            int[] r2 = xhss.AbstractC0293.f1125
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r5, r2, r0, r4)
            r5 = 14
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L57
            r1 = 1
            if (r0 == 0) goto L59
            boolean r1 = r4.getBoolean(r5, r1)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r3 = move-exception
            goto L66
        L59:
            r4.recycle()
            xhss.ᲇᛵᛲᲁ r3 = r3.f2981
            java.lang.Object r3 = r3.f3349
            xhss.ᛵᛵᛲᲈ r3 = (xhss.AbstractC0473) r3
            r3.mo873(r1)
            return
        L66:
            r4.recycle()
            throw r3
    }

    private xhss.C0925 getEmojiTextViewHelper() {
            r1 = this;
            xhss.ᲁᛱᲇᲈ r0 = r1.f2592
            if (r0 != 0) goto Lb
            xhss.ᲁᛱᲇᲈ r0 = new xhss.ᲁᛱᲇᲈ
            r0.<init>(r1)
            r1.f2592 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static /* synthetic */ void m1361(xhss.AbstractC0796 r0, int r1, float r2) {
            super.setLineHeight(r1, r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            xhss.ᛵᲇᲇᲇ r0 = r1.f2594
            if (r0 == 0) goto La
            r0.m938()
        La:
            xhss.ᛸᲀᛳᲁ r1 = r1.f2591
            if (r1 == 0) goto L11
            r1.m1363()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f893
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f893
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            int r0 = super.getAutoSizeMinTextSize()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f893
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            int r0 = super.getAutoSizeStepGranularity()
            return r0
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f893
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
            r1 = this;
            xhss.ᲁᛷᲁ r1 = r1.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r1 = (xhss.C0230) r1
            java.lang.Object r1 = r1.f893
            xhss.ᛸᲀᛲᛴ r1 = (xhss.AbstractC0796) r1
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

    public xhss.InterfaceC0969 getSuperCaller() {
            r2 = this;
            xhss.ᛳᛱᛲᲀ r0 = r2.f2593
            if (r0 != 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L12
            xhss.ᛵᲀᛷᲈ r0 = new xhss.ᛵᲀᛷᲈ
            r0.<init>(r2)
            r2.f2593 = r0
            return r0
        L12:
            xhss.ᛳᛱᛲᲀ r0 = new xhss.ᛳᛱᛲᲀ
            r0.<init>(r2)
            r2.f2593 = r0
        L19:
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            r0 = 0
            xhss.ᛵᲇᲇᲇ r1 = r1.f2594
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f1914
            xhss.ᛵᛳᛱᲇ r1 = (xhss.C0451) r1
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f1631
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            return r1
        L10:
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            r0 = 0
            xhss.ᛵᲇᲇᲇ r1 = r1.f2594
            if (r1 == 0) goto L10
            java.lang.Object r1 = r1.f1914
            xhss.ᛵᛳᛱᲇ r1 = (xhss.C0451) r1
            if (r1 == 0) goto L10
            java.io.Serializable r1 = r1.f1633
            android.graphics.PorterDuff$Mode r1 = (android.graphics.PorterDuff.Mode) r1
            return r1
        L10:
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            xhss.ᛸᲀᛳᲁ r0 = r0.f2591
            xhss.ᛵᛳᛱᲇ r0 = r0.f2603
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.f1631
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            xhss.ᛸᲀᛳᲁ r0 = r0.f2591
            xhss.ᛵᛳᛱᲇ r0 = r0.f2603
            if (r0 == 0) goto Lb
            java.io.Serializable r0 = r0.f1633
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r2 = this;
            java.util.concurrent.Future r0 = r2.f2596
            if (r0 != 0) goto L5
            goto L15
        L5:
            r1 = 0
            r2.f2596 = r1     // Catch: java.lang.Throwable -> L15
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
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f893
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public xhss.C0642 getTextMetricsParamsCompat() {
            r1 = this;
            xhss.ᛷᛳᲀᛳ r0 = new xhss.ᛷᛳᲀᛳ
            android.text.PrecomputedText$Params r1 = r1.getTextMetricsParams()
            r0.<init>(r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            xhss.ᛸᲀᛳᲁ r1 = r2.f2591
            r1.getClass()
            if (r0 == 0) goto L1c
            java.lang.CharSequence r3 = r3.hintText
            if (r3 != 0) goto L1c
            android.view.ViewParent r2 = r2.getParent()
        L13:
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L1c
            android.view.ViewParent r2 = r2.getParent()
            goto L13
        L1c:
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
            xhss.ᛸᲀᛳᲁ r0 = r0.f2591
            if (r0 == 0) goto La
            r0.getClass()
        La:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            java.util.concurrent.Future r0 = r2.f2596
            if (r0 != 0) goto L5
            goto L15
        L5:
            r1 = 0
            r2.f2596 = r1     // Catch: java.lang.Throwable -> L15
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
            xhss.ᲁᛱᲇᲈ r0 = r0.getEmojiTextViewHelper()
            xhss.ᲇᛵᛲᲁ r0 = r0.f2981
            java.lang.Object r0 = r0.f3349
            xhss.ᛵᛵᛲᲈ r0 = (xhss.AbstractC0473) r0
            r0.mo871(r1)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4) {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f893
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            super.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r1, int r2) {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f893
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            super.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r1) {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f893
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            super.setAutoSizeTextTypeWithDefaults(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            xhss.ᛵᲇᲇᲇ r0 = r0.f2594
            if (r0 == 0) goto L11
            r1 = -1
            r0.f1915 = r1
            r1 = 0
            r0.m939(r1)
            r0.m938()
        L11:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r4) {
            r3 = this;
            super.setBackgroundResource(r4)
            xhss.ᛵᲇᲇᲇ r3 = r3.f2594
            if (r3 == 0) goto L2a
            r3.f1915 = r4
            java.lang.Object r0 = r3.f1913
            xhss.ᛲᛳᲈᛲ r0 = (xhss.C0150) r0
            if (r0 == 0) goto L23
            java.lang.Object r1 = r3.f1912
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r1 = r1.getContext()
            monitor-enter(r0)
            xhss.ᛱᲈᲁᛴ r2 = r0.f631     // Catch: java.lang.Throwable -> L20
            android.content.res.ColorStateList r4 = r2.m317(r1, r4)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            goto L24
        L20:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r3
        L23:
            r4 = 0
        L24:
            r3.m939(r4)
            r3.m938()
        L2a:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            xhss.ᛸᲀᛳᲁ r0 = r0.f2591
            if (r0 == 0) goto La
            r0.m1363()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            xhss.ᛸᲀᛳᲁ r0 = r0.f2591
            if (r0 == 0) goto La
            r0.m1363()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = xhss.C0915.m1498(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = xhss.C0915.m1498(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = xhss.C0915.m1498(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = xhss.C0915.m1498(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            xhss.ᛸᲀᛳᲁ r2 = r2.f2591
            if (r2 == 0) goto L2d
            r2.m1363()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            xhss.ᛸᲀᛳᲁ r0 = r0.f2591
            if (r0 == 0) goto La
            r0.m1363()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = xhss.C0915.m1498(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = xhss.C0915.m1498(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = xhss.C0915.m1498(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = xhss.C0915.m1498(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            xhss.ᛸᲀᛳᲁ r2 = r2.f2591
            if (r2 == 0) goto L2d
            r2.m1363()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            xhss.ᛸᲀᛳᲁ r0 = r0.f2591
            if (r0 == 0) goto La
            r0.m1363()
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
            xhss.ᲁᛱᲇᲈ r0 = r0.getEmojiTextViewHelper()
            xhss.ᲇᛵᛲᲁ r0 = r0.f2981
            java.lang.Object r0 = r0.f3349
            xhss.ᛵᛵᛲᲈ r0 = (xhss.AbstractC0473) r0
            r0.mo873(r1)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            xhss.ᲁᛱᲇᲈ r0 = r1.getEmojiTextViewHelper()
            xhss.ᲇᛵᛲᲁ r0 = r0.f2981
            java.lang.Object r0 = r0.f3349
            xhss.ᛵᛵᛲᲈ r0 = (xhss.AbstractC0473) r0
            android.text.InputFilter[] r2 = r0.mo872(r2)
            super.setFilters(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r1) {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f894
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            super.setFirstBaselineToTopHeight(r1)
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r1) {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f894
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            super.setLastBaselineToBottomHeight(r1)
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
            r0 = this;
            xhss.C0614.m1061(r0, r1)
            return
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int r3, float r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            xhss.ᲁᛷᲁ r2 = r2.getSuperCaller()
            r2.mo524(r3, r4)
            return
        Le:
            if (r0 < r1) goto L14
            xhss.AbstractC0449.m824(r2, r3, r4)
            return
        L14:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r0)
            int r3 = java.lang.Math.round(r3)
            xhss.C0614.m1061(r2, r3)
            return
    }

    public void setPrecomputedText(xhss.AbstractC0325 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            xhss.ᛵᲇᲇᲇ r1 = r1.f2594
            if (r1 == 0) goto L19
            java.lang.Object r0 = r1.f1914
            xhss.ᛵᛳᛱᲇ r0 = (xhss.C0451) r0
            if (r0 != 0) goto L11
            xhss.ᛵᛳᛱᲇ r0 = new xhss.ᛵᛳᛱᲇ
            r0.<init>()
            r1.f1914 = r0
        L11:
            r0.f1631 = r2
            r2 = 1
            r0.f1630 = r2
            r1.m938()
        L19:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            xhss.ᛵᲇᲇᲇ r1 = r1.f2594
            if (r1 == 0) goto L19
            java.lang.Object r0 = r1.f1914
            xhss.ᛵᛳᛱᲇ r0 = (xhss.C0451) r0
            if (r0 != 0) goto L11
            xhss.ᛵᛳᛱᲇ r0 = new xhss.ᛵᛳᛱᲇ
            r0.<init>()
            r1.f1914 = r0
        L11:
            r0.f1633 = r2
            r2 = 1
            r0.f1632 = r2
            r1.m938()
        L19:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            xhss.ᛸᲀᛳᲁ r2 = r2.f2591
            xhss.ᛵᛳᛱᲇ r0 = r2.f2603
            if (r0 != 0) goto Ld
            xhss.ᛵᛳᛱᲇ r0 = new xhss.ᛵᛳᛱᲇ
            r0.<init>()
            r2.f2603 = r0
        Ld:
            r1 = r0
            r0.f1631 = r3
            if (r3 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            r0.f1630 = r3
            r2.f2597 = r1
            r2.f2598 = r1
            r2.f2607 = r1
            r2.f2599 = r1
            r2.f2608 = r1
            r2.f2606 = r1
            r2.m1363()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            xhss.ᛸᲀᛳᲁ r2 = r2.f2591
            xhss.ᛵᛳᛱᲇ r0 = r2.f2603
            if (r0 != 0) goto Ld
            xhss.ᛵᛳᛱᲇ r0 = new xhss.ᛵᛳᛱᲇ
            r0.<init>()
            r2.f2603 = r0
        Ld:
            r1 = r0
            r0.f1633 = r3
            if (r3 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            r0.f1632 = r3
            r2.f2597 = r1
            r2.f2598 = r1
            r2.f2607 = r1
            r2.f2599 = r1
            r2.f2608 = r1
            r2.f2606 = r1
            r2.m1363()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            xhss.ᛸᲀᛳᲁ r0 = r0.f2591
            if (r0 == 0) goto La
            r0.m1364(r1, r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r1) {
            r0 = this;
            xhss.ᲁᛷᲁ r0 = r0.getSuperCaller()
            xhss.ᛳᛱᛲᲀ r0 = (xhss.C0230) r0
            java.lang.Object r0 = r0.f893
            xhss.ᛸᲀᛲᛴ r0 = (xhss.AbstractC0796) r0
            super.setTextClassifier(r1)
            return
    }

    public void setTextFuture(java.util.concurrent.Future<xhss.AbstractC0325> r1) {
            r0 = this;
            r0.f2596 = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(xhss.C0642 r6) {
            r5 = this;
            android.text.TextDirectionHeuristic r0 = r6.f2197
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
            android.text.TextPaint r1 = r6.f2199
            r0.set(r1)
            int r0 = r6.f2198
            r5.setBreakStrategy(r0)
            int r6 = r6.f2200
            r5.setHyphenationFrequency(r6)
            return
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.f2595
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 == 0) goto L1c
            if (r4 <= 0) goto L1c
            android.content.Context r0 = r2.getContext()
            xhss.ᛶᛵᲇᛸ r1 = xhss.AbstractC0101.f469
            if (r0 == 0) goto L16
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r4)
            goto L1d
        L16:
            java.lang.String r2 = "Context cannot be null"
            xhss.C0532.m959(r2)
            return
        L1c:
            r0 = 0
        L1d:
            r1 = 1
            r2.f2595 = r1
            if (r0 == 0) goto L23
            r3 = r0
        L23:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L2a
            r2.f2595 = r0
            return
        L2a:
            r3 = move-exception
            r2.f2595 = r0
            throw r3
    }
}
