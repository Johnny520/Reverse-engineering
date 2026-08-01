package defpackage;

/* JADX INFO: renamed from: ᛳᛲᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0415 extends android.widget.ToggleButton {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C2355 f2090;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1181 f2091;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0866 f2092;

    public C0415(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842827(0x101004b, float:2.3693768E-38)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.AbstractC2218.m3609(r2, r1)
            ᛵᛴᛴᛳ r2 = new ᛵᛴᛴᛳ
            r2.<init>(r1)
            r1.f2092 = r2
            r2.m1824(r3, r0)
            ᛶᲈᛳᛵ r2 = new ᛶᲈᛳᛵ
            r2.<init>(r1)
            r1.f2091 = r2
            r2.m2310(r3, r0)
            ᲈᲇᲀᛲ r1 = r1.getEmojiTextViewHelper()
            r1.m3854(r3, r0)
            return
    }

    private defpackage.C2355 getEmojiTextViewHelper() {
            r1 = this;
            ᲈᲇᲀᛲ r0 = r1.f2090
            if (r0 != 0) goto Lb
            ᲈᲇᲀᛲ r0 = new ᲈᲇᲀᛲ
            r0.<init>(r1)
            r1.f2090 = r0
        Lb:
            return r0
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            ᛵᛴᛴᛳ r0 = r1.f2092
            if (r0 == 0) goto La
            r0.m1836()
        La:
            ᛶᲈᛳᛵ r1 = r1.f2091
            if (r1 == 0) goto L11
            r1.m2309()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f2092
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1823()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f2092
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1826()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f2091
            android.content.res.ColorStateList r0 = r0.m2306()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f2091
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

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            ᛵᛴᛴᛳ r0 = r0.f2092
            if (r0 == 0) goto La
            r0.m1832()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            ᛵᛴᛴᛳ r0 = r0.f2092
            if (r0 == 0) goto La
            r0.m1838(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f2091
            if (r0 == 0) goto La
            r0.m2309()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f2091
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
            ᛵᛴᛴᛳ r0 = r0.f2092
            if (r0 == 0) goto L7
            r0.m1828(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f2092
            if (r0 == 0) goto L7
            r0.m1827(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f2091
            r0.m2303(r1)
            r0.m2309()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f2091
            r0.m2304(r1)
            r0.m2309()
            return
    }
}
