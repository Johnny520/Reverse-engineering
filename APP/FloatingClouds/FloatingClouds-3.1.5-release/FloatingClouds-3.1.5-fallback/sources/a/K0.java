package a;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends android.widget.CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.L0 f146a;
    public final a.G0 b;
    public final a.C0310p1 c;
    public a.C0058b1 d;

    public K0(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            int r6 = androidx.appcompat.R.attr.checkedTextViewStyle
            a.C0252lf.a(r8)
            r7.<init>(r8, r9, r6)
            android.content.Context r8 = r7.getContext()
            a.C0109df.a(r7, r8)
            a.p1 r8 = new a.p1
            r8.<init>(r7)
            r7.c = r8
            r8.f(r9, r6)
            r8.b()
            a.G0 r8 = new a.G0
            r8.<init>(r7)
            r7.b = r8
            r8.d(r9, r6)
            a.L0 r8 = new a.L0
            r8.<init>(r7)
            r7.f146a = r8
            android.content.Context r8 = r7.getContext()
            int[] r0 = androidx.appcompat.R.styleable.CheckedTextView
            a.of r8 = a.C0306of.e(r8, r9, r0, r6)
            android.content.res.TypedArray r0 = r8.b
            android.content.Context r2 = r7.getContext()
            int[] r3 = androidx.appcompat.R.styleable.CheckedTextView
            android.content.res.TypedArray r5 = r8.b
            r1 = r7
            r4 = r9
            a.C0414ug.i(r1, r2, r3, r4, r5, r6)
            int r9 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L63
            boolean r9 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L63
            r2 = 0
            if (r9 == 0) goto L66
            int r9 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> L63
            int r9 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L63
            if (r9 == 0) goto L66
            android.content.Context r3 = r7.getContext()     // Catch: java.lang.Throwable -> L63 android.content.res.Resources.NotFoundException -> L66
            android.graphics.drawable.Drawable r9 = a.C0435w1.A(r3, r9)     // Catch: java.lang.Throwable -> L63 android.content.res.Resources.NotFoundException -> L66
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L63 android.content.res.Resources.NotFoundException -> L66
            goto L81
        L63:
            r0 = move-exception
            r9 = r0
            goto Lb4
        L66:
            int r9 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L63
            boolean r9 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L63
            if (r9 == 0) goto L81
            int r9 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> L63
            int r9 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L63
            if (r9 == 0) goto L81
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L63
            android.graphics.drawable.Drawable r9 = a.C0435w1.A(r2, r9)     // Catch: java.lang.Throwable -> L63
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L63
        L81:
            int r9 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L63
            boolean r9 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L63
            if (r9 == 0) goto L92
            int r9 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> L63
            android.content.res.ColorStateList r9 = r8.a(r9)     // Catch: java.lang.Throwable -> L63
            r7.setCheckMarkTintList(r9)     // Catch: java.lang.Throwable -> L63
        L92:
            int r9 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L63
            boolean r9 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L63
            if (r9 == 0) goto La9
            int r9 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> L63
            r2 = -1
            int r9 = r0.getInt(r9, r2)     // Catch: java.lang.Throwable -> L63
            r0 = 0
            android.graphics.PorterDuff$Mode r9 = a.C0457x5.c(r9, r0)     // Catch: java.lang.Throwable -> L63
            r7.setCheckMarkTintMode(r9)     // Catch: java.lang.Throwable -> L63
        La9:
            r8.f()
            a.b1 r8 = r7.getEmojiTextViewHelper()
            r8.b(r4, r6)
            return
        Lb4:
            r8.f()
            throw r9
    }

    private a.C0058b1 getEmojiTextViewHelper() {
            r1 = this;
            a.b1 r0 = r1.d
            if (r0 != 0) goto Lb
            a.b1 r0 = new a.b1
            r0.<init>(r1)
            r1.d = r0
        Lb:
            a.b1 r0 = r1.d
            return r0
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            a.p1 r0 = r1.c
            if (r0 == 0) goto La
            r0.b()
        La:
            a.G0 r0 = r1.b
            if (r0 == 0) goto L11
            r0.a()
        L11:
            a.L0 r0 = r1.f146a
            if (r0 == 0) goto L18
            r0.a()
        L18:
            return
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = a.Ze.b(r0)
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            a.G0 r0 = r1.b
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            a.G0 r0 = r1.b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r1 = this;
            a.L0 r0 = r1.f146a
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.b
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r1 = this;
            a.L0 r0 = r1.f146a
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.c
            return r0
        L7:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            a.p1 r0 = r1.c
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            a.p1 r0 = r1.c
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            a.C0435w1.L(r2, r0, r1)
            return r0
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            a.b1 r0 = r1.getEmojiTextViewHelper()
            r0.c(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            a.G0 r1 = r0.b
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            a.G0 r0 = r1.b
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
            r1.setCheckMarkDrawable(r2)
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setCheckMarkDrawable(r2)
            a.L0 r2 = r1.f146a
            if (r2 == 0) goto L15
            boolean r0 = r2.f
            if (r0 == 0) goto Lf
            r0 = 0
            r2.f = r0
            return
        Lf:
            r0 = 1
            r2.f = r0
            r2.a()
        L15:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            a.p1 r1 = r0.c
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            a.p1 r1 = r0.c
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

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.G0 r0 = r1.b
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.G0 r0 = r1.b
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    public void setSupportCheckMarkTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.L0 r0 = r1.f146a
            if (r0 == 0) goto Lc
            r0.b = r2
            r2 = 1
            r0.d = r2
            r0.a()
        Lc:
            return
    }

    public void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.L0 r0 = r1.f146a
            if (r0 == 0) goto Lc
            r0.c = r2
            r2 = 1
            r0.e = r2
            r0.a()
        Lc:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.p1 r0 = r1.c
            r0.i(r2)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.p1 r0 = r1.c
            r0.j(r2)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            a.p1 r0 = r1.c
            if (r0 == 0) goto La
            r0.g(r2, r3)
        La:
            return
    }
}
