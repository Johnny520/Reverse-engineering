package defpackage;

/* JADX INFO: renamed from: ᛸᛳᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1454 extends android.widget.TextView {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.util.concurrent.Future f6390;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C2355 f6391;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1181 f6392;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0866 f6393;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f6394;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0682 f6395;

    public C1454(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public C1454(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            defpackage.AbstractC0322.m994(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.f6394 = r1
            r1 = 0
            r0.f6395 = r1
            android.content.Context r1 = r0.getContext()
            defpackage.AbstractC2218.m3609(r1, r0)
            ᛵᛴᛴᛳ r1 = new ᛵᛴᛴᛳ
            r1.<init>(r0)
            r0.f6393 = r1
            r1.m1824(r2, r3)
            ᛶᲈᛳᛵ r1 = new ᛶᲈᛳᛵ
            r1.<init>(r0)
            r0.f6392 = r1
            r1.m2310(r2, r3)
            r1.m2309()
            ᲈᲇᲀᛲ r0 = r0.getEmojiTextViewHelper()
            r0.m3854(r2, r3)
            return
    }

    private defpackage.C2355 getEmojiTextViewHelper() {
            r1 = this;
            ᲈᲇᲀᛲ r0 = r1.f6391
            if (r0 != 0) goto Lb
            ᲈᲇᲀᛲ r0 = new ᲈᲇᲀᛲ
            r0.<init>(r1)
            r1.f6391 = r0
        Lb:
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            ᛵᛴᛴᛳ r0 = r1.f6393
            if (r0 == 0) goto La
            r0.m1836()
        La:
            ᛶᲈᛳᛵ r1 = r1.f6392
            if (r1 == 0) goto L11
            r1.m2309()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            ᲁᛵᲀᛷ r1 = r1.getSuperCaller()
            ᛴᛵᲇᲇ r1 = (defpackage.C0682) r1
            java.lang.Object r1 = r1.f3286
            ᛸᛳᛳᲈ r1 = (defpackage.C1454) r1
            int r1 = super.getAutoSizeMaxTextSize()
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            ᲁᛵᲀᛷ r1 = r1.getSuperCaller()
            ᛴᛵᲇᲇ r1 = (defpackage.C0682) r1
            java.lang.Object r1 = r1.f3286
            ᛸᛳᛳᲈ r1 = (defpackage.C1454) r1
            int r1 = super.getAutoSizeMinTextSize()
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            ᲁᛵᲀᛷ r1 = r1.getSuperCaller()
            ᛴᛵᲇᲇ r1 = (defpackage.C0682) r1
            java.lang.Object r1 = r1.f3286
            ᛸᛳᛳᲈ r1 = (defpackage.C1454) r1
            int r1 = super.getAutoSizeStepGranularity()
            return r1
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            ᲁᛵᲀᛷ r1 = r1.getSuperCaller()
            ᛴᛵᲇᲇ r1 = (defpackage.C0682) r1
            java.lang.Object r1 = r1.f3286
            ᛸᛳᛳᲈ r1 = (defpackage.C1454) r1
            int[] r1 = super.getAutoSizeTextAvailableSizes()
            return r1
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            ᲁᛵᲀᛷ r1 = r1.getSuperCaller()
            ᛴᛵᲇᲇ r1 = (defpackage.C0682) r1
            java.lang.Object r1 = r1.f3286
            ᛸᛳᛳᲈ r1 = (defpackage.C1454) r1
            int r1 = super.getAutoSizeTextType()
            r0 = 1
            if (r1 != r0) goto L14
            return r0
        L14:
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

    public defpackage.InterfaceC1864 getSuperCaller() {
            r1 = this;
            ᛴᛵᲇᲇ r0 = r1.f6395
            if (r0 != 0) goto Lb
            ᛴᛵᲇᲇ r0 = new ᛴᛵᲇᲇ
            r0.<init>(r1)
            r1.f6395 = r0
        Lb:
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f6393
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1823()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f6393
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1826()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f6392
            android.content.res.ColorStateList r0 = r0.m2306()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f6392
            android.graphics.PorterDuff$Mode r0 = r0.m2305()
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r2 = this;
            java.util.concurrent.Future r0 = r2.f6390
            if (r0 != 0) goto L5
            goto L15
        L5:
            r1 = 0
            r2.f6390 = r1     // Catch: java.lang.Throwable -> L15
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
            ᲁᛵᲀᛷ r0 = r0.getSuperCaller()
            ᛴᛵᲇᲇ r0 = (defpackage.C0682) r0
            java.lang.Object r0 = r0.f3286
            ᛸᛳᛳᲈ r0 = (defpackage.C1454) r0
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public defpackage.C0073 getTextMetricsParamsCompat() {
            r1 = this;
            ᛱᛴᛴᲇ r0 = new ᛱᛴᛴᲇ
            android.text.PrecomputedText$Params r1 = r1.getTextMetricsParams()
            r0.<init>(r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            ᛶᲈᛳᛵ r1 = r2.f6392
            r1.getClass()
            defpackage.AbstractC2193.m3590(r3, r0, r2)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            ᛶᲈᛳᛵ r0 = r0.f6392
            if (r0 == 0) goto Lc
            r0.getClass()
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
        Lc:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            java.util.concurrent.Future r0 = r2.f6390
            if (r0 != 0) goto L5
            goto L15
        L5:
            r1 = 0
            r2.f6390 = r1     // Catch: java.lang.Throwable -> L15
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
            ᛶᲈᛳᛵ r0 = r0.f6392
            if (r0 == 0) goto L9
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
        L9:
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            ᲈᲇᲀᛲ r0 = r0.getEmojiTextViewHelper()
            r0.m3855(r1)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            ᲁᛵᲀᛷ r1 = r1.getSuperCaller()
            ᛴᛵᲇᲇ r1 = (defpackage.C0682) r1
            java.lang.Object r1 = r1.f3286
            ᛸᛳᛳᲈ r1 = (defpackage.C1454) r1
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            ᲁᛵᲀᛷ r1 = r1.getSuperCaller()
            ᛴᛵᲇᲇ r1 = (defpackage.C0682) r1
            java.lang.Object r1 = r1.f3286
            ᛸᛳᛳᲈ r1 = (defpackage.C1454) r1
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            ᲁᛵᲀᛷ r1 = r1.getSuperCaller()
            ᛴᛵᲇᲇ r1 = (defpackage.C0682) r1
            java.lang.Object r1 = r1.f3286
            ᛸᛳᛳᲈ r1 = (defpackage.C1454) r1
            super.setAutoSizeTextTypeWithDefaults(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            ᛵᛴᛴᛳ r0 = r0.f6393
            if (r0 == 0) goto La
            r0.m1832()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            ᛵᛴᛴᛳ r0 = r0.f6393
            if (r0 == 0) goto La
            r0.m1838(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f6392
            if (r0 == 0) goto La
            r0.m2309()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f6392
            if (r0 == 0) goto La
            r0.m2309()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = defpackage.AbstractC1592.m2873(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = defpackage.AbstractC1592.m2873(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = defpackage.AbstractC1592.m2873(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = defpackage.AbstractC1592.m2873(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            ᛶᲈᛳᛵ r2 = r2.f6392
            if (r2 == 0) goto L2d
            r2.m2309()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f6392
            if (r0 == 0) goto La
            r0.m2309()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = defpackage.AbstractC1592.m2873(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = defpackage.AbstractC1592.m2873(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = defpackage.AbstractC1592.m2873(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = defpackage.AbstractC1592.m2873(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            ᛶᲈᛳᛵ r2 = r2.f6392
            if (r2 == 0) goto L2d
            r2.m2309()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f6392
            if (r0 == 0) goto La
            r0.m2309()
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
            ᲈᲇᲀᛲ r0 = r0.getEmojiTextViewHelper()
            r0.m3853(r1)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            ᲈᲇᲀᛲ r0 = r1.getEmojiTextViewHelper()
            ᛸᲈᛸᲈ r0 = r0.f10166
            java.lang.Object r0 = r0.f7101
            ᲈᛷᛲ r0 = (defpackage.AbstractC2279) r0
            android.text.InputFilter[] r2 = r0.mo392(r2)
            super.setFilters(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r1) {
            r0 = this;
            ᲁᛵᲀᛷ r0 = r0.getSuperCaller()
            ᛴᛵᲇᲇ r0 = (defpackage.C0682) r0
            java.lang.Object r0 = r0.f3285
            ᛸᛳᛳᲈ r0 = (defpackage.C1454) r0
            super.setFirstBaselineToTopHeight(r1)
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r1) {
            r0 = this;
            ᲁᛵᲀᛷ r0 = r0.getSuperCaller()
            ᛴᛵᲇᲇ r0 = (defpackage.C0682) r0
            java.lang.Object r0 = r0.f3285
            ᛸᛳᛳᲈ r0 = (defpackage.C1454) r0
            super.setLastBaselineToBottomHeight(r1)
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r3) {
            r2 = this;
            if (r3 < 0) goto L15
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L14
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L14:
            return
        L15:
            defpackage.C0086.m557()
            return
    }

    public void setPrecomputedText(defpackage.AbstractC1144 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f6393
            if (r0 == 0) goto L7
            r0.m1828(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f6393
            if (r0 == 0) goto L7
            r0.m1827(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f6392
            r0.m2303(r1)
            r0.m2309()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f6392
            r0.m2304(r1)
            r0.m2309()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            ᛶᲈᛳᛵ r0 = r0.f6392
            if (r0 == 0) goto La
            r0.m2311(r1, r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r1) {
            r0 = this;
            ᲁᛵᲀᛷ r0 = r0.getSuperCaller()
            ᛴᛵᲇᲇ r0 = (defpackage.C0682) r0
            java.lang.Object r0 = r0.f3286
            ᛸᛳᛳᲈ r0 = (defpackage.C1454) r0
            super.setTextClassifier(r1)
            return
    }

    public void setTextFuture(java.util.concurrent.Future<defpackage.AbstractC1144> r1) {
            r0 = this;
            r0.f6390 = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(defpackage.C0073 r6) {
            r5 = this;
            android.text.TextDirectionHeuristic r0 = r6.f783
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
            android.text.TextPaint r1 = r6.f782
            r0.set(r1)
            int r0 = r6.f781
            r5.setBreakStrategy(r0)
            int r6 = r6.f780
            r5.setHyphenationFrequency(r6)
            return
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r2, float r3) {
            r1 = this;
            java.lang.reflect.Method r0 = defpackage.AbstractC1211.f5457
            super.setTextSize(r2, r3)
            return
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.f6394
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 == 0) goto L1c
            if (r4 <= 0) goto L1c
            android.content.Context r0 = r2.getContext()
            ᛸᛵᛴᛲ r1 = defpackage.AbstractC0796.f3688
            if (r0 == 0) goto L16
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r4)
            goto L1d
        L16:
            java.lang.String r2 = "Context cannot be null"
            defpackage.C2264.m3684(r2)
            return
        L1c:
            r0 = 0
        L1d:
            r1 = 1
            r2.f6394 = r1
            if (r0 == 0) goto L23
            r3 = r0
        L23:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L2a
            r2.f6394 = r0
            return
        L2a:
            r3 = move-exception
            r2.f6394 = r0
            throw r3
    }
}
