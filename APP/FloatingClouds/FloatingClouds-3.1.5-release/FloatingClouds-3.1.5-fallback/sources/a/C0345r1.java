package a;

/* JADX INFO: renamed from: a.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0345r1 extends android.widget.TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.G0 f662a;
    public final a.C0310p1 b;
    public a.C0058b1 c;
    public boolean d;
    public a.C0345r1.c e;
    public java.util.concurrent.Future<a.Gc> f;

    /* JADX INFO: renamed from: a.r1$a */
    public interface a {
        void a(int r1);

        void b(int r1);

        void c(int r1, float r2);
    }

    /* JADX INFO: renamed from: a.r1$b */
    public class b implements a.C0345r1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0345r1 f663a;

        public b(a.C0345r1 r1) {
                r0 = this;
                r0.<init>()
                r0.f663a = r1
                return
        }

        @Override // a.C0345r1.a
        public void c(int r1, float r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: a.r1$c */
    public class c extends a.C0345r1.b {
        public final /* synthetic */ a.C0345r1 b;

        public c(a.C0345r1 r1) {
                r0 = this;
                r0.b = r1
                r0.<init>(r1)
                return
        }

        @Override // a.C0345r1.a
        public final void a(int r2) {
                r1 = this;
                a.r1 r0 = r1.b
                a.C0345r1.e(r0, r2)
                return
        }

        @Override // a.C0345r1.a
        public final void b(int r2) {
                r1 = this;
                a.r1 r0 = r1.b
                a.C0345r1.d(r0, r2)
                return
        }
    }

    /* JADX INFO: renamed from: a.r1$d */
    public class d extends a.C0345r1.c {
        public final /* synthetic */ a.C0345r1 c;

        public d(a.C0345r1 r1) {
                r0 = this;
                r0.c = r1
                r0.<init>(r1)
                return
        }

        @Override // a.C0345r1.b, a.C0345r1.a
        public final void c(int r2, float r3) {
                r1 = this;
                a.r1 r0 = r1.c
                a.C0345r1.f(r0, r2, r3)
                return
        }
    }

    public C0345r1(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public C0345r1(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            a.C0252lf.a(r1)
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.d = r1
            r1 = 0
            r0.e = r1
            android.content.Context r1 = r0.getContext()
            a.C0109df.a(r0, r1)
            a.G0 r1 = new a.G0
            r1.<init>(r0)
            r0.f662a = r1
            r1.d(r2, r3)
            a.p1 r1 = new a.p1
            r1.<init>(r0)
            r0.b = r1
            r1.f(r2, r3)
            r1.b()
            a.b1 r1 = r0.getEmojiTextViewHelper()
            r1.b(r2, r3)
            return
    }

    public static /* synthetic */ void d(a.C0345r1 r0, int r1) {
            super.setFirstBaselineToTopHeight(r1)
            return
    }

    public static /* synthetic */ void e(a.C0345r1 r0, int r1) {
            super.setLastBaselineToBottomHeight(r1)
            return
    }

    public static /* synthetic */ void f(a.C0345r1 r0, int r1, float r2) {
            super.setLineHeight(r1, r2)
            return
    }

    private a.C0058b1 getEmojiTextViewHelper() {
            r1 = this;
            a.b1 r0 = r1.c
            if (r0 != 0) goto Lb
            a.b1 r0 = new a.b1
            r0.<init>(r1)
            r1.c = r0
        Lb:
            a.b1 r0 = r1.c
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            a.G0 r0 = r1.f662a
            if (r0 == 0) goto La
            r0.a()
        La:
            a.p1 r0 = r1.b
            if (r0 == 0) goto L11
            r0.b()
        L11:
            return
    }

    public final void g() {
            r4 = this;
            java.util.concurrent.Future<a.Gc> r0 = r4.f
            if (r0 == 0) goto L2e
            r1 = 0
            r4.f = r1     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L2e
            a.Gc r0 = (a.Gc) r0     // Catch: java.lang.Throwable -> L2e
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2e
            r3 = 29
            if (r2 < r3) goto L1e
            r0.getClass()     // Catch: java.lang.Throwable -> L2e
            java.lang.CharSequence r0 = a.Ze.b.a(r1)     // Catch: java.lang.Throwable -> L2e
            r4.setText(r0)     // Catch: java.lang.Throwable -> L2e
            return
        L1e:
            a.Gc$a r2 = new a.Gc$a     // Catch: java.lang.Throwable -> L2e
            android.text.PrecomputedText$Params r3 = a.Ze.b.c(r4)     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            r0.getClass()     // Catch: java.lang.Throwable -> L2e
            r2.a(r1)     // Catch: java.lang.Throwable -> L2e
            throw r1     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            int r0 = super.getAutoSizeMinTextSize()
            return r0
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            int r0 = super.getAutoSizeStepGranularity()
            return r0
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
    }

    @Override // android.widget.TextView
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
            r2 = this;
            a.r1$a r0 = r2.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            int r0 = super.getAutoSizeTextType()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = a.Ze.b(r0)
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

    public a.C0345r1.a getSuperCaller() {
            r2 = this;
            a.r1$c r0 = r2.e
            if (r0 != 0) goto L19
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L12
            a.r1$d r0 = new a.r1$d
            r0.<init>(r2)
            r2.e = r0
            goto L19
        L12:
            a.r1$c r0 = new a.r1$c
            r0.<init>(r2)
            r2.e = r0
        L19:
            a.r1$c r0 = r2.e
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            a.G0 r0 = r1.f662a
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            a.G0 r0 = r1.f662a
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            a.p1 r0 = r1.b
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            a.p1 r0 = r1.b
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r1 = this;
            r1.g()
            java.lang.CharSequence r0 = super.getText()
            return r0
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    public a.Gc.a getTextMetricsParamsCompat() {
            r2 = this;
            a.Gc$a r0 = new a.Gc$a
            android.text.PrecomputedText$Params r1 = a.Ze.b.c(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            a.p1 r1 = r2.b
            r1.getClass()
            a.C0310p1.h(r3, r0, r2)
            a.C0435w1.L(r3, r0, r2)
            return r0
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L22
            r1 = 33
            if (r0 >= r1) goto L22
            boolean r0 = r2.onCheckIsTextEditor()
            if (r0 == 0) goto L22
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L22:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = r0
            a.p1 r2 = r1.b
            if (r2 == 0) goto Lb
            r2.getClass()
        Lb:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            r0.g()
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            a.b1 r0 = r1.getEmojiTextViewHelper()
            r0.c(r2)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            super.setAutoSizeTextTypeWithDefaults(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            a.G0 r1 = r0.f662a
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            a.G0 r0 = r1.f662a
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            a.p1 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            a.p1 r1 = r0.b
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
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = a.C0435w1.A(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = a.C0435w1.A(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = a.C0435w1.A(r0, r6)
        L23:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r4, r5, r1)
            a.p1 r3 = r2.b
            if (r3 == 0) goto L2d
            r3.b()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            a.p1 r1 = r0.b
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
            android.graphics.drawable.Drawable r3 = a.C0435w1.A(r0, r3)
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r4 = a.C0435w1.A(r0, r4)
            goto L15
        L14:
            r4 = r1
        L15:
            if (r5 == 0) goto L1c
            android.graphics.drawable.Drawable r5 = a.C0435w1.A(r0, r5)
            goto L1d
        L1c:
            r5 = r1
        L1d:
            if (r6 == 0) goto L23
            android.graphics.drawable.Drawable r1 = a.C0435w1.A(r0, r6)
        L23:
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r5, r1)
            a.p1 r3 = r2.b
            if (r3 == 0) goto L2d
            r3.b()
        L2d:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            a.p1 r1 = r0.b
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            a.b1 r0 = r1.getEmojiTextViewHelper()
            r0.d(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            a.b1 r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.a(r2)
            super.setFilters(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r2) {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            r0.b(r2)
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r2) {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            r0.a(r2)
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
            r0 = this;
            a.Ze.a(r0, r1)
            return
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int r3, float r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            a.r1$a r0 = r2.getSuperCaller()
            r0.c(r3, r4)
            return
        Le:
            if (r0 < r1) goto L14
            a.Ze.c.a(r2, r3, r4)
            return
        L14:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r0)
            int r3 = java.lang.Math.round(r3)
            a.Ze.a(r2, r3)
            return
    }

    public void setPrecomputedText(a.Gc r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L12
            r4.getClass()
            java.lang.CharSequence r4 = a.Ze.b.a(r2)
            r3.setText(r4)
            return
        L12:
            a.Gc$a r0 = new a.Gc$a
            android.text.PrecomputedText$Params r1 = a.Ze.b.c(r3)
            r0.<init>(r1)
            r4.getClass()
            r0.a(r2)
            throw r2
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.G0 r0 = r1.f662a
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.G0 r0 = r1.f662a
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.p1 r0 = r1.b
            r0.i(r2)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.p1 r0 = r1.b
            r0.j(r2)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            a.p1 r0 = r1.b
            if (r0 == 0) goto La
            r0.g(r2, r3)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r2) {
            r1 = this;
            a.r1$a r0 = r1.getSuperCaller()
            a.r1$b r0 = (a.C0345r1.b) r0
            a.r1 r0 = r0.f663a
            super.setTextClassifier(r2)
            return
    }

    public void setTextFuture(java.util.concurrent.Future<a.Gc> r1) {
            r0 = this;
            r0.f = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(a.Gc.a r6) {
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
            r5.setTextDirection(r2)
            android.text.TextPaint r0 = r5.getPaint()
            android.text.TextPaint r1 = r6.f100a
            r0.set(r1)
            int r0 = r6.c
            a.Ze.a.e(r5, r0)
            int r6 = r6.d
            a.Ze.a.h(r5, r6)
            return
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface r3, int r4) {
            r2 = this;
            boolean r0 = r2.d
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 == 0) goto L1e
            if (r4 <= 0) goto L1e
            android.content.Context r0 = r2.getContext()
            a.Rf r1 = a.Mf.f178a
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
            r2.d = r1
            if (r0 == 0) goto L25
            r3 = r0
        L25:
            r0 = 0
            super.setTypeface(r3, r4)     // Catch: java.lang.Throwable -> L2c
            r2.d = r0
            return
        L2c:
            r3 = move-exception
            r2.d = r0
            throw r3
    }
}
