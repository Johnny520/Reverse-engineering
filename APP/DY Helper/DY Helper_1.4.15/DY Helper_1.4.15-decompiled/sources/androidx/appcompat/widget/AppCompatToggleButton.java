package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends android.widget.ToggleButton {

    /* JADX INFO: renamed from: ε */
    public final p000.C0610o4 f592;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0201d6 f593;

    /* JADX INFO: renamed from: η */
    public p000.C0500l5 f594;

    public AppCompatToggleButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatToggleButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842827(0x101004b, float:2.3693768E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatToggleButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.content.Context r1 = r0.getContext()
            p000.b42.m739(r0, r1)
            o4 r1 = new o4
            r1.<init>(r0)
            r0.f592 = r1
            r1.m4197(r2, r3)
            d6 r1 = new d6
            r1.<init>(r0)
            r0.f593 = r1
            r1.m1661(r2, r3)
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3497(r2, r3)
            return
    }

    private p000.C0500l5 getEmojiTextViewHelper() {
            r1 = this;
            l5 r0 = r1.f594
            if (r0 != 0) goto Lb
            l5 r0 = new l5
            r0.<init>(r1)
            r1.f594 = r0
        Lb:
            l5 r1 = r1.f594
            return r1
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            o4 r0 = r1.f592
            if (r0 == 0) goto La
            r0.m4194()
        La:
            d6 r1 = r1.f593
            if (r1 == 0) goto L11
            r1.m1658()
        L11:
            return
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            o4 r0 = r0.f592
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m4195()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            o4 r0 = r0.f592
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m4196()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            d6 r0 = r0.f593
            android.content.res.ColorStateList r0 = r0.m1659()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            d6 r0 = r0.f593
            android.graphics.PorterDuff$Mode r0 = r0.m1660()
            return r0
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3498(r1)
            return
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            o4 r0 = r0.f592
            if (r0 == 0) goto La
            r0.m4198()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            o4 r0 = r0.f592
            if (r0 == 0) goto La
            r0.m4199(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            d6 r0 = r0.f593
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            d6 r0 = r0.f593
            if (r0 == 0) goto La
            r0.m1658()
        La:
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3499(r1)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            l5 r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.m3496(r2)
            super.setFilters(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            o4 r0 = r0.f592
            if (r0 == 0) goto L7
            r0.m4201(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            o4 r0 = r0.f592
            if (r0 == 0) goto L7
            r0.m4202(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            d6 r0 = r0.f593
            r0.m1663(r1)
            r0.m1658()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            d6 r0 = r0.f593
            r0.m1664(r1)
            r0.m1658()
            return
    }
}
