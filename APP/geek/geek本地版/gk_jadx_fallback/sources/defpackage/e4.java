package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class e4 extends android.widget.RadioButton implements defpackage.a70 {
    public final defpackage.a3 a;
    public final defpackage.v2 b;
    public final defpackage.d5 c;
    public defpackage.x3 d;

    public e4(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            defpackage.x60.a(r2)
            r0 = 2130969431(0x7f040357, float:1.7547544E38)
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.r60.a(r1, r2)
            a3 r2 = new a3
            r2.<init>(r1)
            r1.a = r2
            r2.d(r3, r0)
            v2 r2 = new v2
            r2.<init>(r1)
            r1.b = r2
            r2.d(r3, r0)
            d5 r2 = new d5
            r2.<init>(r1)
            r1.c = r2
            r2.f(r3, r0)
            x3 r2 = r1.getEmojiTextViewHelper()
            r2.a(r3, r0)
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            v2 r0 = r1.b
            if (r0 == 0) goto La
            r0.a()
        La:
            d5 r0 = r1.c
            if (r0 == 0) goto L11
            r0.b()
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r2 = this;
            int r0 = super.getCompoundPaddingLeft()
            a3 r1 = r2.a
            if (r1 == 0) goto Lb
            r1.getClass()
        Lb:
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

    @Override // defpackage.a70
    public android.content.res.ColorStateList getSupportButtonTintList() {
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

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = defpackage.ff.r(r0, r2)
            r1.setButtonDrawable(r2)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setButtonDrawable(r2)
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
            r2.a()
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

    @Override // defpackage.a70
    public void setSupportButtonTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a3 r0 = r1.a
            if (r0 == 0) goto Lc
            r0.a = r2
            r2 = 1
            r0.c = r2
            r0.a()
        Lc:
            return
    }

    @Override // defpackage.a70
    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a3 r0 = r1.a
            if (r0 == 0) goto Lc
            r0.b = r2
            r2 = 1
            r0.d = r2
            r0.a()
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
}
