package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class g5 extends android.widget.TextView {
    public final defpackage.v2 a;
    public final defpackage.d5 b;
    public final defpackage.d4 c;
    public defpackage.x3 d;
    public boolean e;
    public defpackage.l0 f;
    public java.util.concurrent.Future g;

    public g5(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public g5(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            defpackage.x60.a(r3)
            r2.<init>(r3, r4, r5)
            r3 = 0
            r2.e = r3
            r3 = 0
            r2.f = r3
            android.content.Context r3 = r2.getContext()
            defpackage.r60.a(r2, r3)
            v2 r3 = new v2
            r3.<init>(r2)
            r2.a = r3
            r3.d(r4, r5)
            d5 r3 = new d5
            r3.<init>(r2)
            r2.b = r3
            r3.f(r4, r5)
            r3.b()
            d4 r3 = new d4
            r0 = 4
            r1 = 0
            r3.<init>(r0, r1)
            r3.b = r2
            r2.c = r3
            x3 r3 = r2.getEmojiTextViewHelper()
            r3.a(r4, r5)
            return
    }

    public static /* synthetic */ void d(defpackage.g5 r0, int r1) {
            super.setFirstBaselineToTopHeight(r1)
            return
    }

    public static /* synthetic */ void e(defpackage.g5 r0, int r1) {
            super.setLastBaselineToBottomHeight(r1)
            return
    }

    private defpackage.x3 getEmojiTextViewHelper() {
            r1 = this;
            x3 r0 = r1.d
            if (r0 != 0) goto Lb
            x3 r0 = new x3
            r0.<init>(r1)
            r1.d = r0
        Lb:
            x3 r0 = r1.d
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            v2 r0 = r1.a
            if (r0 == 0) goto La
            r0.a()
        La:
            d5 r0 = r1.b
            if (r0 == 0) goto L11
            r0.b()
        L11:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L13
            e5 r0 = r1.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
        L13:
            d5 r0 = r1.b
            if (r0 == 0) goto L20
            n5 r0 = r0.i
            float r0 = r0.e
            int r0 = java.lang.Math.round(r0)
            return r0
        L20:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L13
            e5 r0 = r1.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            int r0 = super.getAutoSizeMinTextSize()
            return r0
        L13:
            d5 r0 = r1.b
            if (r0 == 0) goto L20
            n5 r0 = r0.i
            float r0 = r0.d
            int r0 = java.lang.Math.round(r0)
            return r0
        L20:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L13
            e5 r0 = r1.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            int r0 = super.getAutoSizeStepGranularity()
            return r0
        L13:
            d5 r0 = r1.b
            if (r0 == 0) goto L20
            n5 r0 = r0.i
            float r0 = r0.c
            int r0 = java.lang.Math.round(r0)
            return r0
        L20:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L13
            e5 r0 = r1.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
        L13:
            d5 r0 = r1.b
            if (r0 == 0) goto L1c
            n5 r0 = r0.i
            int[] r0 = r0.f
            return r0
        L1c:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    @Override // android.widget.TextView
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
            r2 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L16
            e5 r0 = r2.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            int r0 = super.getAutoSizeTextType()
            r1 = 1
            if (r0 != r1) goto L1f
            return r1
        L16:
            d5 r0 = r2.b
            if (r0 == 0) goto L1f
            n5 r0 = r0.i
            int r0 = r0.a
            return r0
        L1f:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r2 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            boolean r1 = r0 instanceof defpackage.o60
            if (r1 == 0) goto Lc
            o60 r0 = (defpackage.o60) r0
            android.view.ActionMode$Callback r0 = r0.a
        Lc:
            return r0
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r2 = this;
            int r0 = r2.getPaddingTop()
            android.text.TextPaint r1 = r2.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r2 = this;
            int r0 = r2.getPaddingBottom()
            android.text.TextPaint r1 = r2.getPaint()
            android.graphics.Paint$FontMetricsInt r1 = r1.getFontMetricsInt()
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    public defpackage.e5 getSuperCaller() {
            r2 = this;
            l0 r0 = r2.f
            if (r0 != 0) goto L1a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L12
            f5 r0 = new f5
            r0.<init>(r2)
            r2.f = r0
            goto L1a
        L12:
            l0 r0 = new l0
            r1 = 4
            r0.<init>(r1, r2)
            r2.f = r0
        L1a:
            l0 r0 = r2.f
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

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            d5 r0 = r1.b
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            d5 r0 = r1.b
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r3 = this;
            java.util.concurrent.Future r0 = r3.g
            if (r0 != 0) goto L5
            goto L1f
        L5:
            r1 = 0
            r3.g = r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f
            r2 = 29
            if (r0 < r2) goto L15
            throw r1     // Catch: java.lang.Throwable -> L1f
        L15:
            defpackage.zt.w(r3)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L19:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r0     // Catch: java.lang.Throwable -> L1f
        L1f:
            java.lang.CharSequence r0 = super.getText()
            return r0
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L1b
            d4 r0 = r2.c
            if (r0 != 0) goto Lb
            goto L1b
        Lb:
            java.lang.Object r1 = r0.c
            android.view.textclassifier.TextClassifier r1 = (android.view.textclassifier.TextClassifier) r1
            if (r1 != 0) goto L1a
            java.lang.Object r0 = r0.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.view.textclassifier.TextClassifier r0 = defpackage.w4.a(r0)
            return r0
        L1a:
            return r1
        L1b:
            e5 r0 = r2.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public defpackage.wx getTextMetricsParamsCompat() {
            r1 = this;
            wx r0 = defpackage.zt.w(r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            d5 r1 = r2.b
            r1.getClass()
            defpackage.d5.h(r3, r0, r2)
            defpackage.a80.v(r3, r0, r2)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = r0
            d5 r2 = r1.b
            if (r2 == 0) goto L11
            boolean r3 = defpackage.cb0.b
            if (r3 != 0) goto L11
            n5 r2 = r2.i
            r2.a()
        L11:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            java.util.concurrent.Future r0 = r3.g
            if (r0 != 0) goto L5
            goto L1f
        L5:
            r1 = 0
            r3.g = r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f
            r2 = 29
            if (r0 < r2) goto L15
            throw r1     // Catch: java.lang.Throwable -> L1f
        L15:
            defpackage.zt.w(r3)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L19:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r0     // Catch: java.lang.Throwable -> L1f
        L1f:
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto L16
            n5 r1 = r1.i
            boolean r2 = defpackage.cb0.b
            if (r2 != 0) goto L16
            boolean r2 = r1.f()
            if (r2 == 0) goto L16
            r1.a()
        L16:
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            x3 r0 = r1.getEmojiTextViewHelper()
            r0.b(r2)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L12
            e5 r0 = r1.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
        L12:
            d5 r0 = r1.b
            if (r0 == 0) goto L19
            r0.i(r2, r3, r4, r5)
        L19:
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L12
            e5 r0 = r1.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
        L12:
            d5 r0 = r1.b
            if (r0 == 0) goto L19
            r0.j(r2, r3)
        L19:
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L12
            e5 r0 = r1.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            super.setAutoSizeTextTypeWithDefaults(r2)
            return
        L12:
            d5 r0 = r1.b
            if (r0 == 0) goto L19
            r0.k(r2)
        L19:
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = defpackage.ff.r(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = defpackage.ff.r(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = defpackage.ff.r(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            d5 r3 = r2.b
            if (r3 == 0) goto L2d
            r3.b()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            if (r3 == 0) goto Lc
            android.graphics.drawable.Drawable r3 = defpackage.ff.r(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = defpackage.ff.r(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = defpackage.ff.r(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = defpackage.ff.r(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            d5 r3 = r2.b
            if (r3 == 0) goto L2d
            r3.b()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            d5 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = defpackage.zt.S(r1, r0)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            x3 r0 = r1.getEmojiTextViewHelper()
            r0.c(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            x3 r0 = r1.getEmojiTextViewHelper()
            l0 r0 = r0.b
            java.lang.Object r0 = r0.b
            a80 r0 = (defpackage.a80) r0
            android.text.InputFilter[] r2 = r0.l(r2)
            super.setFilters(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            e5 r0 = r2.getSuperCaller()
            r0.l(r3)
            return
        Le:
            defpackage.zt.L(r2, r3)
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            e5 r0 = r2.getSuperCaller()
            r0.j(r3)
            return
        Le:
            defpackage.zt.M(r2, r3)
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r3) {
            r2 = this;
            defpackage.zt.e(r3)
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r3 == r0) goto L15
            int r3 = r3 - r0
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r0)
        L15:
            return
    }

    public void setPrecomputedText(defpackage.xx r3) {
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            if (r3 < r0) goto L8
            throw r1
        L8:
            defpackage.zt.w(r2)
            throw r1
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

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            d5 r0 = r1.b
            r0.l(r2)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            d5 r0 = r1.b
            r0.m(r2)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            d5 r0 = r1.b
            if (r0 == 0) goto La
            r0.g(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Le
            d4 r0 = r2.c
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.c = r3
            return
        Le:
            e5 r0 = r2.getSuperCaller()
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            g5 r0 = (defpackage.g5) r0
            super.setTextClassifier(r3)
            return
    }

    public void setTextFuture(java.util.concurrent.Future<defpackage.xx> r1) {
            r0 = this;
            r0.g = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(defpackage.wx r6) {
            r5 = this;
            android.text.TextDirectionHeuristic r0 = r6.b
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
            defpackage.k60.h(r5, r2)
            android.text.TextPaint r0 = r5.getPaint()
            android.text.TextPaint r1 = r6.a
            r0.set(r1)
            int r0 = r6.c
            defpackage.l60.e(r5, r0)
            int r6 = r6.d
            defpackage.l60.h(r5, r6)
            return
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float r4) {
            r2 = this;
            boolean r0 = defpackage.cb0.b
            if (r0 == 0) goto L8
            super.setTextSize(r3, r4)
            return
        L8:
            d5 r1 = r2.b
            if (r1 == 0) goto L19
            n5 r1 = r1.i
            if (r0 != 0) goto L19
            boolean r0 = r1.f()
            if (r0 != 0) goto L19
            r1.g(r3, r4)
        L19:
            return
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.e
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 == 0) goto L1e
            if (r4 <= 0) goto L1e
            android.content.Context r0 = r2.getContext()
            ct r1 = defpackage.b80.a
            if (r0 == 0) goto L16
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r4)
            goto L1f
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context cannot be null"
            r3.<init>(r4)
            throw r3
        L1e:
            r0 = 0
        L1f:
            r1 = 1
            r2.e = r1
            if (r0 == 0) goto L25
            r3 = r0
        L25:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L2c
            r2.e = r0
            return
        L2c:
            r3 = move-exception
            r2.e = r0
            throw r3
    }
}
