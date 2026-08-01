package defpackage;

/* JADX INFO: renamed from: ᛶᛲᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1025 extends android.widget.RadioButton {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1181 f4581;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0866 f4582;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1020 f4583;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C2355 f4584;

    public C1025(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            defpackage.AbstractC0322.m994(r2)
            r0 = 1711538787(0x66040263, float:1.558491E23)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.AbstractC2218.m3609(r2, r1)
            ᛶᛲᛱᛸ r2 = new ᛶᛲᛱᛸ
            r2.<init>(r1)
            r1.f4583 = r2
            r2.m1969(r3, r0)
            ᛵᛴᛴᛳ r2 = new ᛵᛴᛴᛳ
            r2.<init>(r1)
            r1.f4582 = r2
            r2.m1824(r3, r0)
            ᛶᲈᛳᛵ r2 = new ᛶᲈᛳᛵ
            r2.<init>(r1)
            r1.f4581 = r2
            r2.m2310(r3, r0)
            ᲈᲇᲀᛲ r1 = r1.getEmojiTextViewHelper()
            r1.m3854(r3, r0)
            return
    }

    private defpackage.C2355 getEmojiTextViewHelper() {
            r1 = this;
            ᲈᲇᲀᛲ r0 = r1.f4584
            if (r0 != 0) goto Lb
            ᲈᲇᲀᛲ r0 = new ᲈᲇᲀᛲ
            r0.<init>(r1)
            r1.f4584 = r0
        Lb:
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            ᛵᛴᛴᛳ r0 = r1.f4582
            if (r0 == 0) goto La
            r0.m1836()
        La:
            ᛶᲈᛳᛵ r1 = r1.f4581
            if (r1 == 0) goto L11
            r1.m2309()
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r1 = this;
            int r0 = super.getCompoundPaddingLeft()
            ᛶᛲᛱᛸ r1 = r1.f4583
            if (r1 == 0) goto Lb
            r1.getClass()
        Lb:
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f4582
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1823()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f4582
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1826()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportButtonTintList() {
            r0 = this;
            ᛶᛲᛱᛸ r0 = r0.f4583
            if (r0 == 0) goto L9
            android.os.Parcelable r0 = r0.f4551
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r0 = this;
            ᛶᛲᛱᛸ r0 = r0.f4583
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
            ᛶᲈᛳᛵ r0 = r0.f4581
            android.content.res.ColorStateList r0 = r0.m2306()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f4581
            android.graphics.PorterDuff$Mode r0 = r0.m2305()
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
            ᛵᛴᛴᛳ r0 = r0.f4582
            if (r0 == 0) goto La
            r0.m1832()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            ᛵᛴᛴᛳ r0 = r0.f4582
            if (r0 == 0) goto La
            r0.m1838(r1)
        La:
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setButtonDrawable(r1)
            ᛶᛲᛱᛸ r0 = r0.f4583
            if (r0 == 0) goto L15
            boolean r1 = r0.f4548
            if (r1 == 0) goto Lf
            r1 = 0
            r0.f4548 = r1
            return
        Lf:
            r1 = 1
            r0.f4548 = r1
            r0.m1971()
        L15:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f4581
            if (r0 == 0) goto La
            r0.m2309()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f4581
            if (r0 == 0) goto La
            r0.m2309()
        La:
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

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f4582
            if (r0 == 0) goto L7
            r0.m1828(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f4582
            if (r0 == 0) goto L7
            r0.m1827(r1)
        L7:
            return
    }

    public void setSupportButtonTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛶᛲᛱᛸ r0 = r0.f4583
            if (r0 == 0) goto Lc
            r0.f4551 = r1
            r1 = 1
            r0.f4550 = r1
            r0.m1971()
        Lc:
            return
    }

    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛶᛲᛱᛸ r0 = r0.f4583
            if (r0 == 0) goto Lc
            r0.f4552 = r1
            r1 = 1
            r0.f4549 = r1
            r0.m1971()
        Lc:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f4581
            r0.m2303(r1)
            r0.m2309()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f4581
            r0.m2304(r1)
            r0.m2309()
            return
    }
}
