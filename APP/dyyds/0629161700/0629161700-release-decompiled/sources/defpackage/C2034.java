package defpackage;

/* JADX INFO: renamed from: ᲇᛴᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2034 extends android.widget.CheckedTextView {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1181 f8765;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0866 f8766;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1020 f8767;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C2355 f8768;

    public C2034(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            defpackage.AbstractC0322.m994(r9)
            r5 = 1711538328(0x66040098, float:1.5584083E23)
            r8.<init>(r9, r10, r5)
            android.content.Context r9 = r8.getContext()
            defpackage.AbstractC2218.m3609(r9, r8)
            ᛶᲈᛳᛵ r9 = new ᛶᲈᛳᛵ
            r9.<init>(r8)
            r8.f8765 = r9
            r9.m2310(r10, r5)
            r9.m2309()
            ᛵᛴᛴᛳ r9 = new ᛵᛴᛴᛳ
            r9.<init>(r8)
            r8.f8766 = r9
            r9.m1824(r10, r5)
            ᛶᛲᛱᛸ r9 = new ᛶᛲᛱᛸ
            r9.<init>(r8)
            r8.f8767 = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = defpackage.AbstractC1070.f4781
            ᛷᛸᛱᛸ r9 = defpackage.C1326.m2454(r9, r10, r2, r5)
            java.lang.Object r0 = r9.f5856
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.lang.Object r0 = r9.f5856
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            r6 = 0
            r0 = r8
            r3 = r10
            defpackage.AbstractC0756.m1676(r0, r1, r2, r3, r4, r5, r6)
            r8 = 1
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            r1 = 0
            if (r10 == 0) goto L6b
            int r8 = r7.getResourceId(r8, r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L6b
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            android.graphics.drawable.Drawable r8 = defpackage.AbstractC1592.m2873(r10, r8)     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            goto L82
        L68:
            r0 = move-exception
            r8 = r0
            goto Laf
        L6b:
            boolean r8 = r7.hasValue(r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L82
            int r8 = r7.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L82
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L68
            android.graphics.drawable.Drawable r8 = defpackage.AbstractC1592.m2873(r10, r8)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L68
        L82:
            r8 = 2
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto L90
            android.content.res.ColorStateList r8 = r9.m2480(r8)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkTintList(r8)     // Catch: java.lang.Throwable -> L68
        L90:
            r8 = 3
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto La4
            r10 = -1
            int r8 = r7.getInt(r8, r10)     // Catch: java.lang.Throwable -> L68
            r10 = 0
            android.graphics.PorterDuff$Mode r8 = defpackage.AbstractC1660.m3053(r8, r10)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkTintMode(r8)     // Catch: java.lang.Throwable -> L68
        La4:
            r9.m2469()
            ᲈᲇᲀᛲ r8 = r0.getEmojiTextViewHelper()
            r8.m3854(r3, r5)
            return
        Laf:
            r9.m2469()
            throw r8
    }

    private defpackage.C2355 getEmojiTextViewHelper() {
            r1 = this;
            ᲈᲇᲀᛲ r0 = r1.f8768
            if (r0 != 0) goto Lb
            ᲈᲇᲀᛲ r0 = new ᲈᲇᲀᛲ
            r0.<init>(r1)
            r1.f8768 = r0
        Lb:
            return r0
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            ᛶᲈᛳᛵ r0 = r1.f8765
            if (r0 == 0) goto La
            r0.m2309()
        La:
            ᛵᛴᛴᛳ r0 = r1.f8766
            if (r0 == 0) goto L11
            r0.m1836()
        L11:
            ᛶᛲᛱᛸ r1 = r1.f8767
            if (r1 == 0) goto L18
            r1.m1972()
        L18:
            return
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f8766
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1823()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f8766
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1826()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCheckMarkTintList() {
            r0 = this;
            ᛶᛲᛱᛸ r0 = r0.f8767
            if (r0 == 0) goto L9
            android.os.Parcelable r0 = r0.f4551
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
            r0 = this;
            ᛶᛲᛱᛸ r0 = r0.f8767
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.f4552
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f8765
            android.content.res.ColorStateList r0 = r0.m2306()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f8765
            android.graphics.PorterDuff$Mode r0 = r0.m2305()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            defpackage.AbstractC2193.m3590(r2, r0, r1)
            return r0
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            ᲈᲇᲀᛲ r0 = r0.getEmojiTextViewHelper()
            r0.m3855(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            ᛵᛴᛴᛳ r0 = r0.f8766
            if (r0 == 0) goto La
            r0.m1832()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            ᛵᛴᛴᛳ r0 = r0.f8766
            if (r0 == 0) goto La
            r0.m1838(r1)
        La:
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r0, r2)
            r1.setCheckMarkDrawable(r2)
            return
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setCheckMarkDrawable(r1)
            ᛶᛲᛱᛸ r0 = r0.f8767
            if (r0 == 0) goto L15
            boolean r1 = r0.f4548
            if (r1 == 0) goto Lf
            r1 = 0
            r0.f4548 = r1
            return
        Lf:
            r1 = 1
            r0.f4548 = r1
            r0.m1972()
        L15:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f8765
            if (r0 == 0) goto La
            r0.m2309()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f8765
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

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f8766
            if (r0 == 0) goto L7
            r0.m1828(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f8766
            if (r0 == 0) goto L7
            r0.m1827(r1)
        L7:
            return
    }

    public void setSupportCheckMarkTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛶᛲᛱᛸ r0 = r0.f8767
            if (r0 == 0) goto Lc
            r0.f4551 = r1
            r1 = 1
            r0.f4550 = r1
            r0.m1972()
        Lc:
            return
    }

    public void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛶᛲᛱᛸ r0 = r0.f8767
            if (r0 == 0) goto Lc
            r0.f4552 = r1
            r1 = 1
            r0.f4549 = r1
            r0.m1972()
        Lc:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f8765
            r0.m2303(r1)
            r0.m2309()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f8765
            r0.m2304(r1)
            r0.m2309()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            ᛶᲈᛳᛵ r0 = r0.f8765
            if (r0 == 0) goto La
            r0.m2311(r1, r2)
        La:
            return
    }
}
