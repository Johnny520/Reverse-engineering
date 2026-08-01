package defpackage;

/* JADX INFO: renamed from: ᛸᛵᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1491 extends android.widget.MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final int[] f6582 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0682 f6583;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1181 f6584;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0866 f6585;

    static {
            r0 = 16843126(0x1010176, float:2.3694606E-38)
            int[] r0 = new int[]{r0}
            defpackage.C1491.f6582 = r0
            return
    }

    public C1491(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            defpackage.AbstractC0322.m994(r5)
            r0 = 1711538230(0x66040036, float:1.5583907E23)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.AbstractC2218.m3609(r5, r4)
            android.content.Context r5 = r4.getContext()
            int[] r1 = defpackage.C1491.f6582
            ᛷᛸᛱᛸ r5 = defpackage.C1326.m2454(r5, r6, r1, r0)
            java.lang.Object r1 = r5.f5856
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 0
            boolean r1 = r1.hasValue(r2)
            if (r1 == 0) goto L2c
            android.graphics.drawable.Drawable r1 = r5.m2470(r2)
            r4.setDropDownBackgroundDrawable(r1)
        L2c:
            r5.m2469()
            ᛵᛴᛴᛳ r5 = new ᛵᛴᛴᛳ
            r5.<init>(r4)
            r4.f6585 = r5
            r5.m1824(r6, r0)
            ᛶᲈᛳᛵ r5 = new ᛶᲈᛳᛵ
            r5.<init>(r4)
            r4.f6584 = r5
            r5.m2310(r6, r0)
            r5.m2309()
            ᛴᛵᲇᲇ r5 = new ᛴᛵᲇᲇ
            r1 = 5
            r5.<init>(r4, r1)
            r4.f6583 = r5
            r5.mo1555(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L7f
            boolean r0 = r4.isFocusable()
            boolean r1 = r4.isClickable()
            boolean r2 = r4.isLongClickable()
            int r3 = r4.getInputType()
            android.text.method.KeyListener r5 = r5.m1564(r6)
            if (r5 != r6) goto L70
            goto L7f
        L70:
            super.setKeyListener(r5)
            r4.setRawInputType(r3)
            r4.setFocusable(r0)
            r4.setClickable(r1)
            r4.setLongClickable(r2)
        L7f:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            ᛵᛴᛴᛳ r0 = r1.f6585
            if (r0 == 0) goto La
            r0.m1836()
        La:
            ᛶᲈᛳᛵ r1 = r1.f6584
            if (r1 == 0) goto L11
            r1.m2309()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f6585
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1823()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f6585
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1826()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f6584
            android.content.res.ColorStateList r0 = r0.m2306()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f6584
            android.graphics.PorterDuff$Mode r0 = r0.m2305()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r2)
            defpackage.AbstractC2193.m3590(r2, r0, r1)
            ᛴᛵᲇᲇ r1 = r1.f6583
            ᛱᲀᛱᛵ r1 = r1.m1560(r0, r2)
            return r1
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            ᛵᛴᛴᛳ r0 = r0.f6585
            if (r0 == 0) goto La
            r0.m1832()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            ᛵᛴᛴᛳ r0 = r0.f6585
            if (r0 == 0) goto La
            r0.m1838(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f6584
            if (r0 == 0) goto La
            r0.m2309()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ᛶᲈᛳᛵ r0 = r0.f6584
            if (r0 == 0) goto La
            r0.m2309()
        La:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.AbstractC1592.m2873(r0, r2)
            r1.setDropDownBackgroundDrawable(r2)
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f6583
            r0.m1553(r1)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            ᛴᛵᲇᲇ r0 = r1.f6583
            android.text.method.KeyListener r2 = r0.m1564(r2)
            super.setKeyListener(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f6585
            if (r0 == 0) goto L7
            r0.m1828(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛵᛴᛴᛳ r0 = r0.f6585
            if (r0 == 0) goto L7
            r0.m1827(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f6584
            r0.m2303(r1)
            r0.m2309()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ᛶᲈᛳᛵ r0 = r0.f6584
            r0.m2304(r1)
            r0.m2309()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            ᛶᲈᛳᛵ r0 = r0.f6584
            if (r0 == 0) goto La
            r0.m2311(r1, r2)
        La:
            return
    }
}
