package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends android.widget.CheckedTextView {
    public final defpackage.a3 a;
    public final defpackage.v2 b;
    public final defpackage.d5 c;
    public defpackage.x3 d;

    public z2(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            defpackage.x60.a(r8)
            r6 = 2130968748(0x7f0400ac, float:1.7546158E38)
            r7.<init>(r8, r9, r6)
            android.content.Context r8 = r7.getContext()
            defpackage.r60.a(r7, r8)
            d5 r8 = new d5
            r8.<init>(r7)
            r7.c = r8
            r8.f(r9, r6)
            r8.b()
            v2 r8 = new v2
            r8.<init>(r7)
            r7.b = r8
            r8.d(r9, r6)
            a3 r8 = new a3
            r8.<init>(r7)
            r7.a = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = defpackage.xy.l
            r5 r8 = defpackage.r5.y(r8, r9, r3, r6)
            java.lang.Object r0 = r8.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r7.getContext()
            java.lang.Object r1 = r8.b
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r7
            r4 = r9
            defpackage.ja0.k(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            r3 = 0
            if (r2 == 0) goto L67
            int r9 = r0.getResourceId(r9, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L67
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            android.graphics.drawable.Drawable r9 = defpackage.ff.r(r2, r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            goto L7e
        L64:
            r0 = move-exception
            r9 = r0
            goto Lab
        L67:
            boolean r9 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            int r9 = r0.getResourceId(r3, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64
            android.graphics.drawable.Drawable r9 = defpackage.ff.r(r2, r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64
        L7e:
            r9 = 2
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L8c
            android.content.res.ColorStateList r9 = r8.l(r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintList(r9)     // Catch: java.lang.Throwable -> L64
        L8c:
            r9 = 3
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto La0
            r2 = -1
            int r9 = r0.getInt(r9, r2)     // Catch: java.lang.Throwable -> L64
            r0 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.eh.b(r9, r0)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintMode(r9)     // Catch: java.lang.Throwable -> L64
        La0:
            r8.z()
            x3 r8 = r7.getEmojiTextViewHelper()
            r8.a(r4, r6)
            return
        Lab:
            r8.z()
            throw r9
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            d5 r0 = r1.c
            if (r0 == 0) goto La
            r0.b()
        La:
            v2 r0 = r1.b
            if (r0 == 0) goto L11
            r0.a()
        L11:
            a3 r0 = r1.a
            if (r0 == 0) goto L18
            r0.b()
        L18:
            return
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

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            v2 r0 = r1.b
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.b()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            v2 r0 = r1.b
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.c()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r1 = this;
            a3 r0 = r1.a
            if (r0 == 0) goto L9
            android.os.Parcelable r0 = r0.a
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r1 = this;
            a3 r0 = r1.a
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.b
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            d5 r0 = r1.c
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            d5 r0 = r1.c
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            defpackage.a80.v(r2, r0, r1)
            return r0
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            x3 r0 = r1.getEmojiTextViewHelper()
            r0.b(r2)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            v2 r1 = r0.b
            if (r1 == 0) goto La
            r1.e()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            v2 r0 = r1.b
            if (r0 == 0) goto La
            r0.f(r2)
        La:
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setCheckMarkDrawable(r2)
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setCheckMarkDrawable(r2)
            a3 r2 = r1.a
            if (r2 == 0) goto L15
            boolean r0 = r2.e
            if (r0 == 0) goto Lf
            r0 = 0
            r2.e = r0
            return
        Lf:
            r0 = 1
            r2.e = r0
            r2.b()
        L15:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            d5 r1 = r0.c
            if (r1 == 0) goto La
            r1.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            d5 r1 = r0.c
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

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            v2 r0 = r1.b
            if (r0 == 0) goto L7
            r0.h(r2)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            v2 r0 = r1.b
            if (r0 == 0) goto L7
            r0.i(r2)
        L7:
            return
    }

    public void setSupportCheckMarkTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a3 r0 = r1.a
            if (r0 == 0) goto Lc
            r0.a = r2
            r2 = 1
            r0.c = r2
            r0.b()
        Lc:
            return
    }

    public void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a3 r0 = r1.a
            if (r0 == 0) goto Lc
            r0.b = r2
            r2 = 1
            r0.d = r2
            r0.b()
        Lc:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            d5 r0 = r1.c
            r0.l(r2)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            d5 r0 = r1.c
            r0.m(r2)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            d5 r0 = r1.c
            if (r0 == 0) goto La
            r0.g(r2, r3)
        La:
            return
    }
}
